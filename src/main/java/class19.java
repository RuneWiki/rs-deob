import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class19 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[I")
    private int[] field297 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Z")
    public boolean field300 = false;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public int field310 = -1;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field304 = 99;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lvh;")
    public static class108 field299;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lvh;")
    public static class108 field301;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[I")
    private int[] field298;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field312;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[S")
    private short[] field305;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[S")
    private short[] field306;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[S")
    private short[] field307;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "[S")
    private short[] field309;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Leh;I)V")
    public final void method134(class101 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method669((byte) 36);
            if (var3 == 0) {
                if (arg1 != -24072) {
                    return;
                }
                field303++;
                return;
            }
            this.method138(var3, arg0, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Lkh;")
    public final class221 method135(boolean arg0) {
        class221[] var2 = new class221[5];
        int var3 = 0;
        field293++;
        int var4 = 0;
        if (arg0) {
            field299 = null;
        }
        while (var4 < 5) {
            if (this.field297[var4] != -1) {
                var2[var3++] = class221.method1487(class142.field2442, this.field297[var4], 0);
            }
            var4++;
        }
        class221 var5 = new class221(var2, var3);
        if (this.field307 != null) {
            for (int var6 = 0; var6 < this.field307.length; var6++) {
                var5.method1465(this.field307[var6], this.field305[var6]);
            }
        }
        if (this.field306 != null) {
            for (int var7 = 0; var7 < this.field306.length; var7++) {
                var5.method1484(this.field306[var7], this.field309[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method136(int arg0) {
        field299 = null;
        field312 = null;
        if (arg0 == 24616) {
            field301 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
    public static final void method137(boolean arg0, int arg1) {
        field311++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class60.field1052[arg1];
        int var3 = class145.field2477[arg1];
        int var4 = class101.field1788[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class153.field2563[arg1];
        long var6 = class153.field2563[arg1];
        if (var4 == 1) {
            class288 var8 = class105.field1874[var5];
            if (var8 != null) {
                class118.field2089 = class160.field2668;
                class57.field1011 = 2;
                class241.field3964 = class115.field2069;
                class46.field811++;
                class225.field3781 = 0;
                class168.field2778.method199(158, 117);
                class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
                class168.field2778.method690(var5, 109);
            }
        }
        if (var4 == 9) {
            class168.field2778.method199(118, -30);
            class168.field2778.method673(var2, true);
            class168.field2778.method690(var5, 99);
            class168.field2778.method644(var3, !arg0);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class127.field2226++;
            class123.field2182 = var2;
        }
        if (var4 == 24) {
            class29.field437++;
            class168.field2778.method199(123, -36);
            class168.field2778.method688(-128, var2);
            class168.field2778.method698(125, var3);
            class168.field2778.method688(-128, var5);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 32) {
            class241.field3964 = class115.field2069;
            class57.field1011 = 2;
            class118.field2089 = class160.field2668;
            class225.field3781 = 0;
            class168.field2778.method199(127, 125);
            class168.field2778.method690(class119.field2108, 100);
            class192.field3109++;
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method690(var2 + class126.field2206, 95);
            class168.field2778.method676(false, class47.field825);
            class168.field2778.method639((int) (var6 >>> 32) & Integer.MAX_VALUE, 15267);
            class168.field2778.method673(class255.field4162 + var3, true);
        }
        if (var4 == 1007) {
            class46 var9 = class108.method760(-29533, var3);
            if (var9 == null || var9.field711[var2] < 100000) {
                class256.field4172++;
                class168.field2778.method199(226, -34);
                class168.field2778.method639(var5, 15267);
            } else {
                class97.method612(var9.field711[var2] + " x " + class203.method1346(-1, var5).field3216, -1, 0, "");
            }
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 43) {
            class57.field1011 = 2;
            class241.field3964 = class115.field2069;
            class118.field2089 = class160.field2668;
            class225.field3781 = 0;
            class168.field2778.method199(229, 125);
            class168.field2778.method673(class255.field4162 + var3, true);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method639((int) (var6 >>> 32) & Integer.MAX_VALUE, 15267);
            class48.field834++;
            class168.field2778.method673(class126.field2206 + var2, true);
        }
        if (var4 == 57) {
            class118.field2089 = class160.field2668;
            class241.field3964 = class115.field2069;
            class211.field3563++;
            class225.field3781 = 0;
            class57.field1011 = 2;
            class168.field2778.method199(183, 117);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method639(class126.field2206 + var2, 15267);
            class168.field2778.method690(var3 + class255.field4162, 123);
            class168.field2778.method673(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
        }
        if (var4 == 49) {
            class247.field4054++;
            class168.field2778.method199(75, 11);
            class168.field2778.method698(111, var3);
            class46 var10 = class108.method760(-29533, var3);
            if (var10.field727 != null && var10.field727[0][0] == 5) {
                int var11 = var10.field727[0][1];
                class125.field2191[var11] = 1 - class125.field2191[var11];
                class89.method577(var11, (byte) -44);
            }
        }
        if (var4 == 12) {
            class288 var12 = class105.field1874[var5];
            if (var12 != null) {
                class57.field1011 = 2;
                class153.field2560++;
                class118.field2089 = class160.field2668;
                class225.field3781 = 0;
                class241.field3964 = class115.field2069;
                class168.field2778.method199(197, -53);
                class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
                class168.field2778.method690(var5, 113);
            }
        }
        if (var4 == 29) {
            class216.field3643++;
            class168.field2778.method199(43, 115);
            class168.field2778.method690(var2, 105);
            class168.field2778.method676(false, var3);
            class168.field2778.method690(var5, 121);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 44) {
            class168.field2778.method199(44, 122);
            class168.field2778.method688(-128, var2);
            class35.field488++;
            class168.field2778.method667(var3, -1511);
            class168.field2778.method690(var5, 93);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 1004) {
            class57.field1011 = 2;
            class118.field2089 = class160.field2668;
            class225.field3781 = 0;
            class1.field11++;
            class241.field3964 = class115.field2069;
            class168.field2778.method199(33, -77);
            class168.field2778.method673(class126.field2206 + var2, !arg0);
            class168.field2778.method639(var3 + class255.field4162, 15267);
            class168.field2778.method690((int) (var6 >>> 32) & Integer.MAX_VALUE, 96);
            class168.field2778.method674((byte) -120, class12.field169[82] ? 1 : 0);
        }
        if (var4 == 10) {
            class168.field2778.method199(216, 0);
            class168.field2778.method644(var3, !arg0);
            class277.field4437++;
            class168.field2778.method690(var5, 104);
            class168.field2778.method676(false, class47.field825);
            class168.field2778.method690(class119.field2108, 101);
            class168.field2778.method688(-128, var2);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 35) {
            class141 var13 = class42.field625[var5];
            if (var13 != null) {
                class225.field3781 = 0;
                class79.field1363++;
                class118.field2089 = class160.field2668;
                class57.field1011 = 2;
                class241.field3964 = class115.field2069;
                class168.field2778.method199(101, 15);
                class168.field2778.method674((byte) -128, class12.field169[82] ? 1 : 0);
                class168.field2778.method688(-128, var5);
            }
        }
        if (var4 == 59) {
            class141 var14 = class42.field625[var5];
            if (var14 != null) {
                class225.field3781 = 0;
                class56.field965++;
                class118.field2089 = class160.field2668;
                class241.field3964 = class115.field2069;
                class57.field1011 = 2;
                class168.field2778.method199(103, 127);
                class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
                class168.field2778.method688(-128, var5);
            }
        }
        if (var4 == 11) {
            class288 var15 = class105.field1874[var5];
            if (var15 != null) {
                class57.field1011 = 2;
                class118.field2089 = class160.field2668;
                class241.field3964 = class115.field2069;
                class225.field3781 = 0;
                class162.field2685++;
                class168.field2778.method199(218, 118);
                class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
                class168.field2778.method688(-128, var5);
            }
        }
        if (var4 == 30) {
            class225.field3781 = 0;
            class15.field200++;
            class57.field1011 = 2;
            class241.field3964 = class115.field2069;
            class118.field2089 = class160.field2668;
            class168.field2778.method199(212, -15);
            class168.field2778.method673(var5, true);
            class168.field2778.method690(var3 + class255.field4162, 109);
            class168.field2778.method699(-23266, class12.field169[82] ? 1 : 0);
            class168.field2778.method673(class126.field2206 + var2, !arg0);
        }
        if (var4 == 58) {
            class241.field3964 = class115.field2069;
            class225.field3781 = 0;
            class33.field474++;
            class57.field1011 = 2;
            class118.field2089 = class160.field2668;
            class168.field2778.method199(45, 120);
            class168.field2778.method690(class126.field2206 + var2, 120);
            class168.field2778.method688(-128, class255.field4162 + var3);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method688(-128, var5);
        }
        if (var4 == 3) {
            class46 var16 = class285.method1902(var3, var2, 5);
            if (var16 != null) {
                class239.method1581(-24930);
                class192 var17 = client.method1922(var16);
                method142(98, var16.field673, var17.field3102, var16.field663, var17.method1257(-30), var2, var3);
                class183.field2976 = 0;
                class6.field67 = client.method1925(var16, false);
                if (class6.field67 == null) {
                    class6.field67 = "Null";
                }
                if (!var16.field734) {
                    class253.field4145 = "<col=00ff00>" + var16.field743 + "<col=ffffff>";
                    return;
                }
                class253.field4145 = var16.field699 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 28) {
            class118.field2089 = class160.field2668;
            class225.field3781 = 0;
            class83.field1511++;
            class241.field3964 = class115.field2069;
            class57.field1011 = 2;
            class168.field2778.method199(128, 124);
            class168.field2778.method690((int) (var6 >>> 32) & Integer.MAX_VALUE, 105);
            class168.field2778.method690(class61.field1055, 126);
            class168.field2778.method639(class126.field2206 + var2, 15267);
            class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
            class168.field2778.method644(class76.field1239, true);
            class168.field2778.method639(class255.field4162 + var3, 15267);
            class168.field2778.method673(class175.field2867, true);
        }
        if (var4 == 50) {
            class168.field2778.method199(75, -113);
            class168.field2778.method698(117, var3);
            class247.field4054++;
            class46 var18 = class108.method760(-29533, var3);
            if (var18.field727 != null && var18.field727[0][0] == 5) {
                int var19 = var18.field727[0][1];
                if (class125.field2191[var19] != var18.field694[0]) {
                    class125.field2191[var19] = var18.field694[0];
                    class89.method577(var19, (byte) -44);
                }
            }
        }
        if (var4 == 1002) {
            class225.field3781 = 0;
            class118.field2089 = class160.field2668;
            class241.field3964 = class115.field2069;
            class57.field1011 = 2;
            class141 var20 = class42.field625[var5];
            if (var20 != null) {
                class208 var21 = var20.field2421;
                if (var21.field3521 != null) {
                    var21 = var21.method1402((byte) -116);
                }
                if (var21 != null) {
                    class168.field2778.method199(198, 118);
                    class168.field2778.method688(-128, var21.field3500);
                    class29.field438++;
                }
            }
        }
        if (var4 == 41) {
            class241.field3964 = class115.field2069;
            class225.field3781 = 0;
            class57.field1011 = 2;
            class217.field3660++;
            class118.field2089 = class160.field2668;
            class168.field2778.method199(41, 122);
            class168.field2778.method699(-23266, class12.field169[82] ? 1 : 0);
            class168.field2778.method690(var3 + class255.field4162, 126);
            class168.field2778.method673(class126.field2206 + var2, true);
            class168.field2778.method688(-128, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 19) {
            class46 var22 = class108.method760(-29533, var3);
            boolean var23 = true;
            if (var22.field777 > 0) {
                var23 = class5.method28((byte) 93, var22);
            }
            if (var23) {
                class168.field2778.method199(75, 121);
                class168.field2778.method698(111, var3);
                class247.field4054++;
            }
        }
        if (var4 == 21) {
            class288 var24 = class105.field1874[var5];
            if (var24 != null) {
                class225.field3781 = 0;
                class241.field3964 = class115.field2069;
                class290.field4629++;
                class118.field2089 = class160.field2668;
                class57.field1011 = 2;
                class168.field2778.method199(71, 117);
                class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
                class168.field2778.method673(var5, !arg0);
            }
        }
        if (var4 == 6) {
            class288 var25 = class105.field1874[var5];
            if (var25 != null) {
                class241.field3964 = class115.field2069;
                class225.field3781 = 0;
                class57.field1011 = 2;
                class118.field2089 = class160.field2668;
                class168.field2778.method199(199, -47);
                class250.field4097++;
                class168.field2778.method676(arg0, class47.field825);
                class168.field2778.method639(var5, 15267);
                class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
                class168.field2778.method688(-128, class119.field2108);
            }
        }
        if (var4 == 36) {
            if (var5 == 0) {
                class178.field2937 = 1;
                class234.method1552(class176.field2886, var2, var3);
            } else if (class204.field3343 > 0 && class12.field169[82] && class12.field169[81]) {
                class88.method575(class176.field2886, class255.field4162 + var3, -9225, class126.field2206 + var2);
            } else {
                class168.field2778.method199(133, 123);
                class115.field2067++;
                class168.field2778.method673(class126.field2206 + var2, true);
                class168.field2778.method688(-128, class255.field4162 + var3);
            }
        }
        if (var4 == 39) {
            class281.field4466++;
            class168.field2778.method199(190, 114);
            class168.field2778.method667(var3, -1511);
            class168.field2778.method673(var5, true);
            class168.field2778.method639(var2, 15267);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 25) {
            class50.field874++;
            class168.field2778.method199(105, -116);
            class168.field2778.method688(-128, var2);
            class168.field2778.method698(-112, var3);
            class168.field2778.method639(var5, 15267);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 46) {
            class239.method1581(-24930);
            class46 var26 = class108.method760(-29533, var3);
            class61.field1055 = var5;
            class175.field2867 = var2;
            class76.field1239 = var3;
            class183.field2976 = 1;
            class79.method516(-373, var26);
            class258.field4208 = "<col=ff9040>" + class203.method1346(-1, var5).field3216 + "<col=ffffff>";
            if (class258.field4208 == null) {
                class258.field4208 = "null";
            }
            return;
        }
        if (var4 == 45) {
            class168.field2778.method199(188, 122);
            class83.field1509++;
            class168.field2778.method690(class119.field2108, 103);
            class168.field2778.method676(false, class47.field825);
            class168.field2778.method673(var2, !arg0);
            class168.field2778.method644(var3, true);
        }
        if (var4 == 33) {
            class277.field4430++;
            class225.field3781 = 0;
            class57.field1011 = 2;
            class118.field2089 = class160.field2668;
            class241.field3964 = class115.field2069;
            class168.field2778.method199(108, 116);
            class168.field2778.method688(-128, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class168.field2778.method690(class255.field4162 + var3, 126);
            class168.field2778.method690(var2 + class126.field2206, 102);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
        }
        if (var4 == 17) {
            class225.field3781 = 0;
            class57.field1011 = 2;
            class91.field1607++;
            class118.field2089 = class160.field2668;
            class241.field3964 = class115.field2069;
            class168.field2778.method199(120, 125);
            class168.field2778.method688(-128, var2 + class126.field2206);
            class168.field2778.method690(var5, 118);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method688(-128, var3 + class255.field4162);
            class168.field2778.method698(-59, class47.field825);
            class168.field2778.method639(class119.field2108, 15267);
        }
        if (var4 == 5) {
            class288 var27 = class105.field1874[var5];
            if (var27 != null) {
                class118.field2089 = class160.field2668;
                class225.field3781 = 0;
                class159.field2665++;
                class241.field3964 = class115.field2069;
                class57.field1011 = 2;
                class168.field2778.method199(114, -31);
                class168.field2778.method688(-128, var5);
                class168.field2778.method699(-23266, class12.field169[82] ? 1 : 0);
            }
        }
        if (var4 == 23) {
            class141 var28 = class42.field625[var5];
            if (var28 != null) {
                class147.field2498++;
                class57.field1011 = 2;
                class118.field2089 = class160.field2668;
                class241.field3964 = class115.field2069;
                class225.field3781 = 0;
                class168.field2778.method199(59, 124);
                class168.field2778.method690(var5, 97);
                class168.field2778.method674((byte) -116, class12.field169[82] ? 1 : 0);
            }
        }
        if (var4 == 37) {
            class141 var29 = class42.field625[var5];
            if (var29 != null) {
                class241.field3964 = class115.field2069;
                class118.field2089 = class160.field2668;
                class166.field2717++;
                class57.field1011 = 2;
                class225.field3781 = 0;
                class168.field2778.method199(61, -61);
                class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
                class168.field2778.method690(var5, 100);
            }
        }
        if (var4 == 15) {
            class141 var30 = class42.field625[var5];
            if (var30 != null) {
                class118.field2089 = class160.field2668;
                class57.field1011 = 2;
                class95.field1647++;
                class241.field3964 = class115.field2069;
                class225.field3781 = 0;
                class168.field2778.method199(74, 115);
                class168.field2778.method688(-128, class119.field2108);
                class168.field2778.method674((byte) -117, class12.field169[82] ? 1 : 0);
                class168.field2778.method698(-80, class47.field825);
                class168.field2778.method639(var5, 15267);
            }
        }
        if (var4 == 14) {
            class118.field2089 = class160.field2668;
            class261.field4260++;
            class241.field3964 = class115.field2069;
            class225.field3781 = 0;
            class57.field1011 = 2;
            class168.field2778.method199(29, 117);
            class168.field2778.method674((byte) -121, class12.field169[82] ? 1 : 0);
            class168.field2778.method673(class126.field2206 + var2, true);
            class168.field2778.method639(var5, 15267);
            class168.field2778.method639(var3 + class255.field4162, 15267);
        }
        if (var4 == 31) {
            class288 var31 = class105.field1874[var5];
            if (var31 != null) {
                class57.field1011 = 2;
                class225.field3781 = 0;
                class118.field2089 = class160.field2668;
                class80.field1370++;
                class241.field3964 = class115.field2069;
                class168.field2778.method199(19, -74);
                class168.field2778.method673(var5, true);
                class168.field2778.method674((byte) -128, class12.field169[82] ? 1 : 0);
            }
        }
        if (var4 == 34) {
            class48.field838++;
            class118.field2089 = class160.field2668;
            class57.field1011 = 2;
            class241.field3964 = class115.field2069;
            class225.field3781 = 0;
            class168.field2778.method199(244, 26);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method639(class255.field4162 + var3, 15267);
            class168.field2778.method688(-128, class126.field2206 + var2);
            class168.field2778.method688(-128, var5);
        }
        if (var4 == 2) {
            class123.field2174++;
            class168.field2778.method199(7, -53);
            class168.field2778.method676(false, class76.field1239);
            class168.field2778.method673(class61.field1055, true);
            class168.field2778.method667(var3, -1511);
            class168.field2778.method688(-128, class175.field2867);
            class168.field2778.method673(var5, !arg0);
            class168.field2778.method690(var2, 103);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 1003) {
            class118.field2089 = class160.field2668;
            class21.field327++;
            class57.field1011 = 2;
            class241.field3964 = class115.field2069;
            class225.field3781 = 0;
            class168.field2778.method199(117, 16);
            class168.field2778.method639(var5, 15267);
        }
        if (var4 == 13) {
            class20.field320++;
            class168.field2778.method199(177, 124);
            class168.field2778.method639(var5, 15267);
            class168.field2778.method639(var2, 15267);
            class168.field2778.method698(107, var3);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 26 || var4 == 1001) {
            class133.method922(var3, var2, var5, -3, class93.field1636[arg1]);
        }
        if (var4 == 47) {
            if (var5 == 0) {
                class234.method1552(class176.field2886, var2, var3);
            } else if (var5 == 1) {
                if (class204.field3343 > 0 && class12.field169[82] && class12.field169[81]) {
                    class88.method575(class176.field2886, class255.field4162 + var3, -9225, class126.field2206 + var2);
                } else {
                    class85.method558(var3, 1, var2, (byte) -106);
                    class168.field2778.method682(class262.field4274, 22555);
                    class168.field2778.method682(class177.field2924, 22555);
                    class168.field2778.method639((int) class106.field1900, 15267);
                    class168.field2778.method682(57, 22555);
                    class168.field2778.method682(class173.field2833, 22555);
                    class168.field2778.method682(class231.field3871, 22555);
                    class168.field2778.method682(89, 22555);
                    class168.field2778.method639(class273.field4378.field1397, 15267);
                    class168.field2778.method639(class273.field4378.field1458, 15267);
                    class168.field2778.method682(class37.field544, 22555);
                    class168.field2778.method682(63, 22555);
                }
            }
        }
        if (var4 == 20) {
            class141 var32 = class42.field625[var5];
            if (var32 != null) {
                class225.field3781 = 0;
                class118.field2089 = class160.field2668;
                class241.field3964 = class115.field2069;
                class80.field1383++;
                class57.field1011 = 2;
                class168.field2778.method199(135, 124);
                class168.field2778.method690(var5, 114);
                class168.field2778.method667(class76.field1239, -1511);
                class168.field2778.method699(-23266, class12.field169[82] ? 1 : 0);
                class168.field2778.method673(class175.field2867, true);
                class168.field2778.method639(class61.field1055, 15267);
            }
        }
        if (var4 == 42) {
            class291.method1969(0);
        }
        if (var4 == 18) {
            class141 var33 = class42.field625[var5];
            if (var33 != null) {
                class241.field3964 = class115.field2069;
                class118.field2089 = class160.field2668;
                class45.field637++;
                class57.field1011 = 2;
                class225.field3781 = 0;
                class168.field2778.method199(50, 119);
                class168.field2778.method639(var5, 15267);
                class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
            }
        }
        if (var4 == 4) {
            class75.field1232++;
            class168.field2778.method199(148, -64);
            class168.field2778.method690(var2, 121);
            class168.field2778.method690(var5, 119);
            class168.field2778.method667(var3, -1511);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 48) {
            class168.field2778.method199(90, -114);
            class168.field2778.method673(var5, true);
            class204.field3329++;
            class168.field2778.method676(false, var3);
            class168.field2778.method639(var2, 15267);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 1005) {
            class256.field4172++;
            class241.field3964 = class115.field2069;
            class57.field1011 = 2;
            class118.field2089 = class160.field2668;
            class225.field3781 = 0;
            class168.field2778.method199(226, 125);
            class168.field2778.method639(var5, 15267);
        }
        if (var4 == 8) {
            class288 var34 = class105.field1874[var5];
            if (var34 != null) {
                class57.field1011 = 2;
                class241.field3964 = class115.field2069;
                class118.field2089 = class160.field2668;
                class225.field3781 = 0;
                class168.field2778.method199(230, 19);
                class168.field2778.method690(var5, 112);
                class99.field1704++;
                class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
            }
        }
        if (var4 == 22 && class139.field2404 == null) {
            class106.method718(var3, 8, var2);
            class139.field2404 = class285.method1902(var3, var2, 5);
            class79.method516(-373, class139.field2404);
        }
        if (var4 == 40) {
            class168.field2778.method199(196, -16);
            class188.field3042++;
            class168.field2778.method673(var5, true);
            class168.field2778.method667(var3, -1511);
            class168.field2778.method673(var2, true);
            class247.field4057 = 0;
            class188.field3039 = class108.method760(-29533, var3);
            class123.field2182 = var2;
        }
        if (var4 == 16) {
            if (var5 == 0) {
                class66.field1113 = 1;
                class234.method1552(class176.field2886, var2, var3);
            } else if (var5 == 1) {
                class168.field2778.method199(47, -113);
                class122.field2153++;
                class168.field2778.method688(-128, class255.field4162 + var3);
                class168.field2778.method690(class119.field2108, 119);
                class168.field2778.method698(95, class47.field825);
                class168.field2778.method688(-128, class126.field2206 + var2);
            }
        }
        if (var4 == 7) {
            class288 var35 = class105.field1874[var5];
            if (var35 != null) {
                class57.field1011 = 2;
                class225.field3781 = 0;
                class256.field4181++;
                class241.field3964 = class115.field2069;
                class118.field2089 = class160.field2668;
                class168.field2778.method199(221, 122);
                class168.field2778.method697(16876, class12.field169[82] ? 1 : 0);
                class168.field2778.method690(var5, 108);
            }
        }
        if (var4 == 38) {
            class57.field1011 = 2;
            class225.field3781 = 0;
            class57.field993++;
            class118.field2089 = class160.field2668;
            class241.field3964 = class115.field2069;
            class168.field2778.method199(174, 123);
            class168.field2778.method639(class255.field4162 + var3, 15267);
            class168.field2778.method639(var5, 15267);
            class168.field2778.method688(-128, class126.field2206 + var2);
            class168.field2778.method699(-23266, class12.field169[82] ? 1 : 0);
        }
        if (var4 == 51) {
            class261.field4263++;
            class225.field3781 = 0;
            class118.field2089 = class160.field2668;
            class241.field3964 = class115.field2069;
            class57.field1011 = 2;
            class168.field2778.method199(4, 127);
            class168.field2778.method688(-128, class61.field1055);
            class168.field2778.method639(var5, 15267);
            class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
            class168.field2778.method688(-128, class255.field4162 + var3);
            class168.field2778.method644(class76.field1239, true);
            class168.field2778.method639(class126.field2206 + var2, 15267);
            class168.field2778.method690(class175.field2867, 94);
        }
        if (var4 == 60) {
            class288 var36 = class105.field1874[var5];
            if (var36 != null) {
                class57.field1011 = 2;
                class165.field2698++;
                class225.field3781 = 0;
                class241.field3964 = class115.field2069;
                class118.field2089 = class160.field2668;
                class168.field2778.method199(144, -1);
                class168.field2778.method688(-128, class61.field1055);
                class168.field2778.method673(class175.field2867, true);
                class168.field2778.method644(class76.field1239, true);
                class168.field2778.method682(class12.field169[82] ? 1 : 0, 22555);
                class168.field2778.method690(var5, 100);
            }
        }
        if (class183.field2976 != 0) {
            class183.field2976 = 0;
            class79.method516(-373, class108.method760(-29533, class76.field1239));
        }
        if (arg0) {
            field299 = null;
        }
        if (class76.field1241) {
            class239.method1581(-24930);
        }
        if (class188.field3039 != null && class247.field4057 == 0) {
            class79.method516(-373, class188.field3039);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILeh;B)V")
    private final void method138(int arg0, class101 arg1, byte arg2) {
        field302++;
        if (arg0 == 1) {
            this.field310 = arg1.method669((byte) 36);
        } else if (arg0 == 2) {
            int var4 = arg1.method669((byte) 36);
            this.field298 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field298[var5] = arg1.method677(false);
            }
        } else if (arg0 == 3) {
            this.field300 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method669((byte) 36);
            this.field307 = new short[var8];
            this.field305 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field307[var9] = (short) arg1.method677(false);
                this.field305[var9] = (short) arg1.method677(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method669((byte) 36);
            this.field309 = new short[var6];
            this.field306 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field306[var7] = (short) arg1.method677(false);
                this.field309[var7] = (short) arg1.method677(false);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field297[arg0 - 60] = arg1.method677(false);
        }
        if (arg2 > -98) {
            this.field306 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lkh;")
    public final class221 method139(int arg0) {
        if (arg0 < 30) {
            this.method139(-64);
        }
        field308++;
        if (this.field298 == null) {
            return null;
        }
        class221[] var2 = new class221[this.field298.length];
        for (int var3 = 0; var3 < this.field298.length; var3++) {
            var2[var3] = class221.method1487(class142.field2442, this.field298[var3], 0);
        }
        class221 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class221(var2, var2.length);
        }
        if (this.field307 != null) {
            for (int var5 = 0; var5 < this.field307.length; var5++) {
                var4.method1465(this.field307[var5], this.field305[var5]);
            }
        }
        if (this.field306 != null) {
            for (int var6 = 0; var6 < this.field306.length; var6++) {
                var4.method1484(this.field306[var6], this.field309[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        field294++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field297[var3] != -1 && !class142.field2442.method737(-1, this.field297[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 > -40) {
            method142(48, -109, -12, 126, -117, 30, -85);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)Z")
    public final boolean method141(int arg0) {
        field295++;
        if (this.field298 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field298.length; var3++) {
            if (!class142.field2442.method737(-1, this.field298[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
    private static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class46 var7 = class285.method1902(arg6, arg5, 5);
        field296++;
        if (var7 != null && var7.field691 != null) {
            class198 var8 = new class198();
            var8.field3205 = var7;
            var8.field3204 = var7.field691;
            class71.method434(-10521, var8);
        }
        class47.field825 = arg6;
        class158.field2640 = arg3;
        class176.field2898 = arg4;
        class198.field3200 = arg1;
        class76.field1241 = true;
        int var9 = 34 / ((35 - arg0) / 41);
        class119.field2108 = arg5;
        class183.field2983 = arg2;
        class79.method516(-373, var7);
    }
}
