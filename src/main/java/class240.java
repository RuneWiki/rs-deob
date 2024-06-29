import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class240 {

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[Loga;")
    public class498[] field3599 = null;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lgga;")
    public class307 field3600 = null;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[Loga;")
    private class498[] field3603 = null;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lgga;")
    public class307 field3607 = null;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lpj;")
    private class156 field3605;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
    public boolean field3604;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3596 = -1;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lok;")
    public static class266 field3597 = new class266();

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lvia;")
    public static class588 field3602;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
    public final boolean method1598(byte arg0) {
        if (arg0 != -74) {
            return true;
        }
        field3598++;
        if (this.field3604) {
            return this.field3600 != null;
        } else {
            return this.field3599 != null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1599(int arg0) {
        field3597 = null;
        field3602 = null;
        if (arg0 != 128) {
            method1600(-70, 4, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1600(int arg0, int arg1, byte arg2) {
        field3601++;
        if (arg2 != -85) {
            method1600(-83, 111, (byte) -95);
        }
        if (!class626.field8777) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class787.field10812[var3] == null || class787.field10812[var3][var4] == null) {
            return false;
        }
        class451 var5 = class787.field10812[var3][var4];
        if (arg0 == -1 && var5.field6210 == 0) {
            for (class746 var6 = (class746) class239.field3583.method1731((byte) -122); var6 != null; var6 = (class746) class239.field3583.method1724(0)) {
                if (var6.field10340 == 6 || var6.field10340 == 1004 || var6.field10340 == 5 || var6.field10340 == 30 || var6.field10340 == 3) {
                    for (class451 var7 = class166.method1238((byte) -101, var6.field10331); var7 != null; var7 = class596.method3481(var7, 1887758448)) {
                        if (var5.field6222 == var7.field6222) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class746 var8 = (class746) class239.field3583.method1731((byte) -107); var8 != null; var8 = (class746) class239.field3583.method1724(0)) {
                if (var8.field10342 == arg0 && var5.field6222 == var8.field10331 && (var8.field10340 == 6 || var8.field10340 == 1004 || var8.field10340 == 5 || var8.field10340 == 30 || var8.field10340 == 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Z")
    public final boolean method1601(byte arg0) {
        field3606++;
        if (this.field3607 == null) {
            if (class626.field8764 == null) {
                byte[] var2 = class95.method695(0.6F, 16.0F, 128, 4.0F, new class170(419684), true, 16, 128, 4.0F, 0.5F, 8);
                class626.field8764 = class211.method1448(var2, false, 1908068769);
            }
            byte[] var3 = class56.method388(true, false, class626.field8764);
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
            this.field3607 = this.field3605.method1193(class691.field9659, var4, 128, false, 128, 16);
        }
        if (arg0 == -112) {
            return this.field3607 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lpj;)V")
    public class240(class156 arg0) {
        this.field3605 = arg0;
        this.field3604 = this.field3605.field2440;
        if (this.field3604 && !this.field3605.method1122(class34.field457, class315.field4480, 107)) {
            this.field3604 = false;
        }
        if (this.field3604 || this.field3605.method1198(13554, class315.field4480, class34.field457)) {
            class142.method1015(-72);
            if (this.field3604) {
                byte[] var2 = class56.method388(true, false, class532.field7686);
                this.field3600 = this.field3605.method1193(class315.field4480, var2, 128, false, 128, 16);
                byte[] var3 = class56.method388(true, false, class123.field1920);
                this.field3605.method1193(class315.field4480, var3, 128, false, 128, 16);
            } else {
                this.field3599 = new class498[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class157.method1202(32768, var4 * 128 * 128 * 2, class532.field7686, false);
                    this.field3599[var4] = this.field3605.method1141(128, 128, var7, true, false, class315.field4480);
                }
                this.field3603 = new class498[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class157.method1202(32768, var5 * 128 * 128 * 2, class123.field1920, false);
                    this.field3603[var5] = this.field3605.method1141(128, 128, var6, true, false, class315.field4480);
                }
            }
        }
    }
}
