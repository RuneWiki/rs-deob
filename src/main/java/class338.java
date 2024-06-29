import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class338 extends class476 {

    @OriginalMember(owner = "client!iia", name = "t", descriptor = "Lfca;")
    private class661 field4118 = new class661();

    @OriginalMember(owner = "client!iia", name = "N", descriptor = "I")
    private int field4137 = 256;

    @OriginalMember(owner = "client!iia", name = "O", descriptor = "I")
    private int field4138 = 0;

    @OriginalMember(owner = "client!iia", name = "Q", descriptor = "I")
    private int field4140 = 256;

    @OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
    private int field4129;

    @OriginalMember(owner = "client!iia", name = "y", descriptor = "I")
    public static int field4123 = 0;

    @OriginalMember(owner = "client!iia", name = "B", descriptor = "Lfca;")
    public static class661 field4126 = new class661();

    @OriginalMember(owner = "client!iia", name = "P", descriptor = "[I")
    public static int[] field4139 = new int[32];

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "F")
    public static float field4130;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!iia", name = "u", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!iia", name = "v", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!iia", name = "w", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!iia", name = "x", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!iia", name = "A", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!iia", name = "C", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!iia", name = "G", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!iia", name = "H", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!iia", name = "K", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!iia", name = "M", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!iia", name = "I", descriptor = "Z")
    private boolean field4133;

    @OriginalMember(owner = "client!iia", name = "J", descriptor = "Z")
    private boolean field4134;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4139[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 8)
    public final synchronized void method36(int arg0) {
        field4120++;
        if (this.field4133) {
            return;
        }
        while (true) {
            class461 var2 = this.method1947(true);
            if (var2 == null) {
                if (this.field4134) {
                    this.method1946(-10364);
                    class582.field7365.method1938((byte) -71);
                }
                return;
            }
            if (arg0 < (var2.field6008[0].length - this.field4136)) {
                this.field4136 += arg0;
                return;
            }
            arg0 -= var2.field6008[0].length - this.field4136;
            this.method1956(20037);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)Lpt;", line = 51)
    private final synchronized class461 method1947(boolean arg0) {
        if (!arg0) {
            this.field4134 = false;
        }
        field4121++;
        return (class461) this.field4118.method3591(0);
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)V", line = 63)
    public final void method1948(int arg0, int arg1) {
        field4131++;
        this.field4137 = arg0;
        if (arg1 != -2444) {
            this.method1957(null, 57);
        }
        this.field4140 = arg0;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V", line = 76)
    public final synchronized void method1949(int arg0) {
        this.field4134 = true;
        field4124++;
        if (arg0 <= 119) {
            this.method1957(null, -99);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "()I", line = 87)
    public final int method31() {
        field4132++;
        return 1;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 96)
    public static final void method1950(String arg0, int arg1) {
        field4135++;
        if (arg0 == null) {
            return;
        }
        if (!(class703.field9297 < 200 || class159.field2065) || class703.field9297 >= 200) {
            class648.method3504(-124, 4, class659.field8555.method3589(class496.field6338, -22395));
            return;
        }
        String var2 = class463.method2604(arg0, (byte) -40);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class703.field9297; var3++) {
            String var8 = class463.method2604(class176.field2319[var3], (byte) -2);
            if (var8 != null && var8.equals(var2)) {
                class648.method3504(arg1 ^ 0xFFFFFFAB, 4, arg0 + class659.field8582.method3589(class496.field6338, -22395));
                return;
            }
            if (class686.field8837[var3] != null) {
                String var9 = class463.method2604(class686.field8837[var3], (byte) -19);
                if (var9 != null && var9.equals(var2)) {
                    class648.method3504(-102, 4, arg0 + class659.field8582.method3589(class496.field6338, -22395));
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class738.field9988; var4++) {
            String var6 = class463.method2604(class202.field2803[var4], (byte) 107);
            if (var6 != null && var6.equals(var2)) {
                class648.method3504(-122, 4, class659.field8587.method3589(class496.field6338, arg1 ^ 0xFFFFA885) + arg0 + class659.field8588.method3589(class496.field6338, -22395));
                return;
            }
            if (class281.field3634[var4] != null) {
                String var7 = class463.method2604(class281.field3634[var4], (byte) -127);
                if (var7 != null && var7.equals(var2)) {
                    class648.method3504(-100, 4, class659.field8587.method3589(class496.field6338, arg1 ^ 0xFFFFA885) + arg0 + class659.field8588.method3589(class496.field6338, -22395));
                    return;
                }
            }
        }
        if (class463.method2604(class422.field5564.field375, (byte) -39).equals(var2)) {
            class648.method3504(-92, 4, class659.field8585.method3589(class496.field6338, -22395));
            return;
        }
        class190.field2643++;
        class13 var5 = class659.method3587(class68.field909, 98, class32.field321);
        var5.field130.method1491(-129, class32.method168(arg0, 22));
        var5.field130.method1547(arg0, -6457);
        class116.method679(var5, arg1);
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "()Lkm;", line = 193)
    public final class476 method40() {
        field4119++;
        return null;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)V", line = 207)
    public final synchronized void method1951(int arg0, boolean arg1) {
        field4116++;
        if (arg0 == 0) {
            this.field4133 = arg1;
        }
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(Z)I", line = 220)
    public final synchronized int method1952(boolean arg0) {
        field4115++;
        return arg0 ? -38 : this.field4138;
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(Z)D", line = 232)
    public final synchronized double method1953(boolean arg0) {
        field4122++;
        if (!arg0) {
            method1950(null, -115);
        }
        if (this.field4138 < 1) {
            return -1.0D;
        } else {
            class461 var2 = (class461) this.field4118.method3591(0);
            return var2 == null ? -1.0D : var2.field6006 - (double) ((float) var2.field6008[0].length / (float) class791.field10837);
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "()Lkm;", line = 252)
    public final class476 method42() {
        field4117++;
        return null;
    }

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "(I)V", line = 261)
    public static void method1954(int arg0) {
        if (arg0 != -17296) {
            method1954(101);
        }
        field4126 = null;
        field4139 = null;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IDI)Lpt;", line = 274)
    public final class461 method1955(int arg0, double arg1, int arg2) {
        int var5 = -22 / ((44 - arg0) / 58);
        field4127++;
        long var6 = (long) (this.field4129 << 0 | arg2);
        class461 var8 = (class461) class582.field7365.method1941(var6, (byte) 80);
        if (var8 == null) {
            var8 = new class461(new short[this.field4129][arg2], arg1);
        } else {
            var8.field6006 = arg1;
            class582.field7365.method1939(var6, -100);
        }
        return var8;
    }

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "(I)V", line = 297)
    private final synchronized void method1956(int arg0) {
        if (arg0 != 20037) {
            this.method40();
        }
        field4128++;
        class461 var2 = this.method1947(true);
        if (var2 != null) {
            var2.method1946(-10364);
            this.field4136 = 0;
            this.field4138--;
            class582.field7365.method1936(var2, var2.method2596(arg0 - 35530), -106);
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I)V", line = 427)
    public class338(int arg0) {
        this.field4129 = arg0;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "([III)V", line = 321)
    public final synchronized void method33(int[] arg0, int arg1, int arg2) {
        field4125++;
        if (this.field4133) {
            return;
        }
        if (this.method1947(true) != null) {
            int var4 = arg1 + arg2;
            if (class654.field8426) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field4129 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class461 var7 = this.method1947(true);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field6008;
                while (arg1 < var4 && this.field4136 < var8[0].length) {
                    if (class654.field8426) {
                        arg0[arg1++] = var8[var5][this.field4136] * this.field4140;
                        arg0[arg1++] = var8[var6][this.field4136] * this.field4137;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field4136] * this.field4140 + var8[var6][this.field4136] * this.field4137;
                    }
                    this.field4136++;
                }
                if (var8[0].length <= this.field4136) {
                    this.method1956(20037);
                }
            }
        } else if (this.field4134) {
            this.method1946(-10364);
            class582.field7365.method1938((byte) -109);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lpt;I)V", line = 388)
    public final synchronized void method1957(class461 arg0, int arg1) {
        field4114++;
        if (arg1 >= -77) {
            this.field4140 = 114;
        }
        while (this.field4138 >= 100) {
            this.field4118.method3599(-49);
            this.field4138--;
        }
        this.field4118.method3593(arg0, 15);
        this.field4138++;
    }
}
