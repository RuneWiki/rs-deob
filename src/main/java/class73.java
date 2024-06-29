import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class73 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lku;")
    public class536 field760 = new class536();

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field763 = new Random();

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lal;")
    public static class307 field764 = new class307();

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
    public static int[] field767 = new int[14];

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field766 = -1;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[Z")
    public static boolean[] field768 = new boolean[100];

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lcq;")
    public static class110 field769;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field771;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lku;")
    private class536 field761;

    static {
        new class607("", 73);
        field769 = new class110(65, 1);
        field771 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method394(int arg0, boolean arg1) {
        field758++;
        if (class99.field1061 != null) {
            class99.field1061.method1509(arg0);
            class99.field1061 = null;
        }
        class579.field8191 = 0;
        class471.method2715(false);
        class302.method1752();
        for (int var2 = 0; var2 < 4; var2++) {
            class282.field3534[var2].method1557((byte) 44);
        }
        class275.method1614(false, -31157);
        System.gc();
        class615.method3421(2, (byte) 101);
        class331.field4169 = -1;
        class19.field151 = false;
        class628.method3527(true, 1182293784);
        class43.field418 = 0;
        class231.field2860 = 0;
        class247.field3061 = 0;
        class145.field1602 = 0;
        class613.field8628 = 0;
        class26.field245 = 0;
        for (int var3 = 0; var3 < class497.field7195.length; var3++) {
            class497.field7195[var3] = null;
        }
        class480.method2766((byte) 1);
        for (int var4 = arg0; var4 < 2048; var4++) {
            class139.field1540[var4] = null;
        }
        class651.field9144 = 0;
        class274.field3433.method3667(5488);
        class53.field533 = 0;
        class200.field2354.method3667(arg0 + 5488);
        class573.method3235(arg0 - 10);
        class664.field9290 = 0;
        class628.field8859.method1733(0);
        class63.method333(123);
        class625.method3517(1);
        class153.field1685 = 0L;
        class330.field4150 = null;
        if (arg1) {
            class585.method3308(12, 22731);
            return;
        }
        class585.method3308(3, arg0 ^ 0x58CB);
        try {
            class627.method3524("loggedout", class591.field8347, 23421);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lku;Z)V", line = 79)
    public final void method395(class536 arg0, boolean arg1) {
        if (arg0.field7498 != null) {
            arg0.method3006((byte) 118);
        }
        field756++;
        arg0.field7499 = this.field760;
        if (!arg1) {
            arg0.field7498 = this.field760.field7498;
            arg0.field7498.field7499 = arg0;
            arg0.field7499.field7498 = arg0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lku;", line = 99)
    public final class536 method396(byte arg0) {
        field762++;
        if (arg0 != -37) {
            return null;
        }
        class536 var2 = this.field761;
        if (this.field760 == var2) {
            this.field761 = null;
            return null;
        } else {
            this.field761 = var2.field7499;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I", line = 122)
    public final int method397(boolean arg0) {
        field755++;
        if (!arg0) {
            field764 = null;
        }
        int var2 = 0;
        class536 var3 = this.field760.field7499;
        while (this.field760 != var3) {
            var3 = var3.field7499;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Lku;", line = 149)
    public final class536 method398(boolean arg0) {
        field757++;
        class536 var2 = this.field760.field7499;
        if (arg0) {
            return null;
        } else if (this.field760 == var2) {
            this.field761 = null;
            return null;
        } else {
            this.field761 = var2.field7499;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)V", line = 170)
    public final void method399(boolean arg0) {
        field759++;
        while (true) {
            class536 var2 = this.field760.field7499;
            if (this.field760 == var2) {
                if (arg0) {
                    return;
                } else {
                    this.field761 = null;
                    return;
                }
            }
            var2.method3006((byte) 118);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 212)
    public class73() {
        this.field760.field7498 = this.field760;
        this.field760.field7499 = this.field760;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 196)
    public static void method400(byte arg0) {
        field764 = null;
        field771 = null;
        field763 = null;
        field769 = null;
        field767 = null;
        field768 = null;
        if (arg0 != -80) {
            field770 = 91;
        }
    }
}
