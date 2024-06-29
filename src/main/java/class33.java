import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class33 {

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    private int field470 = -1;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    private int field485 = 0;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Lvq;")
    private class22 field472 = new class22();

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "Z")
    public boolean field488 = false;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "[[[I")
    private int[][][] field479;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "[Lbm;")
    private class323[] field463;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "Z")
    public static boolean field476 = true;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "[Z")
    public static boolean[] field478 = new boolean[200];

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "Ljava/lang/String;")
    public static String field486 = "Loading world list data";

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "[Z")
    public static boolean[] field482 = new boolean[112];

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Ldp;")
    public static class174 field464;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field475;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([JI[I)V", line = 4)
    public static final void method235(long[] arg0, int arg1, int[] arg2) {
        field481++;
        class211.method1615(arg2, arg0.length - 1, 52, 0, arg0);
        if (arg1 != 1342370408) {
            field478 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 17)
    public static final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg10 != -21897) {
            field465 = -127;
        }
        field466++;
        class8 var13 = new class8();
        var13.field101 = arg12;
        var13.field113 = arg5;
        var13.field111 = arg0;
        var13.field112 = arg4;
        var13.field114 = arg7;
        var13.field106 = arg6;
        var13.field104 = arg3;
        var13.field116 = arg2;
        var13.field109 = arg8;
        var13.field107 = arg9;
        var13.field102 = arg11;
        var13.field100 = arg1;
        class132.field2135.method148((byte) 93, var13);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Ljo;", line = 44)
    public static final class218 method237(int arg0, byte arg1) {
        if (arg1 == -84) {
            field477++;
            return class273.field4114 && arg0 >= class407.field5938 && class328.field4729 >= arg0 ? class377.field5333[arg0 - class407.field5938] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 60)
    public final void method238(int arg0) {
        field469++;
        for (int var2 = arg0; var2 < this.field484; var2++) {
            this.field479[var2][0] = null;
            this.field479[var2][1] = null;
            this.field479[var2][2] = null;
            this.field479[var2] = null;
        }
        this.field463 = null;
        this.field479 = null;
        this.field472.method147(35);
        this.field472 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field473++;
        int var5 = 114 % ((arg1 + 49) / 34);
        class221 var6 = class447.method2795(4, (byte) -49, arg3);
        var6.method1692(0);
        var6.field3297 = arg2;
        var6.field3291 = arg0;
        var6.field3295 = arg4;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILmb;)Ljava/lang/String;", line = 100)
    public static final String method240(int arg0, class258 arg1) {
        field480++;
        if (client.method1815(arg1).method2609((byte) 119) == 0) {
            return null;
        } else if (arg1.field3753 == null || arg1.field3753.trim().length() == 0) {
            return class342.field4850 ? "Hidden-use" : null;
        } else {
            if (arg0 != 16) {
                method242((byte) -94);
            }
            return arg1.field3753;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V", line = 125)
    public static final void method241(byte arg0) {
        if (arg0 > -77) {
            field486 = null;
        }
        for (int var1 = 0; var1 < class176.field2619; var1++) {
            int var2 = class218.field3229[var1];
            class98 var3 = class447.field6512[var2];
            int var4 = class268.field4020.method271((byte) 109);
            if ((var4 & 0x40) != 0) {
                var4 += class268.field4020.method271((byte) 118) << 8;
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class268.field4020.method271((byte) 102);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class268.field4020.method293(21569);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class268.field4020.method310(-32717);
                    var8[var9] = class268.field4020.method288(-16826);
                }
                class26.method215(var7, var3, var6, (byte) -127, var8);
            }
            if ((var4 & 0x100) != 0) {
                var3.field5668 = class268.field4020.method293(21569);
                var3.field5634 = class268.field4020.method320((byte) -87);
            }
            if ((var4 & 0x400) != 0) {
                int var11 = class268.field4020.method288(-16826);
                var3.field5638 = class268.field4020.method276(-1536);
                var3.field5653 = class268.field4020.method271((byte) 127);
                var3.field5632 = (var11 & 0x8000) != 0;
                var3.field5602 = var11 & 0x7FFF;
                var3.field5610 = class267.field4002 - (-var3.field5638 - var3.field5602);
            }
            if ((var4 & 0x20) != 0) {
                int var12 = class268.field4020.method288(-16826);
                int var13 = class268.field4020.method286(27914);
                if (var12 == 65535) {
                    var12 = -1;
                }
                boolean var14 = true;
                if (var12 != -1 && var3.field5683 != -1) {
                    if (var3.field5683 == var12) {
                        class389 var19 = class321.method2140(var12, (byte) 42);
                        if (var19.field5590 && var19.field5597 != -1) {
                            class51 var20 = class113.method974(var19.field5597, (byte) -64);
                            int var21 = var20.field817;
                            if (var21 == 0) {
                                var14 = false;
                            } else if (var21 == 1) {
                                var14 = true;
                            } else if (var21 == 2) {
                                var14 = false;
                                var3.field5677 = 0;
                            }
                        }
                    } else {
                        class389 var15 = class321.method2140(var12, (byte) -117);
                        class389 var16 = class321.method2140(var3.field5683, (byte) -124);
                        if (var15.field5597 != -1 && var16.field5597 != -1) {
                            class51 var17 = class113.method974(var15.field5597, (byte) -93);
                            class51 var18 = class113.method974(var16.field5597, (byte) -105);
                            if (var18.field840 > var17.field840) {
                                var14 = false;
                            }
                        }
                    }
                }
                if (var14) {
                    var3.field5681 = 1;
                    var3.field5630 = 0;
                    var3.field5605 = (var13 & 0xFFFF) + class267.field4002;
                    var3.field5672 = var13 >> 16;
                    var3.field5683 = var12;
                    var3.field5651 = 0;
                    if (class267.field4002 < var3.field5605) {
                        var3.field5630 = -1;
                    }
                    if (var3.field5683 != -1 && class267.field4002 == var3.field5605) {
                        int var22 = class321.method2140(var3.field5683, (byte) 97).field5597;
                        if (var22 != -1) {
                            class51 var23 = class113.method974(var22, (byte) -79);
                            if (var23 != null && var23.field835 != null) {
                                class50.method399(0, var3.field6519, (byte) 50, var23, var3.field6520, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                int var24 = class268.field4020.method316((byte) 123);
                int var25 = class268.field4020.method279((byte) 110);
                var3.method2466(var25, class267.field4002, 74, var24);
                var3.field5669 = class267.field4002 + 300;
                var3.field5670 = class268.field4020.method276(-1536);
            }
            if ((var4 & 0x80) != 0) {
                var3.field5678 = class268.field4020.method322((byte) -34);
                var3.field5628 = 100;
            }
            if ((var4 & 0x10) != 0) {
                var3.field5625 = class268.field4020.method288(-16826);
                if (var3.field5625 == 65535) {
                    var3.field5625 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var26 = class268.field4020.method316((byte) 124);
                int var27 = class268.field4020.method279((byte) 83);
                var3.method2466(var27, class267.field4002, 82, var26);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field1545.method71(true)) {
                    class7.method46((byte) 116, var3);
                }
                var3.method817(class371.method2357(class268.field4020.method288(-16826), -13299), 17671);
                var3.method2474(false, var3.field1545.field174);
                var3.field5650 = var3.field1545.field143 << 3;
                if (var3.field1545.method71(true)) {
                    class402.method2554(var3.field5694[0], class367.field5213, (class127) null, 0, var3.field5696[0], (class45) null, (byte) 83, var3);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var28 = class268.field4020.method288(-16826);
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = class268.field4020.method279((byte) 64);
                class287.method2022(var3, var29, var28, (byte) 32);
            }
        }
        field467++;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V", line = 381)
    public static void method242(byte arg0) {
        field486 = null;
        field482 = null;
        field464 = null;
        field478 = null;
        int var1 = -57 / ((arg0 - 41) / 60);
        field475 = null;
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)[[[I", line = 395)
    public final int[][][] method243(byte arg0) {
        field483++;
        if (arg0 != 18) {
            method242((byte) -96);
        }
        if (this.field487 != this.field484) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field484; var2++) {
            this.field463[var2] = class86.field1397;
        }
        return this.field479;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[[I", line = 421)
    public final int[][] method244(int arg0, int arg1) {
        if (arg1 <= 120) {
            this.field485 = 60;
        }
        field474++;
        if (this.field487 == this.field484) {
            this.field488 = this.field463[arg0] == null;
            this.field463[arg0] = class86.field1397;
            return this.field479[arg0];
        } else if (this.field484 == 1) {
            this.field488 = this.field470 != arg0;
            this.field470 = arg0;
            return this.field479[0];
        } else {
            class323 var3 = this.field463[arg0];
            if (var3 == null) {
                this.field488 = true;
                if (this.field484 <= this.field485) {
                    class323 var4 = (class323) this.field472.method153(5346);
                    var3 = new class323(arg0, var4.field4660);
                    this.field463[var4.field4662] = null;
                    var4.method251(36);
                } else {
                    var3 = new class323(arg0, this.field485);
                    this.field485++;
                }
                this.field463[arg0] = var3;
            } else {
                this.field488 = false;
            }
            this.field472.method151(var3, 2);
            return this.field479[var3.field4660];
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(III)V", line = 544)
    public class33(int arg0, int arg1, int arg2) {
        this.field484 = arg0;
        this.field487 = arg1;
        this.field479 = new int[this.field484][3][arg2];
        this.field463 = new class323[this.field487];
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)V", line = 511)
    public static final void method245(int arg0, int arg1) {
        field468++;
        class188 var2 = (class188) class319.field4606.method1219((long) arg0, arg1 ^ 0xFFFFFF9B);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field2781.length; var3++) {
                var2.field2781[var3] = -1;
                var2.field2780[var3] = 0;
            }
        }
    }
}
