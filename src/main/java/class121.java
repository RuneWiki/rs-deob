import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class121 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1893 = "Close";

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Z")
    public static volatile boolean field1896 = true;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1898 = "Cancel";

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)[B", line = 4)
    public static final synchronized byte[] method880(boolean arg0, int arg1) {
        field1894++;
        if (arg1 == 100 && class90.field1345 > 0) {
            byte[] var2 = class94.field1407[--class90.field1345];
            class94.field1407[class90.field1345] = null;
            return var2;
        } else if (arg0) {
            return (byte[]) null;
        } else if (arg1 == 5000 && class293.field4484 > 0) {
            byte[] var3 = class296.field4539[--class293.field4484];
            class296.field4539[class293.field4484] = null;
            return var3;
        } else if (arg1 == 30000 && class306.field4668 > 0) {
            byte[] var4 = class166.field2504[--class306.field4668];
            class166.field2504[class306.field4668] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 51)
    public static void method881(byte arg0) {
        field1893 = null;
        field1898 = null;
        int var1 = -54 % ((41 - arg0) / 56);
    }
}
