import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class277 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public int field4071 = 16777215;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public int field4078 = 8;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "Lku;")
    public static class232 field4082 = new class232(8);

    @OriginalMember(owner = "client!io", name = "n", descriptor = "Lwf;")
    public static class79 field4084 = new class79(68, -1);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Lmj;")
    public static class430 field4076;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4085;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "Z")
    public boolean field4074;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lmj;I)[Lae;")
    public static final class150[] method1755(class430 arg0, int arg1) {
        field4079++;
        if (!arg0.method2546((byte) 117)) {
            return new class150[0];
        } else if (arg1 == -12867) {
            class366 var2 = arg0.method2525(126);
            while (var2.field5253 == 0) {
                class111.method713(126, 10L);
            }
            if (var2.field5253 == 2) {
                return new class150[0];
            }
            int[] var3 = (int[]) var2.field5255;
            class150[] var4 = new class150[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class150 var6 = new class150();
                var4[var5] = var6;
                var6.field2240 = var3[var5 << 2];
                var6.field2241 = var3[(var5 << 2) + 1];
                var6.field2237 = var3[(var5 << 2) + 2];
                var6.field2236 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lrp;ZI)V")
    private final void method1756(class276 arg0, boolean arg1, int arg2) {
        field4083++;
        if (arg2 == 1) {
            this.field4078 = arg0.method1729(65280);
        } else if (arg2 == 2) {
            this.field4074 = true;
        } else if (arg2 == 3) {
            this.field4073 = arg0.method1702(-61);
            this.field4075 = arg0.method1702(-124);
            this.field4072 = arg0.method1702(-45);
        } else if (arg2 == 4) {
            this.field4077 = arg0.method1701(-23121);
        } else if (arg2 == 5) {
            this.field4080 = arg0.method1729(65280);
        } else if (arg2 == 6) {
            this.field4071 = arg0.method1748(false);
        }
        if (!arg1) {
            this.field4077 = 94;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method1757(byte arg0) {
        field4085 = null;
        field4084 = null;
        if (arg0 == -28) {
            field4076 = null;
            field4082 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lrp;Z)V")
    public final void method1758(class276 arg0, boolean arg1) {
        field4081++;
        if (arg1) {
            this.field4078 = -85;
        }
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                return;
            }
            this.method1756(arg0, true, var3);
        }
    }
}
