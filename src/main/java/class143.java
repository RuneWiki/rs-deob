import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class143 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljj;")
    private class29 field2311 = new class29();

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lu;")
    private class219 field2331 = new class219();

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Lfe;")
    private class97 field2330;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lph;")
    public static class229 field2315 = class266.method1858(")2", 0);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Z")
    public static boolean field2324 = false;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Z")
    public static boolean field2313 = true;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Z")
    public static volatile boolean field2323 = true;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lph;")
    private static class229 field2322 = class266.method1858("Use", 0);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lph;")
    public static class229 field2321 = field2322;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lfe;")
    public static class97 field2317;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Ll;", line = 8)
    public final class80 method1021(int arg0) {
        if (arg0 == 1) {
            field2320++;
            return this.field2330.method718(27263);
        } else {
            return (class80) null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Ll;", line = 19)
    public final class80 method1022(int arg0) {
        field2319++;
        int var2 = 108 % ((arg0 + 51) / 42);
        return this.field2330.method711(0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 43)
    public final void method1023(boolean arg0) {
        if (arg0) {
            method1024(-113);
        }
        field2314++;
        this.field2331.method1530(1);
        this.field2330.method712(0);
        this.field2311 = new class29();
        this.field2329 = this.field2328;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 63)
    public static void method1024(int arg0) {
        if (arg0 != 50) {
            method1024(-94);
        }
        field2317 = null;
        field2315 = null;
        field2321 = null;
        field2322 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 88)
    public static final void method1025(int arg0, int arg1, int arg2) {
        class121.field2033.method37(71, 120);
        class121.field2033.method1207((byte) -2, arg0);
        class121.field2033.method1170(false, arg1);
        if (arg2 != -11981) {
            method1025(20, -23, 40);
        }
        field2312++;
        class299.field4852++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljj;IJ)V", line = 112)
    public final void method1026(class29 arg0, int arg1, long arg2) {
        if (this.field2329 == 0) {
            class29 var5 = this.field2331.method1536((byte) 116);
            var5.method598(56);
            var5.method224(128);
            if (this.field2311 == var5) {
                class29 var6 = this.field2331.method1536((byte) 116);
                var6.method598(69);
                var6.method224(128);
            }
        } else {
            this.field2329--;
        }
        this.field2330.method710(arg0, (byte) -72, arg2);
        if (arg1 != 120) {
            this.method1021(119);
        }
        this.field2331.method1532(arg1 ^ 0x17, arg0);
        field2316++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJ)Ljj;", line = 160)
    public final class29 method1027(int arg0, long arg1) {
        field2310++;
        if (arg0 >= -20) {
            field2324 = false;
        }
        class29 var4 = (class29) this.field2330.method713(3365, arg1);
        if (var4 != null) {
            this.field2331.method1532(112, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V", line = 212)
    public class143(int arg0) {
        this.field2329 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2328 = arg0;
        this.field2330 = new class97(var2);
    }
}
