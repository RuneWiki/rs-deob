import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class374 {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "[Ldg;")
    private class19[] field5261 = null;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lrj;")
    public class361 field5259 = null;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "[Ldg;")
    public class19[] field5262 = null;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Lrj;")
    public class361 field5265 = null;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Lrl;")
    private class232 field5267;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
    public boolean field5268;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lkr;")
    public static class602 field5271 = new class602(111, 0);

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
    public static final boolean method2347(int arg0) {
        field5266++;
        try {
            if (arg0 != -1) {
                field5271 = null;
            }
            return class327.method2087((byte) -122);
        } catch (IOException var4) {
            class481.method2934(arg0 ^ 0xFFFFFFF8);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class400.field5735 == null ? -1 : class400.field5735.method3433(arg0)) + "," + (class113.field1523 == null ? -1 : class113.field1523.method3433(-1)) + "," + (class600.field8121 == null ? -1 : class600.field8121.method3433(arg0)) + " - " + class357.field5125 + "," + (class113.field1509 + class388.field5601.field7197[0]) + "," + (class587.field7995 + class388.field5601.field7198[0]) + " - ";
            for (int var3 = 0; class357.field5125 > var3 && var3 < 50; var3++) {
                var2 = var2 + class352.field5071.field954[var3] + ",";
            }
            class31.method172(var5, var2, 0);
            class327.method2089(false, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method2348(int arg0) {
        if (arg0 != -6109) {
            field5260 = -128;
        }
        field5271 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
    public static final void method2349(int arg0, int arg1) {
        field5270++;
        if (class81.field1172 == arg1) {
            return;
        }
        class277.field4036 = class667.field9202 = class649.field8708[arg1];
        class166.method1035((byte) -49);
        class437.field6095 = new int[class277.field4036][class667.field9202];
        class96.field1364 = new int[4][class277.field4036 >> 3][class667.field9202 >> 3];
        class598.field8109 = new int[class277.field4036][class667.field9202];
        int var2 = 0;
        if (arg0 != -10757) {
            return;
        }
        while (var2 < 4) {
            class209.field2735[var2] = class477.method2908(class277.field4036, (byte) -20, class667.field9202);
            var2++;
        }
        class343.field4884 = new byte[4][class277.field4036][class667.field9202];
        class420.method2603(class277.field4036, (byte) 29, class667.field9202, 4);
        class258.method1748(class277.field4036 >> 3, class129.field1802, (byte) 57, class667.field9202 >> 3);
        class81.field1172 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Z")
    public final boolean method2350(int arg0) {
        field5264++;
        if (arg0 != 2) {
            return false;
        } else if (this.field5268) {
            return this.field5259 != null;
        } else {
            return this.field5262 != null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
    public static final void method2351(int arg0) {
        field5269++;
        if (arg0 == -4273) {
            class679.field9434.method3906(-124);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)Z")
    public final boolean method2352(boolean arg0) {
        field5263++;
        if (this.field5265 == null) {
            if (class649.field8710 == null) {
                byte[] var2 = class120.method749(128, -25377, 4.0F, 0.5F, 16.0F, 8, 4.0F, 128, 16, new class420(419684), 0.6F);
                class649.field8710 = class733.method4084(false, 824028812, var2);
            }
            byte[] var3 = class229.method1363(107, class649.field8710, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field5265 = this.field5267.method300(18173, 16, 128, var4, 128, class623.field8394);
        }
        if (!arg0) {
            this.field5259 = null;
        }
        return this.field5265 != null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lrl;)V")
    public class374(class232 arg0) {
        this.field5267 = arg0;
        this.field5268 = this.field5267.field3359;
        if (this.field5268 && !this.field5267.method288(class718.field9995, class38.field472, 12935)) {
            this.field5268 = false;
        }
        if (this.field5268 || this.field5267.method323(class38.field472, class718.field9995, (byte) -16)) {
            class175.method1109((byte) -50);
            if (this.field5268) {
                byte[] var6 = class229.method1363(66, class151.field2084, false);
                this.field5259 = this.field5267.method300(18173, 16, 128, var6, 128, class718.field9995);
                byte[] var7 = class229.method1363(76, class531.field7362, false);
                this.field5267.method300(18173, 16, 128, var7, 128, class718.field9995);
            } else {
                this.field5262 = new class19[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class446.method2723(class151.field2084, var2 * 128 * 128 * 2, 32768, 89);
                    this.field5262[var2] = this.field5267.method1416(class718.field9995, 128, true, true, var5, 128);
                }
                this.field5261 = new class19[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class446.method2723(class531.field7362, var3 * 128 * 128 * 2, 32768, 31);
                    this.field5261[var3] = this.field5267.method1416(class718.field9995, 128, true, true, var4, 128);
                }
            }
        }
    }
}
