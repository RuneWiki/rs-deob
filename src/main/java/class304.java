import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class304 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field3952 = new Random();

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field3957 = 0;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "Lob;")
    public static class4 field3958;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "Ljava/lang/String;")
    public String field3959;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "[I")
    public static int[] field3955;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method1782(int arg0) {
        if (arg0 != 32768) {
            method1784((byte) -36);
        }
        field3952 = null;
        field3955 = null;
        field3958 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1783(int arg0, byte arg1, int arg2) {
        if (arg1 != 97) {
            field3957 = -120;
        }
        field3954++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static final void method1784(byte arg0) {
        field3951++;
        int var1 = 0;
        for (int var2 = 0; var2 < class514.field7179; var2++) {
            for (int var3 = 0; var3 < class456.field6281; var3++) {
                if (class721.method4043(true, var1, class352.field4549, arg0 - 25701, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 63) {
            method1783(-55, (byte) -99, -37);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method1099(byte arg0) throws IOException;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1785(int arg0) throws IOException {
        if (arg0 == 8883) {
            field3956++;
            return new Socket(this.field3959, this.field3953);
        } else {
            return null;
        }
    }
}
