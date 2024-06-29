import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class345 {

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "Lda;")
    public static class66 field4815;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "[J")
    public static long[] field4812;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIIZI)V", line = 7)
    public static final void method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if ((arg6 ? class21.field353.field10094.method2896(-37) : class21.field353.field10061.method2896(arg1 + 6)) != 0 && arg2 != 0 && class565.field8020 < 50 && arg5 != -1) {
            class262.field3842[class565.field8020++] = new class481((byte) (arg6 ? 3 : 2), arg5, arg2, arg4, arg3, arg0, arg7, null);
        }
        field4816++;
        if (arg1 != -51) {
            field4813 = 65;
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(II)V", line = 25)
    public class345(int arg0, int arg1) {
        this.field4811 = arg1;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 35)
    public static final void method2186(String arg0, int arg1, String arg2) {
        class55.field709 = arg1;
        field4808++;
        class104.field1206 = 1;
        class642.method3660(arg1 + 11085, false, false, arg2, arg0);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BIII)I", line = 45)
    public static final int method2187(byte arg0, int arg1, int arg2, int arg3) {
        field4810++;
        if (arg0 >= -75) {
            field4815 = null;
        }
        if (arg1 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = (arg1 & 0x7F) * arg3 + (arg2 & 0x7F) * var4 >> 7;
        int var6 = (arg1 & 0x380) * arg3 + (arg2 & 0x380) * var4 >> 7;
        int var7 = (arg2 & 0xFC00) * var4 + ((arg1 & 0xFC00) * arg3) >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V", line = 69)
    public static void method2188(int arg0) {
        field4815 = null;
        field4812 = null;
        if (arg0 != 896) {
            field4813 = 98;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)Z", line = 82)
    public static final boolean method2189(int arg0, int arg1) {
        field4814++;
        if (arg0 < 27) {
            field4815 = null;
        }
        return arg1 == 7 || arg1 == 9;
    }

    @OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;", line = 98)
    public final String toString() {
        field4809++;
        throw new IllegalStateException();
    }
}
