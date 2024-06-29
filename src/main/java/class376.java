import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class376 extends class130 {

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Ljava/lang/String;")
    public String field5543;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Z")
    public boolean field5548;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "J")
    public long field5553;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field5550;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Z")
    public boolean field5541;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/lang/String;")
    public String field5540;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field5549 = -1;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5544 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field5555 = 1;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Lbe;")
    public static class151 field5554;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lza;")
    public static class299 field5542;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    private static final void method2398(String arg0, int arg1, String arg2) {
        if (arg1 != 2) {
            method2399((byte) 28);
        }
        class23.field262 = 1;
        field5539++;
        class125.field1877 = -1;
        class236.method1602(arg2, arg0, -120);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method2399(byte arg0) {
        if (arg0 >= 52) {
            field5542 = null;
            field5554 = null;
            field5544 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class376(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field5543 = arg1;
        this.field5548 = arg9;
        this.field5553 = arg5;
        this.field5550 = arg6;
        this.field5552 = arg4;
        this.field5546 = arg3;
        this.field5547 = arg2;
        this.field5541 = arg8;
        this.field5551 = arg7;
        this.field5540 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
    public static final void method2400(int arg0, byte arg1) {
        field5545++;
        if (class460.field6813 == arg0) {
            return;
        }
        if (class460.field6813 == 0) {
            class51.method333(109);
        }
        if (arg1 != 107) {
            field5555 = 31;
        }
        if (arg0 == 12) {
            class227.method1551(class240.field3598, (byte) -119, class490.field7159, class125.field1877);
        }
        if (arg0 != 12 && class76.field1290 != null) {
            class76.field1290.method2155(false);
            class76.field1290 = null;
        }
        if (arg0 == 2) {
            class319.method2112(class338.field5078 != class134.field2010, (byte) 96);
        }
        if (arg0 == 6) {
            class312.method2073(class141.field2104 != class134.field2010, 30724);
        }
        if (arg0 == 4) {
            method2398(class240.field3598, 2, class490.field7159);
        } else if (arg0 == 5) {
            class227.method1551(class240.field3598, (byte) -95, class490.field7159, class125.field1877);
        } else if (arg0 == 8) {
            class227.method1551(class240.field3598, (byte) 122, class490.field7159, class125.field1877);
        } else if (arg0 == 11) {
            method2398(class240.field3598, 2, class490.field7159);
        }
        if (class471.method2855(class460.field6813, arg1 ^ 0x30)) {
            class103.field1596.field1355 = 2;
            class105.field1610.field1355 = 2;
            class472.field6932.field1355 = 2;
            class83.field1337.field1355 = 2;
            class93.field1495.field1355 = 2;
            class55.field836.field1355 = 2;
            class12.field133.field1355 = 2;
        }
        if (class471.method2855(arg0, arg1 ^ 0x32)) {
            class200.field3101 = 0;
            class228.field3454 = 1;
            class47.field739 = 0;
            class416.field6116 = 0;
            class49.field765 = 1;
            class20.method126(true, -124);
            class103.field1596.field1355 = 1;
            class105.field1610.field1355 = 1;
            class472.field6932.field1355 = 1;
            class83.field1337.field1355 = 1;
            class93.field1495.field1355 = 1;
            class55.field836.field1355 = 1;
            class12.field133.field1355 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class321.method2122(-127);
        }
        if (arg0 == 1) {
            class115.method879(2048, field5542, class510.field7431);
        } else {
            class206.method1439(79);
        }
        boolean var2 = arg0 == 1 || class36.method238(2, arg0) || class242.method1638(arg0, 1);
        boolean var3 = class460.field6813 == 1 || class36.method238(arg1 - 105, class460.field6813) || class242.method1638(class460.field6813, 1);
        if (var2 != var3) {
            if (var2) {
                class235.field3548 = class148.field2194;
                if (class40.field667.field4192 == 0) {
                    class93.method792(2, 0);
                } else {
                    class194.method1377(class40.field667.field4192, 0, 1, class148.field2194, false, 2, class417.field6135);
                }
                class201.field3108.method2520((byte) -123, false);
            } else {
                class93.method792(2, arg1 - 107);
                class201.field3108.method2520((byte) -120, true);
            }
        }
        if (class471.method2855(arg0, 98) || arg0 == 12) {
            field5542.method503();
        }
        class460.field6813 = arg0;
    }
}
