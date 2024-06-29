import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class224 extends class272 {

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "Z")
    public volatile boolean field3393 = true;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field3391 = 0;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[[I")
    public static int[][] field3392 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "Lus;")
    public static class1 field3395 = new class1(68, -2);

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3399 = "";

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Z")
    public boolean field3397;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Z")
    public boolean field3398;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(B)V")
    public static final void method1437(byte arg0) {
        field3394++;
        if (arg0 <= 108) {
            field3399 = null;
        }
        if (class141.field1878.method657()) {
            class452.method2643(17161);
            class141.field1878.method683(class465.field6503);
            class453.method2661((byte) 127);
        } else {
            class51.method330(class437.field6083, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(B)[B")
    public abstract byte[] method289(byte arg0);

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)I")
    public abstract int method288(int arg0);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(B)V")
    public static void method1438(byte arg0) {
        field3392 = null;
        field3399 = null;
        int var1 = -95 % ((58 - arg0) / 40);
        field3395 = null;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        if (class253.field3720 == null || class311.field4401 == null) {
            class311.field4401 = new int[256];
            class253.field3720 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class253.field3720[var1] = (int) (Math.sin(var2) * 4096.0D);
                class311.field4401[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3390++;
        if (arg0 > -86) {
            field3395 = null;
        }
    }
}
