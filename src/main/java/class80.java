import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class80 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1258 = 1;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Lrda;")
    public static class620 field1259 = new class620();

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Ldb;")
    public static class298 field1262 = new class298(64, 6);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lui;")
    public static class213 field1261;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZII)B", line = 4)
    public static final byte method630(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method630(true, -39, 100);
        }
        field1256++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 34)
    public static void method636(byte arg0) {
        field1262 = null;
        field1259 = null;
        if (arg0 < -43) {
            field1261 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILgba;)Ljava/lang/String;", line = 49)
    public static final String method637(int arg0, class625 arg1) {
        field1257++;
        if (client.method1701(arg1).method355((byte) -55) == 0) {
            return null;
        } else if (arg1.field8427 == null || arg1.field8427.trim().length() == 0) {
            return class295.field4171 ? "Hidden-use" : null;
        } else {
            if (arg0 > -10) {
                method637(-54, null);
            }
            return arg1.field8427;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BZII)V")
    public abstract void method631(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III[B)I")
    public abstract int method632(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public abstract void method633(int arg0);

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public abstract void method634(int arg0);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
    public abstract boolean method635(int arg0, int arg1) throws IOException;
}
