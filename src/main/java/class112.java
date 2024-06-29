import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class112 extends class418 {

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1851;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "Z")
    public static boolean field1852 = false;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Ldu;")
    public static class360 field1850 = new class360(8);

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field1853 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "J")
    public static long field1856 = 0L;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "Ltj;")
    public static class198 field1854;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 6)
    public final void method949(int arg0) {
        if (arg0 >= -17) {
            field1850 = null;
        }
        this.field1851.method3731();
        field1849++;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V", line = 17)
    public static void method950(int arg0) {
        field1854 = null;
        field1850 = null;
        field1853 = null;
        if (arg0 != 26162) {
            method950(64);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V", line = 39)
    public class112(int arg0) {
        this.field1851 = new NativeHeap(arg0);
    }
}
