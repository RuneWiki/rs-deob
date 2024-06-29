import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class517 {

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    public int field6587 = 0;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public int field6588 = 0;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "Ltq;")
    private class536 field6590 = new class536(64);

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "Lnw;")
    private class462 field6591 = null;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "Lwm;")
    private class30 field6583;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "Lwm;")
    private class30 field6581;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
    public static int field6589 = 0;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "Lrda;")
    public static class467 field6586 = new class467(16);

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V", line = 3)
    public static void method2858(int arg0) {
        field6586 = null;
        if (arg0 != 0) {
            method2860(false, false);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)Ldm;", line = 16)
    public final class104 method2859(byte arg0, int arg1) {
        field6585++;
        class104 var3 = (class104) this.field6590.method2931((long) arg1, (byte) -104);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field6581.method139(1, (byte) -94, arg1 & 0x7FFF);
        } else {
            var4 = this.field6583.method139(1, (byte) -94, arg1);
        }
        if (arg0 > -104) {
            this.method2859((byte) 46, -51);
        }
        class104 var5 = new class104();
        var5.field1400 = this;
        if (var4 != null) {
            var5.method600(new class234(var4), (byte) -108);
        }
        if (arg1 >= 32768) {
            var5.method606(-17881);
        }
        this.field6590.method2918((long) arg1, var5, 101);
        return var5;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZZ)I", line = 52)
    public static final int method2860(boolean arg0, boolean arg1) {
        field6582++;
        if (arg1) {
            method2860(false, false);
        }
        int var2 = class596.field7567;
        if (var2 == 0) {
            return arg0 ? 0 : class329.field4033;
        } else if (var2 == 1) {
            return class329.field4033;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lgh;JI[I)Ljava/lang/String;", line = 96)
    public final String method2861(class54 arg0, long arg1, int arg2, int[] arg3) {
        field6584++;
        if (arg2 != 0) {
            return null;
        }
        if (this.field6591 != null) {
            String var6 = this.field6591.method1663(arg1, arg3, 0, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(ILwm;Lwm;Lnw;)V", line = 144)
    public class517(int arg0, class30 arg1, class30 arg2, class462 arg3) {
        this.field6591 = arg3;
        this.field6583 = arg1;
        this.field6581 = arg2;
        if (this.field6583 != null) {
            this.field6587 = this.field6583.method138(0, 1);
        }
        if (this.field6581 != null) {
            this.field6588 = this.field6581.method138(0, 1);
        }
    }
}
