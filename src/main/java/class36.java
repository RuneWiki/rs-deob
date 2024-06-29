import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class36 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lec;")
    public static class99 field517 = new class99(64);

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[Lva;")
    public static class220[] field524;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I", line = 6)
    public static final int method273(int arg0, int arg1) {
        field522++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 != 16) {
            return -76;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 51)
    public static void method274(int arg0) {
        field517 = null;
        field524 = null;
        if (arg0 != 0) {
            method278((byte) 43, (class95) null);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Lnf;", line = 70)
    public static final class262 method275(byte arg0, int arg1) {
        field525++;
        if (arg0 != 1) {
            method280((byte) 12);
        }
        return (class262) class224.field3418.method1716(-1, (long) arg1);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Ljava/lang/String;", line = 81)
    public static final String method276(int arg0) {
        field527++;
        if (arg0 != 1) {
            field524 = (class220[]) null;
        }
        String var1 = "www";
        if (class312.field4837 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class160.field2420 != null) {
            var2 = "/p=" + class160.field2420;
        }
        return "http://" + var1 + ".runescape.com/l=" + class81.field1197 + "/a=" + class76.field1109 + var2 + "/";
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V", line = 105)
    public static final void method277(int arg0, int arg1) {
        field518++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class25.field290[arg1];
        int var3 = class118.field1843[arg1];
        int var4 = class323.field4993[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        long var5 = class115.field1805[arg1];
        int var7 = (int) class115.field1805[arg1];
        if (var3 == 26) {
            if (var7 == 0) {
                class304.field4647 = 1;
                class138.method1045(class265.field4112, var2, var4);
            } else if (var7 == 1) {
                class85.field1236.method1141((byte) 91, 206);
                class233.field3549++;
                class85.field1236.method1785(class183.field2893, (byte) 89);
                class85.field1236.method1784(class327.field5054 + var2, (byte) -94);
                class85.field1236.method1744(true, class293.field4522 + var4);
                class85.field1236.method1765(class333.field5194, -21654);
            }
        }
        if (var3 == 12) {
            class76 var8 = class264.field4064[var7];
            if (var8 != null) {
                class111.field1683 = class109.field1643;
                class181.field2866++;
                class89.field1268 = 0;
                class223.field3406 = class47.field640;
                class139.field2093 = 2;
                class85.field1236.method1141((byte) 34, 109);
                class85.field1236.method1747(arg0 ^ 0x7AD6, class180.field2860[82] ? 1 : 0);
                class85.field1236.method1744(true, var7);
            }
        }
        if (var3 == 25) {
            class111.field1683 = class109.field1643;
            class139.field2093 = 2;
            class339.field5260++;
            class223.field3406 = class47.field640;
            class89.field1268 = 0;
            class85.field1236.method1141((byte) 55, 201);
            class85.field1236.method1744(true, class293.field4522 + var4);
            class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
            class85.field1236.method1744(true, class327.field5054 + var2);
            class85.field1236.method1762((int) (var5 >>> 32) & Integer.MAX_VALUE, -1545504632);
        }
        if (var3 == 35) {
            class270 var9 = class201.field3096[var7];
            if (var9 != null) {
                class223.field3406 = class47.field640;
                class139.field2093 = 2;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class133.field2027++;
                class85.field1236.method1141((byte) 76, 250);
                class85.field1236.method1747(arg0 ^ 0x7AFA, class180.field2860[82] ? 1 : 0);
                class85.field1236.method1744(true, var7);
            }
        }
        if (var3 == 3) {
            class270 var10 = class201.field3096[var7];
            if (var10 != null) {
                class165.field2685++;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class139.field2093 = 2;
                class223.field3406 = class47.field640;
                class85.field1236.method1141((byte) 56, 161);
                class85.field1236.method1744(true, var7);
                class85.field1236.method1747(-127, class180.field2860[82] ? 1 : 0);
            }
        }
        if (var3 == 57) {
            class56.field729++;
            class85.field1236.method1141((byte) 36, 192);
            class85.field1236.method1784(var2, (byte) -63);
            class85.field1236.method1762(var7, -1545504632);
            class85.field1236.method1769(var4, (byte) -34);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -128, var4);
            class160.field2424 = var2;
        }
        if (var3 == 38) {
            class270 var11 = class201.field3096[var7];
            if (var11 != null) {
                class139.field2093 = 2;
                class89.field1268 = 0;
                class161.field2438++;
                class111.field1683 = class109.field1643;
                class223.field3406 = class47.field640;
                class85.field1236.method1141((byte) 50, 74);
                class85.field1236.method1773(class171.field2759, false);
                class85.field1236.method1785(class318.field4911, (byte) 109);
                class85.field1236.method1762(class157.field2392, -1545504632);
                class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -15);
                class85.field1236.method1762(var7, arg0 - 1545473211);
            }
        }
        if (var3 == 29 || var3 == 1007) {
            class183.method1360(var2, var4, arg0 + 31360, class311.field4832[arg1], var7);
        }
        if (var3 == 19) {
            class76 var12 = class264.field4064[var7];
            if (var12 != null) {
                class89.field1268 = 0;
                class62.field828++;
                class139.field2093 = 2;
                class223.field3406 = class47.field640;
                class111.field1683 = class109.field1643;
                class85.field1236.method1141((byte) 81, 66);
                class85.field1236.method1752(class180.field2860[82] ? 1 : 0, -123);
                class85.field1236.method1784(var7, (byte) -84);
                class85.field1236.method1765(class171.field2759, arg0 + 9767);
                class85.field1236.method1762(class318.field4911, arg0 ^ 0x5C1EFDCB);
                class85.field1236.method1744(true, class157.field2392);
            }
        }
        if (var3 == 46) {
            class270 var13 = class201.field3096[var7];
            if (var13 != null) {
                class139.field2093 = 2;
                class38.field543++;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class223.field3406 = class47.field640;
                class85.field1236.method1141((byte) 81, 30);
                class85.field1236.method1762(var7, -1545504632);
                class85.field1236.method1747(-114, class180.field2860[82] ? 1 : 0);
            }
        }
        if (var3 == 41) {
            class270 var14 = class201.field3096[var7];
            if (var14 != null) {
                class139.field2093 = 2;
                class217.field3329++;
                class223.field3406 = class47.field640;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class85.field1236.method1141((byte) 31, 92);
                class85.field1236.method1784(var7, (byte) -93);
                class85.field1236.method1747(-44, class180.field2860[82] ? 1 : 0);
            }
        }
        if (var3 == 21) {
            class120.field1854++;
            class85.field1236.method1141((byte) 65, 237);
            class85.field1236.method1744(true, var7);
            class85.field1236.method1775(false, var4);
            class85.field1236.method1762(var2, arg0 ^ 0x5C1EFDCB);
            class85.field1236.method1762(class318.field4911, -1545504632);
            class85.field1236.method1775(false, class171.field2759);
            class85.field1236.method1744(true, class157.field2392);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -128, var4);
            class160.field2424 = var2;
        }
        if (arg0 != -31421) {
            return;
        }
        if (var3 == 1004) {
            class111.field1683 = class109.field1643;
            class89.field1268 = 0;
            class139.field2093 = 2;
            class223.field3406 = class47.field640;
            class76 var15 = class264.field4064[var7];
            if (var15 != null) {
                class332 var16 = var15.field1104;
                if (var16.field5162 != null) {
                    var16 = var16.method2324((byte) -120);
                }
                if (var16 != null) {
                    class85.field1236.method1141((byte) 127, 203);
                    class77.field1131++;
                    class85.field1236.method1762(var16.field5147, arg0 - 1545473211);
                }
            }
        }
        if (var3 == 9) {
            class111.field1683 = class109.field1643;
            class139.field2093 = 2;
            class31.field376++;
            class223.field3406 = class47.field640;
            class89.field1268 = 0;
            class85.field1236.method1141((byte) 115, 219);
            class85.field1236.method1784(var4 + class293.field4522, (byte) -118);
            class85.field1236.method1784(class327.field5054 + var2, (byte) -100);
            class85.field1236.method1762((int) (var5 >>> 32) & Integer.MAX_VALUE, -1545504632);
            class85.field1236.method1747(-72, class180.field2860[82] ? 1 : 0);
        }
        if (var3 == 30) {
            class284.field4436++;
            class85.field1236.method1141((byte) 119, 13);
            class85.field1236.method1744(true, var2);
            class85.field1236.method1775(false, var4);
            class85.field1236.method1744(true, var7);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) 80, var4);
            class160.field2424 = var2;
        }
        if (var3 == 18) {
            class85.field1236.method1141((byte) 127, 183);
            class85.field1236.method1769(var4, (byte) -34);
            class254.field3828++;
            class85.field1236.method1785(var7, (byte) 107);
            class85.field1236.method1762(var2, -1545504632);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -125, var4);
            class160.field2424 = var2;
        }
        if (var3 == 33) {
            class85.field1236.method1141((byte) 32, 49);
            class293.field4528++;
            class85.field1236.method1775(false, var4);
            class85.field1236.method1762(var2, -1545504632);
            class85.field1236.method1784(var7, (byte) -98);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) 33, var4);
            class160.field2424 = var2;
        }
        if (var3 == 1003) {
            class161 var17 = class331.method2308((byte) 28, var4);
            if (var17 == null || var17.field2480[var2] < 100000) {
                class85.field1236.method1141((byte) 72, 236);
                class213.field3264++;
                class85.field1236.method1744(true, var7);
            } else {
                class262.method1840("", var17.field2480[var2] + " x " + class222.method1576(var7, (byte) 92).field1630, 0, -6);
            }
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -124, var4);
            class160.field2424 = var2;
        }
        if (var3 == 47) {
            class297.method2051(0);
            class161 var36 = class331.method2308((byte) -121, var4);
            class171.field2759 = var4;
            class320.field4939 = 1;
            class157.field2392 = var7;
            class318.field4911 = var2;
            class254.method1776(4, var36);
            class170.field2757 = "<col=ff9040>" + class222.method1576(var7, (byte) 92).field1630 + "<col=ffffff>";
            if (class170.field2757 == null) {
                class170.field2757 = "null";
            }
            return;
        }
        if (var3 == 1006) {
            class111.field1683 = class109.field1643;
            class139.field2093 = 2;
            class89.field1268 = 0;
            class280.field4354++;
            class223.field3406 = class47.field640;
            class85.field1236.method1141((byte) 53, 194);
            class85.field1236.method1762((int) (var5 >>> 32) & Integer.MAX_VALUE, arg0 - 1545473211);
            class85.field1236.method1744(true, class327.field5054 + var2);
            class85.field1236.method1747(-26, class180.field2860[82] ? 1 : 0);
            class85.field1236.method1785(class293.field4522 + var4, (byte) 98);
        }
        if (var3 == 10) {
            class161 var18 = class331.method2308((byte) -122, var4);
            boolean var19 = true;
            if (var18.field2598 > 0) {
                var19 = class34.method266(1, var18);
            }
            if (var19) {
                class85.field1236.method1141((byte) 67, 125);
                class332.field5156++;
                class85.field1236.method1773(var4, false);
            }
        }
        if (var3 == 50) {
            class85.field1236.method1141((byte) 73, 125);
            class332.field5156++;
            class85.field1236.method1773(var4, false);
            class161 var20 = class331.method2308((byte) -34, var4);
            if (var20.field2511 != null && var20.field2511[0][0] == 5) {
                int var21 = var20.field2511[0][1];
                if (class154.field2330[var21] != var20.field2554[0]) {
                    class154.field2330[var21] = var20.field2554[0];
                    class167.method1268(-118, var21);
                }
            }
        }
        if (var3 == 8) {
            class76 var22 = class264.field4064[var7];
            if (var22 != null) {
                class223.field3406 = class47.field640;
                class332.field5128++;
                class139.field2093 = 2;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class85.field1236.method1141((byte) 103, 37);
                class85.field1236.method1747(-74, class180.field2860[82] ? 1 : 0);
                class85.field1236.method1784(var7, (byte) -86);
            }
        }
        if (var3 == 11) {
            class122.field1871++;
            class89.field1268 = 0;
            class139.field2093 = 2;
            class223.field3406 = class47.field640;
            class111.field1683 = class109.field1643;
            class85.field1236.method1141((byte) 117, 82);
            class85.field1236.method1784(var2 + class327.field5054, (byte) -101);
            class85.field1236.method1784((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -71);
            class85.field1236.method1762(class293.field4522 + var4, -1545504632);
            class85.field1236.method1752(class180.field2860[82] ? 1 : 0, -104);
        }
        if (var3 == 34) {
            class248.field3726++;
            class85.field1236.method1141((byte) 76, 91);
            class85.field1236.method1765(class333.field5194, -21654);
            class85.field1236.method1773(var4, false);
            class85.field1236.method1744(true, class183.field2893);
            class85.field1236.method1785(var2, (byte) 68);
        }
        if (var3 == 4) {
            class85.field1236.method1141((byte) 81, 117);
            class147.field2240++;
            class85.field1236.method1765(var4, -21654);
            class85.field1236.method1785(var2, (byte) 103);
            class85.field1236.method1744(true, var7);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -126, var4);
            class160.field2424 = var2;
        }
        if (var3 == 31) {
            class161 var23 = class94.method680(var4, 0, var2);
            if (var23 != null) {
                class297.method2051(arg0 ^ 0xFFFF8543);
                class4 var24 = client.method1012(var23);
                class205.method1475(var2, var4, arg0 + 31296, var24.field48, var23.field2563, var24.method34(27), var23.field2604);
                class320.field4939 = 0;
                class60.field794 = class28.method214((byte) -126, var23);
                if (class60.field794 == null) {
                    class60.field794 = "Null";
                }
                if (var23.field2550) {
                    class267.field4153 = var23.field2545 + "<col=ffffff>";
                } else {
                    class267.field4153 = "<col=00ff00>" + var23.field2620 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var3 == 59) {
            class111.field1683 = class109.field1643;
            class89.field1268 = 0;
            class223.field3406 = class47.field640;
            class139.field2093 = 2;
            class268.field4165++;
            class85.field1236.method1141((byte) 33, 189);
            class85.field1236.method1762(class327.field5054 + var2, -1545504632);
            class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -64);
            class85.field1236.method1785(class293.field4522 + var4, (byte) 62);
            class85.field1236.method1762(var7, -1545504632);
        }
        if (var3 == 44) {
            class223.field3406 = class47.field640;
            class280.field4360++;
            class111.field1683 = class109.field1643;
            class139.field2093 = 2;
            class89.field1268 = 0;
            class85.field1236.method1141((byte) 39, 76);
            class85.field1236.method1762(Integer.MAX_VALUE & (int) (var5 >>> 32), -1545504632);
            class85.field1236.method1744(true, class327.field5054 + var2);
            class85.field1236.method1752(class180.field2860[82] ? 1 : 0, arg0 ^ 0x7AD2);
            class85.field1236.method1744(true, class293.field4522 + var4);
        }
        if (var3 == 43) {
            class111.field1683 = class109.field1643;
            class89.field1268 = 0;
            class139.field2093 = 2;
            class223.field3406 = class47.field640;
            class28.field324++;
            class85.field1236.method1141((byte) 63, 48);
            class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
            class85.field1236.method1762(class327.field5054 + var2, -1545504632);
            class85.field1236.method1785(class183.field2893, (byte) 120);
            class85.field1236.method1784(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -95);
            class85.field1236.method1762(class293.field4522 + var4, -1545504632);
            class85.field1236.method1773(class333.field5194, false);
        }
        if (var3 == 23) {
            class294.field4531++;
            class85.field1236.method1141((byte) 110, 43);
            class85.field1236.method1784(var7, (byte) -79);
            class85.field1236.method1775(false, var4);
            class85.field1236.method1762(var2, -1545504632);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -122, var4);
            class160.field2424 = var2;
        }
        if (var3 == 2) {
            class85.field1236.method1141((byte) 51, 97);
            class99.field1433++;
            class85.field1236.method1744(true, var7);
            class85.field1236.method1775(false, var4);
            class85.field1236.method1785(var2, (byte) 66);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) 43, var4);
            class160.field2424 = var2;
        }
        if (var3 == 36) {
            class270 var25 = class201.field3096[var7];
            if (var25 != null) {
                class139.field2093 = 2;
                class89.field1268 = 0;
                class223.field3406 = class47.field640;
                class76.field1099++;
                class111.field1683 = class109.field1643;
                class85.field1236.method1141((byte) 42, 96);
                class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -42);
                class85.field1236.method1785(var7, (byte) 62);
            }
        }
        if (var3 == 14) {
            class111.field1683 = class109.field1643;
            class89.field1268 = 0;
            class139.field2093 = 2;
            class258.field3961++;
            class223.field3406 = class47.field640;
            class85.field1236.method1141((byte) 91, 98);
            class85.field1236.method1785(var2 + class327.field5054, (byte) 66);
            class85.field1236.method1747(-100, class180.field2860[82] ? 1 : 0);
            class85.field1236.method1762(var7, arg0 ^ 0x5C1EFDCB);
            class85.field1236.method1744(true, class293.field4522 + var4);
        }
        if (var3 == 28) {
            class270 var26 = class201.field3096[var7];
            if (var26 != null) {
                class223.field3406 = class47.field640;
                class89.field1268 = 0;
                class139.field2093 = 2;
                class280.field4358++;
                class111.field1683 = class109.field1643;
                class85.field1236.method1141((byte) 117, 5);
                class85.field1236.method1785(var7, (byte) 57);
                class85.field1236.method1752(class180.field2860[82] ? 1 : 0, arg0 + 31311);
            }
        }
        if (var3 == 7) {
            class237.field3599++;
            class85.field1236.method1141((byte) 90, 19);
            class85.field1236.method1773(var4, false);
            class85.field1236.method1785(var2, (byte) 95);
            class85.field1236.method1744(true, var7);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) 32, var4);
            class160.field2424 = var2;
        }
        if (var3 == 39) {
            class76 var27 = class264.field4064[var7];
            if (var27 != null) {
                class139.field2093 = 2;
                class192.field3000++;
                class223.field3406 = class47.field640;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class85.field1236.method1141((byte) 118, 205);
                class85.field1236.method1752(class180.field2860[82] ? 1 : 0, -78);
                class85.field1236.method1784(var7, (byte) -119);
            }
        }
        if (var3 == 16) {
            class345.field5352++;
            class85.field1236.method1141((byte) 37, 188);
            class85.field1236.method1773(class333.field5194, false);
            class85.field1236.method1784(class183.field2893, (byte) -61);
            class85.field1236.method1762(var7, arg0 - 1545473211);
            class85.field1236.method1784(var2, (byte) -110);
            class85.field1236.method1775(false, var4);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) -124, var4);
            class160.field2424 = var2;
        }
        if (var3 == 24) {
            class76 var28 = class264.field4064[var7];
            if (var28 != null) {
                class111.field1683 = class109.field1643;
                class139.field2093 = 2;
                class223.field3406 = class47.field640;
                class89.field1268 = 0;
                class204.field3133++;
                class85.field1236.method1141((byte) 83, 113);
                class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
                class85.field1236.method1784(var7, (byte) -80);
            }
        }
        if (var3 == 58) {
            class76 var29 = class264.field4064[var7];
            if (var29 != null) {
                class311.field4830++;
                class223.field3406 = class47.field640;
                class139.field2093 = 2;
                class111.field1683 = class109.field1643;
                class89.field1268 = 0;
                class85.field1236.method1141((byte) 53, 247);
                class85.field1236.method1765(class333.field5194, arg0 + 9767);
                class85.field1236.method1752(class180.field2860[82] ? 1 : 0, -107);
                class85.field1236.method1762(class183.field2893, -1545504632);
                class85.field1236.method1762(var7, arg0 - 1545473211);
            }
        }
        if (var3 == 5) {
            class139.field2093 = 2;
            class111.field1683 = class109.field1643;
            class223.field3406 = class47.field640;
            class284.field4438++;
            class89.field1268 = 0;
            class85.field1236.method1141((byte) 40, 185);
            class85.field1236.method1785(class183.field2893, (byte) 100);
            class85.field1236.method1762(class327.field5054 + var2, -1545504632);
            class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -36);
            class85.field1236.method1784(var7, (byte) -55);
            class85.field1236.method1785(class293.field4522 + var4, (byte) 106);
            class85.field1236.method1775(false, class333.field5194);
        }
        if (var3 == 20) {
            class111.field1683 = class109.field1643;
            class223.field3406 = class47.field640;
            class276.field4283++;
            class89.field1268 = 0;
            class139.field2093 = 2;
            class85.field1236.method1141((byte) 41, 25);
            class85.field1236.method1744(true, var4 + class293.field4522);
            class85.field1236.method1744(true, var7);
            class85.field1236.method1752(class180.field2860[82] ? 1 : 0, -80);
            class85.field1236.method1744(true, var2 + class327.field5054);
        }
        if (var3 == 17) {
            class270 var30 = class201.field3096[var7];
            if (var30 != null) {
                class5.field82++;
                class139.field2093 = 2;
                class89.field1268 = 0;
                class111.field1683 = class109.field1643;
                class223.field3406 = class47.field640;
                class85.field1236.method1141((byte) 103, 184);
                class85.field1236.method1762(var7, -1545504632);
                class85.field1236.method1752(class180.field2860[82] ? 1 : 0, arg0 ^ 0x7AED);
            }
        }
        if (var3 == 1) {
            class139.field2093 = 2;
            class224.field3425++;
            class89.field1268 = 0;
            class223.field3406 = class47.field640;
            class111.field1683 = class109.field1643;
            class85.field1236.method1141((byte) 95, 99);
            class85.field1236.method1784(class293.field4522 + var4, (byte) -103);
            class85.field1236.method1784(var7, (byte) -71);
            class85.field1236.method1762(var2 + class327.field5054, arg0 ^ 0x5C1EFDCB);
            class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -56);
        }
        if (var3 == 15) {
            class270 var31 = class201.field3096[var7];
            if (var31 != null) {
                class139.field2093 = 2;
                class111.field1683 = class109.field1643;
                class331.field5113++;
                class89.field1268 = 0;
                class223.field3406 = class47.field640;
                class85.field1236.method1141((byte) 119, 196);
                class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -115);
                class85.field1236.method1784(var7, (byte) -88);
            }
        }
        if (var3 == 1002) {
            class111.field1683 = class109.field1643;
            class89.field1268 = 0;
            class223.field3406 = class47.field640;
            class213.field3264++;
            class139.field2093 = 2;
            class85.field1236.method1141((byte) 31, 236);
            class85.field1236.method1744(true, var7);
        }
        if (var3 == 51 && class29.field352 == null) {
            class318.method2214(var4, var2, (byte) -16);
            class29.field352 = class94.method680(var4, 0, var2);
            class254.method1776(4, class29.field352);
        }
        if (var3 == 45) {
            class214.method1529(190);
        }
        if (var3 == 1001) {
            class62.field824++;
            class139.field2093 = 2;
            class89.field1268 = 0;
            class223.field3406 = class47.field640;
            class111.field1683 = class109.field1643;
            class85.field1236.method1141((byte) 56, 111);
            class85.field1236.method1784(var7, (byte) -75);
        }
        if (var3 == 48) {
            class332.field5156++;
            class85.field1236.method1141((byte) 48, 125);
            class85.field1236.method1773(var4, false);
            class161 var32 = class331.method2308((byte) -126, var4);
            if (var32.field2511 != null && var32.field2511[0][0] == 5) {
                int var33 = var32.field2511[0][1];
                class154.field2330[var33] = 1 - class154.field2330[var33];
                class167.method1268(-100, var33);
            }
        }
        if (var3 == 49) {
            class85.field1236.method1141((byte) 105, 69);
            class85.field1236.method1784(var2, (byte) -89);
            class323.field4997++;
            class85.field1236.method1769(var4, (byte) -34);
            class85.field1236.method1762(var7, -1545504632);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) 7, var4);
            class160.field2424 = var2;
        }
        if (var3 == 37) {
            class139.field2093 = 2;
            class89.field1267++;
            class89.field1268 = 0;
            class223.field3406 = class47.field640;
            class111.field1683 = class109.field1643;
            class85.field1236.method1141((byte) 96, 100);
            class85.field1236.method1785(class318.field4911, (byte) 56);
            class85.field1236.method1744(true, class157.field2392);
            class85.field1236.method1773(class171.field2759, false);
            class85.field1236.method1784(class293.field4522 + var4, (byte) -82);
            class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
            class85.field1236.method1762(Integer.MAX_VALUE & (int) (var5 >>> 32), -1545504632);
            class85.field1236.method1744(true, class327.field5054 + var2);
        }
        if (var3 == 32) {
            class270 var34 = class201.field3096[var7];
            if (var34 != null) {
                class89.field1268 = 0;
                class223.field3406 = class47.field640;
                class257.field3930++;
                class111.field1683 = class109.field1643;
                class139.field2093 = 2;
                class85.field1236.method1141((byte) 81, 176);
                class85.field1236.method1744(true, class183.field2893);
                class85.field1236.method1785(var7, (byte) 74);
                class85.field1236.method1769(class333.field5194, (byte) -34);
                class85.field1236.method1747(-102, class180.field2860[82] ? 1 : 0);
            }
        }
        if (var3 == 13) {
            if (var7 == 0) {
                class216.field3306 = 1;
                class138.method1045(class265.field4112, var2, var4);
            } else if (class295.field4546 > 0 && class180.field2860[82] && class180.field2860[81]) {
                class106.method790(class265.field4112, class293.field4522 + var4, (byte) -71, class327.field5054 + var2);
            } else {
                class206.field3156++;
                class85.field1236.method1141((byte) 44, 29);
                class85.field1236.method1784(class293.field4522 + var4, (byte) -93);
                class85.field1236.method1744(true, class327.field5054 + var2);
            }
        }
        if (var3 == 42) {
            class76 var35 = class264.field4064[var7];
            if (var35 != null) {
                class223.field3406 = class47.field640;
                class239.field3635++;
                class111.field1683 = class109.field1643;
                class89.field1268 = 0;
                class139.field2093 = 2;
                class85.field1236.method1141((byte) 119, 136);
                class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
                class85.field1236.method1762(var7, -1545504632);
            }
        }
        if (var3 == 40) {
            class85.field1236.method1141((byte) 65, 174);
            class302.field4629++;
            class85.field1236.method1784(var2, (byte) -67);
            class85.field1236.method1765(var4, -21654);
            class85.field1236.method1784(var7, (byte) -61);
            field523 = 0;
            class307.field4782 = class331.method2308((byte) 57, var4);
            class160.field2424 = var2;
        }
        if (var3 == 60) {
            class139.field2093 = 2;
            class89.field1268 = 0;
            class111.field1683 = class109.field1643;
            class78.field1136++;
            class223.field3406 = class47.field640;
            class85.field1236.method1141((byte) 75, 246);
            class85.field1236.method1775(false, class171.field2759);
            class85.field1236.method1744(true, var4 + class293.field4522);
            class85.field1236.method1784(class157.field2392, (byte) -54);
            class85.field1236.method1785(var7, (byte) 74);
            class85.field1236.method1762(class318.field4911, -1545504632);
            class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
            class85.field1236.method1762(class327.field5054 + var2, -1545504632);
        }
        if (var3 == 6) {
            if (var7 == 0) {
                class138.method1045(class265.field4112, var2, var4);
            } else if (var7 == 1) {
                if (class295.field4546 > 0 && class180.field2860[82] && class180.field2860[81]) {
                    class106.method790(class265.field4112, class293.field4522 + var4, (byte) -103, class327.field5054 + var2);
                } else {
                    class307.method2104(1, 0, var4, var2);
                    class85.field1236.method1752(class134.field2038, arg0 ^ 0x7AE8);
                    class85.field1236.method1752(class190.field2978, arg0 + 31333);
                    class85.field1236.method1744(true, (int) class243.field3695);
                    class85.field1236.method1752(57, -96);
                    class85.field1236.method1752(class63.field846, -97);
                    class85.field1236.method1752(class94.field1332, -111);
                    class85.field1236.method1752(89, arg0 ^ 0x7AF3);
                    class85.field1236.method1744(true, class39.field575.field4713);
                    class85.field1236.method1744(true, class39.field575.field4731);
                    class85.field1236.method1752(class144.field2202, -88);
                    class85.field1236.method1752(63, -85);
                }
            }
        }
        if (var3 == 22) {
            class89.field1268 = 0;
            class223.field3406 = class47.field640;
            class139.field2093 = 2;
            class111.field1683 = class109.field1643;
            class49.field672++;
            class85.field1236.method1141((byte) 126, 11);
            class85.field1236.method1744(true, class327.field5054 + var2);
            class85.field1236.method1783(class180.field2860[82] ? 1 : 0, (byte) -116);
            class85.field1236.method1785(var7, (byte) 78);
            class85.field1236.method1785(class293.field4522 + var4, (byte) 72);
        }
        if (class320.field4939 != 0) {
            class320.field4939 = 0;
            class254.method1776(4, class331.method2308((byte) -122, class171.field2759));
        }
        if (class7.field110) {
            class297.method2051(arg0 + 31421);
        }
        if (class307.field4782 != null && field523 == 0) {
            class254.method1776(arg0 + 31425, class307.field4782);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLjd;)V", line = 1132)
    public static final void method278(byte arg0, class95 arg1) {
        class218.field3332 = arg1;
        class303.field4642 = class218.field3332.method685((byte) 15, 4);
        field519++;
        if (arg0 > -3) {
            field517 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIB)V", line = 1146)
    public static final void method279(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field526++;
        if (class73.field1058) {
            class175.method1316(arg1, arg3, arg1 + arg0, arg3 - -arg2);
            class175.method1322(arg1, arg3, arg0, arg2, 0);
        } else {
            class287.method1980(arg1, arg3, arg0 + arg1, arg2 + arg3);
            class287.method1987(arg1, arg3, arg0, arg2, 0);
        }
        if (class215.field3299 < 100) {
            return;
        }
        if (class76.field1097 == null || class76.field1097.field4175 != arg0 || class76.field1097.field4184 != arg2) {
            class195 var5 = new class195(arg0, arg2);
            class287.method1986(var5.field3017, arg0, arg2);
            class250.method1714(0, 0, arg0, 0, 0, class243.field3691, arg2, class229.field3494, 0);
            if (class73.field1058) {
                class76.field1097 = new class44(var5);
            } else {
                class76.field1097 = var5;
            }
            if (class73.field1058) {
                class287.field4453 = null;
            } else {
                class13.field186.method1554(9969);
            }
        }
        class76.field1097.method121(arg1, arg3);
        int var6 = class173.field2789 * arg2 / class229.field3494 + arg3;
        int var7 = class177.field2827 * arg0 / class243.field3691;
        int var8 = class341.field5296 * arg0 / class243.field3691 + arg1;
        if (arg4 != 91) {
            method278((byte) 123, (class95) null);
        }
        int var9 = 16711680;
        if (class248.field3754 == 1) {
            var9 = 16777215;
        }
        int var10 = class13.field175 * arg2 / class229.field3494;
        if (class73.field1058) {
            class175.method1311(var8, var6, var7, var10, var9, 128);
            class175.method1320(var8, var6, var7, var10, var9);
        } else {
            class287.method1978(var8, var6, var7, var10, var9, 128);
            class287.method1981(var8, var6, var7, var10, var9);
        }
        if (class336.field5234 <= 0) {
            return;
        }
        int var11;
        if (class153.field2322 > 10) {
            var11 = 500 - (class153.field2322 * 25);
        } else {
            var11 = class153.field2322 * 25;
        }
        for (class83 var12 = (class83) class216.field3312.method1954(-66); var12 != null; var12 = (class83) class216.field3312.method1950((byte) 114)) {
            if (class248.field3756 == var12.field1222) {
                int var13 = arg1 + (var12.field1223 * arg0 / class243.field3691);
                int var14 = var12.field1218 * arg2 / class229.field3494 + arg3;
                if (class73.field1058) {
                    class175.method1311(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class287.method1978(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)I", line = 1261)
    public static final int method280(byte arg0) {
        field520++;
        if ((double) class341.field5303 == 3.0D) {
            return 37;
        } else if ((double) class341.field5303 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 82) {
                field523 = -119;
            }
            if ((double) class341.field5303 == 6.0D) {
                return 75;
            } else if ((double) class341.field5303 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)V", line = 1292)
    public static final void method281(int arg0, byte arg1, int arg2) {
        field521++;
        class188 var3 = class147.method1111(-125, arg0, 13);
        var3.method1392((byte) -48);
        if (arg1 != 30) {
            field517 = (class99) null;
        }
        var3.field2959 = arg2;
    }
}
