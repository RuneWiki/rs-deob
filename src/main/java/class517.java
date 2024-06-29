import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class517 {

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    private int field7595 = 0;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public int field7582;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "[Lea;")
    public class115[] field7578;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
    public static int[] field7577 = new int[13];

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "Laa;")
    public static class76 field7589 = new class76(27, -1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "J")
    private long field7590;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Lea;")
    private class115 field7593;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "Lea;")
    private class115 field7594;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7576;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IJLea;)V", line = 5)
    public final void method3055(int arg0, long arg1, class115 arg2) {
        if (arg2.field1736 != null) {
            arg2.method876((byte) -96);
        }
        field7586++;
        if (arg0 != 0) {
            this.field7590 = -74L;
        }
        class115 var5 = this.field7578[(int) (arg1 & (long) (this.field7582 - 1))];
        arg2.field1741 = var5;
        arg2.field1736 = var5.field1736;
        arg2.field1736.field1741 = arg2;
        arg2.field1741.field1736 = arg2;
        arg2.field1739 = arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V", line = 27)
    public final void method3056(boolean arg0) {
        field7580++;
        for (int var2 = 0; var2 < this.field7582; var2++) {
            class115 var3 = this.field7578[var2];
            while (true) {
                class115 var4 = var3.field1741;
                if (var3 == var4) {
                    break;
                }
                var4.method876((byte) -96);
            }
        }
        if (!arg0) {
            this.method3057(-126);
        }
        this.field7593 = null;
        this.field7594 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Lea;", line = 60)
    public final class115 method3057(int arg0) {
        field7588++;
        if (this.field7593 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.method3061(99);
        }
        class115 var2 = this.field7578[(int) (this.field7590 & (long) (this.field7582 - 1))];
        while (this.field7593 != var2) {
            if (this.field7593.field1739 == this.field7590) {
                class115 var3 = this.field7593;
                this.field7593 = this.field7593.field1741;
                return var3;
            }
            this.field7593 = this.field7593.field1741;
        }
        this.field7593 = null;
        return null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;)V", line = 94)
    public static final void method3058(byte arg0, String arg1) {
        System.out.println("Error: " + class80.method574("%0a", arg1, "\n", 0));
        field7585++;
        if (arg0 >= -92) {
            method3063((byte) -54);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IJ)Lea;", line = 108)
    public final class115 method3059(int arg0, long arg1) {
        this.field7590 = arg1;
        field7591++;
        if (arg0 <= 34) {
            this.method3062(-98);
        }
        class115 var4 = this.field7578[(int) (arg1 & (long) (this.field7582 - 1))];
        for (this.field7593 = var4.field1741; this.field7593 != var4; this.field7593 = this.field7593.field1741) {
            if (this.field7593.field1739 == arg1) {
                class115 var5 = this.field7593;
                this.field7593 = this.field7593.field1741;
                return var5;
            }
        }
        this.field7593 = null;
        return null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[Lea;)I", line = 140)
    public final int method3060(int arg0, class115[] arg1) {
        field7592++;
        int var3 = 11 % ((arg0 - 33) / 62);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field7582; var5++) {
            class115 var6 = this.field7578[var5];
            for (class115 var7 = var6.field1741; var7 != var6; var7 = var7.field1741) {
                arg1[var4++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)Lea;", line = 172)
    public final class115 method3061(int arg0) {
        field7581++;
        this.field7595 = 0;
        return arg0 == -16817 ? this.method3066((byte) 125) : null;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)I", line = 186)
    public final int method3062(int arg0) {
        field7584++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field7582; var3++) {
            class115 var4 = this.field7578[var3];
            class115 var5 = var4.field1741;
            while (var4 != var5) {
                var5 = var5.field1741;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 215)
    public static void method3063(byte arg0) {
        field7589 = null;
        field7577 = null;
        if (arg0 > -85) {
            field7576 = null;
        }
        field7576 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "()V", line = 227)
    public static final void method3064() {
        if (class175.field2574 != null) {
            for (int var0 = 0; var0 < class175.field2574.length; var0++) {
                for (int var1 = 0; var1 < class445.field6562; var1++) {
                    for (int var2 = 0; var2 < class167.field2473; var2++) {
                        if (class175.field2574[var0][var1][var2] != null) {
                            class175.field2574[var0][var1][var2].method1905((byte) 47);
                        }
                        class175.field2574[var0][var1][var2] = null;
                    }
                }
            }
        }
        class175.field2574 = null;
        class213.field3048 = null;
        if (class435.field6422 != null) {
            for (int var3 = 0; var3 < class435.field6422.length; var3++) {
                for (int var4 = 0; var4 < class445.field6562; var4++) {
                    for (int var5 = 0; var5 < class167.field2473; var5++) {
                        if (class435.field6422[var3][var4][var5] != null) {
                            class435.field6422[var3][var4][var5].method1905((byte) 47);
                        }
                        class435.field6422[var3][var4][var5] = null;
                    }
                }
            }
        }
        class435.field6422 = null;
        class420.field6281 = null;
        class236.field3305 = null;
        class249.field3405 = null;
        class146.field2190 = 0;
        if (class426.field6353 != null) {
            for (int var6 = 0; var6 < class146.field2190; var6++) {
                class426.field6353[var6] = null;
            }
        }
        if (class132.field1979 != null) {
            for (int var7 = 0; var7 < class468.field6866; var7++) {
                class132.field1979[var7] = null;
            }
            class468.field6866 = 0;
        }
        if (class486.field7238 != null) {
            for (int var8 = 0; var8 < class309.field4634; var8++) {
                class486.field7238[var8] = null;
            }
            for (int var9 = 0; var9 < class349.field5377; var9++) {
                for (int var10 = 0; var10 < class445.field6562; var10++) {
                    for (int var11 = 0; var11 < class167.field2473; var11++) {
                        class98.field1508[var9][var10][var11] = 0L;
                    }
                }
            }
            class309.field4634 = 0;
        }
        class500.field7400 = null;
        class286.method1772(100);
        class268.field3989.method3085((byte) 48);
        class282.field4269 = null;
        class521.field7668 = null;
        class364.field5563 = null;
        class159.field2393 = null;
        class18.field286 = null;
        class521.field7669 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V", line = 372)
    public static final void method3065(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class81.field1139; var5++) {
            Rectangle var6 = class276.field4112[var5];
            if (arg2 < (var6.x + var6.width) && var6.x < (arg2 + arg1) && arg4 < (var6.y + var6.height) && arg4 + arg0 > var6.y) {
                class462.field6727[var5] = true;
            }
        }
        if (arg3 != -3243) {
            field7577 = null;
        }
        field7587++;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)Lea;", line = 399)
    public final class115 method3066(byte arg0) {
        field7575++;
        if (arg0 <= 119) {
            this.field7582 = -116;
        }
        if (this.field7595 > 0 && this.field7578[this.field7595 - 1] != this.field7594) {
            class115 var2 = this.field7594;
            this.field7594 = var2.field1741;
            return var2;
        }
        while (this.field7582 > this.field7595) {
            class115 var3 = this.field7578[this.field7595++].field1741;
            if (this.field7578[this.field7595 - 1] != var3) {
                this.field7594 = var3.field1741;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)I", line = 433)
    public final int method3067(int arg0) {
        field7579++;
        if (arg0 != 4631) {
            this.method3057(110);
        }
        return this.field7582;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I)V", line = 450)
    public class517(int arg0) {
        this.field7582 = arg0;
        this.field7578 = new class115[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class115 var3 = this.field7578[var2] = new class115();
            var3.field1736 = var3;
            var3.field1741 = var3;
        }
    }
}
