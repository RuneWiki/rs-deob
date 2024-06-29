import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class139 extends class162 {

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "[I")
    public static int[] field2151 = new int[14];

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
    public static int[] field2155 = new int[14];

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[[I")
    public static int[][] field2147 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2158 = 2;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "C")
    private char field2159;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Lkk;")
    public static class254 field2149;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Ljava/lang/String;")
    public String field2148;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BILma;)V")
    private final void method924(byte arg0, int arg1, class202 arg2) {
        int var4 = 116 % ((-arg0 - 67) / 51);
        if (arg1 == 1) {
            this.field2159 = class6.method34(-113, arg2.method1457((byte) -33));
        } else if (arg1 == 2) {
            this.field2150 = arg2.method1440(20404);
        } else if (arg1 == 5) {
            this.field2148 = arg2.method1403(-127);
        }
        field2152++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static void method925(byte arg0) {
        field2147 = null;
        field2151 = null;
        if (arg0 != 71) {
            method930(-73, (class273) null, (class273) null);
        }
        field2155 = null;
        field2149 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Z")
    public final boolean method926(boolean arg0) {
        if (arg0) {
            field2153++;
            return this.field2159 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILfa;)V")
    public static final void method927(int arg0, class273 arg1) {
        class292.field4824 = arg1;
        if (arg0 != 27937) {
            field2146 = 115;
        }
        class137.field2124 = class292.field4824.method1890(true, 4);
        field2156++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
    public static final void method928() {
        class82.field1297 = 0;
        label191: for (int var0 = 0; var0 < class262.field4328; var0++) {
            class230 var1 = class75.field1179[var0];
            if (class25.field326 != null) {
                for (int var2 = 0; var2 < class25.field326.length; var2++) {
                    if (class25.field326[var2] != -1000000 && (var1.field3681 <= class25.field326[var2] || var1.field3669 <= class25.field326[var2]) && (var1.field3672 <= class178.field2764[var2] || var1.field3685 <= class178.field2764[var2]) && (var1.field3672 >= class284.field4748[var2] || var1.field3685 >= class284.field4748[var2]) && (var1.field3674 <= class271.field4442[var2] || var1.field3696 <= class271.field4442[var2]) && (var1.field3674 >= class106.field1587[var2] || var1.field3696 >= class106.field1587[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3666 == 1) {
                int var3 = var1.field3692 + class35.field448 - class111.field1690;
                if (var3 >= 0 && var3 <= class35.field448 + class35.field448) {
                    int var4 = var1.field3694 + class35.field448 - class100.field1512;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3673 + class35.field448 - class100.field1512;
                    if (var5 > class35.field448 + class35.field448) {
                        var5 = class35.field448 + class35.field448;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class2.field12[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class160.field2527 - var1.field3672;
                        if (var7 > 32) {
                            var1.field3683 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3683 = 2;
                            var7 = -var7;
                        }
                        var1.field3693 = (var1.field3674 - class60.field927 << 8) / var7;
                        var1.field3677 = (var1.field3696 - class60.field927 << 8) / var7;
                        var1.field3679 = (var1.field3681 - class60.field925 << 8) / var7;
                        var1.field3668 = (var1.field3669 - class60.field925 << 8) / var7;
                        class55.field741[class82.field1297++] = var1;
                    }
                }
            } else if (var1.field3666 == 2) {
                int var8 = var1.field3694 + class35.field448 - class100.field1512;
                if (var8 >= 0 && var8 <= class35.field448 + class35.field448) {
                    int var9 = var1.field3692 + class35.field448 - class111.field1690;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3682 + class35.field448 - class111.field1690;
                    if (var10 > class35.field448 + class35.field448) {
                        var10 = class35.field448 + class35.field448;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class2.field12[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class60.field927 - var1.field3674;
                        if (var12 > 32) {
                            var1.field3683 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3683 = 4;
                            var12 = -var12;
                        }
                        var1.field3671 = (var1.field3672 - class160.field2527 << 8) / var12;
                        var1.field3691 = (var1.field3685 - class160.field2527 << 8) / var12;
                        var1.field3679 = (var1.field3681 - class60.field925 << 8) / var12;
                        var1.field3668 = (var1.field3669 - class60.field925 << 8) / var12;
                        class55.field741[class82.field1297++] = var1;
                    }
                }
            } else if (var1.field3666 == 4) {
                int var13 = var1.field3681 - class60.field925;
                if (var13 > 128) {
                    int var14 = var1.field3694 + class35.field448 - class100.field1512;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3673 + class35.field448 - class100.field1512;
                    if (var15 > class35.field448 + class35.field448) {
                        var15 = class35.field448 + class35.field448;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3692 + class35.field448 - class111.field1690;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3682 + class35.field448 - class111.field1690;
                        if (var17 > class35.field448 + class35.field448) {
                            var17 = class35.field448 + class35.field448;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class2.field12[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3683 = 5;
                            var1.field3671 = (var1.field3672 - class160.field2527 << 8) / var13;
                            var1.field3691 = (var1.field3685 - class160.field2527 << 8) / var13;
                            var1.field3693 = (var1.field3674 - class60.field927 << 8) / var13;
                            var1.field3677 = (var1.field3696 - class60.field927 << 8) / var13;
                            class55.field741[class82.field1297++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)V")
    public static final void method929(boolean arg0) {
        class60.field923.method144(0);
        field2145++;
        if (!arg0) {
            method925((byte) 10);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILfa;Lfa;)V")
    public static final void method930(int arg0, class273 arg1, class273 arg2) {
        class223.field3554 = arg1;
        if (arg0 == 15) {
            class161.field2532 = arg2;
            field2157++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lma;B)V")
    public final void method931(class202 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 == 0) {
                if (arg1 > -25) {
                    field2158 = 8;
                }
                field2154++;
                return;
            }
            this.method924((byte) -120, var3, arg0);
        }
    }
}
