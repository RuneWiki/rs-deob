import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class156 {

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Lqa;")
    public class101 field2345 = new class101();

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2330 = -1;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "[S")
    public static short[] field2339 = new short[256];

    @OriginalMember(owner = "client!om", name = "k", descriptor = "[I")
    public static int[] field2340 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[I")
    public static int[] field2337 = new int[14];

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field2336 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2347 = new String[200];

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lqa;")
    private class101 field2346;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lqa;I)V", line = 4)
    public final void method1108(class101 arg0, int arg1) {
        if (arg1 != 65280) {
            this.method1116(-63);
        }
        field2341++;
        if (arg0.field1599 != null) {
            arg0.method714(arg1 ^ 0xFF74);
        }
        arg0.field1595 = this.field2345;
        arg0.field1599 = this.field2345.field1599;
        arg0.field1599.field1595 = arg0;
        arg0.field1595.field1599 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lqa;", line = 23)
    public final class101 method1109(int arg0) {
        field2344++;
        int var2 = -88 % ((-arg0 - 40) / 56);
        class101 var3 = this.field2345.field1595;
        if (this.field2345 == var3) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var3.field1595;
            return var3;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lqa;", line = 46)
    public final class101 method1110(boolean arg0) {
        field2334++;
        class101 var2 = this.field2345.field1599;
        if (!arg0) {
            method1117(-106);
        }
        if (this.field2345 == var2) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var2.field1599;
            return var2;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Lqa;I)V", line = 74)
    public final void method1111(class101 arg0, int arg1) {
        if (arg0.field1599 != null) {
            arg0.method714(104);
        }
        if (arg1 != -8) {
            this.field2345 = (class101) null;
        }
        arg0.field1599 = this.field2345;
        field2338++;
        arg0.field1595 = this.field2345.field1595;
        arg0.field1599.field1595 = arg0;
        arg0.field1595.field1599 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 99)
    public static final void method1112(int arg0, int arg1) {
        field2342++;
        int var2 = 26 % ((arg0 - 28) / 41);
        class132.field2031.method2174(-12634, arg1);
        class84.field1244.method2174(-12634, arg1);
        class314.field4749.method2174(-12634, arg1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 113)
    public final void method1113(byte arg0) {
        field2333++;
        while (true) {
            class101 var2 = this.field2345.field1595;
            if (this.field2345 == var2) {
                if (arg0 <= 15) {
                    this.method1116(-101);
                }
                this.field2346 = null;
                return;
            }
            var2.method714(-90);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Lqa;", line = 147)
    public final class101 method1114(int arg0) {
        field2335++;
        if (arg0 != -13454) {
            this.field2345 = (class101) null;
        }
        class101 var2 = this.field2345.field1595;
        if (this.field2345 == var2) {
            return null;
        } else {
            var2.method714(-82);
            return var2;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)Lqa;", line = 169)
    public final class101 method1115(byte arg0) {
        if (arg0 <= 51) {
            this.field2346 = (class101) null;
        }
        field2331++;
        class101 var2 = this.field2346;
        if (this.field2345 == var2) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var2.field1595;
            return var2;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 225)
    public class156() {
        this.field2345.field1599 = this.field2345;
        this.field2345.field1595 = this.field2345;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)Lqa;", line = 206)
    public final class101 method1116(int arg0) {
        class101 var2 = this.field2346;
        field2332++;
        int var3 = 116 % ((arg0 - 84) / 37);
        if (this.field2345 == var2) {
            this.field2346 = null;
            return null;
        } else {
            this.field2346 = var2.field1599;
            return var2;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 235)
    public static void method1117(int arg0) {
        field2347 = null;
        if (arg0 != 31768) {
            field2339 = (short[]) null;
        }
        field2337 = null;
        field2340 = null;
        field2339 = null;
    }
}
