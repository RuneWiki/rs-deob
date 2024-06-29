import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class698 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[Ldh;")
    public class320[] field9622 = null;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[Ldh;")
    private class320[] field9626 = null;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lpa;")
    public class369 field9629 = null;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lpa;")
    public class369 field9630 = null;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lsr;")
    private class251 field9623;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
    public boolean field9625;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field9627 = 64;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field9628 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "D")
    public static double field9624;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[S")
    public static short[] field9631;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method3923(byte arg0, int arg1) {
        field9621++;
        class592 var2 = class682.method3825(-652872096, 1, arg1);
        if (arg0 == 113) {
            var2.method3350(arg0 - 113);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z", line = 22)
    public final boolean method3924(boolean arg0) {
        if (this.field9630 == null) {
            if (class567.field8045 == null) {
                byte[] var2 = class4.method21(0.5F, 16, 128, new class203(419684), 128, 8, 16.0F, 4.0F, 0, 0.6F, 4.0F);
                class567.field8045 = class273.method1777(110, false, var2);
            }
            byte[] var3 = class294.method1917(2, false, class567.field8045);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = var8 + ((var9 - 1 & 0x7F) * 128);
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
            this.field9630 = this.field9623.method1469(128, (byte) -120, 16, class165.field2263, 128, var4);
        }
        if (arg0) {
            return false;
        } else {
            field9620++;
            return this.field9630 != null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lsr;)V", line = 124)
    public class698(class251 arg0) {
        this.field9623 = arg0;
        this.field9625 = this.field9623.field3603;
        if (this.field9625 && !this.field9623.method1439(class309.field4305, class403.field5708, 98)) {
            this.field9625 = false;
        }
        if (this.field9625 || this.field9623.method1444(class309.field4305, class403.field5708, (byte) -45)) {
            class144.method1003(16);
            if (this.field9625) {
                byte[] var6 = class294.method1917(2, false, class31.field412);
                this.field9629 = this.field9623.method1469(128, (byte) -102, 16, class403.field5708, 128, var6);
                byte[] var7 = class294.method1917(2, false, class3.field33);
                this.field9623.method1469(128, (byte) -96, 16, class403.field5708, 128, var7);
            } else {
                this.field9622 = new class320[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class661.method3622(class31.field412, var2 * 128 * 2 * 128, 0, 32768);
                    this.field9622[var2] = this.field9623.method1612(true, class403.field5708, var5, 94, 128, 128);
                }
                this.field9626 = new class320[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class661.method3622(class3.field33, var3 * 128 * 2 * 128, 0, 32768);
                    this.field9626[var3] = this.field9623.method1612(true, class403.field5708, var4, 107, 128, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Z", line = 98)
    public final boolean method3925(int arg0) {
        if (arg0 != -30571) {
            field9631 = null;
        }
        field9632++;
        if (this.field9625) {
            return this.field9629 != null;
        } else {
            return this.field9622 != null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 180)
    public static void method3926(int arg0) {
        if (arg0 <= 5) {
            field9624 = 0.12382061902172252D;
        }
        field9631 = null;
    }
}
