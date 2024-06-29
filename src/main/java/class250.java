import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class250 extends class454 {

    @OriginalMember(owner = "client!jea", name = "A", descriptor = "I")
    public int field3586 = 12800;

    @OriginalMember(owner = "client!jea", name = "E", descriptor = "I")
    public int field3590 = 0;

    @OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
    public int field3599 = 12800;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public int field3595 = 0;

    @OriginalMember(owner = "client!jea", name = "P", descriptor = "Z")
    public boolean field3601 = true;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public int field3592 = -1;

    @OriginalMember(owner = "client!jea", name = "Q", descriptor = "I")
    public int field3602 = -1;

    @OriginalMember(owner = "client!jea", name = "D", descriptor = "Ljava/lang/String;")
    public String field3589;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "Ljava/lang/String;")
    public String field3593;

    @OriginalMember(owner = "client!jea", name = "L", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!jea", name = "M", descriptor = "Low;")
    public class665 field3598;

    @OriginalMember(owner = "client!jea", name = "B", descriptor = "Lin;")
    public static class380 field3587 = new class380(33, 0);

    @OriginalMember(owner = "client!jea", name = "C", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!jea", name = "O", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!jea", name = "R", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!jea", name = "S", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B[III)Z", line = 12)
    public final boolean method1657(byte arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 != -90) {
            this.field3586 = -10;
        }
        field3591++;
        for (class48 var5 = (class48) this.field3598.method3731((byte) -118); var5 != null; var5 = (class48) this.field3598.method3729((byte) -116)) {
            if (var5.method377(arg3, arg2, (byte) 102)) {
                var5.method379(112, arg2, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 199)
    public class250(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3589 = arg1;
        this.field3596 = arg0;
        this.field3593 = arg2;
        this.field3602 = arg6;
        this.field3597 = arg3;
        this.field3592 = arg4;
        this.field3601 = arg5;
        if (this.field3602 == 255) {
            this.field3602 = 0;
        }
        this.field3598 = new class665();
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BII[II)Z", line = 45)
    public final boolean method1658(byte arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field3600++;
        if (arg0 >= -34) {
            return false;
        }
        for (class48 var6 = (class48) this.field3598.method3731((byte) -111); var6 != null; var6 = (class48) this.field3598.method3729((byte) -128)) {
            if (var6.method374(arg1, arg4, -76, arg2)) {
                var6.method380(-5257, arg1, arg3, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)Z", line = 76)
    public final boolean method1659(int arg0, int arg1, int arg2) {
        field3594++;
        if (arg1 != -1) {
            this.field3590 = 65;
        }
        for (class48 var4 = (class48) this.field3598.method3731((byte) -96); var4 != null; var4 = (class48) this.field3598.method3729((byte) 59)) {
            if (var4.method376(arg2, arg0, false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V", line = 98)
    public final void method1660(byte arg0) {
        this.field3586 = 12800;
        field3604++;
        this.field3595 = 0;
        this.field3590 = 0;
        this.field3599 = 12800;
        if (arg0 < 114) {
            method1662(-3);
        }
        for (class48 var2 = (class48) this.field3598.method3731((byte) -105); var2 != null; var2 = (class48) this.field3598.method3729((byte) -128)) {
            if (this.field3595 < var2.field668) {
                this.field3595 = var2.field668;
            }
            if (this.field3586 > var2.field671) {
                this.field3586 = var2.field671;
            }
            if (var2.field666 < this.field3599) {
                this.field3599 = var2.field666;
            }
            if (this.field3590 < var2.field661) {
                this.field3590 = var2.field661;
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[IBI)Z", line = 142)
    public final boolean method1661(int arg0, int[] arg1, byte arg2, int arg3) {
        field3588++;
        for (class48 var5 = (class48) this.field3598.method3731((byte) -90); var5 != null; var5 = (class48) this.field3598.method3729((byte) -128)) {
            if (var5.method376(arg0, arg3, false)) {
                var5.method380(-5257, arg3, arg1, arg0);
                return true;
            }
        }
        if (arg2 != 44) {
            this.field3596 = 40;
        }
        return false;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V", line = 172)
    public static void method1662(int arg0) {
        if (arg0 != -1) {
            field3587 = null;
        }
        field3587 = null;
    }
}
