import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class289 extends class224 {

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    private int field4857 = 4096;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    private int field4861 = 4096;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    private int field4860 = 4096;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field4858 = 0;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "[I")
    public static int[] field4862 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Ljk;")
    public static class76 field4866 = new class76();

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "[Luf;")
    public static class168[] field4879 = new class168[100];

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "Luf;")
    private static class168 field4880 = class148.method1019(-1720, "Loaded input handler");

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "Luf;")
    public static class168 field4881 = field4880;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "Lhj;")
    public static class112 field4871;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(Z)[F", line = 8)
    public static final float[] method1985(boolean arg0) {
        float var1 = class34.method163() + class34.method165();
        field4878++;
        int var2 = class34.method168();
        class17.field183[3] = 1.0F;
        if (!arg0) {
            return (float[]) null;
        }
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var4 = (float) ((var2 & 0xFF45) >> 8) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class17.field183[2] = class156.field2470[2] * var5 * var6 * var1;
        class17.field183[0] = class156.field2470[0] * var3 * var6 * var1;
        class17.field183[1] = class156.field2470[1] * var4 * var6 * var1;
        return class17.field183;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 179)
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(Z)V", line = 45)
    public static final void method1986(boolean arg0) {
        for (class113 var1 = (class113) class215.field3499.method442(65293); var1 != null; var1 = (class113) class215.field3499.method440(3)) {
            if (var1.field1750) {
                var1.method829(28976);
            }
        }
        for (class113 var2 = (class113) class14.field146.method442(65293); var2 != null; var2 = (class113) class14.field146.method440(3)) {
            if (var2.field1750) {
                var2.method829(28976);
            }
        }
        if (!arg0) {
            field4879 = (class168[]) null;
        }
        field4872++;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 81)
    public static final void method1987(int arg0) {
        field4859++;
        class78.field1068.method36((byte) 93);
        for (int var1 = 0; var1 < 32; var1++) {
            class111.field1741[var1] = 0L;
        }
        if (arg0 <= 56) {
            field4866 = (class76) null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class275.field4632[var2] = 0L;
        }
        class60.field790 = 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I", line = 113)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            return (int[][]) ((int[][]) null);
        }
        field4874++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class187.field2961; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (var12 == var14 && var13 == var14) {
                    var7[var11] = this.field4861 * var12 >> 12;
                    var8[var11] = this.field4857 * var14 >> 12;
                    var10[var11] = this.field4860 * var13 >> 12;
                } else {
                    var7[var11] = this.field4861;
                    var8[var11] = this.field4857;
                    var10[var11] = this.field4860;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I", line = 172)
    public static int method1988(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lg;B)Lg;", line = 188)
    public static final class242 method1989(class242 arg0, byte arg1) {
        field4877++;
        if (arg0.field3977 != -1) {
            return class130.method910((byte) -120, arg0.field3977);
        }
        int var2 = arg0.field3996 >>> 16;
        if (arg1 >= -120) {
            return (class242) null;
        }
        for (class240 var3 = (class240) class26.field319.method499((byte) -99); var3 != null; var3 = (class240) class26.field319.method488(1)) {
            if (var3.field3898 == var2) {
                return class130.method910((byte) -84, (int) var3.field292);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 220)
    public static final void method1990(int arg0) {
        field4864++;
        if (arg0 != 1) {
            return;
        }
        while (true) {
            class76 var1 = class40.field500;
            class138 var2;
            synchronized (class40.field500) {
                var2 = (class138) class21.field259.method447(true);
            }
            if (var2 == null) {
                return;
            }
            var2.field2127.method1952(arg0 - 119, var2.field2129, var2.field2128, false, (int) var2.field292);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BB)Lcb;", line = 242)
    public static final class33 method1991(byte[] arg0, byte arg1) {
        field4873++;
        if (arg0 == null) {
            return null;
        } else {
            class33 var2 = new class33(arg0, class154.field2430, class254.field4341, class205.field3374, class214.field3490, class236.field3779);
            class244.method1679(-14642);
            return arg1 == -31 ? var2 : (class33) null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)Lgk;", line = 265)
    public static final class265 method1992(int arg0) {
        field4865++;
        class265 var1 = new class265(class56.field724, class206.field3381, class154.field2430[0], class254.field4341[arg0], class205.field3374[0], class214.field3490[0], class236.field3779[0], class123.field1905);
        class244.method1679(-14642);
        return var1;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(Z)V", line = 281)
    public static void method1993(boolean arg0) {
        field4880 = null;
        field4879 = null;
        field4862 = null;
        field4871 = null;
        if (!arg0) {
            field4858 = 114;
        }
        field4881 = null;
        field4866 = null;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)V", line = 296)
    public static final void method1994(byte arg0) {
        field4868++;
        int var1 = class253.field4340 * 128 + 64;
        int var2 = class262.field4452 * 128 + 64;
        int var3 = class62.method349(128, class79.field1127, var1, var2) - class92.field1425;
        if (class102.field1580 < 100) {
            if (var3 > class143.field2208) {
                class143.field2208 += (var3 - class143.field2208) * class102.field1580 / 1000 + class266.field4492;
                if (class143.field2208 > var3) {
                    class143.field2208 = var3;
                }
            }
            if (class143.field2208 > var3) {
                class143.field2208 -= (class143.field2208 - var3) * class102.field1580 / 1000 + class266.field4492;
                if (class143.field2208 < var3) {
                    class143.field2208 = var3;
                }
            }
            if (class248.field4249 < var2) {
                class248.field4249 += class266.field4492 + ((var2 - class248.field4249) * class102.field1580 / 1000);
                if (var2 < class248.field4249) {
                    class248.field4249 = var2;
                }
            }
            if (class248.field4249 > var2) {
                class248.field4249 -= (class248.field4249 - var2) * class102.field1580 / 1000 + class266.field4492;
                if (var2 > class248.field4249) {
                    class248.field4249 = var2;
                }
            }
            if (class157.field2483 < var1) {
                class157.field2483 += (var1 - class157.field2483) * class102.field1580 / 1000 + class266.field4492;
                if (var1 < class157.field2483) {
                    class157.field2483 = var1;
                }
            }
            if (class157.field2483 > var1) {
                class157.field2483 -= (class157.field2483 - var1) * class102.field1580 / 1000 + class266.field4492;
                if (var1 > class157.field2483) {
                    class157.field2483 = var1;
                }
            }
        } else {
            class157.field2483 = class253.field4340 * 128 + 64;
            class248.field4249 = class262.field4452 * 128 + 64;
            class143.field2208 = class62.method349(128, class79.field1127, class157.field2483, class248.field4249) - class92.field1425;
        }
        int var4 = class165.field2645 * 128 + 64;
        int var5 = class233.field3748 * 128 + 64;
        int var6 = class62.method349(128, class79.field1127, var4, var5) - class287.field4836;
        int var7 = var6 - class143.field2208;
        int var8 = var4 - class157.field2483;
        if (arg0 != 43) {
            method1989((class242) null, (byte) -70);
        }
        int var9 = var5 - class248.field4249;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 > class105.field1624) {
            class105.field1624 += class285.field4823 + ((var11 - class105.field1624) * class203.field3328 / 1000);
            if (class105.field1624 > var11) {
                class105.field1624 = var11;
            }
        }
        if (class105.field1624 > var11) {
            class105.field1624 -= (class105.field1624 - var11) * class203.field3328 / 1000 + class285.field4823;
            if (var11 > class105.field1624) {
                class105.field1624 = var11;
            }
        }
        int var13 = var12 - class288.field4847;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class288.field4847 += class285.field4823 + (class203.field3328 * var13 / 1000);
            class288.field4847 &= 0x7FF;
        }
        if (var13 < 0) {
            class288.field4847 -= -var13 * class203.field3328 / 1000 + class285.field4823;
            class288.field4847 &= 0x7FF;
        }
        int var14 = var12 - class288.field4847;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class288.field4847 = var12;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZLj;)V", line = 451)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field4869++;
        if (arg0 == 0) {
            this.field4861 = arg2.method1069(58);
        } else if (arg0 == 1) {
            this.field4857 = arg2.method1069(88);
        } else if (arg0 == 2) {
            this.field4860 = arg2.method1069(40);
        }
        if (arg1) {
            field4866 = (class76) null;
        }
    }
}
