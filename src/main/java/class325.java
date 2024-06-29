import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class325 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Luc;")
    private class202 field5076 = new class202();

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    private int field5070;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lpd;")
    private class3 field5075;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[Lvi;")
    public static class7[] field5071 = new class7[4];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
    public static int[] field5068 = new int[2048];

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lok;")
    public static class160 field5074 = new class160(64);

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5083 = 50;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5082 = "Please wait...";

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method2279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class323.method2273(arg0, arg3, class221.field3443[arg4], arg2, 41);
        int var8 = arg1 - 1;
        class323.method2273(arg0, arg3, class221.field3443[arg1], arg2, 49);
        if (arg5 > -109) {
            field5068 = (int[]) null;
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class221.field3443[var6];
            var7[arg0] = var7[arg2] = arg3;
        }
        field5084++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I", line = 37)
    public final int method2280(byte arg0) {
        int var2 = 0;
        if (arg0 > -121) {
            method2279(42, 47, 4, -88, -90, 99);
        }
        for (class107 var3 = (class107) this.field5076.method1449(84); var3 != null; var3 = (class107) this.field5076.method1448(23)) {
            if (!var3.method485(16)) {
                var2++;
            }
        }
        field5078++;
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 61)
    public final void method2281(int arg0, long arg1, Object arg2) {
        field5073++;
        this.method2286(arg1, (byte) -108);
        if (this.field5070 == 0) {
            class107 var5 = (class107) this.field5076.method1452(13634);
            var5.method489(false);
            var5.method981(-121);
        } else {
            this.field5070--;
        }
        class337 var6 = new class337(arg2);
        this.field5075.method75(var6, ~arg0, arg1);
        this.field5076.method1453(var6, -36);
        var6.field2003 = (long) arg0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 92)
    public final void method2282(byte arg0) {
        field5072++;
        this.field5076.method1454(-31175);
        this.field5075.method83(-94);
        this.field5070 = this.field5081;
        if (arg0 >= -118) {
            method2284(-60);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 105)
    public final void method2283(byte arg0) {
        field5085++;
        if (arg0 != 77) {
            this.method2280((byte) 62);
        }
        for (class107 var2 = (class107) this.field5076.method1449(11); var2 != null; var2 = (class107) this.field5076.method1448(23)) {
            if (var2.method485(16)) {
                var2.method489(false);
                var2.method981(-124);
                this.field5070++;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 130)
    public static void method2284(int arg0) {
        field5068 = null;
        if (arg0 != 1044) {
            method2287(-18, 41);
        }
        field5074 = null;
        field5071 = null;
        field5082 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V", line = 144)
    public final void method2285(int arg0, byte arg1) {
        if (class289.field4551 != null) {
            for (class107 var3 = (class107) this.field5076.method1449(119); var3 != null; var3 = (class107) this.field5076.method1448(23)) {
                if (var3.method485(16)) {
                    if (var3.method486(93) == null) {
                        var3.method489(false);
                        var3.method981(-123);
                        this.field5070++;
                    }
                } else if (((long) arg0) < (++var3.field2003)) {
                    class107 var4 = class289.field4551.method675((byte) -77, var3);
                    this.field5075.method75(var4, -1, var3.field879);
                    class253.method1752(11, var4, var3);
                    var3.method489(false);
                    var3.method981(-119);
                }
            }
        }
        field5069++;
        int var5 = -90 / ((arg1 - 50) / 47);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JB)V", line = 197)
    public final void method2286(long arg0, byte arg1) {
        field5077++;
        if (arg1 > -89) {
            method2287(-23, -48);
        }
        class107 var4 = (class107) this.field5075.method79(arg0, (byte) 0);
        if (var4 != null) {
            var4.method489(false);
            var4.method981(-118);
            this.field5070++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 218)
    public static final int method2287(int arg0, int arg1) {
        if (class319.field5005 != null) {
            class319.field5005.method371(-2);
            class319.field5005 = null;
        }
        class89.field1431++;
        field5080++;
        if (class89.field1431 > 4) {
            class89.field1431 = 0;
            class152.field2495 = 0;
            return arg0;
        }
        if (class264.field3913 == class149.field2427) {
            class264.field3913 = class139.field2254;
        } else {
            class264.field3913 = class149.field2427;
        }
        class152.field2495 = arg1;
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(JB)Ljava/lang/Object;", line = 256)
    public final Object method2288(long arg0, byte arg1) {
        field5079++;
        if (arg1 < 82) {
            return (Object) null;
        }
        class107 var4 = (class107) this.field5075.method79(arg0, (byte) 0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method486(117);
        if (var5 == null) {
            var4.method489(false);
            var4.method981(-117);
            this.field5070++;
            return null;
        }
        if (var4.method485(16)) {
            class337 var6 = new class337(var5);
            this.field5075.method75(var6, -1, var4.field879);
            this.field5076.method1453(var6, 118);
            var6.field2003 = 0L;
            var4.method489(false);
            var4.method981(-125);
        } else {
            this.field5076.method1453(var4, -105);
            var4.field2003 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 314)
    public class325(int arg0) {
        this.field5081 = arg0;
        int var2 = 1;
        this.field5070 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field5075 = new class3(var2);
    }
}
