import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class494 extends class11 {

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    private int field7217;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "Z")
    public static boolean field7219 = false;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "Lem;")
    public static class150 field7221 = null;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "Ljava/lang/String;")
    public static String field7216;

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V", line = 4)
    public class494(int arg0) {
        super(0, true);
        this.field7217 = 4096;
        this.field7217 = arg0;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V", line = 14)
    public static void method2891(int arg0) {
        field7216 = null;
        if (arg0 != 30537) {
            method2891(-78);
        }
        field7221 = null;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V", line = 25)
    public class494() {
        this(4096);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(II)[I", line = 34)
    public final int[] method44(int arg0, int arg1) {
        ++field7222;
        if (arg0 >= -42) {
            this.field7217 = -9;
        }
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            class91.method681(var3, 0, class90.field1316, this.field7217);
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lsi;II)V", line = 59)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field7217 = (arg0.method2348(-2) << 12) / 255;
        }
        if (arg1 > -40) {
            method2892((byte) -88);
        }
        ++field7220;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V", line = 85)
    public static final void method2892(byte arg0) {
        ++field7218;
        if (class218.field3047.length() != 0) {
            int var1 = -20 % ((arg0 - 12) / 36);
            class156.method1040(-21411, "--> " + class218.field3047);
            class326.method1893(51, false, class218.field3047);
            class218.field3047 = "";
            class453.field6662 = 0;
            class378.field5542 = 0;
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(II)Lwl;", line = 110)
    public static final class281 method2893(int arg0, int arg1) {
        ++field7224;
        if (arg1 != 0) {
            method2893(-91, 60);
        }
        class281 var2 = (class281) class422.field6179.method1073((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class30.field400.method727(arg0, 1, arg1 + -102);
            class281 var4 = new class281();
            var4.field3850 = arg0;
            if (var3 != null) {
                var4.method1675((byte) 39, new class391(var3));
            }
            var4.method1674(-97);
            if (~var4.field3851 == -3 && class302.field4139.method1492((long) arg0, arg1 + 6340) == null) {
                class302.field4139.method1487(arg1 ^ -71, (long) arg0, new class500(class493.field7201));
                class521.field7709[class493.field7201++] = var4;
            }
            class422.field6179.method1072((long) arg0, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V", line = 148)
    public static final void method2894(int arg0) {
        class526.field7788 = null;
        ++field7223;
        class50.field602 = null;
        class135.field1949 = null;
        class345.field4954 = null;
        class528.field7802 = null;
        class30.field403 = null;
        class441.field6532 = null;
        class297.field4084 = null;
        class183.field2681 = null;
        class451.field6653 = null;
        class474.field6928 = null;
        class400.field5878 = null;
        class157.field2386 = null;
        class134.field1947 = null;
        class64.field807 = null;
        if (arg0 < 33) {
            field7219 = true;
        }
        class372.field5448 = null;
        class511.field7573 = null;
        class278.field3807 = null;
    }
}
