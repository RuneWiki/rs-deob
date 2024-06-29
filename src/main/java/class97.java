import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class97 extends class86 {

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field1501;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "[[[I")
    public static int[][][] field1498 = new int[2][][];

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "S")
    public static short field1499 = 32767;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "Z")
    public static boolean field1495;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static void method646(byte arg0) {
        field1498 = null;
        if (arg0 < 87) {
            method646((byte) 97);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method330(byte arg0) {
        field1497++;
        if (arg0 < 102) {
            this.field1501 = null;
        }
        return this.field1501;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public static final int method647(int arg0, int arg1, int arg2) {
        field1504++;
        int var3 = arg0 >> 31 & arg1 + arg2;
        return (arg0 + (arg0 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class97(Object arg0) {
        this.field1501 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        field1496++;
        return arg0 <= 99 ? false : false;
    }
}
