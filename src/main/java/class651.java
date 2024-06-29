import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class651 {

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "Ltja;")
    private class288 field8996 = new class288(16);

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "Lbt;")
    private class48 field8993;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
    public static int field8992 = 0;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "Lifa;")
    public static class450 field8995 = new class450();

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "Lbt;")
    public static class48 field8990;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)V")
    public static final void method3677(int arg0, int arg1, int arg2) {
        boolean var3 = class107.field1351[0][arg1][arg2] != null && class107.field1351[0][arg1][arg2].field10172 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class107.field1351[var4][arg1][arg2] == null) {
                class727 var5 = class107.field1351[var4][arg1][arg2] = new class727(var4);
                if (var3) {
                    var5.field10186++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)Liea;")
    public final class505 method3678(int arg0, int arg1) {
        field8997++;
        class288 var3 = this.field8996;
        class505 var4;
        synchronized (this.field8996) {
            var4 = (class505) this.field8996.method1684((long) arg0, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field8993;
        byte[] var6;
        synchronized (this.field8993) {
            var6 = this.field8993.method437(30, (byte) -22, arg0);
        }
        class505 var7 = new class505();
        if (var6 != null) {
            var7.method3028(new class403(var6), (byte) 48);
        }
        class288 var8 = this.field8996;
        synchronized (this.field8996) {
            int var9 = -71 % ((38 - arg1) / 53);
            this.field8996.method1686(-25638, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public final void method3679(int arg0) {
        field8991++;
        class288 var2 = this.field8996;
        synchronized (this.field8996) {
            this.field8996.method1687((byte) 61);
            if (arg0 >= -57) {
                field8990 = null;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(II)V")
    public final void method3680(int arg0, int arg1) {
        field8994++;
        class288 var3 = this.field8996;
        synchronized (this.field8996) {
            this.field8996.method1694(arg0, arg1 - 56);
            if (arg1 != 30) {
                field8990 = null;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
    public final void method3681(int arg0) {
        class288 var2 = this.field8996;
        synchronized (this.field8996) {
            this.field8996.method1690(0);
            if (arg0 != 20399) {
                this.field8993 = null;
            }
        }
        field8989++;
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V")
    public static void method3682(int arg0) {
        field8990 = null;
        field8995 = null;
        if (arg0 != -20247) {
            field8995 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class651(class441 arg0, int arg1, class48 arg2) {
        this.field8993 = arg2;
        this.field8993.method431(4, 30);
    }
}
