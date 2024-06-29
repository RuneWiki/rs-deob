import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class206 extends class194 {

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field3613 = -1;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lqk;")
    public static class207 field3608 = class24.method212(255, "Kampfstufe: ");

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public int field3609;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lqk;")
    public class207 field3612;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lmd;")
    public class220 field3607;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Lmd;")
    public class220 field3614;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lpk;")
    public static class99 field3605;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Z")
    public boolean field3615;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field3616;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lbe;")
    public static final class28 method1420(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3142;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static final void method1421(int arg0) {
        field3606++;
        if (class242.field4411 == 0) {
            return;
        }
        try {
            if (arg0 >= -93) {
                method1422(-29);
            }
            if ((++class216.field3848) > 2000) {
                if (class98.field1738 != null) {
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                }
                if (class55.field1022 >= 1) {
                    class242.field4411 = 0;
                    class25.field521 = -5;
                    return;
                }
                class55.field1022++;
                class216.field3848 = 0;
                class242.field4411 = 1;
                if (class6.field93 == class223.field4076) {
                    class223.field4076 = class147.field2527;
                } else {
                    class223.field4076 = class6.field93;
                }
            }
            if (class242.field4411 == 1) {
                class270.field4775 = class20.field326.method1635(0, class223.field4076, class89.field1607);
                class242.field4411 = 2;
            }
            if (class242.field4411 == 2) {
                if (class270.field4775.field1696 == 2) {
                    throw new IOException();
                }
                if (class270.field4775.field1696 != 1) {
                    return;
                }
                class98.field1738 = new class127((Socket) class270.field4775.field1699, class20.field326);
                class270.field4775 = null;
                class98.field1738.method894(0, class261.field4645.field2568, class261.field4645.field2593, -107);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                int var1 = class98.field1738.method897(30000);
                if (class34.field677 != null) {
                    class34.field677.method448(0);
                }
                if (class200.field3532 != null) {
                    class200.field3532.method448(0);
                }
                if (var1 != 21) {
                    class25.field521 = var1;
                    class242.field4411 = 0;
                    class98.field1738.method888(true);
                    class98.field1738 = null;
                    return;
                }
                class242.field4411 = 3;
            }
            if (class242.field4411 == 3) {
                if (class98.field1738.method891(1) < 1) {
                    return;
                }
                class182.field3242 = new class207[class98.field1738.method897(30000)];
                class242.field4411 = 4;
            }
            if (class242.field4411 == 4 && class98.field1738.method891(1) >= (class182.field3242.length * 8)) {
                class17.field262.field2593 = 0;
                class98.field1738.method889(class17.field262.field2568, (byte) -102, class182.field3242.length * 8, 0);
                for (int var2 = 0; var2 < class182.field3242.length; var2++) {
                    class182.field3242[var2] = class21.method125(-113, class17.field262.method1043(false));
                }
                class25.field521 = 21;
                class242.field4411 = 0;
                class98.field1738.method888(true);
                class98.field1738 = null;
            }
        } catch (IOException var3) {
            if (class98.field1738 != null) {
                class98.field1738.method888(true);
                class98.field1738 = null;
            }
            if (class55.field1022 >= 1) {
                class242.field4411 = 0;
                class25.field521 = -4;
            } else {
                class242.field4411 = 1;
                if (class6.field93 == class223.field4076) {
                    class223.field4076 = class147.field2527;
                } else {
                    class223.field4076 = class6.field93;
                }
                class216.field3848 = 0;
                class55.field1022++;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public static void method1422(int arg0) {
        field3608 = null;
        if (arg0 > 83) {
            field3605 = null;
        }
    }
}
