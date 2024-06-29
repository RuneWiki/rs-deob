import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class class153 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2308 = -1;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[BII)V")
    public abstract void method998(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
    public static final boolean method999(byte arg0) {
        field2310++;
        if (class589.field8420) {
            try {
                if ((Boolean) class54.method508((byte) 56, class500.field6968.field3975, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -32) {
            field2308 = 92;
        }
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1000(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public abstract void method1001(int arg0);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([BIII)I")
    public abstract int method1002(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLvc;)I")
    public static final int method1003(boolean arg0, class264 arg1) {
        field2309++;
        if (class406.field5773 == arg1) {
            return 9216;
        } else if (class65.field1105 == arg1) {
            return 34065;
        } else if (class525.field7383 == arg1) {
            return 34066;
        } else {
            if (!arg0) {
                method1003(false, null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public abstract void method1004(int arg0);
}
