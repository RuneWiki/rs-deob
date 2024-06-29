import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class477 extends class417 {

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "Lada;")
    public static class144 field6766 = new class144(25, 0);

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field6754;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public int field6763;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public int field6764;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field6767;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field6769;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public int field6770;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public int field6771;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public int field6773;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public int field6778;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Lqk;")
    public class16 field6759;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lce;")
    public class259 field6752;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Luv;")
    public class306 field6777;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Leg;")
    public class91 field6757;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final void method2871(int arg0) {
        if (arg0 != -5758) {
            return;
        }
        this.field6752 = null;
        field6753++;
        this.field6777 = null;
        this.field6759 = null;
        this.field6757 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lha;B)V")
    public static final void method2872(class53[] arg0, byte arg1) {
        field6750++;
        class19.field177 = arg0.length;
        class371.field5098 = new int[class19.field177 + 10];
        class352.field4793 = new class53[class19.field177 + 10];
        if (arg1 >= -48) {
            field6766 = null;
        }
        class648.method3738(arg0, 0, class352.field4793, 0, class19.field177);
        for (int var2 = 0; var2 < class19.field177; var2++) {
            class371.field5098[var2] = class352.field4793[var2].method322();
        }
        for (int var3 = class19.field177; var3 < class352.field4793.length; var3++) {
            class371.field5098[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static final void method2873(int arg0) {
        field6751++;
        class453.method2754(class56.field668.field6871, 2, 55, 22050);
        class536.field7966 = new class150();
        class536.field7966.method1090(128, 9, 0);
        class645.field9389 = class25.method150(arg0, 16384, class79.field1069, 22050, class442.field5896);
        class645.field9389.method1570(class536.field7966, (byte) 43);
        class322.method1937((byte) 75, class623.field9185, class38.field467, class536.field7966, class472.field6666);
        class92.field1377 = class25.method150(1, 16384, class79.field1069, 2048, class442.field5896);
        class155.field2316 = new class41();
        class92.field1377.method1570(class155.field2316, (byte) 76);
        class341.field4716 = new class624(22050, class270.field3834);
        class101.field1471 = class333.field4619.method1967(~arg0, "scape main");
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)Z")
    public static final boolean method2874(byte arg0, int arg1, int arg2) {
        if (arg0 != -5) {
            field6774 = -72;
        }
        field6756++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
    public static final void method2875(boolean arg0, int arg1) {
        if (arg1 != -28222) {
            field6766 = null;
        }
        field6775++;
        class539.method3268(5);
        if (!class238.method1522(arg1 ^ 0x6E5D, class472.field6670)) {
            return;
        }
        class379.field5228++;
        if (class379.field5228 < 50 && !arg0) {
            return;
        }
        class379.field5228 = 0;
        if (!class152.field2301 && class296.field4075 != null) {
            class297.field4085++;
            class402.method2367(class480.field6822, (byte) 107);
            try {
                class296.field4075.method1829(class112.field1589.field2177, arg1 ^ 0xFFFF9190, 0, class112.field1589.field2146);
                class112.field1589.field2177 = 0;
            } catch (IOException var2) {
                class152.field2301 = true;
            }
        }
        class539.method3268(5);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBIIILte;)Lrp;")
    public static final class371 method2876(int arg0, byte arg1, int arg2, int arg3, int arg4, class527 arg5) {
        int var6 = -15 % ((arg1 + 64) / 60);
        field6776++;
        if (!arg5.field7806 && (!class452.method2749(arg0, false) || !class452.method2749(arg4, false))) {
            return arg5.field7814 ? new class371(arg5, 34037, arg3, arg2, arg0, arg4, true) : new class371(arg5, arg3, arg2, arg0, arg4, class322.method1938(arg0, 110), class322.method1938(arg4, 39), true);
        } else {
            return new class371(arg5, 3553, arg3, arg2, arg0, arg4, true);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method2877(boolean arg0) {
        if (arg0) {
            method2872(null, (byte) 28);
        }
        field6766 = null;
    }
}
