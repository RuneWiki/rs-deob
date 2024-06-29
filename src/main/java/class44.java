import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class44 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ltq;")
    private class536 field493 = new class536(64);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lwm;")
    private class30 field501;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public final void method262(boolean arg0) {
        field495++;
        if (arg0) {
            this.field493 = null;
        }
        class536 var2 = this.field493;
        synchronized (this.field493) {
            this.field493.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method263(int arg0) {
        class536 var2 = this.field493;
        synchronized (this.field493) {
            int var3 = -49 % ((arg0 - 17) / 50);
            this.field493.method2919(0);
        }
        field498++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lus;")
    public final class475 method264(int arg0, int arg1) {
        field496++;
        class536 var3 = this.field493;
        class475 var4;
        synchronized (this.field493) {
            var4 = (class475) this.field493.method2931((long) arg0, (byte) -99);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field501;
        byte[] var6;
        synchronized (this.field501) {
            var6 = this.field501.method139(arg1, (byte) -94, arg0);
        }
        class475 var7 = new class475();
        if (var6 != null) {
            var7.method2678(new class234(var6), -5514);
        }
        class536 var8 = this.field493;
        synchronized (this.field493) {
            this.field493.method2918((long) arg0, var7, 118);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZILha;III)V")
    public static final void method265(int arg0, int arg1, boolean arg2, int arg3, class570 arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            method265(-38, -29, true, 38, null, 25, -92, 55);
        }
        field494++;
        arg4.method3068(false, arg1, arg5, arg3, arg7, arg0);
        arg4.method3068(!arg2, arg1 + 1, arg5 + 1, arg3 - 2, arg6, 16);
        arg4.method3075(arg1 + 1, arg3 + -2, arg0 - 19, (byte) 85, arg5 + 18, arg6);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public final void method266(int arg0, boolean arg1) {
        class536 var3 = this.field493;
        synchronized (this.field493) {
            this.field493.method2928(arg1, arg0);
        }
        field500++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZLd;ILjava/awt/Canvas;I)Lha;")
    public static final class570 method267(boolean arg0, class284 arg1, int arg2, Canvas arg3, int arg4) {
        field499++;
        if (!arg0) {
            method267(true, null, -2, null, 70);
        }
        return new class156(arg3, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
    public static final void method268(boolean arg0, int arg1, int arg2) {
        field497++;
        if (!arg0) {
            field492 = 45;
        }
        class133 var3 = class343.field4206[arg2][arg1];
        if (var3 != null) {
            class404.field5368 = var3.field1769;
            class392.field5178 = var3.field1761;
            class663.field8658 = var3.field1768;
        }
        class177.method1136(-585072574);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class44(class473 arg0, int arg1, class30 arg2) {
        this.field501 = arg2;
        if (this.field501 != null) {
            this.field501.method138(0, 54);
        }
    }
}
