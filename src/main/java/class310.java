import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class310 extends class86 {

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    private int field4787 = 0;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    private int field4784 = 1024;

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "I")
    private int field4793 = 1024;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    private int field4782 = 204;

    @OriginalMember(owner = "client!vm", name = "ab", descriptor = "I")
    private int field4795 = 409;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    private int field4788 = 4;

    @OriginalMember(owner = "client!vm", name = "hb", descriptor = "I")
    private int field4802 = 8;

    @OriginalMember(owner = "client!vm", name = "kb", descriptor = "I")
    private int field4805 = 81;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "J")
    public static long field4792 = 0L;

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
    public static int field4794 = 1;

    @OriginalMember(owner = "client!vm", name = "db", descriptor = "Ljava/lang/String;")
    public static String field4798 = "M";

    @OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
    public static int field4800 = -1;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    private int field4783;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "I")
    private int field4790;

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!vm", name = "bb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!vm", name = "eb", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!vm", name = "gb", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!vm", name = "jb", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!vm", name = "mb", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!vm", name = "ib", descriptor = "[I")
    private int[] field4803;

    @OriginalMember(owner = "client!vm", name = "lb", descriptor = "[Lho;")
    public static class215[] field4806;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "[[I")
    private int[][] field4780;

    @OriginalMember(owner = "client!vm", name = "cb", descriptor = "[[I")
    private int[][] field4797;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V", line = 6)
    private final void method2204(int arg0) {
        field4796++;
        Random var2 = new Random((long) this.field4802);
        this.field4783 = 4096 / this.field4802;
        this.field4780 = new int[this.field4802][this.field4788];
        this.field4797 = new int[this.field4802][this.field4788 + 1];
        this.field4781 = this.field4805 / 2;
        int var3 = this.field4783 / 2;
        this.field4803 = new int[this.field4802 + 1];
        this.field4790 = 4096 / this.field4788;
        int var4 = this.field4790 / 2;
        this.field4803[0] = 0;
        if (arg0 <= 67) {
            this.method157(-45, false, (class25) null);
        }
        for (int var5 = 0; var5 < this.field4802; var5++) {
            if (var5 > 0) {
                int var6 = this.field4783;
                int var7 = (class67.method659(4096, var2, true) - 2048) * this.field4782 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field4803[var5] = this.field4803[var5 - 1] + var8;
            }
            this.field4797[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4788; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4790;
                    int var11 = (class67.method659(4096, var2, true) - 2048) * this.field4795 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field4797[var5][var9] = this.field4797[var5][var9 - 1] + var12;
                }
                this.field4780[var5][var9] = this.field4784 > 0 ? 4096 - class67.method659(this.field4784, var2, true) : 4096;
            }
            this.field4797[var5][this.field4788] = 4096;
        }
        this.field4803[this.field4802] = 4096;
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V", line = 71)
    public final void method476(int arg0) {
        this.method2204(95);
        field4804++;
        if (arg0 != 0) {
            this.field4793 = -17;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V", line = 91)
    public static void method2205(byte arg0) {
        field4798 = null;
        field4806 = null;
        if (arg0 >= -35) {
            method2206((byte) 50);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZLug;)V", line = 102)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field4779++;
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field4788 = arg2.method281(95);
        } else if (arg0 == 1) {
            this.field4802 = arg2.method281(-124);
        } else if (arg0 == 2) {
            this.field4795 = arg2.method314((byte) 109);
        } else if (arg0 == 3) {
            this.field4782 = arg2.method314((byte) 49);
        } else if (arg0 == 4) {
            this.field4793 = arg2.method314((byte) 44);
        } else if (arg0 == 5) {
            this.field4787 = arg2.method314((byte) 68);
        } else if (arg0 == 6) {
            this.field4805 = arg2.method314((byte) 106);
        } else if (arg0 == 7) {
            this.field4784 = arg2.method314((byte) 36);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 213)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[I", line = 217)
    public final int[] method158(int arg0, int arg1) {
        field4789++;
        if (arg1 < 7) {
            method2207(-122, 110, (class18) null, -66);
        }
        int[] var3 = this.field1225.method1914(arg0, 71);
        if (this.field1225.field3995) {
            int var4 = 0;
            int var5;
            for (var5 = class135.field2257[arg0] + this.field4787; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4802 && this.field4803[var4] <= var5) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field4803[var4];
            int var9 = this.field4803[var4 - 1];
            if ((this.field4781 + var9) < var5 && var8 - this.field4781 > var5) {
                for (int var10 = 0; var10 < class93.field1424; var10++) {
                    int var11 = var7 ? this.field4793 : -this.field4793;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field4790 * var11 >> 12) + class347.field5515[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4788 > var12 && var13 >= this.field4797[var6][var12]) {
                        var12++;
                    }
                    int var14 = this.field4797[var6][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field4797[var6][var15];
                    if ((this.field4781 + var16) < var13 && var14 - this.field4781 > var13) {
                        var3[var10] = this.field4780[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class65.method639(var3, 0, class93.field1424, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 326)
    public static final void method2206(byte arg0) {
        field4799++;
        if (class113.field1724 != null) {
            class190 var1 = class113.field1724;
            synchronized (class113.field1724) {
                class113.field1724 = null;
            }
        }
        if (arg0 != 120) {
            method2206((byte) 33);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILrn;I)[Lqn;", line = 373)
    public static final class361[] method2207(int arg0, int arg1, class18 arg2, int arg3) {
        field4801++;
        if (arg3 != -219516244) {
            field4786 = -105;
        }
        return class282.method2056(arg0, arg3 + 219516244, arg2, arg1) ? class91.method815(arg3 ^ 0xD158F54) : null;
    }
}
