import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class637 {

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "Lhm;")
    private class208 field8624 = new class208(64);

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lpfa;")
    public class275 field8633;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "Lpfa;")
    private class275 field8632;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field8626;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)I")
    public static final int method3565(int arg0) {
        if (arg0 != -3452) {
            field8626 = null;
        }
        field8629++;
        return class185.field2182.method2424(arg0 + 3570);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
    public final void method3566(int arg0, int arg1) {
        class208 var3 = this.field8624;
        synchronized (this.field8624) {
            this.field8624.method1222(arg0 + 14506, arg1);
        }
        if (arg0 != 58) {
            field8625 = -79;
        }
        field8622++;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
    public static final void method3567(byte arg0) {
        if (class476.field5923.toLowerCase().indexOf("microsoft") == -1) {
            class555.field6938[61] = 27;
            class555.field6938[46] = 72;
            class555.field6938[45] = 26;
            class555.field6938[93] = 43;
            class555.field6938[59] = 57;
            class555.field6938[91] = 42;
            class555.field6938[44] = 71;
            if (class476.field5906 == null) {
                class555.field6938[192] = 58;
                class555.field6938[222] = 59;
            } else {
                class555.field6938[222] = 58;
                class555.field6938[192] = 28;
                class555.field6938[520] = 59;
            }
            class555.field6938[47] = 73;
            class555.field6938[92] = 74;
        } else {
            class555.field6938[187] = 27;
            class555.field6938[189] = 26;
            class555.field6938[192] = 58;
            class555.field6938[221] = 43;
            class555.field6938[220] = 74;
            class555.field6938[191] = 73;
            class555.field6938[222] = 59;
            class555.field6938[188] = 71;
            class555.field6938[186] = 57;
            class555.field6938[223] = 28;
            class555.field6938[190] = 72;
            class555.field6938[219] = 42;
        }
        int var1 = 44 % ((arg0 - 4) / 61);
        field8630++;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)V")
    public final void method3568(byte arg0) {
        field8627++;
        class208 var2 = this.field8624;
        synchronized (this.field8624) {
            this.field8624.method1224(false);
        }
        if (arg0 != -69) {
            method3567((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)V")
    public static void method3569(byte arg0) {
        field8626 = null;
        if (arg0 != -118) {
            field8625 = 60;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "(B)V")
    public final void method3570(byte arg0) {
        field8631++;
        if (arg0 <= -92) {
            class208 var2 = this.field8624;
            synchronized (this.field8624) {
                this.field8624.method1218(110);
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(II)Lr;")
    public final class171 method3571(int arg0, int arg1) {
        field8621++;
        class208 var3 = this.field8624;
        class171 var4;
        synchronized (this.field8624) {
            var4 = (class171) this.field8624.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field8632;
        byte[] var6;
        synchronized (this.field8632) {
            var6 = this.field8632.method1659(arg0 ^ 0xFFFFFFA7, arg1, arg0);
        }
        class171 var7 = new class171();
        var7.field2017 = this;
        if (var6 != null) {
            var7.method1031(new class572(var6), arg0 ^ 0xFFFFFF90);
        }
        class208 var8 = this.field8624;
        synchronized (this.field8624) {
            this.field8624.method1230((byte) -122, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lbs;ILpfa;Lpfa;)V")
    public class637(class643 arg0, int arg1, class275 arg2, class275 arg3) {
        this.field8633 = arg3;
        this.field8632 = arg2;
        this.field8632.method1655(3, (byte) -82);
    }
}
