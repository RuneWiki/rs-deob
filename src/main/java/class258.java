import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class258 extends class80 {

    @OriginalMember(owner = "client!at", name = "R", descriptor = "Z")
    private boolean field3956 = true;

    @OriginalMember(owner = "client!at", name = "Q", descriptor = "I")
    private int field3955 = 4096;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "[I")
    public static int[] field3947 = new int[4096];

    @OriginalMember(owner = "client!at", name = "N", descriptor = "Z")
    public static boolean field3952 = false;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field3951 = new String[100];

    @OriginalMember(owner = "client!at", name = "S", descriptor = "I")
    public static int field3957 = -50;

    @OriginalMember(owner = "client!at", name = "T", descriptor = "[I")
    public static int[] field3958;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!at", name = "P", descriptor = "I")
    public static int field3954;

    static {
        new class309("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field3958 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V", line = 3)
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)V", line = 11)
    public static void method1662(byte arg0) {
        field3947 = null;
        field3958 = null;
        if (arg0 != 15) {
            field3957 = -123;
        }
        field3951 = null;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(II)[[I", line = 35)
    public final int[][] method29(int arg0, int arg1) {
        ++field3949;
        int[][] var3 = super.field1589.method859(arg1, -25);
        if (arg0 != 255) {
            field3947 = null;
        }
        if (super.field1589.field1884) {
            int[] var4 = this.method710(arg1 + -1 & class359.field5269, 0, (byte) 94);
            int[] var5 = this.method710(arg1, 0, (byte) 126);
            int[] var6 = this.method710(arg1 + 1 & class359.field5269, 0, (byte) 88);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class137.field2308 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3955;
                int var12 = (var5[class308.field4672 & var10 + 1] + -var5[var10 + -1 & class308.field4672]) * this.field3955;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field3956) {
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIZLza;ILla;)V", line = 117)
    public static final void method1663(int arg0, int arg1, int arg2, boolean arg3, class288 arg4, int arg5, class317 arg6) {
        ++field3953;
        if (arg3) {
            class229.field3552.method159((class71.field1415 - class229.field3552.method147()) / 2, (class65.field1330 - class229.field3552.method165()) / 2);
            class396.field6025.method159((class71.field1415 + -class396.field6025.method147()) / 2, 18);
        }
        String var7 = "";
        if (class424.field6366 == class316.field4779) {
            var7 = class382.field5584.method1977(class146.field2452, 114);
        } else if (class424.field6366 == class209.field3343) {
            var7 = class23.field334.method1977(class146.field2452, -72);
        }
        arg6.method2010(class71.field1415 / 2, var7, arg0, class65.field1330 / 2 - 26, -1, 56);
        if (arg5 <= 58) {
            field3958 = null;
        }
        int var8 = class65.field1330 / 2 + -18;
        arg4.method365(class71.field1415 / 2 - 152, var8, 304, 34, arg2, 0);
        arg4.method365(class71.field1415 / 2 + -151, var8 - -1, 302, 32, 0, 0);
        arg4.method327(class71.field1415 / 2 + -150, var8 + 2, class174.field2805 * 3, 30, arg1, 0);
        arg4.method327(class174.field2805 * 3 + class71.field1415 / 2 + -150, var8 + 2, -(class174.field2805 * 3) + 300, 30, 0, 0);
        arg6.method2010(class71.field1415 / 2, class159.field2572, arg0, class65.field1330 / 2 + 4, -1, 49);
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V", line = 150)
    public static final void method1664(int arg0) {
        ++field3954;
        if (arg0 == 18915) {
            if (class320.field4895 != null) {
                class320.field4895.method1802((byte) -65);
                class119.field2091 = null;
                class320.field4895 = null;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IILnn;)V", line = 176)
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field3950;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3956 = arg2.method1858(-3256) == 1;
            }
        } else {
            this.field3955 = arg2.method1841((byte) 122);
        }
        int var5 = -2 % ((28 - arg1) / 53);
    }
}
