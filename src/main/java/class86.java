import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class86 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[S")
    public static short[] field1448 = new short[] { 37, 59, 20, 25, 10, 2, 18, 41 };

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Z")
    public static boolean field1455 = false;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lbe;")
    public static class283 field1450 = class153.method941(127, "Texturen geladen)3");

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lbe;")
    public static class283 field1457 = class153.method941(125, "gr-Un:");

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lbe;")
    public static class283 field1462 = class153.method941(127, "<col=ffff00>");

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "J")
    public long field1445;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Lek;")
    public static class172 field1456;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Luk;")
    public class86 field1447;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Luk;")
    public class86 field1453;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[[Z")
    public static boolean[][] field1449;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[[[B")
    public static byte[][][] field1451;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "[[[Lrd;")
    public static class160[][][] field1459;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method551(byte arg0) {
        if (arg0 > -82) {
            return false;
        } else {
            field1460++;
            return this.field1447 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 28)
    public static void method552(int arg0) {
        field1448 = null;
        field1457 = null;
        field1456 = null;
        if (arg0 != 59) {
            method555(82);
        }
        field1462 = null;
        field1450 = null;
        field1451 = (byte[][][]) null;
        field1449 = (boolean[][]) null;
        field1459 = (class160[][][]) null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 47)
    public static final void method553(Component arg0, int arg1) {
        field1452++;
        arg0.addMouseListener(class121.field2017);
        arg0.addMouseMotionListener(class121.field2017);
        if (arg1 != 3) {
            field1450 = (class283) null;
        }
        arg0.addFocusListener(class121.field2017);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I", line = 60)
    public static final int method554(int arg0, int arg1, int arg2, int arg3) {
        field1458++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else if (arg0 >= -34) {
            return 20;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 92)
    public static final void method555(int arg0) {
        if (arg0 != 4096) {
            field1456 = (class172) null;
        }
        if (class133.field2236 == null || class33.field490 == null) {
            class33.field490 = new int[256];
            class133.field2236 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class133.field2236[var1] = (int) (Math.sin(var2) * 4096.0D);
                class33.field490[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1446++;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Lbe;", line = 130)
    public static final class283 method556(int arg0) {
        field1461++;
        if (arg0 >= -89) {
            return (class283) null;
        }
        class283 var1 = class194.field3323;
        if (class256.field4325 != 0) {
            var1 = class248.field4235;
        }
        return class299.method2022(new class283[] { class133.field2241, var1, class63.field877, class296.method2012(class30.field468, (byte) 126), class279.field4657, class296.method2012(class303.field5117, (byte) -36), class171.field2888 }, (byte) 75);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 149)
    public final void method557(byte arg0) {
        field1454++;
        if (this.field1447 != null && arg0 == -89) {
            this.field1447.field1453 = this.field1453;
            this.field1453.field1447 = this.field1447;
            this.field1453 = null;
            this.field1447 = null;
        }
    }
}
