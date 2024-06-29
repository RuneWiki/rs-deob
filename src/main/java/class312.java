import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class312 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    private int[] field4232;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "J")
    public static long field4235 = 0L;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lhi;")
    public static class45 field4236 = new class45(48, -1);

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4238 = 0;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[Lel;")
    public static class137[] field4240 = new class137[2048];

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lrb;")
    public static class283 field4237 = new class283(22, -1);

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4241 = new String[5];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lza;B)V")
    public static final void method1799(class295 arg0, byte arg1) {
        field4233++;
        if (arg1 != 108) {
            method1801(67);
        }
        if (class170.field2591) {
            class75.method589(arg0, 123);
        } else {
            class294.method1702(arg0, true);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public final int method1800(int arg0, int arg1) {
        field4231++;
        int var3 = (this.field4232.length >> 1) - 1;
        if (arg0 != 18257) {
            field4236 = null;
        }
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4232[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4232[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4240 = null;
        field4236 = null;
        field4241 = null;
        field4237 = null;
        if (arg0 <= 72) {
            field4235 = -41L;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
    public static final void method1802(int arg0, byte arg1) {
        field4234++;
        class314 var2 = class177.method1213(false, 5, arg0);
        var2.method1811((byte) 86);
        if (arg1 <= 32) {
            method1802(85, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([I)V")
    public class312(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4232 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4232[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4232[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4232[var5 + var5] = arg0[var4];
            this.field4232[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1803(int arg0, String arg1) {
        if (arg0 != -6591) {
            field4235 = 57L;
        }
        System.out.println("Error: " + class395.method2339("%0a", false, "\n", arg1));
        field4230++;
    }
}
