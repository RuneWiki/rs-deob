import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class196 {

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Lal;")
    public static class87 field2366;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "[[B")
    public static byte[][] field2362;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BI[S)[S", line = 10)
    public static final short[] method1136(byte arg0, int arg1, short[] arg2) {
        if (arg0 >= -46) {
            return null;
        } else {
            field2360++;
            short[] var3 = new short[arg1];
            class652.method3675(arg2, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BILlt;)V", line = 24)
    public static final void method1137(byte arg0, int arg1, class617 arg2) {
        field2363++;
        class13.field115 = false;
        class179.field2218 = 0;
        class134.method748(127, arg2);
        class253.method1449(18956, arg2);
        if (class13.field115) {
            System.out.println("---endgpp---");
        }
        if (arg0 != 101) {
            method1139(-112);
        }
        if (arg2.field6215 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field6215 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method1138(int arg0, int arg1, int arg2) {
        field2361++;
        if (arg2 != 21056) {
            field2362 = null;
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!cea", name = "toString", descriptor = "()Ljava/lang/String;", line = 59)
    public final String toString() {
        field2364++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V", line = 67)
    public static void method1139(int arg0) {
        field2366 = null;
        field2362 = null;
        if (arg0 != 16) {
            field2362 = null;
        }
    }
}
