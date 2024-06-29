import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class375 extends class264 {

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Lsi;")
    public static class583 field5405 = new class583();

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "S")
    public static short field5410 = 256;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
    public static final boolean method2324(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method2327(-77);
        }
        ++field5406;
        return ~(1024 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILrv;)Lje;")
    public static final class419 method2325(int arg0, class120 arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field5407;
            class269 var2 = class302.method2002(-14432, arg1);
            int var3 = arg1.method871(arg0 + 23994);
            int var4 = arg1.method871(23995);
            int var5 = arg1.method898((byte) -115);
            return new class419(var2.field3774, var2.field3784, var2.field3777, var2.field3783, var2.field3769, var2.field3773, var2.field3781, var2.field3775, var2.field3776, var3, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(ILmfa;)V")
    public class375(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field5408;
        if (arg0 != -38) {
            method2324(52, -50, -40);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field5404;
        if (arg0 != 112) {
            this.method663((byte) -45);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            field5410 = -20;
        }
        ++field5403;
        super.field3733 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)I")
    public final int method2326(byte arg0) {
        ++field5402;
        if (arg0 >= -31) {
            this.method666((byte) 107, 33);
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = -47 / ((arg0 - 1) / 41);
        ++field5409;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lmfa;)V")
    public class375(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
    public static void method2327(int arg0) {
        if (arg0 != 256) {
            method2324(-78, -96, -84);
        }
        field5405 = null;
    }
}
