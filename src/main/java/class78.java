import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class78 extends class232 {

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Lrh;")
    public class59 field978 = new class59();

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "Lro;")
    public class567 field985 = new class567();

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "Lwfa;")
    private class54 field984;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "Lcb;")
    public static class318 field976 = new class318(100, 8);

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Lrp;")
    public static class280 field975;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method305(int arg0) {
        this.field985.method305(arg0);
        field981++;
        for (class223 var2 = (class223) this.field978.method374((byte) 99); var2 != null; var2 = (class223) this.field978.method372(-20740)) {
            if (!this.field984.method328((byte) -124, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2905 >= var3) {
                        this.method441(-67, var2, var3);
                        var2.field2905 -= var3;
                        break;
                    }
                    this.method441(-71, var2, var2.field2905);
                    var3 -= var2.field2905;
                } while (!this.field984.method334(var3, var2, null, 0, 6));
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILno;I)V")
    private final void method441(int arg0, class223 arg1, int arg2) {
        if ((this.field984.field712[arg1.field2894] & 0x4) != 0 && arg1.field2878 < 0) {
            int var4 = this.field984.field729[arg1.field2894] / class519.field7166;
            int var5 = (var4 + 1048575 - arg1.field2883) / var4;
            arg1.field2883 = arg2 * var4 + arg1.field2883 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field984.field720[arg1.field2894] == 0) {
                    arg1.field2891 = class491.method2764(arg1.field2880, arg1.field2891.method2761(), arg1.field2891.method2749(), arg1.field2891.method2758());
                } else {
                    arg1.field2891 = class491.method2764(arg1.field2880, arg1.field2891.method2761(), 0, arg1.field2891.method2758());
                    this.field984.method330(arg1, (byte) 126, arg1.field2877.field8663[arg1.field2876] < 0);
                }
                if (arg1.field2877.field8663[arg1.field2876] < 0) {
                    arg1.field2891.method2760(-1);
                }
                arg2 = arg1.field2883 / var4;
            }
        }
        field979++;
        arg1.field2891.method305(arg2);
        if (arg0 >= -60) {
            this.field985 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()Lwi;")
    public final class232 method322() {
        field982++;
        class223 var1;
        do {
            var1 = (class223) this.field978.method372(-20740);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2891 == null);
        return var1.field2891;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "([III)V")
    public final void method312(int[] arg0, int arg1, int arg2) {
        field973++;
        this.field985.method312(arg0, arg1, arg2);
        for (class223 var4 = (class223) this.field978.method374((byte) 52); var4 != null; var4 = (class223) this.field978.method372(-20740)) {
            if (!this.field984.method328((byte) -126, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2905) {
                        this.method445(var5, var5 + var6, var6, -111, var4, arg0);
                        var4.field2905 -= var5;
                        break;
                    }
                    this.method445(var4.field2905, var5 + var6, var6, -112, var4, arg0);
                    var6 += var4.field2905;
                    var5 -= var4.field2905;
                } while (!this.field984.method334(var5, var4, arg0, var6, 6));
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method442(int arg0, int arg1, String arg2) {
        field983++;
        if (class495.field6687.field1356) {
            class79.field1002 = new class675();
            class79.field1002.field9560 = arg2;
            class79.field1002.field9558 = arg1;
            if (class375.field5396 != class333.field4859) {
                class79.field1002.field9566 = class79.field1002.field9558 + 50000;
                class79.field1002.field9561 = class79.field1002.field9558 + 40000;
            }
            if (class375.field5394.length > arg1 && class375.field5394[arg1] != null) {
                class201.field2642 = class375.field5394[arg1].field7581;
            }
            return true;
        }
        String var3 = "";
        if (arg0 != 40000) {
            return false;
        }
        if (class375.field5396 != class333.field4859) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class613.field8363 != null) {
            var4 = "/p=" + class613.field8363;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class350.field5121 + "/a=" + class625.field8511 + var4 + "/j" + (class497.field6725 ? "1" : "0") + ",o" + (class549.field7503 ? "1" : "0") + ",a2";
        try {
            class167.field2083.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)[Laj;")
    public static final class338[] method443(byte arg0) {
        field980++;
        return arg0 > -109 ? null : new class338[] { class393.field5624, class393.field5631, class393.field5632, class393.field5633, class393.field5634, class393.field5635, class393.field5636, class393.field5637, class393.field5638, class393.field5639, class393.field5640, class393.field5641, class393.field5642, class393.field5643 };
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()I")
    public final int method332() {
        field974++;
        return 0;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field975 = null;
        field976 = null;
        if (arg0 != -89) {
            method443((byte) -105);
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()Lwi;")
    public final class232 method304() {
        field972++;
        class223 var1 = (class223) this.field978.method374((byte) 74);
        if (var1 == null) {
            return null;
        } else if (var1.field2891 == null) {
            return this.method322();
        } else {
            return var1.field2891;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIILno;[I)V")
    private final void method445(int arg0, int arg1, int arg2, int arg3, class223 arg4, int[] arg5) {
        if ((this.field984.field712[arg4.field2894] & 0x4) != 0 && arg4.field2878 < 0) {
            int var7 = this.field984.field729[arg4.field2894] / class519.field7166;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2883) / var7;
                if (var8 > arg0) {
                    arg4.field2883 += arg0 * var7;
                    break;
                }
                arg4.field2891.method312(arg5, arg2, var8);
                arg0 -= var8;
                arg4.field2883 += var7 * var8 - 1048576;
                arg2 += var8;
                int var9 = class519.field7166 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class491 var11 = arg4.field2891;
                if (this.field984.field720[arg4.field2894] == 0) {
                    arg4.field2891 = class491.method2764(arg4.field2880, var11.method2761(), var11.method2749(), var11.method2758());
                } else {
                    arg4.field2891 = class491.method2764(arg4.field2880, var11.method2761(), 0, var11.method2758());
                    this.field984.method330(arg4, (byte) 110, arg4.field2877.field8663[arg4.field2876] < 0);
                    arg4.field2891.method2732(var9, var11.method2749());
                }
                if (arg4.field2877.field8663[arg4.field2876] < 0) {
                    arg4.field2891.method2760(-1);
                }
                var11.method2741(var9);
                var11.method312(arg5, arg2, arg1 - arg2);
                if (var11.method2740()) {
                    this.field985.method3204(var11);
                }
            }
        }
        field977++;
        if (arg3 <= -106) {
            arg4.field2891.method312(arg5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lwfa;)V")
    public class78(class54 arg0) {
        this.field984 = arg0;
    }
}
