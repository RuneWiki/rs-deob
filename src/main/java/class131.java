import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class131 {

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field2033 = 0;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Z")
    public boolean field2038 = false;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field2040 = 0;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
    public static boolean field2030 = false;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[Z")
    public static boolean[] field2028 = new boolean[100];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Luf;")
    public static class168 field2032 = class148.method1019(-1720, "cookiehost");

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lie;")
    public class47 field2039;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2035;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 9)
    public static final void method914(int arg0) {
        field2036++;
        if (arg0 >= -70) {
            method916((byte) 50);
        }
        class110.method818(-1445985368);
        System.gc();
        class109.method810(25, 8858);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 26)
    public static final void method915(int arg0) {
        if (arg0 != -18753) {
            field2028 = (boolean[]) null;
        }
        field2034++;
        if (class51.field621 == 5) {
            class51.field621 = 6;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 48)
    public static void method916(byte arg0) {
        field2032 = null;
        int var1 = -43 % ((-arg0 - 16) / 53);
        field2028 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Luf;I)V", line = 79)
    public static final void method917(class168 arg0, int arg1) {
        if (arg1 < 114) {
            return;
        }
        field2037++;
        for (class175 var2 = (class175) class140.field2163.method442(65293); var2 != null; var2 = (class175) class140.field2163.method440(3)) {
            if (var2.field2826.method1170(arg0, (byte) -85)) {
                class207.field3401 = var2;
                return;
            }
        }
    }
}
