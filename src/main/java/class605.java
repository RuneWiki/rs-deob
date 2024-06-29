import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class605 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public abstract void method3269(byte arg0);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public abstract void method3271(byte arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
    public abstract boolean method3270(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
    public static final boolean method3466(int arg0, int arg1, int arg2) {
        field8714++;
        if (arg0 == -26619) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB[B)V")
    public abstract void method3265(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[B)I")
    public abstract int method3267(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}
