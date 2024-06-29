import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class639 {

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "[Lbw;")
    public class28[] field8980 = null;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "[Lbw;")
    private class28[] field8985 = null;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "Lat;")
    public class162 field8989 = null;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "Lat;")
    public class162 field8983 = null;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "Llba;")
    private class223 field8982;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "Z")
    public boolean field8984;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method3674(int arg0) {
        if (arg0 < 6) {
            field8988 = 17;
        }
        field8986++;
        if (this.field8984) {
            return this.field8983 != null;
        } else {
            return this.field8980 != null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)Z", line = 17)
    public final boolean method3675(byte arg0) {
        if (arg0 != 91) {
            this.field8983 = null;
        }
        if (this.field8989 == null) {
            if (class83.field999 == null) {
                byte[] var2 = class678.method3860(16.0F, 128, 0.6F, 0.5F, 16, new class494(419684), 4.0F, arg0 - 19930, 128, 4.0F, 8);
                class83.field999 = class485.method2881(-137, var2, false);
            }
            byte[] var3 = class410.method2503(class83.field999, 5, false);
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
            this.field8989 = this.field8982.method1432(-13836, class75.field837, var4, 128, 16, 128);
        }
        field8987++;
        return this.field8989 != null;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Llba;)V", line = 142)
    public class639(class223 arg0) {
        this.field8982 = arg0;
        this.field8984 = this.field8982.field3363;
        if (this.field8984 && !this.field8982.method1442(class612.field8616, class406.field5718, (byte) 120)) {
            this.field8984 = false;
        }
        if (this.field8984 || this.field8982.method1491(class612.field8616, 1, class406.field5718)) {
            class502.method2936(false);
            if (this.field8984) {
                byte[] var2 = class410.method2503(class550.field7652, 5, false);
                this.field8983 = this.field8982.method1432(-13836, class406.field5718, var2, 128, 16, 128);
                byte[] var3 = class410.method2503(class35.field338, 5, false);
                this.field8982.method1432(-13836, class406.field5718, var3, 128, 16, 128);
            } else {
                this.field8980 = new class28[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class10.method28(class550.field7652, 32768, (byte) 51, var4 * 16384 * 2);
                    this.field8980[var4] = this.field8982.method1407(128, 128, var7, (byte) 92, true, class406.field5718);
                }
                this.field8985 = new class28[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class10.method28(class35.field338, 32768, (byte) 97, var5 * 2 * 16384);
                    this.field8985[var5] = this.field8982.method1407(128, 128, var6, (byte) 92, true, class406.field5718);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)I", line = 97)
    public static final int method3676(int arg0) {
        field8981++;
        if ((double) class46.field494 == 3.0D) {
            return 37;
        } else if ((double) class46.field494 == 4.0D) {
            return 50;
        } else if ((double) class46.field494 == 6.0D) {
            return 75;
        } else if ((double) class46.field494 == 8.0D) {
            return 100;
        } else {
            int var1 = 31 / ((40 - arg0) / 44);
            return 200;
        }
    }
}
