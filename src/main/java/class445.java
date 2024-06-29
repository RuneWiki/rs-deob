import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class445 {

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Ltja;")
    private class288 field5961 = new class288(64);

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Lbt;")
    private class48 field5960;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public int field5966;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lhj;")
    public static class596 field5958 = new class596(121, 6);

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Llja;")
    public static class744 field5964 = new class744(78, -1);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Lhq;")
    public final class170 method2618(int arg0, int arg1) {
        field5963++;
        class288 var3 = this.field5961;
        class170 var4;
        synchronized (this.field5961) {
            var4 = (class170) this.field5961.method1684((long) arg0, -359);
            int var5 = -13 % ((16 - arg1) / 57);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var6 = this.field5960;
        byte[] var7;
        synchronized (this.field5960) {
            var7 = this.field5960.method437(16, (byte) -53, arg0);
        }
        class170 var8 = new class170();
        if (var7 != null) {
            var8.method1164(new class403(var7), false);
        }
        class288 var9 = this.field5961;
        synchronized (this.field5961) {
            this.field5961.method1686(-25638, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public static final void method2619(int arg0) {
        field5962++;
        int var1 = 0;
        if (arg0 != 800) {
            return;
        }
        if (class118.field1503 != null) {
            var1 = class118.field1503.field10639.method1290(0);
        }
        if (var1 == 2) {
            int var4 = class484.field6751 <= 800 ? class484.field6751 : 800;
            class449.field6100 = (class484.field6751 - var4) / 2;
            int var5 = class39.field570 <= 600 ? class39.field570 : 600;
            class701.field9880 = var4;
            class705.field9921 = var5;
            class269.field3181 = 0;
        } else if (var1 == 1) {
            int var2 = class484.field6751 > 1024 ? 1024 : class484.field6751;
            int var3 = class39.field570 > 768 ? 768 : class39.field570;
            class701.field9880 = var2;
            class449.field6100 = (class484.field6751 - var2) / 2;
            class269.field3181 = 0;
            class705.field9921 = var3;
        } else {
            class705.field9921 = class39.field570;
            class449.field6100 = 0;
            class701.field9880 = class484.field6751;
            class269.field3181 = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public static void method2620(int arg0) {
        field5964 = null;
        if (arg0 <= -104) {
            field5958 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
    public final void method2621(int arg0) {
        field5967++;
        if (arg0 != -769) {
            method2620(-10);
        }
        class288 var2 = this.field5961;
        synchronized (this.field5961) {
            this.field5961.method1687((byte) 61);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public final void method2622(boolean arg0) {
        field5965++;
        if (!arg0) {
            this.field5966 = 12;
        }
        class288 var2 = this.field5961;
        synchronized (this.field5961) {
            this.field5961.method1690(0);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2623(int arg0, String arg1) {
        field5957++;
        if (arg0 != 0) {
            field5964 = null;
        }
        return class7.method137(10, true, 0, arg1);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
    public final void method2624(int arg0, int arg1) {
        field5959++;
        class288 var3 = this.field5961;
        synchronized (this.field5961) {
            this.field5961.method1694(arg0, -94);
        }
        if (arg1 != 31713) {
            field5958 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class445(class441 arg0, int arg1, class48 arg2) {
        this.field5960 = arg2;
        if (this.field5960 == null) {
            this.field5966 = 0;
        } else {
            this.field5966 = this.field5960.method431(4, 16);
        }
    }
}
