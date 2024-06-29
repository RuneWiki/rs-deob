import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class314 {

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "Lor;")
    public class665 field4426 = null;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "Lor;")
    public class665 field4427 = null;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "[Lfk;")
    public class678[] field4429 = null;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "[Lfk;")
    private class678[] field4434 = null;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lee;")
    private class703 field4431;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "Z")
    public boolean field4433;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method2009(int arg0, byte arg1) {
        class340.field4758 = arg0;
        field4425++;
        class159.field2142 = 2;
        long var2 = 0L;
        if (class157.field2106 == null) {
            class623.method3439(35, 59);
            return;
        }
        class254 var4 = new class254(class56.method354(class76.method608(70, class157.field2106), -24686));
        long var5 = var4.method1723(21795);
        class128.field1768 = var4.method1723(21795);
        class772.method4247("", 0, class404.method2444(103, var5), true);
        if (arg1 < 123) {
            method2010(null, false, 96, false);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lee;)V", line = 127)
    public class314(class703 arg0) {
        this.field4431 = arg0;
        this.field4433 = this.field4431.field9578;
        if (this.field4433 && !this.field4431.method2769((byte) 6, class564.field7728, class415.field5986)) {
            this.field4433 = false;
        }
        if (this.field4433 || this.field4431.method2784(true, class415.field5986, class564.field7728)) {
            class398.method2431((byte) 16);
            if (this.field4433) {
                byte[] var2 = class585.method3295(class617.field8324, 1, false);
                this.field4426 = this.field4431.method2783(-25885, class564.field7728, 128, 16, 128, var2);
                byte[] var3 = class585.method3295(class255.field3797, 1, false);
                this.field4431.method2783(-25885, class564.field7728, 128, 16, 128, var3);
            } else {
                this.field4429 = new class678[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class102.method787(32768, var4 * 32768, class617.field8324, (byte) 122);
                    this.field4429[var4] = this.field4431.method3861(128, 128, true, 12413, var7, class564.field7728);
                }
                this.field4434 = new class678[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class102.method787(32768, var5 * 16384 * 2, class255.field3797, (byte) 114);
                    this.field4434[var5] = this.field4431.method3861(128, 128, true, 12413, var6, class564.field7728);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lhia;ZIZ)V", line = 46)
    public static final void method2010(class73 arg0, boolean arg1, int arg2, boolean arg3) {
        field4430++;
        int var4 = arg0.field985;
        int var5 = (int) arg0.field2146;
        arg0.method1102((byte) 124);
        if (arg1) {
            class445.method2656(var4, -1);
        }
        class255.method1741(-32100, var4);
        class347 var6 = class445.method2655(var5, (byte) 115);
        if (var6 != null) {
            class151.method1062((byte) -101, var6);
        }
        class358.method2273(0);
        if (!arg3 && class227.field2935 != -1) {
            class208.method1359(-13540, class227.field2935, 1);
        }
        int var7 = -118 / ((arg2 - 1) / 58);
        class187 var8 = new class187(class355.field5178);
        for (class73 var9 = (class73) var8.method1259(-128); var9 != null; var9 = (class73) var8.method1255(65410)) {
            if (!var9.method1104(3)) {
                var9 = (class73) var8.method1259(-119);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field993 == 3) {
                int var10 = (int) var9.field2146;
                if (var10 >>> 16 == var4) {
                    method2010(var9, true, -72, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)Z", line = 113)
    public final boolean method2011(boolean arg0) {
        if (arg0) {
            this.field4427 = null;
        }
        field4428++;
        if (this.field4433) {
            return this.field4426 != null;
        } else {
            return this.field4429 != null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)Z", line = 181)
    public final boolean method2012(boolean arg0) {
        field4432++;
        if (this.field4427 == null) {
            if (class503.field7075 == null) {
                byte[] var2 = class37.method215(16.0F, 0.6F, 128, 0.5F, 16, (byte) 118, 8, 4.0F, new class503(419684), 128, 4.0F);
                class503.field7075 = class33.method182(-19357, var2, false);
            }
            byte[] var3 = class585.method3295(class503.field7075, 1, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
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
            this.field4427 = this.field4431.method2783(-25885, class109.field1521, 128, 16, 128, var4);
        }
        if (arg0) {
            return true;
        } else {
            return this.field4427 != null;
        }
    }
}
