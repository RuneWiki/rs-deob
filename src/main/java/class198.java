import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class198 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3139 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3138;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1440(byte arg0) {
        field3140++;
        if (class218.field3427 > 0) {
            class205.method1471((byte) -49);
            return;
        }
        class182.field2727 = class297.field4661;
        class297.field4661 = null;
        if (arg0 == 22) {
            class113.method889(arg0 + 78, 40);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[BLhb;)V", line = 44)
    public final void method1441(byte arg0, byte[] arg1, class35 arg2) {
        field3141++;
        if (arg2.field437[arg2.field455] != 31 || arg2.field437[arg2.field455 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3138 == null) {
            this.field3138 = new Inflater(true);
        }
        if (arg0 != -63) {
            method1443(20, 46, -37);
        }
        try {
            this.field3138.setInput(arg2.field437, arg2.field455 + 10, arg2.field437.length + -8 + -10 + -arg2.field455);
            this.field3138.inflate(arg1);
        } catch (Exception var5) {
            this.field3138.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3138.reset();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 70)
    public static final void method1442() {
        if (class180.field2695 != null) {
            for (int var0 = 0; var0 < class180.field2695.length; var0++) {
                for (int var1 = 0; var1 < class39.field589; var1++) {
                    for (int var2 = 0; var2 < class210.field3312; var2++) {
                        class180.field2695[var0][var1][var2] = null;
                    }
                }
            }
        }
        class287.field4423 = (class123[][]) null;
        if (class314.field4874 != null) {
            for (int var3 = 0; var3 < class314.field4874.length; var3++) {
                for (int var4 = 0; var4 < class39.field589; var4++) {
                    for (int var5 = 0; var5 < class210.field3312; var5++) {
                        class314.field4874[var3][var4][var5] = null;
                    }
                }
            }
        }
        class304.field4757 = (class123[][]) null;
        class262.field3901 = 0;
        if (class213.field3389 != null) {
            for (int var6 = 0; var6 < class262.field3901; var6++) {
                class213.field3389[var6] = null;
            }
        }
        if (class249.field3739 != null) {
            for (int var7 = 0; var7 < class39.field593; var7++) {
                class249.field3739[var7] = null;
            }
            class39.field593 = 0;
        }
        if (class271.field4095 != null) {
            for (int var8 = 0; var8 < class271.field4095.length; var8++) {
                class271.field4095[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Ljava/lang/String;", line = 175)
    public static final String method1443(int arg0, int arg1, int arg2) {
        field3137++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else {
            int var4 = 55 % ((-arg0 - 27) / 53);
            if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 <= 3) {
                return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
            } else {
                return "<col=80ff00>";
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 216)
    public class198() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(III)V", line = 223)
    private class198(int arg0, int arg1, int arg2) {
    }
}
