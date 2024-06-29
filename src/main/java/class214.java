import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class214 extends class498 {

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "J")
    public long field3089;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Z")
    public boolean field3095;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "Ljava/lang/String;")
    public String field3099;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
    public boolean field3086;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "Ljava/lang/String;")
    public String field3098;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field3090 = 2;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field3084 = -1;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILhm;IILta;Lo;II)V", line = 15)
    public static final void method1341(int arg0, class150 arg1, int arg2, int arg3, class145 arg4, class24 arg5, int arg6, int arg7) {
        field3087++;
        if (arg5 == null) {
            return;
        }
        if (arg3 != 0) {
            method1341(86, null, -120, 95, null, null, -37, -119);
        }
        int var8;
        if (class504.field7461 == 4) {
            var8 = (int) class153.field2204 & 0x3FFF;
        } else {
            var8 = (int) class153.field2204 + class460.field6441 & 0x3FFF;
        }
        int var9 = Math.max(arg1.field2113 / 2, arg1.field2033 / 2) + 10;
        int var10 = arg0 * arg0 + (arg7 * arg7);
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class95.field1242[var8];
        int var12 = class95.field1241[var8];
        if (class504.field7461 != 4) {
            var11 = var11 * 256 / (class98.field1304 + 256);
            var12 = var12 * 256 / (class98.field1304 + 256);
        }
        int var13 = arg0 * var12 + arg7 * var11 >> 15;
        int var14 = arg7 * var12 - arg0 * var11 >> 15;
        arg5.method148(arg1.field2113 / 2 + var13 + arg2 - (arg5.method145() / 2), arg1.field2033 / 2 + -var14 + (arg6 - arg5.method157() / 2), arg4, arg2, arg6);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIZ)V", line = 58)
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3093++;
        if (arg5) {
            return;
        }
        int var6 = arg2 - arg4;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class492.method2860(arg3, arg1, arg2, (byte) -124, arg4);
            }
        } else if (var6 == 0) {
            class220.method1362(arg0, arg3, 2, arg1, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                int var10 = arg0;
                arg1 = arg4;
                arg0 = arg2;
                arg4 = var9;
                arg2 = var10;
            }
            if (arg0 < arg1) {
                int var11 = arg1;
                int var12 = arg4;
                arg1 = arg0;
                arg0 = var11;
                arg4 = arg2;
                arg2 = var12;
            }
            int var13 = arg4;
            int var14 = arg0 - arg1;
            int var15 = arg2 - arg4;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg4 >= arg2 ? -1 : 1;
            if (var8) {
                for (int var19 = arg1; var19 <= arg0; var19++) {
                    class112.field1523[var19][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg0; var18++) {
                    class112.field1523[var13][var18] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 186)
    public class214(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field3089 = arg5;
        this.field3095 = arg8;
        this.field3099 = arg0;
        this.field3094 = arg3;
        this.field3086 = arg9;
        this.field3092 = arg2;
        this.field3098 = arg1;
        this.field3088 = arg6;
        this.field3096 = arg7;
        this.field3085 = arg4;
    }
}
