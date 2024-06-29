import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class221 extends class297 {

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "[S")
    private short[] field3456 = new short[257];

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field3447 = 0;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "[S")
    public static short[] field3455 = new short[] { 48, 41, 39, 59, 50, 47, 34, 38 };

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field3452 = -1;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "[I")
    public static int[] field3458 = new int[256];

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "[I")
    private int[] field3459;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "[I")
    private int[] field3460;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "[[I")
    public static int[][] field3443;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[[I")
    private int[][] field3449;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 8)
    public final void method247(byte arg0) {
        if (this.field3449 == null) {
            this.field3449 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field3461++;
        if (this.field3449.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3447 == 2) {
            this.method1612(-100);
        }
        class37.method330((byte) 36);
        if (arg0 != 68) {
            this.field3459 = (int[]) null;
        }
        this.method1615(-25697);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILaj;)V", line = 33)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            this.field3447 = -16;
        }
        if (arg0 == 0) {
            this.field3447 = arg2.method15((byte) -69);
            this.field3449 = new int[arg2.method15((byte) 76)][2];
            for (int var4 = 0; var4 < this.field3449.length; var4++) {
                this.field3449[var4][0] = arg2.method56(19612);
                this.field3449[var4][1] = arg2.method56(19612);
            }
        }
        field3441++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V", line = 62)
    public static final void method1606(byte arg0, long arg1) {
        field3457++;
        if (class73.field1112 == 1 || class73.field1112 == 5) {
            client.method1870((byte) -107, arg1);
        } else if (class73.field1112 == 2) {
            class71.method572((byte) 125);
        } else {
            class258.method1790(-4422);
        }
        if (!class260.field3858) {
            class137.field2225 = 1;
            class301.field4800[0] = class164.field2671;
            class285.field4441[0] = "";
            class120.field1960[0] = 1007;
            class179.field2856[0] = class220.field3430;
            if (class4.field109 != 0) {
                class146.field2394 = class207.field3271;
                class95.field1535 = class101.field1633;
            } else if (class200.field3072 == 0) {
                class146.field2394 = class22.field389;
                class95.field1535 = class303.field4832;
            } else {
                class95.field1535 = class170.field2740;
                class146.field2394 = class243.field3639;
            }
        }
        if (class168.field2707 != -1) {
            class47.method403(class168.field2707, (byte) 84);
        }
        for (int var3 = 0; var3 < class288.field4545; var3++) {
            if (class280.field4378[var3]) {
                class282.field4415[var3] = true;
            }
            class285.field4455[var3] = class280.field4378[var3];
            class280.field4378[var3] = false;
        }
        class14.field305 = null;
        class78.field1223 = -1;
        if (class162.field2623) {
            class26.field436 = true;
        }
        if (arg0 > -49) {
            return;
        }
        class66.field1011 = null;
        class75.field1156 = class307.field4869;
        class64.field946 = -1;
        if (class168.field2707 != -1) {
            class288.field4545 = 0;
            class53.method449(-35);
        }
        if (class162.field2623) {
            class114.method892();
        } else {
            class33.method308();
        }
        class130.method1006((byte) -74);
        if (class260.field3858) {
            if (class183.field2908) {
                class140.method1077(-13);
            } else {
                class13.method175(-12081);
            }
        } else if (class66.field1011 != null) {
            class58.method483((byte) 111, class66.field1011, class90.field1440, class34.field524);
        } else if (class78.field1223 != -1) {
            class58.method483((byte) 120, (class266) null, class64.field946, class78.field1223);
        }
        int var4 = class260.field3858 ? -1 : class273.method1945(30472);
        if (var4 == -1) {
            var4 = class178.field2832;
        }
        class10.method153(false, var4);
        if (class309.field4894 == 1) {
            class309.field4894 = 2;
        }
        if (class226.field3505 == 1) {
            class226.field3505 = 2;
        }
        if (class16.field329 == 3) {
            for (int var5 = 0; var5 < class288.field4545; var5++) {
                if (class285.field4455[var5]) {
                    if (class162.field2623) {
                        class114.method893(class277.field4356[var5], class11.field250[var5], class301.field4798[var5], class211.field3315[var5], 16711935, 128);
                    } else {
                        class33.method302(class277.field4356[var5], class11.field250[var5], class301.field4798[var5], class211.field3315[var5], 16711935, 128);
                    }
                } else if (class282.field4415[var5]) {
                    if (class162.field2623) {
                        class114.method893(class277.field4356[var5], class11.field250[var5], class301.field4798[var5], class211.field3315[var5], 16711680, 128);
                    } else {
                        class33.method302(class277.field4356[var5], class11.field250[var5], class301.field4798[var5], class211.field3315[var5], 16711680, 128);
                    }
                }
            }
        }
        class143.method1098(-74, class137.field2241, class345.field5363.field4672, class345.field5363.field4671, class75.field1153);
        class137.field2241 = 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z", line = 217)
    public static final boolean method1607(int arg0, int arg1) {
        field3454++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class120.field1960[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            if (arg0 != 0) {
                method1609(-105, false, (class92) null, -46);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpk;III)[Leg;", line = 240)
    public static final class317[] method1608(class120 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            field3452 = 81;
        }
        field3446++;
        return class107.method854(arg0, arg1, arg2, (byte) -113) ? class3.method70(true) : null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLpf;I)V", line = 257)
    public static final void method1609(int arg0, boolean arg1, class92 arg2, int arg3) {
        field3453++;
        if ((arg0 & 0x20) != 0) {
            int var4 = class80.field1248.method63(127);
            int var5 = class80.field1248.method3((byte) -117);
            arg2.method2061(var4, class307.field4869, (byte) -121, var5);
            arg2.field4703 = class307.field4869 + 300;
            arg2.field4615 = class80.field1248.method15((byte) 95);
        }
        if (!arg1) {
            method1608((class120) null, -10, -87, 97);
        }
        if ((arg0 & 0x1) != 0) {
            int var6 = class80.field1248.method29(15976);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class80.field1248.method19(255);
            class3.method78(arg2, var7, var6, true);
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field4701 = class80.field1248.method30(-683);
            arg2.field4644 = class80.field1248.method30(-683);
            arg2.field4690 = class80.field1248.method3((byte) -117);
            arg2.field4628 = class80.field1248.method15((byte) 100);
            arg2.field4627 = class80.field1248.method56(19612) + class307.field4869;
            arg2.field4648 = class80.field1248.method29(15976) + class307.field4869;
            arg2.field4608 = class80.field1248.method19(255);
            arg2.field4645 = 1;
            arg2.field4641 = 0;
        }
        if ((arg0 & 0x800) != 0) {
            int var8 = class80.field1248.method30(-683);
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            for (int var12 = 0; var12 < var8; var12++) {
                int var13 = class80.field1248.method39(-7872);
                if (var13 == 65535) {
                    var13 = -1;
                }
                var9[var12] = var13;
                var11[var12] = class80.field1248.method30(-683);
                var10[var12] = class80.field1248.method29(15976);
            }
            class78.method611((byte) 96, var10, var11, arg2, var9);
        }
        if ((arg0 & 0x80) != 0) {
            arg2.field4613 = class80.field1248.method29(15976);
            arg2.field4657 = class80.field1248.method29(15976);
        }
        if ((arg0 & 0x100) != 0) {
            int var14 = class80.field1248.method58((byte) -78);
            int var15 = class80.field1248.method62(false);
            if (var14 == 65535) {
                var14 = -1;
            }
            boolean var16 = true;
            if (var14 != -1 && arg2.field4679 != -1 && class63.method503(class52.method429(4618, var14).field1135, (byte) 121).field583 < class63.method503(class52.method429(4618, arg2.field4679).field1135, (byte) 97).field583) {
                var16 = false;
            }
            if (var16) {
                arg2.field4617 = 0;
                arg2.field4681 = 0;
                arg2.field4679 = var14;
                arg2.field4678 = 1;
                arg2.field4647 = var15 >> 16;
                arg2.field4708 = (var15 & 0xFFFF) + class307.field4869;
                if (arg2.field4708 > class307.field4869) {
                    arg2.field4681 = -1;
                }
                if (arg2.field4679 != -1 && class307.field4869 == arg2.field4708) {
                    int var17 = class52.method429(4618, arg2.field4679).field1135;
                    if (var17 != -1) {
                        class38 var18 = class63.method503(var17, (byte) 78);
                        if (var18 != null && var18.field584 != null) {
                            class28.method246(class345.field5363 == arg2, 255, 0, arg2.field4671, var18, arg2.field4672);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x2) != 0) {
            arg2.field4695 = class80.field1248.method56(19612);
            if (arg2.field4695 == 65535) {
                arg2.field4695 = -1;
            }
        }
        if ((arg0 & 0x10) != 0) {
            int var19 = class80.field1248.method56(19612);
            int var20 = class80.field1248.method15((byte) 80);
            int var21 = class80.field1248.method15((byte) 78);
            int var22 = class80.field1248.field48;
            boolean var23 = (var19 & 0x8000) != 0;
            if (arg2.field1486 != null && arg2.field1485 != null) {
                long var24 = class106.method851(arg2.field1486, -23);
                boolean var26 = false;
                if (var20 <= 1) {
                    if (var23 || (!class241.field3614 || class173.field2768) && !class241.field3615) {
                        for (int var27 = 0; var27 < class321.field5024; var27++) {
                            if (class158.field2587[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                    } else {
                        var26 = true;
                    }
                }
                if (!var26 && class293.field4602 == 0) {
                    class158.field2586.field48 = 0;
                    class80.field1248.method20(class158.field2586.field34, 0, (byte) -101, var21);
                    int var28 = -1;
                    class158.field2586.field48 = 0;
                    String var29;
                    if (var23) {
                        var19 &= 0x7FFF;
                        class190 var30 = class45.method389(class158.field2586, 75);
                        var28 = var30.field2981;
                        var29 = var30.field2980.method2291(class158.field2586, 1);
                    } else {
                        var29 = class205.method1478(class118.method928(class331.method2322(class158.field2586, (byte) -108), 2));
                    }
                    arg2.field4699 = var29.trim();
                    arg2.field4669 = 150;
                    arg2.field4685 = var19 & 0xFF;
                    arg2.field4637 = var19 >> 8;
                    if (var20 == 2) {
                        class115.method901(var23 ? 17 : 1, 14, var28, "<img=1>" + arg2.method735((byte) -107), var29, (String) null);
                    } else if (var20 == 1) {
                        class115.method901(var23 ? 17 : 1, -99, var28, "<img=0>" + arg2.method735((byte) -114), var29, (String) null);
                    } else {
                        class115.method901(var23 ? 17 : 2, -123, var28, arg2.method735((byte) 100), var29, (String) null);
                    }
                }
            }
            class80.field1248.field48 = var21 + var22;
        }
        if ((arg0 & 0x8) != 0) {
            arg2.field4699 = class80.field1248.method53(32);
            if (arg2.field4699.charAt(0) == '~') {
                arg2.field4699 = arg2.field4699.substring(1);
                class129.method1003(2, arg2.field4699, arg2.method735((byte) -37), 89);
            } else if (class345.field5363 == arg2) {
                class129.method1003(2, arg2.field4699, arg2.method735((byte) 119), -115);
            }
            arg2.field4637 = 0;
            arg2.field4685 = 0;
            arg2.field4669 = 150;
        }
        if ((arg0 & 0x400) != 0) {
            int var31 = class80.field1248.method63(127);
            int var32 = class80.field1248.method30(-683);
            arg2.method2061(var31, class307.field4869, (byte) -42, var32);
        }
        if ((arg0 & 0x40) == 0) {
            return;
        }
        int var33 = class80.field1248.method15((byte) 81);
        byte[] var34 = new byte[var33];
        class1 var35 = new class1(var34);
        class80.field1248.method48(var33, 0, false, var34);
        class282.field4419[arg3] = var35;
        arg2.method731(-20812, var35);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 534)
    public class221() {
        super(1, true);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I", line = 538)
    private final int[] method1610(int arg0, int arg1) {
        field3450++;
        if (arg0 != 1) {
            method1611(-63, 60, 69);
        }
        if (arg1 < 0) {
            return this.field3459;
        } else if (this.field3449.length <= arg1) {
            return this.field3460;
        } else {
            return this.field3449[arg1];
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)[I", line = 558)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1612(122);
        }
        field3442++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 118, 0);
            for (int var5 = 0; var5 < class31.field491; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3456[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lkj;", line = 598)
    public static final class188 method1611(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class188 var4 = var3.field664;
            var3.field664 = null;
            return var4;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3458[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V", line = 617)
    private final void method1612(int arg0) {
        field3451++;
        int[] var2 = this.field3449[1];
        int[] var3 = this.field3449[0];
        if (arg0 < 0) {
            int[] var4 = this.field3449[this.field3449.length - 1];
            int[] var5 = this.field3449[this.field3449.length - 2];
            this.field3459 = new int[] { var3[0] + var3[0] - var2[0], var3[1] + var3[1] + -var2[1] };
            this.field3460 = new int[] { var5[0] + var5[0] - var4[0], var5[1] + -var4[1] + var5[1] };
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(III)Le;", line = 641)
    public static final class170 method1613(int arg0, int arg1, int arg2) {
        field3448++;
        if (arg2 != -8410) {
            method1607(74, 32);
        }
        class170 var3 = (class170) class110.field1786.method79((long) arg1 | (long) arg0 << 32, (byte) 0);
        if (var3 == null) {
            var3 = new class170(arg0, arg1);
            class110.field1786.method75(var3, -1, var3.field879);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(III)I", line = 669)
    public static final int method1614(int arg0, int arg1, int arg2) {
        field3445++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 != 2) {
            field3452 = -33;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 691)
    private final void method1615(int arg0) {
        field3444++;
        if (arg0 != -25697) {
            method1606((byte) -33, 78L);
        }
        int var2 = this.field3447;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field3449.length - 1) > var5 && var4 >= this.field3449[var5][0]; var5++) {
                }
                int[] var6 = this.field3449[var5 - 1];
                int[] var7 = this.field3449[var5];
                int var8 = this.method1610(1, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1610(1, var5 + 1)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var11 + var9 - var10 - var8;
                int var14 = var12 * var12 >> 12;
                int var15 = var8 - var13 - var9;
                int var16 = (var12 * var13 >> 12) * var14 >> 12;
                int var17 = var10 - var8;
                int var19 = var14 * var15 >> 12;
                int var20 = var12 * var17 >> 12;
                int var21 = var19 + var20 + var16 + var9;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3456[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field3449.length - 1) > var24 && this.field3449[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field3449[var24 - 1];
                int[] var26 = this.field3449[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class66.field986[var27 >> 5 & 0xFF] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + (var26[1] * var28) >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3456[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; this.field3449.length - 1 > var33 && this.field3449[var33][0] <= var32; var33++) {
                }
                int[] var34 = this.field3449[var33 - 1];
                int[] var35 = this.field3449[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + var35[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3456[var31] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V", line = 899)
    public static void method1616(int arg0) {
        field3443 = (int[][]) null;
        field3458 = null;
        int var1 = 49 % ((66 - arg0) / 44);
        field3455 = null;
    }
}
