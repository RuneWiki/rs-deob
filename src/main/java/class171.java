import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class171 {

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    private int field3132 = -1;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    private int field3136 = 0;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lka;")
    private class243 field3130 = new class243();

    @OriginalMember(owner = "client!di", name = "x", descriptor = "Z")
    public boolean field3142 = false;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    private int field3122;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[[I")
    private int[][] field3123;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[Lhb;")
    private class206[] field3134;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lhj;")
    private static class69 field3128 = class181.method1318("green:", (byte) -117);

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lhj;")
    public static class69 field3131 = field3128;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lhj;")
    public static class69 field3129 = class181.method1318("compass", (byte) -111);

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lhj;")
    public static class69 field3124 = class181.method1318("blinken1:", (byte) -113);

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[I")
    public static int[] field3125 = new int[5];

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lhj;")
    public static class69 field3137 = class181.method1318(")4l=", (byte) -114);

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Lhj;")
    public static class69 field3139 = class181.method1318("Okay", (byte) -125);

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Lhj;")
    public static class69 field3133 = field3128;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
    public static int[] field3141;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public final void method1250(int arg0) {
        for (int var2 = 0; var2 < this.field3120; var2++) {
            this.field3123[var2] = null;
        }
        this.field3134 = null;
        this.field3123 = null;
        this.field3130.method1732(arg0 ^ 0x2208);
        this.field3130 = null;
        if (arg0 != 8801) {
            this.method1252(-54, false);
        }
        field3135++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z[Ltk;IIBI)V")
    public static final void method1251(boolean arg0, class50[] arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3140++;
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class50 var7 = arg1[var6];
            if (var7 != null && var7.field778 == arg3) {
                class199.method1450(arg0, arg2, arg5, var7, -124);
                class22.method123(arg5, (byte) 81, var7, arg2);
                if ((var7.field847 - var7.field798) < var7.field829) {
                    var7.field829 = var7.field847 - var7.field798;
                }
                if (var7.field839 - var7.field727 < var7.field792) {
                    var7.field792 = var7.field839 - var7.field727;
                }
                if (var7.field792 < 0) {
                    var7.field792 = 0;
                }
                if (var7.field829 < 0) {
                    var7.field829 = 0;
                }
                if (var7.field884 == 0) {
                    class247.method1745(arg0, var7, -98);
                }
            }
        }
        if (arg4 > -85) {
            method1256((class69) null, -39, false);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)[I")
    public final int[] method1252(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3134 = null;
        }
        field3127++;
        if (this.field3122 == this.field3120) {
            this.field3142 = this.field3134[arg0] == null;
            this.field3134[arg0] = class124.field2304;
            return this.field3123[arg0];
        } else if (this.field3120 == 1) {
            this.field3142 = this.field3132 != arg0;
            this.field3132 = arg0;
            return this.field3123[0];
        } else {
            class206 var3 = this.field3134[arg0];
            if (var3 == null) {
                this.field3142 = true;
                if (this.field3120 > this.field3136) {
                    var3 = new class206(arg0, this.field3136);
                    this.field3136++;
                } else {
                    class206 var4 = (class206) this.field3130.method1729(7113);
                    var3 = new class206(arg0, var4.field3762);
                    this.field3134[var4.field3758] = null;
                    var4.method632(-8296);
                }
                this.field3134[arg0] = var3;
            } else {
                this.field3142 = false;
            }
            this.field3130.method1730(var3, (byte) 56);
            return this.field3123[var3.field3762];
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)[[I")
    public final int[][] method1253(byte arg0) {
        field3138++;
        if (this.field3122 != this.field3120) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3120; var2++) {
            this.field3134[var2] = class124.field2304;
        }
        if (arg0 >= 0) {
            this.field3142 = true;
        }
        return this.field3123;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method1254(int arg0) {
        if (arg0 != -29135) {
            field3133 = null;
        }
        field3121++;
        class164.field3031 = 0L;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public static void method1255(byte arg0) {
        field3124 = null;
        field3137 = null;
        field3133 = null;
        field3139 = null;
        field3141 = null;
        field3128 = null;
        field3131 = null;
        if (arg0 < 11) {
            field3124 = null;
        }
        field3125 = null;
        field3129 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhj;IZ)V")
    public static final void method1256(class69 arg0, int arg1, boolean arg2) {
        field3126++;
        if (arg1 != 0) {
            method1254(51);
        }
        if (arg2) {
            try {
                class255.field4584.getAppletContext().showDocument(arg0.method467(class255.field4584.getCodeBase(), 114), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class255.field4584.getAppletContext().showDocument(arg0.method467(class255.field4584.getCodeBase(), 98), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V")
    public class171(int arg0, int arg1, int arg2) {
        this.field3122 = arg1;
        this.field3120 = arg0;
        this.field3123 = new int[this.field3120][arg2];
        this.field3134 = new class206[this.field3122];
    }
}
