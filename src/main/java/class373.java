import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class373 {

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Lpca;")
    private class653 field4841 = new class653(64);

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Lpca;")
    public class653 field4854 = new class653(30);

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Ljo;")
    private class303 field4843;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Ljo;")
    public class303 field4847;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Z")
    public static boolean field4842 = false;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lrda;")
    public static class605 field4840;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)Lmg;")
    public final class135 method2045(byte arg0, int arg1) {
        field4849++;
        class653 var3 = this.field4841;
        class135 var4;
        synchronized (this.field4841) {
            var4 = (class135) this.field4841.method3690((byte) 118, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field4843;
        byte[] var6;
        synchronized (this.field4843) {
            var6 = this.field4843.method1719(class417.method2259(arg1, false), class235.method1363(arg1, true), 4);
            int var7 = -13 % ((arg0 + 83) / 34);
        }
        class135 var8 = new class135();
        var8.field1537 = this;
        var8.field1517 = arg1;
        if (var6 != null) {
            var8.method756(-1, new class452(var6));
        }
        class653 var9 = this.field4841;
        synchronized (this.field4841) {
            this.field4841.method3683(var8, (byte) -68, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method2046(byte arg0, int arg1, String arg2) {
        field4852++;
        class530 var3 = class242.method1402(-73, 2, arg1);
        var3.method3025((byte) -69);
        var3.field7588 = arg2;
        if (arg0 > -6) {
            method2047(23, 41, (byte) 109, -120, -117);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIBII)V")
    public static final void method2047(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class601.field8530.field2841 != 0 && arg0 != 0 && class479.field7037 < 50 && arg1 != -1) {
            class259.field3301[class479.field7037++] = new class561((byte) 1, arg1, arg0, arg4, arg3, 0);
        }
        if (arg2 != -12) {
            field4842 = true;
        }
        field4850++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public final void method2048(int arg0) {
        field4853++;
        class653 var2 = this.field4841;
        synchronized (this.field4841) {
            this.field4841.method3684(-17200);
        }
        class653 var3 = this.field4854;
        synchronized (this.field4854) {
            if (arg0 == 8798) {
                this.field4854.method3684(-17200);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
    public final void method2049(int arg0, int arg1) {
        this.field4855 = arg1;
        field4845++;
        class653 var3 = this.field4854;
        synchronized (this.field4854) {
            this.field4854.method3687((byte) -10);
        }
        if (arg0 != -29127) {
            this.method2045((byte) -86, -97);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Liaa;I)Lcc;")
    public static final class666 method2050(class452 arg0, int arg1) {
        field4839++;
        arg0.method2541(118);
        int var2 = arg0.method2541(117);
        if (arg1 != -30661) {
            field4840 = null;
        }
        class666 var3 = class211.method1270(var2, true);
        var3.field9474 = arg0.method2541(38);
        int var4 = arg0.method2541(114);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2541(99);
            var3.method121(var6, arg0, true);
        }
        var3.method118(-9);
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
    public static final void method2051(boolean arg0) {
        field4846++;
        class166.field2002.method1668(5, 95);
        class649.field9287.method1872(5, (byte) 36);
        class209.field2546.method1984(5, (byte) 110);
        class195.field2339.method3726(5, (byte) 88);
        class608.field8585.method3275(5, 26655);
        class472.field6588.method1910(5, 8);
        class618.field8696.method129(5, 96);
        class203.field2487.method2054(5, -1);
        class470.field6566.method1697(5, -1305);
        class692.field9748.method1994(5, -3);
        class422.field5623.method3323(26791, 5);
        class147.field1644.method1973(5, 0);
        class536.field7655.method2774(127, 5);
        class80.field854.method685(5, 9);
        class106.field1209.method1480(-125, 5);
        class196.field2366.method544((byte) -104, 5);
        class246.field3174.method2880(14559, 5);
        class168.field2010.method1074(5, (byte) 52);
        class498.field7190.method2896(-58, 5);
        class368.field4788.method94(5, !arg0);
        class186.method1084(5, arg0);
        class303.method1714((byte) -107, 50);
        class358.method1977(5, -118);
        class600.method3353(5, 2);
        class352.field4618.method3691(false, 5);
        class549.field7840.method3691(false, 5);
        class118.field1354.method3691(arg0, 5);
        class397.field5317.method3691(arg0, 5);
        class364.field4773.method3691(false, 5);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Z")
    public static final boolean method2052(int arg0, int arg1, int arg2) {
        if (arg0 != 31312) {
            field4842 = true;
        }
        field4844++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
    public final void method2053(int arg0) {
        class653 var2 = this.field4841;
        synchronized (this.field4841) {
            this.field4841.method3687((byte) -10);
        }
        field4848++;
        class653 var3 = this.field4854;
        synchronized (this.field4854) {
            this.field4854.method3687((byte) -10);
        }
        if (arg0 < 72) {
            field4842 = false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V")
    private final void method2054(int arg0, int arg1) {
        class653 var3 = this.field4841;
        synchronized (this.field4841) {
            this.field4841.method3691(false, arg0);
        }
        field4851++;
        if (arg1 != -1) {
            this.field4855 = 105;
        }
        class653 var4 = this.field4854;
        synchronized (this.field4854) {
            this.field4854.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method2055(byte arg0) {
        if (arg0 >= -10) {
            field4840 = null;
        }
        field4840 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Ljda;ILjo;Ljo;)V")
    public class373(class207 arg0, int arg1, class303 arg2, class303 arg3) {
        this.field4843 = arg2;
        this.field4847 = arg3;
        int var5 = this.field4843.method1740((byte) 46) - 1;
        this.field4843.method1727(-77, var5);
    }
}
