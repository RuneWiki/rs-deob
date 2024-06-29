import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class125 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    private int field2152 = 0;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "Ltm;")
    private class79 field2160;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2161 = "Please remove ";

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "[[S")
    public static short[][] field2163 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lte;")
    private class320 field2153;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 8)
    public static void method1042(byte arg0) {
        field2163 = (short[][]) null;
        if (arg0 == 80) {
            field2161 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lcg;III)[Lwb;", line = 26)
    public static final class171[] method1043(class49 arg0, int arg1, int arg2, int arg3) {
        field2157++;
        if (class325.method2262(arg1, (byte) 84, arg0, arg2)) {
            if (arg3 <= 24) {
                method1043((class49) null, -43, -35, -51);
            }
            return class177.method1368(81);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Lte;", line = 41)
    public final class320 method1044(boolean arg0) {
        if (arg0) {
            return (class320) null;
        } else {
            field2159++;
            this.field2152 = 0;
            return this.method1045((byte) 107);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ltm;)V", line = 249)
    public class125(class79 arg0) {
        this.field2160 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lte;", line = 68)
    public final class320 method1045(byte arg0) {
        if (arg0 <= 89) {
            return (class320) null;
        }
        field2154++;
        if (this.field2152 > 0 && this.field2160.field1285[this.field2152 - 1] != this.field2153) {
            class320 var2 = this.field2153;
            this.field2153 = var2.field5068;
            return var2;
        }
        class320 var3;
        do {
            if (this.field2152 >= this.field2160.field1293) {
                return null;
            }
            var3 = this.field2160.field1285[this.field2152++].field5068;
        } while (this.field2160.field1285[this.field2152 - 1] == var3);
        this.field2153 = var3.field5068;
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V", line = 102)
    public static final void method1046(byte arg0) {
        field2158++;
        if (class329.field5242 != null || class204.field3473 != null) {
            return;
        }
        int var1 = class284.field4509;
        if (class207.field3515) {
            if (var1 != 1) {
                int var2 = class258.field4182;
                int var3 = class284.field4508;
                if (var3 < class213.field3590 - 10 || var3 > class213.field3590 - (-class68.field1114 - 10) || var2 < class42.field621 - 10 || (class292.field4678 + class42.field621 + 10) < var2) {
                    class207.field3515 = false;
                    class33.method300(class292.field4678, 11314, class42.field621, class68.field1114, class213.field3590);
                }
            }
            if (var1 == 1) {
                int var4 = class213.field3590;
                int var5 = class42.field621;
                int var6 = class68.field1114;
                int var7 = class218.field3635;
                int var8 = class226.field3812;
                int var9 = -1;
                for (int var10 = 0; var10 < class293.field4708; var10++) {
                    if (class177.field3007) {
                        int var11 = (class293.field4708 - var10 - 1) * 15 + (var5 + 33);
                        if (var4 < var7 && var4 + var6 > var7 && var11 - 13 < var8 && var11 + 3 > var8) {
                            var9 = var10;
                        }
                    } else {
                        int var12 = var5 + ((class293.field4708 + -1 - var10) * 15) + 31;
                        if (var7 > var4 && var7 < (var4 + var6) && var8 > (var12 - 13) && var12 + 3 > var8) {
                            var9 = var10;
                        }
                    }
                }
                if (var9 != -1) {
                    class18.method181(var9, (byte) 41);
                }
                class207.field3515 = false;
                class33.method300(class292.field4678, 11314, class42.field621, class68.field1114, class213.field3590);
            }
        } else {
            if (var1 == 1 && class293.field4708 > 0) {
                short var13 = class276.field4401[class293.field4708 - 1];
                if (var13 == 44 || var13 == 2 || var13 == 29 || var13 == 10 || var13 == 23 || var13 == 25 || var13 == 59 || var13 == 35 || var13 == 36 || var13 == 7 || var13 == 12 || var13 == 1007) {
                    int var14 = class161.field2863[class293.field4708 - 1];
                    int var15 = class70.field1135[class293.field4708 - 1];
                    class137 var16 = class146.method1167(1169843632, var15);
                    class57 var17 = client.method1894(var16);
                    if (var17.method522((byte) -126) || var17.method518((byte) 73)) {
                        class265.field4277 = 0;
                        class58.field897 = false;
                        if (class329.field5242 != null) {
                            class258.method1793(class329.field5242, 0);
                        }
                        class329.field5242 = class146.method1167(1169843632, var15);
                        class261.field4217 = class218.field3635;
                        class74.field1211 = var14;
                        class225.field3785 = class226.field3812;
                        class258.method1793(class329.field5242, 0);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class38.field554 == 1 && class293.field4708 > 2 || class316.method2172(-2001, class293.field4708 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class293.field4708 > 0 || class17.field267 == 1) {
                class64.method607(-100);
            }
            if (var1 == 1 && class293.field4708 > 0 || class17.field267 == 2) {
                class79.method728(1);
            }
        }
        int var18 = 81 / ((arg0 + 21) / 40);
    }
}
