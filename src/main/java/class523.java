import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class class523 extends class49 {

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Lpg;")
    public static class492 field7725 = new class492(46, 5);

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Lpg;")
    public static class492 field7736 = new class492(9, -2);

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field7737 = 0;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public int field7728;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public int field7732;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Z")
    public boolean field7733;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 4)
    public static void method3101(int arg0) {
        field7736 = null;
        field7725 = null;
        if (arg0 != -12181) {
            method3103(86);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZ)Z", line = 15)
    public static final boolean method3102(int arg0, int arg1, boolean arg2) {
        field7734++;
        if (arg2) {
            field7725 = null;
        }
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 26)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 != 118) {
            method3103(-32);
        }
        field7729++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 45)
    public static final void method3103(int arg0) {
        class386.method2384((byte) 120);
        field7730++;
        class69.method476(2, -125, 22050, class96.field1399.field5198);
        class374.field5734 = class56.method385(class245.field3430, class419.field6254, 16384, 22050, arg0);
        class374.field5734.method1597(8, class102.field1462);
        class133.field1929 = class56.method385(class245.field3430, class419.field6254, 16384, 2048, 1);
        class133.field1929.method1597(8, class325.field4996);
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)V", line = 58)
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            this.method49(42);
        }
        field7726++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)I", line = 69)
    public static final int method3104(int arg0) {
        field7735++;
        if (arg0 <= 85) {
            field7736 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIB)V", line = 81)
    public static final void method3105(int arg0, int arg1, int arg2, byte arg3) {
        field7727++;
        if (arg3 != 107) {
            field7725 = null;
        }
        String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class507.method3024(var4, -31, true);
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)Z", line = 95)
    public final boolean method49(int arg0) {
        if (arg0 != 7) {
            this.method57(-93);
        }
        field7724++;
        return false;
    }
}
