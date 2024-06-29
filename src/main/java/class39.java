import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class39 {

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public int field535 = 128;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field539 = 128;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field533 = -50;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field532;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 7)
    public static void method324(byte arg0) {
        field532 = null;
        if (arg0 < 41) {
            method325(null, -19, null);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([[BILn;)V", line = 19)
    public static final void method325(byte[][] arg0, int arg1, class678 arg2) {
        field538++;
        int[] var3 = new int[] { -1, arg1, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field1683; var4++) {
            class655.method3701((byte) 38);
            for (int var5 = 0; var5 < class430.field6136 >> 3; var5++) {
                for (int var6 = 0; var6 < (class580.field8504 >> 3); var6++) {
                    int var7 = class184.field2920[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field1679 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFC371) >> 14;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class221.field3306.length; var13++) {
                                if (class221.field3306[var13] == var12 && arg0[var13] != null) {
                                    class465 var14 = new class465(arg0[var13]);
                                    arg2.method868((byte) 90, var14, var6 * 8, var10, var8, var5 * 8, var11, var4, var9, class45.field609);
                                    arg2.method3838(var6 * 8, var4, var5 * 8, var11, var14, class637.field9048, (byte) -109, var3[0] == -1 ? var3 : null, var9, var8, var10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class347.field4911 = class104.field1715.method3255(var3[2], var3[0], var3[3], -15540, class111.field1777, var3[1]);
            class423.field6051 = var3[4];
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lgv;I)V", line = 97)
    public final void method326(class39 arg0, int arg1) {
        this.field531 = arg0.field531;
        this.field529 = arg0.field529;
        field528++;
        if (arg1 == 1) {
            this.field537 = arg0.field537;
            this.field535 = arg0.field535;
            this.field530 = arg0.field530;
            this.field539 = arg0.field539;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V", line = 118)
    public static final void method327(int arg0, int arg1) {
        if (class568.field8311 == 0) {
            class43.field585.method1802(arg1, (byte) -94);
        } else {
            class309.field4295 = arg1;
        }
        field534++;
        int var2 = -45 / ((arg0 + 54) / 55);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(I)V", line = 153)
    public class39(int arg0) {
        this.field530 = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIII)V", line = 163)
    private class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field531 = arg4;
        this.field539 = arg2;
        this.field537 = arg3;
        this.field535 = arg1;
        this.field530 = arg0;
        this.field529 = arg5;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Lgv;", line = 139)
    public final class39 method328(byte arg0) {
        if (arg0 < 97) {
            this.method326(null, -99);
        }
        field536++;
        return new class39(this.field530, this.field535, this.field539, this.field537, this.field531, this.field529);
    }
}
