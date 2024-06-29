import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class268 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field3924 = 1;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lmt;")
    public static class290 field3928 = new class290(8);

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3930;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)V")
    public static final void method1815(boolean arg0, int arg1) {
        field3929++;
        class480.field6802 = arg1;
        class349.field4804 = 3;
        class182.field2752 = 100;
        if (!arg0) {
            field3928 = null;
        }
        class221.field3193 = -1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method1816(byte arg0) {
        field3928 = null;
        if (arg0 != -14) {
            field3928 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    public class268() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([BLkk;Z)V")
    public final void method1817(byte[] arg0, class161 arg1, boolean arg2) {
        field3925++;
        if (arg1.field2262[arg1.field2298] != 31 || arg1.field2262[arg1.field2298 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3930 == null) {
            this.field3930 = new Inflater(true);
        }
        try {
            this.field3930.setInput(arg1.field2262, arg1.field2298 + 10, arg1.field2262.length - 10 - (arg1.field2298 + 8));
            this.field3930.inflate(arg0);
        } catch (Exception var4) {
            this.field3930.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (!arg2) {
            field3928 = null;
        }
        this.field3930.reset();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILnl;I)Lkg;")
    public static final class194 method1818(int arg0, class435 arg1, int arg2) {
        field3927++;
        byte[] var3 = arg1.method2650((byte) -72, arg2);
        if (arg0 == 0) {
            return var3 == null ? null : new class194(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
    private class268(int arg0, int arg1, int arg2) {
    }
}
