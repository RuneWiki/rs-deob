import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class272 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4363 = new String[200];

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[[[B")
    public static byte[][][] field4364;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method1837(byte arg0) {
        class160.field2499.method352(true);
        field4365++;
        for (int var1 = 0; var1 < 32; var1++) {
            class83.field1396[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class84.field1425[var2] = 0L;
        }
        class127.field2009 = 0;
        if (arg0 != 4) {
            field4364 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method1838(byte arg0) {
        field4363 = null;
        if (arg0 != 124) {
            field4364 = null;
        }
        field4364 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JZ)V")
    public static final void method1839(long arg0, boolean arg1) {
        field4367++;
        int var3 = class213.field3316 + class283.field4473.field2240;
        if (!class109.field1782) {
            class16.field244 += (float) arg0 * class157.field2445 / 40.0F;
            class142.field2160 += (float) arg0 * class43.field613 / 40.0F;
        }
        if (arg1) {
            field4363 = null;
        }
        int var4 = class176.field2753 + class283.field4473.field2278;
        if ((class140.field2144 - var3) < -500 || (class140.field2144 - var3) > 500 || class25.field332 - var4 < -500 || (class25.field332 - var4) > 500) {
            class25.field332 = var4;
            class140.field2144 = var3;
        }
        if (class25.field332 != var4) {
            class25.field332 = (int) ((long) (var4 - class25.field332) * arg0 / 320L + (long) class25.field332);
        }
        if (class140.field2144 != var3) {
            class140.field2144 = (int) ((long) (var3 - class140.field2144) * arg0 / 320L + (long) class140.field2144);
        }
        class259.method1761((byte) 112);
    }
}
