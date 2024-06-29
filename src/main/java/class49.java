import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class49 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lpb;")
    private class71 field669;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lhc;")
    private class162 field672;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lti;")
    private class210 field670;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lbe;")
    public static class283 field681 = class153.method941(125, "Sprites geladen)3");

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lbe;")
    public static class283 field677 = class153.method941(127, "Ablegen");

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lfe;")
    private class229 field678;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[Lwf;")
    private class54[] field680;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lfl;", line = 7)
    public static final class213 method281(int arg0, int arg1) {
        field679++;
        class213 var2 = (class213) class68.field966.method77((long) arg0, 12);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class65.field897.method1107(26, arg0, 121);
        class213 var4 = new class213();
        if (var3 != null) {
            var4.method1413(true, new class229(var3));
        }
        class68.field966.method85(var4, (long) arg0, (byte) -106);
        if (arg1 <= 95) {
            field681 = (class283) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLih;ZLih;)Lwf;", line = 34)
    private final class54 method282(int arg0, byte arg1, class30 arg2, boolean arg3, class30 arg4) {
        field675++;
        if (this.field678 == null) {
            throw new RuntimeException();
        }
        this.field678.field3905 = arg0 * 8 + 5;
        if (this.field678.field3879.length <= this.field678.field3905) {
            throw new RuntimeException();
        } else if (this.field680[arg0] == null) {
            int var6 = this.field678.method1528(true);
            int var7 = this.field678.method1528(true);
            if (arg1 != 39) {
                method287(-12);
            }
            class54 var8 = new class54(arg0, arg2, arg4, this.field669, this.field672, var6, var7, arg3);
            this.field680[arg0] = var8;
            return var8;
        } else {
            return this.field680[arg0];
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 73)
    public final void method283(byte arg0) {
        field673++;
        if (this.field680 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field680.length; var2++) {
            if (this.field680[var2] != null) {
                this.field680[var2].method356((byte) -56);
            }
        }
        if (arg0 != -38) {
            this.field670 = (class210) null;
        }
        for (int var3 = 0; var3 < this.field680.length; var3++) {
            if (this.field680[var3] != null) {
                this.field680[var3].method344((byte) -6);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lik;IIILkg;Lik;BI)V", line = 118)
    public static final void method284(class244 arg0, int arg1, int arg2, int arg3, class69 arg4, class244 arg5, byte arg6, int arg7) {
        class104.field1769 = arg2;
        class148.field2424 = arg3;
        class291.field4947 = arg1;
        field676++;
        class203.field3467 = arg4;
        class306.field5241 = arg7;
        if (class58.field796 != null) {
            return;
        }
        class132.field2226 = true;
        if (class248.field4230 == null) {
            class248.field4230 = client.method1593(class69.field1067, 0, (byte) 69, class34.field516);
        }
        if (class76.field1330 == null) {
            class76.field1330 = class65.method416(0, (byte) 87, class18.field210, class69.field1067);
        }
        if (class236.field3960 == null) {
            class236.field3960 = class65.method416(0, (byte) 19, class226.field3804, class69.field1067);
        }
        if (class281.field4735 == null) {
            class281.field4735 = class65.method416(0, (byte) 81, class196.field3351, class69.field1067);
        }
        int var8 = class104.field1769 / 5;
        int var9 = class104.field1769 / 5 * 4;
        class311.method2112(class306.field5241, class148.field2424, class104.field1769, class291.field4947, 0, 168);
        class311.method2115(class306.field5241, class148.field2424, var8, 23, 12425273, 9135624);
        class311.method2115(class306.field5241 + var8, class148.field2424, var9, 23, 5197647, 2697513);
        arg5.method1648(class45.field611, var8 / 2 + class306.field5241, class148.field2424 + 15, 0, -1);
        if (class281.field4735 != null) {
            class281.field4735[1].method560(class306.field5241 + var8 + 2, class148.field2424 + 1);
            arg0.method1643(class294.field4969, class306.field5241 + var8 + 12, class148.field2424 - -10, 16777215, -1);
            class281.field4735[0].method560(class306.field5241 + var8 + 2, class148.field2424 + 12);
            arg0.method1643(class110.field1871, class306.field5241 + var8 + 12, class148.field2424 + 21, 16777215, -1);
        }
        if (class236.field3960 != null) {
            int var10 = class306.field5241 + var8 + 140;
            if (class194.field3317[0] == 0 && class248.field4233[0] == 0) {
                class236.field3960[2].method560(var10, class148.field2424 + 4);
            } else {
                class236.field3960[0].method560(var10, class148.field2424 + 4);
            }
            if (class194.field3317[0] == 0 && class248.field4233[0] == 1) {
                class236.field3960[3].method560(var10 + 15, class148.field2424 - -4);
            } else {
                class236.field3960[1].method560(var10 + 15, class148.field2424 + 4);
            }
            arg5.method1643(class290.field4909, var10 + 32, class148.field2424 + 17, 16777215, -1);
            int var11 = class306.field5241 + var8 + 250;
            if (class194.field3317[0] == 1 && class248.field4233[0] == 0) {
                class236.field3960[2].method560(var11, class148.field2424 + 4);
            } else {
                class236.field3960[0].method560(var11, class148.field2424 + 4);
            }
            if (class194.field3317[0] == 1 && class248.field4233[0] == 1) {
                class236.field3960[3].method560(var11 + 15, class148.field2424 + 4);
            } else {
                class236.field3960[1].method560(var11 + 15, class148.field2424 - -4);
            }
            arg5.method1643(class14.field149, var11 + 32, class148.field2424 + 17, 16777215, -1);
            int var12 = var8 + class306.field5241 + 360;
            if (class194.field3317[0] == 2 && class248.field4233[0] == 0) {
                class236.field3960[2].method560(var12, class148.field2424 + 4);
            } else {
                class236.field3960[0].method560(var12, class148.field2424 + 4);
            }
            if (class194.field3317[0] == 2 && class248.field4233[0] == 1) {
                class236.field3960[3].method560(var12 + 15, class148.field2424 + 4);
            } else {
                class236.field3960[1].method560(var12 + 15, class148.field2424 + 4);
            }
            arg5.method1643(class177.field3047, var12 + 32, class148.field2424 + 17, 16777215, -1);
            int var13 = class306.field5241 + var8 + 470;
            if (class194.field3317[0] == 3 && class248.field4233[0] == 0) {
                class236.field3960[2].method560(var13, class148.field2424 + 4);
            } else {
                class236.field3960[0].method560(var13, class148.field2424 + 4);
            }
            if (class194.field3317[0] == 3 && class248.field4233[0] == 1) {
                class236.field3960[3].method560(var13 + 15, class148.field2424 + 4);
            } else {
                class236.field3960[1].method560(var13 + 15, class148.field2424 + 4);
            }
            arg5.method1643(class68.field969, var13 + 32, class148.field2424 + 17, 16777215, -1);
        }
        class311.method2116(class104.field1769 - 58 - 10, class148.field2424 + 4, 58, 16, 0);
        client.field4012 = -1;
        if (arg6 != 80) {
            field681 = (class283) null;
        }
        if (class248.field4230 == null) {
            return;
        }
        byte var14 = 88;
        int var15 = class104.field1769 / (var14 + 1);
        byte var16 = 19;
        int var17 = (class291.field4947 - 23) / (var16 + 1);
        int var18;
        int var19;
        do {
            var18 = var17;
            var19 = var15;
            if (class55.field761 <= ((var15 - 1) * var17)) {
                var15--;
            }
            if ((var17 - 1) * var15 >= class55.field761) {
                var17--;
            }
            if (class55.field761 <= (var17 - 1) * var15) {
                var17--;
            }
        } while (var17 != var18 || var15 != var19);
        int var20 = (class291.field4947 - (var16 * var17) - 23) / (var17 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class291.field4947 - (var16 * var17) - ((var17 + -1) * var20) - 23) / 2;
        int var22 = var21 + 23;
        int var23 = (class104.field1769 - (var14 * var15)) / (var15 + 1);
        if (var23 > 5) {
            var23 = 5;
        }
        int var24 = (class104.field1769 - ((var15 - 1) * var23) - (var14 * var15)) / 2;
        int var25 = var24;
        int var26 = 0;
        for (int var27 = 0; var27 < class55.field761; var27++) {
            class65 var28 = class122.field2041[var27];
            boolean var29 = true;
            class283 var30 = class296.method2012(var28.field901, (byte) -37);
            if (var28.field901 == -1) {
                var29 = false;
                var30 = class278.field4654;
            } else if (var28.field901 > 1980) {
                var30 = class92.field1562;
                var29 = false;
            }
            if (class109.field1849 >= var25 && class163.field2700 >= var22 && class109.field1849 < (var14 + var25) && class163.field2700 < var22 + var16 && var29) {
                client.field4012 = var27;
                class248.field4230[var28.field910 ? 1 : 0].method721(class306.field5241 + var25, class148.field2424 - -var22, 128, 16777215);
            } else {
                class248.field4230[var28.field910 ? 1 : 0].method711(class306.field5241 + var25, class148.field2424 + var22);
            }
            if (class76.field1330 != null) {
                class76.field1330[var28.field893 + (var28.field910 ? class76.field1330.length / 2 : 0)].method560(class306.field5241 - (-var25 - 29), class148.field2424 + var22);
            }
            arg5.method1648(class296.method2012(var28.field903, (byte) -72), class306.field5241 + var25 + 15, class148.field2424 - (-(var16 / 2) + -var22) - -5, 0, -1);
            arg0.method1648(var30, class306.field5241 + var25 + 60, var16 / 2 + class148.field2424 + var22 - -5, 268435455, -1);
            var22 += var16 + var20;
            var26++;
            if (var26 >= var17) {
                var25 += var14 + var23;
                var26 = 0;
                var22 = var21 + 23;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BB)Lqc;", line = 339)
    public static final class4 method285(byte[] arg0, byte arg1) {
        int var2 = 98 % ((arg1 - 25) / 44);
        field674++;
        if (arg0 == null) {
            return null;
        } else {
            class4 var3 = new class4(arg0, class247.field4226, class232.field3933, class202.field3451, class201.field3440, class256.field4329);
            class88.method571(-4);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)Z", line = 356)
    public final boolean method286(byte arg0) {
        field671++;
        if (this.field678 != null) {
            return true;
        }
        if (this.field670 == null) {
            if (this.field669.method470(arg0 ^ 0xFFFFFFD4)) {
                return false;
            }
            this.field670 = this.field669.method464(0, true, 255, (byte) 0, 255);
        }
        if (this.field670.field602) {
            return false;
        }
        if (arg0 != -64) {
            method287(-118);
        }
        this.field678 = new class229(this.field670.method216(false));
        this.field680 = new class54[(this.field678.field3879.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 391)
    public static final void method287(int arg0) {
        if (arg0 != 15) {
            method288(true);
        }
        if (class47.field648 == 2) {
            if (class217.field3681 == class194.field3320 && class262.field4447 == class174.field3008) {
                class47.field648 = 0;
                class141.method889(-115, class42.field589 - 1);
            }
        } else if (class47.field647 == class194.field3320 && class269.field4537 == class262.field4447) {
            class47.field648 = 0;
            class141.method889(-12, class42.field589 - 1);
        } else {
            class174.field3008 = class269.field4537;
            class47.field648 = 2;
            class217.field3681 = class47.field647;
        }
        field683++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 439)
    public static void method288(boolean arg0) {
        if (arg0) {
            field677 = (class283) null;
        }
        field681 = null;
        field677 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILih;Lih;I)Lwf;", line = 450)
    public final class54 method289(int arg0, class30 arg1, class30 arg2, int arg3) {
        field682++;
        return arg3 == 12425273 ? this.method282(arg0, (byte) 39, arg1, true, arg2) : (class54) null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lpb;Lhc;)V", line = 466)
    public class49(class71 arg0, class162 arg1) {
        this.field669 = arg0;
        this.field672 = arg1;
        if (!this.field669.method470(20)) {
            this.field670 = this.field669.method464(0, true, 255, (byte) 0, 255);
        }
    }
}
