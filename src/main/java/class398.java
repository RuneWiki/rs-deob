import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class398 {

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Ltea;")
    public class217 field5596 = null;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ltea;")
    public class217 field5592 = null;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "[Lcm;")
    public class679[] field5600 = null;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "[Lcm;")
    private class679[] field5601 = null;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "Lnv;")
    private class382 field5602;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "Z")
    public boolean field5595;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method2329(byte arg0) {
        field5597++;
        int var2 = -56 / ((arg0 + 57) / 61);
        if (this.field5595) {
            return this.field5596 != null;
        } else {
            return this.field5600 != null;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Z", line = 14)
    public final boolean method2330(byte arg0) {
        field5598++;
        if (arg0 != 0) {
            field5594 = 35;
        }
        if (this.field5592 == null) {
            if (class700.field9920 == null) {
                byte[] var2 = class527.method3001(128, 16, 4.0F, 16.0F, 0.6F, 8, (byte) -124, 128, new class564(419684), 4.0F, 0.5F);
                class700.field9920 = class697.method3912(var2, 0, false);
            }
            byte[] var3 = class602.method3387(false, -121, class700.field9920);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 16384;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
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
            this.field5592 = this.field5602.method1061(16, 128, var4, 128, class129.field1851, 120);
        }
        return this.field5592 != null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([I[II[ILhb;)V", line = 92)
    public static final void method2331(int[] arg0, int[] arg1, int arg2, int[] arg3, class677 arg4) {
        int var5 = 0;
        if (arg2 != 1) {
            field5594 = 80;
        }
        while (arg1.length > var5) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg4.field1794.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1794[var9] = null;
                    } else {
                        class403 var10 = class192.field2727.method3090(-109, var6);
                        int var11 = var10.field5660;
                        class133 var12 = arg4.field1794[var9];
                        if (var12 != null) {
                            if (var12.field1897 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1794[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1896 = 1;
                                    var12.field1895 = var8;
                                    var12.field1898 = 0;
                                    var12.field1893 = 0;
                                    var12.field1899 = 0;
                                    if (!arg4.field1764) {
                                        class234.method1476(arg4, var10, 0, (byte) 121);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1898 = 0;
                                }
                            } else if (var10.field5668 >= class192.field2727.method3090(45, var12.field1897).field5668) {
                                var12 = arg4.field1794[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class133 var13 = arg4.field1794[var9] = new class133();
                            var13.field1896 = 1;
                            var13.field1898 = 0;
                            var13.field1899 = 0;
                            var13.field1897 = var6;
                            var13.field1893 = 0;
                            var13.field1895 = var8;
                            if (!arg4.field1764) {
                                class234.method1476(arg4, var10, 0, (byte) -76);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field5593++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;I)V", line = 197)
    public static final void method2332(String arg0, String arg1, int arg2, String arg3, boolean arg4, int arg5, String arg6, String arg7, int arg8) {
        field5599++;
        class492 var9 = class301.field4192[99];
        if (arg4) {
            return;
        }
        for (int var10 = 99; var10 > 0; var10--) {
            class301.field4192[var10] = class301.field4192[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class492(arg2, arg8, arg7, arg1, arg3, arg6, arg5, arg0);
        } else {
            var9.method2784(arg6, arg8, -2, arg7, arg2, arg3, arg1, arg5, arg0);
        }
        class208.field2928++;
        class301.field4192[0] = var9;
        class296.field4061 = class436.field6066;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lnv;)V", line = 245)
    public class398(class382 arg0) {
        this.field5602 = arg0;
        this.field5595 = this.field5602.field5340;
        if (this.field5595 && !this.field5602.method1070(class309.field4271, class283.field3875, 23770)) {
            this.field5595 = false;
        }
        if (this.field5595 || this.field5602.method1054(class309.field4271, class283.field3875, -10)) {
            class437.method2503(5428);
            if (this.field5595) {
                byte[] var6 = class602.method3387(false, -122, class540.field7304);
                this.field5596 = this.field5602.method1061(16, 128, var6, 128, class283.field3875, 91);
                byte[] var7 = class602.method3387(false, -126, class703.field9950);
                this.field5602.method1061(16, 128, var7, 128, class283.field3875, 113);
            } else {
                this.field5600 = new class679[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class63.method527(var2 * 128 * 128 * 2, true, class540.field7304, 32768);
                    this.field5600[var2] = this.field5602.method2236(class283.field3875, var5, (byte) 116, 128, true, 128);
                }
                this.field5601 = new class679[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class63.method527(var3 * 32768, true, class703.field9950, 32768);
                    this.field5601[var3] = this.field5602.method2236(class283.field3875, var4, (byte) 118, 128, true, 128);
                }
            }
        }
    }
}
