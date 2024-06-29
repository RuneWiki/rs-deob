import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lpe;")
    public static class109 field2686 = class141.method1120("mapmarker", 0);

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2690 = 0;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lpe;")
    public static class109 field2693 = class141.method1120("Fehler bei der Verbindung zum Server)3", 0);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lbc;")
    public static class11 field2691 = new class11(64);

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lpe;")
    private static class109 field2694 = class141.method1120("Please enter your username)3", 0);

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lpe;")
    private static class109 field2695 = class141.method1120("Loaded input handler", 0);

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lpe;")
    public static class109 field2696 = field2695;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lpe;")
    public static class109 field2697 = field2694;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lwa;")
    public static class154 field2689;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method986(int arg0) {
        class45.field949.method92((byte) 117);
        field2688++;
        if (arg0 != 12) {
            method987((byte) -35);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method987(byte arg0) {
        field2689 = null;
        field2694 = null;
        field2686 = null;
        field2695 = null;
        if (arg0 != 61) {
            method989(null, -100, (byte) -62, -74, 11);
        }
        field2696 = null;
        field2691 = null;
        field2693 = null;
        field2697 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BZ)V")
    public static final void method988(byte arg0, boolean arg1) {
        field2687++;
        if (class15.field381 == null) {
            return;
        }
        try {
            class13 var2 = new class13(4);
            var2.method135(arg1 ? 2 : 3, (byte) -50);
            var2.method150(true, 0);
            class15.field381.method87(-83, var2.field279, 4, 0);
        } catch (IOException var4) {
            try {
                class15.field381.method83((byte) -114);
            } catch (Exception var3) {
            }
            class15.field381 = null;
            class92.field1992++;
        }
        if (arg0 <= 47) {
            field2697 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lpe;IBII)V")
    public static final void method989(class109 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2692++;
        class154 var5 = class102.method821(arg1, true, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field3470 != null) {
            class93 var6 = new class93();
            var6.field2001 = var5.field3470;
            var6.field2014 = var5;
            var6.field2017 = arg0;
            var6.field2007 = arg3;
            class123.method1003(var6, (byte) 105);
        }
        boolean var7 = true;
        if (var5.field3459 > 0) {
            var7 = class24.method225(-325, var5);
        }
        if (!var7 || !class79.method636(arg3 - 1, 1, class136.method1084(0, var5))) {
            return;
        }
        int var8 = -59 / ((17 - arg2) / 63);
        if (arg3 == 1) {
            class127.field2824++;
            class63.field1299.method535(203, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) -114);
        }
        if (arg3 == 2) {
            class63.field1299.method535(230, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) -114);
            class151.field3327++;
        }
        if (arg3 == 3) {
            class63.field1299.method535(78, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class145.field3186++;
            class63.field1299.method134(arg4, (byte) 64);
        }
        if (arg3 == 4) {
            class63.field1299.method535(127, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) -103);
            class157.field3621++;
        }
        if (arg3 == 5) {
            class75.field1501++;
            class63.field1299.method535(88, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) -121);
        }
        if (arg3 == 6) {
            class99.field2073++;
            class63.field1299.method535(5, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) -110);
        }
        if (arg3 == 7) {
            class107.field2254++;
            class63.field1299.method535(118, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) 90);
        }
        if (arg3 == 8) {
            class63.field1299.method535(206, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) 126);
            class19.field463++;
        }
        if (arg3 == 9) {
            class62.field1273++;
            class63.field1299.method535(12, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) 113);
        }
        if (arg3 == 10) {
            class14.field360++;
            class63.field1299.method535(42, -25013);
            class63.field1299.method123(arg1, 1375221240);
            class63.field1299.method134(arg4, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method990(int arg0, int arg1) {
        if (arg1 != 0) {
            method989(null, 68, (byte) 11, -66, -55);
        }
        field2685++;
        class12.field277 = arg0;
    }
}
