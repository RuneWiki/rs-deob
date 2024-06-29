import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field13 = -1;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field14 = -1;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field10 = -1;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public int field31 = 2;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
    public boolean field28 = false;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public int field33 = 5;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Z")
    private boolean field26 = false;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public int field37 = 99;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public int field40 = -1;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public int field39 = -1;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
    public static int[] field17 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field36 = -1;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lgb;")
    public static class213 field19;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lui;")
    public static class225 field22;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Loh;")
    public static class258 field18;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[I")
    private int[] field32;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
    private int[] field34;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
    public int[] field35;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
    public int[] field41;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[[I")
    public int[][] field12;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 4)
    public final void method7(int arg0) {
        field38++;
        if (this.field39 == -1) {
            if (this.field34 == null) {
                this.field39 = 0;
            } else {
                this.field39 = 2;
            }
        }
        int var2 = -6 % ((arg0 - 68) / 48);
        if (this.field40 != -1) {
            return;
        }
        if (this.field34 == null) {
            this.field40 = 0;
        } else {
            this.field40 = 2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLi;I)Li;", line = 36)
    public final class305 method8(byte arg0, class305 arg1, int arg2) {
        int var4 = this.field41[arg2];
        field16++;
        class255 var5 = class3.method22(117, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method648(true, true);
        } else if (arg0 == -37) {
            class305 var7 = arg1.method648(!var5.method1720(arg0 - 23908, var6), !this.field26);
            var7.method652(var5, var6, this.field26);
            return var7;
        } else {
            return (class305) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILva;B)V", line = 59)
    private final void method9(int arg0, class235 arg1, byte arg2) {
        if (arg0 == 1) {
            int var13 = arg1.method1615(122);
            this.field35 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field35[var14] = arg1.method1615(-128);
            }
            this.field41 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field41[var15] = arg1.method1615(-34);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field41[var16] = (arg1.method1615(-17) << 16) + this.field41[var16];
            }
        } else if (arg0 == 2) {
            this.field14 = arg1.method1615(118);
        } else if (arg0 == 3) {
            int var11 = arg1.method1589(65);
            this.field34 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field34[var12] = arg1.method1589(50);
            }
            this.field34[var11] = 9999999;
        } else if (arg0 == 4) {
            this.field28 = true;
        } else if (arg0 == 5) {
            this.field33 = arg1.method1589(86);
        } else if (arg0 == 6) {
            this.field13 = arg1.method1615(-123);
        } else if (arg0 == 7) {
            this.field10 = arg1.method1615(29);
        } else if (arg0 == 8) {
            this.field37 = arg1.method1589(121);
        } else if (arg0 == 9) {
            this.field39 = arg1.method1589(91);
        } else if (arg0 == 10) {
            this.field40 = arg1.method1589(101);
        } else if (arg0 == 11) {
            this.field31 = arg1.method1589(94);
        } else if (arg0 == 12) {
            int var4 = arg1.method1589(63);
            this.field32 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field32[var5] = arg1.method1615(-119);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field32[var6] += arg1.method1615(-47) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg1.method1615(-5);
            this.field12 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg1.method1589(78);
                if (var9 > 0) {
                    this.field12[var8] = new int[var9];
                    this.field12[var8][0] = arg1.method1602(18160);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field12[var8][var10] = arg1.method1615(-125);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field26 = true;
        }
        if (arg2 > -30) {
            field21 = -18;
        }
        field11++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILi;)Li;", line = 225)
    public final class305 method10(int arg0, int arg1, int arg2, class305 arg3) {
        int var5 = this.field41[arg1];
        field30++;
        class255 var6 = class3.method22(120, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method669(true, true);
        }
        class305 var8 = arg3.method669(!var6.method1720(-23945, var7), !this.field26);
        int var9 = arg2 & 0x3;
        if (arg0 != -3) {
            this.method8((byte) 105, (class305) null, -44);
        }
        if (var9 == 1) {
            var8.method653();
        } else if (var9 == 2) {
            var8.method654();
        } else if (var9 == 3) {
            var8.method645();
        }
        var8.method652(var6, var7, this.field26);
        if (var9 == 1) {
            var8.method645();
        } else if (var9 == 2) {
            var8.method654();
        } else if (var9 == 3) {
            var8.method653();
        }
        return var8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lva;B)V", line = 272)
    public final void method11(class235 arg0, byte arg1) {
        field25++;
        if (arg1 <= 7) {
            this.method16(28, -31, (class305) null);
        }
        while (true) {
            int var3 = arg0.method1589(120);
            if (var3 == 0) {
                return;
            }
            this.method9(var3, arg0, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 293)
    public static final void method12(boolean arg0) {
        if (arg0) {
            method18(108);
        }
        class122 var1 = class215.field3729;
        synchronized (class215.field3729) {
            class255.field4376 = class263.field4576;
            class164.field2769++;
            if (class7.field93 >= 0) {
                while (class7.field93 != class185.field3291) {
                    int var3 = class39.field557[class185.field3291];
                    class185.field3291 = class185.field3291 + 1 & 0x7F;
                    if (var3 < 0) {
                        client.field610[~var3] = false;
                    } else {
                        client.field610[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    client.field610[var2] = false;
                }
                class7.field93 = class185.field3291;
            }
            class263.field4576 = class231.field3980;
        }
        field20++;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 338)
    public static final void method13(boolean arg0) {
        field24++;
        class95.method695(5, (byte) -125);
        class206.method1362((byte) -87, 5);
        class317.method2182((byte) -106, 5);
        class297.method2097(26490, 5);
        class258.method1785(20676, 5);
        class107.method793(5, -27093);
        class61.method465(5, 2113);
        class237.method1627(5, -96);
        class306.method2136(5, (byte) 27);
        class63.method487(3, 5);
        class119.method875(63, 5);
        class57.method442(50, (byte) -125);
        class1.method2(5, -25622);
        class78.method560(5, -1);
        class290.field5001.method1156(5, 0);
        if (arg0) {
            field22 = (class225) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Li;IB)Li;", line = 367)
    public final class305 method14(class305 arg0, int arg1, byte arg2) {
        field27++;
        int var4 = this.field41[arg1];
        class255 var5 = class3.method22(115, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method669(true, true);
        }
        class255 var7 = null;
        int var8 = 0;
        if (this.field32 != null && arg1 < this.field32.length) {
            int var9 = this.field32[arg1];
            var7 = class3.method22(116, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class305 var11 = arg0.method669(!var5.method1720(-23945, var6), !this.field26);
            var11.method652(var5, var6, this.field26);
            return var11;
        }
        class305 var10 = arg0.method669(!var5.method1720(-23945, var6) & !var7.method1720(-23945, var8), !this.field26);
        var10.method652(var5, var6, this.field26);
        if (arg2 >= -32) {
            this.field12 = (int[][]) ((int[][]) null);
        }
        var10.method652(var7, var8, this.field26);
        return var10;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 418)
    public static int method15(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILi;)Li;", line = 447)
    public final class305 method16(int arg0, int arg1, class305 arg2) {
        field23++;
        int var4 = this.field41[arg1];
        class255 var5 = class3.method22(118, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method669(true, true);
        }
        if (arg0 != 13) {
            this.method9(45, (class235) null, (byte) 120);
        }
        class305 var7 = arg2.method669(!var5.method1720(-23945, var6), !this.field26);
        var7.method652(var5, var6, this.field26);
        return var7;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILpb;Li;II)Li;", line = 469)
    public final class305 method17(int arg0, class2 arg1, class305 arg2, int arg3, int arg4) {
        field15++;
        int var6 = this.field41[arg0];
        class255 var7 = class3.method22(120, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method16(13, arg3, arg2);
        }
        int var9 = arg1.field41[arg3];
        class255 var10 = class3.method22(117, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class305 var13 = arg2.method669(!var7.method1720(-23945, var8), !this.field26);
            var13.method652(var7, var8, this.field26);
            return var13;
        }
        class305 var12 = arg2.method669(!var7.method1720(-23945, var8) & !var10.method1720(-23945, var11), !this.field26 & !arg1.field26);
        var12.method670(var7, var8, var10, var11, this.field34, arg1.field26 | this.field26);
        if (arg4 > 0) {
            this.field35 = (int[]) null;
        }
        return var12;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 517)
    public static final void method18(int arg0) {
        field42++;
        class293.field5036.method888(8);
        int var1 = class293.field5036.method881(8, (byte) -126);
        if (arg0 != 2073) {
            method18(55);
        }
        if (class226.field3895 > var1) {
            for (int var2 = var1; var2 < class226.field3895; var2++) {
                class152.field2615[class307.field5217++] = class92.field1616[var2];
            }
        }
        if (class226.field3895 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class226.field3895 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class92.field1616[var3];
            class107 var5 = class16.field214[var4];
            int var6 = class293.field5036.method881(1, (byte) -115);
            if (var6 == 0) {
                class92.field1616[class226.field3895++] = var4;
                var5.field951 = class202.field3498;
            } else {
                int var7 = class293.field5036.method881(2, (byte) -101);
                if (var7 == 0) {
                    class92.field1616[class226.field3895++] = var4;
                    var5.field951 = class202.field3498;
                    class225.field3857[class311.field5289++] = var4;
                } else if (var7 == 1) {
                    class92.field1616[class226.field3895++] = var4;
                    var5.field951 = class202.field3498;
                    int var8 = class293.field5036.method881(3, (byte) -112);
                    var5.method450(var8, -12338, false);
                    int var9 = class293.field5036.method881(1, (byte) -127);
                    if (var9 == 1) {
                        class225.field3857[class311.field5289++] = var4;
                    }
                } else if (var7 == 2) {
                    class92.field1616[class226.field3895++] = var4;
                    var5.field951 = class202.field3498;
                    int var10 = class293.field5036.method881(3, (byte) -112);
                    var5.method450(var10, -12338, true);
                    int var11 = class293.field5036.method881(3, (byte) -128);
                    var5.method450(var11, arg0 ^ 0xFFFFC7D7, true);
                    int var12 = class293.field5036.method881(1, (byte) -106);
                    if (var12 == 1) {
                        class225.field3857[class311.field5289++] = var4;
                    }
                } else if (var7 == 3) {
                    class152.field2615[class307.field5217++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 629)
    public static void method19(int arg0) {
        field22 = null;
        field17 = null;
        field18 = null;
        if (arg0 != 0) {
            field21 = -57;
        }
        field19 = null;
    }
}
