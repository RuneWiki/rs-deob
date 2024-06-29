import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class23 extends class61 {

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[Lsd;")
    public class23[] field376;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Z")
    public boolean field373;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Llc;")
    public static class143 field368 = class66.method374("Connexion perdue)3", -1);

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Llc;")
    public static class143 field364 = class66.method374("Liste des serveurs charg-Be", -1);

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field380 = -1;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lsg;")
    public class31 field366;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lb;")
    public class50 field369;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Lgf;")
    public static class7 field385;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Ljava/awt/Frame;")
    public static Frame field384;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[Lbc;")
    public static class100[] field381;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)[I")
    public final int[] method155(int arg0, byte arg1, int arg2) {
        field388++;
        if (arg1 <= 78) {
            this.method155(-123, (byte) -55, -90);
        }
        return this.field376[arg2].field373 ? this.field376[arg2].method86(-83, arg0) : this.field376[arg2].method131(arg0, 1)[0];
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
    public int method156(byte arg0) {
        if (arg0 == 84) {
            field372++;
            return -1;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIBI)V")
    private static final void method157(int arg0, int arg1, byte arg2, int arg3) {
        field374++;
        class43 var4 = class185.method1211(-128, arg1, arg0);
        if (var4 != null && var4.field828 != null) {
            class91 var5 = new class91();
            var5.field1641 = var4;
            var5.field1639 = var4.field828;
            class247.method1638(var5, (byte) -91);
        }
        if (arg2 > -25) {
            field385 = null;
        }
        class106.field1864 = arg3;
        class58.field1113 = arg1;
        class254.field4564 = arg0;
        class71.field1351 = true;
        class141.method844((byte) 25, var4);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public void method126(byte arg0) {
        field367++;
        if (arg0 <= 90) {
            this.method155(58, (byte) -95, -49);
        }
        if (this.field373) {
            this.field369.method309(0);
            this.field369 = null;
        } else {
            this.field366.method210(0);
            this.field366 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static void method158(int arg0) {
        field384 = null;
        field385 = null;
        if (arg0 < 123) {
            method163(-12, -89, (byte) -124);
        }
        field381 = null;
        field368 = null;
        field364 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
    public int[] method86(int arg0, int arg1) {
        field379++;
        if (arg0 >= -13) {
            field384 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBIIIIIIIII)V")
    public static final void method159(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field386++;
        int var11 = arg3 - arg10;
        int var12 = -14 % ((arg1 + 47) / 36);
        int var13 = arg2 - arg5;
        boolean var14;
        if (class173.field3112 > 0 && class173.field3112 % 10 < 5) {
            var14 = true;
        } else {
            var14 = false;
        }
        int var15 = 983040 / arg4;
        int var16 = 983040 / arg9;
        for (int var17 = -var15; var17 < var11 + var15; var17++) {
            int var19 = arg4 * var17 + arg8 >> 16;
            int var20 = (var17 + 1) * arg4 + arg8 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg0 + var20;
                int var23 = arg0 + var19;
                int var24 = arg10 + var17 >> 6;
                if (var24 >= 0 && var24 <= (class234.field4271.length - 1)) {
                    int[][] var25 = class234.field4271[var24];
                    for (int var26 = -var16; var26 < var13 + var16; var26++) {
                        int var27 = arg9 * var26 + arg7 >> 16;
                        int var28 = (var26 + 1) * arg9 + arg7 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg6 + var27;
                            int var31 = arg5 + var26 >> 6;
                            var10000 = arg6 + var28;
                            if (var31 >= 0 && var31 <= var25.length - 1 && var25[var31] != null) {
                                int var33 = (arg5 + var26 & 0x3F << 6) + (arg10 + var17 & 0x3F);
                                int var34 = var25[var31][var33];
                                if (var34 != 0) {
                                    class209 var35 = class34.method232(167, var34 - 1);
                                    if (var14 && class66.field1261 == var35.field3851) {
                                        class59 var36 = new class59();
                                        var36.field1136 = var30;
                                        var36.field1133 = var35.field3851;
                                        var36.field1132 = var23;
                                        class254.field4557.method1290((byte) -44, var36);
                                    }
                                    class127.field2248[var35.field3851].method1058(var23 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class59 var18 = (class59) class254.field4557.method1294(false); var18 != null; var18 = (class59) class254.field4557.method1292((byte) 114)) {
            class127.field2248[var18.field1133].method1058(var18.field1132 - 7, var18.field1136 + -7);
            class260.method1718(var18.field1132, var18.field1136, 15, 16776960, 128);
            class260.method1718(var18.field1132, var18.field1136, 7, 16777215, 256);
        }
        class254.field4557.method1293(false);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public void method85(byte arg0) {
        field382++;
        int var2 = -82 / ((arg0 - 22) / 60);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
    public final void method160(byte arg0, int arg1, int arg2) {
        field365++;
        int var4 = this.field371 == 255 ? arg2 : this.field371;
        if (this.field373) {
            this.field369 = new class50(var4, arg2, arg1);
        } else {
            this.field366 = new class31(var4, arg2, arg1);
        }
        if (arg0 != -128) {
            this.field371 = 39;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)[[I")
    public final int[][] method161(int arg0, int arg1, int arg2) {
        field383++;
        if (arg2 != 0) {
            return null;
        } else if (this.field376[arg1].field373) {
            int[] var4 = this.field376[arg1].method86(arg2 - 46, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field376[arg1].method131(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
    public static final void method162(byte arg0, int arg1) {
        field377++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class128.field2269[arg1];
        int var3 = class122.field2147[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = (int) class69.field1321[arg1];
        long var5 = class69.field1321[arg1];
        int var7 = class168.field3006[arg1];
        if (var3 == 6) {
            class34.field587++;
            class285.field5010.method799(103, 119);
            class285.field5010.method1278(var2, (byte) 115);
            class285.field5010.method1272(arg0 ^ 0xFFFFF330, var4);
            class285.field5010.method1262(-23499, var7);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 46) {
            if (var4 == 0) {
                class105.method629(class170.field3044, var2, var7);
            } else if (var4 == 1) {
                if (class162.field2914 > 0 && class128.field2264[82] && class128.field2264[81]) {
                    class146.method935(class148.field2733 + var2, class170.field3044, class141.field2466 + var7, false);
                } else if (class203.method1389((byte) -99, true, 0, 1, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0)) {
                    class285.field5010.method1276(844519173, class194.field3600);
                    class285.field5010.method1276(arg0 + 844519260, class234.field4246);
                    class285.field5010.method1278(class184.field3339, (byte) 69);
                    class285.field5010.method1276(arg0 ^ 0xCDA9A8AC, 57);
                    class285.field5010.method1276(844519173, class137.field2400);
                    class285.field5010.method1276(844519173, class230.field4211);
                    class285.field5010.method1276(844519173, 89);
                    class285.field5010.method1278(class229.field4195.field4178, (byte) 54);
                    class285.field5010.method1278(class229.field4195.field4108, (byte) 99);
                    class285.field5010.method1276(arg0 + 844519260, class15.field267);
                    class285.field5010.method1276(844519173, 63);
                }
            }
        }
        if (var3 == 29) {
            class267.field4787++;
            class285.field5010.method799(103, 251);
            class285.field5010.method1241((byte) 25, var7);
            class285.field5010.method1272(3225, var2);
            class285.field5010.method1245(var4, 97);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 25) {
            class285.field5010.method799(103, 58);
            class285.field5010.method1280(-127, var7);
            class43.field827++;
            class43 var8 = class27.method186(1341, var7);
            if (var8.field815 != null && var8.field815[0][0] == 5) {
                int var9 = var8.field815[0][1];
                class148.field2691[var9] = 1 - class148.field2691[var9];
                class24.method172(0, var9);
            }
        }
        if (var3 == 1006) {
            class43 var10 = class27.method186(1341, var7);
            if (var10 == null || var10.field889[var2] < 100000) {
                class254.field4555++;
                class285.field5010.method799(103, 133);
                class285.field5010.method1272(3225, var4);
            } else {
                class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { class274.method1806(var10.field889[var2], true), class117.field2084, class262.method1743(var4, 17366).field2681 }), 0);
            }
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 35) {
            class32 var11 = class6.field97[var4];
            if (var11 != null) {
                class147.field2656++;
                class203.method1389((byte) -69, false, 0, 2, 1, var11.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var11.field4115[0], 0, 0);
                class167.field2982 = 0;
                class17.field301 = 2;
                class17.field290 = class31.field499;
                class51.field1009 = class67.field1279;
                class285.field5010.method799(103, 157);
                class285.field5010.method1272(3225, var4);
            }
        }
        if (var3 == 1001) {
            class167.field2982 = 0;
            class51.field1009 = class67.field1279;
            class17.field301 = 2;
            class17.field290 = class31.field499;
            class228.field4165++;
            class285.field5010.method799(103, 245);
            class285.field5010.method1278(var4, (byte) 36);
        }
        if (var3 == 18) {
            class91.field1638++;
            class256.method1693(var2, var7, var5, 1003726175);
            class285.field5010.method799(103, 134);
            class285.field5010.method1244(class141.field2466 + var7, true);
            class285.field5010.method1245((int) (var5 >>> 32) & Integer.MAX_VALUE, 89);
            class285.field5010.method1244(class148.field2733 + var2, true);
        }
        if (var3 == 41) {
            class105.field1854++;
            if (class153.field2764 == 1) {
                class203.method1389((byte) -26, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            } else {
                boolean var12 = class203.method1389((byte) -103, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
                if (!var12) {
                    class203.method1389((byte) -108, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
                }
            }
            class51.field1009 = class67.field1279;
            class167.field2982 = 0;
            class17.field290 = class31.field499;
            class17.field301 = 2;
            class285.field5010.method799(103, 39);
            class285.field5010.method1245(class148.field2733 + var2, 90);
            class285.field5010.method1278(var4, (byte) 111);
            class285.field5010.method1244(class141.field2466 + var7, true);
        }
        if (var3 == 14 && class281.field4937 == null) {
            class187.method1217(var2, var7, arg0 + 210);
            class281.field4937 = class185.method1211(-51, var7, var2);
            class141.method844((byte) -126, class281.field4937);
        }
        if (var3 == 50) {
            if (var4 == 0) {
                class63.field1203 = true;
                class105.method629(class170.field3044, var2, var7);
            } else if (class162.field2914 > 0 && class128.field2264[82] && class128.field2264[81]) {
                class146.method935(class148.field2733 + var2, class170.field3044, class141.field2466 + var7, false);
            } else {
                class285.field5010.method799(103, 36);
                class37.field644++;
                class285.field5010.method1245(class148.field2733 + var2, 109);
                class285.field5010.method1272(arg0 ^ 0xFFFFF330, class141.field2466 + var7);
            }
        }
        if (var3 == 43) {
            class112.field1975++;
            class256.method1693(var2, var7, var5, arg0 + 1003726262);
            class285.field5010.method799(103, 180);
            class285.field5010.method1244(class141.field2466 + var7, true);
            class285.field5010.method1272(3225, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class285.field5010.method1272(3225, class148.field2733 + var2);
        }
        if (var3 == 21) {
            class8.field154++;
            class285.field5010.method799(103, 95);
            class285.field5010.method1262(-23499, var7);
            class285.field5010.method1245(var4, arg0 + 197);
            class285.field5010.method1245(var2, 62);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 30 && class256.method1693(var2, var7, var5, 1003726175)) {
            class285.field5010.method799(103, 141);
            class114.field1984++;
            class285.field5010.method1278(class146.field2642, (byte) 116);
            class285.field5010.method1245(class162.field2912, 56);
            class285.field5010.method1278((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 25);
            class285.field5010.method1241((byte) 25, class179.field3198);
            class285.field5010.method1278(class148.field2733 + var2, (byte) 86);
            class285.field5010.method1244(var7 + class141.field2466, true);
        }
        if (var3 == 60) {
            class32 var14 = class6.field97[var4];
            if (var14 != null) {
                class203.method1389((byte) -12, false, 0, 2, 1, var14.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var14.field4115[0], 0, 0);
                class51.field1009 = class67.field1279;
                class17.field290 = class31.field499;
                class17.field301 = 2;
                class272.field4857++;
                class167.field2982 = 0;
                class285.field5010.method799(103, 56);
                class285.field5010.method1278(var4, (byte) 119);
            }
        }
        if (var3 == 1) {
            class187 var15 = class259.field4648[var4];
            if (var15 != null) {
                class203.method1389((byte) -112, false, 0, 2, 1, var15.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var15.field4115[0], 0, 0);
                class17.field301 = 2;
                class17.field290 = class31.field499;
                class74.field1377++;
                class167.field2982 = 0;
                class51.field1009 = class67.field1279;
                class285.field5010.method799(arg0 ^ 0xFFFFFFCE, 94);
                class285.field5010.method1244(var4, true);
            }
        }
        if (var3 == 42) {
            class279.field4921++;
            class285.field5010.method799(103, 117);
            class285.field5010.method1244(var4, true);
            class285.field5010.method1278(var2, (byte) 81);
            class285.field5010.method1262(-23499, var7);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 2) {
            class53.field1037++;
            class285.field5010.method799(arg0 + 190, 208);
            class285.field5010.method1244(var4, true);
            class285.field5010.method1278(var2, (byte) 48);
            class285.field5010.method1241((byte) 25, var7);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 48) {
            class187 var16 = class259.field4648[var4];
            if (var16 != null) {
                class101.field1799++;
                class203.method1389((byte) -80, false, 0, 2, 1, var16.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var16.field4115[0], 0, 0);
                class17.field290 = class31.field499;
                class167.field2982 = 0;
                class17.field301 = 2;
                class51.field1009 = class67.field1279;
                class285.field5010.method799(103, 129);
                class285.field5010.method1241((byte) 25, class179.field3198);
                class285.field5010.method1272(3225, class162.field2912);
                class285.field5010.method1272(3225, class146.field2642);
                class285.field5010.method1244(var4, true);
            }
        }
        if (var3 == 36) {
            class32 var17 = class6.field97[var4];
            if (var17 != null) {
                class128.field2266++;
                class203.method1389((byte) -75, false, 0, 2, 1, var17.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var17.field4115[0], 0, 0);
                class17.field301 = 2;
                class167.field2982 = 0;
                class17.field290 = class31.field499;
                class51.field1009 = class67.field1279;
                class285.field5010.method799(103, 77);
                class285.field5010.method1245(var4, arg0 ^ 0xFFFFFFCE);
            }
        }
        if (var3 == 59) {
            class262.field4677++;
            if (class153.field2764 == 1) {
                class203.method1389((byte) -8, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            } else {
                boolean var18 = class203.method1389((byte) -116, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
                if (!var18) {
                    class203.method1389((byte) -91, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
                }
            }
            class17.field290 = class31.field499;
            class17.field301 = 2;
            class51.field1009 = class67.field1279;
            class167.field2982 = 0;
            class285.field5010.method799(103, 173);
            class285.field5010.method1272(3225, var2 + class148.field2733);
            class285.field5010.method1278(var7 + class141.field2466, (byte) 62);
            class285.field5010.method1272(3225, var4);
        }
        if (var3 == 1005) {
            class17.field301 = 2;
            class167.field2982 = 0;
            class254.field4555++;
            class51.field1009 = class67.field1279;
            class17.field290 = class31.field499;
            class285.field5010.method799(103, 133);
            class285.field5010.method1272(arg0 ^ 0xFFFFF330, var4);
        }
        if (var3 == 8) {
            class32 var20 = class6.field97[var4];
            if (var20 != null) {
                class258.field4631++;
                class203.method1389((byte) -38, false, 0, 2, 1, var20.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var20.field4115[0], 0, 0);
                class17.field301 = 2;
                class167.field2982 = 0;
                class17.field290 = class31.field499;
                class51.field1009 = class67.field1279;
                class285.field5010.method799(103, 224);
                class285.field5010.method1278(var4, (byte) 121);
            }
        }
        if (var3 == 28) {
            boolean var21 = true;
            class43 var22 = class27.method186(1341, var7);
            if (var22.field862 > 0) {
                var21 = class26.method182(var22, (byte) -29);
            }
            if (var21) {
                class285.field5010.method799(arg0 ^ 0xFFFFFFCE, 58);
                class43.field827++;
                class285.field5010.method1280(-121, var7);
            }
        }
        if (var3 == 16) {
            class230.field4202++;
            class285.field5010.method799(103, 139);
            class285.field5010.method1272(3225, var2);
            class285.field5010.method1233((byte) 71, var7);
            class285.field5010.method1278(var4, (byte) 23);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 26) {
            class285.field5010.method799(103, 241);
            class65.field1214++;
            class285.field5010.method1278(var4, (byte) 120);
            class285.field5010.method1233((byte) 71, class179.field3198);
            class285.field5010.method1233((byte) 71, var7);
            class285.field5010.method1244(class162.field2912, true);
            class285.field5010.method1244(class146.field2642, true);
            class285.field5010.method1272(3225, var2);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 9) {
            class187 var23 = class259.field4648[var4];
            if (var23 != null) {
                class203.method1389((byte) -51, false, 0, 2, 1, var23.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var23.field4115[0], 0, 0);
                class55.field1060++;
                class167.field2982 = 0;
                class51.field1009 = class67.field1279;
                class17.field301 = 2;
                class17.field290 = class31.field499;
                class285.field5010.method799(103, 81);
                class285.field5010.method1272(3225, var4);
                class285.field5010.method1245(class254.field4564, 114);
                class285.field5010.method1233((byte) 71, class58.field1113);
            }
        }
        if (var3 == 32) {
            class95.field1735++;
            if (class153.field2764 == 1) {
                class203.method1389((byte) -29, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            } else {
                boolean var24 = class203.method1389((byte) -58, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
                if (!var24) {
                    class203.method1389((byte) -84, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
                }
            }
            class51.field1009 = class67.field1279;
            class17.field301 = 2;
            class167.field2982 = 0;
            class17.field290 = class31.field499;
            class285.field5010.method799(103, 170);
            class285.field5010.method1272(3225, var4);
            class285.field5010.method1245(class141.field2466 + var7, 70);
            class285.field5010.method1245(class148.field2733 + var2, 74);
        }
        if (var3 == 57) {
            class7.method49(22461);
            class43 var26 = class27.method186(1341, var7);
            class162.field2912 = var2;
            class175.field3132 = 1;
            class179.field3198 = var7;
            class146.field2642 = var4;
            class141.method844((byte) -124, var26);
            class210.field3904 = class25.method179(arg0 + 87, new class143[] { class245.field4390, class262.method1743(var4, arg0 + 17453).field2681, class68.field1293 });
            if (class210.field3904 == null) {
                class210.field3904 = class248.field4453;
            }
            return;
        }
        if (var3 == 4) {
            class58.field1116++;
            boolean var27 = class203.method1389((byte) -17, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
            if (!var27) {
                class203.method1389((byte) -29, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            }
            class51.field1009 = class67.field1279;
            class17.field301 = 2;
            class167.field2982 = 0;
            class17.field290 = class31.field499;
            class285.field5010.method799(103, 67);
            class285.field5010.method1272(arg0 ^ 0xFFFFF330, class162.field2912);
            class285.field5010.method1272(3225, class141.field2466 + var7);
            class285.field5010.method1262(-23499, class179.field3198);
            class285.field5010.method1244(var4, true);
            class285.field5010.method1272(3225, var2 + class148.field2733);
            class285.field5010.method1244(class146.field2642, true);
        }
        if (var3 == 44) {
            class32 var29 = class6.field97[var4];
            if (var29 != null) {
                class203.method1389((byte) -41, false, 0, 2, 1, var29.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var29.field4115[0], 0, 0);
                class17.field301 = 2;
                class167.field2982 = 0;
                class17.field290 = class31.field499;
                class51.field1009 = class67.field1279;
                class244.field4384++;
                class285.field5010.method799(103, 54);
                class285.field5010.method1278(var4, (byte) 25);
            }
        }
        if (var3 == 15) {
            class157.field2845++;
            if (class153.field2764 == 1) {
                class203.method1389((byte) -88, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            } else {
                boolean var30 = class203.method1389((byte) -49, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
                if (!var30) {
                    class203.method1389((byte) -121, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
                }
            }
            class17.field301 = 2;
            class17.field290 = class31.field499;
            class167.field2982 = 0;
            class51.field1009 = class67.field1279;
            class285.field5010.method799(103, 65);
            class285.field5010.method1244(class141.field2466 + var7, true);
            class285.field5010.method1278(class148.field2733 + var2, (byte) 55);
            class285.field5010.method1245(var4, 123);
        }
        if (var3 == 51) {
            class32 var32 = class6.field97[var4];
            if (var32 != null) {
                class203.method1389((byte) -107, false, 0, 2, 1, var32.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var32.field4115[0], 0, 0);
                class167.field2982 = 0;
                class68.field1309++;
                class17.field301 = 2;
                class51.field1009 = class67.field1279;
                class17.field290 = class31.field499;
                class285.field5010.method799(arg0 ^ 0xFFFFFFCE, 181);
                class285.field5010.method1272(3225, class146.field2642);
                class285.field5010.method1262(arg0 ^ 0x5B9C, class179.field3198);
                class285.field5010.method1244(var4, true);
                class285.field5010.method1245(class162.field2912, arg0 ^ 0xFFFFFFDE);
            }
        }
        if (var3 == 40) {
            class256.method1693(var2, var7, var5, 1003726175);
            class4.field52++;
            class285.field5010.method799(103, 131);
            class285.field5010.method1245(var7 + class141.field2466, 109);
            class285.field5010.method1244((int) (var5 >>> 32) & Integer.MAX_VALUE, true);
            class285.field5010.method1244(class148.field2733 + var2, true);
        }
        if (var3 == 38) {
            class10.field220++;
            class285.field5010.method799(103, 53);
            class285.field5010.method1262(-23499, class58.field1113);
            class285.field5010.method1262(arg0 ^ 0x5B9C, var7);
            class285.field5010.method1245(var2, 77);
            class285.field5010.method1245(class254.field4564, 111);
        }
        if (var3 == 1007) {
            class167.field2982 = 0;
            class17.field290 = class31.field499;
            class51.field1009 = class67.field1279;
            class17.field301 = 2;
            class187 var33 = class259.field4648[var4];
            if (var33 != null) {
                class85 var34 = var33.field3384;
                if (var34.field1538 != null) {
                    var34 = var34.method489(arg0 - 23590);
                }
                if (var34 != null) {
                    class285.field5010.method799(arg0 + 190, 223);
                    class263.field4696++;
                    class285.field5010.method1278(var34.field1522, (byte) 26);
                }
            }
        }
        if (var3 == 47) {
            class285.field5010.method799(103, 58);
            class43.field827++;
            class285.field5010.method1280(arg0 ^ 0x2A, var7);
            class43 var35 = class27.method186(1341, var7);
            if (var35.field815 != null && var35.field815[0][0] == 5) {
                int var36 = var35.field815[0][1];
                if (class148.field2691[var36] != var35.field712[0]) {
                    class148.field2691[var36] = var35.field712[0];
                    class24.method172(0, var36);
                }
            }
        }
        if (var3 == 49) {
            class32 var37 = class6.field97[var4];
            if (var37 != null) {
                class203.method1389((byte) -92, false, 0, 2, 1, var37.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var37.field4115[0], 0, 0);
                class51.field1009 = class67.field1279;
                class17.field290 = class31.field499;
                class167.field2982 = 0;
                class27.field445++;
                class17.field301 = 2;
                class285.field5010.method799(103, 236);
                class285.field5010.method1278(var4, (byte) 125);
            }
        }
        if (var3 == 39) {
            class285.field5010.method799(103, 214);
            class207.field3806++;
            class285.field5010.method1280(-114, var7);
            class285.field5010.method1278(var4, (byte) 42);
            class285.field5010.method1278(var2, (byte) 25);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 23) {
            class47.field923++;
            boolean var38 = class203.method1389((byte) -72, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
            if (!var38) {
                class203.method1389((byte) -10, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            }
            class51.field1009 = class67.field1279;
            class17.field290 = class31.field499;
            class17.field301 = 2;
            class167.field2982 = 0;
            class285.field5010.method799(103, 175);
            class285.field5010.method1278(var4, (byte) 81);
            class285.field5010.method1278(var7 + class141.field2466, (byte) 84);
            class285.field5010.method1262(-23499, class58.field1113);
            class285.field5010.method1278(var2 + class148.field2733, (byte) 91);
            class285.field5010.method1278(class254.field4564, (byte) 79);
        }
        if (var3 == 1003) {
            class153.field2770++;
            class256.method1693(var2, var7, var5, 1003726175);
            class285.field5010.method799(arg0 + 190, 210);
            class285.field5010.method1278(class141.field2466 + var7, (byte) 61);
            class285.field5010.method1245(class148.field2733 + var2, arg0 ^ 0xFFFFFFD0);
            class285.field5010.method1244(Integer.MAX_VALUE & (int) (var5 >>> 32), true);
        }
        if (var3 == 11) {
            class285.field5010.method799(103, 28);
            class285.field5010.method1278(var2, (byte) 29);
            class285.field5010.method1244(var4, true);
            class163.field2922++;
            class285.field5010.method1233((byte) 71, var7);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 19) {
            class32 var40 = class6.field97[var4];
            if (var40 != null) {
                class62.field1176++;
                class203.method1389((byte) -6, false, 0, 2, 1, var40.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var40.field4115[0], 0, 0);
                class17.field290 = class31.field499;
                class51.field1009 = class67.field1279;
                class167.field2982 = 0;
                class17.field301 = 2;
                class285.field5010.method799(103, 190);
                class285.field5010.method1245(var4, 104);
            }
        }
        if (var3 == 31) {
            class285.field5010.method799(arg0 ^ 0xFFFFFFCE, 130);
            class8.field153++;
            class285.field5010.method1241((byte) 25, var7);
            class285.field5010.method1244(var2, true);
            class285.field5010.method1244(class254.field4564, true);
            class285.field5010.method1233((byte) 71, class58.field1113);
            class285.field5010.method1278(var4, (byte) 41);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 58) {
            class256.method1693(var2, var7, var5, arg0 + 1003726262);
            class285.field5010.method799(arg0 + 190, 23);
            class261.field4658++;
            class285.field5010.method1278(class148.field2733 + var2, (byte) 23);
            class285.field5010.method1278(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 65);
            class285.field5010.method1272(3225, var7 + class141.field2466);
        }
        if (var3 == 24) {
            class187 var41 = class259.field4648[var4];
            if (var41 != null) {
                class203.method1389((byte) -4, false, 0, 2, 1, var41.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var41.field4115[0], 0, 0);
                class167.field2982 = 0;
                class17.field301 = 2;
                class127.field2243++;
                class51.field1009 = class67.field1279;
                class17.field290 = class31.field499;
                class285.field5010.method799(103, 126);
                class285.field5010.method1244(var4, true);
            }
        }
        if (var3 == 7 || var3 == 1002) {
            class63.method359(class136.field2382[arg1], (byte) 103, var2, var7, var4);
        }
        if (var3 == 5) {
            class187 var42 = class259.field4648[var4];
            if (var42 != null) {
                class203.method1389((byte) -40, false, 0, 2, 1, var42.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var42.field4115[0], 0, 0);
                class17.field290 = class31.field499;
                class116.field2062++;
                class51.field1009 = class67.field1279;
                class167.field2982 = 0;
                class17.field301 = 2;
                class285.field5010.method799(103, 169);
                class285.field5010.method1272(3225, var4);
            }
        }
        if (var3 == 13) {
            class226.field4086++;
            class285.field5010.method799(103, 48);
            class285.field5010.method1241((byte) 25, var7);
            class285.field5010.method1272(3225, var2);
            class285.field5010.method1245(var4, 93);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 34) {
            class8.field156++;
            class285.field5010.method799(arg0 + 190, 200);
            class285.field5010.method1241((byte) 25, var7);
            class285.field5010.method1244(var2, true);
            class285.field5010.method1245(var4, 68);
            class158.field2857 = 0;
            class283.field4994 = class27.method186(1341, var7);
            class3.field41 = var2;
        }
        if (var3 == 45) {
            class32 var43 = class6.field97[var4];
            if (var43 != null) {
                class256.field4616++;
                class203.method1389((byte) -108, false, 0, 2, 1, var43.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var43.field4115[0], 0, 0);
                class17.field301 = 2;
                class51.field1009 = class67.field1279;
                class17.field290 = class31.field499;
                class167.field2982 = 0;
                class285.field5010.method799(103, 226);
                class285.field5010.method1233((byte) 71, class58.field1113);
                class285.field5010.method1278(var4, (byte) 98);
                class285.field5010.method1272(3225, class254.field4564);
            }
        }
        if (var3 == 17) {
            class187 var44 = class259.field4648[var4];
            if (var44 != null) {
                class203.method1389((byte) -46, false, 0, 2, 1, var44.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var44.field4115[0], 0, 0);
                class51.field1009 = class67.field1279;
                class124.field2184++;
                class17.field290 = class31.field499;
                class167.field2982 = 0;
                class17.field301 = 2;
                class285.field5010.method799(103, 85);
                class285.field5010.method1245(var4, 50);
            }
        }
        if (var3 == 3) {
            class32 var45 = class6.field97[var4];
            if (var45 != null) {
                class203.method1389((byte) -5, false, 0, 2, 1, var45.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var45.field4115[0], 0, 0);
                class17.field290 = class31.field499;
                class51.field1009 = class67.field1279;
                class72.field1363++;
                class167.field2982 = 0;
                class17.field301 = 2;
                class285.field5010.method799(arg0 ^ 0xFFFFFFCE, 114);
                class285.field5010.method1245(var4, 52);
            }
        }
        if (arg0 != -87) {
            method159(79, (byte) 8, 34, -52, -72, 118, 90, 85, -16, 68, -3);
        }
        if (var3 == 37) {
            class148.field2735++;
            if (class153.field2764 == 1) {
                class203.method1389((byte) -120, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
            } else {
                boolean var46 = class203.method1389((byte) -25, false, 0, 2, 0, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 0, var7, 0, 0);
                if (!var46) {
                    class203.method1389((byte) -29, false, 0, 2, 1, var2, class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var7, 0, 0);
                }
            }
            class17.field290 = class31.field499;
            class17.field301 = 2;
            class167.field2982 = 0;
            class51.field1009 = class67.field1279;
            class285.field5010.method799(103, 33);
            class285.field5010.method1245(var4, arg0 ^ 0xFFFFFFDE);
            class285.field5010.method1272(3225, class148.field2733 + var2);
            class285.field5010.method1272(arg0 + 3312, var7 - -class141.field2466);
        }
        if (var3 == 20) {
            class116.method704((byte) -63);
        }
        if (var3 == 12) {
            if (var4 == 0) {
                class219.field3996 = true;
                class105.method629(class170.field3044, var2, var7);
            } else if (var4 == 1) {
                class285.field5010.method799(103, 229);
                class228.field4155++;
                class285.field5010.method1245(class254.field4564, arg0 ^ 0xFFFFFFD4);
                class285.field5010.method1245(class148.field2733 + var2, 88);
                class285.field5010.method1272(arg0 + 3312, class141.field2466 + var7);
                class285.field5010.method1280(arg0 - 25, class58.field1113);
            }
        }
        if (var3 == 22) {
            class187 var48 = class259.field4648[var4];
            if (var48 != null) {
                class203.method1389((byte) -93, false, 0, 2, 1, var48.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var48.field4115[0], 0, 0);
                class167.field2982 = 0;
                class17.field290 = class31.field499;
                class83.field1502++;
                class51.field1009 = class67.field1279;
                class17.field301 = 2;
                class285.field5010.method799(103, 19);
                class285.field5010.method1244(var4, true);
            }
        }
        if (var3 == 33) {
            class43 var49 = class185.method1211(-115, var7, var2);
            if (var49 != null) {
                class7.method49(22461);
                method157(var2, var7, (byte) -29, class239.method1603(client.method1514(var49), true));
                class175.field3132 = 0;
                class55.field1067 = class13.method102(32767, var49);
                if (class55.field1067 == null) {
                    class55.field1067 = class248.field4468;
                }
                if (!var49.field786) {
                    class226.field4085 = class25.method179(0, new class143[] { class128.field2262, var49.field810, class68.field1293 });
                    return;
                }
                class226.field4085 = class25.method179(0, new class143[] { var49.field800, class68.field1293 });
            }
            return;
        }
        if (var3 == 10 && class256.method1693(var2, var7, var5, 1003726175)) {
            class170.field3045++;
            class285.field5010.method799(arg0 ^ 0xFFFFFFCE, 153);
            class285.field5010.method1280(-122, class58.field1113);
            class285.field5010.method1245(class148.field2733 + var2, 109);
            class285.field5010.method1244(class141.field2466 + var7, true);
            class285.field5010.method1245(class254.field4564, 104);
            class285.field5010.method1272(arg0 ^ 0xFFFFF330, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (class175.field3132 != 0) {
            class175.field3132 = 0;
            class141.method844((byte) 65, class27.method186(1341, class179.field3198));
        }
        if (class71.field1351) {
            class7.method49(22461);
        }
        if (class283.field4994 != null && class158.field2857 == 0) {
            class141.method844((byte) -122, class283.field4994);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lh;IZ)V")
    public void method83(class190 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field371 = 20;
        }
        field378++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IZ)V")
    public class23(int arg0, boolean arg1) {
        this.field376 = new class23[arg0];
        this.field373 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[[I")
    public int[][] method131(int arg0, int arg1) {
        if (arg1 == 1) {
            field375++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)I")
    public int method129(int arg0) {
        field370++;
        if (arg0 != 19275) {
            field381 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)I")
    public static final int method163(int arg0, int arg1, byte arg2) {
        field387++;
        class162 var3 = (class162) class143.field2518.method1824((long) arg0, 0);
        if (var3 == null) {
            return -1;
        } else if (arg2 > -119) {
            return -111;
        } else if (arg1 >= 0 && var3.field2916.length > arg1) {
            return var3.field2916[arg1];
        } else {
            return -1;
        }
    }
}
