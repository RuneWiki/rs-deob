import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class286 implements class279 {

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Luk;")
    private class100 field4532 = new class100(256);

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lhc;")
    private class235 field4530;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lhc;")
    private class235 field4523;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lnf;")
    private class159[] field4518;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Lec;")
    public static class24 field4529 = new class24();

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Luc;")
    public static class39 field4531 = new class39(512);

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4534 = "Attack";

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lhc;")
    public static class235 field4533;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Lnh;")
    public static class55 field4535;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBII)V")
    public static final void method1915(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 41) {
            method1922(true, -101);
        }
        if (arg4 >= class223.field3423 && class148.field2338 >= arg4) {
            int var5 = class219.method1470(class90.field1568, arg1, -1, class266.field4247);
            int var6 = class219.method1470(class90.field1568, arg0, -1, class266.field4247);
            class125.method872(true, arg4, arg3, var5, var6);
        }
        field4516++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lak;")
    public static final class140 method1916(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        return var3 == null || var3.field144 == null ? null : var3.field144;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(II)V")
    public static final void method1917(int arg0, int arg1) {
        if (arg1 != -1) {
            field4520 = 115;
        }
        field4524++;
        class41 var2 = class221.method1492((byte) -42, arg0, 5);
        var2.method303(23981);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(DB)V")
    public static final void method1918(double arg0, byte arg1) {
        field4522++;
        if (arg1 < 55 || class52.field762 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class56.field928[var3] = var4 > 255 ? 255 : var4;
        }
        class52.field762 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)Lnf;")
    public final class159 method1879(int arg0, int arg1) {
        field4519++;
        return arg0 == 256 ? this.field4518[arg1] : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IFZBII)[I")
    public final int[] method1881(int arg0, float arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field4527++;
        return arg3 > -29 ? null : this.method1263(arg5, 42).method873(arg0, (double) arg1, this.field4518[arg5].field2469, this, arg2, this.field4523, -16005, arg4);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(II)Z")
    public static final boolean method1919(int arg0, int arg1) {
        field4521++;
        class284 var2 = class112.method797(arg1, arg0);
        if (var2 == null) {
            return false;
        } else if (class32.field468 == 1 || class32.field468 == 2 || class212.field3292 == 2) {
            class173.field2719 = var2.field4500;
            class152.field2385 = var2.field4508;
            if (class212.field3292 != 0) {
                class88.field1539 = class152.field2385 + 40000;
                class184.field2845 = class152.field2385 + 50000;
                class177.field2773 = class88.field1539;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class212.field3292 != 0) {
                var4 = ":" + (var2.field4508 + 7000);
            }
            if (class84.field1416 != null) {
                var3 = "/p=" + class84.field1416;
            }
            String var5 = "http://" + var2.field4500 + var4 + "/l=" + class177.field2770 + "/a=" + class232.field3696 + var3 + "/j" + (class174.field2741 ? "1" : "0") + ",o" + (class151.field2373 ? "1" : "0") + ",a2,m" + (class95.field1613 ? "1" : "0");
            try {
                class61.field1053.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lai;B)Lmb;")
    public static final class161 method1920(class88 arg0, byte arg1) {
        field4517++;
        if (arg1 < 61) {
            method1915(-51, -12, (byte) 29, 125, 20);
        }
        return new class161(arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method671(105), arg0.method633(53));
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method1921(byte arg0) {
        field4533 = null;
        field4535 = null;
        field4531 = null;
        field4534 = null;
        field4529 = null;
        if (arg0 != 36) {
            field4520 = 65;
        }
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(II)Lgf;")
    public class126 method1263(int arg0, int arg1) {
        field4526++;
        if (arg1 <= 7) {
            method1916(-66, -75, -16);
        }
        class18 var3 = this.field4532.method728((long) arg0, (byte) -82);
        if (var3 != null) {
            return (class126) var3;
        }
        byte[] var4 = this.field4530.method1601(17055, arg0);
        if (var4 == null) {
            return null;
        } else {
            class126 var5 = new class126(new class88(var4));
            this.field4532.method737((long) arg0, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)I")
    public static final int method1922(boolean arg0, int arg1) {
        if (arg0) {
            field4529 = null;
        }
        field4525++;
        return (arg1 & 0x3FF34) >> 11;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Z")
    public final boolean method1880(int arg0, int arg1) {
        field4515++;
        class126 var3 = this.method1263(arg1, 66);
        if (arg0 != -257) {
            field4534 = null;
        }
        return var3 != null && var3.method876(this, this.field4523, arg0 + 199);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lhc;Lhc;Lhc;)V")
    public class286(class235 arg0, class235 arg1, class235 arg2) {
        this.field4530 = arg1;
        this.field4523 = arg2;
        class88 var4 = new class88(arg0.method1590(0, (byte) -25, 0));
        int var5 = var4.method645(11596);
        this.field4518 = new class159[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method633(104) == 1) {
                this.field4518[var6] = new class159();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field4518[var7] != null) {
                this.field4518[var7].field2464 = var4.method633(96) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field4518[var8] != null) {
                this.field4518[var8].field2474 = var4.method633(55) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4518[var9] != null) {
                this.field4518[var9].field2472 = var4.method633(104) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field4518[var10] != null) {
                var4.method633(63);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field4518[var11] != null) {
                var4.method656(-252);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field4518[var12] != null) {
                var4.method656(-252);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field4518[var13] != null) {
                var4.method656(-252);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field4518[var14] != null) {
                var4.method656(-252);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field4518[var15] != null) {
                this.field4518[var15].field2465 = (short) var4.method645(11596);
            }
        }
        if (var4.field1471.length > var4.field1535) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field4518[var16] != null) {
                    var4.method656(-252);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field4518[var17] != null) {
                    var4.method656(-252);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field4518[var18] != null) {
                    var4.method633(109);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field4518[var19] != null) {
                    this.field4518[var19].field2469 = var4.method633(88) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field4518[var20] != null) {
                    var4.method656(-252);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field4518[var21] != null) {
                    var4.method633(85);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field4518[var22] != null) {
                    var4.method633(49);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field4518[var23] != null) {
                    var4.method633(89);
                }
            }
        }
    }
}
