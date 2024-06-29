import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public abstract class class313 {

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lcu;")
    public static class185 field3995 = new class185(8, 4);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(CB)B", line = 3)
    public static final byte method1736(char arg0, byte arg1) {
        if (arg1 != -110) {
            return 90;
        }
        field3999++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 128)
    public static void method1737(int arg0) {
        field3995 = null;
        if (arg0 != 255) {
            field3995 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[IIIIII)V", line = 149)
    public static final void method1738(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3997++;
        if (arg4 > 0 && !class415.method2366(-122, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg5 <= 0 || class415.method2366(-123, arg5)) {
            if (arg3 < 93) {
                field3998 = -24;
            }
            if (arg6 != 32993) {
                throw new IllegalArgumentException("");
            }
            int var8 = 0;
            int var9 = arg4 >= arg5 ? arg5 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg5 >> 1;
            int[] var12 = arg2;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg1, arg4, arg5, 0, arg6, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 & 0xFF;
                        int var25 = var20 >> 16 & 0xFF;
                        int var26 = var20 >> 8 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var21 & 0xFF) + var24;
                        int var29 = (var21 >> 24 & 0xFF) + var27;
                        int var30 = (var21 >> 16 & 0xFF) + var25;
                        int var31 = (var21 >> 8 & 0xFF) + var26;
                        int var32 = ((var22 & 0xFF4BE1) >> 16) + var30;
                        int var33 = (var22 >> 24 & 0xFF) + var29;
                        int var34 = (var22 & 0xFF) + var28;
                        int var35 = (var22 >> 8 & 0xFF) + var31;
                        int var36 = (var23 >> 8 & 0xFF) + var35;
                        int var37 = (var23 & 0xFF) + var34;
                        int var38 = (var23 >> 16 & 0xFF) + var32;
                        int var39 = (var23 >> 24 & 0xFF) + var33;
                        var13[var14++] = class42.method223(class42.method223(class42.method223(class288.method1624(1020, var38) << 14, class288.method1624(-16777216, var39 << 22)), class288.method1624(var36 << 6, 65280)), class288.method1624(255, var37 >> 2));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                arg5 = var11;
                var12 = var18;
                arg4 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
