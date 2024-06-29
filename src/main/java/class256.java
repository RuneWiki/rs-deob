import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class256 {

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public int field3869 = 8;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public int field3874 = 16777215;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3861 = "Face here";

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3867 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field3878 = -2;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
    public boolean field3865;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Z")
    public static boolean field3875;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
    public static int[] field3870;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[Lmh;")
    public static class263[] field3877;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIILhc;)V")
    private final void method1756(byte arg0, int arg1, int arg2, class53 arg3) {
        if (arg0 < 106) {
            this.field3860 = 112;
        }
        if (arg1 == 1) {
            this.field3869 = arg3.method331(-8);
        } else if (arg1 == 2) {
            this.field3865 = true;
        } else if (arg1 == 3) {
            this.field3863 = arg3.method337(103);
            this.field3868 = arg3.method337(125);
            this.field3860 = arg3.method337(107);
        } else if (arg1 == 4) {
            this.field3862 = arg3.method366(-16505);
        } else if (arg1 == 5) {
            this.field3873 = arg3.method331(-15);
        } else if (arg1 == 6) {
            this.field3874 = arg3.method362(-4);
        }
        field3876++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILlc;)I")
    public static final int method1757(int arg0, class270 arg1) {
        field3872++;
        int var2 = 0;
        if (arg1.method1885(2, class287.field4601)) {
            var2++;
        }
        if (arg1.method1885(2, class1.field15)) {
            var2++;
        }
        if (arg0 != -10381) {
            method1757(-97, (class270) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1758(int arg0) {
        field3877 = null;
        if (arg0 <= 15) {
            field3870 = null;
        }
        field3861 = null;
        field3870 = null;
        field3867 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)V")
    public static final void method1759(boolean arg0, int arg1) {
        field3859++;
        if (arg1 == -13509 && class195.field2873 != arg0) {
            class195.field2873 = arg0;
            class155.method1134(-22127);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLhc;)V")
    public final void method1760(int arg0, byte arg1, class53 arg2) {
        int var4 = -99 % ((46 - arg1) / 35);
        while (true) {
            int var5 = arg2.method366(-16505);
            if (var5 == 0) {
                field3871++;
                return;
            }
            this.method1756((byte) 127, var5, arg0, arg2);
        }
    }
}
