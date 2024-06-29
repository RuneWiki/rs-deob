import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class442 implements class758 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Loh;")
    private class404 field6416;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Llk;")
    public class585 field6418;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Z")
    public static boolean field6415 = false;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field6417 = 0;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Lhu;")
    public class131 field6420;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Z")
    public final boolean method9(byte arg0) {
        field6421++;
        if (arg0 != 119) {
            method2750(97);
        }
        return this.field6416.method2463((byte) 103, this.field6418.field8265);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
    public void method12(boolean arg0, int arg1) {
        field6419++;
        int var3 = -85 % ((-arg1 - 56) / 42);
        if (arg0) {
            int var4 = this.field6418.field8257.method2395(class12.field92, (byte) -48, this.field6420.method501()) + this.field6418.field8255;
            int var5 = this.field6418.field8264.method1280(true, class181.field2143, this.field6420.method510()) + this.field6418.field8258;
            this.field6420.method824(var4, var5);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static final void method2750(int arg0) {
        field6423++;
        if (class267.field3319 != null) {
            if (class267.field3319.field3573 == 1) {
                class267.field3319 = null;
                return;
            }
            if (class267.field3319.field3573 == 2) {
                class148.method923(class158.field1734, (byte) 120, 2, class563.field8027);
                class267.field3319 = null;
                return;
            }
        }
        if (arg0 <= 88) {
            method2750(-59);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Loh;Llk;)V")
    public class442(class404 arg0, class585 arg1) {
        this.field6416 = arg0;
        this.field6418 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method11(int arg0) {
        this.field6420 = class563.method3280(this.field6416, 0, this.field6418.field8265);
        field6422++;
        if (arg0 != 23169) {
            this.field6420 = null;
        }
    }
}
