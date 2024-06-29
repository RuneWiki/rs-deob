import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class273 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "J")
    public long field4526 = 0L;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
    public static boolean field4537 = false;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lbd;")
    public static class162 field4540 = class17.method142(0, "<br>");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lrk;")
    public class255 field4527;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lrk;")
    public class255 field4534;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Lbd;", line = 5)
    public static final class162 method1850(int arg0, int arg1) {
        class162 var2 = class156.method1212(10, arg1);
        for (int var3 = var2.method1249((byte) -118) - 3; var3 > 0; var3 -= 3) {
            var2 = class135.method1062(new class162[] { var2.method1283(0, var3, (byte) 90), class278.field4686, var2.method1254((byte) 95, var3) }, true);
        }
        field4541++;
        if (var2.method1249((byte) -118) > arg0) {
            return class135.method1062(new class162[] { class244.field4051, var2.method1283(0, var2.method1249((byte) -118) - 8, (byte) 111), class92.field1627, class257.field4263, var2, class190.field3242 }, true);
        } else if (var2.method1249((byte) -118) <= 6) {
            return class135.method1062(new class162[] { class120.field2187, var2, class167.field2943 }, true);
        } else {
            return class135.method1062(new class162[] { class199.field3378, var2.method1283(0, var2.method1249((byte) -118) - 4, (byte) 125), class112.field2029, class257.field4263, var2, class190.field3242 }, true);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 35)
    public static final int method1851(int arg0, KeyEvent arg1) {
        field4538++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (~var2 >= arg0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 53)
    public static final void method1852(int arg0) {
        field4524++;
        if (arg0 != 128) {
            method1856((byte) 90, (class143) null);
        }
        if (!class4.method19(-120) && class245.field4080 != class157.field2765) {
            class91.method692(class165.field2928, class157.field2765, class122.field2215.field5050[0], class123.field2238, false, true, class122.field2215.field5034[0]);
        } else if (class279.field4693 != class157.field2765) {
            class279.field4693 = class157.field2765;
            class243.method1723(103, class157.field2765);
            class80.method618(arg0 ^ 0xFFFFFF1C);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 91)
    public static final void method1853(int arg0) {
        field4529++;
        if (class136.field2420 < 0) {
            class86.field1527 = -1;
            class136.field2420 = 0;
            class59.field922 = -1;
        }
        if (class136.field2420 > class304.field5132) {
            class59.field922 = -1;
            class86.field1527 = -1;
            class136.field2420 = class304.field5132;
        }
        if (class278.field4682 < 0) {
            class278.field4682 = 0;
            class86.field1527 = -1;
            class59.field922 = -1;
        }
        if (arg0 > 38 && class278.field4682 > class9.field114) {
            class59.field922 = -1;
            class278.field4682 = class9.field114;
            class86.field1527 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZII)V", line = 157)
    public static final void method1854(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4532++;
        if (class12.method104(arg0, 571329488)) {
            class115.method908(arg3, arg2, arg4, class95.field1739[arg0], false, arg1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 169)
    public static void method1855(boolean arg0) {
        if (arg0) {
            field4537 = true;
        }
        field4540 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLda;)V", line = 183)
    public static final void method1856(byte arg0, class143 arg1) {
        if (arg0 == -89) {
            field4531++;
            class90.field1601 = arg1;
        }
    }
}
