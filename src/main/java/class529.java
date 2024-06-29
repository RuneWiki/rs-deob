import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class529 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Ljava/lang/String;")
    public String field7804;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public int field7806;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7808 = null;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "[Z")
    public static boolean[] field7803;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[IIBII)V", line = 7)
    public static final void method3115(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        field7809++;
        if (arg0 > 0 && !class452.method2633(arg0, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class452.method2633(arg6, (byte) 127)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 32993) {
            if (arg5 > -25) {
                method3115(-128, 23, 87, null, -45, (byte) -36, -115, 49);
            }
            int var8 = 0;
            int var9 = arg6 <= arg0 ? arg6 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg3;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var8, arg1, arg0, arg6, 0, arg2, arg7, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 + arg0;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 >> 24 & 0xFF;
                        int var24 = (var20 & 0xFF2B) >> 8;
                        int var25 = var20 >> 16 & 0xFF;
                        int var26 = var20 & 0xFF;
                        int var27 = var12[var16++];
                        int var28 = ((var21 & 0xFFCC32) >> 16) + var25;
                        int var29 = (var21 >> 8 & 0xFF) + var24;
                        int var30 = (var21 >> 24 & 0xFF) + var23;
                        int var31 = (var21 & 0xFF) + var26;
                        int var32 = (var22 >> 24 & 0xFF) + var30;
                        int var33 = ((var22 & 0xFF846A) >> 16) + var28;
                        int var34 = (var22 & 0xFF) + var31;
                        int var35 = (var22 >> 8 & 0xFF) + var29;
                        int var36 = ((var27 & 0xFFD6) >> 8) + var35;
                        int var37 = ((var27 & 0xFFE93C) >> 16) + var33;
                        int var38 = (var27 >> 24 & 0xFF) + var32;
                        int var39 = (var27 & 0xFF) + var34;
                        var13[var14++] = class460.method2676(class248.method1593(255, var39 >> 2), class460.method2676(class248.method1593(1020, var36) << 6, class460.method2676(class248.method1593(var38, 1020) << 22, class248.method1593(var37 << 14, 16711680))));
                    }
                    var15 += arg0;
                    var16 += arg0;
                }
                var13 = var12;
                arg6 = var11;
                var12 = var17;
                arg0 = var10;
                var8++;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 120)
    public static void method3116(int arg0) {
        if (arg0 < 107) {
            method3117(false);
        }
        field7803 = null;
        field7808 = null;
    }

    @OriginalMember(owner = "client!gn", name = "toString", descriptor = "()Ljava/lang/String;", line = 132)
    public final String toString() {
        field7807++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I", line = 143)
    public static final int method3117(boolean arg0) {
        field7805++;
        return arg0 ? class673.field9558 : 67;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 159)
    public class529(String arg0, int arg1) {
        this.field7804 = arg0;
        this.field7806 = arg1;
    }
}
