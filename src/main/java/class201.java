import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class201 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private int field3189 = -1;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    private int field3190 = 0;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lad;")
    private class128 field3202 = new class128();

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Z")
    public boolean field3203 = false;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[[[I")
    private int[][][] field3184;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[Lhk;")
    private class305[] field3185;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3183 = "Examine";

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
    public static boolean field3197 = false;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field3195;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lhb;I)V", line = 5)
    public static final void method1451(class35 arg0, int arg1) {
        field3201++;
        if ((arg0.field437.length - arg0.field455) < 1) {
            return;
        }
        int var2 = 41 / ((-arg1 - 19) / 59);
        int var3 = arg0.method273(65280);
        if (var3 < 0 || var3 > 11) {
            return;
        }
        byte var4;
        if (var3 == 11) {
            var4 = 33;
        } else if (var3 == 10) {
            var4 = 32;
        } else if (var3 == 9) {
            var4 = 31;
        } else if (var3 == 8) {
            var4 = 30;
        } else if (var3 == 7) {
            var4 = 29;
        } else if (var3 == 6) {
            var4 = 28;
        } else if (var3 == 5) {
            var4 = 28;
        } else if (var3 == 4) {
            var4 = 24;
        } else if (var3 == 3) {
            var4 = 23;
        } else if (var3 == 2) {
            var4 = 22;
        } else if (var3 == 1) {
            var4 = 23;
        } else {
            var4 = 19;
        }
        if (arg0.field437.length - arg0.field455 < var4) {
            return;
        }
        class317.field4926 = arg0.method273(65280);
        if (class317.field4926 < 1) {
            class317.field4926 = 1;
        } else if (class317.field4926 > 4) {
            class317.field4926 = 4;
        }
        class242.method1672((byte) 63, arg0.method273(65280) == 1);
        class69.field1019 = arg0.method273(65280) == 1;
        class11.field127 = arg0.method273(65280) == 1;
        class325.field5062 = arg0.method273(65280) == 1;
        class154.field2327 = arg0.method273(65280) == 1;
        class38.field581 = arg0.method273(65280) == 1;
        class101.field1512 = arg0.method273(65280) == 1;
        class228.field3534 = arg0.method273(65280) == 1;
        class143.field2212 = arg0.method273(65280);
        if (class143.field2212 > 2) {
            class143.field2212 = 2;
        }
        if (var3 >= 2) {
            class175.field2589 = arg0.method273(65280) == 1;
        } else {
            class175.field2589 = arg0.method273(65280) == 1;
            arg0.method273(65280);
        }
        class289.field4541 = arg0.method273(65280) == 1;
        class319.field4971 = arg0.method273(65280) == 1;
        class204.field3246 = arg0.method273(65280);
        if (class204.field3246 > 2) {
            class204.field3246 = 2;
        }
        class117.field1834 = class204.field3246;
        class213.field3387 = arg0.method273(65280) == 1;
        class261.field3874 = arg0.method273(65280);
        if (class261.field3874 > 127) {
            class261.field3874 = 127;
        }
        class170.field2536 = arg0.method273(65280);
        class238.field3618 = arg0.method273(65280);
        if (class238.field3618 > 127) {
            class238.field3618 = 127;
        }
        if (var3 >= 1) {
            class100.field1498 = arg0.method300(-1394191632);
            class44.field684 = arg0.method300(-1394191632);
        }
        if (var3 >= 3 && var3 < 6) {
            arg0.method273(65280);
        }
        if (var3 >= 4) {
            int var5 = arg0.method273(65280);
            if (class228.field3523 < 96) {
                var5 = 0;
            }
            class254.method1779(var5);
        }
        if (var3 >= 5) {
            class252.field3765 = arg0.method299(-102);
        }
        if (var3 >= 6) {
            class6.field63 = arg0.method273(65280);
        }
        if (var3 >= 7) {
            class235.field3605 = arg0.method273(65280) == 1;
        }
        if (var3 >= 8) {
            class304.field4766 = arg0.method273(65280) == 1;
        }
        if (var3 >= 9) {
            class107.field1647 = arg0.method273(65280);
        }
        if (var3 >= 10) {
            class37.field545 = arg0.method273(65280) != 0;
        }
        if (var3 >= 11) {
            class287.field4432 = arg0.method273(65280) != 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z", line = 174)
    public static final boolean method1452(int arg0) {
        if (arg0 != -8) {
            return true;
        }
        field3191++;
        if (class162.field2408) {
            try {
                return !(Boolean) class226.method1607(class301.field4715.field285, true, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 193)
    public final void method1453(byte arg0) {
        field3194++;
        if (arg0 < 17) {
            this.method1455(-89);
        }
        for (int var2 = 0; var2 < this.field3200; var2++) {
            this.field3184[var2][0] = null;
            this.field3184[var2][1] = null;
            this.field3184[var2][2] = null;
            this.field3184[var2] = (int[][]) null;
        }
        this.field3185 = null;
        this.field3184 = (int[][][]) null;
        this.field3202.method980(1);
        this.field3202 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(CI)Z", line = 219)
    public static final boolean method1454(char arg0, int arg1) {
        if (arg1 >= -57) {
            field3183 = (String) null;
        }
        field3186++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)[[[I", line = 231)
    public final int[][][] method1455(int arg0) {
        field3187++;
        if (arg0 != 26824) {
            method1457((byte) -124, true, 61, -8, true, -39, -5);
        }
        if (this.field3200 != this.field3196) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3200; var2++) {
            this.field3185[var2] = class13.field150;
        }
        return this.field3184;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)[[I", line = 255)
    public final int[][] method1456(int arg0, byte arg1) {
        if (arg1 != -113) {
            method1459((byte) 38);
        }
        field3188++;
        if (this.field3200 == this.field3196) {
            this.field3203 = this.field3185[arg0] == null;
            this.field3185[arg0] = class13.field150;
            return this.field3184[arg0];
        } else if (this.field3200 == 1) {
            this.field3203 = this.field3189 != arg0;
            this.field3189 = arg0;
            return this.field3184[0];
        } else {
            class305 var3 = this.field3185[arg0];
            if (var3 == null) {
                this.field3203 = true;
                if (this.field3200 <= this.field3190) {
                    class305 var4 = (class305) this.field3202.method974(0);
                    var3 = new class305(arg0, var4.field4775);
                    this.field3185[var4.field4781] = null;
                    var4.method1554((byte) -57);
                } else {
                    var3 = new class305(arg0, this.field3190);
                    this.field3190++;
                }
                this.field3185[arg0] = var3;
            } else {
                this.field3203 = false;
            }
            this.field3202.method984(var3, (byte) 127);
            return this.field3184[var3.field4775];
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZIIZII)V", line = 321)
    public static final void method1457(byte arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3199++;
        if (arg1) {
            class36.method306();
        }
        if (class63.field951 != null && (arg5 != 3 || class100.field1498 != arg6 || class44.field684 != arg2)) {
            class173.method1263(100, class301.field4715, class63.field951);
            class63.field951 = null;
        }
        if (arg5 == 3 && class63.field951 == null) {
            class63.field951 = class93.method735(-126, 0, arg6, class301.field4715, arg2, 0);
            if (class63.field951 != null) {
                class44.field684 = arg2;
                class100.field1498 = arg6;
                class128.method987(0, class301.field4715);
            }
        }
        if (arg5 == 3 && class63.field951 == null) {
            method1457((byte) -91, true, -1, arg3, true, class6.field63, -1);
            return;
        }
        Container var7;
        if (class63.field951 != null) {
            var7 = class63.field951;
        } else if (class184.field2857 == null) {
            var7 = class301.field4715.field285;
        } else {
            var7 = class184.field2857;
        }
        class99.field1461 = var7.getSize().width;
        class255.field3814 = var7.getSize().height;
        if (class184.field2857 == var7) {
            Insets var8 = class184.field2857.getInsets();
            class99.field1461 -= var8.right + var8.left;
            class255.field3814 -= var8.top + var8.bottom;
        }
        if (arg5 >= 2) {
            class125.field1972 = class99.field1461;
            class210.field3314 = class255.field3814;
            class298.field4673 = 0;
            class207.field3267 = 0;
        } else {
            class298.field4673 = (class99.field1461 - 765) / 2;
            class210.field3314 = 503;
            class207.field3267 = 0;
            class125.field1972 = 765;
        }
        if (arg4) {
            class76.method615(118, class171.field2548);
            class119.method922((byte) 86, class171.field2548);
            if (class95.field1392 != null) {
                class95.field1392.method989(0, class171.field2548);
            }
            class99.field1457.method1390(-14426);
            class292.method2058(17, class171.field2548);
            class262.method1812((byte) 106, class171.field2548);
            if (class95.field1392 != null) {
                class95.field1392.method990(class171.field2548, 99);
            }
        } else {
            if (class36.field534) {
                class36.method317(class125.field1972, class210.field3314);
            }
            class171.field2548.setSize(class125.field1972, class210.field3314);
            if (class184.field2857 == var7) {
                Insets var9 = class184.field2857.getInsets();
                class171.field2548.setLocation(class298.field4673 + var9.left, var9.top - -class207.field3267);
            } else {
                class171.field2548.setLocation(class298.field4673, class207.field3267);
            }
        }
        if (arg0 >= -24) {
            return;
        }
        if (arg5 == 0 && arg3 > 0) {
            class36.method328(class171.field2548);
        }
        if (arg1 && arg5 > 0) {
            class171.field2548.setIgnoreRepaint(true);
            if (!class34.field424) {
                class198.method1442();
                class128.field2023 = null;
                class128.field2023 = class253.method1757(class125.field1972, (byte) -34, class210.field3314, class171.field2548);
                class168.method1231();
                if (class305.field4771 == 5) {
                    class51.method466(true, (byte) 10, class64.field956);
                } else {
                    class47.method421(class107.field1646, false, (byte) 47);
                }
                try {
                    Graphics var10 = class171.field2548.getGraphics();
                    class128.field2023.method623(0, var10, 0, -95);
                } catch (Exception var14) {
                }
                class130.method991(-116);
                if (arg3 == 0) {
                    class128.field2023 = class253.method1757(765, (byte) -34, 503, class171.field2548);
                } else {
                    class128.field2023 = null;
                }
                class233 var12 = class301.field4715.method167(class99.field1457.getClass(), 4567);
                while (var12.field3585 == 0) {
                    class97.method768(100L, 70);
                }
                if (var12.field3585 == 1) {
                    class34.field424 = true;
                }
            }
            if (class34.field424) {
                class36.method312(class171.field2548, class117.field1834 * 2);
            }
        }
        if (!class36.field534 && arg5 > 0) {
            method1457((byte) -100, true, -1, arg3, true, 0, -1);
            return;
        }
        if (arg5 > 0 && arg3 == 0) {
            class311.field4844.setPriority(5);
            class128.field2023 = null;
            class85.method699();
            ((class262) class56.field829).method1811(200, 115);
            if (class175.field2589) {
                class56.method508(0.7F);
            }
            class106.method824(-105);
        } else if (arg5 == 0 && arg3 > 0) {
            class311.field4844.setPriority(1);
            class128.field2023 = class253.method1757(765, (byte) -34, 503, class171.field2548);
            class85.method702();
            class254.method1775();
            ((class262) class56.field829).method1811(20, 122);
            if (class175.field2589) {
                if (class317.field4926 == 1) {
                    class56.method508(0.9F);
                }
                if (class317.field4926 == 2) {
                    class56.method508(0.8F);
                }
                if (class317.field4926 == 3) {
                    class56.method508(0.7F);
                }
                if (class317.field4926 == 4) {
                    class56.method508(0.6F);
                }
            }
            class123.method940();
            class106.method824(-105);
        }
        class318.field4960 = !class252.method1753(-8090);
        if (arg1) {
            class267.method1849(false);
        }
        if (arg5 < 2) {
            class106.field1634 = false;
        } else {
            class106.field1634 = true;
        }
        if (class319.field4972 != -1) {
            class324.method2227(true, true);
        }
        if (class297.field4661 != null && (class305.field4771 == 30 || class305.field4771 == 25)) {
            class290.method2051(71);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class40.field597[var13] = true;
        }
        class188.field2994 = true;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 561)
    public static void method1458(byte arg0) {
        field3183 = null;
        field3195 = null;
        if (arg0 <= 90) {
            field3195 = (Font) null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 573)
    public static final void method1459(byte arg0) {
        class297.field4655.method1428(10935);
        field3182++;
        if (arg0 != 30) {
            method1458((byte) 104);
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(III)V", line = 628)
    public class201(int arg0, int arg1, int arg2) {
        this.field3200 = arg0;
        this.field3184 = new int[this.field3200][3][arg2];
        this.field3196 = arg1;
        this.field3185 = new class305[this.field3196];
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 607)
    public static final void method1460(int arg0, int arg1) {
        if (arg1 != -2) {
            method1454((char) 65452, 96);
        }
        class314.field4862.method1429((byte) 127, arg0);
        field3198++;
    }
}
