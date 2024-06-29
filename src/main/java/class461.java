import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class461 {

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public int field6600 = 0;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public int field6598 = 0;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "B")
    public byte field6622 = 0;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public int field6632 = 0;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field6592 = 0;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public int field6623 = 12;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[S")
    public short[] field6627;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "[I")
    public int[] field6608;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[B")
    public byte[] field6593;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "[S")
    public short[] field6614;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "[B")
    public byte[] field6601;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "[S")
    public short[] field6596;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "[I")
    public int[] field6619;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "[I")
    public int[] field6621;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "[B")
    public byte[] field6631;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "[B")
    public byte[] field6618;

    @OriginalMember(owner = "client!lm", name = "ab", descriptor = "[I")
    public int[] field6643;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
    public int[] field6606;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "[I")
    public int[] field6630;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "[S")
    public short[] field6636;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[I")
    public int[] field6609;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "[S")
    public short[] field6633;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
    public int[] field6595;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    public int[] field6602;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "[S")
    public short[] field6603;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[B")
    public byte[] field6599;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "[I")
    public int[] field6625;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "[B")
    public byte[] field6607;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "[S")
    public short[] field6620;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "[S")
    public short[] field6639;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[B")
    public byte[] field6594;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "[I")
    public int[] field6617;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[Llea;")
    public class568[] field6616;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[Lpn;")
    public class692[] field6613;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "[S")
    public short[] field6629;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[S")
    public short[] field6611;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "[Lin;")
    public class77[] field6634;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Lwh;")
    public static class132 field6624 = new class132(0, -1);

    @OriginalMember(owner = "client!lm", name = "cb", descriptor = "I")
    public static int field6645 = 0;

    @OriginalMember(owner = "client!lm", name = "bb", descriptor = "I")
    public static int field6644 = 0;

    @OriginalMember(owner = "client!lm", name = "db", descriptor = "Lvg;")
    public static class49 field6646 = null;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!lm", name = "Z", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(SBS)V")
    public final void method2708(short arg0, byte arg1, short arg2) {
        field6635++;
        if (this.field6620 == null) {
            return;
        }
        int var4 = 44 / (-arg1 / 53);
        for (int var5 = 0; var5 < this.field6632; var5++) {
            if (this.field6620[var5] == arg0) {
                this.field6620[var5] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)[[I")
    public final int[][] method2709(int arg0) {
        field6637++;
        if (arg0 != -1) {
            return null;
        }
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6632; var4++) {
            int var9 = this.field6625[var4];
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field6632; var7++) {
            int var8 = this.field6625[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(SSI)V")
    public final void method2710(short arg0, short arg1, int arg2) {
        for (int var4 = arg2; var4 < this.field6632; var4++) {
            if (this.field6614[var4] == arg0) {
                this.field6614[var4] = arg1;
            }
        }
        field6591++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method2711(byte arg0) {
        if (arg0 != -52) {
            method2711((byte) -96);
        }
        field6624 = null;
        field6646 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
    public final void method2712(int arg0, int arg1) {
        if (arg0 != 24787) {
            return;
        }
        field6610++;
        for (int var3 = 0; var3 < this.field6598; var3++) {
            this.field6617[var3] <<= arg1;
            this.field6621[var3] <<= arg1;
            this.field6608[var3] <<= arg1;
        }
        if (this.field6600 <= 0 || this.field6595 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field6595.length; var4++) {
            this.field6595[var4] <<= arg1;
            this.field6606[var4] <<= arg1;
            if (this.field6618[var4] != 1) {
                this.field6643[var4] <<= arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(SIBIBSBIB)I")
    public final int method2713(short arg0, int arg1, byte arg2, int arg3, byte arg4, short arg5, byte arg6, int arg7, byte arg8) {
        field6605++;
        this.field6627[this.field6632] = (short) arg7;
        this.field6639[this.field6632] = (short) arg1;
        this.field6596[this.field6632] = (short) arg3;
        this.field6593[this.field6632] = arg8;
        if (arg4 <= 58) {
            this.method2722((short) 35, -40, 113, null);
        }
        this.field6594[this.field6632] = arg2;
        this.field6614[this.field6632] = arg5;
        this.field6607[this.field6632] = arg6;
        this.field6620[this.field6632] = arg0;
        return this.field6632++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V")
    public final void method2714(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            int var5 = class189.field2719[arg1];
            int var6 = class189.field2721[arg1];
            for (int var7 = 0; var7 < this.field6598; var7++) {
                int var8 = this.field6621[var7] * var5 + (this.field6617[var7] * var6) >> 14;
                this.field6621[var7] = this.field6621[var7] * var6 - (this.field6617[var7] * var5) >> 14;
                this.field6617[var7] = var8;
            }
        }
        if (arg3 > -65) {
            return;
        }
        field6604++;
        if (arg0 != 0) {
            int var9 = class189.field2719[arg0];
            int var10 = class189.field2721[arg0];
            for (int var11 = 0; var11 < this.field6598; var11++) {
                int var12 = this.field6621[var11] * var10 - (this.field6608[var11] * var9) >> 14;
                this.field6608[var11] = this.field6621[var11] * var9 + this.field6608[var11] * var10 >> 14;
                this.field6621[var11] = var12;
            }
        }
        if (arg2 == 0) {
            return;
        }
        int var13 = class189.field2719[arg2];
        int var14 = class189.field2721[arg2];
        for (int var15 = 0; var15 < this.field6598; var15++) {
            int var16 = this.field6617[var15] * var14 + this.field6608[var15] * var13 >> 14;
            this.field6608[var15] = this.field6608[var15] * var14 - (this.field6617[var15] * var13) >> 14;
            this.field6617[var15] = var16;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([BI)V")
    private final void method2715(byte[] arg0, int arg1) {
        field6642++;
        class695 var3 = new class695(arg0);
        class695 var4 = new class695(arg0);
        class695 var5 = new class695(arg0);
        class695 var6 = new class695(arg0);
        if (arg1 != 11840) {
            this.field6592 = 86;
        }
        class695 var7 = new class695(arg0);
        class695 var8 = new class695(arg0);
        class695 var9 = new class695(arg0);
        var3.field9761 = arg0.length - 23;
        this.field6598 = var3.method3847((byte) 118);
        this.field6632 = var3.method3847((byte) 118);
        this.field6600 = var3.method3826(false);
        int var10 = var3.method3826(false);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        boolean var13 = (var10 & 0x4) == 4;
        boolean var14 = (var10 & 0x8) == 8;
        if (var14) {
            var3.field9761 -= 7;
            this.field6623 = var3.method3826(false);
            var3.field9761 += 6;
        }
        int var15 = var3.method3826(false);
        int var16 = var3.method3826(false);
        int var17 = var3.method3826(false);
        int var18 = var3.method3826(false);
        int var19 = var3.method3826(false);
        int var20 = var3.method3847((byte) 118);
        int var21 = var3.method3847((byte) 118);
        int var22 = var3.method3847((byte) 118);
        int var23 = var3.method3847((byte) 118);
        int var24 = var3.method3847((byte) 118);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (this.field6600 > 0) {
            this.field6618 = new byte[this.field6600];
            var3.field9761 = 0;
            for (int var28 = 0; var28 < this.field6600; var28++) {
                byte var29 = this.field6618[var28] = var3.method3827((byte) 75);
                if (var29 == 2) {
                    var27++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 0) {
                    var25++;
                }
            }
        }
        int var30 = this.field6600;
        int var32 = this.field6598 + var30;
        int var33 = var32;
        if (var11) {
            var32 += this.field6632;
        }
        int var35 = this.field6632 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += this.field6632;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += this.field6632;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += this.field6598;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += this.field6632;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += this.field6632 * 2;
        }
        int var44 = var24 + var41;
        int var46 = this.field6632 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        byte var57 = 6;
        if (this.field6623 == 14) {
            var57 = 7;
        } else if (this.field6623 >= 15) {
            var57 = 9;
        }
        int var59 = var26 * var57 + var56;
        int var61 = var26 + var59;
        int var63 = var26 + var61;
        int var65 = var26 + (var27 * 2) + var63;
        this.field6596 = new short[this.field6632];
        if (this.field6600 > 0) {
            if (var26 > 0) {
                this.field6606 = new int[var26];
                this.field6595 = new int[var26];
                this.field6631 = new byte[var26];
                this.field6599 = new byte[var26];
                this.field6643 = new int[var26];
                this.field6609 = new int[var26];
            }
            if (var27 > 0) {
                this.field6630 = new int[var27];
                this.field6602 = new int[var27];
            }
            this.field6636 = new short[this.field6600];
            this.field6633 = new short[this.field6600];
            this.field6603 = new short[this.field6600];
        }
        if (var15 == 255) {
            this.field6601 = new byte[this.field6632];
        } else {
            this.field6622 = (byte) var15;
        }
        this.field6617 = new int[this.field6598];
        this.field6621 = new int[this.field6598];
        this.field6608 = new int[this.field6598];
        if (var18 == 1 && this.field6600 > 0) {
            this.field6594 = new byte[this.field6632];
        }
        if (var11) {
            this.field6593 = new byte[this.field6632];
        }
        this.field6627 = new short[this.field6632];
        this.field6639 = new short[this.field6632];
        if (var16 == 1) {
            this.field6607 = new byte[this.field6632];
        }
        if (var19 == 1) {
            this.field6619 = new int[this.field6598];
        }
        var3.field9761 = var30;
        if (var18 == 1) {
            this.field6620 = new short[this.field6632];
        }
        if (var17 == 1) {
            this.field6625 = new int[this.field6632];
        }
        this.field6614 = new short[this.field6632];
        var4.field9761 = var46;
        var5.field9761 = var48;
        var6.field9761 = var50;
        var7.field9761 = var38;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < this.field6598; var70++) {
            int var98 = var3.method3826(false);
            int var99 = 0;
            if ((var98 & 0x1) != 0) {
                var99 = var4.method3828(255);
            }
            int var100 = 0;
            if ((var98 & 0x2) != 0) {
                var100 = var5.method3828(arg1 - 11585);
            }
            int var101 = 0;
            if ((var98 & 0x4) != 0) {
                var101 = var6.method3828(arg1 ^ 0x2EBF);
            }
            this.field6617[var70] = var67 + var99;
            this.field6621[var70] = var68 + var100;
            this.field6608[var70] = var69 + var101;
            var67 = this.field6617[var70];
            var68 = this.field6621[var70];
            var69 = this.field6608[var70];
            if (var19 == 1) {
                this.field6619[var70] = var7.method3826(false);
            }
        }
        var3.field9761 = var44;
        var4.field9761 = var33;
        var5.field9761 = var36;
        var6.field9761 = var39;
        var7.field9761 = var37;
        var8.field9761 = var42;
        var9.field9761 = var41;
        for (int var71 = 0; var71 < this.field6632; var71++) {
            this.field6614[var71] = (short) var3.method3847((byte) 118);
            if (var11) {
                this.field6593[var71] = var4.method3827((byte) -124);
            }
            if (var15 == 255) {
                this.field6601[var71] = var5.method3827((byte) 70);
            }
            if (var16 == 1) {
                this.field6607[var71] = var6.method3827((byte) -117);
            }
            if (var17 == 1) {
                this.field6625[var71] = var7.method3826(false);
            }
            if (var18 == 1) {
                this.field6620[var71] = (short) (var8.method3847((byte) 118) - 1);
            }
            if (this.field6594 != null) {
                if (this.field6620[var71] == -1) {
                    this.field6594[var71] = -1;
                } else {
                    this.field6594[var71] = (byte) (var9.method3826(false) - 1);
                }
            }
        }
        this.field6592 = -1;
        var3.field9761 = var35;
        var4.field9761 = var32;
        short var72 = 0;
        short var73 = 0;
        short var74 = 0;
        short var75 = 0;
        for (int var76 = 0; var76 < this.field6632; var76++) {
            int var94 = var4.method3826(false);
            if (var94 == 1) {
                var72 = (short) (var3.method3828(255) + var75);
                var73 = (short) (var3.method3828(255) + var72);
                var74 = (short) (var73 + var3.method3828(255));
                var75 = var74;
                this.field6627[var76] = var72;
                this.field6639[var76] = var73;
                this.field6596[var76] = var74;
                if (this.field6592 < var72) {
                    this.field6592 = var72;
                }
                if (var73 > this.field6592) {
                    this.field6592 = var73;
                }
                if (var74 > this.field6592) {
                    this.field6592 = var74;
                }
            }
            if (var94 == 2) {
                var73 = var74;
                var74 = (short) (var75 + var3.method3828(255));
                this.field6627[var76] = var72;
                var75 = var74;
                this.field6639[var76] = var73;
                this.field6596[var76] = var74;
                if (this.field6592 < var74) {
                    this.field6592 = var74;
                }
            }
            if (var94 == 3) {
                var72 = var74;
                var74 = (short) (var3.method3828(255) + var75);
                this.field6627[var76] = var72;
                var75 = var74;
                this.field6639[var76] = var73;
                this.field6596[var76] = var74;
                if (var74 > this.field6592) {
                    this.field6592 = var74;
                }
            }
            if (var94 == 4) {
                short var97 = var72;
                var72 = var73;
                var74 = (short) (var75 + var3.method3828(arg1 ^ 0x2EBF));
                var73 = var97;
                this.field6627[var76] = var72;
                var75 = var74;
                this.field6639[var76] = var97;
                this.field6596[var76] = var74;
                if (var74 > this.field6592) {
                    this.field6592 = var74;
                }
            }
        }
        this.field6592++;
        var3.field9761 = var52;
        var4.field9761 = var54;
        var5.field9761 = var56;
        var6.field9761 = var59;
        var7.field9761 = var61;
        var8.field9761 = var63;
        for (int var77 = 0; var77 < this.field6600; var77++) {
            int var93 = this.field6618[var77] & 0xFF;
            if (var93 == 0) {
                this.field6603[var77] = (short) var3.method3847((byte) 118);
                this.field6636[var77] = (short) var3.method3847((byte) 118);
                this.field6633[var77] = (short) var3.method3847((byte) 118);
            }
            if (var93 == 1) {
                this.field6603[var77] = (short) var4.method3847((byte) 118);
                this.field6636[var77] = (short) var4.method3847((byte) 118);
                this.field6633[var77] = (short) var4.method3847((byte) 118);
                if (this.field6623 < 15) {
                    this.field6595[var77] = var5.method3847((byte) 118);
                    if (this.field6623 >= 14) {
                        this.field6606[var77] = var5.method3873(255);
                    } else {
                        this.field6606[var77] = var5.method3847((byte) 118);
                    }
                    this.field6643[var77] = var5.method3847((byte) 118);
                } else {
                    this.field6595[var77] = var5.method3873(255);
                    this.field6606[var77] = var5.method3873(255);
                    this.field6643[var77] = var5.method3873(class189.method1273(arg1, 11967));
                }
                this.field6599[var77] = var6.method3827((byte) -57);
                this.field6631[var77] = var7.method3827((byte) 126);
                this.field6609[var77] = var8.method3827((byte) -121);
            }
            if (var93 == 2) {
                this.field6603[var77] = (short) var4.method3847((byte) 118);
                this.field6636[var77] = (short) var4.method3847((byte) 118);
                this.field6633[var77] = (short) var4.method3847((byte) 118);
                if (this.field6623 >= 15) {
                    this.field6595[var77] = var5.method3873(255);
                    this.field6606[var77] = var5.method3873(255);
                    this.field6643[var77] = var5.method3873(255);
                } else {
                    this.field6595[var77] = var5.method3847((byte) 118);
                    if (this.field6623 >= 14) {
                        this.field6606[var77] = var5.method3873(255);
                    } else {
                        this.field6606[var77] = var5.method3847((byte) 118);
                    }
                    this.field6643[var77] = var5.method3847((byte) 118);
                }
                this.field6599[var77] = var6.method3827((byte) 100);
                this.field6631[var77] = var7.method3827((byte) -98);
                this.field6609[var77] = var8.method3827((byte) 23);
                this.field6602[var77] = var8.method3827((byte) -53);
                this.field6630[var77] = var8.method3827((byte) -79);
            }
            if (var93 == 3) {
                this.field6603[var77] = (short) var4.method3847((byte) 118);
                this.field6636[var77] = (short) var4.method3847((byte) 118);
                this.field6633[var77] = (short) var4.method3847((byte) 118);
                if (this.field6623 >= 15) {
                    this.field6595[var77] = var5.method3873(255);
                    this.field6606[var77] = var5.method3873(255);
                    this.field6643[var77] = var5.method3873(255);
                } else {
                    this.field6595[var77] = var5.method3847((byte) 118);
                    if (this.field6623 < 14) {
                        this.field6606[var77] = var5.method3847((byte) 118);
                    } else {
                        this.field6606[var77] = var5.method3873(255);
                    }
                    this.field6643[var77] = var5.method3847((byte) 118);
                }
                this.field6599[var77] = var6.method3827((byte) -102);
                this.field6631[var77] = var7.method3827((byte) 41);
                this.field6609[var77] = var8.method3827((byte) 110);
            }
        }
        var3.field9761 = var65;
        if (var12) {
            int var78 = var3.method3826(false);
            if (var78 > 0) {
                this.field6616 = new class568[var78];
                for (int var79 = 0; var79 < var78; var79++) {
                    int var80 = var3.method3847((byte) 118);
                    int var81 = var3.method3847((byte) 118);
                    byte var82;
                    if (var15 == 255) {
                        var82 = this.field6601[var81];
                    } else {
                        var82 = (byte) var15;
                    }
                    this.field6616[var79] = new class568(var80, this.field6627[var81], this.field6639[var81], this.field6596[var81], var82);
                }
            }
            int var83 = var3.method3826(false);
            if (var83 > 0) {
                this.field6634 = new class77[var83];
                for (int var84 = 0; var84 < var83; var84++) {
                    int var85 = var3.method3847((byte) 118);
                    int var86 = var3.method3847((byte) 118);
                    this.field6634[var84] = new class77(var85, var86);
                }
            }
        }
        if (!var13) {
            return;
        }
        int var87 = var3.method3826(false);
        if (var87 <= 0) {
            return;
        }
        this.field6613 = new class692[var87];
        for (int var88 = 0; var88 < var87; var88++) {
            int var89 = var3.method3847((byte) 118);
            int var90 = var3.method3847((byte) 118);
            int var91 = var3.method3826(false);
            byte var92 = var3.method3827((byte) 41);
            this.field6613[var88] = new class692(var89, var90, var91, var92);
        }
        return;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(SSISBSBSBS)B")
    public final byte method2716(short arg0, short arg1, int arg2, short arg3, byte arg4, short arg5, byte arg6, short arg7, byte arg8, short arg9) {
        field6641++;
        if (this.field6600 >= 255) {
            throw new IllegalStateException();
        }
        this.field6618[this.field6600] = 3;
        this.field6603[this.field6600] = arg5;
        this.field6636[this.field6600] = arg1;
        this.field6633[this.field6600] = arg7;
        this.field6595[this.field6600] = arg9;
        this.field6606[this.field6600] = arg0;
        this.field6643[this.field6600] = arg3;
        if (arg2 == 1) {
            this.field6599[this.field6600] = arg4;
            this.field6631[this.field6600] = arg8;
            this.field6609[this.field6600] = arg6;
            return (byte) (this.field6600++);
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method2717(int arg0, boolean arg1) {
        field6638++;
        int[] var3 = new int[256];
        int var4 = 0;
        int var5 = arg1 ? this.field6598 : this.field6592;
        for (int var6 = 0; var6 < var5; var6++) {
            int var11 = this.field6619[var6];
            if (var11 >= 0) {
                if (var4 < var11) {
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
        if (arg0 > -34) {
            return null;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field6619[var9];
            if (var10 >= 0) {
                var7[var10][var3[var10]++] = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)[[I")
    public final int[][] method2718(int arg0) {
        field6615++;
        int[] var2 = new int[256];
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field6613.length; var4++) {
            int var9 = this.field6613[var4].field9725;
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
        for (int var7 = 0; var7 < this.field6613.length; var7++) {
            int var8 = this.field6613[var7].field9725;
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIII)I")
    public final int method2719(byte arg0, int arg1, int arg2, int arg3) {
        field6612++;
        if (arg0 < 14) {
            this.method2720(-26, -12, -77, -70);
        }
        for (int var5 = 0; var5 < this.field6598; var5++) {
            if (this.field6617[var5] == arg1 && this.field6621[var5] == arg2 && this.field6608[var5] == arg3) {
                return var5;
            }
        }
        this.field6617[this.field6598] = arg1;
        this.field6621[this.field6598] = arg2;
        this.field6608[this.field6598] = arg3;
        this.field6592 = this.field6598 + 1;
        return this.field6598++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIII)V")
    public final void method2720(int arg0, int arg1, int arg2, int arg3) {
        field6640++;
        for (int var5 = arg3; var5 < this.field6598; var5++) {
            this.field6617[var5] += arg2;
            this.field6621[var5] += arg0;
            this.field6608[var5] += arg1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/net/Socket;)Lns;")
    public static final class368 method2721(int arg0, int arg1, Socket arg2) throws IOException {
        field6628++;
        return arg1 == -8663 ? new class457(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(SIILlm;)I")
    private final int method2722(short arg0, int arg1, int arg2, class461 arg3) {
        field6597++;
        int var5 = arg3.field6617[arg1];
        int var6 = -92 % ((arg2 - 82) / 35);
        int var7 = arg3.field6621[arg1];
        int var8 = arg3.field6608[arg1];
        for (int var9 = 0; var9 < this.field6598; var9++) {
            if (this.field6617[var9] == var5 && this.field6621[var9] == var7 && this.field6608[var9] == var8) {
                this.field6611[var9] = (short) class486.method2826(this.field6611[var9], arg0);
                return var9;
            }
        }
        this.field6617[this.field6598] = var5;
        this.field6621[this.field6598] = var7;
        this.field6608[this.field6598] = var8;
        this.field6611[this.field6598] = arg0;
        this.field6619[this.field6598] = arg3.field6619 == null ? -1 : arg3.field6619[arg1];
        return this.field6598++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[B)V")
    private final void method2723(int arg0, byte[] arg1) {
        field6626++;
        boolean var3 = false;
        boolean var4 = false;
        class695 var5 = new class695(arg1);
        class695 var6 = new class695(arg1);
        class695 var7 = new class695(arg1);
        class695 var8 = new class695(arg1);
        class695 var9 = new class695(arg1);
        var5.field9761 = arg1.length - 18;
        this.field6598 = var5.method3847((byte) 118);
        this.field6632 = var5.method3847((byte) 118);
        this.field6600 = var5.method3826(false);
        int var10 = var5.method3826(false);
        int var11 = var5.method3826(false);
        int var12 = var5.method3826(false);
        int var13 = var5.method3826(false);
        int var14 = var5.method3826(false);
        int var15 = var5.method3847((byte) 118);
        int var16 = var5.method3847((byte) 118);
        int var17 = var5.method3847((byte) 118);
        int var18 = var5.method3847((byte) 118);
        byte var19 = 0;
        int var21 = this.field6598 + var19;
        int var23 = this.field6632 + var21;
        int var24 = var23;
        if (var11 == 255) {
            var23 += this.field6632;
        }
        int var25 = var23;
        if (var13 == 1) {
            var23 += this.field6632;
        }
        int var26 = var23;
        if (var10 == 1) {
            var23 += this.field6632;
        }
        int var27 = var23;
        if (var14 == 1) {
            var23 += this.field6598;
        }
        int var28 = var23;
        if (var12 == 1) {
            var23 += this.field6632;
        }
        int var30 = var18 + var23;
        int var32 = this.field6632 * 2 + var30;
        int var34 = this.field6600 * 6 + var32;
        int var36 = var15 + var34;
        int var38 = var16 + var36;
        this.field6596 = new short[this.field6632];
        if (var11 == 255) {
            this.field6601 = new byte[this.field6632];
        } else {
            this.field6622 = (byte) var11;
        }
        this.field6614 = new short[this.field6632];
        this.field6627 = new short[this.field6632];
        if (this.field6600 > 0) {
            this.field6633 = new short[this.field6600];
            this.field6636 = new short[this.field6600];
            this.field6618 = new byte[this.field6600];
            this.field6603 = new short[this.field6600];
        }
        if (var13 == 1) {
            this.field6625 = new int[this.field6632];
        }
        this.field6608 = new int[this.field6598];
        if (var12 == 1) {
            this.field6607 = new byte[this.field6632];
        }
        var5.field9761 = var19;
        if (var10 == 1) {
            this.field6594 = new byte[this.field6632];
            this.field6593 = new byte[this.field6632];
            this.field6620 = new short[this.field6632];
        }
        this.field6639 = new short[this.field6632];
        int var10000 = var17 + var38;
        this.field6617 = new int[this.field6598];
        this.field6621 = new int[this.field6598];
        if (var14 == 1) {
            this.field6619 = new int[this.field6598];
        }
        var6.field9761 = var34;
        var7.field9761 = var36;
        var8.field9761 = var38;
        var9.field9761 = var27;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        for (int var44 = arg0; var44 < this.field6598; var44++) {
            int var60 = var5.method3826(false);
            int var61 = 0;
            if ((var60 & 0x1) != 0) {
                var61 = var6.method3828(arg0 + 255);
            }
            int var62 = 0;
            if ((var60 & 0x2) != 0) {
                var62 = var7.method3828(255);
            }
            int var63 = 0;
            if ((var60 & 0x4) != 0) {
                var63 = var8.method3828(arg0 + 255);
            }
            this.field6617[var44] = var41 + var61;
            this.field6621[var44] = var42 + var62;
            this.field6608[var44] = var43 + var63;
            var41 = this.field6617[var44];
            var43 = this.field6608[var44];
            var42 = this.field6621[var44];
            if (var14 == 1) {
                this.field6619[var44] = var9.method3826(false);
            }
        }
        var5.field9761 = var30;
        var6.field9761 = var26;
        var7.field9761 = var24;
        var8.field9761 = var28;
        var9.field9761 = var25;
        for (int var45 = 0; var45 < this.field6632; var45++) {
            this.field6614[var45] = (short) var5.method3847((byte) 118);
            if (var10 == 1) {
                int var59 = var6.method3826(false);
                if ((var59 & 0x1) == 1) {
                    var3 = true;
                    this.field6593[var45] = 1;
                } else {
                    this.field6593[var45] = 0;
                }
                if ((var59 & 0x2) == 2) {
                    this.field6594[var45] = (byte) (var59 >> 2);
                    this.field6620[var45] = this.field6614[var45];
                    this.field6614[var45] = 127;
                    if (this.field6620[var45] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field6594[var45] = -1;
                    this.field6620[var45] = -1;
                }
            }
            if (var11 == 255) {
                this.field6601[var45] = var7.method3827((byte) -89);
            }
            if (var12 == 1) {
                this.field6607[var45] = var8.method3827((byte) -90);
            }
            if (var13 == 1) {
                this.field6625[var45] = var9.method3826(false);
            }
        }
        this.field6592 = -1;
        var5.field9761 = var23;
        var6.field9761 = var21;
        short var46 = 0;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        for (int var50 = 0; var50 < this.field6632; var50++) {
            int var55 = var6.method3826(false);
            if (var55 == 1) {
                var46 = (short) (var5.method3828(arg0 + 255) + var49);
                var47 = (short) (var46 + var5.method3828(255));
                var48 = (short) (var5.method3828(255) + var47);
                this.field6627[var50] = var46;
                var49 = var48;
                this.field6639[var50] = var47;
                this.field6596[var50] = var48;
                if (this.field6592 < var46) {
                    this.field6592 = var46;
                }
                if (var47 > this.field6592) {
                    this.field6592 = var47;
                }
                if (this.field6592 < var48) {
                    this.field6592 = var48;
                }
            }
            if (var55 == 2) {
                var47 = var48;
                var48 = (short) (var49 + var5.method3828(255));
                var49 = var48;
                this.field6627[var50] = var46;
                this.field6639[var50] = var47;
                this.field6596[var50] = var48;
                if (var48 > this.field6592) {
                    this.field6592 = var48;
                }
            }
            if (var55 == 3) {
                var46 = var48;
                var48 = (short) (var49 + var5.method3828(arg0 + 255));
                var49 = var48;
                this.field6627[var50] = var46;
                this.field6639[var50] = var47;
                this.field6596[var50] = var48;
                if (this.field6592 < var48) {
                    this.field6592 = var48;
                }
            }
            if (var55 == 4) {
                short var58 = var46;
                var46 = var47;
                var48 = (short) (var5.method3828(255) + var49);
                var47 = var58;
                var49 = var48;
                this.field6627[var50] = var46;
                this.field6639[var50] = var58;
                this.field6596[var50] = var48;
                if (this.field6592 < var48) {
                    this.field6592 = var48;
                }
            }
        }
        this.field6592++;
        var5.field9761 = var32;
        for (int var51 = 0; var51 < this.field6600; var51++) {
            this.field6618[var51] = 0;
            this.field6603[var51] = (short) var5.method3847((byte) 118);
            this.field6636[var51] = (short) var5.method3847((byte) 118);
            this.field6633[var51] = (short) var5.method3847((byte) 118);
        }
        if (this.field6594 != null) {
            boolean var52 = false;
            for (int var53 = 0; var53 < this.field6632; var53++) {
                int var54 = this.field6594[var53] & 0xFF;
                if (var54 != 255) {
                    if ((this.field6603[var54] & 0xFFFF) == this.field6627[var53] && (this.field6636[var54] & 0xFFFF) == this.field6639[var53] && (this.field6633[var54] & 0xFFFF) == this.field6596[var53]) {
                        this.field6594[var53] = -1;
                    } else {
                        var52 = true;
                    }
                }
            }
            if (!var52) {
                this.field6594 = null;
            }
        }
        if (!var4) {
            this.field6620 = null;
        }
        if (!var3) {
            this.field6593 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class461() {
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V")
    public class461(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2715(arg0, 11840);
        } else {
            this.method2723(0, arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(III)V")
    public class461(int arg0, int arg1, int arg2) {
        this.field6627 = new short[arg1];
        this.field6608 = new int[arg0];
        this.field6593 = new byte[arg1];
        this.field6614 = new short[arg1];
        this.field6601 = new byte[arg1];
        this.field6596 = new short[arg1];
        this.field6619 = new int[arg0];
        this.field6621 = new int[arg0];
        if (arg2 > 0) {
            this.field6631 = new byte[arg2];
            this.field6618 = new byte[arg2];
            this.field6643 = new int[arg2];
            this.field6606 = new int[arg2];
            this.field6630 = new int[arg2];
            this.field6636 = new short[arg2];
            this.field6609 = new int[arg2];
            this.field6633 = new short[arg2];
            this.field6595 = new int[arg2];
            this.field6602 = new int[arg2];
            this.field6603 = new short[arg2];
            this.field6599 = new byte[arg2];
        }
        this.field6625 = new int[arg1];
        this.field6607 = new byte[arg1];
        this.field6620 = new short[arg1];
        this.field6639 = new short[arg1];
        this.field6594 = new byte[arg1];
        this.field6617 = new int[arg0];
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([Llm;I)V")
    public class461(class461[] arg0, int arg1) {
        this.field6600 = 0;
        this.field6598 = 0;
        this.field6632 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        this.field6622 = -1;
        boolean var11 = false;
        for (int var12 = 0; var12 < arg1; var12++) {
            class461 var35 = arg0[var12];
            if (var35 != null) {
                this.field6632 += var35.field6632;
                this.field6600 += var35.field6600;
                this.field6598 += var35.field6598;
                var6 |= var35.field6593 != null;
                if (var35.field6616 != null) {
                    var3 += var35.field6616.length;
                }
                if (var35.field6613 != null) {
                    var5 += var35.field6613.length;
                }
                if (var35.field6634 != null) {
                    var4 += var35.field6634.length;
                }
                var10 |= var35.field6620 != null;
                var8 |= var35.field6607 != null;
                var11 |= var35.field6625 != null;
                if (var35.field6601 == null) {
                    if (this.field6622 == -1) {
                        this.field6622 = var35.field6622;
                    }
                    if (this.field6622 != var35.field6622) {
                        var7 = true;
                    }
                } else {
                    var7 = true;
                }
                var9 |= var35.field6594 != null;
            }
        }
        this.field6627 = new short[this.field6632];
        if (var10) {
            this.field6620 = new short[this.field6632];
        }
        if (var6) {
            this.field6593 = new byte[this.field6632];
        }
        if (var3 > 0) {
            this.field6616 = new class568[var3];
        }
        if (this.field6600 > 0) {
            this.field6606 = new int[this.field6600];
            this.field6595 = new int[this.field6600];
            this.field6631 = new byte[this.field6600];
            this.field6599 = new byte[this.field6600];
            this.field6636 = new short[this.field6600];
            this.field6603 = new short[this.field6600];
            this.field6633 = new short[this.field6600];
            this.field6618 = new byte[this.field6600];
            this.field6602 = new int[this.field6600];
            this.field6609 = new int[this.field6600];
            this.field6643 = new int[this.field6600];
            this.field6630 = new int[this.field6600];
        }
        if (var5 > 0) {
            this.field6613 = new class692[var5];
        }
        this.field6639 = new short[this.field6632];
        this.field6629 = new short[this.field6632];
        this.field6614 = new short[this.field6632];
        this.field6621 = new int[this.field6598];
        this.field6619 = new int[this.field6598];
        this.field6611 = new short[this.field6598];
        if (var8) {
            this.field6607 = new byte[this.field6632];
        }
        this.field6596 = new short[this.field6632];
        this.field6617 = new int[this.field6598];
        if (var9) {
            this.field6594 = new byte[this.field6632];
        }
        if (var4 > 0) {
            this.field6634 = new class77[var4];
        }
        if (var7) {
            this.field6601 = new byte[this.field6632];
        }
        this.field6608 = new int[this.field6598];
        if (var11) {
            this.field6625 = new int[this.field6632];
        }
        int var13 = 0;
        this.field6598 = 0;
        int var14 = 0;
        int var15 = 0;
        this.field6632 = 0;
        this.field6600 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var24 = (short) (0x1 << var16);
            class461 var25 = arg0[var16];
            if (var25 != null) {
                if (var25.field6613 != null) {
                    for (int var26 = 0; var26 < var25.field6613.length; var26++) {
                        class692 var27 = var25.field6613[var26];
                        this.field6613[var14++] = var27.method3806((byte) -80, this.field6632 + var27.field9732);
                    }
                }
                for (int var28 = 0; var28 < var25.field6632; var28++) {
                    if (var6 && var25.field6593 != null) {
                        this.field6593[this.field6632] = var25.field6593[var28];
                    }
                    if (var7) {
                        if (var25.field6601 == null) {
                            this.field6601[this.field6632] = var25.field6622;
                        } else {
                            this.field6601[this.field6632] = var25.field6601[var28];
                        }
                    }
                    if (var8 && var25.field6607 != null) {
                        this.field6607[this.field6632] = var25.field6607[var28];
                    }
                    if (var10) {
                        if (var25.field6620 == null) {
                            this.field6620[this.field6632] = -1;
                        } else {
                            this.field6620[this.field6632] = var25.field6620[var28];
                        }
                    }
                    if (var11) {
                        if (var25.field6625 == null) {
                            this.field6625[this.field6632] = -1;
                        } else {
                            this.field6625[this.field6632] = var25.field6625[var28];
                        }
                    }
                    this.field6627[this.field6632] = (short) this.method2722(var24, var25.field6627[var28], 118, var25);
                    this.field6639[this.field6632] = (short) this.method2722(var24, var25.field6639[var28], 121, var25);
                    this.field6596[this.field6632] = (short) this.method2722(var24, var25.field6596[var28], -39, var25);
                    this.field6629[this.field6632] = var24;
                    this.field6614[this.field6632] = var25.field6614[var28];
                    this.field6632++;
                }
                if (var25.field6616 != null) {
                    for (int var29 = 0; var29 < var25.field6616.length; var29++) {
                        int var30 = this.method2722(var24, var25.field6616[var29].field7999, -19, var25);
                        int var31 = this.method2722(var24, var25.field6616[var29].field8000, -74, var25);
                        int var32 = this.method2722(var24, var25.field6616[var29].field8001, 124, var25);
                        this.field6616[var13] = var25.field6616[var29].method3233(var31, 110, var30, var32);
                        var13++;
                    }
                }
                if (var25.field6634 != null) {
                    for (int var33 = 0; var33 < var25.field6634.length; var33++) {
                        int var34 = this.method2722(var24, var25.field6634[var33].field1333, 125, var25);
                        this.field6634[var15] = var25.field6634[var33].method714(var34, (byte) -63);
                        var15++;
                    }
                }
            }
        }
        this.field6592 = this.field6598;
        int var17 = 0;
        for (int var18 = 0; var18 < arg1; var18++) {
            short var19 = (short) (0x1 << var18);
            class461 var20 = arg0[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < var20.field6632; var21++) {
                    if (var9) {
                        this.field6594[var17++] = (byte) (var20.field6594 == null || var20.field6594[var21] == -1 ? -1 : var20.field6594[var21] + this.field6600);
                    }
                }
                for (int var22 = 0; var22 < var20.field6600; var22++) {
                    byte var23 = this.field6618[this.field6600] = var20.field6618[var22];
                    if (var23 == 0) {
                        this.field6603[this.field6600] = (short) this.method2722(var19, var20.field6603[var22], 127, var20);
                        this.field6636[this.field6600] = (short) this.method2722(var19, var20.field6636[var22], 117, var20);
                        this.field6633[this.field6600] = (short) this.method2722(var19, var20.field6633[var22], -83, var20);
                    }
                    if (var23 >= 1 && var23 <= 3) {
                        this.field6603[this.field6600] = var20.field6603[var22];
                        this.field6636[this.field6600] = var20.field6636[var22];
                        this.field6633[this.field6600] = var20.field6633[var22];
                        this.field6595[this.field6600] = var20.field6595[var22];
                        this.field6606[this.field6600] = var20.field6606[var22];
                        this.field6643[this.field6600] = var20.field6643[var22];
                        this.field6599[this.field6600] = var20.field6599[var22];
                        this.field6631[this.field6600] = var20.field6631[var22];
                        this.field6609[this.field6600] = var20.field6609[var22];
                    }
                    if (var23 == 2) {
                        this.field6602[this.field6600] = var20.field6602[var22];
                        this.field6630[this.field6600] = var20.field6630[var22];
                    }
                    this.field6600++;
                }
            }
        }
    }
}
