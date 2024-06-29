import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class589 {

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public int field7999 = 16777215;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "I")
    public int field7995 = 8;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public int field7990;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "I")
    public int field7991;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public int field7992;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
    public int field7994;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public int field8001;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "Lsr;")
    public static class571 field7997;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "Z")
    public boolean field7998;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILfd;)V")
    public final void method3214(int arg0, class418 arg1) {
        if (arg0 >= -77) {
            this.method3216(null, -55, (byte) 22);
        }
        while (true) {
            int var3 = arg1.method2396(-125);
            if (var3 == 0) {
                field8000++;
                return;
            }
            this.method3216(arg1, var3, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3215(int arg0, byte arg1, int arg2) {
        field7996++;
        if (arg0 < 0 || arg2 < 0 || class159.field1994[1].length <= arg0 || class159.field1994[1][arg0].length <= arg2) {
            return false;
        } else if ((class159.field1994[1][arg0][arg2] & 0x2) == 0) {
            if (arg1 != -52) {
                field7997 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lfd;IB)V")
    private final void method3216(class418 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field7995 = arg0.method2393(-30727);
        } else if (arg1 == 2) {
            this.field7998 = true;
        } else if (arg1 == 3) {
            this.field7991 = arg0.method2383(65280);
            this.field7990 = arg0.method2383(65280);
            this.field8001 = arg0.method2383(65280);
        } else if (arg1 == 4) {
            this.field7994 = arg0.method2396(-112);
        } else if (arg1 == 5) {
            this.field7992 = arg0.method2393(-30727);
        } else if (arg1 == 6) {
            this.field7999 = arg0.method2364(-113);
        }
        field7993++;
        if (arg2 >= -96) {
            method3217((byte) 25);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
    public static void method3217(byte arg0) {
        if (arg0 == 116) {
            field7997 = null;
        }
    }
}
