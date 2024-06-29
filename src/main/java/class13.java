import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class170 {

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lgw;")
    public static class118 field142 = new class118();

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Lqt;")
    public static class459 field143 = new class459(53, -1);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public final void method69(int arg0, int arg1, int arg2) {
        ++field138;
        if (arg1 != 1) {
            this.method69(26, 18, 26);
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIII)V")
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field139 = arg0;
        this.field134 = arg3;
        this.field141 = arg2;
        this.field133 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
    public final void method70(int arg0, int arg1, byte arg2) {
        ++field140;
        int var4 = this.field139 * arg1 >> 12;
        int var5 = this.field141 * arg1 >> 12;
        int var6 = this.field133 * arg0 >> 12;
        if (arg2 != -99) {
            this.field134 = 107;
        }
        int var7 = this.field134 * arg0 >> 12;
        class287.method1839(var6, super.field2538, var7, 18938, var4, var5);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method71(byte arg0) {
        if (arg0 != 73) {
            field136 = 81;
        }
        field143 = null;
        field142 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIB)V")
    public final void method72(int arg0, int arg1, byte arg2) {
        ++field135;
        if (arg2 != 60) {
            this.method69(-60, -81, 7);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILtf;Li;Lqa;III)V")
    public static final void method73(int arg0, int arg1, int arg2, class198 arg3, class31 arg4, class167 arg5, int arg6, int arg7, int arg8) {
        if (arg7 >= -49) {
            field136 = 116;
        }
        ++field137;
        class463 var9 = class506.field7320.method1429(arg2, -3708);
        if (var9 != null && var9.field6705 && var9.method2743(class84.field1335, (byte) -124)) {
            if (var9.field6697 != null) {
                int[] var10 = new int[var9.field6697.length];
                for (int var11 = 0; ~(var10.length / 2) < ~var11; ++var11) {
                    int var13;
                    if (~class294.field4381 != -5) {
                        var13 = (int) class508.field7354 + class78.field1280 & 16383;
                    } else {
                        var13 = 16383 & (int) class508.field7354;
                    }
                    int var14 = class358.field5204[var13];
                    int var15 = class358.field5203[var13];
                    if (class294.field4381 != 4) {
                        var14 = var14 * 256 / (class384.field5495 + 256);
                        var15 = var15 * 256 / (class384.field5495 + 256);
                    }
                    var10[var11 * 2] = ((arg1 - -(var9.field6697[var11 * 2 + 1] * 4)) * var14 - -((arg6 - -(var9.field6697[var11 * 2] * 4)) * var15) >> 15) + arg8 - -(arg3.field3008 / 2);
                    var10[var11 * 2 + 1] = arg0 - -(arg3.field2988 / 2) - ((var9.field6697[var11 * 2 - -1] * 4 + arg1) * var15 + -((var9.field6697[var11 * 2] * 4 + arg6) * var14) >> 15);
                }
                class151.method1069(arg5, var10, var9.field6722, arg3.field3044, arg3.field3002);
                for (int var12 = 0; var12 < var10.length / 2 + -1; ++var12) {
                    arg5.method228(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 - -1) * 2], var10[var12 * 2 + 2 + 1], var9.field6689, 1, arg4, arg8, arg0);
                }
                arg5.method228(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field6689, 1, arg4, arg8, arg0);
            }
            class343 var16 = null;
            if (~var9.field6711 != 0) {
                var16 = var9.method2747(arg5, (byte) -51, false);
                if (var16 != null) {
                    class75.method584(arg4, arg6, (byte) -113, arg8, arg1, arg0, arg3, var16);
                }
            }
            if (var9.field6700 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method367();
                }
                class269 var18 = class521.field7593;
                class119 var19 = class199.field3053;
                if (var9.field6731 == 1) {
                    var19 = class218.field3334;
                    var18 = class406.field5775;
                }
                if (~var9.field6731 == -3) {
                    var19 = class425.field6028;
                    var18 = class270.field4072;
                }
                class52.method456(var17, -92, arg4, arg3, var9.field6721, var9.field6700, var18, arg6, arg0, arg8, var19, arg1);
                return;
            }
        }
    }
}
