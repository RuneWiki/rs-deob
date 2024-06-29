import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class234 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[Loi;")
    public class65[] field3627 = null;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[Loi;")
    private class65[] field3630 = null;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Ljb;")
    public class456 field3634 = null;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Ljb;")
    public class456 field3629 = null;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lhea;")
    private class387 field3632;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Z")
    public boolean field3626;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lnea;")
    public static class664 field3636 = new class664(104, 10);

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3638 = -1;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBZ)I")
    public static final int method1600(int arg0, int arg1, byte arg2, boolean arg3) {
        field3637++;
        class138 var4 = class642.method3576(arg0, (byte) -70, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var4.field2008.length) {
            if (arg2 != -59) {
                field3636 = null;
            }
            return var4.field2008[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
    public final boolean method1601(byte arg0) {
        if (this.field3629 == null) {
            if (class134.field1977 == null) {
                byte[] var2 = class554.method3146(new class271(419684), 4.0F, 16.0F, 16, (byte) 23, 128, 0.6F, 4.0F, 128, 0.5F, 8);
                class134.field1977 = class62.method647((byte) 20, var2, false);
            }
            byte[] var3 = class59.method633(false, false, class134.field1977);
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
            this.field3629 = this.field3632.method1894(-11561, var4, 128, 128, 16, class75.field1306);
        }
        if (arg0 > -123) {
            return false;
        } else {
            field3633++;
            return this.field3629 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method1602(byte arg0) {
        field3636 = null;
        if (arg0 > -71) {
            method1604(126, null, -32, -11);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BILjava/lang/String;ZLjava/lang/String;)V")
    public static final void method1603(byte arg0, int arg1, String arg2, boolean arg3, String arg4) {
        class693.method3809(arg0 + 20599, arg4, true, arg1, arg2, arg3, -1);
        if (arg0 != 45) {
            field3638 = -90;
        }
        field3628++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method1604(int arg0, byte[] arg1, int arg2, int arg3) {
        field3631++;
        byte[] var4;
        if (arg2 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg1[arg2 + var5];
            }
        } else {
            var4 = arg1;
        }
        class115 var6 = new class115();
        var6.method898((byte) -109);
        var6.method899((long) (arg0 * 8), false, var4);
        if (arg3 == 128) {
            byte[] var7 = new byte[64];
            var6.method896(var7, 0, false);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
    public final boolean method1605(int arg0) {
        field3635++;
        if (arg0 != -27703) {
            return true;
        } else if (this.field3626) {
            return this.field3634 != null;
        } else {
            return this.field3627 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lhea;)V")
    public class234(class387 arg0) {
        this.field3632 = arg0;
        this.field3626 = this.field3632.field5713;
        if (this.field3626 && !this.field3632.method1867(class87.field1430, class218.field3050, false)) {
            this.field3626 = false;
        }
        if (this.field3626 || this.field3632.method1895(class218.field3050, true, class87.field1430)) {
            class471.method2772(-128);
            if (this.field3626) {
                byte[] var2 = class59.method633(false, false, class498.field7058);
                this.field3634 = this.field3632.method1894(-11561, var2, 128, 128, 16, class87.field1430);
                byte[] var3 = class59.method633(false, false, class111.field1688);
                this.field3632.method1894(-11561, var3, 128, 128, 16, class87.field1430);
            } else {
                this.field3627 = new class65[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class548.method3102(true, class498.field7058, 32768, var4 * 2 * 16384);
                    this.field3627[var4] = this.field3632.method2330(true, class87.field1430, 0, 128, var7, 128);
                }
                this.field3630 = new class65[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class548.method3102(true, class111.field1688, 32768, var5 * 128 * 2 * 128);
                    this.field3630[var5] = this.field3632.method2330(true, class87.field1430, 0, 128, var6, 128);
                }
            }
        }
    }
}
