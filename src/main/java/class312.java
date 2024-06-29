import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class312 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field4702 = 1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field4707;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lla;")
    public static class422 field4704;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
    public final boolean method2053(int arg0) {
        field4708++;
        if (arg0 <= 45) {
            this.method2055(83);
        }
        return (this.field4700 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method2054(byte arg0) {
        field4704 = null;
        if (arg0 > -25) {
            method2057(-80, -18, -72);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z")
    public final boolean method2055(int arg0) {
        if (arg0 != 0) {
            field4702 = -27;
        }
        field4709++;
        return (this.field4700 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Z")
    public final boolean method2056(boolean arg0) {
        field4701++;
        if (!arg0) {
            method2054((byte) -113);
        }
        return (this.field4700 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z")
    public static final boolean method2057(int arg0, int arg1, int arg2) {
        field4703++;
        if (arg2 != -1) {
            method2058(24, null, -28);
        }
        return (class131.method1059(33, arg1, arg0) | class411.method2534(arg1, false, arg0) | class483.method2924(arg0, arg1, 1)) & class527.method3131(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILgba;I)V")
    public static final void method2058(int arg0, class702 arg1, int arg2) {
        field4699++;
        class395.field5901 = arg2;
        class494.field7150 = false;
        class91.method772(114, arg1);
        class291.method1899(-1, arg1);
        if (class494.field7150) {
            System.out.println("---endgpp---");
        }
        if (arg1.field4534 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field4534 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z")
    public final boolean method2059(int arg0) {
        if (arg0 != -7968) {
            method2054((byte) 11);
        }
        field4705++;
        return (this.field4700 & 0x4) != 0;
    }
}
