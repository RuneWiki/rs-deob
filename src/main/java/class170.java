import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class170 {

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "Lfc;")
    private class262 field2125 = new class262(64);

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
    public int field2129 = 0;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "Lni;")
    private class522 field2120;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2118 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "[I")
    public static int[] field2128 = new int[14];

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "[Lgg;")
    public static class176[] field2121;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)V")
    public final void method983(byte arg0, int arg1) {
        if (arg0 != 30) {
            return;
        }
        class262 var3 = this.field2125;
        synchronized (this.field2125) {
            this.field2125.method1569((byte) 62, arg1);
        }
        field2126++;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2118 = null;
        field2128 = null;
        field2121 = null;
        if (arg0 != 0) {
            method986(false);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V")
    public final void method985(byte arg0) {
        field2117++;
        class262 var2 = this.field2125;
        synchronized (this.field2125) {
            this.field2125.method1575((byte) -118);
        }
        if (arg0 != -46) {
            method988(-103, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
    public static final void method986(boolean arg0) {
        field2116++;
        class414.field5854.method67(arg0);
        for (int var1 = 0; var1 < 32; var1++) {
            class734.field10230[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class636.field8841[var2] = 0L;
        }
        if (arg0) {
            field2122 = 51;
        }
        class616.field8646 = 0;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)Lnba;")
    public final class301 method987(int arg0, int arg1) {
        field2114++;
        class262 var3 = this.field2125;
        class301 var4;
        synchronized (this.field2125) {
            var4 = (class301) this.field2125.method1571(-124, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field2120;
        byte[] var6;
        synchronized (this.field2120) {
            var6 = this.field2120.method2885(arg1, arg0, false);
        }
        class301 var7 = new class301();
        var7.field4073 = arg1;
        var7.field4062 = this;
        if (var6 != null) {
            var7.method1809(arg0 + 107, new class611(var6));
        }
        var7.method1812((byte) 80);
        class262 var8 = this.field2125;
        synchronized (this.field2125) {
            this.field2125.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)I")
    public static final int method988(int arg0, byte arg1) {
        if (arg1 > -51) {
            return -16;
        } else {
            field2127++;
            return arg0 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
    public final void method989(byte arg0) {
        field2123++;
        class262 var2 = this.field2125;
        synchronized (this.field2125) {
            this.field2125.method1563(92);
            if (arg0 != -117) {
                this.field2129 = 123;
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class170(class242 arg0, int arg1, class522 arg2) {
        this.field2120 = arg2;
        this.field2124 = this.field2120.method2901(0, 4);
    }
}
