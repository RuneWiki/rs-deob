import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class113 extends class134 {

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1925 = "Examine";

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field1927 = 0;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field1933 = 99;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[I")
    public static int[] field1931 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Z")
    public static boolean field1934 = true;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Laj;")
    public static class151 field1926;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Laj;")
    public static class151 field1930;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Lem;")
    public static class292 field1935;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
    public static void method870(int arg0) {
        field1925 = null;
        field1935 = null;
        field1930 = null;
        field1931 = null;
        field1926 = null;
        if (arg0 != 0) {
            field1933 = 112;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class113() {
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
    public class113(int arg0) {
        this.field1929 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLmg;)V")
    public static final void method871(byte arg0, class248 arg1) {
        field1928++;
        long var2 = 0L;
        if (arg1.field4141 == 0) {
            var2 = class185.method1342(arg1.field4140, arg1.field4132, arg1.field4146);
        }
        int var4 = -1;
        int var5 = 0;
        if (arg1.field4141 == 1) {
            var2 = class299.method2050(arg1.field4140, arg1.field4132, arg1.field4146);
        }
        if (arg1.field4141 == 2) {
            var2 = class76.method539(arg1.field4140, arg1.field4132, arg1.field4146);
        }
        int var6 = 0;
        if (arg1.field4141 == 3) {
            var2 = class20.method133(arg1.field4140, arg1.field4132, arg1.field4146);
        }
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = ((int) var2 & 0x3AF9F4) >> 20;
            var5 = ((int) var2 & 0x7C0EE) >> 14;
        }
        arg1.field4138 = var5;
        arg1.field4133 = var4;
        arg1.field4148 = var6;
        if (arg0 > -9) {
            field1935 = null;
        }
    }
}
