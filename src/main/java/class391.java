import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class391 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field5868 = 128;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public int field5878 = 128;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field5866;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field5873;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field5867;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field5872;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lcd;")
    public static class208 field5863 = new class208("", 10);

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lbj;")
    public static class162 field5879 = new class162(33, 4);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public int field5870;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field5876;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field5877;

    static {
        new class309("From", "Von:", "De", "De");
        new class309("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 7)
    public static void method2413(byte arg0) {
        if (arg0 <= 96) {
            method2416(-127, null);
        }
        field5879 = null;
        field5863 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V", line = 190)
    public class391(int arg0) {
        this.field5866 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIII)V", line = 197)
    private class391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5866 = arg0;
        this.field5878 = arg2;
        this.field5873 = arg4;
        this.field5868 = arg1;
        this.field5867 = arg3;
        this.field5872 = arg5;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V", line = 31)
    public static final void method2414(boolean arg0, int arg1) {
        if (class216.field3417 != null) {
            class216.field3417.method2319((byte) 103);
            class216.field3417 = null;
        }
        field5874++;
        class179.field2910 = 0;
        class170.method1191(arg1 + 27003);
        class57.method521();
        for (int var2 = 0; var2 < 4; var2++) {
            class67.field1367[var2].method555((byte) -101);
        }
        class274.method1738((byte) 39, false);
        System.gc();
        class12.method69(2, true);
        class281.field4250 = false;
        class273.field4131 = -1;
        class48.method463(true, true);
        class506.field7382 = 0;
        class52.field1085 = 0;
        class212.field3378 = 0;
        class49.field995 = 0;
        class496.field7292 = 0;
        class266.field4039 = 0;
        for (int var3 = 0; var3 < class139.field2328.length; var3++) {
            class139.field2328[var3] = null;
        }
        class506.method3038(true);
        int var4 = 0;
        if (arg1 != 5424) {
            method2415((byte) 58, null);
        }
        while (var4 < 2048) {
            class73.field1444[var4] = null;
            var4++;
        }
        class341.field5128 = 0;
        class209.field3337.method1614((byte) -24);
        class334.field5054 = 0;
        class169.field2757.method1614((byte) -24);
        class211.method1434(true);
        class71.field1418 = 0;
        class402.field6080.method93(110);
        class82.method770(24026);
        class270.method1712((byte) -116);
        class516.field7485 = 0L;
        class535.field7859 = null;
        if (arg0) {
            class253.method1639(11, -16646);
            return;
        }
        class253.method1639(2, arg1 ^ 0xFFFFABCA);
        try {
            class227.method1509(class497.field7305.field7072, "loggedout", arg1 ^ 0x67CC);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLvi;)V", line = 111)
    public static final void method2415(byte arg0, class380 arg1) {
        class142.field2354 = arg1;
        if (arg0 < -24) {
            field5871++;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;)V", line = 129)
    public static final void method2416(int arg0, String arg1) {
        field5877++;
        if (class384.field5610 == null) {
            return;
        }
        class459.method2765(class396.field6024, (byte) 87);
        class65.field1326++;
        class335.field5062.method1814(class362.method2220(arg1, (byte) -80), true);
        if (arg0 <= 112) {
            field5879 = null;
        }
        class335.field5062.method1821(arg1, 111);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lii;I)V", line = 147)
    public final void method2417(class391 arg0, int arg1) {
        this.field5872 = arg0.field5872;
        this.field5878 = arg0.field5878;
        this.field5866 = arg0.field5866;
        this.field5868 = arg0.field5868;
        field5865++;
        if (arg1 != 0) {
            method2415((byte) 103, null);
        }
        this.field5873 = arg0.field5873;
        this.field5867 = arg0.field5867;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)Lii;", line = 176)
    public final class391 method2418(byte arg0) {
        field5869++;
        if (arg0 != -68) {
            this.field5870 = -84;
        }
        return new class391(this.field5866, this.field5868, this.field5878, this.field5867, this.field5873, this.field5872);
    }
}
