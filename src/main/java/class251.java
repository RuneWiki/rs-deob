import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class251 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lch;")
    private class196 field3742 = new class196();

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field3750 = 0;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3749 = "flash1:";

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lch;")
    private class196 field3745;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Llm;")
    public static class210 field3751;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I", line = 11)
    public final int method1691(byte arg0) {
        if (arg0 >= -107) {
            return -24;
        }
        field3739++;
        class196 var2 = this.field3742.field2948;
        int var3 = 0;
        while (this.field3742 != var2) {
            var3++;
            var2 = var2.field2948;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 37)
    public final void method1692(byte arg0) {
        while (true) {
            class196 var2 = this.field3742.field2948;
            if (this.field3742 == var2) {
                field3741++;
                this.field3745 = null;
                if (arg0 <= 18) {
                    field3747 = -127;
                }
                return;
            }
            var2.method1353(29792);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V", line = 57)
    public static final void method1693(int arg0, int arg1) {
        field3738++;
        if (!class72.method463(-125, arg0) || arg1 != 23440) {
            return;
        }
        class329[] var2 = class278.field4231[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class329 var4 = var2[var3];
            if (var4 != null) {
                var4.field5059 = 0;
                var4.field4970 = 1;
                var4.field4986 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 363)
    public class251() {
        this.field3742.field2948 = this.field3742;
        this.field3742.field2956 = this.field3742;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V", line = 100)
    public static final void method1694(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3752++;
        if (class221.field3369 < 100) {
            class94.method668(64);
        }
        if (class117.field1817) {
            class308.method2123(arg0, arg1, arg0 + arg4, arg1 + arg2);
        } else {
            class46.method301(arg0, arg1, arg0 + arg4, arg1 + arg2);
        }
        if (class221.field3369 < 100) {
            int var5 = arg4 / 2 + arg0;
            byte var6 = 20;
            int var7 = arg1 - (var6 + 18 - (arg2 / 2));
            if (class117.field1817) {
                class308.method2126(arg0, arg1, arg4, arg2, 0);
                class308.method2128(var5 - 152, var7, 304, 34, 9179409);
                class308.method2128(var5 - 151, var7 + 1, 302, 32, 0);
                class308.method2126(var5 - 150, var7 - -2, class221.field3369 * 3, 30, 9179409);
                class308.method2126(class221.field3369 * 3 + var5 - 150, var7 - -2, 300 - (class221.field3369 * 3), 30, 0);
            } else {
                class46.method312(arg0, arg1, arg4, arg2, 0);
                class46.method318(var5 - 152, var7, 304, 34, 9179409);
                class46.method318(var5 - 151, var7 - -1, 302, 32, 0);
                class46.method312(var5 - 150, var7 - -2, class221.field3369 * 3, 30, 9179409);
                class46.method312(class221.field3369 * 3 + var5 - 150, var7 + 2, 300 - (class221.field3369 * 3), 30, 0);
            }
            class217.field3299.method627(class35.field431, var5, var7 + var6, 16777215, -1);
            return;
        }
        class245.field3658 = class233.field3504 - (int) ((float) arg4 / class75.field980);
        class98.field1531 = (int) ((float) (arg2 * 2) / class75.field980);
        class235.field3536 = (int) ((float) (arg4 * 2) / class75.field980);
        class88.field1306 = class203.field3037 - (int) ((float) arg2 / class75.field980);
        if (arg3 < 45) {
            method1694(18, 28, -33, -68, -36);
        }
        int var8 = class203.field3037 - ((int) ((float) arg2 / class75.field980));
        int var9 = class233.field3504 - ((int) ((float) arg4 / class75.field980));
        int var10 = (int) ((float) arg4 / class75.field980) + class233.field3504;
        int var11 = (int) ((float) arg2 / class75.field980) + class203.field3037;
        if (class117.field1817) {
            if (class293.field4492 == null || class293.field4492.field3533 != arg4 || class293.field4492.field3537 != arg2) {
                class293.field4492 = null;
                class293.field4492 = new class127(arg4, arg2);
            }
            class46.method321(class293.field4492.field1983, arg4, arg2);
            class203.method1388(var10, var11, arg4, false, var9, 0, 0, var8, arg2);
            class170.method1189(var8, var9, var10, 0, arg2, var11, arg4, 29250, 0);
            class64.method422(17062, var8, 0, arg4, var10, var9, var11, 0, arg2);
            class293.field4492.method927();
            class308.method2120(class293.field4492.field1983, arg0, arg1, arg4, arg2);
            class46.field577 = null;
        } else {
            class203.method1388(var10, var11, arg0 + arg4, false, var9, arg1, arg0, var8, arg1 + arg2);
            class170.method1189(var8, var9, var10, arg1, arg1 + arg2, var11, arg0 + arg4, 29250, arg0);
            class64.method422(17062, var8, arg1, arg0 + arg4, var10, var9, var11, arg0, arg1 + arg2);
        }
        if (class155.field2329 > 0) {
            class142.field2141--;
            if (class142.field2141 == 0) {
                class142.field2141 = 20;
                class155.field2329--;
            }
        }
        if (!class203.field3050) {
            return;
        }
        int var12 = 16776960;
        int var13 = arg4 + arg0 - 5;
        int var14 = arg1 + arg2 - 8;
        class84.field1247.method617("Fps:" + class28.field378, var13, var14, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var12 = 16711680;
        }
        var14 -= 15;
        class84.field1247.method617("Mem:" + var16 + "k", var13, var14, var12, -1);
        var14 -= 15;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Lch;", line = 222)
    public final class196 method1695(int arg0) {
        if (arg0 != -12509) {
            field3747 = 13;
        }
        field3737++;
        class196 var2 = this.field3745;
        if (this.field3742 == var2) {
            this.field3745 = null;
            return null;
        } else {
            this.field3745 = var2.field2948;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Lch;", line = 249)
    public final class196 method1696(int arg0) {
        field3740++;
        class196 var2 = this.field3742.field2948;
        if (this.field3742 == var2) {
            this.field3745 = null;
            return null;
        } else {
            this.field3745 = var2.field2948;
            int var3 = 122 % ((-arg0) / 61);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILch;)V", line = 269)
    public final void method1697(int arg0, class196 arg1) {
        field3748++;
        if (arg1.field2956 != null) {
            arg1.method1353(29792);
        }
        arg1.field2956 = this.field3742.field2956;
        if (arg0 != 34) {
            field3747 = 104;
        }
        arg1.field2948 = this.field3742;
        arg1.field2956.field2948 = arg1;
        arg1.field2948.field2956 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Lch;", line = 288)
    public final class196 method1698(byte arg0) {
        field3744++;
        class196 var2 = this.field3742.field2948;
        if (arg0 <= 7) {
            this.field3742 = (class196) null;
        }
        if (this.field3742 == var2) {
            return null;
        } else {
            var2.method1353(29792);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIJI)Z", line = 308)
    public static final boolean method1699(int arg0, int arg1, long arg2, int arg3) {
        field3743++;
        int var5 = (int) arg2 >> 20 & 0x3;
        int var6 = (int) arg2 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class22 var8 = class284.method1980(var7, (byte) 81);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field330;
                var9 = var8.field293;
            } else {
                var9 = var8.field330;
                var10 = var8.field293;
            }
            int var11 = var8.field281;
            if (var5 != 0) {
                var11 = (var11 >> 4 - var5) + (var11 << var5 & 0xF);
            }
            class55.method366(false, class114.field1750.field1541[0], var9, 2, 0, class114.field1750.field1516[0], arg0, var10, arg1, 0, var11, true);
        } else {
            class55.method366(false, class114.field1750.field1541[0], 0, 2, var5, class114.field1750.field1516[0], arg0, 0, arg1, var6 + 1, 0, true);
        }
        if (arg3 != 300) {
            method1700(-93);
        }
        class21.field261 = class207.field3140;
        class213.field3233 = 2;
        class55.field688 = class28.field387;
        class292.field4454 = 0;
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V", line = 353)
    public static void method1700(int arg0) {
        field3749 = null;
        field3751 = null;
        if (arg0 <= 4) {
            method1693(57, 14);
        }
    }
}
