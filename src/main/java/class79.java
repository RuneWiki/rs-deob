import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class79 {

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "Z")
    public boolean field1483;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "S")
    public short field1481;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "B")
    public byte field1482;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "S")
    public short field1487;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "S")
    public short field1484;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Lqaa;")
    public static class27 field1475 = new class27(76, -1);

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Lsha;", line = 6)
    public static final class725 method780(byte arg0) {
        if (arg0 != -110) {
            method780((byte) 37);
        }
        field1478++;
        return class542.field7619;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 19)
    public static final void method781(int arg0) {
        field1490++;
        class370.method2317();
        if (arg0 != 255) {
            method784(null, true, null, false, -107);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)I", line = 34)
    public static final int method782(int arg0, int arg1) {
        field1477++;
        if (arg1 != 76) {
            field1485 = -33;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", line = 62)
    public static final void method783(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5, int arg6, String arg7, String arg8) {
        field1480++;
        class146 var9 = class127.field1925[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class127.field1925[var10] = class127.field1925[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class146(arg4, arg6, arg2, arg3, arg7, arg0, arg1, arg8);
        } else {
            var9.method1137(arg1, arg2, arg6, arg3, arg0, arg7, arg4, arg8, 75);
        }
        if (arg5 > -72) {
            method784(null, true, null, true, 101);
        }
        class127.field1925[0] = var9;
        class105.field1751 = class374.field5247;
        class70.field1264++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V", line = 90)
    public static final void method784(String arg0, boolean arg1, String arg2, boolean arg3, int arg4) {
        if (arg1) {
            field1485 = -46;
        }
        field1476++;
        class96.method868(arg0, arg4, true, -75, arg3, arg2, -1);
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V", line = 101)
    public static void method785(byte arg0) {
        if (arg0 < 83) {
            method782(-84, -100);
        }
        field1475 = null;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 111)
    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1474 = arg0;
        this.field1483 = arg10;
        this.field1489 = arg11;
        this.field1481 = (short) arg6;
        this.field1482 = (byte) arg8;
        this.field1488 = arg2;
        this.field1486 = arg3;
        this.field1487 = (short) arg5;
        this.field1479 = arg1;
        this.field1484 = (short) arg4;
    }
}
