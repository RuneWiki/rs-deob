import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class27 extends class187 {

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "Ljava/lang/String;")
    public static String field353 = "rating: ";

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field351 = 1;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field343;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "[S")
    public static short[] field347;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 5)
    public static final void method206(int arg0, byte arg1, String arg2) {
        class152.field2402++;
        field350++;
        if (arg1 < 45) {
            field346 = -67;
        }
        class265.field4095.method2064(255, 201);
        class265.field4095.method2006((byte) -126, arg0);
        class265.field4095.method2014(class108.method723(arg2, -40), false);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 26)
    public static final void method207(byte arg0) {
        field349++;
        int var1 = 115 / ((arg0 + 51) / 57);
        if (class159.field2477 != null && class125.field1958 != null) {
            return;
        }
        class125.field1958 = new int[256];
        class159.field2477 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class159.field2477[var2] = (int) (Math.sin(var3) * 4096.0D);
            class125.field1958[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 56)
    public static void method208(byte arg0) {
        field343 = null;
        field347 = null;
        field353 = null;
        if (arg0 != 44) {
            field345 = -91;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 68)
    public class27() {
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lfk;", line = 73)
    public static final class280 method209(int arg0, int arg1) {
        class280 var2 = (class280) class291.field4494.method355((long) arg1, 6487);
        field354++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class284.field4358.method2103(0, arg0, arg1);
        class280 var4 = new class280();
        if (var3 != null) {
            var4.method1847(-22918, new class303(var3));
        }
        class291.field4494.method350((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(I)V", line = 94)
    public class27(int arg0) {
        this.field344 = arg0;
    }
}
