import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class23 extends class181 {

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[B")
    public byte[] field382;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "Z")
    public static boolean field376 = true;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lhl;")
    public static class139 field375 = new class139(64);

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lpk;")
    public static class237 field377;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lpk;")
    public static class237 field384;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[S")
    public static short[] field380;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[[[B")
    public static byte[][][] field383;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static void method157(int arg0) {
        field375 = null;
        field377 = null;
        field384 = null;
        field380 = null;
        field383 = null;
        if (arg0 < 61) {
            field379 = -71;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method158(boolean arg0, Object arg1, int arg2) {
        field381++;
        if (arg2 != 27155) {
            method157(-125);
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class216.method1453(var3, (byte) 70) : var3;
        } else if (arg1 instanceof class86) {
            class86 var4 = (class86) arg1;
            return var4.method658(-1621);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static final void method159(int arg0) {
        field374++;
        class287.field4396++;
        class59.field964.method1540(138, (byte) -2);
        if (arg0 <= 44) {
            method159(48);
        }
        class59.field964.method428(class157.field2305, (byte) 46);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
    public class23(byte[] arg0) {
        this.field382 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method160(byte arg0, String arg1, int arg2) {
        field378++;
        if (arg0 < 71) {
            method159(-113);
        }
        class105 var3 = class9.method72(2, -1, arg2);
        var3.method763(false);
        var3.field1550 = arg1;
    }
}
