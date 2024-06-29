import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class262 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[Z")
    public static boolean[] field4498 = new boolean[8];

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
    public static boolean field4499 = false;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lcd;")
    public static class64 field4506 = class44.method335((byte) 71, "hint_mapmarkers");

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 4)
    public static void method1843(int arg0) {
        field4506 = null;
        if (arg0 != -19844) {
            method1843(-37);
        }
        field4498 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)La;", line = 16)
    public class262 method1088(int arg0, int arg1, int arg2) {
        field4503++;
        return this;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 24)
    public static final void method1844(int arg0, int arg1) {
        field4504++;
        if (arg1 <= 54) {
            field4498 = (boolean[]) null;
        }
        class74.field1403 = arg0;
        class160.method1154(5405, 3);
        class160.method1154(5405, 4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;IIIZ)V", line = 42)
    public void method1071(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4502++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V", line = 57)
    public void method1522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 8) {
            field4501++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLsa;)V", line = 69)
    public static final void method1845(boolean arg0, class103 arg1) {
        if (class29.field482 == arg1.field1877 || arg1.field1902 == -1 || arg1.field1874 != 0 || arg1.field1892 + 1 > class281.method1944(arg1.field1902, 0).field3419[arg1.field1885]) {
            int var2 = class29.field482 - arg1.field1888;
            int var3 = arg1.field1877 - arg1.field1888;
            int var4 = arg1.field1908 * 128 + (arg1.method325(-12808) * 64);
            int var5 = arg1.field1870 * 128 + arg1.method325(-12808) * 64;
            int var6 = arg1.field1907 * 128 + arg1.method325(-12808) * 64;
            int var7 = arg1.field1847 * 128 + arg1.method325(-12808) * 64;
            arg1.field1859 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field1865 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        arg1.field1890 = 0;
        if (arg1.field1906 == 0) {
            arg1.field1889 = 1024;
        }
        field4500++;
        if (arg1.field1906 == 1) {
            arg1.field1889 = 1536;
        }
        if (!arg0) {
            field4498 = (boolean[]) null;
        }
        if (arg1.field1906 == 2) {
            arg1.field1889 = 0;
        }
        if (arg1.field1906 == 3) {
            arg1.field1889 = 512;
        }
        arg1.field1863 = arg1.field1889;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()Z", line = 116)
    public boolean method1069() {
        field4505++;
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()I")
    public abstract int method48();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
