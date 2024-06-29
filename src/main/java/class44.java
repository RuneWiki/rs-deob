import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1011 = 1;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Ltd;")
    public static class136 field1012 = class145.method1172("jolt", 45);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "[I")
    public static int[] field1021 = new int[128];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Ld;")
    public static class22 field1010;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lke;")
    public static class74 field1015;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method354(int arg0) {
        field1016++;
        try {
            if (class96.field2275 == 0) {
                if (class133.field3140 != null) {
                    class133.field3140.method144(arg0 ^ 0x4E86);
                    class133.field3140 = null;
                }
                class31.field724 = null;
                class96.field2275 = 1;
                class153.field3503 = 0;
                class155.field3611 = false;
            }
            if (class96.field2275 == 1) {
                if (class31.field724 == null) {
                    class31.field724 = field1010.method182(class43.field982, class101.field2423, (byte) 62);
                }
                if (class31.field724.field3442 == 2) {
                    throw new IOException();
                }
                if (class31.field724.field3442 == 1) {
                    class133.field3140 = new class19((Socket) class31.field724.field3441, field1010);
                    class31.field724 = null;
                    class96.field2275 = 2;
                }
            }
            if (class96.field2275 == 2) {
                long var1 = class120.field2747 = class81.field1929.method1117(-51);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class15.field304.field2995 = 0;
                class15.field304.method1026(14, (byte) 127);
                class15.field304.method1026(var3, (byte) 127);
                class133.field3140.method145(2, -6660, class15.field304.field2960, 0);
                class4.field70.field2995 = 0;
                class96.field2275 = 3;
            }
            if (class96.field2275 == 3) {
                if (class71.field1506 != null) {
                    class71.field1506.method261((byte) -76);
                }
                if (class21.field419 != null) {
                    class21.field419.method261((byte) -104);
                }
                int var4 = class133.field3140.method137(arg0 - 20103);
                if (class71.field1506 != null) {
                    class71.field1506.method261((byte) -76);
                }
                if (class21.field419 != null) {
                    class21.field419.method261((byte) -121);
                }
                if (var4 != 0) {
                    class90.method681(var4, arg0 ^ 0xFFFFB162);
                    return;
                }
                class96.field2275 = 4;
                class4.field70.field2995 = 0;
            }
            if (class96.field2275 == 4) {
                if (class4.field70.field2995 < 8) {
                    int var5 = class133.field3140.method142((byte) 102);
                    if (8 - class4.field70.field2995 < var5) {
                        var5 = 8 - class4.field70.field2995;
                    }
                    if (var5 > 0) {
                        class133.field3140.method136(arg0 ^ 0x4EB1, class4.field70.field2960, class4.field70.field2995, var5);
                        class4.field70.field2995 += var5;
                    }
                }
                if (class4.field70.field2995 == 8) {
                    class4.field70.field2995 = 0;
                    class125.field2893 = class4.field70.method1014(false);
                    class96.field2275 = 5;
                }
            }
            if (class96.field2275 == 5) {
                class15.field304.field2995 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class125.field2893 >> 32), (int) class125.field2893 };
                class15.field304.method1026(10, (byte) 127);
                class15.field304.method989(var6[0], (byte) 89);
                class15.field304.method989(var6[1], (byte) 52);
                class15.field304.method989(var6[2], (byte) 48);
                class15.field304.method989(var6[3], (byte) 76);
                class15.field304.method989(field1010.field479, (byte) 116);
                class15.field304.method990(class81.field1929.method1117(125), (byte) -18);
                class15.field304.method1031(arg0 ^ 0x4EF1, class81.field1904);
                class15.field304.method1003(arg0 ^ 0xFFFF9187, class87.field2075, class127.field3002);
                class124.field2864.field2995 = 0;
                if (class139.field3248 == 40) {
                    class124.field2864.method1026(18, (byte) 127);
                } else {
                    class124.field2864.method1026(16, (byte) 127);
                }
                class124.field2864.method1026(class15.field304.field2995 + 69, (byte) 127);
                class124.field2864.method989(462, (byte) 86);
                class124.field2864.method1026(class65.field1399 ? 1 : 0, (byte) 127);
                class124.field2864.method989(class146.field3370.field2038, (byte) 124);
                class124.field2864.method989(class56.field1278.field2038, (byte) 49);
                class124.field2864.method989(class122.field2851.field2038, (byte) 73);
                class124.field2864.method989(class31.field683.field2038, (byte) 54);
                class124.field2864.method989(class147.field3413.field2038, (byte) 84);
                class124.field2864.method989(class122.field2844.field2038, (byte) 92);
                class124.field2864.method989(class39.field921.field2038, (byte) 78);
                class124.field2864.method989(class121.field2757.field2038, (byte) 118);
                class124.field2864.method989(class143.field3328.field2038, (byte) 43);
                class124.field2864.method989(class108.field2537.field2038, (byte) 108);
                class124.field2864.method989(class133.field3142.field2038, (byte) 95);
                class124.field2864.method989(class28.field625.field2038, (byte) 73);
                class124.field2864.method989(class47.field1077.field2038, (byte) 46);
                class124.field2864.method989(class141.field3281.field2038, (byte) 51);
                class124.field2864.method989(class80.field1891.field2038, (byte) 53);
                class124.field2864.method989(class62.field1319.field2038, (byte) 83);
                class124.field2864.method1035(class15.field304.field2995, 0, class15.field304.field2960, 12311336);
                class133.field3140.method145(class124.field2864.field2995, -6660, class124.field2864.field2960, 0);
                class15.field304.method872(arg0 - 20226, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class4.field70.method872(-85, var6);
                class96.field2275 = 6;
            }
            if (class96.field2275 == 6 && class133.field3140.method142((byte) 102) > 0) {
                int var8 = class133.field3140.method137(arg0 ^ 0x4E87);
                if (var8 == 21 && class139.field3248 == 20) {
                    class96.field2275 = 7;
                } else if (var8 == 2) {
                    class96.field2275 = 9;
                } else if (var8 == 15 && class139.field3248 == 40) {
                    class15.method111((byte) -21);
                    return;
                } else if (var8 == 23 && class31.field722 < 1) {
                    class31.field722++;
                    class96.field2275 = 0;
                } else {
                    class90.method681(var8, arg0 - 20130);
                    return;
                }
            }
            if (class96.field2275 == 7 && class133.field3140.method142((byte) 102) > 0) {
                class74.field1654 = class133.field3140.method137(0) * 60 + 180;
                class96.field2275 = 8;
            }
            if (class96.field2275 == 8) {
                class153.field3503 = 0;
                class11.method78(class79.method570(0, new class136[] { class19.method140(class74.field1654 / 60, arg0 ^ 0xFFFFB11E), class4.field77 }), class88.field2079, -122, class52.field1168);
                if (--class74.field1654 <= 0) {
                    class96.field2275 = 0;
                }
            } else {
                if (class96.field2275 == 9 && class133.field3140.method142((byte) 102) >= 8) {
                    class63.field1354 = class133.field3140.method137(arg0 ^ 0x4E87);
                    class118.field2689 = class133.field3140.method137(0) == 1;
                    class113.field2618 = class133.field3140.method137(0);
                    class113.field2618 <<= 0x8;
                    class113.field2618 += class133.field3140.method137(arg0 ^ 0x4E87);
                    class43.field977 = class133.field3140.method137(0);
                    class133.field3140.method136(arg0 - 19994, class4.field70.field2960, 0, 1);
                    class4.field70.field2995 = 0;
                    class49.field1094 = class4.field70.method874(arg0 - 19848);
                    class133.field3140.method136(42, class4.field70.field2960, 0, 2);
                    class4.field70.field2995 = 0;
                    class11.field179 = class4.field70.method1020(false);
                    class96.field2275 = 10;
                }
                if (class96.field2275 != 10) {
                    class153.field3503++;
                    if (arg0 != 20103) {
                        method358(true);
                    }
                    if (class153.field3503 > 2000) {
                        if (class31.field722 < 1) {
                            class96.field2275 = 0;
                            class31.field722++;
                            if (class81.field1933 == class101.field2423) {
                                class101.field2423 = class136.field3217;
                            } else {
                                class101.field2423 = class81.field1933;
                            }
                        } else {
                            class90.method681(-3, arg0 ^ -20126);
                        }
                    }
                } else if (class133.field3140.method142((byte) 102) >= class11.field179) {
                    class4.field70.field2995 = 0;
                    class133.field3140.method136(94, class4.field70.field2960, 0, class11.field179);
                    class125.method964((byte) 127);
                    class132.field3110 = -1;
                    class21.method157(false, arg0 ^ 0x4E81);
                    class49.field1094 = -1;
                }
            }
        } catch (IOException var9) {
            if (class31.field722 < 1) {
                class31.field722++;
                if (class81.field1933 == class101.field2423) {
                    class101.field2423 = class136.field3217;
                } else {
                    class101.field2423 = class81.field1933;
                }
                class96.field2275 = 0;
            } else {
                class90.method681(-2, -27);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLpd;I)V")
    public static final void method355(byte arg0, class108 arg1, int arg2) {
        if (arg0 >= -18) {
            return;
        }
        field1017++;
        if (class125.field2900 == null) {
            class49.method416((byte) 0, null, 0, true, true, 255, 255);
            class65.field1398[arg2] = arg1;
        } else {
            class125.field2900.field2995 = arg2 * 8 + 5;
            int var3 = class125.field2900.method986(-104);
            int var4 = class125.field2900.method986(35);
            arg1.method852(var3, var4, -64);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILmd;)Lbb;")
    public static final class10 method356(int arg0, int arg1, int arg2, class87 arg3) {
        field1014++;
        if (arg2 != 255) {
            method357(29, (byte) 100);
        }
        return class78.method565(arg3, arg0, -120, arg1) ? class146.method1179(false) : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
    public static final void method357(int arg0, byte arg1) {
        field1020++;
        if (arg0 == -1 || !class91.method688(arg0, (byte) -127)) {
            return;
        }
        if (arg1 > -27) {
            field1012 = null;
        }
        class74[] var2 = class94.field2201[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class74 var4 = var2[var3];
            if (var4.field1546 != null) {
                class139 var5 = new class139();
                var5.field3222 = var4;
                var5.field3244 = var4.field1546;
                class96.method734(-9063, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static void method358(boolean arg0) {
        if (arg0) {
            field1012 = null;
        }
        field1015 = null;
        field1021 = null;
        field1012 = null;
        field1010 = null;
    }
}
