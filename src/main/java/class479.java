import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class479 {

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public int field6644 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/lang/String;")
    public String field6647 = "null";

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field6657 = 0;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    private int field6654 = -1;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Z")
    public boolean field6652 = false;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field6643 = -1;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public int field6660 = 255;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "B")
    public byte field6634 = 4;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Z")
    public boolean field6669 = true;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "B")
    public byte field6661 = -1;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public int field6668 = -1;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public int field6646 = 256;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public int field6666 = -1;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public int field6679 = -1;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    private int field6678 = 128;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public int field6672 = 256;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public int field6642 = -1;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "S")
    public short field6639 = 0;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Z")
    public boolean field6664 = true;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field6633 = -1;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
    public int field6694 = -1;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "B")
    public byte field6695 = 0;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    public int field6688 = 32;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public int field6681 = -1;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Z")
    public boolean field6635 = false;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public int field6662 = -1;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "B")
    public byte field6667 = -16;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "Z")
    public boolean field6696 = false;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "Z")
    public boolean field6700 = true;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
    private int field6699 = -1;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public int field6691 = -1;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public int field6674 = -1;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public int field6689 = -1;

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "I")
    public int field6704 = 0;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "S")
    public short field6658 = 0;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public int field6697 = -1;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    private int field6683 = 128;

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "[Ljava/lang/String;")
    public String[] field6698 = new String[5];

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "B")
    public byte field6706 = -96;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public int field6663 = 0;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Z")
    public boolean field6641 = true;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public int field6676 = -1;

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "B")
    private byte field6707 = 0;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "I")
    public int field6709 = -1;

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
    private int field6705 = 0;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "I")
    public int field6702 = -1;

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
    public int field6708 = -1;

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "I")
    public int field6711 = -1;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
    public int field6710 = 1;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field6645 = 0;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "B")
    private byte field6650;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "B")
    private byte field6651;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "B")
    private byte field6659;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public int field6680;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "Lvr;")
    public class148 field6692;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Ldj;")
    private class362 field6638;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "Z")
    public boolean field6686;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[B")
    private byte[] field6640;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    public int[] field6636;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "[I")
    public int[] field6665;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "[I")
    public int[] field6677;

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "[I")
    public int[] field6701;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[S")
    private short[] field6637;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "[S")
    public short[] field6655;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "[S")
    private short[] field6675;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "[S")
    public short[] field6690;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "[[I")
    private int[][] field6653;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B[BLjava/io/File;I)V", line = 9)
    public static final void method2841(byte arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        int var4 = -56 / ((arg0 + 53) / 49);
        field6687++;
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var5.readFully(arg1, 0, arg3);
        } catch (EOFException var6) {
        }
        var5.close();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbh;B)Z", line = 26)
    public final boolean method2842(class40 arg0, byte arg1) {
        field6673++;
        if (this.field6636 == null) {
            return true;
        }
        int var3 = -1;
        if (this.field6699 != -1) {
            var3 = arg0.method336(this.field6699, (byte) 46);
        } else if (this.field6654 != -1) {
            var3 = arg0.method337(118, this.field6654);
        }
        if (arg1 != -16) {
            this.field6642 = 118;
        }
        if (var3 < 0 || (this.field6636.length - 1) <= var3 || this.field6636[var3] == -1) {
            int var4 = this.field6636[this.field6636.length - 1];
            return var4 != -1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbh;I)Ltd;", line = 62)
    public final class479 method2843(class40 arg0, int arg1) {
        field6682++;
        if (arg1 != 228) {
            return null;
        }
        int var3 = -1;
        if (this.field6699 != -1) {
            var3 = arg0.method336(this.field6699, (byte) 119);
        } else if (this.field6654 != -1) {
            var3 = arg0.method337(122, this.field6654);
        }
        if (var3 < 0 || (this.field6636.length - 1) <= var3 || this.field6636[var3] == -1) {
            int var4 = this.field6636[this.field6636.length - 1];
            return var4 == -1 ? null : this.field6692.method1070(var4, true);
        } else {
            return this.field6692.method1070(this.field6636[var3], true);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 99)
    public final void method2844(byte arg0) {
        if (arg0 != -121) {
            this.field6650 = 46;
        }
        if (this.field6661 == -1) {
            if (class359.field4463 == this.field6692.field1851) {
                this.field6661 = 1;
            } else {
                this.field6661 = 0;
            }
        }
        field6648++;
        if (this.field6701 == null) {
            this.field6701 = new int[0];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)Z", line = 125)
    public final boolean method2845(boolean arg0) {
        field6693++;
        if (this.field6636 == null) {
            return this.field6642 != -1 || this.field6711 != -1 || this.field6666 != -1;
        }
        for (int var2 = 0; var2 < this.field6636.length; var2++) {
            if (this.field6636[var2] != -1) {
                class479 var3 = this.field6692.method1070(this.field6636[var2], true);
                if (var3.field6642 != -1 || var3.field6711 != -1 || var3.field6666 != -1) {
                    return true;
                }
            }
        }
        if (arg0) {
            this.method2847(null, (byte) -93);
        }
        return false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;", line = 160)
    public final String method2846(int arg0, byte arg1, String arg2) {
        field6684++;
        if (this.field6638 == null) {
            return arg2;
        } else {
            class562 var4 = (class562) this.field6638.method2121(94, (long) arg0);
            int var5 = -56 / ((22 - arg1) / 42);
            return var4 == null ? arg2 : var4.field7772;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Les;B)V", line = 190)
    public final void method2847(class403 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2396((byte) 29);
            if (var3 == 0) {
                int var4 = 125 % ((-arg1 - 2) / 54);
                field6649++;
                return;
            }
            this.method2849(arg0, var3, -65536);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lkq;", line = 210)
    public static final class620 method2848(int arg0, byte arg1) {
        int var2 = 112 % ((arg1 - 46) / 61);
        field6656++;
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class316.field3880[var3] == null || class316.field3880[var3][var4] == null) {
            boolean var5 = class647.method3652(var3, 0);
            if (!var5) {
                return null;
            }
        }
        return class316.field3880[var3][var4];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Les;II)V", line = 248)
    private final void method2849(class403 arg0, int arg1, int arg2) {
        if (arg2 != -65536) {
            method2848(71, (byte) -96);
        }
        if (arg1 == 1) {
            int var4 = arg0.method2396((byte) 11);
            this.field6701 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6701[var5] = arg0.method2390((byte) 109);
                if (this.field6701[var5] == 65535) {
                    this.field6701[var5] = -1;
                }
            }
        } else if (arg1 == 2) {
            this.field6647 = arg0.method2384(arg2 + 59101);
        } else if (arg1 == 12) {
            this.field6710 = arg0.method2396((byte) 67);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field6698[arg1 - 30] = arg0.method2384(class241.method1459(arg2, 59101));
        } else if (arg1 == 40) {
            int var6 = arg0.method2396((byte) -115);
            this.field6655 = new short[var6];
            this.field6637 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6637[var7] = (short) arg0.method2390((byte) 41);
                this.field6655[var7] = (short) arg0.method2390((byte) 56);
            }
        } else if (arg1 == 41) {
            int var27 = arg0.method2396((byte) -124);
            this.field6690 = new short[var27];
            this.field6675 = new short[var27];
            for (int var28 = 0; var28 < var27; var28++) {
                this.field6675[var28] = (short) arg0.method2390((byte) 6);
                this.field6690[var28] = (short) arg0.method2390((byte) -2);
            }
        } else if (arg1 == 42) {
            int var8 = arg0.method2396((byte) 59);
            this.field6640 = new byte[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6640[var9] = arg0.method2392(-98);
            }
        } else if (arg1 == 60) {
            int var10 = arg0.method2396((byte) 64);
            this.field6665 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field6665[var11] = arg0.method2390((byte) 73);
            }
        } else if (arg1 == 93) {
            this.field6669 = false;
        } else if (arg1 == 95) {
            this.field6709 = arg0.method2390((byte) -110);
        } else if (arg1 == 97) {
            this.field6683 = arg0.method2390((byte) 12);
        } else if (arg1 == 98) {
            this.field6678 = arg0.method2390((byte) -109);
        } else if (arg1 == 99) {
            this.field6652 = true;
        } else if (arg1 == 100) {
            this.field6705 = arg0.method2392(120);
        } else if (arg1 == 101) {
            this.field6657 = arg0.method2392(arg2 ^ 0xFFFF0077) * 5;
        } else if (arg1 == 102) {
            this.field6694 = arg0.method2390((byte) -124);
        } else if (arg1 == 103) {
            this.field6688 = arg0.method2390((byte) -126);
        } else if (arg1 == 106 || arg1 == 118) {
            this.field6699 = arg0.method2390((byte) 79);
            if (this.field6699 == 65535) {
                this.field6699 = -1;
            }
            this.field6654 = arg0.method2390((byte) -102);
            if (this.field6654 == 65535) {
                this.field6654 = -1;
            }
            int var24 = -1;
            if (arg1 == 118) {
                var24 = arg0.method2390((byte) -113);
                if (var24 == 65535) {
                    var24 = -1;
                }
            }
            int var25 = arg0.method2396((byte) 62);
            this.field6636 = new int[var25 + 2];
            for (int var26 = 0; var26 <= var25; var26++) {
                this.field6636[var26] = arg0.method2390((byte) 55);
                if (this.field6636[var26] == 65535) {
                    this.field6636[var26] = -1;
                }
            }
            this.field6636[var25 + 1] = var24;
        } else if (arg1 == 107) {
            this.field6700 = false;
        } else if (arg1 == 109) {
            this.field6641 = false;
        } else if (arg1 == 111) {
            this.field6664 = false;
        } else if (arg1 == 113) {
            this.field6639 = (short) arg0.method2390((byte) 11);
            this.field6658 = (short) arg0.method2390((byte) -118);
        } else if (arg1 == 114) {
            this.field6706 = arg0.method2392(arg2 + 65660);
            this.field6667 = arg0.method2392(114);
        } else if (arg1 == 119) {
            this.field6695 = arg0.method2392(116);
        } else if (arg1 == 121) {
            this.field6653 = new int[this.field6701.length][];
            int var20 = arg0.method2396((byte) 91);
            for (int var21 = 0; var21 < var20; var21++) {
                int var22 = arg0.method2396((byte) 108);
                int[] var23 = this.field6653[var22] = new int[3];
                var23[0] = arg0.method2392(121);
                var23[1] = arg0.method2392(4);
                var23[2] = arg0.method2392(-67);
            }
        } else if (arg1 == 122) {
            this.field6697 = arg0.method2390((byte) -99);
        } else if (arg1 == 123) {
            this.field6668 = arg0.method2390((byte) -4);
        } else if (arg1 == 125) {
            this.field6634 = arg0.method2392(117);
        } else if (arg1 == 127) {
            this.field6681 = arg0.method2390((byte) 125);
        } else if (arg1 == 128) {
            arg0.method2396((byte) -124);
        } else if (arg1 == 134) {
            this.field6642 = arg0.method2390((byte) 70);
            if (this.field6642 == 65535) {
                this.field6642 = -1;
            }
            this.field6676 = arg0.method2390((byte) 41);
            if (this.field6676 == 65535) {
                this.field6676 = -1;
            }
            this.field6711 = arg0.method2390((byte) -125);
            if (this.field6711 == 65535) {
                this.field6711 = -1;
            }
            this.field6666 = arg0.method2390((byte) 29);
            if (this.field6666 == 65535) {
                this.field6666 = -1;
            }
            this.field6663 = arg0.method2396((byte) 27);
        } else if (arg1 == 135) {
            this.field6662 = arg0.method2396((byte) 67);
            this.field6689 = arg0.method2390((byte) -117);
        } else if (arg1 == 136) {
            this.field6674 = arg0.method2396((byte) -103);
            this.field6679 = arg0.method2390((byte) 19);
        } else if (arg1 == 137) {
            this.field6708 = arg0.method2390((byte) 97);
        } else if (arg1 == 138) {
            this.field6691 = arg0.method2390((byte) 126);
        } else if (arg1 == 139) {
            this.field6643 = arg0.method2390((byte) -107);
        } else if (arg1 == 140) {
            this.field6660 = arg0.method2396((byte) 98);
        } else if (arg1 == 141) {
            this.field6635 = true;
        } else if (arg1 == 142) {
            this.field6633 = arg0.method2390((byte) 91);
        } else if (arg1 == 143) {
            this.field6696 = true;
        } else if (arg1 >= 150 && arg1 < 155) {
            this.field6698[arg1 - 150] = arg0.method2384(-6435);
            if (!this.field6692.field1852) {
                this.field6698[arg1 - 150] = null;
            }
        } else if (arg1 == 155) {
            this.field6651 = arg0.method2392(arg2 ^ 0xFFFF0074);
            this.field6650 = arg0.method2392(126);
            this.field6659 = arg0.method2392(-17);
            this.field6707 = arg0.method2392(-128);
        } else if (arg1 == 158) {
            this.field6661 = 1;
        } else if (arg1 == 159) {
            this.field6661 = 0;
        } else if (arg1 == 160) {
            int var18 = arg0.method2396((byte) 89);
            this.field6677 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field6677[var19] = arg0.method2390((byte) -119);
            }
        } else if (arg1 == 162) {
            this.field6686 = true;
        } else if (arg1 == 163) {
            this.field6702 = arg0.method2396((byte) 103);
        } else if (arg1 == 164) {
            this.field6672 = arg0.method2390((byte) 116);
            this.field6646 = arg0.method2390((byte) 87);
        } else if (arg1 == 165) {
            this.field6644 = arg0.method2396((byte) -86);
        } else if (arg1 == 168) {
            this.field6704 = arg0.method2396((byte) -125);
        } else if (arg1 == 249) {
            int var12 = arg0.method2396((byte) -106);
            if (this.field6638 == null) {
                int var13 = class783.method4337(var12, (byte) 64);
                this.field6638 = new class362(var13);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                boolean var15 = arg0.method2396((byte) -124) == 1;
                int var16 = arg0.method2358(arg2 + 65632);
                class379 var17;
                if (var15) {
                    var17 = new class562(arg0.method2384(arg2 ^ 0xE6DD));
                } else {
                    var17 = new class365(arg0.method2381((byte) 31));
                }
                this.field6638.method2112(var17, (byte) 6, (long) var16);
            }
        }
        field6671++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Laaa;IIIIBILha;Lgfa;[ILjf;ILbh;ILfs;I[Lhb;Lfs;)Lka;", line = 767)
    public final class498 method2850(class644 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class66 arg7, class782 arg8, int[] arg9, class229 arg10, int arg11, class40 arg12, int arg13, class582 arg14, int arg15, class756[] arg16, class582 arg17) {
        field6670++;
        if (this.field6636 != null) {
            class479 var19 = this.method2843(arg12, 228);
            return var19 == null ? null : var19.method2850(arg0, arg1, arg2, arg3, arg4, (byte) 32, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
        }
        int var20 = arg13;
        if (this.field6678 != 128) {
            var20 = arg13 | 0x2;
        }
        if (this.field6683 != 128) {
            var20 |= 0x5;
        }
        boolean var21 = arg14 != null || arg17 != null;
        boolean var22 = false;
        boolean var23 = false;
        boolean var24 = false;
        boolean var25 = false;
        int var26 = arg16 == null ? 0 : arg16.length;
        for (int var27 = 0; var27 < var26; var27++) {
            class2.field34[var27] = null;
            if (arg16[var27] != null) {
                class582 var28 = arg0.method3600(-57, arg16[var27].field10471);
                if (var28.field7955 != null) {
                    var21 = true;
                    client.field3924[var27] = var28;
                    int var29 = arg16[var27].field10473;
                    int var30 = arg16[var27].field10467;
                    int var31 = var28.field7955[var29];
                    class2.field34[var27] = arg0.method3602(var31 >>> 16, (byte) -126);
                    int var32 = var31 & 0xFFFF;
                    class442.field5930[var27] = var32;
                    if (class2.field34[var27] != null) {
                        var23 |= class2.field34[var27].method1998(var32, (byte) 17);
                        var22 |= class2.field34[var27].method2001(var32, 7402);
                        var25 |= class2.field34[var27].method1997(var32, true);
                        var24 |= var28.field7940;
                    }
                    if ((var28.field7932 || class688.field9381) && var30 != -1 && var30 < var28.field7955.length) {
                        class451.field6378[var27] = var28.field7936[var29];
                        class631.field8615[var27] = arg16[var27].field10470;
                        int var33 = var28.field7955[var30];
                        class180.field2206[var27] = arg0.method3602(var33 >>> 16, (byte) -65);
                        int var34 = var33 & 0xFFFF;
                        class179.field2197[var27] = var34;
                        if (class180.field2206[var27] != null) {
                            var23 |= class180.field2206[var27].method1998(var34, (byte) 17);
                            var22 |= class180.field2206[var27].method2001(var34, 7402);
                            var25 |= class180.field2206[var27].method1997(var34, true);
                        }
                    } else {
                        class451.field6378[var27] = 0;
                        class631.field8615[var27] = 0;
                        class180.field2206[var27] = null;
                        class179.field2197[var27] = -1;
                    }
                }
            }
        }
        int var35 = -1;
        int var36 = -1;
        int var37 = 35 % ((-arg5 - 31) / 47);
        int var38 = 0;
        class338 var39 = null;
        class338 var40 = null;
        int var41 = -1;
        int var42 = -1;
        int var43 = 0;
        class338 var44 = null;
        class338 var45 = null;
        if (var21) {
            var20 |= 0x20;
            if (arg14 != null) {
                int var46 = arg14.field7955[arg3];
                int var47 = var46 >>> 16;
                var39 = arg0.method3602(var47, (byte) -53);
                var35 = var46 & 0xFFFF;
                if (var39 != null) {
                    var23 |= var39.method1998(var35, (byte) 17);
                    var22 |= var39.method2001(var35, 7402);
                    var25 |= var39.method1997(var35, true);
                    var24 |= arg14.field7940;
                }
                if ((arg14.field7932 || class688.field9381) && arg2 != -1 && arg14.field7955.length > arg2) {
                    int var48 = arg14.field7955[arg2];
                    var38 = arg14.field7936[arg3];
                    int var49 = var48 >>> 16;
                    if (var47 == var49) {
                        var40 = var39;
                    } else {
                        var40 = arg0.method3602(var49, (byte) -101);
                    }
                    var36 = var48 & 0xFFFF;
                    if (var40 != null) {
                        var23 |= var40.method1998(var36, (byte) 17);
                        var22 |= var40.method2001(var36, 7402);
                        var25 |= var40.method1997(var36, true);
                    }
                }
            }
            if (arg17 != null) {
                int var50 = arg17.field7955[arg15];
                int var51 = var50 >>> 16;
                var41 = var50 & 0xFFFF;
                var44 = arg0.method3602(var51, (byte) -104);
                if (var44 != null) {
                    var23 |= var44.method1998(var41, (byte) 17);
                    var22 |= var44.method2001(var41, 7402);
                    var25 |= var44.method1997(var41, true);
                    var24 |= arg17.field7940;
                }
                if ((arg17.field7932 || class688.field9381) && arg1 != -1 && arg17.field7955.length > arg1) {
                    int var52 = arg17.field7955[arg1];
                    var43 = arg17.field7936[arg15];
                    int var53 = var52 >>> 16;
                    var42 = var52 & 0xFFFF;
                    if (var51 == var53) {
                        var45 = var44;
                    } else {
                        var45 = arg0.method3602(var53, (byte) -112);
                    }
                    if (var45 != null) {
                        var23 |= var45.method1998(var42, (byte) 17);
                        var22 |= var45.method2001(var42, 7402);
                        var25 |= var45.method1997(var42, true);
                    }
                }
            }
            if (var23) {
                var20 |= 0x80;
            }
            if (var22) {
                var20 |= 0x100;
            }
            if (var24) {
                var20 |= 0x200;
            }
            if (var25) {
                var20 |= 0x400;
            }
        }
        long var54 = (long) (this.field6680 | arg7.field904 << 16);
        if (arg8 != null) {
            var54 |= arg8.field10793 << 24;
        }
        class288 var56 = this.field6692.field1857;
        class498 var57;
        synchronized (this.field6692.field1857) {
            var57 = (class498) this.field6692.field1857.method1684(var54, -359);
        }
        class15 var58 = null;
        if (this.field6681 != -1) {
            var58 = arg10.method1415((byte) 50, this.field6681);
        }
        if (var57 == null || (var57.method396() & var20) != var20) {
            if (var57 != null) {
                var20 |= var57.method396();
            }
            int var59 = var20;
            int[] var60 = arg8 == null || arg8.field10791 == null ? this.field6701 : arg8.field10791;
            boolean var61 = false;
            class48 var62 = this.field6692.field1840;
            synchronized (this.field6692.field1840) {
                for (int var63 = 0; var63 < var60.length; var63++) {
                    if (var60[var63] != -1 && !this.field6692.field1840.method443(0, var60[var63], true)) {
                        var61 = true;
                    }
                }
            }
            if (var61) {
                return null;
            }
            class496[] var64 = new class496[var60.length];
            for (int var65 = 0; var65 < var60.length; var65++) {
                if (var60[var65] != -1) {
                    class48 var66 = this.field6692.field1840;
                    synchronized (this.field6692.field1840) {
                        var64[var65] = class748.method4177(var60[var65], 0, this.field6692.field1840, 4);
                    }
                    if (var64[var65] != null) {
                        if (var64[var65].field6919 < 13) {
                            var64[var65].method2934(-111, 2);
                        }
                        if (this.field6653 != null && this.field6653[var65] != null) {
                            var64[var65].method2926(this.field6653[var65][0], (byte) -39, this.field6653[var65][2], this.field6653[var65][1]);
                        }
                    }
                }
            }
            if (var58 != null && var58.field279 != null) {
                for (int var67 = 0; var67 < var58.field279.length; var67++) {
                    if (var67 < var64.length && var64[var67] != null) {
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        if (var58.field279[var67] != null) {
                            var68 = var58.field279[var67][0];
                            var70 = var58.field279[var67][2];
                            var73 = var58.field279[var67][5] << 3;
                            var71 = var58.field279[var67][3] << 3;
                            var72 = var58.field279[var67][4] << 3;
                            var69 = var58.field279[var67][1];
                        }
                        if (var71 != 0 || var72 != 0 || var73 != 0) {
                            var64[var67].method2918(0, var73, var72, var71);
                        }
                        if (var68 != 0 || var69 != 0 || var70 != 0) {
                            var64[var67].method2926(var68, (byte) -39, var70, var69);
                        }
                    }
                }
            }
            class496 var74;
            if (var64.length == 1) {
                var74 = var64[0];
            } else {
                var74 = new class496(var64, var64.length);
            }
            if (this.field6637 != null) {
                var59 = var20 | 0x4000;
            }
            if (this.field6675 != null) {
                var59 |= 0x8000;
            }
            if (this.field6707 != 0) {
                var59 |= 0x80000;
            }
            var57 = arg7.method567(var74, var59, this.field6692.field1859, this.field6705 + 64, this.field6657 + 850);
            if (this.field6637 != null) {
                short[] var75;
                if (arg8 == null || arg8.field10792 == null) {
                    var75 = this.field6655;
                } else {
                    var75 = arg8.field10792;
                }
                for (int var76 = 0; var76 < this.field6637.length; var76++) {
                    if (this.field6640 == null || this.field6640.length <= var76) {
                        var57.method402(this.field6637[var76], var75[var76]);
                    } else {
                        var57.method402(this.field6637[var76], class464.field6501[this.field6640[var76] & 0xFF]);
                    }
                }
            }
            if (this.field6675 != null) {
                short[] var77;
                if (arg8 == null || arg8.field10787 == null) {
                    var77 = this.field6690;
                } else {
                    var77 = arg8.field10787;
                }
                for (int var78 = 0; var78 < this.field6675.length; var78++) {
                    var57.method399(this.field6675[var78], var77[var78]);
                }
            }
            if (this.field6707 != 0) {
                var57.method382(this.field6651, this.field6650, this.field6659, this.field6707 & 0xFF);
            }
            var57.method378(var20);
            class288 var79 = this.field6692.field1857;
            synchronized (this.field6692.field1857) {
                this.field6692.field1857.method1686(-25638, var54, var57);
            }
        }
        class498 var80 = var57.method364((byte) 4, var20, true);
        boolean var81 = false;
        if (arg9 != null) {
            for (int var82 = 0; var82 < 12; var82++) {
                if (arg9[var82] != -1) {
                    var81 = true;
                }
            }
        }
        if (!var21 && !var81) {
            return var80;
        }
        class778[] var83 = null;
        if (var58 != null) {
            var83 = var58.method198(arg7, -32);
        }
        if (var81 && var83 != null) {
            for (int var84 = 0; var84 < 12; var84++) {
                if (var83[var84] != null) {
                    var80.method390(var83[var84], 0x1 << var84, true);
                }
            }
        }
        int var85 = 0;
        int var86 = 1;
        while (var26 > var85) {
            if (class2.field34[var85] != null) {
                var80.method2946(class442.field5930[var85], class179.field2197[var85], class451.field6378[var85], 0, var86, class631.field8615[var85] - 1, client.field3924[var85].field7940, class180.field2206[var85], null, 0, class2.field34[var85]);
            }
            var85++;
            var86 <<= 0x1;
        }
        if (var81) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (arg9[var87] != -1) {
                    int var88 = arg9[var87] - arg11;
                    int var89 = var88 & 0x3FFF;
                    class778 var90 = arg7.method614();
                    var90.method139(var89);
                    var80.method390(var90, 0x1 << var87, false);
                }
            }
        }
        if (var81 && var83 != null) {
            for (int var91 = 0; var91 < 12; var91++) {
                if (var83[var91] != null) {
                    var80.method390(var83[var91], 0x1 << var91, false);
                }
            }
        }
        if (var39 != null && var44 != null) {
            var80.method2945(var38, var42, var43, var39, arg6 - 1, var41, arg4 - 1, arg14.field7940 | arg17.field7940, var44, var35, var45, var40, var36, 0, arg14.field7951);
        } else if (var39 != null) {
            var80.method2944(var35, var38, var40, arg14.field7940, -109, arg6 - 1, var39, 0, var36);
        } else if (var44 != null) {
            var80.method2944(var41, var43, var45, arg17.field7940, 13, arg4 - 1, var44, 0, var42);
        }
        for (int var92 = 0; var92 < var26; var92++) {
            class2.field34[var92] = null;
            class180.field2206[var92] = null;
            client.field3924[var92] = null;
        }
        if (this.field6683 != 128 || this.field6678 != 128) {
            var80.method357(this.field6683, this.field6678, this.field6683);
        }
        var80.method378(arg13);
        return var80;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbh;Lgfa;ILaaa;ILha;Lfs;III)Lka;", line = 1392)
    public final class498 method2851(class40 arg0, class782 arg1, int arg2, class644 arg3, int arg4, class66 arg5, class582 arg6, int arg7, int arg8, int arg9) {
        field6685++;
        if (this.field6636 != null) {
            class479 var11 = this.method2843(arg0, 228);
            return var11 == null ? null : var11.method2851(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        } else if (this.field6665 == null && (arg1 == null || arg1.field10791 == null)) {
            return null;
        } else {
            int var12 = arg8;
            if (arg7 != 100) {
                this.field6646 = -113;
            }
            if (arg6 != null && arg2 != -1) {
                var12 = arg8 | arg6.method3352(arg4, true, arg2, true);
            }
            long var13 = (long) (arg5.field904 << 16 | this.field6680);
            if (arg1 != null) {
                var13 |= arg1.field10793 << 24;
            }
            class288 var15 = this.field6692.field1858;
            class498 var16;
            synchronized (this.field6692.field1858) {
                var16 = (class498) this.field6692.field1858.method1684(var13, arg7 ^ 0xFFFFFEFD);
            }
            if (var16 == null || (var12 & var16.method396()) != var12) {
                if (var16 != null) {
                    var12 |= var16.method396();
                }
                int var17 = var12;
                int[] var18 = arg1 == null || arg1.field10791 == null ? this.field6665 : arg1.field10791;
                boolean var19 = false;
                class48 var20 = this.field6692.field1840;
                synchronized (this.field6692.field1840) {
                    int var21 = 0;
                    while (true) {
                        if (var21 >= var18.length) {
                            break;
                        }
                        if (!this.field6692.field1840.method443(0, var18[var21], true)) {
                            var19 = true;
                        }
                        var21++;
                    }
                }
                if (var19) {
                    return null;
                }
                class496[] var22 = new class496[var18.length];
                class48 var23 = this.field6692.field1840;
                synchronized (this.field6692.field1840) {
                    int var24 = 0;
                    while (true) {
                        if (var18.length <= var24) {
                            break;
                        }
                        var22[var24] = class748.method4177(var18[var24], 0, this.field6692.field1840, 4);
                        var24++;
                    }
                }
                for (int var25 = 0; var25 < var18.length; var25++) {
                    if (var22[var25] != null && var22[var25].field6919 < 13) {
                        var22[var25].method2934(105, 2);
                    }
                }
                class496 var26;
                if (var22.length == 1) {
                    var26 = var22[0];
                } else {
                    var26 = new class496(var22, var22.length);
                }
                if (this.field6637 != null) {
                    var17 = var12 | 0x4000;
                }
                if (this.field6675 != null) {
                    var17 |= 0x8000;
                }
                if (this.field6707 != 0) {
                    var17 |= 0x80000;
                }
                var16 = arg5.method567(var26, var17, this.field6692.field1859, 64, 768);
                if (this.field6637 != null) {
                    short[] var27;
                    if (arg1 == null || arg1.field10792 == null) {
                        var27 = this.field6655;
                    } else {
                        var27 = arg1.field10792;
                    }
                    for (int var28 = 0; var28 < this.field6637.length; var28++) {
                        if (this.field6640 == null || this.field6640.length <= var28) {
                            var16.method402(this.field6637[var28], var27[var28]);
                        } else {
                            var16.method402(this.field6637[var28], class464.field6501[this.field6640[var28] & 0xFF]);
                        }
                    }
                }
                if (this.field6675 != null) {
                    short[] var29;
                    if (arg1 == null || arg1.field10787 == null) {
                        var29 = this.field6690;
                    } else {
                        var29 = arg1.field10787;
                    }
                    for (int var30 = 0; var30 < this.field6675.length; var30++) {
                        var16.method399(this.field6675[var30], var29[var30]);
                    }
                }
                if (this.field6707 != 0) {
                    var16.method382(this.field6651, this.field6650, this.field6659, this.field6707 & 0xFF);
                }
                var16.method378(var12);
                class288 var31 = this.field6692.field1858;
                synchronized (this.field6692.field1858) {
                    this.field6692.field1858.method1686(-25638, var13, var16);
                }
            }
            if (arg6 != null && arg2 != -1) {
                var16 = arg6.method3351(var12, arg2, arg9, var16, arg4, (byte) 97);
            }
            var16.method378(arg8);
            return var16;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 1563)
    public final int method2852(int arg0, int arg1, int arg2) {
        field6703++;
        if (this.field6638 == null) {
            return arg1;
        }
        class365 var4 = (class365) this.field6638.method2121(93, (long) arg0);
        if (arg2 == 255) {
            return var4 == null ? arg1 : var4.field4537;
        } else {
            return 7;
        }
    }
}
