import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class475 extends class384 {

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private int field6874;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    private int field6882;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field6878;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    private int field6886;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    private int field6879;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    private int field6873;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lug;")
    private class395 field6880;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Lnn;")
    private class288 field6883;

    static {
        new class335(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII[II)V", line = 5)
    public static final void method2864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field6881++;
        if (arg1 > 0 && !class351.method2014(10, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class351.method2014(10, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 32993) {
            int var8 = 0;
            int var9 = arg1 >= arg4 ? arg4 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg6;
            if (arg7 != -6495) {
                method2864(23, 96, -20, 59, 18, -3, null, 115);
            }
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg5, var8, arg3, arg1, arg4, 0, arg0, arg2, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg1 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 16 & 0xFF;
                        int var24 = var20 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = var20 >> 24 & 0xFF;
                        int var27 = var20 >> 8 & 0xFF;
                        int var28 = (var22 >> 24 & 0xFF) + var26;
                        int var29 = (var22 >> 8 & 0xFF) + var27;
                        int var30 = (var22 >> 16 & 0xFF) + var23;
                        int var31 = (var22 & 0xFF) + var24;
                        int var32 = ((var21 & 0xFF38) >> 8) + var29;
                        int var33 = (var21 & 0xFF) + var31;
                        int var34 = (var21 >> 24 & 0xFF) + var28;
                        int var35 = ((var21 & 0xFF3302) >> 16) + var30;
                        int var36 = (var25 & 0xFF) + var33;
                        int var37 = (var25 >> 8 & 0xFF) + var32;
                        int var38 = (var25 >> 16 & 0xFF) + var35;
                        int var39 = (var25 >> 24 & 0xFF) + var34;
                        var13[var14++] = class215.method1323(class378.method2145(1020, var36) >> 2, class215.method1323(class378.method2145(var37, 1020) << 6, class215.method1323(class378.method2145(1020, var38) << 14, class378.method2145(var39, 1020) << 22)));
                    }
                    var15 += arg1;
                    var16 += arg1;
                }
                int[] var18 = var13;
                var13 = var12;
                arg4 = var11;
                var12 = var18;
                arg1 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V", line = 112)
    public static final void method2865(int arg0, boolean arg1) {
        field6876++;
        if (!arg1) {
            method2866((byte) 93);
        }
        class153 var2 = class75.method656(11, 255, arg0);
        var2.method997((byte) 93);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V", line = 127)
    public static final void method2866(byte arg0) {
        class274.field3441 = -1;
        class230.field2942 = 0;
        class247.field3176 = -1;
        int var1 = -107 % (-arg0 / 44);
        field6877++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILe;Le;)V", line = 144)
    public static final void method2867(int arg0, int arg1, int arg2, class372 arg3, class372 arg4) {
        class490 var5 = class119.method862(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7138 = arg3;
            var5.field7137 = arg4;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lnn;", line = 156)
    public final class288 method1737(byte arg0) {
        field6875++;
        if (this.field6883 == null) {
            class512.field7428[0] = this.field6886;
            class512.field7428[4] = this.field6874;
            class512.field7428[2] = this.field6873;
            class512.field7428[1] = this.field6882;
            class512.field7428[3] = this.field6879;
            class512.field7428[5] = this.field6878;
            class278 var2 = this.field6880.field502;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1638(108, class512.field7428[var5])) {
                    return null;
                }
                class139 var7 = var2.method1642(class512.field7428[var5], 126);
                int var8 = var7.field1773 ? 64 : 128;
                if (var7.field1787 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class91.field1118[var6] = var2.method1641(false, 13724, var4, 1.0F, var4, class512.field7428[var6]);
            }
            this.field6883 = new class288(this.field6880, 6407, var4, var3, class91.field1118);
        }
        if (arg0 < 84) {
            method2867(114, 89, 2, null, null);
        }
        return this.field6883;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lug;IIIIII)V", line = 225)
    public class475(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6874 = arg5;
        this.field6882 = arg2;
        this.field6878 = arg6;
        this.field6886 = arg1;
        this.field6879 = arg4;
        this.field6873 = arg3;
        this.field6880 = arg0;
    }
}
