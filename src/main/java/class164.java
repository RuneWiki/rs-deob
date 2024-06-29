import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class164 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ls;")
    public static class261 field2818 = new class261(64);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lmh;")
    public static class128 field2823 = class22.method156(124, "leuchten3:");

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2824 = 1;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lmh;")
    public static class128 field2826 = class229.method1577((byte) 127, 160);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lek;")
    public static class174 field2827;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2821;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lbg;I)V", line = 5)
    public static final void method1079(class194 arg0, int arg1) {
        if (arg1 != 8) {
            return;
        }
        field2820++;
        while (true) {
            while (arg0.field3380 < arg0.field3417.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1325(7627) == 1) {
                    var3 = arg0.method1325(7627);
                    var2 = true;
                    var4 = arg0.method1325(7627);
                }
                int var5 = arg0.method1325(7627);
                int var6 = arg0.method1325(arg1 ^ 0x1DC3);
                int var7 = var5 * 64 - class212.field3754;
                int var8 = class39.field836 + class155.field2671 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class5.field110 > (var7 + 63) && var8 < class155.field2671) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1326((byte) 100);
                                if (var13 != 0) {
                                    if (class273.field4739[var10][var9] == null) {
                                        class273.field4739[var10][var9] = new byte[4096];
                                    }
                                    class273.field4739[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1326((byte) 117);
                                    if (class20.field536[var10][var9] == null) {
                                        class20.field536[var10][var9] = new byte[4096];
                                    }
                                    class20.field536[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1326((byte) 103);
                        if (var16 != 0) {
                            arg0.field3380++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BILbg;)V", line = 107)
    public final void method1080(byte[] arg0, int arg1, class194 arg2) {
        field2819++;
        if (arg2.field3417[arg2.field3380] != 31 || arg2.field3417[arg2.field3380 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2821 == null) {
            this.field2821 = new Inflater(true);
        }
        try {
            this.field2821.setInput(arg2.field3417, arg2.field3380 + 10, -18 - (arg2.field3380 - arg2.field3417.length));
            this.field2821.inflate(arg0);
            if (arg1 != 8) {
                this.field2821 = (Inflater) null;
            }
        } catch (Exception var5) {
            this.field2821.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2821.reset();
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 151)
    public class164() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 158)
    public static void method1081(int arg0) {
        if (arg0 == 63) {
            field2818 = null;
            field2826 = null;
            field2823 = null;
            field2827 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V", line = 180)
    private class164(int arg0, int arg1, int arg2) {
    }
}
