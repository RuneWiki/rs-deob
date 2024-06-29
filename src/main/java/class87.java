import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class87 {

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "S")
    public short field1213;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "B")
    public byte field1217;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
    public boolean field1212;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "S")
    public short field1214;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "S")
    public short field1216;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    public static int[] field1209 = new int[8];

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
    public static boolean field1218 = false;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        if (arg0 != 65280) {
            field1209 = null;
        }
        field1209 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII[II)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field1210++;
        if (arg7 > 0 && !class735.method3997(arg7, (byte) -84)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class735.method3997(arg1, (byte) -107)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg7 >= arg1 ? arg1 : arg7;
            int var10 = arg7 >> 1;
            int var11 = arg1 >> 1;
            int[] var12 = arg6;
            if (arg2 <= 46) {
                method538(-16, -48, 116, -55, 9, 24, null, 19);
            }
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var8, arg0, arg7, arg1, 0, arg4, arg5, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg7 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = var20 & 0xFF;
                        int var25 = var20 >> 16 & 0xFF;
                        int var26 = (var20 & 0xFF9E) >> 8;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var21 >> 24 & 0xFF) + var27;
                        int var29 = (var21 & 0xFF) + var24;
                        int var30 = ((var21 & 0xFF1D87) >> 16) + var25;
                        int var31 = (var21 >> 8 & 0xFF) + var26;
                        int var32 = (var22 & 0xFF) + var29;
                        int var33 = (var22 >> 16 & 0xFF) + var30;
                        int var34 = (var22 >> 24 & 0xFF) + var28;
                        int var35 = (var22 >> 8 & 0xFF) + var31;
                        int var36 = (var23 & 0xFF) + var32;
                        int var37 = ((var23 & 0xFF718D) >> 16) + var33;
                        int var38 = (var23 >> 24 & 0xFF) + var34;
                        int var39 = ((var23 & 0xFFB8) >> 8) + var35;
                        var13[var14++] = class77.method473(class249.method1625(var36, 1020) >> 2, class77.method473(class249.method1625(65280, var39 << 6), class77.method473(class249.method1625(-16777216, var38 << 22), class249.method1625(1020, var37) << 14)));
                    }
                    var16 += arg7;
                    var15 += arg7;
                }
                var13 = var12;
                arg1 = var11;
                var12 = var17;
                arg7 = var10;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1211 = arg1;
        this.field1205 = arg2;
        this.field1215 = arg11;
        this.field1213 = (short) arg6;
        this.field1217 = (byte) arg8;
        this.field1208 = arg3;
        this.field1207 = arg0;
        this.field1212 = arg10;
        this.field1214 = (short) arg5;
        this.field1216 = (short) arg4;
    }
}
