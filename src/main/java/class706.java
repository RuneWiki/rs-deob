import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class706 {

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public int field9932;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field9929;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "J")
    public long field9935;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Ljava/lang/String;")
    public String field9934;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Ljava/lang/String;")
    public String field9931;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field9936 = 0;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Lsb;")
    public static class266 field9930 = new class266(31, 8);

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "Lja;")
    public static class254 field9937 = new class254(9, 0, 4, 1);

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[I")
    public static int[] field9939 = new int[200];

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "[I")
    public static int[] field9941 = new int[2];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Lom;")
    public static class344 field9942;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "[I")
    public static int[] field9938;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[BI)[B")
    public static final byte[] method3940(int arg0, byte[] arg1, int arg2) {
        field9933++;
        if (arg0 > -117) {
            return null;
        } else {
            byte[] var3 = new byte[arg2];
            class692.method3873(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)V")
    public static void method3941(boolean arg0) {
        field9941 = null;
        field9942 = null;
        field9938 = null;
        field9930 = null;
        field9937 = null;
        if (!arg0) {
            field9939 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static final void method3942(int arg0) {
        if (class459.field6559 != null) {
            class459.field6559.method1265((byte) -67);
            class77.field1562 = null;
            class459.field6559 = null;
        }
        field9928++;
        if (arg0 != 1) {
            method3941(false);
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class706(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field9932 = arg0;
        this.field9929 = arg2;
        this.field9935 = arg4;
        this.field9934 = arg1;
        this.field9931 = arg3;
    }
}
