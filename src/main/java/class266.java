import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class266 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lhb;")
    public class146 field4249 = new class146();

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[I")
    public static int[] field4246 = new int[2];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lth;")
    public static class119 field4256;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lhb;")
    private class146 field4259;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[[B")
    public static byte[][] field4245;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[[[I")
    public static int[][][] field4251;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lhb;")
    public final class146 method1807(int arg0) {
        if (arg0 >= -91) {
            method1817(122);
        }
        field4244++;
        class146 var2 = this.field4249.field2407;
        if (this.field4249 == var2) {
            this.field4259 = null;
            return null;
        } else {
            this.field4259 = var2.field2407;
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Lhb;")
    public final class146 method1808(byte arg0) {
        field4253++;
        class146 var2 = this.field4259;
        if (this.field4249 == var2) {
            this.field4259 = null;
            return null;
        }
        if (arg0 <= 29) {
            method1812((byte) -23, true);
        }
        this.field4259 = var2.field2407;
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILhb;)V")
    public final void method1809(int arg0, class146 arg1) {
        field4243++;
        if (arg1.field2405 != null) {
            arg1.method1074((byte) 122);
        }
        if (arg0 == 5) {
            arg1.field2405 = this.field4249.field2405;
            arg1.field2407 = this.field4249;
            arg1.field2405.field2407 = arg1;
            arg1.field2407.field2405 = arg1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lhb;I)V")
    public final void method1810(class146 arg0, int arg1) {
        field4257++;
        if (arg0.field2405 != null) {
            arg0.method1074((byte) 47);
        }
        if (arg1 != 7) {
            this.method1810((class146) null, 107);
        }
        arg0.field2407 = this.field4249.field2407;
        arg0.field2405 = this.field4249;
        arg0.field2405.field2407 = arg0;
        arg0.field2407.field2405 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Lhb;")
    public final class146 method1811(int arg0) {
        class146 var2 = this.field4249.field2407;
        field4248++;
        if (arg0 != -26875) {
            this.method1814(121);
        }
        if (this.field4249 == var2) {
            return null;
        } else {
            var2.method1074((byte) -121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BZ)I")
    public static final int method1812(byte arg0, boolean arg1) {
        if (arg0 <= 5) {
            method1812((byte) 91, true);
        }
        field4247++;
        long var2 = class62.method472(67);
        for (class5 var4 = arg1 ? (class5) class116.field1948.method1062(-127) : (class5) class116.field1948.method1059(-14608); var4 != null; var4 = (class5) class116.field1948.method1059(-14608)) {
            if ((var4.field66 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field66 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2406;
                    class192.field3138[var5] = class238.field3750[var5];
                    var4.method1074((byte) 36);
                    return var5;
                }
                var4.method1074((byte) -120);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Lhb;")
    public final class146 method1813(int arg0) {
        class146 var2 = this.field4249.field2405;
        field4242++;
        if (this.field4249 == var2) {
            this.field4259 = null;
            return null;
        }
        if (arg0 != 2) {
            this.method1809(109, (class146) null);
        }
        this.field4259 = var2.field2405;
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lhb;")
    public final class146 method1814(int arg0) {
        if (arg0 != -1) {
            method1815((byte) 126);
        }
        class146 var2 = this.field4259;
        field4250++;
        if (this.field4249 == var2) {
            this.field4259 = null;
            return null;
        } else {
            this.field4259 = var2.field2405;
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static void method1815(byte arg0) {
        field4251 = null;
        field4256 = null;
        if (arg0 <= 75) {
            field4245 = null;
        }
        field4245 = null;
        field4246 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1816(int arg0, long arg1) {
        class210.field3375.setTime(new Date(arg1));
        int var3 = class210.field3375.get(7);
        int var4 = class210.field3375.get(5);
        field4255++;
        int var5 = class210.field3375.get(2);
        if (arg0 != 31129) {
            field4251 = null;
        }
        int var6 = class210.field3375.get(1);
        int var7 = class210.field3375.get(11);
        int var8 = class210.field3375.get(12);
        int var9 = class210.field3375.get(13);
        return class184.field3029[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class234.field3716[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static final void method1817(int arg0) {
        if (arg0 >= -95) {
            method1812((byte) -54, false);
        }
        class127.field2095.method1157(760);
        field4258++;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public final void method1818(int arg0) {
        field4241++;
        while (true) {
            class146 var2 = this.field4249.field2407;
            if (this.field4249 == var2) {
                this.field4259 = null;
                int var3 = -98 % ((15 - arg0) / 36);
                return;
            }
            var2.method1074((byte) 85);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class266() {
        this.field4249.field2407 = this.field4249;
        this.field4249.field2405 = this.field4249;
    }
}
