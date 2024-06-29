import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class70 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lof;")
    private class328 field1067 = new class328(64);

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field1071 = 0;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lmn;")
    private class162 field1065;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lqu;")
    public static class219 field1066 = new class219(17, -1);

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Lbi;")
    public static class104 field1072 = new class104(26, 2);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Lmd;")
    public final class186 method518(byte arg0, int arg1) {
        field1068++;
        class328 var3 = this.field1067;
        class186 var4;
        synchronized (this.field1067) {
            var4 = (class186) this.field1067.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field1065;
        byte[] var6;
        synchronized (this.field1065) {
            var6 = this.field1065.method1004(4, false, arg1);
        }
        class186 var7 = new class186();
        if (arg0 < 60) {
            this.field1064 = 104;
        }
        var7.field2699 = arg1;
        var7.field2696 = this;
        if (var6 != null) {
            var7.method1159((byte) 118, new class208(var6));
        }
        var7.method1163((byte) 127);
        class328 var8 = this.field1067;
        synchronized (this.field1067) {
            this.field1067.method2188(-127, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Z")
    public static final boolean method519(byte arg0) {
        if (arg0 > -62) {
            return true;
        }
        field1062++;
        if (class304.field4778) {
            try {
                class200.method1370(-78, class339.field5294.field27, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
    public static void method520(byte arg0) {
        if (arg0 != 37) {
            field1072 = null;
        }
        field1072 = null;
        field1066 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public final void method521(int arg0) {
        class328 var2 = this.field1067;
        synchronized (this.field1067) {
            this.field1067.method2187(-1);
        }
        field1070++;
        if (arg0 >= -38) {
            this.field1065 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
    public final void method522(int arg0) {
        field1069++;
        class328 var2 = this.field1067;
        synchronized (this.field1067) {
            this.field1067.method2189(false);
            if (arg0 != -1031) {
                this.method523(13, -26);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
    public final void method523(int arg0, int arg1) {
        field1063++;
        class328 var3 = this.field1067;
        synchronized (this.field1067) {
            if (arg0 != -1) {
                this.field1065 = null;
            }
            this.field1067.method2202(0, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class70(class236 arg0, int arg1, class162 arg2) {
        this.field1065 = arg2;
        this.field1064 = this.field1065.method1008(4, (byte) -21);
    }
}
