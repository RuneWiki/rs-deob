import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class393 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public static int[] field5749 = new int[4];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[S")
    public static short[] field5753 = new short[] { 14, 22, 25, 24, 32, 8, 57, 59 };

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lbh;")
    public static class24 field5747 = new class24(5000);

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field5755 = -1;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lrg;")
    public static class383 field5754;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field5746;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2555(String arg0, int arg1) {
        field5752++;
        if (arg1 != 25) {
            method2557(-3);
        }
        if (!arg0.equals("")) {
            class442.field6400.method158((byte) 7, 42);
            class167.field2382++;
            class442.field6400.method2396(class322.method2036(arg0, -98), arg1 ^ 0x30BB);
            class442.field6400.method2412(-113, arg0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Llp;")
    public static final class221 method2556(int arg0, int arg1) {
        field5750++;
        class190 var2 = class154.field2168;
        class221 var3;
        synchronized (class154.field2168) {
            var3 = (class221) class154.field2168.method1246((byte) -72, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class366.field5129.method1920(class215.method1379(arg0, (byte) 85), false, class41.method286((byte) 13, arg0));
        class221 var5 = new class221();
        var5.field2950 = arg0;
        if (var4 != null) {
            var5.method1401(new class371(var4), (byte) 1);
        }
        var5.method1400((byte) -24);
        class190 var6 = class154.field2168;
        synchronized (class154.field2168) {
            class154.field2168.method1247((long) arg0, (byte) 63, var5);
            if (arg1 != 4) {
                method2557(82);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1569(int arg0, Component arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1570(Component arg0, int arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
    public abstract int method1568(int arg0);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method2557(int arg0) {
        if (arg0 != 57) {
            method2557(10);
        }
        field5749 = null;
        field5747 = null;
        field5746 = null;
        field5753 = null;
        field5754 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method2558(byte arg0) {
        class398.field5816 = new class138(8);
        field5748++;
        if (arg0 < -61) {
            class339.field4743 = 0;
            for (class147 var1 = (class147) class196.field2721.method2307(false); var1 != null; var1 = (class147) class196.field2721.method2311(-5116)) {
                var1.method1006();
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    public static final void method2559(int arg0, int arg1) {
        field5751++;
        class362.field5087.method1254(arg0, arg1 + 125);
        if (arg1 != 0) {
            field5753 = null;
        }
    }
}
