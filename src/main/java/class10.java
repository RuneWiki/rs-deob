import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class10 {

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public int field121 = 0;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public int field125 = 0;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public int field114 = 0;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "B")
    public byte field107 = 0;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public int field131 = 0;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "[S")
    public short[] field146;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "[S")
    public short[] field148;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
    public int[] field143;

    @OriginalMember(owner = "client!kp", name = "ab", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "[S")
    public short[] field135;

    @OriginalMember(owner = "client!kp", name = "X", descriptor = "[I")
    public int[] field152;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "[S")
    public short[] field110;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "[B")
    public byte[] field118;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "[B")
    public byte[] field109;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "[S")
    public short[] field139;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "[B")
    public byte[] field124;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "[B")
    public byte[] field123;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "[S")
    public short[] field147;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "[B")
    public byte[] field144;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "[B")
    public byte[] field140;

    @OriginalMember(owner = "client!kp", name = "V", descriptor = "[S")
    public short[] field150;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "[S")
    public short[] field145;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "[S")
    public short[] field141;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "[B")
    public byte[] field108;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "[S")
    public short[] field127;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "[B")
    public byte[] field119;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "[S")
    public short[] field103;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "[I")
    public int[] field132;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
    public int[] field105;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "[B")
    public byte[] field115;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "[B")
    public byte[] field122;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "[S")
    public short[] field136;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "[Lgp;")
    public class282[] field130;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "[Ltn;")
    public class118[] field113;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "[S")
    public short[] field117;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "Z")
    public static boolean field133 = false;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!kp", name = "W", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kp", name = "Y", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kp", name = "Z", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method69(int arg0, String arg1) {
        field134++;
        if (arg1 == null) {
            return;
        }
        if (!(class3.field25 < 100 || class18.field238) || class3.field25 >= 200) {
            class104.method499(class249.field3498.method205((byte) 103, class68.field849), (byte) -10);
            return;
        }
        String var2 = class360.method2193(arg0 - 121, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class3.field25; var3++) {
            String var7 = class360.method2193(-65, class150.field1823[var3]);
            if (var7 != null && var7.equals(var2)) {
                class104.method499(arg1 + class80.field954.method205((byte) 112, class68.field849), (byte) -10);
                return;
            }
            if (class373.field5335[var3] != null) {
                String var8 = class360.method2193(-118, class373.field5335[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class104.method499(arg1 + class80.field954.method205((byte) 102, class68.field849), (byte) -10);
                    return;
                }
            }
        }
        for (int var4 = arg0; var4 < class414.field5907; var4++) {
            String var5 = class360.method2193(-59, class293.field4361[var4]);
            if (var5 != null && var5.equals(var2)) {
                class104.method499(class64.field806.method205((byte) 117, class68.field849) + arg1 + class462.field6520.method205((byte) 112, class68.field849), (byte) -10);
                return;
            }
            if (class66.field824[var4] != null) {
                String var6 = class360.method2193(-66, class66.field824[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class104.method499(class64.field806.method205((byte) 119, class68.field849) + arg1 + class462.field6520.method205((byte) 100, class68.field849), (byte) -10);
                    return;
                }
            }
        }
        if (class360.method2193(-69, class19.field258.field2736).equals(var2)) {
            class104.method499(class229.field3181.method205((byte) 110, class68.field849), (byte) -10);
        } else {
            class422.field6085++;
            class244.method1332((byte) 125, class159.field1906);
            class230.field3185.method909(class183.method995((byte) 23, arg1), ~arg0);
            class230.field3185.method935(arg1, 43);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[[I")
    public final int[][] method70(int arg0) {
        field137++;
        if (arg0 != -2) {
            return null;
        }
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field131; var4++) {
            int var9 = this.field155[var4];
            if (var9 >= 0) {
                int var10002 = var2[var9]++;
                if (var9 > var3) {
                    var3 = var9;
                }
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field131; var7++) {
            int var8 = this.field155[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBIBSIISB)I")
    public final int method71(int arg0, byte arg1, int arg2, byte arg3, short arg4, int arg5, int arg6, short arg7, byte arg8) {
        field154++;
        this.field148[this.field125] = (short) arg2;
        this.field103[this.field125] = (short) arg5;
        int var10 = -110 % ((arg0 - 22) / 47);
        this.field146[this.field125] = (short) arg6;
        this.field115[this.field125] = arg8;
        this.field122[this.field125] = arg1;
        this.field135[this.field125] = arg7;
        this.field109[this.field125] = arg3;
        this.field110[this.field125] = arg4;
        return this.field125++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[B)V")
    private final void method72(int arg0, byte[] arg1) {
        field104++;
        class179 var3 = new class179(arg1);
        class179 var4 = new class179(arg1);
        class179 var5 = new class179(arg1);
        class179 var6 = new class179(arg1);
        class179 var7 = new class179(arg1);
        class179 var8 = new class179(arg1);
        class179 var9 = new class179(arg1);
        var3.field2206 = arg1.length - 23;
        this.field114 = var3.method916(21933);
        this.field125 = var3.method916(21933);
        this.field121 = var3.method895((byte) -98);
        int var10 = var3.method895((byte) -120);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        int var13 = var3.method895((byte) -104);
        int var14 = var3.method895((byte) -112);
        int var15 = var3.method895((byte) -105);
        int var16 = var3.method895((byte) -77);
        int var17 = var3.method895((byte) -72);
        int var18 = var3.method916(21933);
        int var19 = var3.method916(21933);
        int var20 = var3.method916(21933);
        int var21 = var3.method916(21933);
        int var22 = var3.method916(21933);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (this.field121 > 0) {
            this.field144 = new byte[this.field121];
            var3.field2206 = 0;
            for (int var26 = 0; var26 < this.field121; var26++) {
                byte var27 = this.field144[var26] = var3.method922(32429);
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 0) {
                    var23++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var28 = this.field121;
        int var30 = this.field114 + var28;
        int var31 = var30;
        if (var11) {
            var30 += this.field125;
        }
        int var33 = this.field125 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += this.field125;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += this.field125;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += this.field114;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += this.field125;
        }
        int var39 = var21 + var33;
        if (arg0 != 26164) {
            this.field108 = null;
        }
        int var40 = var39;
        if (var16 == 1) {
            var39 += this.field125 * 2;
        }
        int var42 = var22 + var39;
        int var44 = this.field125 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        if (var16 == 1) {
            this.field110 = new short[this.field125];
        }
        if (this.field121 > 0) {
            this.field127 = new short[this.field121];
            this.field139 = new short[this.field121];
            if (var25 > 0) {
                this.field124 = new byte[var25];
                this.field140 = new byte[var25];
            }
            if (var24 > 0) {
                this.field147 = new short[var24];
                this.field141 = new short[var24];
                this.field145 = new short[var24];
                this.field123 = new byte[var24];
                this.field119 = new byte[var24];
                this.field108 = new byte[var24];
            }
            this.field150 = new short[this.field121];
        }
        if (var14 == 1) {
            this.field109 = new byte[this.field125];
        }
        this.field148 = new short[this.field125];
        if (var11) {
            this.field115 = new byte[this.field125];
        }
        this.field143 = new int[this.field114];
        if (var15 == 1) {
            this.field152 = new int[this.field125];
        }
        this.field135 = new short[this.field125];
        if (var13 == 255) {
            this.field118 = new byte[this.field125];
        } else {
            this.field107 = (byte) var13;
        }
        var3.field2206 = var28;
        if (var16 == 1 && this.field121 > 0) {
            this.field122 = new byte[this.field125];
        }
        if (var17 == 1) {
            this.field155 = new int[this.field114];
        }
        this.field146 = new short[this.field125];
        this.field103 = new short[this.field125];
        this.field105 = new int[this.field114];
        this.field132 = new int[this.field114];
        var4.field2206 = var44;
        var5.field2206 = var46;
        var6.field2206 = var48;
        var7.field2206 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < this.field114; var67++) {
            int var87 = var3.method895((byte) -113);
            int var88 = 0;
            if ((var87 & 0x1) != 0) {
                var88 = var4.method931(arg0 - 26252);
            }
            int var89 = 0;
            if ((var87 & 0x2) != 0) {
                var89 = var5.method931(-68);
            }
            int var90 = 0;
            if ((var87 & 0x4) != 0) {
                var90 = var6.method931(-67);
            }
            this.field132[var67] = var64 + var88;
            this.field143[var67] = var65 + var89;
            this.field105[var67] = var66 + var90;
            var65 = this.field143[var67];
            var66 = this.field105[var67];
            var64 = this.field132[var67];
            if (var17 == 1) {
                this.field155[var67] = var7.method895((byte) -107);
            }
        }
        var3.field2206 = var42;
        var4.field2206 = var31;
        var5.field2206 = var34;
        var6.field2206 = var37;
        var7.field2206 = var35;
        var8.field2206 = var40;
        var9.field2206 = var39;
        for (int var68 = 0; var68 < this.field125; var68++) {
            this.field135[var68] = (short) var3.method916(21933);
            if (var11) {
                this.field115[var68] = var4.method922(32429);
            }
            if (var13 == 255) {
                this.field118[var68] = var5.method922(class293.method1843(arg0, 6297));
            }
            if (var14 == 1) {
                this.field109[var68] = var6.method922(32429);
            }
            if (var15 == 1) {
                this.field152[var68] = var7.method895((byte) -112);
            }
            if (var16 == 1) {
                this.field110[var68] = (short) (var8.method916(21933) - 1);
            }
            if (this.field122 != null) {
                if (this.field110[var68] == -1) {
                    this.field122[var68] = -1;
                } else {
                    this.field122[var68] = (byte) (var9.method895((byte) -96) - 1);
                }
            }
        }
        this.field131 = -1;
        var3.field2206 = var33;
        var4.field2206 = var30;
        short var69 = 0;
        short var70 = 0;
        short var71 = 0;
        short var72 = 0;
        for (int var73 = 0; var73 < this.field125; var73++) {
            int var83 = var4.method895((byte) -103);
            if (var83 == 1) {
                var69 = (short) (var3.method931(67) + var72);
                var70 = (short) (var69 + var3.method931(arg0 - 26043));
                var71 = (short) (var70 + var3.method931(arg0 ^ 0x6643));
                var72 = var71;
                this.field148[var73] = var69;
                this.field103[var73] = var70;
                this.field146[var73] = var71;
                if (var69 > this.field131) {
                    this.field131 = var69;
                }
                if (this.field131 < var70) {
                    this.field131 = var70;
                }
                if (this.field131 < var71) {
                    this.field131 = var71;
                }
            }
            if (var83 == 2) {
                var70 = var71;
                var71 = (short) (var3.method931(-72) + var72);
                var72 = var71;
                this.field148[var73] = var69;
                this.field103[var73] = var70;
                this.field146[var73] = var71;
                if (var71 > this.field131) {
                    this.field131 = var71;
                }
            }
            if (var83 == 3) {
                var69 = var71;
                var71 = (short) (var72 + var3.method931(40));
                var72 = var71;
                this.field148[var73] = var69;
                this.field103[var73] = var70;
                this.field146[var73] = var71;
                if (var71 > this.field131) {
                    this.field131 = var71;
                }
            }
            if (var83 == 4) {
                short var86 = var69;
                var69 = var70;
                var70 = var86;
                var71 = (short) (var72 + var3.method931(-97));
                var72 = var71;
                this.field148[var73] = var69;
                this.field103[var73] = var86;
                this.field146[var73] = var71;
                if (var71 > this.field131) {
                    this.field131 = var71;
                }
            }
        }
        var3.field2206 = var50;
        this.field131++;
        var4.field2206 = var52;
        var5.field2206 = var54;
        var6.field2206 = var56;
        var7.field2206 = var58;
        var8.field2206 = var60;
        for (int var74 = 0; var74 < this.field121; var74++) {
            int var82 = this.field144[var74] & 0xFF;
            if (var82 == 0) {
                this.field150[var74] = (short) var3.method916(21933);
                this.field139[var74] = (short) var3.method916(21933);
                this.field127[var74] = (short) var3.method916(21933);
            }
            if (var82 == 1) {
                this.field150[var74] = (short) var4.method916(21933);
                this.field139[var74] = (short) var4.method916(class293.method1843(arg0, 13209));
                this.field127[var74] = (short) var4.method916(21933);
                this.field141[var74] = (short) var5.method916(class293.method1843(arg0, 13209));
                this.field147[var74] = (short) var5.method916(21933);
                this.field145[var74] = (short) var5.method916(21933);
                this.field108[var74] = var6.method922(32429);
                this.field123[var74] = var7.method922(arg0 + 6265);
                this.field119[var74] = var8.method922(32429);
            }
            if (var82 == 2) {
                this.field150[var74] = (short) var4.method916(21933);
                this.field139[var74] = (short) var4.method916(21933);
                this.field127[var74] = (short) var4.method916(21933);
                this.field141[var74] = (short) var5.method916(21933);
                this.field147[var74] = (short) var5.method916(21933);
                this.field145[var74] = (short) var5.method916(21933);
                this.field108[var74] = var6.method922(class293.method1843(arg0, 6297));
                this.field123[var74] = var7.method922(32429);
                this.field119[var74] = var8.method922(32429);
                this.field124[var74] = var8.method922(32429);
                this.field140[var74] = var8.method922(32429);
            }
            if (var82 == 3) {
                this.field150[var74] = (short) var4.method916(arg0 - 4231);
                this.field139[var74] = (short) var4.method916(21933);
                this.field127[var74] = (short) var4.method916(21933);
                this.field141[var74] = (short) var5.method916(21933);
                this.field147[var74] = (short) var5.method916(21933);
                this.field145[var74] = (short) var5.method916(21933);
                this.field108[var74] = var6.method922(32429);
                this.field123[var74] = var7.method922(32429);
                this.field119[var74] = var8.method922(arg0 + 6265);
            }
        }
        if (!var12) {
            return;
        }
        var3.field2206 = var62;
        int var75 = var3.method895((byte) -114);
        if (var75 > 0) {
            this.field113 = new class118[var75];
            for (int var76 = 0; var76 < var75; var76++) {
                int var77 = var3.method916(arg0 - 4231);
                int var78 = var3.method916(21933);
                byte var79;
                if (var13 == 255) {
                    var79 = this.field118[var78];
                } else {
                    var79 = (byte) var13;
                }
                this.field113[var76] = new class118(var77, this.field148[var78], this.field103[var78], this.field146[var78], var79);
            }
        }
        int var80 = var3.method895((byte) -126);
        if (var80 <= 0) {
            return;
        }
        this.field130 = new class282[var80];
        for (int var81 = 0; var81 < var80; var81++) {
            this.field130[var81] = new class282(var3.method916(class293.method1843(arg0, 13209)), var3.method916(21933));
        }
        return;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
    public final int method73(int arg0, int arg1, int arg2, int arg3) {
        field142++;
        for (int var5 = arg0; var5 < this.field114; var5++) {
            if (this.field132[var5] == arg1 && this.field143[var5] == arg2 && this.field105[var5] == arg3) {
                return var5;
            }
        }
        this.field132[this.field114] = arg1;
        this.field143[this.field114] = arg2;
        this.field105[this.field114] = arg3;
        this.field131 = this.field114 + 1;
        return this.field114++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(SIS)V")
    public final void method74(short arg0, int arg1, short arg2) {
        field151++;
        int var4 = 107 / ((arg1 - 1) / 40);
        for (int var5 = 0; var5 < this.field125; var5++) {
            if (this.field135[var5] == arg0) {
                this.field135[var5] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIII)V")
    public final void method75(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < this.field114; var5++) {
            this.field132[var5] += arg2;
            this.field143[var5] += arg3;
            this.field105[var5] += arg1;
        }
        field120++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public static final void method76(boolean arg0) {
        if (class178.field2150 < 102) {
            class178.field2150 += 6;
        }
        if (class483.field6824 != 0) {
            class215.field2961 -= class483.field6824 * 5;
            if (class215.field2961 >= class71.field865) {
                class215.field2961 = class71.field865 - 1;
            }
            if (class215.field2961 < 0) {
                class215.field2961 = 0;
            }
            class483.field6824 = 0;
        }
        field126++;
        if (!arg0) {
            method69(98, (String) null);
        }
        for (int var1 = 0; var1 < class42.field506; var1++) {
            int var2 = class257.field3719[var1].method1921((byte) -77);
            char var3 = class257.field3719[var1].method1918(107);
            if (var2 == 84) {
                class464.method2730(-19326);
            } else if (class308.field4529.method1689((byte) -118, 82) && var2 == 66) {
                if (class46.field601 != null) {
                    String var4 = "";
                    for (int var5 = class36.field447.length - 1; var5 >= 0; var5--) {
                        if (class36.field447[var5] != null && class36.field447[var5].length() > 0) {
                            var4 = var4 + class36.field447[var5] + '\n';
                        }
                    }
                    class46.field601.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class308.field4529.method1689((byte) -118, 82) && var2 == 67) {
                if (class46.field601 != null) {
                    Transferable var6 = class46.field601.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class217.method1214((byte) 71, var7, '\n');
                                if (var8.length <= 1) {
                                    class249.field3503 = class249.field3503 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class249.field3503 = var8[var9];
                                        class464.method2730(-19326);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class87.field1065 > 0) {
                class249.field3503 = class249.field3503.substring(0, class87.field1065 - 1) + class249.field3503.substring(class87.field1065);
                class87.field1065--;
            } else if (var2 == 101 && class87.field1065 < class249.field3503.length()) {
                class249.field3503 = class249.field3503.substring(0, class87.field1065) + class249.field3503.substring(class87.field1065 + 1);
            } else if (var2 == 96 && class87.field1065 > 0) {
                class87.field1065--;
            } else if (var2 == 97 && class87.field1065 < class249.field3503.length()) {
                class87.field1065++;
            } else if (var2 == 102) {
                class87.field1065 = 0;
            } else if (var2 == 103) {
                class87.field1065 = class249.field3503.length();
            } else if (var2 == 104 && class36.field447.length > class140.field1690) {
                class140.field1690++;
                class424.method2536(-12);
                class87.field1065 = class249.field3503.length();
            } else if (var2 == 105 && class140.field1690 > 0) {
                class140.field1690--;
                class424.method2536(-127);
                class87.field1065 = class249.field3503.length();
            } else if (class168.method822(var3, 65) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class249.field3503 = class249.field3503.substring(0, class87.field1065) + class257.field3719[var1].method1918(126) + class249.field3503.substring(class87.field1065);
                class87.field1065++;
            }
        }
        class42.field506 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class438.field6287[var10]) {
                var10002 = class22.field304[var10]++;
                if (class22.field304[var10] > 102) {
                    class438.field6287[var10] = false;
                }
            } else {
                var10002 = class22.field304[var10]--;
                if (class22.field304[var10] < 0) {
                    class413.field5879[var10] = (int) (Math.random() * (double) class110.field1336);
                    class168.field1993[var10] = (int) (Math.random() * 350.0D);
                    class22.field304[var10] = 0;
                    class438.field6287[var10] = true;
                }
            }
        }
        class415.method2469((byte) 121);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)[[I")
    public final int[][] method77(int arg0) {
        field128++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field125; var4++) {
            int var9 = this.field152[var4];
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = arg0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field125; var7++) {
            int var8 = this.field152[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            int var5 = class16.field212[arg3];
            int var6 = class16.field214[arg3];
            for (int var7 = 0; var7 < this.field114; var7++) {
                int var8 = this.field143[var7] * var5 + this.field132[var7] * var6 >> 15;
                this.field143[var7] = this.field143[var7] * var6 - (this.field132[var7] * var5) >> 15;
                this.field132[var7] = var8;
            }
        }
        field111++;
        if (arg0 != 25101) {
            this.field127 = null;
        }
        if (arg1 != 0) {
            int var9 = class16.field212[arg1];
            int var10 = class16.field214[arg1];
            for (int var11 = 0; var11 < this.field114; var11++) {
                int var12 = this.field143[var11] * var10 - (this.field105[var11] * var9) >> 15;
                this.field105[var11] = this.field143[var11] * var9 + this.field105[var11] * var10 >> 15;
                this.field143[var11] = var12;
            }
        }
        if (arg2 == 0) {
            return;
        }
        int var13 = class16.field212[arg2];
        int var14 = class16.field214[arg2];
        for (int var15 = 0; var15 < this.field114; var15++) {
            int var16 = this.field132[var15] * var14 + this.field105[var15] * var13 >> 15;
            this.field105[var15] = this.field105[var15] * var14 - (this.field132[var15] * var13) >> 15;
            this.field132[var15] = var16;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method79(int arg0, int arg1) {
        if (arg0 <= 43) {
            method79(-109, -70);
        }
        field138++;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILkp;SI)I")
    private final int method80(int arg0, class10 arg1, short arg2, int arg3) {
        field112++;
        int var5 = arg1.field132[arg0];
        int var6 = arg1.field143[arg0];
        int var7 = arg1.field105[arg0];
        for (int var8 = 0; var8 < this.field114; var8++) {
            if (this.field132[var8] == var5 && this.field143[var8] == var6 && this.field105[var8] == var7) {
                this.field117[var8] = (short) class292.method1841(this.field117[var8], arg2);
                return var8;
            }
        }
        this.field132[this.field114] = var5;
        this.field143[this.field114] = var6;
        this.field105[this.field114] = var7;
        this.field117[this.field114] = arg2;
        this.field155[this.field114] = arg1.field155 == null ? -1 : arg1.field155[arg0];
        if (arg3 == 395) {
            return this.field114++;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(SSBBBSSZSS)B")
    public final byte method81(short arg0, short arg1, byte arg2, byte arg3, byte arg4, short arg5, short arg6, boolean arg7, short arg8, short arg9) {
        field116++;
        if (this.field121 >= 255) {
            throw new IllegalStateException();
        }
        this.field144[this.field121] = 3;
        this.field150[this.field121] = arg0;
        this.field139[this.field121] = arg9;
        this.field127[this.field121] = arg5;
        this.field141[this.field121] = arg6;
        if (!arg7) {
            this.method75(true, 30, -47, -1);
        }
        this.field147[this.field121] = arg8;
        this.field145[this.field121] = arg1;
        this.field108[this.field121] = arg3;
        this.field123[this.field121] = arg4;
        this.field119[this.field121] = arg2;
        return (byte) (this.field121++);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZSS)V")
    public final void method82(boolean arg0, short arg1, short arg2) {
        if (!arg0) {
            this.field109 = null;
        }
        field153++;
        if (this.field110 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field125; var4++) {
            if (this.field110[var4] == arg1) {
                this.field110[var4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I[B)V")
    private final void method83(int arg0, byte[] arg1) {
        field149++;
        boolean var3 = false;
        boolean var4 = false;
        class179 var5 = new class179(arg1);
        class179 var6 = new class179(arg1);
        class179 var7 = new class179(arg1);
        class179 var8 = new class179(arg1);
        class179 var9 = new class179(arg1);
        var5.field2206 = arg1.length - 18;
        this.field114 = var5.method916(21933);
        this.field125 = var5.method916(21933);
        this.field121 = var5.method895((byte) -105);
        int var10 = var5.method895((byte) -98);
        int var11 = var5.method895((byte) -81);
        int var12 = var5.method895((byte) -92);
        int var13 = var5.method895((byte) -92);
        int var14 = var5.method895((byte) -92);
        int var15 = var5.method916(21933);
        int var16 = var5.method916(21933);
        int var17 = var5.method916(21933);
        int var18 = var5.method916(21933);
        byte var19 = 0;
        int var21 = this.field114 + var19;
        int var23 = this.field125 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field125;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field125;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field125;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field114;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field125;
        }
        int var30 = var18 + var23;
        int var32 = this.field125 * 2 + var30;
        int var34 = this.field121 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        this.field103 = new short[this.field125];
        this.field143 = new int[this.field114];
        this.field148 = new short[this.field125];
        if (var13 == 1) {
            this.field152 = new int[this.field125];
        }
        this.field105 = new int[this.field114];
        var5.field2206 = var19;
        this.field135 = new short[this.field125];
        int var10000 = var17 + var38;
        if (var11 == 255) {
            this.field118 = new byte[this.field125];
        } else {
            this.field107 = (byte) var11;
        }
        this.field146 = new short[this.field125];
        if (var10 == 1) {
            this.field122 = new byte[this.field125];
            this.field115 = new byte[this.field125];
            this.field110 = new short[this.field125];
        }
        if (var14 == 1) {
            this.field155 = new int[this.field114];
        }
        if (this.field121 > 0) {
            this.field127 = new short[this.field121];
            this.field150 = new short[this.field121];
            this.field139 = new short[this.field121];
            this.field144 = new byte[this.field121];
        }
        this.field132 = new int[this.field114];
        if (var12 == 1) {
            this.field109 = new byte[this.field125];
        }
        var6.field2206 = var34;
        var7.field2206 = var36;
        var8.field2206 = var38;
        var9.field2206 = var27;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        for (int var44 = 0; var44 < this.field114; var44++) {
            int var60 = var5.method895((byte) -97);
            int var61 = 0;
            if ((var60 & 0x1) != 0) {
                var61 = var6.method931(-115);
            }
            int var62 = 0;
            if ((var60 & 0x2) != 0) {
                var62 = var7.method931(42);
            }
            int var63 = 0;
            if ((var60 & 0x4) != 0) {
                var63 = var8.method931(-75);
            }
            this.field132[var44] = var41 + var61;
            this.field143[var44] = var42 + var62;
            this.field105[var44] = var43 + var63;
            var42 = this.field143[var44];
            var43 = this.field105[var44];
            var41 = this.field132[var44];
            if (var14 == 1) {
                this.field155[var44] = var9.method895((byte) -126);
            }
        }
        var5.field2206 = var30;
        var6.field2206 = var26;
        var7.field2206 = var24;
        var8.field2206 = var28;
        var9.field2206 = var25;
        for (int var45 = 0; var45 < this.field125; var45++) {
            this.field135[var45] = (short) var5.method916(21933);
            if (var10 == 1) {
                int var59 = var6.method895((byte) -93);
                if ((var59 & 0x1) == 1) {
                    var3 = true;
                    this.field115[var45] = 1;
                } else {
                    this.field115[var45] = 0;
                }
                if ((var59 & 0x2) == 2) {
                    this.field122[var45] = (byte) (var59 >> 2);
                    this.field110[var45] = this.field135[var45];
                    this.field135[var45] = 127;
                    if (this.field110[var45] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field122[var45] = -1;
                    this.field110[var45] = -1;
                }
            }
            if (var11 == 255) {
                this.field118[var45] = var7.method922(class293.method1843(arg0, -14260));
            }
            if (var12 == 1) {
                this.field109[var45] = var8.method922(32429);
            }
            if (var13 == 1) {
                this.field152[var45] = var9.method895((byte) -102);
            }
        }
        var5.field2206 = var23;
        this.field131 = -1;
        var6.field2206 = var21;
        short var46 = 0;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        for (int var50 = 0; var50 < this.field125; var50++) {
            int var55 = var6.method895((byte) -89);
            if (var55 == 1) {
                var46 = (short) (var49 + var5.method931(arg0 ^ 0x4923));
                var47 = (short) (var5.method931(arg0 + 18648) + var46);
                var48 = (short) (var5.method931(105) + var47);
                var49 = var48;
                this.field148[var50] = var46;
                this.field103[var50] = var47;
                this.field146[var50] = var48;
                if (this.field131 < var46) {
                    this.field131 = var46;
                }
                if (var47 > this.field131) {
                    this.field131 = var47;
                }
                if (this.field131 < var48) {
                    this.field131 = var48;
                }
            }
            if (var55 == 2) {
                var47 = var48;
                var48 = (short) (var5.method931(-92) + var49);
                var49 = var48;
                this.field148[var50] = var46;
                this.field103[var50] = var47;
                this.field146[var50] = var48;
                if (this.field131 < var48) {
                    this.field131 = var48;
                }
            }
            if (var55 == 3) {
                var46 = var48;
                var48 = (short) (var49 + var5.method931(-86));
                this.field148[var50] = var46;
                var49 = var48;
                this.field103[var50] = var47;
                this.field146[var50] = var48;
                if (var48 > this.field131) {
                    this.field131 = var48;
                }
            }
            if (var55 == 4) {
                short var58 = var46;
                var46 = var47;
                var48 = (short) (var49 + var5.method931(124));
                var47 = var58;
                this.field148[var50] = var46;
                var49 = var48;
                this.field103[var50] = var58;
                this.field146[var50] = var48;
                if (var48 > this.field131) {
                    this.field131 = var48;
                }
            }
        }
        var5.field2206 = var32;
        this.field131++;
        if (arg0 != -18719) {
            this.method73(-15, 47, 54, 29);
        }
        for (int var51 = 0; var51 < this.field121; var51++) {
            this.field144[var51] = 0;
            this.field150[var51] = (short) var5.method916(21933);
            this.field139[var51] = (short) var5.method916(21933);
            this.field127[var51] = (short) var5.method916(21933);
        }
        if (this.field122 != null) {
            boolean var52 = false;
            for (int var53 = 0; var53 < this.field125; var53++) {
                int var54 = this.field122[var53] & 0xFF;
                if (var54 != 255) {
                    if ((this.field150[var54] & 0xFFFF) == this.field148[var53] && (this.field139[var54] & 0xFFFF) == this.field103[var53] && (this.field127[var54] & 0xFFFF) == this.field146[var53]) {
                        this.field122[var53] = -1;
                    } else {
                        var52 = true;
                    }
                }
            }
            if (!var52) {
                this.field122 = null;
            }
        }
        if (!var4) {
            this.field110 = null;
        }
        if (!var3) {
            this.field115 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "([B)V")
    public class10(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method72(26164, arg0);
        } else {
            this.method83(-18719, arg0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(III)V")
    public class10(int arg0, int arg1, int arg2) {
        this.field146 = new short[arg1];
        this.field148 = new short[arg1];
        this.field143 = new int[arg0];
        this.field155 = new int[arg0];
        this.field135 = new short[arg1];
        this.field152 = new int[arg1];
        this.field110 = new short[arg1];
        this.field118 = new byte[arg1];
        this.field109 = new byte[arg1];
        if (arg2 > 0) {
            this.field139 = new short[arg2];
            this.field124 = new byte[arg2];
            this.field123 = new byte[arg2];
            this.field147 = new short[arg2];
            this.field144 = new byte[arg2];
            this.field140 = new byte[arg2];
            this.field150 = new short[arg2];
            this.field145 = new short[arg2];
            this.field141 = new short[arg2];
            this.field108 = new byte[arg2];
            this.field127 = new short[arg2];
            this.field119 = new byte[arg2];
        }
        this.field103 = new short[arg1];
        this.field132 = new int[arg0];
        this.field105 = new int[arg0];
        this.field115 = new byte[arg1];
        this.field122 = new byte[arg1];
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "([Lkp;I)V")
    public class10(class10[] arg0, int arg1) {
        this.field125 = 0;
        this.field114 = 0;
        this.field121 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        this.field107 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class10 var31 = arg0[var11];
            if (var31 != null) {
                this.field125 += var31.field125;
                this.field114 += var31.field114;
                this.field121 += var31.field121;
                var5 |= var31.field115 != null;
                if (var31.field130 != null) {
                    var4 += var31.field130.length;
                }
                if (var31.field113 != null) {
                    var3 += var31.field113.length;
                }
                var9 |= var31.field110 != null;
                var7 |= var31.field109 != null;
                if (var31.field118 == null) {
                    if (this.field107 == -1) {
                        this.field107 = var31.field107;
                    }
                    if (this.field107 != var31.field107) {
                        var6 = true;
                    }
                } else {
                    var6 = true;
                }
                var8 |= var31.field122 != null;
                var10 |= var31.field152 != null;
            }
        }
        if (var7) {
            this.field109 = new byte[this.field125];
        }
        this.field136 = new short[this.field125];
        if (var5) {
            this.field115 = new byte[this.field125];
        }
        this.field143 = new int[this.field114];
        if (var9) {
            this.field110 = new short[this.field125];
        }
        if (var6) {
            this.field118 = new byte[this.field125];
        }
        this.field146 = new short[this.field125];
        this.field148 = new short[this.field125];
        this.field105 = new int[this.field114];
        this.field155 = new int[this.field114];
        if (var4 > 0) {
            this.field130 = new class282[var4];
        }
        this.field132 = new int[this.field114];
        this.field135 = new short[this.field125];
        if (var8) {
            this.field122 = new byte[this.field125];
        }
        if (var3 > 0) {
            this.field113 = new class118[var3];
        }
        this.field117 = new short[this.field114];
        if (var10) {
            this.field152 = new int[this.field125];
        }
        this.field103 = new short[this.field125];
        if (this.field121 > 0) {
            this.field108 = new byte[this.field121];
            this.field150 = new short[this.field121];
            this.field127 = new short[this.field121];
            this.field147 = new short[this.field121];
            this.field123 = new byte[this.field121];
            this.field141 = new short[this.field121];
            this.field124 = new byte[this.field121];
            this.field140 = new byte[this.field121];
            this.field119 = new byte[this.field121];
            this.field145 = new short[this.field121];
            this.field144 = new byte[this.field121];
            this.field139 = new short[this.field121];
        }
        int var12 = 0;
        int var13 = 0;
        this.field114 = 0;
        this.field125 = 0;
        this.field121 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class10 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field125; var24++) {
                    if (var5 && var23.field115 != null) {
                        this.field115[this.field125] = var23.field115[var24];
                    }
                    if (var6) {
                        if (var23.field118 == null) {
                            this.field118[this.field125] = var23.field107;
                        } else {
                            this.field118[this.field125] = var23.field118[var24];
                        }
                    }
                    if (var7 && var23.field109 != null) {
                        this.field109[this.field125] = var23.field109[var24];
                    }
                    if (var9) {
                        if (var23.field110 == null) {
                            this.field110[this.field125] = -1;
                        } else {
                            this.field110[this.field125] = var23.field110[var24];
                        }
                    }
                    if (var10) {
                        if (var23.field152 == null) {
                            this.field152[this.field125] = -1;
                        } else {
                            this.field152[this.field125] = var23.field152[var24];
                        }
                    }
                    this.field148[this.field125] = (short) this.method80(var23.field148[var24], var23, var22, 395);
                    this.field103[this.field125] = (short) this.method80(var23.field103[var24], var23, var22, 395);
                    this.field146[this.field125] = (short) this.method80(var23.field146[var24], var23, var22, 395);
                    this.field136[this.field125] = var22;
                    this.field135[this.field125] = var23.field135[var24];
                    this.field125++;
                }
                if (var23.field113 != null) {
                    for (int var25 = 0; var25 < var23.field113.length; var25++) {
                        int var26 = this.method80(var23.field113[var25].field1471, var23, var22, 395);
                        int var27 = this.method80(var23.field113[var25].field1459, var23, var22, 395);
                        int var28 = this.method80(var23.field113[var25].field1472, var23, var22, 395);
                        this.field113[var13] = new class118(var23.field113[var25].field1470, var26, var27, var28, var23.field113[var25].field1454);
                        var13++;
                    }
                }
                if (var23.field130 != null) {
                    for (int var29 = 0; var29 < var23.field130.length; var29++) {
                        int var30 = this.method80(var23.field130[var29].field4100, var23, var22, 395);
                        this.field130[var12] = new class282(var23.field130[var29].field4099, var30);
                        var12++;
                    }
                }
            }
        }
        int var15 = 0;
        this.field131 = this.field114;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var17 = (short) (0x1 << var16);
            class10 var18 = arg0[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < var18.field125; var19++) {
                    if (var8) {
                        this.field122[var15++] = (byte) (var18.field122 == null || var18.field122[var19] == -1 ? -1 : var18.field122[var19] + this.field121);
                    }
                }
                for (int var20 = 0; var20 < var18.field121; var20++) {
                    byte var21 = this.field144[this.field121] = var18.field144[var20];
                    if (var21 == 0) {
                        this.field150[this.field121] = (short) this.method80(var18.field150[var20], var18, var17, 395);
                        this.field139[this.field121] = (short) this.method80(var18.field139[var20], var18, var17, 395);
                        this.field127[this.field121] = (short) this.method80(var18.field127[var20], var18, var17, 395);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field150[this.field121] = var18.field150[var20];
                        this.field139[this.field121] = var18.field139[var20];
                        this.field127[this.field121] = var18.field127[var20];
                        this.field141[this.field121] = var18.field141[var20];
                        this.field147[this.field121] = var18.field147[var20];
                        this.field145[this.field121] = var18.field145[var20];
                        this.field108[this.field121] = var18.field108[var20];
                        this.field123[this.field121] = var18.field123[var20];
                        this.field119[this.field121] = var18.field119[var20];
                    }
                    if (var21 == 2) {
                        this.field124[this.field121] = var18.field124[var20];
                        this.field140[this.field121] = var18.field140[var20];
                    }
                    this.field121++;
                }
            }
        }
    }
}
