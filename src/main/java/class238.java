import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class238 {

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Lfa;")
    private class156 field3495 = new class156(64);

    @OriginalMember(owner = "client!du", name = "l", descriptor = "Lfa;")
    private class156 field3504 = new class156(100);

    @OriginalMember(owner = "client!du", name = "g", descriptor = "Lfs;")
    private class387 field3499;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "[[[B")
    public static byte[][][] field3497;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Lpt;", line = 4)
    public final class367 method1579(int arg0, int arg1) {
        field3496++;
        class156 var3 = this.field3504;
        class367 var4;
        synchronized (this.field3504) {
            if (arg1 != 1) {
                this.field3504 = null;
            }
            var4 = (class367) this.field3504.method1115((long) arg0, (byte) 58);
            if (var4 == null) {
                var4 = new class367(arg0);
                this.field3504.method1107(arg1, (long) arg0, var4);
            }
        }
        synchronized (var4) {
            return var4.method2269(false) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 33)
    public final void method1580(int arg0) {
        class156 var2 = this.field3495;
        synchronized (this.field3495) {
            this.field3495.method1119(84);
        }
        if (arg0 != -16517) {
            return;
        }
        field3493++;
        class156 var3 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method1119(112);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 50)
    public static void method1581(boolean arg0) {
        if (arg0) {
            field3497 = null;
        }
        field3497 = null;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(II)V", line = 62)
    public final void method1582(int arg0, int arg1) {
        if (arg1 != 36) {
            this.method1585(-122, 42);
        }
        class156 var3 = this.field3495;
        synchronized (this.field3495) {
            this.field3495.method1116(arg0, -50);
        }
        field3505++;
        class156 var4 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method1116(arg0, arg1 - 86);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIB)V", line = 81)
    public static final void method1583(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3502++;
        float var5 = (float) class399.field5927 / (float) class399.field5923;
        int var6 = arg0;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg3 - (arg2 - var7) / 2;
        int var9 = arg1 - (arg0 - var6) / 2;
        class447.field6600 = -1;
        class512.field7555 = class399.field5927 - (class399.field5927 * var8 / var7);
        class63.field744 = class399.field5923 * var9 / var6;
        if (arg4 < 40) {
            method1583(7, 18, 102, 52, (byte) -98);
        }
        class45.field510 = -1;
        class231.method1552(-1);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 113)
    public final void method1584(int arg0) {
        field3494++;
        class156 var2 = this.field3495;
        synchronized (this.field3495) {
            this.field3495.method1105(false);
            if (arg0 != 2) {
                field3497 = null;
            }
        }
        class156 var3 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method1105(false);
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(II)Llp;", line = 129)
    public final class267 method1585(int arg0, int arg1) {
        field3503++;
        class156 var3 = this.field3495;
        class267 var4;
        synchronized (this.field3495) {
            var4 = (class267) this.field3495.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3499.method2363(class447.method2714(arg1, -1), class441.method2695(arg1, 1011), 113);
        if (arg0 != 3) {
            this.field3499 = null;
        }
        class267 var6 = new class267();
        var6.field3937 = arg1;
        var6.field3931 = this;
        if (var5 != null) {
            var6.method1715(new class65(var5), 24);
        }
        var6.method1720(2);
        class156 var7 = this.field3495;
        synchronized (this.field3495) {
            this.field3495.method1107(arg0 ^ 0x2, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 161)
    public static final void method1586(String arg0, int arg1, int arg2) {
        field3500++;
        class215 var3 = class171.method1208(arg1, (byte) 121, arg2);
        var3.method1465(arg2 - 25855);
        var3.field3080 = arg0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V", line = 172)
    public static final void method1587(int arg0, int arg1, int arg2) {
        if (arg0 != 10447) {
            field3497 = null;
        }
        field3498++;
        class215 var3 = class171.method1208(arg2, (byte) 116, 16);
        var3.method1465(-25852);
        var3.field3082 = arg1;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljk;ILfs;Lfs;Lfs;)V", line = 248)
    public class238(class446 arg0, int arg1, class387 arg2, class387 arg3, class387 arg4) {
        this.field3499 = arg2;
        if (this.field3499 != null) {
            int var6 = this.field3499.method2359((byte) 39) - 1;
            this.field3499.method2367(var6, 28724);
        }
        class51.method509(arg3, 3168, arg4);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lya;Z)V", line = 192)
    public static final void method1588(class38 arg0, boolean arg1) {
        if (arg1) {
            method1587(107, 99, -27);
        }
        field3501++;
        if (class315.field4484.method1026(0) == 0) {
            return;
        }
        if (class65.field802 == 0) {
            for (class465 var4 = (class465) class315.field4484.method1018(103); var4 != null; var4 = (class465) class315.field4484.method1022((byte) -112)) {
                class270.field3995.method2(false, var4.field6836 ? class435.field6375.field5065 : null, class122.field1792, var4.field6834, var4.field6829, arg0, false, var4.field6830, var4.field6828, var4.field6835, !arg1, arg0);
                var4.method1525((byte) 94);
            }
            class448.method2716(-11712);
            return;
        }
        if (class376.field5563 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class376.field5563 = class38.method296(class467.field6850, 0, var2, 0, (byte) -116, class498.field7404);
            class450.field6643 = class376.field5563.method343(class88.method775(6, 0, class65.field814, class55.field584), class218.method1497(class240.field3533, class65.field814, 0), true);
        }
        for (class465 var3 = (class465) class315.field4484.method1018(51); var3 != null; var3 = (class465) class315.field4484.method1022((byte) -112)) {
            class270.field3995.method2(false, var3.field6836 ? class435.field6375.field5065 : null, class450.field6643, var3.field6834, var3.field6829, class376.field5563, false, var3.field6830, var3.field6828, var3.field6835, true, arg0);
            var3.method1525((byte) -41);
        }
    }
}
