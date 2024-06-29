import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class302 extends class333 {

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "Ljava/lang/String;")
    public String field3752;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BIIII)V")
    public static final void method1751(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3750++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        if (arg0 >= -121) {
            field3751 = 117;
        }
        class315.method1809(class557.field7954[arg3], arg4, -128, arg1 - arg2, arg1 + arg2);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class557.field7954[arg3 + var6];
                int[] var10 = class557.field7954[arg3 - var6];
                int var11 = arg1 + var5;
                int var12 = arg1 - var5;
                class315.method1809(var9, arg4, -128, var12, var11);
                class315.method1809(var10, arg4, -128, var12, var11);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class557.field7954[arg3 + var5];
            int[] var16 = class557.field7954[arg3 - var5];
            class315.method1809(var15, arg4, -128, var14, var13);
            class315.method1809(var16, arg4, -128, var14, var13);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "()V")
    public static final void method1752() {
        if (class50.field506 != null) {
            for (int var0 = 0; var0 < class50.field506.length; var0++) {
                for (int var1 = 0; var1 < class122.field1369; var1++) {
                    for (int var2 = 0; var2 < class247.field3058; var2++) {
                        if (class50.field506[var0][var1][var2] != null) {
                            class50.field506[var0][var1][var2].method2878((byte) 6);
                        }
                        class50.field506[var0][var1][var2] = null;
                    }
                }
            }
        }
        class50.field506 = null;
        class385.field5193 = null;
        if (class604.field8494 != null) {
            for (int var3 = 0; var3 < class604.field8494.length; var3++) {
                for (int var4 = 0; var4 < class122.field1369; var4++) {
                    for (int var5 = 0; var5 < class247.field3058; var5++) {
                        if (class604.field8494[var3][var4][var5] != null) {
                            class604.field8494[var3][var4][var5].method2878((byte) 6);
                        }
                        class604.field8494[var3][var4][var5] = null;
                    }
                }
            }
        }
        class604.field8494 = null;
        class666.field9303 = null;
        class487.field7044 = null;
        class156.field1743 = null;
        class475.field6837 = null;
        class41.field408 = null;
        class560.field7992 = null;
        class507.field7283 = null;
        class663.method3683((byte) -89);
        if (class138.field1525 != null) {
            for (int var6 = 0; var6 < class282.field3532; var6++) {
                class138.field1525[var6] = null;
            }
            class282.field3532 = 0;
        }
        if (class469.field6711 != null) {
            for (int var7 = 0; var7 < class321.field3949[0]; var7++) {
                class469.field6711[0][var7] = null;
            }
            for (int var8 = 0; var8 < class321.field3949[1]; var8++) {
                class469.field6711[1][var8] = null;
            }
            class321.field3949 = new int[2];
        }
        if (class13.field115 != null) {
            for (int var9 = 0; var9 < class635.field8946[0]; var9++) {
                class13.field115[0][var9] = null;
            }
            for (int var10 = 0; var10 < class635.field8946[1]; var10++) {
                class13.field115[1][var10] = null;
            }
            class635.field8946 = new int[2];
        }
        if (class476.field6867 != null) {
            for (int var11 = 0; var11 < class701.field9822[0]; var11++) {
                class476.field6867[0][var11] = null;
            }
            for (int var12 = 0; var12 < class701.field9822[1]; var12++) {
                class476.field6867[1][var12] = null;
            }
            class701.field9822 = new int[2];
        }
        if (class337.field4241 != null) {
            for (int var13 = 0; var13 < class337.field4241.length; var13++) {
                class337.field4241[var13] = null;
            }
            class446.field6294 = 0;
        }
        if (class234.field2869 != null) {
            for (int var14 = 0; var14 < class234.field2869.length; var14++) {
                class234.field2869[var14] = null;
            }
            class361.field4846 = 0;
        }
        if (class85.field860 != null) {
            for (int var15 = 0; var15 < class137.field1501; var15++) {
                class85.field860[var15] = null;
            }
            for (int var16 = 0; var16 < class612.field8618; var16++) {
                for (int var17 = 0; var17 < class122.field1369; var17++) {
                    for (int var18 = 0; var18 < class247.field3058; var18++) {
                        class312.field3882[var16][var17][var18] = 0L;
                    }
                }
            }
            class137.field1501 = 0;
        }
        class165.method896((byte) 20);
        class517.field7362.method1666((byte) 71);
        class559.field7988 = null;
        class470.field6718 = null;
        class383.field5172 = null;
        if (class642.field9080 != null) {
            class632.method3549();
            class568.field8078.method978(1);
            class568.field8078.method1018(0);
        }
        if (class472.field6799 != null) {
            class472.field6799 = null;
        }
        class568.field8078 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLkca;)Z")
    public static final boolean method1753(byte arg0, class655 arg1) {
        field3749++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field9190) {
            return false;
        } else if (arg1.method3644(-13401, class482.field6931)) {
            if (arg0 > -58) {
                field3748 = 96;
            }
            if (class692.field9718.method3669((long) arg1.field9187, -1) == null) {
                return class407.field5438.method3669((long) arg1.field9193, -1) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
    public class302() {
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class302(String arg0) {
        this.field3752 = arg0;
    }
}
