import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class186 extends class218 {

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lan;")
    public static class337 field2681 = new class337();

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2693 = "Opened title screen";

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "[I")
    public static int[] field2691;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "[I")
    public static int[] field2692;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V", line = 13)
    public static final void method1292(int arg0, int arg1) {
        field2682++;
        int var2 = -126 % ((arg0 - 19) / 51);
        class74.field951.method1236(-495037017, arg1);
        class167.field2325.method1236(-495037017, arg1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 25)
    public final void method882(int arg0, int arg1, int arg2) {
        field2684++;
        int var4 = this.field2688 * arg1 >> 12;
        int var5 = this.field2690 * arg0 >> 12;
        if (arg2 != 4) {
            field2686 = -102;
        }
        int var6 = this.field2679 * arg1 >> 12;
        int var7 = this.field2683 * arg0 >> 12;
        class78.method460(var6, this.field3071, var7, var5, var4, arg2 ^ 0x7E);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIII)V", line = 44)
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2690 = arg1;
        this.field2688 = arg2;
        this.field2683 = arg3;
        this.field2679 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZ)V", line = 64)
    public final void method884(int arg0, int arg1, boolean arg2) {
        field2680++;
        if (arg2) {
            this.method881((byte) 51, 24, -9);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 74)
    public static final void method1293(byte arg0) {
        field2689++;
        int var1 = class272.field4270.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class272.field4270[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class192.field2763; var4++) {
                    if (class308.field4760[var4] == class120.field1694[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class308.field4760[class192.field2763] = class120.field1694[var2];
                    var3 = class192.field2763++;
                }
                int var5 = 0;
                class107 var6 = new class107(class272.field4270[var2]);
                while (class272.field4270[var2].length > var6.field1400 && var5 < 511) {
                    int var7 = var6.method624(14612);
                    int var8 = var7 >> 7 & 0x3F;
                    int var9 = var7 >> 14;
                    int var10 = var5++ << 6 | var3;
                    int var11 = var7 & 0x3F;
                    int var12 = (class120.field1694[var2] & 0xFF) * 64 + var11 - class118.field1668;
                    int var13 = (class120.field1694[var2] >> 8) * 64 - (class142.field1992 - var8);
                    class282 var14 = class120.method815(-125, var6.method624(14612));
                    if (class223.field3159[var10] == null && (var14.field4426 & 0x1) > 0 && class244.field3669 == var9 && var13 >= 0 && var14.field4420 + var13 < 104 && var12 >= 0 && var14.field4420 + var12 < 104) {
                        class223.field3159[var10] = new class184();
                        class184 var15 = class223.field3159[var10];
                        class269.field4238[class127.field1735++] = var10;
                        var15.field2422 = class38.field463;
                        var15.method1281(var14, -24886);
                        var15.method1103(var15.field2657.field4420, (byte) -103);
                        var15.field2387 = var15.field2368 = class22.field304[var15.field2657.field4382];
                        var15.field2375 = var15.field2657.field4421;
                        var15.field2360 = var15.field2657.field4423;
                        if (var15.field2360 == 0) {
                            var15.field2368 = 0;
                        }
                        var15.method1107(var13, var12, -1, var15.method748(false), true);
                    }
                }
            }
        }
        if (arg0 >= -82) {
            method1293((byte) -78);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V", line = 167)
    public final void method881(byte arg0, int arg1, int arg2) {
        field2685++;
        if (arg0 <= 96) {
            field2694 = 125;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)V", line = 179)
    public static final void method1294(long arg0, int arg1) {
        field2687++;
        if (class118.field1671 == 1 || class118.field1671 == 5) {
            class43.method251(-1, arg0);
        } else if (class118.field1671 == 2) {
            class55.method329(arg1 ^ 0xA7528944);
        } else {
            class262.method1885(-21);
        }
        if (!class140.field1951) {
            class310.field4794 = 1;
            class221.field3124[0] = class279.field4339;
            if (class104.field1340 != 0) {
                class229.field3340 = class43.field508;
                class49.field609 = class326.field4994;
            } else if (class196.field2814 == 0) {
                class49.field609 = class211.field2987;
                class229.field3340 = class161.field2216;
            } else {
                class49.field609 = class148.field2055;
                class229.field3340 = class224.field3184;
            }
            class30.field371[0] = 1007;
            class76.field968[0] = class275.field4288;
            class148.field2061[0] = "";
        }
        if (class146.field2031 != -1) {
            class54.method327(-31356, class146.field2031);
        }
        for (int var3 = 0; var3 < class247.field3751; var3++) {
            if (class285.field4483[var3]) {
                class211.field2985[var3] = true;
            }
            class76.field969[var3] = class285.field4483[var3];
            class285.field4483[var3] = false;
        }
        class177.field2575 = null;
        class36.field421 = class38.field463;
        class80.field1037 = null;
        class67.field882 = -1;
        class17.field232 = -1;
        if (class250.field3787) {
            class100.field1319 = true;
        }
        if (class146.field2031 != -1) {
            class247.field3751 = 0;
            class30.method183(21385);
        }
        if (class250.field3787) {
            class306.method2143();
        } else {
            class144.method979();
        }
        class13.method90(1);
        if (class140.field1951) {
            if (class262.field3964) {
                class135.method898(256);
            } else {
                class127.method844(-4325);
            }
        } else if (class177.field2575 != null) {
            class239.method1716(class177.field2575, (byte) -90, class318.field4891, client.field4231);
        } else if (class67.field882 != -1) {
            class239.method1716((class263) null, (byte) -94, class17.field232, class67.field882);
        }
        int var4 = class140.field1951 ? -1 : class147.method993((byte) 37);
        if (var4 == -1) {
            var4 = class166.field2293;
        }
        class166.method1085(6376, var4);
        if (class221.field3117 == 1) {
            class221.field3117 = 2;
        }
        if (class48.field583 == 1) {
            class48.field583 = 2;
        }
        if (class177.field2569 == 3) {
            for (int var5 = 0; var5 < class247.field3751; var5++) {
                if (class76.field969[var5]) {
                    if (class250.field3787) {
                        class306.method2140(class228.field3291[var5], class78.field984[var5], class17.field234[var5], class115.field1625[var5], 16711935, 128);
                    } else {
                        class144.method966(class228.field3291[var5], class78.field984[var5], class17.field234[var5], class115.field1625[var5], 16711935, 128);
                    }
                } else if (class211.field2985[var5]) {
                    if (class250.field3787) {
                        class306.method2140(class228.field3291[var5], class78.field984[var5], class17.field234[var5], class115.field1625[var5], 16711680, 128);
                    } else {
                        class144.method966(class228.field3291[var5], class78.field984[var5], class17.field234[var5], class115.field1625[var5], 16711680, 128);
                    }
                }
            }
        }
        class137.method916(true, class322.field4939, class118.field1664.field2392, class138.field1940, class118.field1664.field2357);
        if (arg1 == 1487763143) {
            class322.field4939 = 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V", line = 341)
    public static void method1295(byte arg0) {
        field2692 = null;
        int var1 = -53 % ((28 - arg0) / 55);
        field2681 = null;
        field2691 = null;
        field2693 = null;
    }
}
