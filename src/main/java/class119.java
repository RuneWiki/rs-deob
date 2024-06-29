import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class119 {

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public int field1904 = 2;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public int field1905 = -1;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public int field1909 = 64;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    public int field1910 = 1;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "Z")
    public boolean field1913 = false;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "Z")
    public boolean field1906 = false;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public int field1908 = 64;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1914 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lee;BII)V", line = 3)
    private final void method967(class677 arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1905 = arg0.method3807(-1);
            if (this.field1905 == 65535) {
                this.field1905 = -1;
            }
        } else if (arg2 == 2) {
            this.field1909 = arg0.method3807(-1) + 1;
            this.field1908 = arg0.method3807(-1) + 1;
        } else if (arg2 == 3) {
            arg0.method3811(123);
        } else if (arg2 == 4) {
            this.field1904 = arg0.method3821((byte) 85);
        } else if (arg2 == 5) {
            this.field1910 = arg0.method3821((byte) 126);
        } else if (arg2 == 6) {
            this.field1906 = true;
        } else if (arg2 == 7) {
            this.field1913 = true;
        }
        if (arg1 > -86) {
            this.field1904 = -88;
        }
        field1912++;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lee;II)V", line = 59)
    public final void method968(class677 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field1907++;
        while (true) {
            int var4 = arg0.method3821((byte) 82);
            if (var4 == 0) {
                return;
            }
            this.method967(arg0, (byte) -92, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 83)
    public static void method969(int arg0) {
        field1914 = null;
        if (arg0 != -2) {
            method969(119);
        }
    }
}
