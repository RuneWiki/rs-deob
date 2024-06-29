import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class218 extends class71 {

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "[I")
    private int[] field3858 = new int[3];

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    private int field3863 = 4096;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    private int field3864 = 3216;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    private int field3862 = 3216;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Lud;")
    public static class279 field3850 = class130.method1024("Konfig geladen)3", 255);

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Lgf;")
    public static class8 field3855 = null;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Lud;")
    private static class279 field3861 = class130.method1024("Ok", 255);

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "Lud;")
    public static class279 field3847 = field3861;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "[I")
    public static int[] field3853 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Lcc;")
    public static class246 field3860 = new class246(0, -1);

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Lud;")
    public static class279 field3867 = class130.method1024(":duelfriend:", 255);

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "F")
    public static float field3865;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Lud;", line = 8)
    public static final class279 method1594(int arg0, int arg1) {
        field3854++;
        return arg0 >= arg1 ? class190.field3421 : class191.method1447(5, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 20)
    public final void method627(int arg0) {
        if (arg0 != 7) {
            this.method1599(9);
        }
        field3866++;
        this.method1599(74);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V", line = 43)
    public static final void method1595(byte arg0) {
        class222.field3928.method1334((byte) -25);
        if (arg0 != 26) {
            method1598(-85, -64, false);
        }
        field3849++;
        class173.field3125.method1334((byte) -25);
        class301.field5356.method1334((byte) -25);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLvh;)V", line = 66)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            this.field3863 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field3864 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field3862 = arg2.method468(28214);
        }
        if (!arg1) {
            field3855 = (class8) null;
        }
        field3852++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V", line = 102)
    public static void method1596(boolean arg0) {
        if (arg0) {
            method1595((byte) -4);
        }
        field3855 = null;
        field3847 = null;
        field3867 = null;
        field3861 = null;
        field3860 = null;
        field3853 = null;
        field3850 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V", line = 129)
    public static final void method1597(int arg0, int arg1, byte arg2) {
        if (class268.field4808 > 0) {
            class214.method1570(class268.field4808, (byte) 4);
            class268.field4808 = 0;
        }
        short var3 = 256;
        field3848++;
        int var4 = class146.field2639 * arg1;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class236.field4116[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class59.field1238[var5++];
                int var11 = class146.field2637[var4++ + arg0];
                if (var10 == 0) {
                    class83.field1584.field1323[var6++] = var11;
                } else {
                    int var12 = 238 - var10;
                    int var13 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class178.field3239[var10];
                    class83.field1584.field1323[var6++] = class52.method442(class52.method442(var14, 16711935) * var13 + (class52.method442(var11, 16711935) * var12), -16711936) + class52.method442(16711680, var12 * class52.method442(var11, 65280) + var13 * class52.method442(65280, var14)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class83.field1584.field1323[var6++] = class146.field2637[var4++ + arg0];
            }
            var4 += class146.field2639 - 128;
        }
        int var16 = -113 / ((arg2 - 60) / 61);
        if (class97.field1824) {
            class256.method1832(class83.field1584.field1323, arg0, arg1, class83.field1584.field1377, class83.field1584.field1375);
        } else {
            class83.field1584.method567(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 225)
    public class218() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)[I", line = 241)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = class59.field1251 * this.field3863 >> 12;
            int[] var5 = this.method624(arg0 - 1 & class262.field4688, -3, 0);
            int[] var6 = this.method624(arg0, -3, 0);
            int[] var7 = this.method624(arg0 + 1 & class262.field4688, -3, 0);
            for (int var8 = 0; var8 < class215.field3787; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class309.field5478] - var6[var8 + 1 & class309.field5478]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class84.field1603[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field3858[0] * var14 >> 12;
                int var18 = this.field3858[1] * var15 >> 12;
                int var19 = this.field3858[2] * var16 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        field3851++;
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZ)I", line = 314)
    public static final int method1598(int arg0, int arg1, boolean arg2) {
        field3857++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        if (arg2) {
            method1597(43, -88, (byte) -115);
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 333)
    private final void method1599(int arg0) {
        field3859++;
        double var2 = Math.cos((double) ((float) this.field3862 / 4096.0F));
        this.field3858[0] = (int) (Math.sin((double) ((float) this.field3864 / 4096.0F)) * var2 * 4096.0D);
        this.field3858[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field3864 / 4096.0F)));
        this.field3858[2] = (int) (Math.sin((double) ((float) this.field3862 / 4096.0F)) * 4096.0D);
        int var4 = 98 / ((arg0 + 32) / 56);
        int var5 = this.field3858[0] * this.field3858[0] >> 12;
        int var6 = this.field3858[1] * this.field3858[1] >> 12;
        int var7 = this.field3858[2] * this.field3858[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field3858[1] = (this.field3858[1] << 12) / var8;
            this.field3858[2] = (this.field3858[2] << 12) / var8;
            this.field3858[0] = (this.field3858[0] << 12) / var8;
        }
    }
}
