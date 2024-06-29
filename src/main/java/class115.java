import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class115 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lpg;")
    public class672 field1541;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
    public int[] field1545;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjr;)Ljava/lang/String;", line = 7)
    public static final String method850(int arg0, class96 arg1) {
        if (arg0 != -14478) {
            method851(null, 112);
        }
        field1543++;
        return class149.method1050(true, arg1, 32767);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 20)
    public static final byte[] method851(File arg0, int arg1) {
        field1542++;
        if (arg1 >= -69) {
            method851(null, -72);
        }
        return class14.method67((int) arg0.length(), 87, arg0);
    }
}
