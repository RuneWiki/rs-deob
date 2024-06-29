import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class283 extends class270 {

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
    private int field4831 = 8;

    @OriginalMember(owner = "client!ui", name = "jb", descriptor = "I")
    private int field4835 = 1024;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
    private int field4832 = 81;

    @OriginalMember(owner = "client!ui", name = "mb", descriptor = "I")
    private int field4838 = 409;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    private int field4820 = 1024;

    @OriginalMember(owner = "client!ui", name = "nb", descriptor = "I")
    private int field4839 = 204;

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
    private int field4834 = 4;

    @OriginalMember(owner = "client!ui", name = "pb", descriptor = "I")
    private int field4841 = 0;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "[I")
    public static int[] field4821 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "Lmh;")
    public static class62 field4830 = class201.method1405(true, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ui", name = "lb", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ui", name = "qb", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ui", name = "kb", descriptor = "[I")
    private int[] field4836;

    @OriginalMember(owner = "client!ui", name = "ob", descriptor = "[I")
    public static int[] field4840;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "[[I")
    private int[][] field4823;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "[[I")
    private int[][] field4828;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 6)
    public static void method1923(int arg0) {
        field4830 = null;
        field4840 = null;
        field4821 = null;
        if (arg0 != 10263) {
            field4821 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfb;", line = 23)
    public static final class21 method1924(Throwable arg0, String arg1) {
        class21 var2;
        if (arg0 instanceof class21) {
            var2 = (class21) arg0;
            var2.field218 = var2.field218 + ' ' + arg1;
        } else {
            var2 = new class21(arg0, arg1);
        }
        field4819++;
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILmi;)Ljb;", line = 39)
    public static final class221 method1925(int arg0, class92 arg1) {
        field4842++;
        if (arg0 != -11844) {
            field4830 = (class62) null;
        }
        return new class221(arg1.method699((byte) -56), arg1.method699((byte) -105), arg1.method699((byte) -69), arg1.method699((byte) -47), arg1.method737(arg0 ^ 0x2E43), arg1.method737(-1), arg1.method702(-1));
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 49)
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V", line = 53)
    public static final void method1926(int arg0) {
        class263 var1 = class81.field1345;
        synchronized (class81.field1345) {
            class127.field2106 = class19.field184;
            class244.field4150++;
            class275.field4725 = class270.field4581;
            class221.field3795 = class16.field150;
            class235.field4049 = class77.field1274;
            class171.field2786 = class84.field1377;
            class207.field3520 = class42.field638;
            class238.field4076 = class2.field27;
            class77.field1274 = arg0;
        }
        field4825++;
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(B)V", line = 84)
    public final void method231(byte arg0) {
        this.method1928(-211239604);
        if (arg0 != 90) {
            this.method6(120, -23);
        }
        field4822++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V", line = 107)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4826++;
        int var7 = class4.method17(class99.field1630, -16168, class81.field1348, arg0);
        if (arg4 < 1) {
            method1924((Throwable) null, (String) null);
        }
        int var8 = class4.method17(class99.field1630, -16168, class81.field1348, arg2);
        int var9 = class4.method17(class176.field2819, -16168, class52.field755, arg1);
        int var10 = class4.method17(class176.field2819, -16168, class52.field755, arg5);
        int var11 = class4.method17(class99.field1630, -16168, class81.field1348, arg0 + arg6);
        int var12 = class4.method17(class99.field1630, -16168, class81.field1348, arg2 - arg6);
        for (int var13 = var7; var13 < var11; var13++) {
            class271.method1861(arg3, true, class282.field4817[var13], var10, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class271.method1861(arg3, true, class282.field4817[var14], var10, var9);
        }
        int var15 = class4.method17(class176.field2819, -16168, class52.field755, arg1 + arg6);
        int var16 = class4.method17(class176.field2819, -16168, class52.field755, arg5 - arg6);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class282.field4817[var17];
            class271.method1861(arg3, true, var18, var15, var9);
            class271.method1861(arg3, true, var18, var10, var16);
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V", line = 176)
    private final void method1928(int arg0) {
        field4833++;
        Random var2 = new Random((long) this.field4831);
        this.field4827 = this.field4832 / 2;
        this.field4836 = new int[this.field4831 + 1];
        this.field4836[0] = 0;
        this.field4824 = 4096 / this.field4831;
        this.field4823 = new int[this.field4831][this.field4834 + 1];
        int var3 = this.field4824 / 2;
        this.field4818 = 4096 / this.field4834;
        int var4 = this.field4818 / 2;
        this.field4828 = new int[this.field4831][this.field4834];
        for (int var5 = 0; var5 < this.field4831; var5++) {
            if (var5 > 0) {
                int var6 = this.field4824;
                int var7 = (class73.method525(4096, var2, true) - 2048) * this.field4839 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field4836[var5] = this.field4836[var5 - 1] + var8;
            }
            this.field4823[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4834; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4818;
                    int var11 = (class73.method525(4096, var2, true) - 2048) * this.field4838 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field4823[var5][var9] = this.field4823[var5][var9 - 1] + var12;
                }
                this.field4828[var5][var9] = this.field4820 > 0 ? 4096 - class73.method525(this.field4820, var2, true) : 4096;
            }
            this.field4823[var5][this.field4834] = 4096;
        }
        if (arg0 != -211239604) {
            this.field4831 = -65;
        }
        this.field4836[this.field4831] = 4096;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lmi;II)V", line = 263)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = -12 / ((-arg2 - 8) / 53);
        field4837++;
        if (arg1 == 0) {
            this.field4834 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field4831 = arg0.method702(-1);
        } else if (arg1 == 2) {
            this.field4838 = arg0.method721(113);
        } else if (arg1 == 3) {
            this.field4839 = arg0.method721(86);
        } else if (arg1 == 4) {
            this.field4835 = arg0.method721(74);
        } else if (arg1 == 5) {
            this.field4841 = arg0.method721(121);
        } else if (arg1 == 6) {
            this.field4832 = arg0.method721(37);
        } else if (arg1 == 7) {
            this.field4820 = arg0.method721(112);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[I", line = 348)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            this.field4820 = -88;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        field4829++;
        if (this.field4573.field1984) {
            int var4 = 0;
            int var5;
            for (var5 = class166.field2702[arg1] + this.field4841; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field4831 > var4 && this.field4836[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field4836[var4 - 1];
            int var9 = this.field4836[var4];
            if (var5 > (var8 + this.field4827) && var5 < (var9 - this.field4827)) {
                for (int var10 = 0; var10 < class109.field1770; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field4835 : -this.field4835;
                    int var13;
                    for (var13 = (this.field4818 * var12 >> 12) + field4840[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4834 > var11 && var13 >= this.field4823[var7][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field4823[var7][var14];
                    int var16 = this.field4823[var7][var11];
                    if (var13 > this.field4827 + var15 && (var16 - this.field4827) > var13) {
                        var3[var10] = this.field4828[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class231.method1632(var3, 0, class109.field1770, 0);
            }
        }
        return var3;
    }
}
