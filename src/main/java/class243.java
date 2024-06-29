import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class243 {

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "[Lpb;")
    private class78[] field3766;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field3756 = new int[100];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public static boolean field3754 = false;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lem;")
    public static class11 field3763;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lub;")
    public static class21 field3762;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Lpe;", line = 16)
    public static final class101 method1724(boolean arg0) {
        class101 var1 = new class101(34);
        var1.method772((byte) -123, 11);
        var1.method772((byte) -125, class329.field5093);
        var1.method772((byte) -83, class65.field1064 ? 1 : 0);
        var1.method772((byte) -84, class128.field2040 ? 1 : 0);
        var1.method772((byte) -97, class289.field4406 ? 1 : 0);
        var1.method772((byte) -82, class298.field4704 ? 1 : 0);
        field3761++;
        var1.method772((byte) -79, class65.field1055 ? 1 : 0);
        var1.method772((byte) -86, class29.field474 ? 1 : 0);
        var1.method772((byte) -94, class217.field3474 ? 1 : 0);
        var1.method772((byte) -72, class11.field219 ? 1 : 0);
        var1.method772((byte) -94, class245.field3780);
        var1.method772((byte) -106, class302.field4753 ? 1 : 0);
        var1.method772((byte) -67, class6.field61 ? 1 : 0);
        var1.method772((byte) -98, class307.field4846 ? 1 : 0);
        var1.method772((byte) -91, class12.field239);
        var1.method772((byte) -105, class151.field2424 ? 1 : 0);
        var1.method772((byte) -118, class191.field3064);
        var1.method772((byte) -78, class288.field4397);
        var1.method772((byte) -66, class14.field263);
        var1.method728(class107.field1786, 1234856744);
        var1.method728(class247.field3825, 1234856744);
        var1.method772((byte) -86, class47.method368());
        var1.method784(-123, class34.field566);
        var1.method772((byte) -96, class54.field860);
        if (arg0) {
            method1725((int[]) null, (class30) null, 8, (int[]) null, (int[]) null);
        }
        var1.method772((byte) -71, class247.field3820 ? 1 : 0);
        var1.method772((byte) -91, class39.field707 ? 1 : 0);
        var1.method772((byte) -98, class60.field945);
        var1.method772((byte) -63, class22.field393 ? 1 : 0);
        var1.method772((byte) -121, class212.field3387 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([ILnl;I[I[I)V", line = 62)
    public static final void method1725(int[] arg0, class30 arg1, int arg2, int[] arg3, int[] arg4) {
        field3759++;
        for (int var5 = arg2; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field1385.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field1385[var9] = null;
                    } else {
                        class269 var10 = class6.method28(var6, arg2 ^ 0x2);
                        int var11 = var10.field4168;
                        class18 var12 = arg1.field1385[var9];
                        if (var12 != null) {
                            if (var12.field347 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field1385[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field341 = 0;
                                    var12.field342 = var8;
                                    var12.field348 = 0;
                                    var12.field351 = 0;
                                    var12.field349 = 1;
                                    class89.method632(var10, arg1.field1442, (byte) 88, arg1.field1369, class19.field356 == arg1, 0);
                                } else if (var11 == 2) {
                                    var12.field348 = 0;
                                }
                            } else if (var10.field4187 >= class6.method28(var12.field347, arg2 + 2).field4187) {
                                var12 = arg1.field1385[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class18 var13 = arg1.field1385[var9] = new class18();
                            var13.field348 = 0;
                            var13.field342 = var8;
                            var13.field341 = 0;
                            var13.field351 = 0;
                            var13.field349 = 1;
                            var13.field347 = var6;
                            class89.method632(var10, arg1.field1442, (byte) 100, arg1.field1369, class19.field356 == arg1, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V", line = 161)
    public static final void method1726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 90 % ((17 - arg0) / 45);
        field3755++;
        if (class319.field4965 <= arg4 && arg2 <= class116.field1888 && arg6 >= class188.field2995 && class195.field3108 >= arg5) {
            if (arg1 == 1) {
                class269.method1941(arg4, 97, arg6, arg2, arg3, arg5);
            } else {
                class212.method1540(arg5, arg6, arg1, (byte) 76, arg4, arg3, arg2);
            }
        } else if (arg1 == 1) {
            class275.method1975(arg4, (byte) 114, arg2, arg6, arg3, arg5);
        } else {
            class222.method1617(arg1, arg3, arg6, arg2, (byte) -105, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lwl;IIIIII)V", line = 196)
    public static final void method1727(class89 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2 / ((-arg6 - 25) / 36);
        class99.method718(arg4, arg1, arg5, arg0.field1369, (byte) -67, arg0.field1442, arg3, arg2);
        field3758++;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V", line = 224)
    public class243(int arg0) {
        this.field3766 = new class78[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class78 var3 = this.field3766[var2] = new class78();
            var3.field1195 = var3;
            var3.field1197 = var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 247)
    public static final void method1728(String arg0, byte arg1) {
        field3757++;
        if (arg1 <= 0) {
            method1729(35);
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 262)
    public static void method1729(int arg0) {
        field3762 = null;
        field3763 = null;
        field3756 = null;
        int var1 = 36 % ((arg0 - 75) / 43);
    }
}
