import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class86 {

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lof;")
    private class328 field1253 = new class328(64);

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lmn;")
    private class162 field1251;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1254 = -1;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lcg;")
    public static class10 field1252 = new class10(2, 4, 4, 0);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lag;")
    public final class314 method596(int arg0, int arg1) {
        field1249++;
        class328 var3 = this.field1253;
        class314 var4;
        synchronized (this.field1253) {
            var4 = (class314) this.field1253.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 16) {
            method601((byte) -80);
        }
        class162 var5 = this.field1251;
        byte[] var6;
        synchronized (this.field1251) {
            var6 = this.field1251.method1004(16, false, arg0);
        }
        class314 var7 = new class314();
        if (var6 != null) {
            var7.method2101(-21724, new class208(var6));
        }
        class328 var8 = this.field1253;
        synchronized (this.field1253) {
            this.field1253.method2188(arg1 - 139, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method597(int arg0) {
        int var1 = 56 / ((-arg0 - 27) / 58);
        field1252 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public final void method598(int arg0) {
        field1256++;
        class328 var2 = this.field1253;
        synchronized (this.field1253) {
            this.field1253.method2187(~arg0);
            if (arg0 != 0) {
                method601((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
    public final void method599(byte arg0, int arg1) {
        class328 var3 = this.field1253;
        synchronized (this.field1253) {
            if (arg0 > -56) {
                return;
            }
            this.field1253.method2202(0, arg1);
        }
        field1248++;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public final void method600(int arg0) {
        class328 var2 = this.field1253;
        synchronized (this.field1253) {
            if (arg0 != 0) {
                return;
            }
            this.field1253.method2189(false);
        }
        field1255++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method601(byte arg0) {
        class528.field7769.method1096(-2827);
        field1250++;
        class170.field2488.field3162 = 0;
        class283.field4460 = null;
        class414.field6279 = null;
        class541.field7900 = null;
        class471.field7212 = null;
        class279.field4428.field3162 = 0;
        class141.field1907 = 0;
        class513.field7615 = 0;
        for (int var1 = 0; var1 < 100; var1++) {
            class266.field4281[var1] = null;
        }
        class162.field2352 = 0;
        class419.field6353 = 0;
        class229.field3807 = null;
        class314.field4918 = 0;
        class75.field1117 = 0;
        class183.field2658 = null;
        if (arg0 != -18) {
            field1252 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class86(class236 arg0, int arg1, class162 arg2) {
        this.field1251 = arg2;
        if (this.field1251 == null) {
            this.field1257 = 0;
        } else {
            this.field1257 = this.field1251.method1008(16, (byte) -21);
        }
    }
}
