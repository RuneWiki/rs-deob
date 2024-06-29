import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class197 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3513 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lvf;")
    public static class265 field3517 = class87.method582(-46, "blinken3:");

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[[[I")
    public static int[][][] field3516 = new int[4][13][13];

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3519 = -1;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lvf;")
    public static class265 field3514 = class87.method582(-46, "<)4col>");

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lgb;")
    public static class143 field3520;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lfl;")
    public static class192 field3518;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lm;")
    public static class38 field3515;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IJ)Lvf;")
    public static final class265 method1359(int arg0, long arg1) {
        field3509++;
        class258.field4439.setTime(new Date(arg1));
        int var3 = class258.field4439.get(7);
        int var4 = class258.field4439.get(5);
        int var5 = class258.field4439.get(2);
        int var6 = class258.field4439.get(1);
        int var7 = class258.field4439.get(11);
        if (arg0 != 10) {
            field3514 = null;
        }
        int var8 = class258.field4439.get(12);
        int var9 = class258.field4439.get(13);
        return class148.method1022(arg0, new class265[] { class45.field996[var3 - 1], class117.field2078, class241.method1609(true, var4 / 10), class241.method1609(true, var4 % 10), class276.field4872, class217.field3921[var5], class276.field4872, class241.method1609(true, var6), class14.field430, class241.method1609(true, var7 / 10), class241.method1609(true, var7 % 10), class57.field1165, class241.method1609(true, var8 / 10), class241.method1609(true, var8 % 10), class57.field1165, class241.method1609(true, var9 / 10), class241.method1609(true, var9 % 10), class253.field4345 });
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    public static final void method1360(int arg0, int arg1) {
        class36.field842 = -1;
        field3510++;
        class174.field3125 = -1;
        class278.field4911 = arg1;
        class30.method246(44);
        if (arg0 != 26767) {
            method1361(102);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static final void method1361(int arg0) {
        field3512++;
        if (class238.field4145 != null) {
            class238.field4145.method667(false);
        }
        if (class30.field774 != null) {
            class30.field774.method667(false);
        }
        if (arg0 != 10) {
            method1361(53);
        }
        class70.method496(2, 22050, class127.field2273, 2);
        class238.field4145 = class78.method544(-127, class281.field4957, 22050, 0, class125.field2241);
        class238.field4145.method671(-114, class51.field1074);
        class30.field774 = class78.method544(-125, class281.field4957, 2048, 1, class125.field2241);
        class30.field774.method671(-62, class49.field1039);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static void method1362(boolean arg0) {
        field3518 = null;
        field3520 = null;
        field3517 = null;
        field3515 = null;
        field3513 = null;
        field3514 = null;
        field3516 = null;
        if (arg0) {
            field3520 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static final void method1363(int arg0) {
        field3511++;
        if (class122.field2189 == 0 || class122.field2189 == 5) {
            return;
        }
        try {
            if ((++class10.field339) > 2000) {
                if (field3520 != null) {
                    field3520.method990(arg0 ^ 0x5);
                    field3520 = null;
                }
                if (class241.field4199 >= 1) {
                    class122.field2189 = 0;
                    class102.field1798 = -5;
                    return;
                }
                class122.field2189 = 1;
                if (class53.field1106 == class177.field3152) {
                    class53.field1106 = class40.field910;
                } else {
                    class53.field1106 = class177.field3152;
                }
                class10.field339 = 0;
                class241.field4199++;
            }
            if (class122.field2189 == 1) {
                class278.field4913 = class281.field4957.method1533(0, class256.field4381, class53.field1106);
                class122.field2189 = 2;
            }
            if (class122.field2189 == 2) {
                if (class278.field4913.field1996 == 2) {
                    throw new IOException();
                }
                if (class278.field4913.field1996 != 1) {
                    return;
                }
                field3520 = new class143((Socket) class278.field4913.field1997, class281.field4957);
                class278.field4913 = null;
                long var1 = class276.field4873 = class4.field51.method1793(arg0 + 42);
                class55.field1133.field2449 = 0;
                class55.field1133.method903((byte) 36, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class55.field1133.method903((byte) 36, var3);
                field3520.method982(0, true, class55.field1133.field2483, 2);
                if (class238.field4145 != null) {
                    class238.field4145.method675(0);
                }
                if (class30.field774 != null) {
                    class30.field774.method675(arg0 ^ 0x1);
                }
                int var4 = field3520.method985((byte) 70);
                if (class238.field4145 != null) {
                    class238.field4145.method675(0);
                }
                if (class30.field774 != null) {
                    class30.field774.method675(0);
                }
                if (var4 != 0) {
                    class102.field1798 = var4;
                    class122.field2189 = 0;
                    field3520.method990(4);
                    field3520 = null;
                    return;
                }
                class122.field2189 = 3;
            }
            if (class122.field2189 == 3) {
                if (field3520.method987((byte) 53) < 8) {
                    return;
                }
                field3520.method986(8, 0, class207.field3730.field2483, 13418);
                int[] var5 = new int[4];
                class207.field3730.field2449 = 0;
                class144.field2688 = class207.field3730.method943(125);
                class55.field1133.field2449 = 0;
                var5[3] = (int) class144.field2688;
                var5[2] = (int) (class144.field2688 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class55.field1133.method903((byte) 36, 10);
                class55.field1133.method898((byte) 105, var5[0]);
                class55.field1133.method898((byte) 106, var5[1]);
                class55.field1133.method898((byte) 40, var5[2]);
                class55.field1133.method898((byte) 89, var5[3]);
                class55.field1133.method911(0, class4.field51.method1793(arg0 ^ 0x2A));
                class55.field1133.method941(class4.field58, (byte) -58);
                class55.field1133.method916(class31.field796, field3513, arg0 + 591775047);
                class45.field994.field2449 = 0;
                if (class246.field4281 == 40) {
                    class45.field994.method903((byte) 36, 18);
                } else {
                    class45.field994.method903((byte) 36, 16);
                }
                class45.field994.method921(102, class55.field1133.field2449 + class155.method1052((byte) -47, class163.field2963) + 159);
                class45.field994.method898((byte) 87, 526);
                class45.field994.method903((byte) 36, class239.field4176);
                class45.field994.method903((byte) 36, class264.field4602 ? 1 : 0);
                class45.field994.method903((byte) 36, 0);
                class45.field994.method903((byte) 36, class232.method1565((byte) 106));
                class45.field994.method921(arg0 + 119, class26.field706);
                class45.field994.method921(120, class50.field1053);
                class45.field994.method903((byte) 36, class243.field4246);
                class102.method683(class45.field994, (byte) 114);
                class45.field994.method941(class163.field2963, (byte) -58);
                class45.field994.method898((byte) 99, class23.field675);
                class45.field994.method898((byte) 47, class207.method1417((byte) 65));
                class106.field1884 = true;
                class45.field994.method921(112, class126.field2262);
                class45.field994.method898((byte) 81, class81.field1522.method1311(-111));
                class45.field994.method898((byte) 36, class118.field2080.method1311(-121));
                class45.field994.method898((byte) 92, class91.field1614.method1311(arg0 - 122));
                class45.field994.method898((byte) 79, class228.field4046.method1311(arg0 ^ 0xFFFFFF81));
                class45.field994.method898((byte) 48, class213.field3822.method1311(37));
                class45.field994.method898((byte) 87, class30.field757.method1311(-13));
                class45.field994.method898((byte) 93, class14.field427.method1311(-122));
                class45.field994.method898((byte) 36, class276.field4868.method1311(-126));
                class45.field994.method898((byte) 98, class243.field4236.method1311(arg0 ^ 0x69));
                class45.field994.method898((byte) 65, class16.field462.method1311(-123));
                class45.field994.method898((byte) 68, class58.field1180.method1311(33));
                class45.field994.method898((byte) 86, class147.field2748.method1311(arg0 ^ 0x20));
                class45.field994.method898((byte) 73, class116.field2061.method1311(arg0 + 42));
                class45.field994.method898((byte) 97, class73.field1414.method1311(3));
                class45.field994.method898((byte) 87, class208.field3750.method1311(arg0 ^ 0x70));
                class45.field994.method898((byte) 55, class58.field1188.method1311(125));
                class45.field994.method898((byte) 59, class38.field878.method1311(-24));
                class45.field994.method898((byte) 100, class137.field2500.method1311(57));
                class45.field994.method898((byte) 125, class225.field4003.method1311(arg0 - 128));
                class45.field994.method898((byte) 39, class48.field1033.method1311(arg0 ^ 0xFFFFFFFE));
                class45.field994.method898((byte) 42, class227.field4037.method1311(arg0 ^ 0x50));
                class45.field994.method898((byte) 99, class102.field1821.method1311(-113));
                class45.field994.method898((byte) 61, class100.field1746.method1311(-128));
                class45.field994.method898((byte) 127, class252.field4340.method1311(-118));
                class45.field994.method898((byte) 121, class81.field1525.method1311(3));
                class45.field994.method898((byte) 102, class32.field808.method1311(53));
                class45.field994.method898((byte) 60, class167.field3040.method1311(125));
                class45.field994.method898((byte) 74, class2.field27.method1311(-122));
                class45.field994.method939(127, class55.field1133.field2449, class55.field1133.field2483, 0);
                field3520.method982(0, true, class45.field994.field2483, class45.field994.field2449);
                class55.field1133.method1860(var5, (byte) 116);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class207.field3730.method1860(var5, (byte) 116);
                class122.field2189 = 4;
            }
            if (class122.field2189 == 4) {
                if (field3520.method987((byte) 53) < 1) {
                    return;
                }
                int var7 = field3520.method985((byte) 70);
                if (var7 == 21) {
                    class122.field2189 = 7;
                } else if (var7 == 29) {
                    class122.field2189 = 10;
                } else if (var7 == 1) {
                    class102.field1798 = var7;
                    class122.field2189 = 5;
                    return;
                } else if (var7 == 2) {
                    class122.field2189 = 8;
                } else if (var7 == 15) {
                    class102.field1798 = var7;
                    class122.field2189 = 0;
                    return;
                } else if (var7 == 23 && class241.field4199 < 1) {
                    class122.field2189 = 1;
                    class241.field4199++;
                    class10.field339 = 0;
                    field3520.method990(4);
                    field3520 = null;
                    return;
                } else {
                    class122.field2189 = 0;
                    class102.field1798 = var7;
                    field3520.method990(arg0 + 3);
                    field3520 = null;
                    return;
                }
            }
            if (class122.field2189 == 6) {
                class55.field1133.field2449 = 0;
                class55.field1133.method1863(true, 17);
                field3520.method982(0, true, class55.field1133.field2483, class55.field1133.field2449);
                class122.field2189 = 4;
                return;
            }
            if (class122.field2189 == 7) {
                if (field3520.method987((byte) 53) < 1) {
                    return;
                }
                class82.field1547 = (field3520.method985((byte) 70) + 3) * 60;
                class102.field1798 = 21;
                class122.field2189 = 0;
                field3520.method990(4);
                field3520 = null;
                return;
            }
            if (class122.field2189 == 10) {
                if (field3520.method987((byte) 53) < 1) {
                    return;
                }
                class204.field3656 = field3520.method985((byte) 70);
                class122.field2189 = 0;
                class102.field1798 = 29;
                field3520.method990(4);
                field3520 = null;
                return;
            }
            if (class122.field2189 == 8) {
                if (field3520.method987((byte) 53) < 14) {
                    return;
                }
                field3520.method986(14, 0, class207.field3730.field2483, 13418);
                class207.field3730.field2449 = 0;
                class30.field773 = class207.field3730.method920((byte) 98);
                class98.field1737 = class207.field3730.method920((byte) 123);
                class262.field4583 = class207.field3730.method920((byte) 100) == 1;
                class203.field3632 = class207.field3730.method920((byte) 78) == 1;
                class36.field843 = class207.field3730.method920((byte) 126) == 1;
                class101.field1792 = class207.field3730.method920((byte) 118) == 1;
                class261.field4530 = class207.field3730.method920((byte) 67) == 1;
                class45.field1012 = class207.field3730.method927(127);
                class102.field1820 = class207.field3730.method920((byte) 32) == 1;
                class91.field1632 = class207.field3730.method920((byte) 66) == 1;
                class124.method833(2, class91.field1632);
                class171.method1127((byte) 89, class91.field1632);
                if (!class264.field4602) {
                    if ((!class262.field4583 || class36.field843) && !class102.field1820) {
                        try {
                            class248.field4305.method1782(class281.field4957.field4024, arg0 - 1);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class6.field157.method1782(class281.field4957.field4024, 0);
                        } catch (Throwable var8) {
                        }
                    }
                }
                class93.field1650 = class207.field3730.method1861(-80);
                class221.field3966 = class207.field3730.method927(125);
                class122.field2189 = 9;
            }
            if (class122.field2189 == 9) {
                if (field3520.method987((byte) 53) < class221.field3966) {
                    return;
                }
                class207.field3730.field2449 = 0;
                field3520.method986(class221.field3966, 0, class207.field3730.field2483, arg0 ^ 0x346B);
                class122.field2189 = 0;
                class102.field1798 = 2;
                class146.method1009((byte) -104);
                class45.field1006 = -1;
                class135.method912(false, 0);
                class93.field1650 = -1;
                return;
            }
        } catch (IOException var10) {
            if (field3520 != null) {
                field3520.method990(arg0 + 3);
                field3520 = null;
            }
            if (class241.field4199 < 1) {
                class122.field2189 = 1;
                class10.field339 = 0;
                class241.field4199++;
                if (class53.field1106 == class177.field3152) {
                    class53.field1106 = class40.field910;
                } else {
                    class53.field1106 = class177.field3152;
                }
            } else {
                class122.field2189 = 0;
                class102.field1798 = -4;
            }
        }
        if (arg0 != 1) {
            method1360(51, -3);
        }
    }
}
