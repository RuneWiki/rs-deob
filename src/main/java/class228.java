import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class228 extends class212 {

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lqa;")
    public static class78 field3566 = class106.method675((byte) 92);

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[[[I")
    public static int[][][] field3568 = new int[2][][];

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "F")
    public static float field3571 = 0.0F;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3573 = new String[100];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
    public static int[] field3567 = new int[500];

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static volatile int field3572 = 0;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field3569 = -1;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Z")
    public static boolean field3574 = false;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "[I")
    public static int[] field3575;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[[[I")
    public static int[][][] field3576;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILbj;)V")
    public static final void method1508(int arg0, class215 arg1) {
        int var2 = arg1.method1347(true);
        class89.field1282 = new class250[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class89.field1282[var3] = new class250();
            class89.field1282[var3].field3903 = arg1.method1347(true);
            class89.field1282[var3].field3902 = arg1.method1372((byte) 66);
        }
        field3563++;
        class268.field4298 = arg1.method1347(true);
        class185.field2802 = arg1.method1347(true);
        class92.field1354 = arg1.method1347(true);
        class250.field3912 = new class248[class185.field2802 + 1 - class268.field4298];
        for (int var4 = 0; var4 < class92.field1354; var4++) {
            int var5 = arg1.method1347(true);
            class248 var6 = class250.field3912[var5] = new class248();
            var6.field3946 = arg1.method1374((byte) -60);
            var6.field3941 = arg1.method1383((byte) -92);
            var6.field3878 = class268.field4298 + var5;
            var6.field3881 = arg1.method1372((byte) 66);
            var6.field3886 = arg1.method1372((byte) 66);
        }
        class226.field3535 = arg1.method1383((byte) -62);
        class231.field3612 = true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method1509(byte arg0) {
        class34.field522++;
        field3564++;
        if (arg0 != 56) {
            method1511(-60);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method1510(int arg0, int arg1) {
        field3565++;
        class35.field531.method943(arg1, true);
        if (arg0 == -5008) {
            class126.field1759.method943(arg1, true);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3575 = null;
        field3576 = null;
        field3566 = null;
        field3567 = null;
        field3568 = null;
        if (arg0 != 1303) {
            method1512(125, -32L);
        }
        field3573 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)V")
    public static final void method1512(int arg0, long arg1) {
        field3561++;
        class231.field3614.field3280 = 0;
        class231.field3614.method1363(21, -89);
        class231.field3614.method1386(arg1, true);
        class154.field2133 = arg0;
        class179.field2714 = 1;
        class19.field318 = 0;
        class168.field2405 = -3;
    }
}
