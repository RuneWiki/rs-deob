import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class68 {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public int field758 = -1;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Ldu;")
    public static class424 field750;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lraa;")
    public class508 field746;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
    public int[] field745;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[J")
    public long[] field749;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field747;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 5)
    public static void method519(byte arg0) {
        if (arg0 != 91) {
            field750 = null;
        }
        field750 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;CBLjava/lang/String;)Ljava/lang/String;", line = 17)
    public static final String method520(String arg0, char arg1, byte arg2, String arg3) {
        field755++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        if (arg2 != -11) {
            method522(103, 26, 108, 28, (byte) 61, -101);
        }
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg0.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg0.indexOf(arg1, var10);
            if (var11 < 0) {
                var9.append(arg0.substring(var10));
                return var9.toString();
            }
            var9.append(arg0.substring(var10, var11));
            var9.append(arg3);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[Lho;)V", line = 77)
    public static final void method521(int arg0, class318[] arg1) {
        field757++;
        class692.field9667 = arg1.length;
        class492.field6782 = new class318[class692.field9667 + 10];
        class313.field4505 = new int[class692.field9667 + 10];
        class335.method2123(arg1, 0, class492.field6782, 0, class692.field9667);
        if (arg0 < 9) {
            method521(32, null);
        }
        for (int var2 = 0; var2 < class692.field9667; var2++) {
            class313.field4505[var2] = class492.field6782[var2].method736();
        }
        for (int var3 = class692.field9667; var3 < class492.field6782.length; var3++) {
            class313.field4505[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIBI)V", line = 105)
    public static final void method522(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field756++;
        if (arg4 < 96) {
            method524((byte) 44);
        }
        if (class688.field9602.field8548.method1981((byte) -98) != 0 && arg1 != 0 && class70.field770 < 50 && arg0 != -1) {
            class7.field40[class70.field770++] = new class22((byte) 1, arg0, arg1, arg3, arg5, 0, arg2, null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z", line = 129)
    public static final boolean method523(int arg0) {
        if (arg0 != -457) {
            field753 = -31;
        }
        field752++;
        return class161.method1027(arg0 + 549, "jaclib") ? class161.method1027(27, "hw3d") : false;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 146)
    public static final void method524(byte arg0) {
        field759++;
        class285.method1884(true, 11);
        class39.method309((byte) 111);
        if (arg0 != -24) {
            method523(37);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[IIIIII)V", line = 159)
    public static final void method525(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field751++;
        if (arg1 > 0 && !class65.method506(arg1, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > arg6 && !class65.method506(arg4, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 32993) {
            int var8 = 0;
            int var9 = arg4 <= arg1 ? arg4 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg3, arg1, arg4, 0, arg0, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg1;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 >> 24 & 0xFF;
                        int var24 = (var20 & 0xFF1109) >> 16;
                        int var25 = var20 & 0xFF;
                        int var26 = (var20 & 0xFF2A) >> 8;
                        int var27 = var12[var16++];
                        int var28 = (var21 >> 16 & 0xFF) + var24;
                        int var29 = ((var21 & 0xFFEE) >> 8) + var26;
                        int var30 = (var21 >> 24 & 0xFF) + var23;
                        int var31 = (var21 & 0xFF) + var25;
                        int var32 = (var22 >> 24 & 0xFF) + var30;
                        int var33 = (var22 & 0xFF) + var31;
                        int var34 = ((var22 & 0xFF88) >> 8) + var29;
                        int var35 = ((var22 & 0xFF9092) >> 16) + var28;
                        int var36 = (var27 >> 24 & 0xFF) + var32;
                        int var37 = ((var27 & 0xFF0AA1) >> 16) + var35;
                        int var38 = (var27 & 0xFF) + var33;
                        int var39 = (var27 >> 8 & 0xFF) + var34;
                        var13[var14++] = class613.method3544(class613.method3544(class407.method2490(1020, var39) << 6, class613.method3544(class407.method2490(var36, 1020) << 22, class407.method2490(var37, 1020) << 14)), class407.method2490(var38, 1020) >> 2);
                    }
                    var16 += arg1;
                    var15 += arg1;
                }
                var13 = var12;
                arg1 = var10;
                arg4 = var11;
                var12 = var17;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
