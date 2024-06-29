import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class78 extends class181 {

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
    public static boolean field1274 = false;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "[I")
    public static int[] field1276 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!co", name = "n", descriptor = "Lqt;")
    public static class459 field1278 = new class459(79, 4);

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1278 = null;
        field1276 = null;
        if (arg0 != -21173) {
            method600(64, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Lhp;")
    public abstract class221 method599(int arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
    public static final void method600(int arg0, byte arg1) {
        field1275++;
        class429.field6176 = arg0;
        class511 var2 = class53.field980;
        synchronized (class53.field980) {
            class53.field980.method2990((byte) -120);
        }
        if (arg1 > -22) {
            method598(-110);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1277++;
        class275 var5 = class213.method1433((byte) 104, 10, arg3);
        if (arg0 != 79) {
            method601(-85, 34, -28, 99, -50);
        }
        var5.method1778(0);
        var5.field4104 = arg2;
        var5.field4106 = arg4;
        var5.field4113 = arg1;
    }
}
