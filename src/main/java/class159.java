import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class159 extends class13 {

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "Z")
    private boolean field2226 = true;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    private int field2237 = 4096;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "Lbj;")
    public static class131 field2232 = new class131(100);

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "Lkn;")
    public static class442 field2233 = new class442("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "[I")
    public static int[] field2235 = new int[2];

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "[I")
    public static int[] field2238 = new int[14];

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "Lnq;")
    public static class268 field2229;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "Lai;")
    public static class357 field2234;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lkh;BI)V", line = 4)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field2230;
        if (arg1 < 50) {
            field2234 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field2226 = arg0.method172((byte) 52) == 1;
            }
        } else {
            this.field2237 = arg0.method174(255);
        }
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(B)V", line = 40)
    public static void method1059(byte arg0) {
        field2235 = null;
        field2229 = null;
        int var1 = 84 / ((arg0 - -52) / 48);
        field2238 = null;
        field2234 = null;
        field2233 = null;
        field2232 = null;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 56)
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLko;ZLjava/lang/String;I)V", line = 59)
    public static final void method1060(boolean arg0, class294 arg1, boolean arg2, String arg3, int arg4) {
        ++field2231;
        if (!arg0) {
            class362.method2325(arg1, arg3, 3, (byte) 127);
        } else {
            if (class294.field4126.startsWith("win") && class294.field4112 != 3) {
                String var5 = null;
                if (arg1.field4121 != null) {
                    var5 = arg1.field4121.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class283 var6 = class362.method2325(arg1, arg3, 0, (byte) 127);
                    class327.field4477 = var6;
                    class410.field5806 = arg3;
                    class39.field572 = arg1;
                    return;
                }
            }
            if (class294.field4126.startsWith("mac")) {
                String var7 = null;
                if (arg1.field4121 != null) {
                    var7 = arg1.field4121.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg2) {
                    class362.method2325(arg1, arg3, 1, (byte) 127);
                    return;
                }
            }
            class362.method2325(arg1, arg3, 2, (byte) 127);
        }
        if (arg4 != -29841) {
            field2233 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[I", line = 133)
    public final int[][] method222(int arg0, int arg1) {
        ++field2225;
        int[][] var3 = super.field256.method1930(arg1, (byte) 91);
        if (super.field256.field4154) {
            int[] var4 = this.method223(0, -11541, class123.field1710 & arg1 + -1);
            int[] var5 = this.method223(0, -11541, arg1);
            int[] var6 = this.method223(0, -11541, arg1 + 1 & class123.field1710);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class269.field3751; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2237;
                int var12 = (var5[var10 - -1 & class343.field4677] + -var5[class343.field4677 & var10 - 1]) * this.field2237;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field2226) {
                    var18 = 2048 - -(var18 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        if (arg0 != -27832) {
            field2234 = null;
        }
        return var3;
    }
}
