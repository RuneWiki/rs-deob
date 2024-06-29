import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class403 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Z")
    public boolean field5644 = false;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Z")
    public boolean field5654 = false;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public int field5647 = -1;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public int field5657 = 99;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public int field5661 = -1;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "Z")
    public boolean field5664 = false;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public int field5659 = -1;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public int field5643 = -1;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public int field5660 = 2;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "Z")
    public boolean field5653 = false;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public int field5668 = 5;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public int field5669 = -1;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "J")
    public static volatile long field5670 = 0L;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public int field5658;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "Lnu;")
    public class549 field5671;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
    public int[] field5646;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "[I")
    private int[] field5649;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "[I")
    public int[] field5656;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "[I")
    public int[] field5663;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "[I")
    public int[] field5666;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "[I")
    public int[] field5667;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "[Z")
    public boolean[] field5652;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "[[I")
    public int[][] field5645;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBIILda;I)Lda;", line = 4)
    public final class55 method2349(int arg0, byte arg1, int arg2, int arg3, class55 arg4, int arg5) {
        if (arg1 != 105) {
            return null;
        }
        field5648++;
        int var7 = this.field5646[arg0];
        int var8 = this.field5667[arg0];
        class109 var9 = this.field5671.method3085(0, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method462((byte) 1, arg2, true);
        }
        class109 var11 = null;
        if ((this.field5644 || class553.field7458) && arg3 != -1 && arg3 < this.field5667.length) {
            int var12 = this.field5667[arg3];
            var11 = this.field5671.method3085(arg1 ^ 0x69, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class109 var13 = null;
        class109 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5649 != null) {
            if (this.field5649.length > arg0) {
                var15 = this.field5649[arg0];
                if (var15 != 65535) {
                    var13 = this.field5671.method3085(arg1 - 105, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5644 || class553.field7458) && arg3 != -1 && arg3 < this.field5649.length) {
                var16 = this.field5649[arg3];
                if (var16 != 65535) {
                    var14 = this.field5671.method3085(0, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5653) {
            arg2 |= 0x200;
        }
        if (var9.method784(var10, (byte) -8)) {
            arg2 |= 0x80;
        }
        if (var9.method785((byte) 98, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method788((byte) 120, var10)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method784(var15, (byte) -128)) {
                arg2 |= 0x80;
            }
            if (var13.method785((byte) 119, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method788((byte) 119, var15)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method784(arg3, (byte) -127)) {
                arg2 |= 0x80;
            }
            if (var11.method785((byte) 76, arg3)) {
                arg2 |= 0x100;
            }
            if (var11.method788((byte) 124, arg3)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method784(var16, (byte) -123)) {
                arg2 |= 0x80;
            }
            if (var14.method785((byte) 70, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method788((byte) 124, var16)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class55 var18 = arg4.method462((byte) 1, var17, true);
        var18.method428((byte) -102, var11, this.field5653, arg5 - 1, arg3, var10, var9, 0, var7);
        if (var13 != null) {
            var18.method428((byte) -73, var14, this.field5653, arg5 - 1, var16, var15, var13, 0, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lha;III[Z)V", line = 140)
    public static final void method2350(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class52.field606 == class409.field5812) {
            return;
        }
        int var5 = class497.field6766[arg1].method331(arg3, (byte) 50, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class37 var7 = class497.field6766[var6];
                if (var7 != null) {
                    var7.method329(arg0, arg2, var5 - var7.method331(arg3, (byte) 50, arg2), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZILac;)V", line = 168)
    private final void method2351(boolean arg0, int arg1, class501 arg2) {
        if (arg1 == 1) {
            int var16 = arg2.method2845(-1);
            this.field5646 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field5646[var17] = arg2.method2845(-1);
            }
            this.field5667 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field5667[var18] = arg2.method2845(-1);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field5667[var19] += arg2.method2845(-1) << 16;
            }
        } else if (arg1 == 2) {
            this.field5643 = arg2.method2845(-1);
        } else if (arg1 == 3) {
            this.field5652 = new boolean[256];
            int var14 = arg2.method2874((byte) -75);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field5652[arg2.method2874((byte) -75)] = true;
            }
        } else if (arg1 == 5) {
            this.field5668 = arg2.method2874((byte) -75);
        } else if (arg1 == 6) {
            this.field5669 = arg2.method2845(-1);
        } else if (arg1 == 7) {
            this.field5659 = arg2.method2845(-1);
        } else if (arg1 == 8) {
            this.field5657 = arg2.method2874((byte) -75);
        } else if (arg1 == 9) {
            this.field5661 = arg2.method2874((byte) -75);
        } else if (arg1 == 10) {
            this.field5647 = arg2.method2874((byte) -75);
        } else if (arg1 == 11) {
            this.field5660 = arg2.method2874((byte) -75);
        } else if (arg1 == 12) {
            int var11 = arg2.method2874((byte) -75);
            this.field5649 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field5649[var12] = arg2.method2845(-1);
            }
            for (int var13 = 0; var13 < var11; var13++) {
                this.field5649[var13] = (arg2.method2845(-1) << 16) + this.field5649[var13];
            }
        } else if (arg1 == 13) {
            int var7 = arg2.method2845(-1);
            this.field5645 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method2874((byte) -75);
                if (var9 > 0) {
                    this.field5645[var8] = new int[var9];
                    this.field5645[var8][0] = arg2.method2819((byte) 72);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field5645[var8][var10] = arg2.method2845(-1);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field5653 = true;
        } else if (arg1 == 15) {
            this.field5644 = true;
        } else if (arg1 == 16) {
            this.field5664 = true;
        } else if (arg1 == 18) {
            this.field5654 = true;
        } else if (arg1 == 19) {
            if (this.field5656 == null) {
                this.field5656 = new int[this.field5645.length];
                for (int var4 = 0; var4 < this.field5645.length; var4++) {
                    this.field5656[var4] = 255;
                }
            }
            this.field5656[arg2.method2874((byte) -75)] = arg2.method2874((byte) -75);
        } else if (arg1 == 20) {
            if (this.field5666 == null || this.field5663 == null) {
                this.field5666 = new int[this.field5645.length];
                this.field5663 = new int[this.field5645.length];
                for (int var5 = 0; var5 < this.field5645.length; var5++) {
                    this.field5666[var5] = 256;
                    this.field5663[var5] = 256;
                }
            }
            int var6 = arg2.method2874((byte) -75);
            this.field5666[var6] = arg2.method2845(-1);
            this.field5663[var6] = arg2.method2845(-1);
        }
        field5650++;
        if (arg0) {
            method2354(-108, -103, 24, null, -6, 106);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 374)
    public final void method2352(boolean arg0) {
        if (this.field5661 == -1) {
            if (this.field5652 == null) {
                this.field5661 = 0;
            } else {
                this.field5661 = 2;
            }
        }
        if (this.field5647 == -1) {
            if (this.field5652 == null) {
                this.field5647 = 0;
            } else {
                this.field5647 = 2;
            }
        }
        field5662++;
        if (!arg0) {
            this.field5659 = -90;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZI)I", line = 409)
    public final int method2353(int arg0, int arg1, boolean arg2, int arg3) {
        field5642++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field5667[arg0];
        class109 var8 = null;
        class109 var9 = this.field5671.method3085(0, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5644 || class553.field7458) && arg1 != -1 && arg1 < this.field5667.length) {
            int var11 = this.field5667[arg1];
            var8 = this.field5671.method3085(0, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (arg3 <= 20) {
            return 114;
        }
        if (this.field5653) {
            var5 |= 0x200;
        }
        if (var9.method784(var10, (byte) -125)) {
            var5 |= 0x80;
        }
        if (var9.method785((byte) 84, var10)) {
            var5 |= 0x100;
        }
        if (var9.method788((byte) 115, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method784(var6, (byte) 119)) {
                var5 |= 0x80;
            }
            if (var8.method785((byte) 99, var6)) {
                var5 |= 0x100;
            }
            if (var8.method788((byte) 121, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field5649 != null && arg2) {
            if (this.field5649.length > arg0) {
                int var12 = this.field5649[arg0];
                if (var12 != 65535) {
                    class109 var13 = this.field5671.method3085(0, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method784(var14, (byte) -123)) {
                            var5 |= 0x80;
                        }
                        if (var13.method785((byte) 116, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method788((byte) 126, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field5644 || class553.field7458) && arg1 != -1 && this.field5649.length > arg1) {
                int var15 = this.field5649[arg1];
                if (var15 != 65535) {
                    class109 var16 = this.field5671.method3085(0, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method784(var17, (byte) -125)) {
                            var5 |= 0x80;
                        }
                        if (var16.method785((byte) 116, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method788((byte) 125, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III[BII)Z", line = 532)
    public static final boolean method2354(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field5651++;
        boolean var6 = true;
        if (arg5 != 1024) {
            field5670 = -79L;
        }
        class501 var7 = new class501(arg3);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2835((byte) 29);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2871((byte) -87);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFD8) >> 6;
                    int var16 = var7.method2874((byte) -75) >> 2;
                    int var17 = arg4 + var15;
                    int var18 = arg0 + var14;
                    if (var17 > 0 && var18 > 0 && (arg1 - 1) > var17 && var18 < (arg2 - 1)) {
                        class301 var19 = class475.field6543.method2685(var8, -102);
                        if (var16 != 22 || class366.field4875.field9373 || var19.field4164 != 0 || var19.field4169 == 1 || var19.field4186) {
                            if (!var19.method1827((byte) 86)) {
                                var6 = false;
                                class669.field9394++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2871((byte) -87);
                if (var12 == 0) {
                    break;
                }
                var7.method2874((byte) -75);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLac;)V", line = 647)
    public final void method2355(boolean arg0, class501 arg1) {
        field5655++;
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method2352(false);
                    return;
                }
            }
            this.method2351(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BIIILda;IIB)Lda;", line = 673)
    public final class55 method2356(byte arg0, int arg1, int arg2, int arg3, class55 arg4, int arg5, int arg6, byte arg7) {
        field5665++;
        int var9 = this.field5646[arg1];
        int var10 = this.field5667[arg1];
        class109 var11 = this.field5671.method3085(0, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method462(arg0, arg3, true);
        }
        class109 var13 = null;
        if ((this.field5644 || class553.field7458) && arg2 != -1 && this.field5667.length > arg2) {
            int var14 = this.field5667[arg2];
            var13 = this.field5671.method3085(0, var14 >> 16);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field5653) {
            arg3 |= 0x200;
        }
        if (arg7 >= -119) {
            this.method2353(10, -90, true, 92);
        }
        if (var11.method784(var12, (byte) -121)) {
            arg3 |= 0x80;
        }
        if (var11.method785((byte) 102, var12)) {
            arg3 |= 0x100;
        }
        if (var11.method788((byte) 118, var12)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method784(arg2, (byte) -128)) {
                arg3 |= 0x80;
            }
            if (var13.method785((byte) 83, arg2)) {
                arg3 |= 0x100;
            }
            if (var13.method788((byte) 117, arg2)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | 0x20;
        class55 var16 = arg4.method462(arg0, var15, true);
        var16.method428((byte) -99, var13, this.field5653, arg6 - 1, arg2, var12, var11, arg5, var9);
        return var16;
    }
}
