import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class76 extends class77 {

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/lang/String;")
    private String field1101 = "null";

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1109 = "Loading...";

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lbo;")
    public static class16 field1107 = new class16();

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Z")
    public static boolean field1118 = false;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "C")
    public char field1100;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "C")
    public char field1106;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "Ls;")
    public class196 field1114;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Ls;")
    private class196 field1117;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 5)
    public static final void method616(int arg0) {
        class130.field1880++;
        field1113++;
        if (arg0 >= -35) {
            field1118 = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method617(int arg0, boolean arg1) {
        class276.field4187 = arg1;
        if (arg0 != 13) {
            method617(-85, true);
        }
        if (class276.field4187) {
            int var16 = class83.field1194.method1338((byte) -54);
            int var17 = class83.field1194.method1317((byte) 85);
            int var18 = class83.field1194.method1338((byte) -54);
            class83.field1194.method1913(-113);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    for (int var21 = 0; var21 < 13; var21++) {
                        int var22 = class83.field1194.method1911(1, arg0 ^ 0x41A6);
                        if (var22 == 1) {
                            class255.field3815[var19][var20][var21] = class83.field1194.method1911(26, 16811);
                        } else {
                            class255.field3815[var19][var20][var21] = -1;
                        }
                    }
                }
            }
            class83.field1194.method1917(arg0 ^ 0xFFFFFF8B);
            int var23 = (class358.field5481 - class83.field1194.field2776) / 16;
            class57.field830 = new int[var23][4];
            for (int var24 = 0; var24 < var23; var24++) {
                for (int var25 = 0; var25 < 4; var25++) {
                    class57.field830[var24][var25] = class83.field1194.method1344(15537);
                }
            }
            boolean var26 = class342.method2387(class83.field1194.method1320((byte) 66), arg0 ^ 0xFFFFFF95);
            int var27 = class83.field1194.method1319(255);
            int var28 = class83.field1194.method1317((byte) 110);
            class57.field842 = new int[var23];
            class178.field2560 = new byte[var23][];
            class85.field1201 = new int[var23];
            class98.field1390 = new int[var23];
            class12.field185 = new int[var23];
            class312.field4655 = new int[var23];
            class312.field4642 = null;
            class333.field5155 = new byte[var23][];
            class296.field4445 = (byte[][]) null;
            class219.field3275 = new byte[var23][];
            class208.field3041 = new byte[var23][];
            int var29 = 0;
            for (int var30 = 0; var30 < 4; var30++) {
                for (int var31 = 0; var31 < 13; var31++) {
                    for (int var32 = 0; var32 < 13; var32++) {
                        int var33 = class255.field3815[var30][var31][var32];
                        if (var33 != -1) {
                            int var34 = (var33 & 0xFFCE27) >> 14;
                            int var35 = var33 >> 3 & 0x7FF;
                            int var36 = (var34 / 8 << 8) + (var35 / 8);
                            for (int var37 = 0; var37 < var29; var37++) {
                                if (class85.field1201[var37] == var36) {
                                    var36 = -1;
                                    break;
                                }
                            }
                            if (var36 != -1) {
                                class85.field1201[var29] = var36;
                                int var38 = var36 & 0xFF;
                                int var39 = var36 >> 8 & 0xFF;
                                class312.field4655[var29] = class244.field3640.method2505("m" + var39 + "_" + var38, (byte) 90);
                                class12.field185[var29] = class244.field3640.method2505("l" + var39 + "_" + var38, (byte) 97);
                                class98.field1390[var29] = class244.field3640.method2505("um" + var39 + "_" + var38, (byte) -82);
                                class57.field842[var29] = class244.field3640.method2505("ul" + var39 + "_" + var38, (byte) -109);
                                var29++;
                            }
                        }
                    }
                }
            }
            class321.method2236(var17, false, var16, var26, var18, var27, var28, 70);
        } else {
            int var2 = class83.field1194.method1317((byte) 59);
            int var3 = class83.field1194.method1317((byte) 71);
            boolean var4 = class342.method2387(class83.field1194.method1320((byte) 51), -99);
            int var5 = class83.field1194.method1351(14794);
            int var6 = class83.field1194.method1362(arg0 + 242);
            int var7 = (class358.field5481 - class83.field1194.field2776) / 16;
            class57.field830 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var9 = 0; var9 < 4; var9++) {
                    class57.field830[var8][var9] = class83.field1194.method1359((byte) -126);
                }
            }
            int var10 = class83.field1194.method1350(0);
            class208.field3041 = new byte[var7][];
            class219.field3275 = new byte[var7][];
            class333.field5155 = new byte[var7][];
            class312.field4655 = new int[var7];
            class12.field185 = new int[var7];
            class178.field2560 = new byte[var7][];
            boolean var11 = false;
            class296.field4445 = (byte[][]) null;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && (var6 / 8) == 48) {
                var11 = true;
            }
            class57.field842 = new int[var7];
            class312.field4642 = null;
            class85.field1201 = new int[var7];
            class98.field1390 = new int[var7];
            int var12 = 0;
            if ((var2 / 8) == 48 && var6 / 8 == 148) {
                var11 = true;
            }
            for (int var13 = (var2 - 6) / 8; var13 <= (var2 + 6) / 8; var13++) {
                for (int var14 = (var6 - 6) / 8; var14 <= (var6 + 6) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class85.field1201[var12] = var15;
                        class312.field4655[var12] = -1;
                        class12.field185[var12] = -1;
                        class98.field1390[var12] = -1;
                        class57.field842[var12] = -1;
                    } else {
                        class85.field1201[var12] = var15;
                        class312.field4655[var12] = class244.field3640.method2505("m" + var13 + "_" + var14, (byte) 70);
                        class12.field185[var12] = class244.field3640.method2505("l" + var13 + "_" + var14, (byte) 85);
                        class98.field1390[var12] = class244.field3640.method2505("um" + var13 + "_" + var14, (byte) 77);
                        class57.field842[var12] = class244.field3640.method2505("ul" + var13 + "_" + var14, (byte) -80);
                    }
                    var12++;
                }
            }
            class321.method2236(var10, false, var2, var4, var3, var5, var6, -101);
        }
        field1112++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I", line = 271)
    public final int method618(int arg0, int arg1) {
        int var3 = 115 / ((7 - arg1) / 59);
        field1111++;
        if (this.field1114 == null) {
            return this.field1105;
        } else {
            class35 var4 = (class35) this.field1114.method1405((long) arg0, false);
            return var4 == null ? this.field1105 : var4.field515;
        }
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V", line = 289)
    private final void method619(int arg0) {
        field1102++;
        this.field1117 = new class196(this.field1114.method1413((byte) -125));
        for (class145 var2 = (class145) this.field1114.method1406(0); var2 != null; var2 = (class145) this.field1114.method1404(-56)) {
            class55 var3 = new class55(var2.field2092, (int) var2.field1656);
            this.field1117.method1400(class51.method430(var2.field2092, false), 116, var3);
        }
        if (arg0 >= -91) {
            this.method625(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 312)
    public final boolean method620(boolean arg0, String arg1) {
        field1104++;
        if (!arg0) {
            this.field1106 = (char) 65492;
        }
        if (this.field1114 == null) {
            return false;
        }
        if (this.field1117 == null) {
            this.method619(-104);
        }
        for (class55 var3 = (class55) this.field1117.method1405(class51.method430(arg1, false), false); var3 != null; var3 = (class55) this.field1117.method1407((byte) 85)) {
            if (var3.field805.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IZ)Z", line = 343)
    public final boolean method621(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1101 = (String) null;
        }
        field1120++;
        if (this.field1114 == null) {
            return false;
        }
        if (this.field1117 == null) {
            this.method625(true);
        }
        class35 var3 = (class35) this.field1117.method1405((long) arg0, false);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 369)
    public final String method622(byte arg0, int arg1) {
        field1110++;
        if (this.field1114 == null) {
            return this.field1101;
        } else if (arg0 >= -34) {
            return (String) null;
        } else {
            class145 var3 = (class145) this.field1114.method1405((long) arg1, false);
            return var3 == null ? this.field1101 : var3.field2092;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lsb;II)V", line = 389)
    private final void method623(class190 arg0, int arg1, int arg2) {
        field1108++;
        if (arg2 != 8) {
            field1116 = 43;
        }
        if (arg1 == 1) {
            this.field1100 = class7.method45((byte) -118, arg0.method1322(9813));
        } else if (arg1 == 2) {
            this.field1106 = class7.method45((byte) -73, arg0.method1322(9813));
        } else if (arg1 == 3) {
            this.field1101 = arg0.method1329((byte) 59);
        } else if (arg1 == 4) {
            this.field1105 = arg0.method1371(-4);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1317((byte) 117);
            this.field1114 = new class196(class344.method2409(var4, -24724));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1371(arg2 ^ 0xFFFFFFF4);
                class117 var7;
                if (arg1 == 5) {
                    var7 = new class145(arg0.method1329((byte) 59));
                } else {
                    var7 = new class35(arg0.method1371(-4));
                }
                this.field1114.method1400((long) var6, 123, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILsb;)V", line = 452)
    public final void method624(int arg0, class190 arg1) {
        field1103++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1319(255);
            if (var3 == 0) {
                return;
            }
            this.method623(arg1, var3, 8);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 476)
    private final void method625(boolean arg0) {
        this.field1117 = new class196(this.field1114.method1413((byte) -125));
        field1115++;
        for (class35 var2 = (class35) this.field1114.method1406(0); var2 != null; var2 = (class35) this.field1114.method1404(-109)) {
            class35 var3 = new class35((int) var2.field1656);
            this.field1117.method1400((long) var2.field515, 121, var3);
        }
        if (!arg0) {
            field1107 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V", line = 516)
    public static void method626(boolean arg0) {
        field1107 = null;
        field1109 = null;
        if (!arg0) {
            field1107 = (class16) null;
        }
    }
}
