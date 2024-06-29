import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class603 {

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lrk;")
    public static class419 field8887 = new class419();

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[Lvq;")
    public static class433[] field8889 = new class433[14];

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field8888;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)I")
    public static final int method3506(int arg0, byte arg1, int arg2) {
        field8886++;
        int var3 = 0;
        if (arg1 <= 60) {
            field8889 = null;
        }
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static final void method3507(int arg0) {
        field8884++;
        class537 var1 = (class537) class178.field2698.method2496((byte) 9);
        if (arg0 != -2) {
            method3507(-48);
        }
        while (var1 != null) {
            if (var1.field7938 > 0) {
                var1.field7938--;
            }
            if (var1.field7938 != 0) {
                if (var1.field7947 > 0) {
                    var1.field7947--;
                }
                if (var1.field7947 == 0 && var1.field7940 >= 1 && var1.field7948 >= 1 && (class35.field399 - 2) >= var1.field7940 && class382.field5586 - 2 >= var1.field7948 && (var1.field7939 < 0 || class236.method1527(var1.field7946, var1.field7939, (byte) 84))) {
                    class161.method939(-1, var1.field7946, var1.field7948, var1.field7936, false, var1.field7940, var1.field7939, var1.field7945, var1.field7941);
                    var1.field7947 = -1;
                    if (var1.field7939 == var1.field7937 && var1.field7937 == -1) {
                        var1.method2997(1);
                    } else if (var1.field7939 == var1.field7937 && var1.field7949 == var1.field7936 && var1.field7946 == var1.field7944) {
                        var1.method2997(arg0 + 3);
                    }
                }
            } else if (var1.field7937 < 0 || class236.method1527(var1.field7944, var1.field7937, (byte) 84)) {
                class161.method939(-1, var1.field7944, var1.field7948, var1.field7949, false, var1.field7940, var1.field7937, var1.field7945, var1.field7941);
                var1.method2997(1);
            }
            var1 = (class537) class178.field2698.method2494(77);
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
    public static void method3508(int arg0) {
        field8889 = null;
        if (arg0 != -1) {
            method3507(-72);
        }
        field8887 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
    public class603() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLps;[B)V")
    public final void method3509(byte arg0, class428 arg1, byte[] arg2) {
        field8885++;
        if (arg1.field6162[arg1.field6221] != 31 || arg1.field6162[arg1.field6221 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field8888 == null) {
            this.field8888 = new Inflater(true);
        }
        try {
            this.field8888.setInput(arg1.field6162, arg1.field6221 + 10, arg1.field6162.length + -8 + -arg1.field6221 + -10);
            this.field8888.inflate(arg2);
            int var4 = -22 % ((-arg0 - 26) / 56);
        } catch (Exception var5) {
            this.field8888.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field8888.reset();
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(III)V")
    private class603(int arg0, int arg1, int arg2) {
    }
}
