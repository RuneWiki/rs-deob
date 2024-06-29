import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class472 {

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lss;")
    private class272 field6517 = new class272();

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Z")
    public static boolean field6516 = false;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lss;")
    private class272 field6520;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method2763(int arg0) {
        if (arg0 != 8) {
            field6516 = false;
        }
        field6508++;
        return this.field6517.field3621 == this.field6517;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lss;", line = 20)
    public final class272 method2764(byte arg0) {
        int var2 = 33 / ((arg0 - 19) / 57);
        field6511++;
        class272 var3 = this.field6517.field3621;
        if (this.field6517 == var3) {
            this.field6520 = null;
            return null;
        } else {
            this.field6520 = var3.field3621;
            return var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 41)
    public final void method2765(int arg0) {
        if (arg0 != -15597) {
            return;
        }
        while (true) {
            class272 var2 = this.field6517.field3621;
            if (this.field6517 == var2) {
                field6518++;
                this.field6520 = null;
                return;
            }
            var2.method1541(-3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lss;", line = 64)
    public final class272 method2766(byte arg0) {
        field6519++;
        class272 var2 = this.field6517.field3619;
        if (arg0 != -2) {
            return null;
        } else if (this.field6517 == var2) {
            this.field6520 = null;
            return null;
        } else {
            this.field6520 = var2.field3619;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILss;)V", line = 85)
    public final void method2767(int arg0, class272 arg1) {
        if (arg1.field3619 != null) {
            arg1.method1541(-3);
        }
        field6514++;
        arg1.field3619 = this.field6517.field3619;
        if (arg0 != -1830) {
            field6516 = true;
        }
        arg1.field3621 = this.field6517;
        arg1.field3619.field3621 = arg1;
        arg1.field3621.field3619 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)I", line = 107)
    public final int method2768(byte arg0) {
        if (arg0 != -98) {
            return -63;
        }
        field6510++;
        int var2 = 0;
        for (class272 var3 = this.field6517.field3621; var3 != this.field6517; var3 = var3.field3621) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lss;", line = 128)
    public final class272 method2769(boolean arg0) {
        field6513++;
        class272 var2 = this.field6520;
        if (this.field6517 == var2) {
            this.field6520 = null;
            return null;
        }
        this.field6520 = var2.field3621;
        if (!arg0) {
            this.method2763(15);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 150)
    public static final void method2770(int arg0) {
        if (arg0 <= 53) {
            return;
        }
        field6515++;
        class252.field3366 = null;
        class317.method1739(0, class72.field986, class424.field5738, -16516, class196.field2674, -1, 0, 0, 0);
        if (class252.field3366 != null) {
            class244.method1360(class72.field986, -1412584499, class252.field3366, (byte) -98, 0, class235.field3114, 0, class424.field5738, class65.field858.field6329, class300.field4013);
            class252.field3366 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILwm;Lnk;)V", line = 168)
    public static final void method2771(int arg0, class364 arg1, class464 arg2) {
        field6509++;
        boolean var3 = class175.field2385.method1556(64, arg2.field6414, arg2.field6402, arg2.field6297 ? class233.field3103.field6783 : null, arg1, arg0 | arg2.field6320, arg2.field6366, arg2.field6294) == null;
        if (var3) {
            class383.field5275.method641(new class99(arg2.field6402, arg2.field6294, arg2.field6366, arg2.field6320 | 0xFF000000, arg2.field6414, arg2.field6297), (byte) -93);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z", line = 184)
    public static final boolean method2772(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class466.field6457; var3++) {
            class143 var4 = class51.field676[var3];
            if (var4.field2066 == 1) {
                int var5 = var4.field2076 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2078 * var5 >> 8) + var4.field2060;
                    int var7 = (var4.field2059 * var5 >> 8) + var4.field2068;
                    int var8 = (var4.field2075 * var5 >> 8) + var4.field2074;
                    int var9 = (var4.field2079 * var5 >> 8) + var4.field2080;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2066 == 2) {
                int var10 = arg0 - var4.field2076;
                if (var10 > 0) {
                    int var11 = (var4.field2078 * var10 >> 8) + var4.field2060;
                    int var12 = (var4.field2059 * var10 >> 8) + var4.field2068;
                    int var13 = (var4.field2075 * var10 >> 8) + var4.field2074;
                    int var14 = (var4.field2079 * var10 >> 8) + var4.field2080;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2066 == 3) {
                int var15 = var4.field2060 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2069 * var15 >> 8) + var4.field2076;
                    int var17 = (var4.field2081 * var15 >> 8) + var4.field2071;
                    int var18 = (var4.field2075 * var15 >> 8) + var4.field2074;
                    int var19 = (var4.field2079 * var15 >> 8) + var4.field2080;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2066 == 4) {
                int var20 = arg2 - var4.field2060;
                if (var20 > 0) {
                    int var21 = (var4.field2069 * var20 >> 8) + var4.field2076;
                    int var22 = (var4.field2081 * var20 >> 8) + var4.field2071;
                    int var23 = (var4.field2075 * var20 >> 8) + var4.field2074;
                    int var24 = (var4.field2079 * var20 >> 8) + var4.field2080;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2066 == 5) {
                int var25 = arg1 - var4.field2074;
                if (var25 > 0) {
                    int var26 = (var4.field2069 * var25 >> 8) + var4.field2076;
                    int var27 = (var4.field2081 * var25 >> 8) + var4.field2071;
                    int var28 = (var4.field2078 * var25 >> 8) + var4.field2060;
                    int var29 = (var4.field2059 * var25 >> 8) + var4.field2068;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)Lss;", line = 308)
    public final class272 method2773(byte arg0) {
        if (arg0 != 4) {
            this.field6520 = null;
        }
        field6512++;
        class272 var2 = this.field6517.field3621;
        if (this.field6517 == var2) {
            return null;
        } else {
            var2.method1541(-3);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 339)
    public class472() {
        this.field6517.field3621 = this.field6517;
        this.field6517.field3619 = this.field6517;
    }
}
