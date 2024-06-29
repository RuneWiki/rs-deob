import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public int field71 = 0;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public int field80 = 0;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "B")
    public byte field58 = 0;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public int field82 = 0;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public int field96 = 0;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public int field101 = 12;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    public int[] field61;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[B")
    public byte[] field73;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[B")
    public byte[] field65;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
    public short[] field66;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
    public int[] field99;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "[I")
    public int[] field100;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[B")
    public byte[] field68;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[S")
    public short[] field90;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[B")
    public byte[] field60;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "[S")
    public short[] field89;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[S")
    public short[] field53;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
    public int[] field64;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "[S")
    public short[] field92;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "[I")
    public int[] field83;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "[B")
    public byte[] field86;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    public int[] field62;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[B")
    public byte[] field54;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    public int[] field56;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[S")
    public short[] field78;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "[I")
    public int[] field85;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
    public int[] field74;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "[S")
    public short[] field94;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[B")
    public byte[] field106;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
    public int[] field59;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[S")
    public short[] field75;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
    public int[] field57;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[S")
    public short[] field70;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "[Lgt;")
    public class482[] field95;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[S")
    public short[] field63;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "[Lqr;")
    public class72[] field79;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "[Loea;")
    public class624[] field105;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lbl;")
    public static class677 field69 = new class677();

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BB)V")
    private final void method25(byte[] arg0, byte arg1) {
        field102++;
        class93 var3 = new class93(arg0);
        class93 var4 = new class93(arg0);
        class93 var5 = new class93(arg0);
        class93 var6 = new class93(arg0);
        class93 var7 = new class93(arg0);
        class93 var8 = new class93(arg0);
        class93 var9 = new class93(arg0);
        var3.field1442 = arg0.length - 23;
        this.field96 = var3.method763(103);
        this.field82 = var3.method763(115);
        this.field71 = var3.method793((byte) 20);
        int var10 = var3.method793((byte) 46);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        boolean var13 = (var10 & 0x4) == 4;
        boolean var14 = (var10 & 0x8) == 8;
        if (var14) {
            var3.field1442 -= 7;
            this.field101 = var3.method793((byte) 46);
            var3.field1442 += 6;
        }
        int var15 = var3.method793((byte) 7);
        int var16 = var3.method793((byte) 18);
        int var17 = var3.method793((byte) 11);
        int var18 = var3.method793((byte) 6);
        int var19 = var3.method793((byte) 114);
        int var20 = var3.method763(-55);
        int var21 = var3.method763(-37);
        int var22 = var3.method763(102);
        int var23 = var3.method763(-100);
        int var24 = var3.method763(90);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (this.field71 > 0) {
            var3.field1442 = 0;
            this.field86 = new byte[this.field71];
            for (int var28 = 0; var28 < this.field71; var28++) {
                byte var29 = this.field86[var28] = var3.method766((byte) 122);
                if (var29 == 2) {
                    var27++;
                }
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
            }
        }
        int var30 = this.field71;
        int var32 = this.field96 + var30;
        int var33 = var32;
        if (var11) {
            var32 += this.field82;
        }
        int var35 = this.field82 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += this.field82;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += this.field82;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += this.field96;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += this.field82;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += this.field82 * 2;
        }
        int var44 = var24 + var41;
        int var46 = this.field82 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        byte var57 = 6;
        if (this.field101 == 14) {
            var57 = 7;
        } else if (this.field101 >= 15) {
            var57 = 9;
        }
        int var59 = var26 * var57 + var56;
        int var61 = var26 + var59;
        int var63 = var26 + var61;
        int var65 = var27 * 2 + var26 + var63;
        if (var18 == 1 && this.field71 > 0) {
            this.field68 = new byte[this.field82];
        }
        if (var17 == 1) {
            this.field99 = new int[this.field82];
        }
        var3.field1442 = var30;
        this.field89 = new short[this.field82];
        if (var18 == 1) {
            this.field66 = new short[this.field82];
        }
        this.field64 = new int[this.field96];
        if (var15 == 255) {
            this.field73 = new byte[this.field82];
        } else {
            this.field58 = (byte) var15;
        }
        this.field92 = new short[this.field82];
        if (var19 == 1) {
            this.field100 = new int[this.field96];
        }
        this.field53 = new short[this.field82];
        if (var11) {
            this.field65 = new byte[this.field82];
        }
        this.field90 = new short[this.field82];
        if (var16 == 1) {
            this.field60 = new byte[this.field82];
        }
        this.field83 = new int[this.field96];
        this.field61 = new int[this.field96];
        if (this.field71 > 0) {
            this.field78 = new short[this.field71];
            if (var26 > 0) {
                this.field85 = new int[var26];
                this.field59 = new int[var26];
                this.field54 = new byte[var26];
                this.field106 = new byte[var26];
                this.field74 = new int[var26];
                this.field57 = new int[var26];
            }
            if (var27 > 0) {
                this.field62 = new int[var27];
                this.field56 = new int[var27];
            }
            this.field94 = new short[this.field71];
            this.field75 = new short[this.field71];
        }
        var4.field1442 = var46;
        var5.field1442 = var48;
        var6.field1442 = var50;
        var7.field1442 = var38;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < this.field96; var70++) {
            int var99 = var3.method793((byte) 108);
            int var100 = 0;
            if ((var99 & 0x1) != 0) {
                var100 = var4.method742((byte) -13);
            }
            int var101 = 0;
            if ((var99 & 0x2) != 0) {
                var101 = var5.method742((byte) -13);
            }
            int var102 = 0;
            if ((var99 & 0x4) != 0) {
                var102 = var6.method742((byte) -13);
            }
            this.field64[var70] = var67 + var100;
            this.field83[var70] = var68 + var101;
            this.field61[var70] = var69 + var102;
            var68 = this.field83[var70];
            var67 = this.field64[var70];
            var69 = this.field61[var70];
            if (var19 == 1) {
                this.field100[var70] = var7.method793((byte) 89);
            }
        }
        var3.field1442 = var44;
        var4.field1442 = var33;
        var5.field1442 = var36;
        var6.field1442 = var39;
        var7.field1442 = var37;
        int var71 = 17 % ((19 - arg1) / 57);
        var8.field1442 = var42;
        var9.field1442 = var41;
        for (int var72 = 0; var72 < this.field82; var72++) {
            this.field90[var72] = (short) var3.method763(118);
            if (var11) {
                this.field65[var72] = var4.method766((byte) 122);
            }
            if (var15 == 255) {
                this.field73[var72] = var5.method766((byte) 122);
            }
            if (var16 == 1) {
                this.field60[var72] = var6.method766((byte) 122);
            }
            if (var17 == 1) {
                this.field99[var72] = var7.method793((byte) 15);
            }
            if (var18 == 1) {
                this.field66[var72] = (short) (var8.method763(92) - 1);
            }
            if (this.field68 != null) {
                if (this.field66[var72] == -1) {
                    this.field68[var72] = -1;
                } else {
                    this.field68[var72] = (byte) (var9.method793((byte) 53) - 1);
                }
            }
        }
        this.field80 = -1;
        var3.field1442 = var35;
        var4.field1442 = var32;
        short var73 = 0;
        short var74 = 0;
        short var75 = 0;
        short var76 = 0;
        for (int var77 = 0; var77 < this.field82; var77++) {
            int var95 = var4.method793((byte) 28);
            if (var95 == 1) {
                var73 = (short) (var3.method742((byte) -13) + var76);
                var74 = (short) (var3.method742((byte) -13) + var73);
                var75 = (short) (var3.method742((byte) -13) + var74);
                var76 = var75;
                this.field53[var77] = var73;
                this.field92[var77] = var74;
                this.field89[var77] = var75;
                if (var73 > this.field80) {
                    this.field80 = var73;
                }
                if (var74 > this.field80) {
                    this.field80 = var74;
                }
                if (var75 > this.field80) {
                    this.field80 = var75;
                }
            }
            if (var95 == 2) {
                var74 = var75;
                var75 = (short) (var3.method742((byte) -13) + var76);
                this.field53[var77] = var73;
                var76 = var75;
                this.field92[var77] = var74;
                this.field89[var77] = var75;
                if (var75 > this.field80) {
                    this.field80 = var75;
                }
            }
            if (var95 == 3) {
                var73 = var75;
                var75 = (short) (var76 + var3.method742((byte) -13));
                var76 = var75;
                this.field53[var77] = var73;
                this.field92[var77] = var74;
                this.field89[var77] = var75;
                if (this.field80 < var75) {
                    this.field80 = var75;
                }
            }
            if (var95 == 4) {
                short var98 = var73;
                var73 = var74;
                var75 = (short) (var76 + var3.method742((byte) -13));
                var74 = var98;
                var76 = var75;
                this.field53[var77] = var73;
                this.field92[var77] = var98;
                this.field89[var77] = var75;
                if (this.field80 < var75) {
                    this.field80 = var75;
                }
            }
        }
        this.field80++;
        var3.field1442 = var52;
        var4.field1442 = var54;
        var5.field1442 = var56;
        var6.field1442 = var59;
        var7.field1442 = var61;
        var8.field1442 = var63;
        for (int var78 = 0; var78 < this.field71; var78++) {
            int var94 = this.field86[var78] & 0xFF;
            if (var94 == 0) {
                this.field94[var78] = (short) var3.method763(-29);
                this.field78[var78] = (short) var3.method763(-70);
                this.field75[var78] = (short) var3.method763(89);
            }
            if (var94 == 1) {
                this.field94[var78] = (short) var4.method763(-30);
                this.field78[var78] = (short) var4.method763(86);
                this.field75[var78] = (short) var4.method763(-76);
                if (this.field101 < 15) {
                    this.field57[var78] = var5.method763(110);
                    if (this.field101 < 14) {
                        this.field74[var78] = var5.method763(108);
                    } else {
                        this.field74[var78] = var5.method767((byte) -124);
                    }
                    this.field85[var78] = var5.method763(103);
                } else {
                    this.field57[var78] = var5.method767((byte) -123);
                    this.field74[var78] = var5.method767((byte) -123);
                    this.field85[var78] = var5.method767((byte) -118);
                }
                this.field54[var78] = var6.method766((byte) 122);
                this.field106[var78] = var7.method766((byte) 122);
                this.field59[var78] = var8.method766((byte) 122);
            }
            if (var94 == 2) {
                this.field94[var78] = (short) var4.method763(0);
                this.field78[var78] = (short) var4.method763(-58);
                this.field75[var78] = (short) var4.method763(90);
                if (this.field101 < 15) {
                    this.field57[var78] = var5.method763(110);
                    if (this.field101 >= 14) {
                        this.field74[var78] = var5.method767((byte) -117);
                    } else {
                        this.field74[var78] = var5.method763(-37);
                    }
                    this.field85[var78] = var5.method763(115);
                } else {
                    this.field57[var78] = var5.method767((byte) -125);
                    this.field74[var78] = var5.method767((byte) -125);
                    this.field85[var78] = var5.method767((byte) -122);
                }
                this.field54[var78] = var6.method766((byte) 122);
                this.field106[var78] = var7.method766((byte) 122);
                this.field59[var78] = var8.method766((byte) 122);
                this.field62[var78] = var8.method766((byte) 122);
                this.field56[var78] = var8.method766((byte) 122);
            }
            if (var94 == 3) {
                this.field94[var78] = (short) var4.method763(-57);
                this.field78[var78] = (short) var4.method763(-20);
                this.field75[var78] = (short) var4.method763(-94);
                if (this.field101 >= 15) {
                    this.field57[var78] = var5.method767((byte) -123);
                    this.field74[var78] = var5.method767((byte) -123);
                    this.field85[var78] = var5.method767((byte) -119);
                } else {
                    this.field57[var78] = var5.method763(-46);
                    if (this.field101 >= 14) {
                        this.field74[var78] = var5.method767((byte) -123);
                    } else {
                        this.field74[var78] = var5.method763(126);
                    }
                    this.field85[var78] = var5.method763(86);
                }
                this.field54[var78] = var6.method766((byte) 122);
                this.field106[var78] = var7.method766((byte) 122);
                this.field59[var78] = var8.method766((byte) 122);
            }
        }
        var3.field1442 = var65;
        if (var12) {
            int var79 = var3.method793((byte) 104);
            if (var79 > 0) {
                this.field105 = new class624[var79];
                for (int var80 = 0; var80 < var79; var80++) {
                    int var81 = var3.method763(-12);
                    int var82 = var3.method763(-39);
                    byte var83;
                    if (var15 == 255) {
                        var83 = this.field73[var82];
                    } else {
                        var83 = (byte) var15;
                    }
                    this.field105[var80] = new class624(var81, this.field53[var82], this.field92[var82], this.field89[var82], var83);
                }
            }
            int var84 = var3.method793((byte) 23);
            if (var84 > 0) {
                this.field79 = new class72[var84];
                for (int var85 = 0; var85 < var84; var85++) {
                    int var86 = var3.method763(84);
                    int var87 = var3.method763(-84);
                    this.field79[var85] = new class72(var86, var87);
                }
            }
        }
        if (!var13) {
            return;
        }
        int var88 = var3.method793((byte) 81);
        if (var88 <= 0) {
            return;
        }
        this.field95 = new class482[var88];
        for (int var89 = 0; var89 < var88; var89++) {
            int var90 = var3.method763(105);
            int var91 = var3.method763(-34);
            int var92 = var3.method793((byte) 33);
            byte var93 = var3.method766((byte) 122);
            this.field95[var89] = new class482(var90, var91, var92, var93);
        }
        return;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ISS)V")
    public final void method26(int arg0, short arg1, short arg2) {
        field97++;
        if (this.field66 == null) {
            return;
        }
        for (int var4 = arg0; var4 < this.field82; var4++) {
            if (this.field66[var4] == arg2) {
                this.field66[var4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)[[I")
    public final int[][] method27(byte arg0) {
        if (arg0 < 40) {
            this.field62 = null;
        }
        field84++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field95.length; var4++) {
            int var9 = this.field95[var4].field6508;
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
        for (int var7 = 0; var7 < this.field95.length; var7++) {
            int var8 = this.field95[var7].field6508;
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BBBSSSSBSS)B")
    public final byte method28(byte arg0, byte arg1, byte arg2, short arg3, short arg4, short arg5, short arg6, byte arg7, short arg8, short arg9) {
        field93++;
        if (this.field71 >= 255) {
            throw new IllegalStateException();
        }
        this.field86[this.field71] = 3;
        this.field94[this.field71] = arg8;
        this.field78[this.field71] = arg5;
        int var11 = -57 % ((arg0 + 68) / 47);
        this.field75[this.field71] = arg3;
        this.field57[this.field71] = arg6;
        this.field74[this.field71] = arg4;
        this.field85[this.field71] = arg9;
        this.field54[this.field71] = arg2;
        this.field106[this.field71] = arg1;
        this.field59[this.field71] = arg7;
        return (byte) (this.field71++);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method29(boolean arg0) {
        if (arg0) {
            class325.field4448 = class1.field1;
            class745.field10286 = class178.field2805;
        } else {
            class325.field4448 = class224.field3279;
            class745.field10286 = class142.field2418;
        }
        class62.field856 = class325.field4448.length;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BSS)V")
    public final void method30(byte arg0, short arg1, short arg2) {
        field87++;
        int var4 = 38 % ((-arg0 - 45) / 61);
        for (int var5 = 0; var5 < this.field82; var5++) {
            if (this.field90[var5] == arg2) {
                this.field90[var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "([BB)V")
    private final void method31(byte[] arg0, byte arg1) {
        field98++;
        boolean var3 = false;
        boolean var4 = false;
        class93 var5 = new class93(arg0);
        class93 var6 = new class93(arg0);
        class93 var7 = new class93(arg0);
        class93 var8 = new class93(arg0);
        class93 var9 = new class93(arg0);
        var5.field1442 = arg0.length - 18;
        this.field96 = var5.method763(81);
        this.field82 = var5.method763(110);
        this.field71 = var5.method793((byte) 61);
        int var10 = var5.method793((byte) 28);
        int var11 = var5.method793((byte) 57);
        int var12 = var5.method793((byte) 10);
        int var13 = var5.method793((byte) 78);
        int var14 = var5.method793((byte) 12);
        int var15 = var5.method763(115);
        int var16 = var5.method763(93);
        int var17 = var5.method763(-117);
        int var18 = var5.method763(-87);
        byte var19 = 0;
        int var21 = this.field96 + var19;
        int var23 = this.field82 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field82;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field82;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field82;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field96;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field82;
        }
        int var30 = var18 + var23;
        int var32 = this.field82 * 2 + var30;
        int var34 = this.field71 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        if (arg1 > -41) {
            this.method26(-86, (short) -23, (short) 123);
        }
        if (var12 == 1) {
            this.field60 = new byte[this.field82];
        }
        if (var14 == 1) {
            this.field100 = new int[this.field96];
        }
        this.field89 = new short[this.field82];
        this.field53 = new short[this.field82];
        if (this.field71 > 0) {
            this.field75 = new short[this.field71];
            this.field78 = new short[this.field71];
            this.field86 = new byte[this.field71];
            this.field94 = new short[this.field71];
        }
        this.field83 = new int[this.field96];
        this.field61 = new int[this.field96];
        this.field92 = new short[this.field82];
        var5.field1442 = var19;
        this.field90 = new short[this.field82];
        if (var11 == 255) {
            this.field73 = new byte[this.field82];
        } else {
            this.field58 = (byte) var11;
        }
        this.field64 = new int[this.field96];
        int var10000 = var17 + var38;
        if (var13 == 1) {
            this.field99 = new int[this.field82];
        }
        if (var10 == 1) {
            this.field66 = new short[this.field82];
            this.field68 = new byte[this.field82];
            this.field65 = new byte[this.field82];
        }
        var6.field1442 = var34;
        var7.field1442 = var36;
        var8.field1442 = var38;
        var9.field1442 = var27;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        for (int var44 = 0; var44 < this.field96; var44++) {
            int var60 = var5.method793((byte) 76);
            int var61 = 0;
            if ((var60 & 0x1) != 0) {
                var61 = var6.method742((byte) -13);
            }
            int var62 = 0;
            if ((var60 & 0x2) != 0) {
                var62 = var7.method742((byte) -13);
            }
            int var63 = 0;
            if ((var60 & 0x4) != 0) {
                var63 = var8.method742((byte) -13);
            }
            this.field64[var44] = var41 + var61;
            this.field83[var44] = var42 + var62;
            this.field61[var44] = var43 + var63;
            var41 = this.field64[var44];
            var42 = this.field83[var44];
            var43 = this.field61[var44];
            if (var14 == 1) {
                this.field100[var44] = var9.method793((byte) 18);
            }
        }
        var5.field1442 = var30;
        var6.field1442 = var26;
        var7.field1442 = var24;
        var8.field1442 = var28;
        var9.field1442 = var25;
        for (int var45 = 0; var45 < this.field82; var45++) {
            this.field90[var45] = (short) var5.method763(108);
            if (var10 == 1) {
                int var59 = var6.method793((byte) 79);
                if ((var59 & 0x1) == 1) {
                    this.field65[var45] = 1;
                    var3 = true;
                } else {
                    this.field65[var45] = 0;
                }
                if ((var59 & 0x2) == 2) {
                    this.field68[var45] = (byte) (var59 >> 2);
                    this.field66[var45] = this.field90[var45];
                    this.field90[var45] = 127;
                    if (this.field66[var45] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field68[var45] = -1;
                    this.field66[var45] = -1;
                }
            }
            if (var11 == 255) {
                this.field73[var45] = var7.method766((byte) 122);
            }
            if (var12 == 1) {
                this.field60[var45] = var8.method766((byte) 122);
            }
            if (var13 == 1) {
                this.field99[var45] = var9.method793((byte) 100);
            }
        }
        var5.field1442 = var23;
        this.field80 = -1;
        var6.field1442 = var21;
        short var46 = 0;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        for (int var50 = 0; var50 < this.field82; var50++) {
            int var55 = var6.method793((byte) 18);
            if (var55 == 1) {
                var46 = (short) (var5.method742((byte) -13) + var49);
                var47 = (short) (var5.method742((byte) -13) + var46);
                var48 = (short) (var47 + var5.method742((byte) -13));
                this.field53[var50] = var46;
                var49 = var48;
                this.field92[var50] = var47;
                this.field89[var50] = var48;
                if (var46 > this.field80) {
                    this.field80 = var46;
                }
                if (var47 > this.field80) {
                    this.field80 = var47;
                }
                if (this.field80 < var48) {
                    this.field80 = var48;
                }
            }
            if (var55 == 2) {
                var47 = var48;
                var48 = (short) (var49 + var5.method742((byte) -13));
                this.field53[var50] = var46;
                var49 = var48;
                this.field92[var50] = var47;
                this.field89[var50] = var48;
                if (this.field80 < var48) {
                    this.field80 = var48;
                }
            }
            if (var55 == 3) {
                var46 = var48;
                var48 = (short) (var49 + var5.method742((byte) -13));
                var49 = var48;
                this.field53[var50] = var46;
                this.field92[var50] = var47;
                this.field89[var50] = var48;
                if (this.field80 < var48) {
                    this.field80 = var48;
                }
            }
            if (var55 == 4) {
                short var58 = var46;
                var46 = var47;
                var48 = (short) (var5.method742((byte) -13) + var49);
                var47 = var58;
                var49 = var48;
                this.field53[var50] = var46;
                this.field92[var50] = var58;
                this.field89[var50] = var48;
                if (var48 > this.field80) {
                    this.field80 = var48;
                }
            }
        }
        var5.field1442 = var32;
        this.field80++;
        for (int var51 = 0; var51 < this.field71; var51++) {
            this.field86[var51] = 0;
            this.field94[var51] = (short) var5.method763(-93);
            this.field78[var51] = (short) var5.method763(97);
            this.field75[var51] = (short) var5.method763(125);
        }
        if (this.field68 != null) {
            boolean var52 = false;
            for (int var53 = 0; var53 < this.field82; var53++) {
                int var54 = this.field68[var53] & 0xFF;
                if (var54 != 255) {
                    if ((this.field94[var54] & 0xFFFF) == this.field53[var53] && (this.field78[var54] & 0xFFFF) == this.field92[var53] && (this.field75[var54] & 0xFFFF) == this.field89[var53]) {
                        this.field68[var53] = -1;
                    } else {
                        var52 = true;
                    }
                }
            }
            if (!var52) {
                this.field68 = null;
            }
        }
        if (!var4) {
            this.field66 = null;
        }
        if (!var3) {
            this.field65 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method32(boolean arg0, int arg1) {
        field67++;
        if (arg1 != 16502) {
            this.field63 = null;
        }
        int[] var3 = new int[256];
        int var4 = 0;
        int var5 = arg0 ? this.field96 : this.field80;
        for (int var6 = 0; var6 < var5; var6++) {
            int var11 = this.field100[var6];
            if (var11 >= 0) {
                if (var11 > var4) {
                    var4 = var11;
                }
                int var10002 = var3[var11]++;
            }
        }
        int[][] var7 = new int[var4 + 1][];
        for (int var8 = 0; var8 <= var4; var8++) {
            var7[var8] = new int[var3[var8]];
            var3[var8] = 0;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field100[var9];
            if (var10 >= 0) {
                var7[var10][var3[var10]++] = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method33(Throwable arg0, byte arg1) throws IOException {
        field55++;
        String var3;
        if (arg0 instanceof class505) {
            class505 var2 = (class505) arg0;
            arg0 = var2.field6886;
            var3 = var2.field6885 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 42) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILdc;IS)I")
    private final int method34(int arg0, class5 arg1, int arg2, short arg3) {
        field88++;
        int var5 = arg1.field64[arg0];
        int var6 = arg1.field83[arg0];
        int var7 = arg1.field61[arg0];
        if (arg2 != -1) {
            this.method41(31);
        }
        for (int var8 = 0; var8 < this.field96; var8++) {
            if (this.field64[var8] == var5 && this.field83[var8] == var6 && this.field61[var8] == var7) {
                this.field70[var8] = (short) class530.method3011(this.field70[var8], arg3);
                return var8;
            }
        }
        this.field64[this.field96] = var5;
        this.field83[this.field96] = var6;
        this.field61[this.field96] = var7;
        this.field70[this.field96] = arg3;
        this.field100[this.field96] = arg1.field100 == null ? -1 : arg1.field100[arg0];
        return this.field96++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
    public final void method35(byte arg0, int arg1) {
        if (arg0 > -106) {
            this.field53 = null;
        }
        for (int var3 = 0; var3 < this.field96; var3++) {
            this.field64[var3] <<= arg1;
            this.field83[var3] <<= arg1;
            this.field61[var3] <<= arg1;
        }
        field104++;
        if (this.field71 <= 0 || this.field57 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field57.length; var4++) {
            this.field57[var4] <<= arg1;
            this.field74[var4] <<= arg1;
            if (this.field86[var4] != 1) {
                this.field85[var4] <<= arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
    public final int method36(int arg0, int arg1, int arg2, int arg3) {
        field76++;
        for (int var5 = 0; var5 < this.field96; var5++) {
            if (this.field64[var5] == arg0 && this.field83[var5] == arg1 && this.field61[var5] == arg3) {
                return var5;
            }
        }
        this.field64[this.field96] = arg0;
        this.field83[this.field96] = arg1;
        this.field61[this.field96] = arg3;
        this.field80 = this.field96 + 1;
        if (arg2 <= 99) {
            this.method35((byte) 58, 99);
        }
        return this.field96++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BBISBISII)I")
    public final int method37(byte arg0, byte arg1, int arg2, short arg3, byte arg4, int arg5, short arg6, int arg7, int arg8) {
        field91++;
        this.field53[this.field82] = (short) arg8;
        this.field92[this.field82] = (short) arg7;
        this.field89[this.field82] = (short) arg5;
        this.field65[this.field82] = arg1;
        this.field68[this.field82] = arg0;
        this.field90[this.field82] = arg6;
        this.field60[this.field82] = arg4;
        this.field66[this.field82] = arg3;
        if (arg2 >= -125) {
            this.field86 = null;
        }
        return this.field82++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZI)V")
    public final void method38(int arg0, int arg1, boolean arg2, int arg3) {
        field81++;
        int var5 = 0;
        if (arg2) {
            this.field58 = 108;
        }
        while (this.field96 > var5) {
            this.field64[var5] += arg3;
            this.field83[var5] += arg0;
            this.field61[var5] += arg1;
            var5++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lgka;Z)Z")
    public static final boolean method39(class393 arg0, boolean arg1) {
        field77++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field5390) {
            return false;
        } else if (arg1) {
            return true;
        } else if (!arg0.method2382(2260, class64.field881)) {
            return false;
        } else if (class290.field4000.method337((long) arg0.field5418, 1) == null) {
            return class307.field4201.method337((long) arg0.field5430, 1) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method40(int arg0) {
        if (arg0 != 0) {
            field69 = null;
        }
        field69 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)[[I")
    public final int[][] method41(int arg0) {
        field72++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field82; var4++) {
            int var9 = this.field99[var4];
            if (var9 >= 0) {
                int var10002 = var2[var9]++;
                if (var3 < var9) {
                    var3 = var9;
                }
            }
        }
        int[][] var5 = new int[var3 + 1][];
        int var6 = 0;
        if (arg0 < 12) {
            return null;
        }
        while (var6 <= var3) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
            var6++;
        }
        for (int var7 = 0; var7 < this.field82; var7++) {
            int var8 = this.field99[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIII)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3) {
        field103++;
        if (arg0 != 0) {
            int var5 = class191.field2937[arg0];
            int var6 = class191.field2936[arg0];
            for (int var7 = 0; var7 < this.field96; var7++) {
                int var8 = this.field83[var7] * var5 + (this.field64[var7] * var6) >> 14;
                this.field83[var7] = this.field83[var7] * var6 - this.field64[var7] * var5 >> 14;
                this.field64[var7] = var8;
            }
        }
        if (arg3 != 0) {
            int var9 = class191.field2937[arg3];
            int var10 = class191.field2936[arg3];
            for (int var11 = 0; var11 < this.field96; var11++) {
                int var12 = this.field83[var11] * var10 - this.field61[var11] * var9 >> 14;
                this.field61[var11] = this.field83[var11] * var9 + (this.field61[var11] * var10) >> 14;
                this.field83[var11] = var12;
            }
        }
        int var13 = 7 % ((arg2 + 33) / 44);
        if (arg1 == 0) {
            return;
        }
        int var14 = class191.field2937[arg1];
        int var15 = class191.field2936[arg1];
        for (int var16 = 0; var16 < this.field96; var16++) {
            int var17 = this.field64[var16] * var15 + this.field61[var16] * var14 >> 14;
            this.field61[var16] = this.field61[var16] * var15 - (this.field64[var16] * var14) >> 14;
            this.field64[var16] = var17;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class5() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
    public class5(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method25(arg0, (byte) -41);
        } else {
            this.method31(arg0, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    public class5(int arg0, int arg1, int arg2) {
        this.field61 = new int[arg0];
        this.field73 = new byte[arg1];
        this.field65 = new byte[arg1];
        this.field66 = new short[arg1];
        this.field99 = new int[arg1];
        this.field100 = new int[arg0];
        this.field68 = new byte[arg1];
        this.field90 = new short[arg1];
        this.field60 = new byte[arg1];
        this.field89 = new short[arg1];
        this.field53 = new short[arg1];
        this.field64 = new int[arg0];
        this.field92 = new short[arg1];
        this.field83 = new int[arg0];
        if (arg2 > 0) {
            this.field86 = new byte[arg2];
            this.field62 = new int[arg2];
            this.field54 = new byte[arg2];
            this.field56 = new int[arg2];
            this.field78 = new short[arg2];
            this.field85 = new int[arg2];
            this.field74 = new int[arg2];
            this.field94 = new short[arg2];
            this.field106 = new byte[arg2];
            this.field59 = new int[arg2];
            this.field75 = new short[arg2];
            this.field57 = new int[arg2];
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([Ldc;I)V")
    public class5(class5[] arg0, int arg1) {
        this.field71 = 0;
        this.field96 = 0;
        this.field82 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        this.field58 = -1;
        boolean var11 = false;
        for (int var12 = 0; var12 < arg1; var12++) {
            class5 var35 = arg0[var12];
            if (var35 != null) {
                this.field82 += var35.field82;
                this.field71 += var35.field71;
                this.field96 += var35.field96;
                var6 |= var35.field65 != null;
                if (var35.field95 != null) {
                    var5 += var35.field95.length;
                }
                if (var35.field105 != null) {
                    var3 += var35.field105.length;
                }
                if (var35.field79 != null) {
                    var4 += var35.field79.length;
                }
                var8 |= var35.field60 != null;
                if (var35.field73 == null) {
                    if (this.field58 == -1) {
                        this.field58 = var35.field58;
                    }
                    if (this.field58 != var35.field58) {
                        var7 = true;
                    }
                } else {
                    var7 = true;
                }
                var9 |= var35.field68 != null;
                var10 |= var35.field66 != null;
                var11 |= var35.field99 != null;
            }
        }
        if (var6) {
            this.field65 = new byte[this.field82];
        }
        this.field90 = new short[this.field82];
        if (var8) {
            this.field60 = new byte[this.field82];
        }
        this.field70 = new short[this.field96];
        this.field100 = new int[this.field96];
        this.field61 = new int[this.field96];
        if (var5 > 0) {
            this.field95 = new class482[var5];
        }
        this.field63 = new short[this.field82];
        if (this.field71 > 0) {
            this.field85 = new int[this.field71];
            this.field74 = new int[this.field71];
            this.field56 = new int[this.field71];
            this.field94 = new short[this.field71];
            this.field75 = new short[this.field71];
            this.field59 = new int[this.field71];
            this.field62 = new int[this.field71];
            this.field54 = new byte[this.field71];
            this.field57 = new int[this.field71];
            this.field106 = new byte[this.field71];
            this.field78 = new short[this.field71];
            this.field86 = new byte[this.field71];
        }
        if (var9) {
            this.field68 = new byte[this.field82];
        }
        if (var4 > 0) {
            this.field79 = new class72[var4];
        }
        this.field83 = new int[this.field96];
        if (var11) {
            this.field99 = new int[this.field82];
        }
        this.field64 = new int[this.field96];
        if (var3 > 0) {
            this.field105 = new class624[var3];
        }
        this.field92 = new short[this.field82];
        if (var7) {
            this.field73 = new byte[this.field82];
        }
        if (var10) {
            this.field66 = new short[this.field82];
        }
        this.field89 = new short[this.field82];
        this.field53 = new short[this.field82];
        int var13 = 0;
        int var14 = 0;
        this.field96 = 0;
        int var15 = 0;
        this.field71 = 0;
        this.field82 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var24 = (short) (0x1 << var16);
            class5 var25 = arg0[var16];
            if (var25 != null) {
                if (var25.field95 != null) {
                    for (int var26 = 0; var26 < var25.field95.length; var26++) {
                        class482 var27 = var25.field95[var26];
                        this.field95[var15++] = var27.method2759(-29096, this.field82 + var27.field6504);
                    }
                }
                for (int var28 = 0; var28 < var25.field82; var28++) {
                    if (var6 && var25.field65 != null) {
                        this.field65[this.field82] = var25.field65[var28];
                    }
                    if (var7) {
                        if (var25.field73 == null) {
                            this.field73[this.field82] = var25.field58;
                        } else {
                            this.field73[this.field82] = var25.field73[var28];
                        }
                    }
                    if (var8 && var25.field60 != null) {
                        this.field60[this.field82] = var25.field60[var28];
                    }
                    if (var10) {
                        if (var25.field66 == null) {
                            this.field66[this.field82] = -1;
                        } else {
                            this.field66[this.field82] = var25.field66[var28];
                        }
                    }
                    if (var11) {
                        if (var25.field99 == null) {
                            this.field99[this.field82] = -1;
                        } else {
                            this.field99[this.field82] = var25.field99[var28];
                        }
                    }
                    this.field53[this.field82] = (short) this.method34(var25.field53[var28], var25, -1, var24);
                    this.field92[this.field82] = (short) this.method34(var25.field92[var28], var25, -1, var24);
                    this.field89[this.field82] = (short) this.method34(var25.field89[var28], var25, -1, var24);
                    this.field63[this.field82] = var24;
                    this.field90[this.field82] = var25.field90[var28];
                    this.field82++;
                }
                if (var25.field105 != null) {
                    for (int var29 = 0; var29 < var25.field105.length; var29++) {
                        int var30 = this.method34(var25.field105[var29].field8693, var25, -1, var24);
                        int var31 = this.method34(var25.field105[var29].field8709, var25, -1, var24);
                        int var32 = this.method34(var25.field105[var29].field8697, var25, -1, var24);
                        this.field105[var14] = var25.field105[var29].method3513((byte) -111, var32, var30, var31);
                        var14++;
                    }
                }
                if (var25.field79 != null) {
                    for (int var33 = 0; var33 < var25.field79.length; var33++) {
                        int var34 = this.method34(var25.field79[var33].field1051, var25, -1, var24);
                        this.field79[var13] = var25.field79[var33].method637(-27004, var34);
                        var13++;
                    }
                }
            }
        }
        int var17 = 0;
        this.field80 = this.field96;
        for (int var18 = 0; var18 < arg1; var18++) {
            short var19 = (short) (0x1 << var18);
            class5 var20 = arg0[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < var20.field82; var21++) {
                    if (var9) {
                        this.field68[var17++] = (byte) (var20.field68 == null || var20.field68[var21] == -1 ? -1 : var20.field68[var21] + this.field71);
                    }
                }
                for (int var22 = 0; var22 < var20.field71; var22++) {
                    byte var23 = this.field86[this.field71] = var20.field86[var22];
                    if (var23 == 0) {
                        this.field94[this.field71] = (short) this.method34(var20.field94[var22], var20, -1, var19);
                        this.field78[this.field71] = (short) this.method34(var20.field78[var22], var20, -1, var19);
                        this.field75[this.field71] = (short) this.method34(var20.field75[var22], var20, -1, var19);
                    }
                    if (var23 >= 1 && var23 <= 3) {
                        this.field94[this.field71] = var20.field94[var22];
                        this.field78[this.field71] = var20.field78[var22];
                        this.field75[this.field71] = var20.field75[var22];
                        this.field57[this.field71] = var20.field57[var22];
                        this.field74[this.field71] = var20.field74[var22];
                        this.field85[this.field71] = var20.field85[var22];
                        this.field54[this.field71] = var20.field54[var22];
                        this.field106[this.field71] = var20.field106[var22];
                        this.field59[this.field71] = var20.field59[var22];
                    }
                    if (var23 == 2) {
                        this.field62[this.field71] = var20.field62[var22];
                        this.field56[this.field71] = var20.field56[var22];
                    }
                    this.field71++;
                }
            }
        }
    }
}
