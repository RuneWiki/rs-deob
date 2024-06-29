import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class170 {

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    private int field2737 = -1;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    private int field2738 = 0;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "Lat;")
    private class398 field2734 = new class398();

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "Z")
    public boolean field2743 = false;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    private int field2733;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "[[[I")
    private int[][][] field2735;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "[Lre;")
    private class628[] field2740;

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2744 = new String[] { method1582(method1581("\u000e1-1IR")), method1582(method1581("\u000e1-16\u0013=%k4R")), method1582(method1581("\u0014& s")), method1582(method1581("\u000e1-1KR")), method1582(method1581("\u0001}b1w")), method1582(method1581("\u000e1-1HR")), method1582(method1581("92\"?e\u0014?5?x\u001f'>vo\f6l~*\u001c& s*\u0013>-xoZ0-|b\u001f")), method1582(method1581("\u000e1-1NR")) };

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILha;)V")
    public static final void method1577(int arg0, class63 arg1) {
        try {
            field2741++;
            if (class16.field177) {
                class304.method2610(arg1, 0);
            } else {
                class238.method2057((byte) -101, arg1);
            }
            int var2 = -17 % ((arg0 - 13) / 46);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2744[3] + arg0 + ',' + (arg1 == null ? field2744[2] : field2744[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public final void method1578(byte arg0) {
        try {
            for (int var2 = 0; var2 < this.field2732; var2++) {
                this.field2735[var2][0] = null;
                this.field2735[var2][1] = null;
                this.field2735[var2][2] = null;
                this.field2735[var2] = null;
            }
            int var3 = -92 % ((11 - arg0) / 46);
            field2742++;
            this.field2735 = null;
            this.field2740 = null;
            this.field2734.method3224(false);
            this.field2734 = null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2744[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method1579(byte arg0) {
        try {
            field2739++;
            if (this.field2733 != this.field2732) {
                throw new RuntimeException(field2744[6]);
            }
            if (arg0 < 88) {
                this.method1580(-28, (byte) 68);
            }
            for (int var2 = 0; var2 < this.field2732; var2++) {
                this.field2740[var2] = class240.field3703;
            }
            return this.field2735;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2744[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1580(int arg0, byte arg1) {
        try {
            field2736++;
            if (arg1 >= -40) {
                return null;
            } else if (this.field2733 == this.field2732) {
                this.field2743 = this.field2740[arg0] == null;
                this.field2740[arg0] = class240.field3703;
                return this.field2735[arg0];
            } else if (this.field2732 == 1) {
                this.field2743 = this.field2737 != arg0;
                this.field2737 = arg0;
                return this.field2735[0];
            } else {
                class628 var3 = this.field2740[arg0];
                if (var3 == null) {
                    this.field2743 = true;
                    if (this.field2738 < this.field2732) {
                        var3 = new class628(arg0, this.field2738);
                        this.field2738++;
                    } else {
                        class628 var4 = (class628) this.field2734.method3229(0);
                        var3 = new class628(arg0, var4.field9043);
                        this.field2740[var4.field9041] = null;
                        var4.method4173(-1);
                    }
                    this.field2740[arg0] = var3;
                } else {
                    this.field2743 = false;
                }
                this.field2734.method3221(var3, (byte) 4);
                return this.field2735[var3.field9043];
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2744[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(III)V")
    public class170(int arg0, int arg1, int arg2) {
        try {
            this.field2732 = arg0;
            this.field2733 = arg1;
            this.field2735 = new int[this.field2732][3][arg2];
            this.field2740 = new class628[this.field2733];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2744[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1581(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1582(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
