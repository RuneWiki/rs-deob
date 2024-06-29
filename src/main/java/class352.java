import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class352 {

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field5452;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "Lcm;")
    public static class449 field5455 = new class449(39, -1);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lpg;")
    public static class492 field5456 = new class492(44, 4);

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lcm;")
    public static class449 field5457 = new class449(25, 8);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 4)
    public static void method2225(int arg0) {
        field5456 = null;
        if (arg0 != -23331) {
            method2226(false, 126, -3, -83, 47, null, 90, 73);
        }
        field5457 = null;
        field5455 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIIII[III)V", line = 18)
    public static final void method2226(boolean arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field5454++;
        if (!arg0) {
            field5455 = null;
        }
        if (arg4 > 0 && !class124.method799(true, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class124.method799(arg0, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg7 == 32993) {
            int var8 = 0;
            int var9 = arg4 < arg6 ? arg4 : arg6;
            int var10 = arg4 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var8, arg1, arg4, arg6, 0, arg7, arg3, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg4;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 >> 16 & 0xFF;
                        int var25 = var20 >> 24 & 0xFF;
                        int var26 = (var20 & 0xFFD1) >> 8;
                        int var27 = var20 & 0xFF;
                        int var28 = (var21 >> 24 & 0xFF) + var25;
                        int var29 = (var21 >> 8 & 0xFF) + var26;
                        int var30 = (var21 & 0xFF) + var27;
                        int var31 = ((var21 & 0xFF2B2A) >> 16) + var24;
                        int var32 = ((var22 & 0xFF07) >> 8) + var29;
                        int var33 = (var22 >> 24 & 0xFF) + var28;
                        int var34 = (var22 & 0xFF) + var30;
                        int var35 = (var22 >> 16 & 0xFF) + var31;
                        int var36 = (var23 >> 16 & 0xFF) + var35;
                        int var37 = (var23 >> 24 & 0xFF) + var33;
                        int var38 = ((var23 & 0xFF51) >> 8) + var32;
                        int var39 = (var23 & 0xFF) + var34;
                        var13[var14++] = class286.method1860(class286.method1860(class494.method2942(var38, 1020) << 6, class286.method1860(class494.method2942(16711680, var36 << 14), class494.method2942(1020, var37) << 22)), class494.method2942(var39, 1020) >> 2);
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                arg6 = var11;
                var12 = var18;
                arg4 = var10;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(III)V", line = 127)
    public class352(int arg0, int arg1, int arg2) {
        this.field5451 = arg2;
        this.field5453 = arg1;
        this.field5452 = arg0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIILeu;)V", line = 142)
    public static final void method2227(int arg0, int arg1, int arg2, int arg3, class130 arg4) {
        field5449++;
        if (arg2 != -427947833) {
            field5457 = null;
        }
        for (class119 var5 = (class119) class73.field987.method1970(64); var5 != null; var5 = (class119) class73.field987.method1960(24)) {
            if (var5.field1673 == arg1 && arg0 << 7 == var5.field1669 && arg3 << 7 == var5.field1680 && var5.field1678.field1826 == arg4.field1826) {
                if (var5.field1681 != null) {
                    class325.field4996.method1274(var5.field1681);
                    var5.field1681 = null;
                }
                if (var5.field1665 != null) {
                    class325.field4996.method1274(var5.field1665);
                    var5.field1665 = null;
                }
                var5.method2785((byte) -120);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(III)V", line = 190)
    public static final void method2228(int arg0, int arg1, int arg2) {
        field5450++;
        class377 var3 = class99.method672(arg2, false, arg1);
        var3.method2340((byte) 127);
        var3.field5763 = arg0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V")
    public abstract void method137(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)V")
    public abstract void method132(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)V")
    public abstract void method136(int arg0, int arg1, int arg2);
}
