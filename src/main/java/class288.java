import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class288 extends class112 {

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field4875 = 3216;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    private int field4864 = 3216;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    private int field4879 = 4096;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "[I")
    private int[] field4873 = new int[3];

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Lwm;")
    public static class152 field4871 = class157.method1048("details", 119);

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "[I")
    public static int[] field4872 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "[I")
    public static int[] field4874 = new int[100];

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field4867 = -1;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lwm;")
    public static class152 field4878 = class157.method1048(" zuerst von Ihrer Freunde)2Liste(Q", 96);

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field4868 = 0;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field4882 = 0;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILqc;)V", line = 5)
    public static final void method1936(int arg0, class4 arg1) {
        field4870++;
        if (arg0 != 4096) {
            method1937(true);
        }
        for (class172 var2 = (class172) class17.field240.method1221((byte) 60); var2 != null; var2 = (class172) class17.field240.method1223(86)) {
            if (var2.field2742 == arg1) {
                if (var2.field2746 != null) {
                    class290.field4916.method1495(var2.field2746);
                    var2.field2746 = null;
                }
                var2.method1880(-25368);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V", line = 38)
    public final void method673(int arg0) {
        field4881++;
        this.method1938(-1);
        if (arg0 != 8) {
            this.method52(-11, -103, (class291) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILhi;)V", line = 59)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field4879 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field4864 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field4875 = arg2.method2021((byte) 74);
        }
        if (arg0 != 31164) {
            this.method52(-96, 91, (class291) null);
        }
        field4865++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 93)
    public static final void method1937(boolean arg0) {
        int var1 = class9.field118 + class85.field1176.field4162;
        field4866++;
        if (!arg0) {
            return;
        }
        int var2 = class265.field4473 + class85.field1176.field4231;
        if (class266.field4484 - var1 < -500 || class266.field4484 - var1 > 500 || (class176.field2839 - var2) < -500 || (class176.field2839 - var2) > 500) {
            class176.field2839 = var2;
            class266.field4484 = var1;
        }
        if (class176.field2839 != var2) {
            class176.field2839 += (var2 - class176.field2839) / 16;
        }
        if (class266.field4484 != var1) {
            class266.field4484 += (var1 - class266.field4484) / 16;
        }
        if (class259.field4438) {
            for (int var3 = 0; var3 < class195.field3127; var3++) {
                int var4 = class247.field4135[var3];
                if (var4 == 98) {
                    class193.field3060 = class193.field3060 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class193.field3060 = class193.field3060 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class272.field4645 = class272.field4645 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class272.field4645 = class272.field4645 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class216.field3515[98]) {
                class280.field4792 += (12 - class280.field4792) / 2;
            } else if (class216.field3515[99]) {
                class280.field4792 += (-class280.field4792 - 12) / 2;
            } else {
                class280.field4792 /= 2;
            }
            if (class216.field3515[96]) {
                class164.field2593 += (-class164.field2593 - 24) / 2;
            } else if (class216.field3515[97]) {
                class164.field2593 += (24 - class164.field2593) / 2;
            } else {
                class164.field2593 /= 2;
            }
            class272.field4645 += class164.field2593 / 2;
            class193.field3060 += class280.field4792 / 2;
        }
        class298.method2083(false);
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)V", line = 190)
    private final void method1938(int arg0) {
        field4869++;
        double var2 = Math.cos((double) ((float) this.field4875 / 4096.0F));
        this.field4873[0] = (int) (var2 * Math.sin((double) ((float) this.field4864 / 4096.0F)) * 4096.0D);
        this.field4873[1] = (int) (Math.cos((double) ((float) this.field4864 / 4096.0F)) * var2 * 4096.0D);
        this.field4873[2] = (int) (Math.sin((double) ((float) this.field4875 / 4096.0F)) * 4096.0D);
        int var4 = this.field4873[0] * this.field4873[0] >> 12;
        int var5 = this.field4873[2] * this.field4873[2] >> 12;
        int var6 = this.field4873[1] * this.field4873[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (arg0 != -1) {
            method1940(-58);
        }
        if (var7 != 0) {
            this.field4873[0] = (this.field4873[0] << 12) / var7;
            this.field4873[1] = (this.field4873[1] << 12) / var7;
            this.field4873[2] = (this.field4873[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 240)
    public class288() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V", line = 258)
    public static void method1939(byte arg0) {
        field4871 = null;
        if (arg0 != -97) {
            field4867 = 113;
        }
        field4878 = null;
        field4872 = null;
        field4874 = null;
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V", line = 271)
    public static final void method1940(int arg0) {
        class121.field1708.method1619(11300);
        int var1 = -106 % ((arg0 + 75) / 42);
        field4880++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I", line = 302)
    public final int[] method53(byte arg0, int arg1) {
        field4877++;
        if (arg0 != -3) {
            return (int[]) null;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 112);
        if (this.field1585.field4935) {
            int var4 = class162.field2571 * this.field4879 >> 12;
            int[] var5 = this.method751(arg1 - 1 & class275.field4712, (byte) 126, 0);
            int[] var6 = this.method751(arg1, (byte) 110, 0);
            int[] var7 = this.method751(arg1 + 1 & class275.field4712, (byte) 104, 0);
            for (int var8 = 0; var8 < class58.field889; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class251.field4304] - var6[var8 + 1 & class251.field4304]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class265.field4471[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field4873[0] * var14 >> 12;
                int var18 = this.field4873[1] * var15 >> 12;
                int var19 = this.field4873[2] * var16 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }
}
