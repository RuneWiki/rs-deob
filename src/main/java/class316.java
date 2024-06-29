import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class316 {

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "S")
    public short field4763;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
    public byte field4760;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "S")
    public short field4767;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Z")
    public boolean field4757;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "S")
    public short field4755;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "B")
    public byte field4765;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Z")
    public static boolean field4761 = false;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
    public static final byte[] method1883(boolean arg0, Object arg1, byte arg2) {
        field4766++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class241.method1447(0, var3) : var3;
        } else if (arg1 instanceof class22) {
            class22 var4 = (class22) arg1;
            return var4.method115(121);
        } else {
            if (arg2 != -82) {
                method1884((byte) 3, 8, null, -43);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILtq;I)V")
    public static final void method1884(byte arg0, int arg1, class427 arg2, int arg3) {
        field4756++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field6218 != null) {
            class298 var4 = new class298();
            var4.field4517 = arg2;
            var4.field4520 = arg2.field6218;
            class94.method704(var4);
        }
        class331.field4966 = arg3;
        class392.field5739 = arg1;
        class357.field5298 = arg2.field6157;
        class306.field4636 = true;
        class262.field3967 = arg2.field6274;
        class217.field3347 = arg2.field6219;
        class142.field2311 = arg2.field6265;
        if (arg0 != 72) {
            field4761 = true;
        }
        client.field3001 = arg2.field6143;
        class288.method1754(arg2, 0);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4763 = (short) arg6;
        this.field4764 = arg1;
        this.field4760 = (byte) arg7;
        this.field4758 = arg11;
        this.field4767 = (short) arg4;
        this.field4757 = arg10;
        this.field4762 = arg2;
        this.field4755 = (short) arg5;
        this.field4754 = arg3;
        this.field4765 = (byte) arg8;
        this.field4759 = arg0;
    }
}
