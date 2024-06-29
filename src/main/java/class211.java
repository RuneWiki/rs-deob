import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class211 extends class170 {

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "[I")
    private int[] field3736 = new int[3];

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    private int field3742 = 3216;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    private int field3732 = 3216;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "I")
    private int field3745 = 4096;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Lmh;")
    public static class128 field3730 = class22.method156(123, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Z")
    public static boolean field3741 = false;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field3740 = 0;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field3738 = -1;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Lmh;")
    public static class128 field3729 = class22.method156(125, " weitere Optionen");

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lmh;")
    public static class128 field3746 = class22.method156(124, "leuchten2:");

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "Lmh;")
    public static class128 field3748 = class22.method156(122, "T");

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Ldj;")
    public static class314 field3734;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I", line = 5)
    public final int[] method69(byte arg0, int arg1) {
        field3739++;
        if (arg0 != 85) {
            this.field3732 = -33;
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = class183.field3209 * this.field3745 >> 12;
            int[] var5 = this.method1142((byte) 44, 0, class297.field5073 & arg1 - 1);
            int[] var6 = this.method1142((byte) 44, 0, arg1);
            int[] var7 = this.method1142((byte) 44, 0, class297.field5073 & arg1 + 1);
            for (int var8 = 0; var8 < class185.field3225; var8++) {
                int var9 = (var6[var8 - 1 & class5.field94] - var6[class5.field94 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class117.field1983[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field3736[1] * var15 >> 12;
                int var17 = this.field3736[2] * var14 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field3736[0] * var18 >> 12;
                var3[var8] = var16 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)[Lfb;", line = 84)
    public static final class55[] method1452(int arg0) {
        field3744++;
        class55[] var1 = new class55[class75.field1405];
        for (int var2 = 0; var2 < class75.field1405; var2++) {
            int var3 = class178.field3128[var2] * class125.field2106[var2];
            byte[] var4 = class157.field2690[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class205.field3614[class238.method1622(255, var4[var6])];
            }
            if (class247.field4247) {
                var1[var2] = new class40(class72.field1327, class132.field2294, class151.field2607[var2], class266.field4603[var2], class125.field2106[var2], class178.field3128[var2], var5);
            } else {
                var1[var2] = new class231(class72.field1327, class132.field2294, class151.field2607[var2], class266.field4603[var2], class125.field2106[var2], class178.field3128[var2], var5);
            }
        }
        class15.method113(37);
        if (arg0 != 4206) {
            field3730 = (class128) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 130)
    private final void method1453(int arg0) {
        field3747++;
        int var2 = -118 % ((55 - arg0) / 51);
        double var3 = Math.cos((double) ((float) this.field3732 / 4096.0F));
        this.field3736[0] = (int) (var3 * 4096.0D * Math.sin((double) ((float) this.field3742 / 4096.0F)));
        this.field3736[1] = (int) (var3 * Math.cos((double) ((float) this.field3742 / 4096.0F)) * 4096.0D);
        this.field3736[2] = (int) (Math.sin((double) ((float) this.field3732 / 4096.0F)) * 4096.0D);
        int var5 = this.field3736[1] * this.field3736[1] >> 12;
        int var6 = this.field3736[0] * this.field3736[0] >> 12;
        int var7 = this.field3736[2] * this.field3736[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field3736[2] = (this.field3736[2] << 12) / var8;
            this.field3736[0] = (this.field3736[0] << 12) / var8;
            this.field3736[1] = (this.field3736[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 159)
    public static void method1454(int arg0) {
        field3730 = null;
        field3748 = null;
        field3746 = null;
        field3734 = null;
        field3729 = null;
        if (arg0 >= -84) {
            field3729 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 244)
    public class211() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 180)
    public final void method267(int arg0) {
        field3733++;
        if (arg0 == -2718) {
            this.method1453(106);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILbg;B)V", line = 191)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            return;
        }
        field3731++;
        if (arg0 == 0) {
            this.field3745 = arg1.method1308(-55);
        } else if (arg0 == 1) {
            this.field3742 = arg1.method1308(-91);
        } else if (arg0 == 2) {
            this.field3732 = arg1.method1308(-40);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V", line = 258)
    public static final void method1455(int arg0, int arg1) {
        field3735++;
        if (arg1 == -15843 && class133.method890(false, arg0)) {
            class104.method640(-1, class200.field3508[arg0], (byte) 39);
        }
    }
}
