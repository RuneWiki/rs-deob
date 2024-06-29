import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class293 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Ltja;")
    private class288 field3510 = new class288(64);

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Ltja;")
    public class288 field3516 = new class288(64);

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lbt;")
    private class48 field3508;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lbt;")
    public class48 field3515;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3513 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Llja;")
    public static class744 field3506 = new class744(40, 1);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 6)
    public final void method1703(byte arg0) {
        class288 var2 = this.field3510;
        synchronized (this.field3510) {
            this.field3510.method1690(0);
        }
        field3517++;
        class288 var3 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method1690(0);
        }
        if (arg0 != -123) {
            field3506 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 23)
    public final void method1704(int arg0, int arg1) {
        class288 var3 = this.field3510;
        synchronized (this.field3510) {
            this.field3510.method1694(arg1, arg0 ^ 0xFFFFFF80);
        }
        field3512++;
        class288 var4 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method1694(arg1, -26);
            if (arg0 != 40) {
                this.method1706(-34, -96, 122);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lrl;", line = 41)
    public final class752 method1705(int arg0, int arg1) {
        field3514++;
        class288 var3 = this.field3510;
        class752 var4;
        synchronized (this.field3510) {
            var4 = (class752) this.field3510.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field3508;
        byte[] var6;
        synchronized (this.field3508) {
            var6 = this.field3508.method437(34, (byte) 123, arg1);
        }
        class752 var7 = new class752();
        if (arg0 != 27058) {
            return null;
        }
        var7.field10425 = this;
        if (var6 != null) {
            var7.method4199(new class403(var6), (byte) 21);
        }
        class288 var8 = this.field3510;
        synchronized (this.field3510) {
            this.field3510.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 74)
    public final void method1706(int arg0, int arg1, int arg2) {
        int var4 = -78 / ((76 - arg0) / 34);
        this.field3510 = new class288(arg1);
        field3511++;
        this.field3516 = new class288(arg2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 89)
    public final void method1707(int arg0) {
        class288 var2 = this.field3510;
        synchronized (this.field3510) {
            this.field3510.method1687((byte) 61);
        }
        field3509++;
        class288 var3 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method1687((byte) 61);
            if (arg0 != 1) {
                this.method1707(71);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 107)
    public static void method1708(int arg0) {
        field3506 = null;
        if (arg0 != 64) {
            field3506 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;)V", line = 138)
    public class293(class441 arg0, int arg1, class48 arg2, class48 arg3) {
        this.field3508 = arg2;
        this.field3515 = arg3;
        this.field3508.method431(4, 34);
    }
}
