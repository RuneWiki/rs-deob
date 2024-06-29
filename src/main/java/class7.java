import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class7 extends class175 {

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    private int field92 = 1024;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private int field91 = 409;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    private int field101 = 81;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    private int field108 = 4;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    private int field87 = 204;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    private int field106 = 0;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    private int field105 = 8;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    private int field100 = 1024;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "Lij;")
    public static class50 field99 = class78.method578(123, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Lij;")
    public static class50 field90 = class78.method578(127, "http:)4)4");

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Lce;")
    public static class10 field97;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "[I")
    private int[] field103;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "[[I")
    private int[][] field104;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "[[I")
    private int[][] field93;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public static void method43(int arg0) {
        field99 = null;
        if (arg0 == -1) {
            field97 = null;
            field90 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        this.method47((byte) -124);
        if (arg0 == 0) {
            ++field94;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field112;
        if (!arg0) {
            this.field106 = 31;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field100 = arg2.method1441(84);
                                    }
                                } else {
                                    this.field101 = arg2.method1441(76);
                                }
                            } else {
                                this.field106 = arg2.method1441(120);
                            }
                        } else {
                            this.field92 = arg2.method1441(104);
                        }
                    } else {
                        this.field87 = arg2.method1441(-119);
                    }
                } else {
                    this.field91 = arg2.method1441(67);
                }
            } else {
                this.field105 = arg2.method1487(255);
            }
        } else {
            this.field108 = arg2.method1487(255);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)I")
    public static final int method45(byte arg0) {
        int var1 = 57 % ((-6 - arg0) / 60);
        ++field109;
        return 16;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Lij;")
    public static final class50 method46(int arg0, int arg1) {
        ++field111;
        if (arg0 != 1024) {
            field90 = null;
        }
        if (~arg1 > -100001) {
            return class80.method589(new class50[] { class19.field404, class78.method579(arg1, -26225), class144.field2509 }, 28743);
        } else {
            return ~arg1 > -10000001 ? class80.method589(new class50[] { class139.field2428, class78.method579(arg1 / 1000, -26225), class1.field3, class144.field2509 }, 28743) : class80.method589(new class50[] { class43.field790, class78.method579(arg1 / 1000000, arg0 + -27249), class6.field75, class144.field2509 }, arg0 + 27719);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            this.field91 = -65;
        }
        ++field102;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int var4 = 0;
            int var5;
            for (var5 = class29.field616[arg0] + this.field106; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field105 > var4 && ~this.field103[var4] >= ~var5) {
                ++var4;
            }
            boolean var6 = (var4 & 1) == 0;
            int var7 = var4 + -1;
            int var8 = this.field103[var4];
            int var9 = this.field103[var4 + -1];
            if (var5 > this.field107 + var9 && var5 < var8 - this.field107) {
                for (int var10 = 0; var10 < class211.field3514; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field92 : this.field92;
                    int var13;
                    for (var13 = (this.field98 * var12 >> 12) + class129.field2272[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field108 && var13 >= this.field93[var7][var11]) {
                        ++var11;
                    }
                    int var14 = this.field93[var7][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field93[var7][var15];
                    if (~var13 < ~(this.field107 + var16) && -this.field107 + var14 > var13) {
                        var3[var10] = this.field104[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class105.method794(var3, 0, class211.field3514, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V")
    private final void method47(byte arg0) {
        ++field96;
        if (arg0 <= -114) {
            Random var2 = new Random((long) this.field105);
            this.field98 = 4096 / this.field108;
            this.field104 = new int[this.field105][this.field108];
            this.field103 = new int[this.field105 - -1];
            this.field93 = new int[this.field105][this.field108 - -1];
            this.field103[0] = 0;
            this.field107 = this.field101 / 2;
            int var3 = this.field98 / 2;
            this.field110 = 4096 / this.field105;
            int var4 = this.field110 / 2;
            for (int var5 = 0; ~this.field105 < ~var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field110;
                    int var7 = (class63.method494(var2, -32752, 4096) + -2048) * this.field87 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field103[var5] = this.field103[var5 + -1] + var8;
                }
                this.field93[var5][0] = 0;
                for (int var9 = 0; var9 < this.field108; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field98;
                        int var11 = (-2048 + class63.method494(var2, -32752, 4096)) * this.field91 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field93[var5][var9] = this.field93[var5][var9 - 1] + var12;
                    }
                    this.field104[var5][var9] = ~this.field100 < -1 ? 4096 - class63.method494(var2, -32752, this.field100) : 4096;
                }
                this.field93[var5][this.field108] = 4096;
            }
            this.field103[this.field105] = 4096;
        }
    }
}
