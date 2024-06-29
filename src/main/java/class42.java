import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class42 extends class293 {

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field627 = -32768;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Z")
    public boolean field630 = false;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    private int field641 = 0;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field632 = 0;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lwe;")
    private class56 field638;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lck;")
    public static class119 field626 = class298.method1987((byte) 70, "null");

    @OriginalMember(owner = "client!af", name = "H", descriptor = "Lck;")
    public static class119 field649 = class298.method1987((byte) 100, "overlay2)3dat");

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field644 = 0;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Lck;")
    public static class119 field636 = class298.method1987((byte) 28, "");

    @OriginalMember(owner = "client!af", name = "x", descriptor = "[S")
    public static short[] field639 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Lj;")
    public static class8 field650 = new class8(0, 0);

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field651 = 0;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lwi;")
    public static class23 field629;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[[S")
    public static short[][] field634;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILlh;ILjava/awt/Component;I)Lae;", line = 4)
    public static final class39 method320(int arg0, class282 arg1, int arg2, Component arg3, int arg4) {
        field648++;
        if (class230.field3728 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class39 var5 = (class39) Class.forName("ha").getDeclaredConstructor().newInstance();
                var5.field598 = arg0;
                var5.field568 = new int[(class55.field887 ? 2 : 1) * 256];
                var5.method298(arg3);
                var5.field591 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field591 > 16384) {
                    var5.field591 = 16384;
                }
                var5.method312(var5.field591);
                if (class76.field1187 > 0 && class10.field190 == null) {
                    class10.field190 = new class27();
                    class10.field190.field411 = arg1;
                    arg1.method1879(2, class76.field1187, class10.field190);
                }
                if (class10.field190 != null) {
                    if (class10.field190.field403[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class10.field190.field403[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class180 var7 = new class180(arg1, arg2);
                    var7.field598 = arg0;
                    var7.field568 = new int[(class55.field887 ? 2 : 1) * 256];
                    var7.method298(arg3);
                    var7.field591 = 16384;
                    var7.method312(var7.field591);
                    if (arg4 > ~class76.field1187 && class10.field190 == null) {
                        class10.field190 = new class27();
                        class10.field190.field411 = arg1;
                        arg1.method1879(2, class76.field1187, class10.field190);
                    }
                    if (class10.field190 != null) {
                        if (class10.field190.field403[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class10.field190.field403[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class39();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lec;", line = 87)
    private final class28 method321(int arg0) {
        field645++;
        class240 var2 = class234.method1511(109, this.field640);
        class28 var3;
        if (this.field630) {
            var3 = var2.method1564(-1, (byte) 125);
        } else {
            var3 = var2.method1564(this.field632, (byte) -8);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 > -111) {
                method323(false, 2, 119, -29, 4, -47);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 110)
    public static void method322(int arg0) {
        field629 = null;
        field636 = null;
        field626 = null;
        field649 = null;
        field639 = null;
        field634 = (short[][]) null;
        field650 = null;
        if (arg0 != 0) {
            method320(57, (class282) null, -50, (Component) null, -98);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIIIII)V", line = 127)
    public static final void method323(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 77) {
            return;
        }
        field637++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class217.field3505 - class295.field4913) * var6 / 100 + class295.field4913;
        if (class214.field3408 > var7) {
            var7 = class214.field3408;
        } else if (var7 > class102.field1553) {
            var7 = class102.field1553;
        }
        int var8 = arg3 * var7 * 512 / (arg1 * 334);
        if (var8 < class240.field3853) {
            short var12 = class240.field3853;
            var7 = arg1 * var12 * 334 / (arg3 * 512);
            if (var7 > class102.field1553) {
                var7 = class102.field1553;
                int var13 = arg3 * var7 * 512 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg0) {
                    class121.method816();
                    class121.method811(arg4, arg2, var14, arg3, 0);
                    class121.method811(arg1 + arg4 - var14, arg2, var14, arg3, 0);
                }
                arg4 += var14;
                arg1 -= var14 * 2;
            }
        } else if (class156.field2487 < var8) {
            short var9 = class156.field2487;
            var7 = var9 * 334 * arg1 / (arg3 * 512);
            if (var7 < class214.field3408) {
                var7 = class214.field3408;
                int var10 = arg1 * var9 * 334 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg0) {
                    class121.method816();
                    class121.method811(arg4, arg2, arg1, var11, 0);
                    class121.method811(arg4, arg2 + arg3 - var11, arg1, var11, 0);
                }
                arg2 += var11;
                arg3 -= var11 * 2;
            }
        }
        class20.field272 = arg3 * var7 / 334;
        class170.field2683 = arg2;
        class90.field1382 = (short) arg1;
        class298.field5023 = arg4;
        class249.field4028 = (short) arg3;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V", line = 440)
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field647 = arg4;
        this.field633 = arg2;
        this.field643 = arg3;
        this.field640 = arg0;
        this.field631 = arg1;
        this.field635 = arg5 + arg6;
        int var8 = class234.method1511(122, this.field640).field3863;
        if (var8 == -1) {
            this.field630 = true;
        } else {
            this.field630 = false;
            this.field638 = class276.method1818(-20682, var8);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V", line = 221)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field628++;
        class28 var11 = this.method321(-117);
        if (var11 != null) {
            var11.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field627 = var11.method214();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 255)
    public final void method324(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field646++;
        if (this.field630) {
            return;
        }
        this.field641 += arg0;
        while (this.field641 > this.field638.field905[this.field632]) {
            this.field641 -= this.field638.field905[this.field632];
            this.field632++;
            if (this.field638.field916.length <= this.field632) {
                this.field630 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIILvc;IZJ)Z", line = 295)
    public static final boolean method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class293 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class57.field926 == class259.field4144;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class208.field3328 || var16 >= class103.field1569) {
                    return false;
                }
                class104 var17 = class150.field2390[arg0][var15][var16];
                if (var17 != null && var17.field1596 >= 5) {
                    return false;
                }
            }
        }
        class196 var18 = new class196();
        var18.field3130 = arg11;
        var18.field3132 = arg0;
        var18.field3149 = arg5;
        var18.field3129 = arg6;
        var18.field3143 = arg7;
        var18.field3140 = arg8;
        var18.field3148 = arg9;
        var18.field3131 = arg1;
        var18.field3146 = arg2;
        var18.field3136 = arg1 + arg3 - 1;
        var18.field3137 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class150.field2390[var22][var19][var20] == null) {
                        class150.field2390[var22][var19][var20] = new class104(var22, var19, var20);
                    }
                }
                class104 var23 = class150.field2390[arg0][var19][var20];
                var23.field1610[var23.field1596] = var18;
                var23.field1606[var23.field1596] = var21;
                var23.field1601 |= var21;
                var23.field1596++;
                if (var13 && class37.field554[var19][var20] != 0) {
                    var14 = class37.field554[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class37.field554[var24][var25] == 0) {
                        class37.field554[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class87.field1326[class216.field3454++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()I", line = 427)
    public final int method214() {
        field642++;
        return this.field627;
    }
}
