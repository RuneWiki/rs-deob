import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class30 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public int field424 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Z")
    public static boolean field427 = true;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field425 = 127;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Leg;")
    public static class33 field422;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[[[I")
    public static int[][][] field426;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILji;)V")
    private final void method210(int arg0, class225 arg1) {
        if (arg0 != 16) {
            method211(-105, (byte) -54);
        }
        field419++;
        while (true) {
            int var3 = arg1.method1580(-52);
            if (var3 == 0) {
                return;
            }
            this.method213(var3, -87, arg1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I")
    public static final int method211(int arg0, byte arg1) {
        field423++;
        return arg1 >= -91 ? 52 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method212(int arg0) {
        if (arg0 != 9298) {
            field422 = null;
        }
        field426 = null;
        field422 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILji;)V")
    private final void method213(int arg0, int arg1, class225 arg2) {
        if (arg0 == 5) {
            this.field424 = arg2.method1593(true);
        }
        field421++;
        if (arg1 >= -1) {
            method211(50, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Lrf;")
    public static final class30 method214(byte arg0, int arg1) {
        field428++;
        class30 var2 = (class30) class230.field4125.method991((long) arg1, -25858);
        if (arg0 > -31) {
            field426 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field1119.method826((byte) 35, 16, arg1);
        class30 var4 = new class30();
        if (var3 != null) {
            var4.method210(16, new class225(var3));
        }
        class230.field4125.method987(var4, (long) arg1, -2438);
        return var4;
    }
}
