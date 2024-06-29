import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class69 {

    @OriginalMember(owner = "client!mia", name = "q", descriptor = "I")
    public int field926 = -1;

    @OriginalMember(owner = "client!mia", name = "F", descriptor = "I")
    public int field941 = -1;

    @OriginalMember(owner = "client!mia", name = "A", descriptor = "I")
    public int field936 = 0;

    @OriginalMember(owner = "client!mia", name = "u", descriptor = "Ljava/lang/String;")
    public String field930 = null;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "Lke;")
    public static class622 field914 = new class622(110, 7);

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "B")
    public byte field910;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "B")
    public byte field911;

    @OriginalMember(owner = "client!mia", name = "y", descriptor = "B")
    public byte field934;

    @OriginalMember(owner = "client!mia", name = "K", descriptor = "B")
    public byte field946;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!mia", name = "p", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mia", name = "r", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!mia", name = "s", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!mia", name = "t", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!mia", name = "v", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!mia", name = "w", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!mia", name = "x", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!mia", name = "C", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!mia", name = "G", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!mia", name = "I", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!mia", name = "J", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!mia", name = "L", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!mia", name = "N", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!mia", name = "O", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!mia", name = "P", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!mia", name = "S", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!mia", name = "T", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!mia", name = "H", descriptor = "J")
    public long field943;

    @OriginalMember(owner = "client!mia", name = "l", descriptor = "Ltga;")
    private class64 field921;

    @OriginalMember(owner = "client!mia", name = "o", descriptor = "Z")
    private boolean field924;

    @OriginalMember(owner = "client!mia", name = "B", descriptor = "Z")
    public boolean field937;

    @OriginalMember(owner = "client!mia", name = "E", descriptor = "Z")
    private boolean field940;

    @OriginalMember(owner = "client!mia", name = "R", descriptor = "[B")
    public byte[] field953;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "client!mia", name = "D", descriptor = "[I")
    private int[] field939;

    @OriginalMember(owner = "client!mia", name = "m", descriptor = "[J")
    private long[] field922;

    @OriginalMember(owner = "client!mia", name = "Q", descriptor = "[J")
    private long[] field952;

    @OriginalMember(owner = "client!mia", name = "n", descriptor = "[Ljava/lang/String;")
    public String[] field923;

    @OriginalMember(owner = "client!mia", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field948;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)I", line = 7)
    public final int method534(int arg0, String arg1) {
        field919++;
        if (arg0 != -3296) {
            return 15;
        } else if (arg1 == null || arg1.length() == 0) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field955; var3++) {
                if (this.field948[var3].equals(arg1)) {
                    return var3;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(II)V", line = 38)
    public final void method535(int arg0, int arg1) {
        field933++;
        this.field917--;
        if (~this.field917 == arg1) {
            this.field952 = null;
            this.field923 = null;
            return;
        }
        if (this.field952 != null) {
            class42.method292(this.field952, arg0 + 1, this.field952, arg0, this.field917 - arg0);
        }
        if (this.field923 != null) {
            class42.method291(this.field923, arg0 + 1, this.field923, arg0, this.field917 - arg0);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIII)V", line = 66)
    public static final void method536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 23593) {
            method537(103);
        }
        field938++;
        class678 var5 = class630.method3597(29636, 10, (long) arg3);
        var5.method3834((byte) -114);
        var5.field9651 = arg4;
        var5.field9649 = arg1;
        var5.field9639 = arg0;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V", line = 88)
    public static void method537(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            method537(-38);
        }
        field914 = null;
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(IIIII)I", line = 101)
    public final int method538(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field951++;
        if (arg1 < 84) {
            return 78;
        }
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var8 = var6 ^ var7;
        int var9 = arg2 << arg4;
        int var10 = var9 & var8;
        int var11 = this.field918[arg0];
        if ((var8 & var11) == var10) {
            return -1;
        } else {
            int var12 = var11 & ~var8;
            this.field918[arg0] = class281.method1904(var10, var12);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(II)V", line = 132)
    private final void method539(int arg0, int arg1) {
        field944++;
        if (this.field940) {
            if (this.field922 == null) {
                this.field922 = new long[arg0];
            } else {
                class42.method292(this.field922, 0, this.field922 = new long[arg0], 0, this.field955);
            }
        }
        if (this.field924) {
            if (this.field948 == null) {
                this.field948 = new String[arg0];
            } else {
                class42.method291(this.field948, 0, this.field948 = new String[arg0], 0, this.field955);
            }
        }
        if (this.field953 == null) {
            this.field953 = new byte[arg0];
        } else {
            class42.method288(this.field953, 0, this.field953 = new byte[arg0], 0, this.field955);
        }
        if (arg1 != 0) {
            this.method547((byte) -27, 8);
        }
        if (this.field918 == null) {
            this.field918 = new int[arg0];
        } else {
            class42.method289(this.field918, 0, this.field918 = new int[arg0], 0, this.field955);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZII)Ljava/lang/Integer;", line = 173)
    public final Integer method540(int arg0, boolean arg1, int arg2, int arg3) {
        field947++;
        if (this.field921 == null) {
            return null;
        }
        if (!arg1) {
            this.field936 = -42;
        }
        class540 var5 = this.field921.method380((byte) -3, (long) arg3);
        if (var5 != null && var5 instanceof class633) {
            int var6 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
            return Integer.valueOf((((class633) var5).field8932 & var6) >>> arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;J)V", line = 196)
    public final void method541(int arg0, String arg1, long arg2) {
        field927++;
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 != -32) {
            this.method543(33, -40, -121, -46);
        }
        if (arg2 > 0L != this.field940) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field940 + " but userhash:" + arg2);
        } else if (this.field924 == (arg1 != null)) {
            if (arg2 > 0L && (this.field922 == null || this.field922.length <= this.field955) || arg1 != null && (this.field948 == null || this.field955 >= this.field948.length)) {
                this.method539(this.field955 + 5, 0);
            }
            if (this.field922 != null) {
                this.field922[this.field955] = arg2;
            }
            if (this.field948 != null) {
                this.field948[this.field955] = arg1;
            }
            if (this.field941 == -1) {
                this.field941 = this.field955;
                this.field953[this.field955] = 126;
            } else {
                this.field953[this.field955] = 0;
            }
            this.field918[this.field955] = 0;
            this.field939 = null;
            this.field955++;
        } else {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field924 + " but displayname:" + arg1);
        }
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(II)V", line = 241)
    private final void method542(int arg0, int arg1) {
        if (this.field940) {
            if (this.field952 == null) {
                this.field952 = new long[arg0];
            } else {
                class42.method292(this.field952, 0, this.field952 = new long[arg0], 0, this.field917);
            }
        }
        if (arg1 != -23369) {
            return;
        }
        field950++;
        if (!this.field924) {
            return;
        }
        if (this.field923 == null) {
            this.field923 = new String[arg0];
        } else {
            class42.method291(this.field923, 0, this.field923 = new String[arg0], 0, this.field917);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIII)I", line = 278)
    public final int method543(int arg0, int arg1, int arg2, int arg3) {
        field920++;
        if (arg0 != -29318) {
            this.method535(57, -97);
        }
        int var5 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
        return (this.field918[arg2] & var5) >>> arg3;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIJ)Z", line = 293)
    public final boolean method544(int arg0, int arg1, long arg2) {
        field912++;
        if (this.field921 == null) {
            this.field921 = new class64(4);
        } else {
            class540 var5 = this.field921.method380((byte) -3, (long) arg1);
            if (var5 != null) {
                if (var5 instanceof class30) {
                    class30 var6 = (class30) var5;
                    if (var6.field413 == arg2) {
                        return false;
                    }
                    var6.field413 = arg2;
                    return true;
                }
                var5.method3117((byte) 38);
            }
        }
        if (arg0 == -18121) {
            this.field921.method384((long) arg1, new class30(arg2), false);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lrv;)V", line = 899)
    public class69(class120 arg0) {
        this.method550(arg0, (byte) -59);
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V", line = 907)
    private class69() {
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)Z", line = 341)
    public final boolean method545(int arg0, int arg1, int arg2) {
        field925++;
        if (this.field921 == null) {
            this.field921 = new class64(4);
        } else {
            class540 var4 = this.field921.method380((byte) -3, (long) arg0);
            if (var4 != null) {
                if (var4 instanceof class633) {
                    class633 var5 = (class633) var4;
                    if (var5.field8932 == arg2) {
                        return false;
                    }
                    var5.field8932 = arg2;
                    return true;
                }
                var4.method3117((byte) -125);
            }
        }
        if (arg1 != 4) {
            field932 = 73;
        }
        this.field921.method384((long) arg0, new class633(arg2), false);
        return true;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IILjava/lang/String;)Z", line = 380)
    public final boolean method546(int arg0, int arg1, String arg2) {
        if (arg2 == null) {
            arg2 = "";
        } else if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        if (arg0 > -2) {
            return false;
        }
        field935++;
        if (this.field921 == null) {
            this.field921 = new class64(4);
        } else {
            class540 var4 = this.field921.method380((byte) -3, (long) arg1);
            if (var4 != null) {
                if (var4 instanceof class533) {
                    class533 var5 = (class533) var4;
                    if (var5.field7530.equals(arg2)) {
                        return false;
                    }
                    var5.field7530 = arg2;
                    return true;
                }
                var4.method3117((byte) -111);
            }
        }
        this.field921.method384((long) arg1, new class533(arg2), false);
        return true;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BI)Ljava/lang/Long;", line = 426)
    public final Long method547(byte arg0, int arg1) {
        field913++;
        if (this.field921 == null) {
            return null;
        }
        class540 var3 = this.field921.method380((byte) -3, (long) arg1);
        if (var3 != null && var3 instanceof class30) {
            int var4 = -33 / ((arg0 + 34) / 56);
            return Long.valueOf(((class30) var3).field413);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BBI)I", line = 447)
    public final int method548(byte arg0, byte arg1, int arg2) {
        field929++;
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field941 == arg2 && (this.field926 == -1 || this.field953[this.field926] < 125)) {
            return -1;
        } else if (this.field953[arg2] == arg1) {
            return -1;
        } else {
            this.field953[arg2] = arg1;
            int var4 = 93 % ((arg0 + 52) / 57);
            this.method549(-1);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V", line = 470)
    private final void method549(int arg0) {
        field928++;
        if (this.field955 == 0) {
            this.field941 = -1;
            this.field926 = -1;
            return;
        }
        this.field941 = arg0;
        this.field926 = -1;
        int var2 = 0;
        byte var3 = this.field953[0];
        for (int var4 = 1; var4 < this.field955; var4++) {
            if (var3 < this.field953[var4]) {
                if (var3 == 125) {
                    this.field926 = var2;
                }
                var3 = this.field953[var4];
                var2 = var4;
            } else if (this.field926 == -1 && this.field953[var4] == 125) {
                this.field926 = var4;
            }
        }
        this.field941 = var2;
        if (this.field941 != -1) {
            this.field953[this.field941] = 126;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lrv;B)V", line = 537)
    private final void method550(class120 arg0, byte arg1) {
        field942++;
        int var3 = arg0.method842(2384);
        if (var3 < 1 || var3 > 3) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg0.method842(2384);
        if (arg1 != -59) {
            this.method542(20, -5);
        }
        if ((var4 & 0x2) != 0) {
            this.field924 = true;
        }
        if ((var4 & 0x1) != 0) {
            this.field940 = true;
        }
        if (!this.field940) {
            this.field952 = null;
            this.field922 = null;
        }
        if (!this.field924) {
            this.field923 = null;
            this.field948 = null;
        }
        this.field936 = arg0.method871(23995);
        arg0.method871(23995);
        this.field955 = arg0.method898((byte) -94);
        this.field917 = arg0.method842(2384);
        this.field930 = arg0.method861(true);
        this.field937 = arg0.method842(arg1 ^ 0xFFFFF695) == 1;
        this.field934 = arg0.method877(-252);
        this.field911 = arg0.method877(-252);
        this.field910 = arg0.method877(-252);
        this.field946 = arg0.method877(-252);
        if (this.field955 > 0) {
            if (this.field940 && (this.field922 == null || this.field922.length < this.field955)) {
                this.field922 = new long[this.field955];
            }
            if (this.field924 && (this.field948 == null || this.field955 > this.field948.length)) {
                this.field948 = new String[this.field955];
            }
            if (this.field953 == null || this.field953.length < this.field955) {
                this.field953 = new byte[this.field955];
            }
            if (this.field918 == null || this.field918.length < this.field955) {
                this.field918 = new int[this.field955];
            }
            for (int var5 = 0; var5 < this.field955; var5++) {
                if (this.field940) {
                    this.field922[var5] = arg0.method834(-8616);
                }
                if (this.field924) {
                    this.field948[var5] = arg0.method891(arg1 + 18599);
                }
                this.field953[var5] = arg0.method877(-252);
                if (var3 >= 2) {
                    this.field918[var5] = arg0.method871(23995);
                }
            }
            this.method549(-1);
        }
        if (this.field917 > 0) {
            if (this.field940 && (this.field952 == null || this.field952.length < this.field917)) {
                this.field952 = new long[this.field917];
            }
            if (this.field924 && (this.field923 == null || this.field917 > this.field923.length)) {
                this.field923 = new String[this.field917];
            }
            for (int var6 = 0; var6 < this.field917; var6++) {
                if (this.field940) {
                    this.field952[var6] = arg0.method834(-8616);
                }
                if (this.field924) {
                    this.field923[var6] = arg0.method891(class470.method2786(arg1, -18519));
                }
            }
        }
        if (var3 < 3) {
            return;
        }
        int var7 = arg0.method898((byte) -97);
        if (var7 <= 0) {
            return;
        }
        this.field921 = new class64(var7 >= 16 ? 16 : class89.method631((byte) 67, var7));
        while (var7-- > 0) {
            int var8 = arg0.method871(23995);
            int var9 = var8 & 0x3FFFFFFF;
            int var10 = var8 >>> 30;
            if (var10 == 0) {
                int var11 = arg0.method871(23995);
                this.field921.method384((long) var9, new class633(var11), false);
            } else if (var10 == 1) {
                long var13 = arg0.method834(arg1 ^ 0x219D);
                this.field921.method384((long) var9, new class30(var13), false);
            } else if (var10 == 2) {
                String var12 = arg0.method861(true);
                this.field921.method384((long) var9, new class533(var12), false);
            }
        }
        return;
    }

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "(II)V", line = 698)
    public final void method551(int arg0, int arg1) {
        field931++;
        if (arg0 < arg1 || arg0 >= this.field955) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.field955);
        }
        this.field939 = null;
        this.field955--;
        if (this.field955 == 0) {
            this.field922 = null;
            this.field948 = null;
            this.field941 = -1;
            this.field953 = null;
            this.field926 = -1;
            this.field918 = null;
            return;
        }
        class42.method288(this.field953, arg0 + 1, this.field953, arg0, this.field955 - arg0);
        class42.method289(this.field918, arg0 + 1, this.field918, arg0, this.field955 - arg0);
        if (this.field922 != null) {
            class42.method292(this.field922, arg0 + 1, this.field922, arg0, this.field955 - arg0);
        }
        if (this.field948 != null) {
            class42.method291(this.field948, arg0 + 1, this.field948, arg0, this.field955 - arg0);
        }
        if (this.field941 == arg0 || this.field926 == arg0) {
            this.method549(-1);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)[I", line = 738)
    public final int[] method552(byte arg0) {
        if (arg0 != -110) {
            this.field922 = null;
        }
        field949++;
        if (this.field939 == null) {
            String[] var2 = new String[this.field955];
            this.field939 = new int[this.field955];
            int var3 = 0;
            while (var3 < this.field955) {
                var2[var3] = this.field948[var3];
                this.field939[var3] = var3++;
            }
            class715.method4042(this.field939, -121, var2);
        }
        return this.field939;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIBII)Z", line = 768)
    public final boolean method553(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field916++;
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var8 = arg1 << arg4;
        if (arg2 < 54) {
            return true;
        }
        int var9 = var7 ^ var6;
        int var10 = var8 & var9;
        if (this.field921 == null) {
            this.field921 = new class64(4);
        } else {
            class540 var11 = this.field921.method380((byte) -3, (long) arg0);
            if (var11 != null) {
                if (var11 instanceof class633) {
                    class633 var12 = (class633) var11;
                    if ((var9 & var12.field8932) == var10) {
                        return false;
                    }
                    var12.field8932 &= ~var9;
                    var12.field8932 |= var10;
                    return true;
                }
                var11.method3117((byte) 104);
            }
        }
        this.field921.method384((long) arg0, new class633(var10), false);
        return true;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Ljava/lang/String;JI)V", line = 814)
    public final void method554(String arg0, long arg1, int arg2) {
        if (arg0 != null && arg0.length() == 0) {
            arg0 = null;
        }
        field945++;
        if (arg2 != 25694) {
            this.method550(null, (byte) 124);
        }
        if (arg1 <= 0L == this.field940) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field940 + " but userhash:" + arg1);
        } else if (this.field924 == (arg0 != null)) {
            if (arg1 > 0L && (this.field952 == null || this.field952.length <= this.field917) || arg0 != null && (this.field923 == null || this.field917 >= this.field923.length)) {
                this.method542(this.field917 + 5, -23369);
            }
            if (this.field952 != null) {
                this.field952[this.field917] = arg1;
            }
            if (this.field923 != null) {
                this.field923[this.field917] = arg0;
            }
            this.field917++;
        } else {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field924 + " but displayname:" + arg0);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IB)Ljava/lang/Integer;", line = 851)
    public final Integer method555(int arg0, byte arg1) {
        field954++;
        if (this.field921 == null) {
            return null;
        }
        class540 var3 = this.field921.method380((byte) -3, (long) arg0);
        if (arg1 >= -38) {
            this.field926 = 38;
        }
        return var3 != null && var3 instanceof class633 ? Integer.valueOf(((class633) var3).field8932) : null;
    }

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "(II)Ljava/lang/String;", line = 875)
    public final String method556(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field955 = 106;
        }
        field915++;
        if (this.field921 == null) {
            return null;
        } else {
            class540 var3 = this.field921.method380((byte) -3, (long) arg0);
            return var3 != null && var3 instanceof class533 ? ((class533) var3).field7530 : null;
        }
    }
}
