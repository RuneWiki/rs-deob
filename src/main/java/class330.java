import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class330 {

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
    public int[] field4789 = new int[100];

    @OriginalMember(owner = "client!is", name = "g", descriptor = "[Ldq;")
    public class472[] field4791 = new class472[8];

    @OriginalMember(owner = "client!is", name = "d", descriptor = "[I")
    public int[] field4788 = new int[3];

    @OriginalMember(owner = "client!is", name = "i", descriptor = "[Ljo;")
    public class210[] field4793 = new class210[100];

    @OriginalMember(owner = "client!is", name = "f", descriptor = "[I")
    public static int[] field4790 = new int[2048];

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field4787;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1983(int arg0) {
        if (arg0 != 17417) {
            return;
        }
        for (class262 var1 = (class262) class230.field3220.method2096(-21400); var1 != null; var1 = (class262) class230.field3220.method2084((byte) 19)) {
            if (class305.method1831(var1.field3737, false)) {
                class356.method2152(arg0 - 20840, var1);
            }
        }
        field4785++;
        if (class383.field5696 == 1) {
            class174.field2387 = false;
            class248.method1547(class125.field1614, class214.field3022, 320, class64.field940, class414.field6141);
            return;
        }
        class248.method1547(class125.field1614, class214.field3022, arg0 - 17097, class64.field940, class414.field6141);
        int var2 = class482.field6989.method3055(7748, class226.field3194.method1220(2969, class81.field1122));
        for (class262 var3 = (class262) class230.field3220.method2096(-21400); var3 != null; var3 = (class262) class230.field3220.method2084((byte) 19)) {
            int var4 = class190.method1195((byte) -102, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class125.field1614 = var2 + 8;
        class414.field6141 = class383.field5696 * 16 + (class500.field7650 ? 26 : 22);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjg;)V", line = 54)
    public static final void method1984(int arg0, class214 arg1) {
        arg1.field3019 = null;
        field4796++;
        if (arg0 == 458752 && class486.field7084 < 20) {
            class281.field4015.method250((byte) -72, arg1);
            class486.field7084++;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLso;Z)V", line = 71)
    public static final void method1985(byte arg0, class313 arg1, boolean arg2) {
        field4786++;
        if (class383.field5696 >= 400) {
            return;
        }
        if (class415.field6145 != arg1) {
            if (arg0 < 55) {
                field4790 = null;
            }
            String var9;
            if (arg1.field4584 == 0) {
                boolean var3 = true;
                if (class415.field6145.field4561 != -1 && arg1.field4561 != -1) {
                    int var4 = class415.field6145.field4576 <= arg1.field4576 ? arg1.field4576 : class415.field6145.field4576;
                    int var5 = arg1.field4561 <= class415.field6145.field4561 ? arg1.field4561 : class415.field6145.field4561;
                    int var6 = (var4 * 10 / 100) + var5 + 5;
                    int var7 = class415.field6145.field4576 - arg1.field4576;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class28.field486 == class156.field1996 ? class170.field2278.method1220(2969, class81.field1122) : class4.field66.method1220(2969, class81.field1122);
                if (arg1.field4589 <= arg1.field4576) {
                    var9 = arg1.method1885(28166, true) + (var3 ? class190.method1196(class415.field6145.field4576, (byte) -101, arg1.field4576) : "<col=ffffff>") + " (" + var8 + arg1.field4576 + ")";
                } else {
                    var9 = arg1.method1885(28166, true) + (var3 ? class190.method1196(class415.field6145.field4576, (byte) -101, arg1.field4576) : "<col=ffffff>") + " (" + var8 + arg1.field4576 + "+" + (arg1.field4589 - arg1.field4576) + ")";
                }
            } else {
                var9 = arg1.method1885(28166, true) + " (" + class171.field2328.method1220(2969, class81.field1122) + arg1.field4584 + ")";
            }
            if (class288.field4128) {
                if (!arg2 && (class278.field3963 & 0x8) != 0) {
                    class105.field1408++;
                    class495.method2974(true, (long) arg1.field4262, 5, class457.field6660, -1, 0, -1, class211.field2998 + " -> <col=ffffff>" + var9, 0, false, class272.field3802);
                }
            } else if (arg2) {
                class495.method2974(false, 0L, -1, "<col=cccccc>" + var9, -1, 0, 0, "", 0, true, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class84.field1161[var10] != null) {
                        short var11 = 0;
                        if (class459.field6684 == class156.field1996 && class84.field1161[var10].equalsIgnoreCase(class271.field3783.method1220(2969, class81.field1122))) {
                            if (arg1.field4576 > class415.field6145.field4576) {
                                var11 = 2000;
                            }
                            if (class415.field6145.field4594 != 0 && arg1.field4594 != 0) {
                                if (class415.field6145.field4594 == arg1.field4594) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class493.field7530[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class414.field6138[var10] + var11);
                        int var13 = class482.field6984[var10] == -1 ? class187.field2656 : class482.field6984[var10];
                        class495.method2974(true, (long) arg1.field4262, var12, class84.field1161[var10], -1, 0, -1, "<col=ffffff>" + var9, 0, false, var13);
                        class477.field6865++;
                    }
                }
            }
            if (!arg2) {
                for (class262 var14 = (class262) class230.field3220.method2096(-21400); var14 != null; var14 = (class262) class230.field3220.method2084((byte) 19)) {
                    if (var14.field3737 == 58) {
                        var14.field3732 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class288.field4128 && (class278.field3963 & 0x10) != 0) {
            class495.method2974(true, 0L, 22, class457.field6660, -1, 0, -1, class211.field2998 + " -> <col=ffffff>" + class438.field6410.method1220(2969, class81.field1122), 0, false, class272.field3802);
            class43.field651++;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 238)
    public static void method1986(byte arg0) {
        if (arg0 != 87) {
            method1983(-82);
        }
        field4790 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZII)Z", line = 259)
    public static final boolean method1987(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1985((byte) 40, null, false);
        }
        field4792++;
        return class311.method1864(arg1, arg2, -121) | (arg2 & 0x70000) != 0 || class466.method2729(arg2, arg1, (byte) -125);
    }
}
