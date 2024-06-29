import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class201 extends Canvas {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field3146;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lbk;")
    public static class21 field3149;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)V")
    public static final void method1358(int arg0, int arg1, byte arg2) {
        if (class240.field3896 != arg1) {
            class190.field2946 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class190.field2946[var3] = (var3 << 12) / arg1;
            }
            class4.field36 = arg1 * 32;
            class189.field2929 = arg1 - 1;
            class240.field3896 = arg1;
        }
        if (arg2 < 51) {
            method1358(-25, 115, (byte) 26);
        }
        if (class79.field1328 != arg0) {
            if (class240.field3896 == arg0) {
                class103.field1713 = class190.field2946;
            } else {
                class103.field1713 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class103.field1713[var4] = (var4 << 12) / arg0;
                }
            }
            class53.field811 = arg0 - 1;
            class79.field1328 = arg0;
        }
        field3145++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
    public static final void method1359(int arg0, int arg1) {
        field3144++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class29.field415[arg0];
        int var3 = class45.field648[arg0];
        int var4 = class146.field2319[arg0];
        int var5 = (int) class243.field3962[arg0];
        long var6 = class243.field3962[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 4) {
            class75.method534(21812);
        }
        if (var4 == 34) {
            class236 var8 = class210.field3267[var5];
            if (var8 != null) {
                class177.field2768 = class112.field1838;
                class296.field4685++;
                class231.field3677 = 2;
                class284.field4501 = 0;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 103);
                client.field2435.method659((byte) 123, var5);
                client.field2435.method657(class106.field1764[82] ? 1 : 0, -53);
            }
        }
        if (var4 == 2) {
            if (var5 == 0) {
                class251.method1721(class240.field3892, var2, var3);
            } else if (var5 == 1) {
                if (class140.field2141 > 0 && class106.field1764[82] && class106.field1764[81]) {
                    class139.method940(class240.field3892, class46.field656 + var2, (byte) -121, class260.field4162 + var3);
                } else {
                    class5.method38(1, var2, (byte) -6, var3);
                    client.field2435.method654((byte) -103, class245.field3982);
                    client.field2435.method654((byte) -114, class43.field611);
                    client.field2435.method634((int) class16.field244, 105);
                    client.field2435.method654((byte) -118, 57);
                    client.field2435.method654((byte) -92, class103.field1732);
                    client.field2435.method654((byte) -124, class77.field1265);
                    client.field2435.method654((byte) -102, 89);
                    client.field2435.method634(class283.field4473.field2240, arg1 - 5446);
                    client.field2435.method634(class283.field4473.field2278, arg1 - 5414);
                    client.field2435.method654((byte) -97, class125.field1976);
                    client.field2435.method654((byte) -98, 63);
                }
            }
        }
        if (var4 == 1001) {
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            class157.field2448 = class291.field4584;
            class231.field3677 = 2;
            class45 var9 = class255.field4082[var5];
            if (var9 != null) {
                class60 var10 = var9.field645;
                if (var10.field1020 != null) {
                    var10 = var10.method459(true);
                }
                if (var10 != null) {
                    client.field2435.method536((byte) -104, 117);
                    client.field2435.method663(var10.field990, arg1 - 5355);
                    class231.field3678++;
                }
            }
        }
        if (var4 == 26) {
            class179.field2786++;
            client.field2435.method536((byte) -104, 222);
            client.field2435.method663(var5, 123);
            client.field2435.method634(var2, 24);
            client.field2435.method639(var3, (byte) -116);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 46) {
            class236 var11 = class210.field3267[var5];
            if (var11 != null) {
                class157.field2448 = class291.field4584;
                class26.field343++;
                class231.field3677 = 2;
                class284.field4501 = 0;
                class177.field2768 = class112.field1838;
                client.field2435.method536((byte) -104, 50);
                client.field2435.method640(-122, var5);
                client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
                client.field2435.method659((byte) 127, class139.field2132);
                client.field2435.method639(class102.field1704, (byte) -99);
            }
        }
        if (var4 == 38) {
            client.field2435.method536((byte) -104, 81);
            client.field2435.method639(var3, (byte) -113);
            class146.field2322++;
            class228 var12 = class84.method596((byte) 35, var3);
            if (var12.field3565 != null && var12.field3565[0][0] == 5) {
                int var13 = var12.field3565[0][1];
                class31.field462[var13] = 1 - class31.field462[var13];
                class295.method1972(30734, var13);
            }
        }
        if (var4 == 48) {
            client.field2435.method536((byte) -104, 130);
            class245.field3979++;
            client.field2435.method634(var5, 87);
            client.field2435.method678(var3, true);
            client.field2435.method663(var2, 107);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 42) {
            class284.field4501 = 0;
            class200.field3131++;
            class157.field2448 = class291.field4584;
            class231.field3677 = 2;
            class177.field2768 = class112.field1838;
            client.field2435.method536((byte) -104, 241);
            client.field2435.method640(-117, class265.field4223);
            client.field2435.method678(class81.field1350, true);
            client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            client.field2435.method640(-123, class260.field4162 + var3);
            client.field2435.method634(var5, 43);
            client.field2435.method663(class33.field493, 116);
            client.field2435.method634(class46.field656 + var2, 56);
        }
        if (var4 == 35) {
            class45 var14 = class255.field4082[var5];
            if (var14 != null) {
                class284.field4501 = 0;
                class231.field3677 = 2;
                class114.field1860++;
                class177.field2768 = class112.field1838;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 109);
                client.field2435.method640(arg1 ^ 0xFFFFEAD9, class265.field4223);
                client.field2435.method681(arg1 - 5466, class81.field1350);
                client.field2435.method640(-119, class33.field493);
                client.field2435.method657(class106.field1764[82] ? 1 : 0, 78);
                client.field2435.method640(-127, var5);
            }
        }
        if (var4 == 7) {
            class45 var15 = class255.field4082[var5];
            if (var15 != null) {
                class177.field2768 = class112.field1838;
                class240.field3890++;
                class284.field4501 = 0;
                class231.field3677 = 2;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 213);
                client.field2435.method654((byte) -114, class106.field1764[82] ? 1 : 0);
                client.field2435.method659((byte) -84, var5);
            }
        }
        if (var4 == 33) {
            class284.field4501 = 0;
            class177.field2768 = class112.field1838;
            class168.field2622++;
            class157.field2448 = class291.field4584;
            class231.field3677 = 2;
            client.field2435.method536((byte) -104, 83);
            client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            client.field2435.method663(Integer.MAX_VALUE & (int) (var6 >>> 32), 127);
            client.field2435.method634(var3 + class260.field4162, 83);
            client.field2435.method659((byte) 121, class46.field656 + var2);
        }
        if (var4 == 36) {
            client.field2435.method536((byte) -104, 55);
            client.field2435.method678(var3, true);
            client.field2435.method678(class81.field1350, true);
            class69.field1115++;
            client.field2435.method663(var5, 124);
            client.field2435.method663(class265.field4223, arg1 - 5346);
            client.field2435.method663(class33.field493, arg1 ^ 0x1533);
            client.field2435.method640(-120, var2);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 28) {
            class236 var16 = class210.field3267[var5];
            if (var16 != null) {
                class231.field3677 = 2;
                class177.field2768 = class112.field1838;
                class284.field4501 = 0;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 34);
                client.field2435.method654((byte) -119, class106.field1764[82] ? 1 : 0);
                client.field2435.method640(arg1 ^ 0xFFFFEAD5, var5);
                class37.field529++;
            }
        }
        if (var4 == 60) {
            class231.field3677 = 2;
            class157.field2448 = class291.field4584;
            class177.field2768 = class112.field1838;
            class152.field2384++;
            class284.field4501 = 0;
            client.field2435.method536((byte) -104, 127);
            client.field2435.method663(var3 + class260.field4162, 114);
            client.field2435.method640(arg1 - 5586, class33.field493);
            client.field2435.method678(class81.field1350, true);
            client.field2435.method659((byte) -112, class265.field4223);
            client.field2435.method659((byte) -111, Integer.MAX_VALUE & (int) (var6 >>> 32));
            client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            client.field2435.method663(class46.field656 + var2, arg1 ^ 0x152A);
        }
        if (var4 == 23) {
            class236 var17 = class210.field3267[var5];
            if (var17 != null) {
                class284.field4501 = 0;
                class231.field3677 = 2;
                class293.field4607++;
                class177.field2768 = class112.field1838;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 214);
                client.field2435.method640(-128, var5);
                client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            }
        }
        if (var4 == 11) {
            if (var5 == 0) {
                class177.field2772 = 1;
                class251.method1721(class240.field3892, var2, var3);
            } else if (var5 == 1) {
                class104.field1737++;
                client.field2435.method536((byte) -104, 4);
                client.field2435.method639(class102.field1704, (byte) -113);
                client.field2435.method659((byte) 125, class139.field2132);
                client.field2435.method663(class46.field656 + var2, 121);
                client.field2435.method634(class260.field4162 + var3, arg1 + -5387);
            }
        }
        if (var4 == 12) {
            class177.field2768 = class112.field1838;
            class56.field927++;
            class284.field4501 = 0;
            class231.field3677 = 2;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 0);
            client.field2435.method634(class139.field2132, 110);
            client.field2435.method657(class106.field1764[82] ? 1 : 0, -104);
            client.field2435.method663(class260.field4162 + var3, arg1 + -5344);
            client.field2435.method640(-123, Integer.MAX_VALUE & (int) (var6 >>> 32));
            client.field2435.method681(3, class102.field1704);
            client.field2435.method640(-120, class46.field656 + var2);
        }
        if (var4 == 29) {
            class45 var18 = class255.field4082[var5];
            if (var18 != null) {
                class157.field2448 = class291.field4584;
                class231.field3677 = 2;
                class297.field4690++;
                class177.field2768 = class112.field1838;
                class284.field4501 = 0;
                client.field2435.method536((byte) -104, 212);
                client.field2435.method657(class106.field1764[82] ? 1 : 0, arg1 ^ 0x1513);
                client.field2435.method634(var5, 44);
            }
        }
        if (var4 == 1003) {
            class61.field1046++;
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            class231.field3677 = 2;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 107);
            client.field2435.method634(var5, 41);
        }
        if (var4 == 15) {
            class284.field4501 = 0;
            class231.field3677 = 2;
            class177.field2768 = class112.field1838;
            class230.field3655++;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 160);
            client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            client.field2435.method659((byte) 124, class46.field656 + var2);
            client.field2435.method663(var5, arg1 ^ 0x152E);
            client.field2435.method659((byte) -16, class260.field4162 + var3);
        }
        if (var4 == 20) {
            class150.method1008(false);
            class228 var19 = class84.method596((byte) 35, var3);
            class73.field1227 = 1;
            class265.field4223 = var2;
            class33.field493 = var5;
            class81.field1350 = var3;
            class82.method591(var19, false);
            class243.field3951 = "<col=ff9040>" + class85.method602(false, var5).field1176 + "<col=ffffff>";
            if (class243.field3951 == null) {
                class243.field3951 = "null";
            }
            return;
        }
        if (var4 == 13) {
            client.field2435.method536((byte) -104, 246);
            class245.field3981++;
            client.field2435.method640(arg1 - 5592, var5);
            client.field2435.method659((byte) -103, var2);
            client.field2435.method678(var3, true);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 45) {
            class231.field3677 = 2;
            class284.field4501 = 0;
            class157.field2448 = class291.field4584;
            class2.field12++;
            class177.field2768 = class112.field1838;
            client.field2435.method536((byte) -104, 128);
            client.field2435.method634((int) (var6 >>> 32) & Integer.MAX_VALUE, 27);
            client.field2435.method663(class46.field656 + var2, 122);
            client.field2435.method663(class260.field4162 + var3, 111);
            client.field2435.method654((byte) -97, class106.field1764[82] ? 1 : 0);
        }
        if (var4 == 41 && class184.field2847 == null) {
            class53.method398(var2, var3, (byte) 97);
            class184.field2847 = class31.method239(var2, -1, var3);
            class82.method591(class184.field2847, false);
        }
        if (var4 == 30) {
            class236 var20 = class210.field3267[var5];
            if (var20 != null) {
                class231.field3677 = 2;
                class174.field2748++;
                class157.field2448 = class291.field4584;
                class284.field4501 = 0;
                class177.field2768 = class112.field1838;
                client.field2435.method536((byte) -104, 114);
                client.field2435.method676(class106.field1764[82] ? 1 : 0, (byte) 114);
                client.field2435.method663(var5, 113);
            }
        }
        if (var4 == 9) {
            class231.field3677 = 2;
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            class13.field212++;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 188);
            client.field2435.method654((byte) -108, class106.field1764[82] ? 1 : 0);
            client.field2435.method640(arg1 ^ 0xFFFFEADA, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            client.field2435.method640(arg1 ^ 0xFFFFEADA, class260.field4162 + var3);
            client.field2435.method659((byte) -120, class46.field656 + var2);
        }
        if (var4 == 1007) {
            class284.field4501 = 0;
            class231.field3677 = 2;
            class177.field2768 = class112.field1838;
            class157.field2448 = class291.field4584;
            class147.field2327++;
            client.field2435.method536((byte) -104, 167);
            client.field2435.method640(-120, var5);
        }
        if (var4 == 10) {
            class176.field2756++;
            client.field2435.method536((byte) -104, 154);
            client.field2435.method634(var5, 97);
            client.field2435.method635(var3, 28);
            client.field2435.method640(-117, var2);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 59) {
            class45 var21 = class255.field4082[var5];
            if (var21 != null) {
                class198.field3119++;
                class231.field3677 = 2;
                class157.field2448 = class291.field4584;
                class284.field4501 = 0;
                class177.field2768 = class112.field1838;
                client.field2435.method536((byte) -104, 164);
                client.field2435.method657(class106.field1764[82] ? 1 : 0, 94);
                client.field2435.method640(-119, var5);
            }
        }
        if (var4 == 25) {
            class278.field4412++;
            client.field2435.method536((byte) -104, 46);
            client.field2435.method663(var5, arg1 ^ 0x1525);
            client.field2435.method678(var3, true);
            client.field2435.method659((byte) -96, var2);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 3) {
            client.field2435.method536((byte) -104, 63);
            class2.field11++;
            client.field2435.method639(var3, (byte) -104);
            client.field2435.method681(arg1 - 5466, class102.field1704);
            client.field2435.method640(-128, var5);
            client.field2435.method634(class139.field2132, 58);
            client.field2435.method640(-125, var2);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 8) {
            class45 var22 = class255.field4082[var5];
            if (var22 != null) {
                class284.field4501 = 0;
                class231.field3677 = 2;
                class157.field2448 = class291.field4584;
                class177.field2768 = class112.field1838;
                client.field2435.method536((byte) -104, 58);
                class93.field1591++;
                client.field2435.method678(class102.field1704, true);
                client.field2435.method657(class106.field1764[82] ? 1 : 0, 113);
                client.field2435.method659((byte) 123, class139.field2132);
                client.field2435.method634(var5, 47);
            }
        }
        if (var4 == 22 || var4 == 1006) {
            class294.method1963(var5, class256.field4099[arg0], var3, var2, -120);
        }
        if (var4 == 50) {
            class236 var23 = class210.field3267[var5];
            if (var23 != null) {
                class284.field4501 = 0;
                class27.field366++;
                class177.field2768 = class112.field1838;
                class231.field3677 = 2;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 11);
                client.field2435.method659((byte) 126, var5);
                client.field2435.method676(class106.field1764[82] ? 1 : 0, (byte) 123);
            }
        }
        if (var4 == 19) {
            class288.field4560++;
            client.field2435.method536((byte) -104, 91);
            client.field2435.method663(class139.field2132, 111);
            client.field2435.method635(var3, 112);
            client.field2435.method663(var2, arg1 ^ 0x152A);
            client.field2435.method678(class102.field1704, true);
        }
        if (var4 == 39) {
            class236 var24 = class210.field3267[var5];
            if (var24 != null) {
                class231.field3677 = 2;
                class257.field4112++;
                class157.field2448 = class291.field4584;
                class177.field2768 = class112.field1838;
                class284.field4501 = 0;
                client.field2435.method536((byte) -104, 19);
                client.field2435.method676(class106.field1764[82] ? 1 : 0, (byte) 99);
                client.field2435.method663(var5, 127);
            }
        }
        if (var4 == 37) {
            class251.field4044++;
            client.field2435.method536((byte) -104, 110);
            client.field2435.method640(-128, var2);
            client.field2435.method659((byte) -13, var5);
            client.field2435.method678(var3, true);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 16) {
            class157.field2448 = class291.field4584;
            class231.field3677 = 2;
            class197.field3115++;
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            client.field2435.method536((byte) -104, 6);
            client.field2435.method659((byte) -115, class46.field656 + var2);
            client.field2435.method678(class102.field1704, true);
            client.field2435.method659((byte) 126, class139.field2132);
            client.field2435.method657(class106.field1764[82] ? 1 : 0, -125);
            client.field2435.method640(-119, class260.field4162 + var3);
            client.field2435.method659((byte) -7, var5);
        }
        if (arg1 != 5469) {
            field3148 = 112;
        }
        if (var4 == 58) {
            class236 var25 = class210.field3267[var5];
            if (var25 != null) {
                class231.field3677 = 2;
                class10.field174++;
                class177.field2768 = class112.field1838;
                class157.field2448 = class291.field4584;
                class284.field4501 = 0;
                client.field2435.method536((byte) -104, 57);
                client.field2435.method654((byte) -97, class106.field1764[82] ? 1 : 0);
                client.field2435.method634(var5, arg1 - 5358);
            }
        }
        if (var4 == 47) {
            class231.field3677 = 2;
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            class30.field435++;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 224);
            client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            client.field2435.method663(class260.field4162 + var3, arg1 + -5349);
            client.field2435.method634(var5, 26);
            client.field2435.method659((byte) 125, class46.field656 + var2);
        }
        if (var4 == 24) {
            class231.field3677 = 2;
            class284.field4501 = 0;
            class3.field15++;
            class157.field2448 = class291.field4584;
            class177.field2768 = class112.field1838;
            client.field2435.method536((byte) -104, 179);
            client.field2435.method654((byte) -112, class106.field1764[82] ? 1 : 0);
            client.field2435.method663(class260.field4162 + var3, arg1 ^ 0x1520);
            client.field2435.method659((byte) -14, var5);
            client.field2435.method663(class46.field656 + var2, 119);
        }
        if (var4 == 49) {
            client.field2435.method536((byte) -104, 10);
            client.field2435.method659((byte) 121, var2);
            client.field2435.method639(var3, (byte) -115);
            client.field2435.method663(var5, arg1 ^ 0x1526);
            class125.field1972++;
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 31) {
            class236 var26 = class210.field3267[var5];
            if (var26 != null) {
                class157.field2448 = class291.field4584;
                class177.field2768 = class112.field1838;
                class231.field3677 = 2;
                class284.field4501 = 0;
                client.field2435.method536((byte) -104, 172);
                client.field2435.method678(class81.field1350, true);
                client.field2435.method654((byte) -115, class106.field1764[82] ? 1 : 0);
                class34.field513++;
                client.field2435.method640(-128, class265.field4223);
                client.field2435.method663(var5, 115);
                client.field2435.method640(-122, class33.field493);
            }
        }
        if (var4 == 44) {
            client.field2435.method536((byte) -104, 90);
            class173.field2731++;
            client.field2435.method681(arg1 ^ 0x155E, var3);
            client.field2435.method659((byte) -122, var2);
            client.field2435.method634(var5, 122);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 57) {
            class231.field3677 = 2;
            class164.field2575++;
            class157.field2448 = class291.field4584;
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            client.field2435.method536((byte) -104, 106);
            client.field2435.method634(class46.field656 + var2, 21);
            client.field2435.method634((int) (var6 >>> 32) & Integer.MAX_VALUE, 38);
            client.field2435.method676(class106.field1764[82] ? 1 : 0, (byte) 125);
            client.field2435.method663(class260.field4162 + var3, arg1 ^ 0x1524);
        }
        if (var4 == 21) {
            class236 var27 = class210.field3267[var5];
            if (var27 != null) {
                class177.field2768 = class112.field1838;
                class53.field802++;
                class284.field4501 = 0;
                class231.field3677 = 2;
                class157.field2448 = class291.field4584;
                client.field2435.method536((byte) -104, 249);
                client.field2435.method676(class106.field1764[82] ? 1 : 0, (byte) 120);
                client.field2435.method640(-124, var5);
            }
        }
        if (var4 == 51) {
            class45 var28 = class255.field4082[var5];
            if (var28 != null) {
                class157.field2448 = class291.field4584;
                class177.field2768 = class112.field1838;
                class231.field3677 = 2;
                class284.field4501 = 0;
                class102.field1709++;
                client.field2435.method536((byte) -104, 133);
                client.field2435.method654((byte) -127, class106.field1764[82] ? 1 : 0);
                client.field2435.method659((byte) 125, var5);
            }
        }
        if (var4 == 40) {
            class228 var29 = class31.method239(var2, -1, var3);
            if (var29 != null) {
                class150.method1008(false);
                class271 var30 = client.method1059(var29);
                class284.method1911(var30.field4354, var30.method1828(-92), var29.field3548, var2, var29.field3631, var3, false);
                class73.field1227 = 0;
                class37.field518 = class284.method1910(var29, 0);
                if (var29.field3520) {
                    class190.field2950 = var29.field3592 + "<col=ffffff>";
                } else {
                    class190.field2950 = "<col=00ff00>" + var29.field3560 + "<col=ffffff>";
                }
                if (class37.field518 == null) {
                    class37.field518 = "Null";
                }
            }
            return;
        }
        if (var4 == 5) {
            class213.field3310++;
            client.field2435.method536((byte) -104, 198);
            client.field2435.method659((byte) -90, var5);
            client.field2435.method640(-118, var2);
            client.field2435.method639(var3, (byte) -114);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 18) {
            if (var5 == 0) {
                class79.field1330 = 1;
                class251.method1721(class240.field3892, var2, var3);
            } else if (class140.field2141 > 0 && class106.field1764[82] && class106.field1764[81]) {
                class139.method940(class240.field3892, class46.field656 + var2, (byte) 57, class260.field4162 + var3);
            } else {
                client.field2435.method536((byte) -104, 96);
                class103.field1714++;
                client.field2435.method634(class260.field4162 + var3, 84);
                client.field2435.method663(class46.field656 + var2, arg1 ^ 0x152B);
            }
        }
        if (var4 == 14) {
            class228 var31 = class84.method596((byte) 35, var3);
            boolean var32 = true;
            if (var31.field3549 > 0) {
                var32 = class248.method1708(var31, true);
            }
            if (var32) {
                client.field2435.method536((byte) -104, 81);
                client.field2435.method639(var3, (byte) -118);
                class146.field2322++;
            }
        }
        if (var4 == 43) {
            class110.field1800++;
            client.field2435.method536((byte) -104, 141);
            client.field2435.method663(var5, 127);
            client.field2435.method663(var2, 111);
            client.field2435.method639(var3, (byte) -108);
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 17) {
            class284.field4501 = 0;
            class177.field2768 = class112.field1838;
            class231.field3677 = 2;
            class202.field3162++;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 62);
            client.field2435.method676(class106.field1764[82] ? 1 : 0, (byte) 119);
            client.field2435.method640(arg1 - 5586, var5);
            client.field2435.method659((byte) -75, class260.field4162 + var3);
            client.field2435.method663(class46.field656 + var2, 111);
        }
        if (var4 == 1005) {
            class228 var33 = class84.method596((byte) 35, var3);
            if (var33 == null || var33.field3488[var2] < 100000) {
                class61.field1046++;
                client.field2435.method536((byte) -104, 107);
                client.field2435.method634(var5, arg1 ^ 0x1561);
            } else {
                class81.method579(-1, "", 0, var33.field3488[var2] + " x " + class85.method602(false, var5).field1176);
            }
            class288.field4565 = 0;
            class81.field1348 = class84.method596((byte) 35, var3);
            class275.field4379 = var2;
        }
        if (var4 == 32) {
            class146.field2322++;
            client.field2435.method536((byte) -104, 81);
            client.field2435.method639(var3, (byte) -106);
            class228 var34 = class84.method596((byte) 35, var3);
            if (var34.field3565 != null && var34.field3565[0][0] == 5) {
                int var35 = var34.field3565[0][1];
                if (class31.field462[var35] != var34.field3639[0]) {
                    class31.field462[var35] = var34.field3639[0];
                    class295.method1972(30734, var35);
                }
            }
        }
        if (var4 == 1002) {
            class157.field2448 = class291.field4584;
            class238.field3874++;
            class231.field3677 = 2;
            class177.field2768 = class112.field1838;
            class284.field4501 = 0;
            client.field2435.method536((byte) -104, 244);
            client.field2435.method640(-123, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            client.field2435.method654((byte) -103, class106.field1764[82] ? 1 : 0);
            client.field2435.method663(class260.field4162 + var3, 108);
            client.field2435.method663(class46.field656 + var2, arg1 ^ 0x152B);
        }
        if (var4 == 6) {
            class45 var36 = class255.field4082[var5];
            if (var36 != null) {
                class177.field2768 = class112.field1838;
                class284.field4501 = 0;
                class157.field2448 = class291.field4584;
                class231.field3677 = 2;
                client.field2435.method536((byte) -104, 153);
                client.field2435.method640(-123, var5);
                client.field2435.method654((byte) -110, class106.field1764[82] ? 1 : 0);
                class71.field1134++;
            }
        }
        if (var4 == 1) {
            class231.field3677 = 2;
            class73.field1229++;
            class284.field4501 = 0;
            class177.field2768 = class112.field1838;
            class157.field2448 = class291.field4584;
            client.field2435.method536((byte) -104, 138);
            client.field2435.method650(class106.field1764[82] ? 1 : 0, (byte) -72);
            client.field2435.method663(var2 + class46.field656, 127);
            client.field2435.method634(var3 + class260.field4162, arg1 ^ 0x1501);
            client.field2435.method640(-122, var5);
        }
        if (class73.field1227 != 0) {
            class73.field1227 = 0;
            class82.method591(class84.method596((byte) 35, class81.field1350), false);
        }
        if (class122.field1960) {
            class150.method1008(false);
        }
        if (class81.field1348 != null && class288.field4565 == 0) {
            class82.method591(class81.field1348, false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3147++;
        this.field3146.paint(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class142.field2166 * 128) {
            arg0 = class142.field2166 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class280.field4424 * 128) {
            arg2 = class280.field4424 * 128 - 1;
        }
        class221.field3404 = class195.field3091[arg3];
        class109.field1789 = class195.field3089[arg3];
        class256.field4103 = class195.field3091[arg4];
        class187.field2907 = class195.field3089[arg4];
        class6.field127 = arg0;
        class140.field2145 = arg1;
        class193.field3029 = arg2;
        class99.field1669 = arg0 / 128;
        class99.field1664 = arg2 / 128;
        class151.field2372 = class99.field1669 - class79.field1320;
        if (class151.field2372 < 0) {
            class151.field2372 = 0;
        }
        class163.field2560 = class99.field1664 - class79.field1320;
        if (class163.field2560 < 0) {
            class163.field2560 = 0;
        }
        class55.field918 = class99.field1669 + class79.field1320;
        if (class55.field918 > class142.field2166) {
            class55.field918 = class142.field2166;
        }
        class52.field781 = class99.field1664 + class79.field1320;
        if (class52.field781 > class280.field4424) {
            class52.field781 = class280.field4424;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class79.field1320 + class79.field1320 + 2; var16++) {
            for (int var19 = 0; var19 < class79.field1320 + class79.field1320 + 2; var19++) {
                int var20 = (var16 - class79.field1320 << 7) - (class6.field127 & 0x7F);
                int var21 = (var19 - class79.field1320 << 7) - (class193.field3029 & 0x7F);
                int var22 = class99.field1669 + var16 - class79.field1320;
                int var23 = class99.field1664 + var19 - class79.field1320;
                if (var22 >= 0 && var23 >= 0 && var22 < class142.field2166 && var23 < class280.field4424) {
                    int var24;
                    if (class116.field1890 == null) {
                        var24 = class5.field60[0][var22][var23] + 128 - class140.field2145;
                    } else {
                        var24 = class116.field1890[0][var22][var23] + 128 - class140.field2145;
                    }
                    int var25 = class5.field60[3][var22][var23] - class140.field2145 - 1000;
                    class205.field3196[var16][var19] = class264.method1783(var20, var25, var24, var21, var15);
                } else {
                    class205.field3196[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class79.field1320 + class79.field1320 + 1; var17++) {
            for (int var18 = 0; var18 < class79.field1320 + class79.field1320 + 1; var18++) {
                class94.field1605[var17][var18] = class205.field3196[var17][var18] || class205.field3196[var17 + 1][var18] || class205.field3196[var17][var18 + 1] || class205.field3196[var17 + 1][var18 + 1];
            }
        }
        class111.field1826 = arg6;
        class189.field2923 = arg7;
        class167.field2616 = arg8;
        class69.field1111 = arg9;
        class269.field4314 = arg10;
        class56.method430();
        if (class52.field798 != null) {
            class284.method1912(true);
            class118.method827(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class284.method1912(false);
        }
        class118.method827(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3150++;
        this.field3146.update(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class201(Component arg0) {
        this.field3146 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1361(byte arg0) {
        field3149 = null;
        if (arg0 >= -54) {
            field3148 = -107;
        }
    }
}
