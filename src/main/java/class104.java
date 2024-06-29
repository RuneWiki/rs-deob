import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class104 extends InputStream {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Z")
    public static boolean field1794 = true;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Z")
    public static volatile boolean field1796 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1798 = "red:";

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lbm;")
    public static class307 field1799;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lbf;")
    public static class328 field1803;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIBI)V", line = 11)
    public static final void method675(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class202.field3278 != 0 && arg1 != 0 && class48.field986 < 50 && arg2 != -1) {
            class135.field2266[class48.field986] = arg2;
            class202.field3283[class48.field986] = arg1;
            class328.field5034[class48.field986] = arg4;
            class278.field4262[class48.field986] = null;
            class2.field35[class48.field986] = 0;
            class72.field1500[class48.field986] = arg0;
            class48.field986++;
        }
        if (arg3 > -46) {
            field1798 = (String) null;
        }
        field1801++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V", line = 38)
    public static final void method676(int arg0, byte arg1) {
        class281 var2 = (class281) class21.field449.method303((long) arg0, (byte) 124);
        if (arg1 != -40) {
            return;
        }
        field1795++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4327.length; var3++) {
                var2.field4327[var3] = -1;
                var2.field4324[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILbm;II)[Ltf;", line = 64)
    public static final class112[] method677(int arg0, class307 arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            method678(-20);
        }
        field1802++;
        return class135.method885(arg3, arg1, -10948, arg0) ? class17.method124((byte) -126) : null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 86)
    public static void method678(int arg0) {
        field1803 = null;
        if (arg0 != -5118) {
            field1799 = (class307) null;
        }
        field1799 = null;
        field1798 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I", line = 112)
    public static final int method679(int arg0, int arg1, int arg2) {
        int var3 = class342.method2375(true, 4, arg1 + 45365, arg2 + 91923) + (class342.method2375(true, 2, arg1 + 10294, arg2 + 37821) - 128 >> 1) + (class342.method2375(true, 1, arg1, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        field1805++;
        if (arg0 != 19675) {
            method677(-26, (class307) null, 8, -125);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "read", descriptor = "()I", line = 133)
    public final int read() {
        field1804++;
        class127.method843(-64, 30000L);
        return -1;
    }
}
