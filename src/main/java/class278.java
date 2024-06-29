import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class278 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field4464 = -1;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public int field4470 = -1;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field4463;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[I")
    public int[] field4467;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3) {
        field4472++;
        if (arg2 != 11) {
            method1875(84, true);
        }
        if (arg1 == 1011) {
            class255.method1720((byte) 126, arg0, arg3, 10);
        } else if (arg1 == 1010) {
            class255.method1720((byte) 124, arg0, arg3, 11);
        } else if (arg1 == 1009) {
            class255.method1720((byte) 126, arg0, arg3, 12);
        } else if (arg1 == 1012) {
            class255.method1720((byte) 121, arg0, arg3, 13);
        } else if (arg1 == 1006) {
            class255.method1720((byte) 121, arg0, arg3, 14);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZIIIII)I")
    public static final int method1870(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        field4469++;
        if (var7 == 0) {
            return arg2;
        }
        if (arg1) {
            field4463 = null;
        }
        if (var7 == 1) {
            return 1 + 7 - arg4 - arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IC)Z")
    public static final boolean method1871(int arg0, char arg1) {
        if (arg0 < 40) {
            field4463 = null;
        }
        field4471++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lwd;BII)V")
    private final void method1872(class162 arg0, byte arg1, int arg2, int arg3) {
        field4466++;
        if (arg1 != -12) {
            this.method1872((class162) null, (byte) -119, 52, -122);
        }
        if (arg2 == 1) {
            this.field4470 = arg0.method1142(-18970);
        } else if (arg2 == 2) {
            this.field4467 = new int[arg0.method1133((byte) 53)];
            for (int var5 = 0; var5 < this.field4467.length; var5++) {
                this.field4467[var5] = arg0.method1142(-18970);
            }
            return;
        } else if (arg2 == 3) {
            this.field4464 = arg0.method1133((byte) 53);
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method1873(int arg0) {
        if (arg0 != -1) {
            method1870(-1, false, -80, -103, 75, -53, -16);
        }
        field4463 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lwd;IB)V")
    public final void method1874(class162 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1133((byte) 53);
            if (var4 == 0) {
                field4468++;
                int var5 = 64 % ((-arg2 - 73) / 48);
                return;
            }
            this.method1872(arg0, (byte) -12, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public static final void method1875(int arg0, boolean arg1) {
        if (arg0 != 12) {
            method1875(41, false);
        }
        field4465++;
        class2.method8(class22.field284, false, class310.field4964, class294.field4709, arg1);
    }
}
