import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class61 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "Lco;")
    private class210 field759 = new class210(64);

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lg;")
    private class470 field762;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field760 = -1;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "[Z")
    public static boolean[] field764 = new boolean[100];

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lrg;")
    public static class395 field758;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Lrr;")
    public final class216 method312(int arg0, boolean arg1) {
        if (arg1) {
            method315((class280) null, (class78) null, 78, -119, -113);
        }
        field761++;
        class210 var3 = this.field759;
        class216 var4;
        synchronized (this.field759) {
            var4 = (class216) this.field759.method1163((byte) -48, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field762.method2768(-20472, arg0, 19);
        class216 var6 = new class216();
        if (var5 != null) {
            var6.method1210(new class179(var5), -31818);
        }
        class210 var7 = this.field759;
        synchronized (this.field759) {
            this.field759.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)V")
    public static final void method313(byte arg0, int arg1) {
        class325.field4690 = -1;
        field763++;
        int var2 = 109 % ((arg0 - 48) / 56);
        if (arg1 == 37) {
            class429.field6192 = 3.0F;
        } else if (arg1 == 50) {
            class429.field6192 = 4.0F;
        } else if (arg1 == 75) {
            class429.field6192 = 6.0F;
        } else if (arg1 == 100) {
            class429.field6192 = 8.0F;
        } else if (arg1 == 200) {
            class429.field6192 = 16.0F;
        }
        class325.field4690 = -1;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method314(int arg0) {
        if (arg0 != -2401) {
            field764 = null;
        }
        field758 = null;
        field764 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Loj;La;III)V")
    public static final void method315(class280 arg0, class78 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class176.field2122) {
            class263 var5 = class293.field4356[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3798 != null && var5.field3798.method33(1957)) {
                arg1.method23(class200.field2777, 0, true, var5.field3798, 0, (byte) -65, arg0);
            }
        }
        if (arg4 < class176.field2122) {
            class263 var6 = class293.field4356[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3798 != null && var6.field3798.method33(1957)) {
                arg1.method23(0, 0, true, var6.field3798, class200.field2777, (byte) -65, arg0);
            }
        }
        if (arg3 < class176.field2122 && arg4 < class225.field3116) {
            class263 var7 = class293.field4356[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3798 != null && var7.field3798.method33(1957)) {
                arg1.method23(class200.field2777, 0, true, var7.field3798, class200.field2777, (byte) -65, arg0);
            }
        }
        if (arg3 < class176.field2122 && arg4 > 0) {
            class263 var8 = class293.field4356[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3798 != null && var8.field3798.method33(1957)) {
                arg1.method23(class200.field2777, 0, true, var8.field3798, -class200.field2777, (byte) -65, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class61(class421 arg0, int arg1, class470 arg2) {
        this.field762 = arg2;
        this.field757 = this.field762.method2755(-126, 19);
    }
}
