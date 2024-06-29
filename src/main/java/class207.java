import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class207 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    public static boolean field3146 = false;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Lui;")
    public static class98 field3155 = new class98(30);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[Lhc;")
    public static class62[] field3153;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method1404(byte arg0) {
        field3144++;
        if (arg0 == -20) {
            return (this.field3147 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z", line = 19)
    public final boolean method1405(byte arg0) {
        if (arg0 > -46) {
            return true;
        } else {
            field3152++;
            return (this.field3147 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILak;Lak;)V", line = 32)
    public static final void method1406(int arg0, class159 arg1, class159 arg2) {
        if (arg0 != -10090) {
            return;
        }
        if (arg1.field2545 != null) {
            arg1.method1131(8);
        }
        arg1.field2545 = arg2.field2545;
        field3148++;
        arg1.field2551 = arg2;
        arg1.field2545.field2551 = arg1;
        arg1.field2551.field2545 = arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 52)
    public static final void method1407(boolean arg0) {
        if (arg0) {
            method1407(false);
        }
        field3154++;
        if (class185.field2876 != null || class52.field788 != null || class214.field3276 > 0) {
            return;
        }
        int var1 = class161.field2569;
        if (!class286.field4681) {
            if (var1 == 1 && class117.field1701 > 0) {
                short var13 = class300.field4949[class117.field1701 - 1];
                if (var13 == 18 || var13 == 26 || var13 == 13 || var13 == 41 || var13 == 39 || var13 == 7 || var13 == 34 || var13 == 17 || var13 == 24 || var13 == 22 || var13 == 46 || var13 == 1002) {
                    int var14 = class100.field1450[class117.field1701 - 1];
                    int var15 = class86.field1243[class117.field1701 - 1];
                    class264 var16 = class94.method629(5386, var15);
                    class77 var17 = client.method898(var16);
                    if (var17.method519(-624) || var17.method523((byte) -113)) {
                        class258.field4097 = false;
                        class325.field5325 = 0;
                        if (class185.field2876 != null) {
                            class218.method1472((byte) 106, class185.field2876);
                        }
                        class185.field2876 = class94.method629(5386, var15);
                        class248.field3924 = class69.field1074;
                        class169.field2648 = var14;
                        class305.field4995 = class241.field3777;
                        class218.method1472((byte) 98, class185.field2876);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class40.field604 == 1 && class117.field1701 > 2 || class198.method1349((byte) -102, class117.field1701 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class117.field1701 > 0 || class148.field2396 == 1) {
                class329.method2348((byte) -117);
            }
            if (var1 == 1 && class117.field1701 > 0 || class148.field2396 == 2) {
                class285.method2015(-3);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class305.field4988;
            int var3 = class130.field1982;
            if (var2 < class53.field800 - 10 || var2 > (class53.field800 + class235.field3732 + 10) || var3 < (class2.field7 - 10) || var3 > (class2.field7 + class265.field4362 + 10)) {
                class286.field4681 = false;
                class279.method1986(class2.field7, class265.field4362, class53.field800, class235.field3732, 27960);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class53.field800;
        int var5 = class69.field1074;
        int var6 = class235.field3732;
        int var7 = -1;
        int var8 = class2.field7;
        int var9 = class241.field3777;
        for (int var10 = 0; var10 < class117.field1701; var10++) {
            if (class98.field1408) {
                int var12 = (class117.field1701 - var10 - 1) * 15 + var8 + 33;
                if (var9 > var4 && var9 < (var4 + var6) && var5 > (var12 - 13) && (var12 + 3) > var5) {
                    var7 = var10;
                }
            } else {
                int var11 = var8 + ((class117.field1701 + -1 + -var10) * 15) + 31;
                if (var9 > var4 && var4 + var6 > var9 && var5 > var11 - 13 && var5 < (var11 + 3)) {
                    var7 = var10;
                }
            }
        }
        if (var7 != -1) {
            class96.method637((byte) 127, var7);
        }
        class286.field4681 = false;
        class279.method1986(class2.field7, class265.field4362, class53.field800, class235.field3732, 27960);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Z", line = 199)
    public final boolean method1408(int arg0) {
        field3143++;
        if (arg0 != -20762) {
            method1407(false);
        }
        return (this.field3147 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Z", line = 211)
    public final boolean method1409(int arg0) {
        field3145++;
        if (arg0 == 8) {
            return (this.field3147 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBII)V", line = 224)
    public static final void method1410(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3149++;
        int var5 = arg3;
        int var6 = -arg3;
        int var7 = 0;
        int var8 = -1;
        int var9 = class34.method288(3, arg1 + arg3, class341.field5494, class196.field3001);
        if (arg2 <= 15) {
            method1407(false);
        }
        int var10 = class34.method288(3, arg1 - arg3, class341.field5494, class196.field3001);
        class270.method1906(arg0, var9, var10, class306.field4998[arg4], 117);
        while (var7 < var5) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var5--;
                int var11 = arg4 - var5;
                int var12 = arg4 + var5;
                var6 -= var5 << 1;
                if (class33.field505 <= var12 && class278.field4586 >= var11) {
                    int var13 = class34.method288(3, arg1 + var7, class341.field5494, class196.field3001);
                    int var14 = class34.method288(3, arg1 - var7, class341.field5494, class196.field3001);
                    if (var12 <= class278.field4586) {
                        class270.method1906(arg0, var13, var14, class306.field4998[var12], 124);
                    }
                    if (var11 >= class33.field505) {
                        class270.method1906(arg0, var13, var14, class306.field4998[var11], 117);
                    }
                }
            }
            var7++;
            int var15 = arg4 - var7;
            int var16 = arg4 + var7;
            if (class33.field505 <= var16 && class278.field4586 >= var15) {
                int var17 = class34.method288(3, arg1 + var5, class341.field5494, class196.field3001);
                int var18 = class34.method288(3, arg1 - var5, class341.field5494, class196.field3001);
                if (class278.field4586 >= var16) {
                    class270.method1906(arg0, var17, var18, class306.field4998[var16], 124);
                }
                if (class33.field505 <= var15) {
                    class270.method1906(arg0, var17, var18, class306.field4998[var15], 121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 302)
    public static void method1411(int arg0) {
        if (arg0 != -2940) {
            method1410(-104, 17, (byte) -103, 24, -8);
        }
        field3155 = null;
        field3153 = null;
    }
}
