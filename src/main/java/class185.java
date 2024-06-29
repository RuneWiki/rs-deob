import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class185 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lkh;")
    private class13 field2801 = new class13(64);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lul;")
    private class406 field2803;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[S")
    public static short[] field2807 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[[I")
    public static int[][] field2802 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lob;")
    public static class521 field2810 = new class521(22, 7);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lla;")
    public static class317 field2805;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Loq;")
    public final class242 method1228(int arg0, int arg1) {
        if (arg0 != 2) {
            field2806 = -111;
        }
        field2804++;
        class13 var3 = this.field2801;
        class242 var4;
        synchronized (this.field2801) {
            var4 = (class242) this.field2801.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field2803;
        byte[] var6;
        synchronized (this.field2803) {
            var6 = this.field2803.method2536(19, 0, arg1);
        }
        class242 var7 = new class242();
        if (var6 != null) {
            var7.method1660(true, new class217(var6));
        }
        class13 var8 = this.field2801;
        synchronized (this.field2801) {
            this.field2801.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
    public static final void method1229(byte arg0, int arg1) {
        if (arg0 >= -6) {
            return;
        }
        class49.method486((byte) 114);
        field2809++;
        class483.method2893(16711680);
        class371.method2328(true, arg1, true);
        class467.method2822(class377.field5692, true, class152.field2264, class176.field2627);
        class109.method836(class377.field5692, (byte) 44, class176.field2627);
        class52.method499(18328);
        class32.method224(-16462, class141.field2146);
        class152.method1044((byte) -128);
        if (class429.field6373 == 2) {
            class74.method643(3, (byte) -43);
        } else if (class429.field6373 == 6) {
            class74.method643(7, (byte) -124);
        } else if (class429.field6373 == 9) {
            class74.method643(10, (byte) -122);
        } else if (class429.field6373 == 1) {
            class484.method2897(class176.field2627, class377.field5692, 112);
            return;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)B")
    public static final byte method1230(int arg0, int arg1, byte arg2) {
        field2808++;
        int var3 = 28 / ((51 - arg2) / 59);
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field2810 = null;
        field2807 = null;
        field2805 = null;
        if (arg0 != 0) {
            method1230(109, 85, (byte) -123);
        }
        field2802 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class185(class480 arg0, int arg1, class406 arg2) {
        this.field2803 = arg2;
        this.field2811 = this.field2803.method2551(19, -26070);
    }
}
