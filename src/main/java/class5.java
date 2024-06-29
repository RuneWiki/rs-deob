import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class5 {

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public int field84 = 0;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public int field92 = -1;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public int field82 = -1;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public int field80 = -1;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public int field94 = -1;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field95 = 0;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field93 = -1;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public int field90 = -1;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public int field81 = -1;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public int field78 = 0;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public int field106 = -1;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public int field104 = -1;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public int field107 = 0;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public int field89 = -1;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public int field101 = -1;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public int field102 = -1;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public int field100 = 0;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public int field103 = -1;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public int field88 = -1;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public int field99 = -1;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public int field108 = 0;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public int field109 = -1;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public int field112 = 0;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public int field97 = -1;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public int field85 = -1;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public int field105 = 0;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public int field98 = -1;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public int field114 = -1;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public int field113 = -1;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public int field86 = 0;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public int field91 = -1;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public int field110 = -1;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public int field115 = 0;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "[J")
    public static long[] field111 = new long[1000];

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
    public static boolean field87 = false;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "[[I")
    public int[][] field77;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 33)
    public static void method40(int arg0) {
        if (arg0 != 0) {
            method40(83);
        }
        field111 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 49)
    public final void method41(byte arg0) {
        if (arg0 == 82) {
            field83++;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLoe;)V", line = 88)
    public final void method42(byte arg0, class146 arg1) {
        field96++;
        while (true) {
            int var3 = arg1.method1005((byte) 122);
            if (var3 == 0) {
                if (arg0 >= -23) {
                    this.method43((class146) null, -111, 39);
                }
                return;
            }
            this.method43(arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Loe;II)V", line = 172)
    private final void method43(class146 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field106 = arg0.method989(93);
            this.field90 = arg0.method989(102);
            if (this.field90 == 65535) {
                this.field90 = -1;
            }
            if (this.field106 == 65535) {
                this.field106 = -1;
            }
        } else if (arg1 == 2) {
            this.field82 = arg0.method989(107);
        } else if (arg1 == 3) {
            this.field103 = arg0.method989(104);
        } else if (arg1 == 4) {
            this.field113 = arg0.method989(arg2 ^ 0xFFFFFFB1);
        } else if (arg1 == 5) {
            this.field99 = arg0.method989(arg2 + 90);
        } else if (arg1 == 6) {
            this.field80 = arg0.method989(101);
        } else if (arg1 == 7) {
            this.field110 = arg0.method989(92);
        } else if (arg1 == 8) {
            this.field94 = arg0.method989(125);
        } else if (arg1 == 9) {
            this.field91 = arg0.method989(63);
        } else if (arg1 == 26) {
            this.field105 = (short) (arg0.method1005((byte) 122) * 4);
            this.field78 = (short) (arg0.method1005((byte) 122) * 4);
        } else if (arg1 == 27) {
            if (this.field77 == null) {
                this.field77 = new int[12][];
            }
            int var4 = arg0.method1005((byte) 122);
            this.field77[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field77[var4][var5] = arg0.method1050(arg2 + 4);
            }
        } else if (arg1 == 29) {
            this.field112 = arg0.method1005((byte) 122);
        } else if (arg1 == 30) {
            this.field86 = arg0.method989(61);
        } else if (arg1 == 31) {
            this.field100 = arg0.method1005((byte) 122);
        } else if (arg1 == 32) {
            this.field108 = arg0.method989(61);
        } else if (arg1 == 33) {
            this.field95 = arg0.method1050(arg2 ^ 0xFFFFFFFC);
        } else if (arg1 == 34) {
            this.field115 = arg0.method1005((byte) 122);
        } else if (arg1 == 35) {
            this.field107 = arg0.method989(125);
        } else if (arg1 == 36) {
            this.field84 = arg0.method1050(3);
        } else if (arg1 == 37) {
            this.field102 = arg0.method1005((byte) 122);
        } else if (arg1 == 38) {
            this.field97 = arg0.method989(111);
        } else if (arg1 == 39) {
            this.field85 = arg0.method989(77);
        } else if (arg1 == 40) {
            this.field98 = arg0.method989(60);
        } else if (arg1 == 41) {
            this.field89 = arg0.method989(arg2 ^ 0xFFFFFFB5);
        } else if (arg1 == 42) {
            this.field114 = arg0.method989(64);
        } else if (arg1 == 43) {
            arg0.method989(82);
        } else if (arg1 == 44) {
            arg0.method989(116);
        } else if (arg1 == 45) {
            this.field92 = arg0.method989(67);
        } else if (arg1 == 46) {
            this.field104 = arg0.method989(124);
        } else if (arg1 == 47) {
            this.field101 = arg0.method989(arg2 + 92);
        } else if (arg1 == 48) {
            this.field88 = arg0.method989(114);
        } else if (arg1 == 49) {
            this.field93 = arg0.method989(116);
        } else if (arg1 == 50) {
            this.field109 = arg0.method989(60);
        } else if (arg1 == 51) {
            this.field81 = arg0.method989(arg2 + 82);
        }
        field79++;
        if (arg2 != -1) {
            method40(17);
        }
    }
}
