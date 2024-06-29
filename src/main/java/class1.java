import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    private int field13 = -1;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lag;")
    private class97 field1 = new class97();

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Z")
    public boolean field23 = false;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[[[I")
    private int[][][] field8;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[Lb;")
    private class51[] field7;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[S")
    public static short[] field14 = new short[256];

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field15 = "flash1:";

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    public static int[] field4 = new int[100];

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[I")
    public static int[] field19 = new int[4096];

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Z")
    public static boolean field17 = true;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field18 = 2;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field16 = "Attack";

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
    public static boolean field11 = true;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1(int arg0, String arg1) {
        field2++;
        int var2 = class251.method1656(arg1, -122);
        return arg0 == var2 ? "" : class158.method1060("<br>", class168.field2440.field1203[var2], " ", -69);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public static final int method2(int arg0, int arg1) {
        class237 var2 = class10.method91(arg1 ^ 0x82, arg0);
        field3++;
        int var3 = var2.field3570;
        int var4 = var2.field3576;
        int var5 = var2.field3572;
        if (arg1 == 128) {
            int var6 = class290.field4577[var5 - var3];
            return var6 & class20.field276[var4] >> var3;
        } else {
            return 98;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method3(int arg0) {
        field15 = null;
        field14 = null;
        field4 = null;
        field19 = null;
        if (arg0 >= -82) {
            field4 = null;
        }
        field16 = null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method4(int arg0) {
        field12++;
        if (this.field20 != this.field10) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 <= 69) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field10; var2++) {
                this.field7[var2] = class84.field1302;
            }
            return this.field8;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static final void method5(boolean arg0) {
        if (arg0) {
            class16.field233 = class264.field3985;
            class107.field1556 = class110.field1587;
        } else {
            class16.field233 = class17.field241;
            class107.field1556 = class176.field2502;
        }
        class5.field36 = class16.field233.length;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method6(int arg0, byte arg1) {
        int var3 = -80 % ((-arg1 - 43) / 36);
        field5++;
        if (this.field20 == this.field10) {
            this.field23 = this.field7[arg0] == null;
            this.field7[arg0] = class84.field1302;
            return this.field8[arg0];
        } else if (this.field10 == 1) {
            this.field23 = this.field13 != arg0;
            this.field13 = arg0;
            return this.field8[0];
        } else {
            class51 var4 = this.field7[arg0];
            if (var4 == null) {
                this.field23 = true;
                if (this.field10 > this.field22) {
                    var4 = new class51(arg0, this.field22);
                    this.field22++;
                } else {
                    class51 var5 = (class51) this.field1.method649(83);
                    var4 = new class51(arg0, var5.field752);
                    this.field7[var5.field751] = null;
                    var5.method1706(-112);
                }
                this.field7[arg0] = var4;
            } else {
                this.field23 = false;
            }
            this.field1.method657(var4, (byte) 126);
            return this.field8[var4.field752];
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILde;I)V")
    public static final void method7(int arg0, int arg1, class53 arg2, int arg3) {
        field21++;
        if ((arg0 & 0x80) != 0) {
            arg2.field95 = class68.field1071.method757(-1380156360);
            arg2.field51 = class68.field1071.method746((byte) -25);
        }
        if ((arg0 & 0x100) != 0) {
            int var4 = class68.field1071.method756(-29901);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class68.field1071.method770((byte) -111);
            boolean var6 = true;
            if (var4 != -1 && arg2.field81 != -1 && class70.method478(class274.method1848(true, var4).field138, false).field2830 < class70.method478(class274.method1848(true, arg2.field81).field138, false).field2830) {
                var6 = false;
            }
            if (var6) {
                arg2.field111 = var5 >> 16;
                arg2.field40 = (var5 & 0xFFFF) + class82.field1267;
                arg2.field46 = 1;
                arg2.field120 = 0;
                arg2.field90 = 0;
                arg2.field81 = var4;
                if (class82.field1267 < arg2.field40) {
                    arg2.field120 = -1;
                }
                if (arg2.field81 != -1 && class82.field1267 == arg2.field40) {
                    int var7 = class274.method1848(true, arg2.field81).field138;
                    if (var7 != -1) {
                        class196 var8 = class70.method478(var7, false);
                        if (var8 != null && var8.field2818 != null) {
                            class206.method1327(0, 104, var8, class55.field847 == arg2, arg2.field94, arg2.field45);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x10) != 0) {
            arg2.field97 = class68.field1071.method756(-29901);
            if (arg2.field97 == 65535) {
                arg2.field97 = -1;
            }
        }
        if ((arg0 & 0x8) != 0) {
            int var9 = class68.field1071.method733(false);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class68.field1071.method782(false);
            class162.method1091((byte) 108, var9, var10, arg2);
        }
        int var11 = -22 / ((29 - arg1) / 53);
        if ((arg0 & 0x1) != 0) {
            arg2.field69 = class68.field1071.method753(-128);
            if (arg2.field69.charAt(0) == '~') {
                arg2.field69 = arg2.field69.substring(1);
                class255.method1712((byte) 72, arg2.field69, 2, arg2.method348(-1));
            } else if (class55.field847 == arg2) {
                class255.method1712((byte) 72, arg2.field69, 2, arg2.method348(-1));
            }
            arg2.field44 = 0;
            arg2.field115 = 150;
            arg2.field99 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            int var12 = class68.field1071.method733(false);
            int var13 = class68.field1071.method760(false);
            int var14 = class68.field1071.method750((byte) 126);
            int var15 = class68.field1071.field1673;
            boolean var16 = (var12 & 0x8000) != 0;
            if (arg2.field766 != null && arg2.field765 != null) {
                boolean var17 = false;
                long var18 = class109.method712((byte) 36, arg2.field766);
                if (var13 <= 1) {
                    if (!var16 && (class108.field1560 && !class24.field320 || class136.field1965)) {
                        var17 = true;
                    } else {
                        for (int var20 = 0; var20 < class247.field3707; var20++) {
                            if (class81.field1253[var20] == var18) {
                                var17 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var17 && class266.field4005 == 0) {
                    class40.field588.field1673 = 0;
                    class68.field1071.method791(class40.field588.field1629, (byte) 99, 0, var14);
                    class40.field588.field1673 = 0;
                    int var21 = -1;
                    String var22;
                    if (var16) {
                        class29 var23 = class170.method1125((byte) 54, class40.field588);
                        var21 = var23.field410;
                        var22 = var23.field413.method1354((byte) 59, class40.field588);
                        var12 &= 0x7FFF;
                    } else {
                        var22 = class198.method1266(class281.method1890((byte) -79, class99.method664(class40.field588, true)));
                    }
                    arg2.field69 = var22.trim();
                    arg2.field44 = var12 & 0xFF;
                    arg2.field115 = 150;
                    arg2.field99 = var12 >> 8;
                    if (var13 == 2) {
                        class178.method1155((String) null, var22, "<img=1>" + arg2.method348(-1), 4096, var21, var16 ? 17 : 1);
                    } else if (var13 == 1) {
                        class178.method1155((String) null, var22, "<img=0>" + arg2.method348(-1), 4096, var21, var16 ? 17 : 1);
                    } else {
                        class178.method1155((String) null, var22, arg2.method348(-1), 4096, var21, var16 ? 17 : 2);
                    }
                }
            }
            class68.field1071.field1673 = var14 + var15;
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field43 = class68.field1071.method782(false);
            arg2.field49 = class68.field1071.method750((byte) 126);
            arg2.field135 = class68.field1071.method760(false);
            arg2.field121 = class68.field1071.method783(89);
            arg2.field76 = class68.field1071.method757(-1380156360) + class82.field1267;
            arg2.field93 = class68.field1071.method746((byte) -27) + class82.field1267;
            arg2.field92 = class68.field1071.method760(false);
            arg2.field84 = 1;
            arg2.field103 = 0;
        }
        if ((arg0 & 0x2) != 0) {
            int var24 = class68.field1071.method787((byte) 105);
            int var25 = class68.field1071.method782(false);
            arg2.method66((byte) 72, class82.field1267, var24, var25);
            arg2.field82 = class82.field1267 + 300;
            arg2.field70 = class68.field1071.method760(false);
        }
        if ((arg0 & 0x20) != 0) {
            int var26 = class68.field1071.method782(false);
            byte[] var27 = new byte[var26];
            class114 var28 = new class114(var27);
            class68.field1071.method790(0, var27, -1, var26);
            class275.field4412[arg3] = var28;
            arg2.method350(112, var28);
        }
        if ((arg0 & 0x800) != 0) {
            int var29 = class68.field1071.method750((byte) 126);
            int[] var30 = new int[var29];
            int[] var31 = new int[var29];
            int[] var32 = new int[var29];
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = class68.field1071.method756(-29901);
                if (var34 == 65535) {
                    var34 = -1;
                }
                var32[var33] = var34;
                var30[var33] = class68.field1071.method783(71);
                var31[var33] = class68.field1071.method757(-1380156360);
            }
            class61.method427(arg2, var32, 1, var31, var30);
        }
        if ((arg0 & 0x400) != 0) {
            int var35 = class68.field1071.method787((byte) 101);
            int var36 = class68.field1071.method760(false);
            arg2.method66((byte) 30, class82.field1267, var35, var36);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lkl;II)Ljava/lang/String;")
    public static final String method8(class114 arg0, int arg1, int arg2) {
        field6++;
        try {
            if (arg2 != -1) {
                field19 = null;
            }
            int var3 = arg0.method787((byte) -107);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field1673 += class217.field3210.method541(var4, arg0.field1673, arg0.field1629, (byte) 87, var3, 0);
            return class222.method1443(true, var4, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public final void method9(int arg0) {
        field9++;
        for (int var2 = 0; var2 < this.field10; var2++) {
            this.field8[var2][0] = null;
            this.field8[var2][1] = null;
            this.field8[var2][2] = null;
            this.field8[var2] = null;
        }
        this.field7 = null;
        this.field8 = null;
        this.field1.method647((byte) -70);
        this.field1 = null;
        if (arg0 != -21109) {
            this.field10 = 96;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(III)V")
    public class1(int arg0, int arg1, int arg2) {
        this.field10 = arg0;
        this.field20 = arg1;
        this.field8 = new int[this.field10][3][arg2];
        this.field7 = new class51[this.field20];
    }
}
