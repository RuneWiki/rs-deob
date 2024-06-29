import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class81 extends class273 {

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "Ljd;")
    public static class86 field1581 = class122.method868(" (X", true);

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "Ljd;")
    public static class86 field1580 = class122.method868("Verbindung mit Update)2Server)3)3)3", true);

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1586 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!lk", name = "fb", descriptor = "Luk;")
    public static class96 field1592 = new class96(64);

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!lk", name = "bb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!lk", name = "db", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!lk", name = "eb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!lk", name = "cb", descriptor = "[S")
    public static short[] field1589;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
    public static void method567(int arg0) {
        field1592 = null;
        field1580 = null;
        field1589 = null;
        field1586 = null;
        field1581 = null;
        if (arg0 != 10497) {
            field1589 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class81() {
        this(4096);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(BI)Z")
    public static final boolean method568(byte arg0, int arg1) {
        if (arg0 != 32) {
            method571(-6, -49, (class86) null);
        }
        ++field1582;
        return (arg1 & 1039818069) >> 29 != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(SI)Z")
    public static final boolean method569(short arg0, int arg1) {
        ++field1590;
        if (~arg0 != -5 && arg0 != 3 && arg0 != 40 && ~arg0 != -52 && arg0 != 42 && arg0 != 19 && arg0 != 24 && ~arg0 != -22) {
            if (arg0 != 35 && ~arg0 != -34 && arg0 != 1007 && ~arg0 != -1003) {
                if (~arg0 != -19 && arg0 != 14 && ~arg0 != -17 && arg0 != 39 && arg0 != 17) {
                    if (arg0 != 29 && arg0 != 5 && arg0 != 43 && ~arg0 != -39 && ~arg0 != -27 && ~arg0 != -14) {
                        int var2 = 127 % ((-13 - arg1) / 59);
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
    private class81(int arg0) {
        super(0, true);
        this.field1587 = 4096;
        this.field1587 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILbj;I)Z")
    public static final boolean method570(int arg0, class151 arg1, int arg2) {
        ++field1588;
        if (arg0 != 14) {
            return false;
        } else {
            byte[] var3 = arg1.method1074(arg2, (byte) 123);
            if (var3 == null) {
                return false;
            } else {
                class143.method1021(0, var3);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1583;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            return null;
        } else {
            if (super.field4800.field3160) {
                class250.method1688(var3, 0, class176.field3200, this.field1587);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field1587 = (arg1.method1408((byte) -128) << 12) / 255;
        }
        if (arg2 >= -16) {
            method568((byte) 8, 45);
        }
        ++field1584;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILjd;)V")
    public static final void method571(int arg0, int arg1, class86 arg2) {
        class161 var3 = class204.method1456(true, 3, arg1);
        ++field1585;
        var3.method1174(arg0 ^ arg0);
        var3.field3020 = arg2;
    }
}
