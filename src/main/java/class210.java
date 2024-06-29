import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class210 extends class390 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field2925 = -1;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
    private boolean field2923 = true;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lih;")
    private class330 field2921;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field2928 = 0;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Lik;")
    public static class410 field2929 = new class410(64);

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field2931 = 12;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lih;)V", line = 136)
    public class210(class330 arg0) {
        this.field2921 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V", line = 17)
    public final void run() {
        while (this.field2923) {
            this.field2921.method2100(-1847, this);
        }
        field2930++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIZIJLjava/lang/String;ZIBLjava/lang/String;)V", line = 29)
    public static final void method1445(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, long arg5, String arg6, boolean arg7, int arg8, byte arg9, String arg10) {
        field2920++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        if (arg9 >= -49) {
            field2922 = 61;
        }
        class289 var14 = new class289(128);
        var14.method1824(73, 10);
        var14.method1877(true, (arg0 ? 4 : 0) | (arg3 ? 1 : 0) | (arg7 ? 2 : 0));
        var14.method1866(-19069, arg5);
        var14.method1854(var12[0], true);
        var14.method1827(0, arg6);
        var14.method1854(var12[1], true);
        var14.method1877(true, class346.field4689);
        var14.method1824(54, arg2);
        var14.method1824(92, arg1);
        var14.method1854(var12[2], true);
        var14.method1877(true, arg8);
        var14.method1877(true, arg4);
        var14.method1854(var12[3], true);
        var14.method1878(class340.field4635, -90, class38.field579);
        class289 var15 = new class289(350);
        var15.method1827(0, arg10);
        int var16 = 8 - class408.method2528(-48, arg10) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1824(122, (int) (Math.random() * 255.0D));
        }
        var15.method1843(var12, -26298);
        class355.field4828.field3938 = 0;
        class355.field4828.method1824(106, 22);
        class355.field4828.method1877(true, var14.field3938 + var15.field3938 + 2);
        class355.field4828.method1877(true, 555);
        class355.field4828.method1870(0, var14.field3882, var14.field3938, (byte) 110);
        class355.field4828.method1870(0, var15.field3882, var15.field3938, (byte) 93);
        class124.field1727 = 0;
        class199.field2841 = 1;
        class193.field2778 = 0;
        class77.field1159 = -3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 89)
    public final void method1446(byte arg0) {
        if (arg0 > 20) {
            field2924++;
            (new Thread(this, "a")).start();
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 105)
    public final void method1447(byte arg0) {
        field2926++;
        if (arg0 < 119) {
            field2931 = 98;
        }
        this.field2923 = false;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 119)
    public static void method1448(int arg0) {
        field2929 = null;
        int var1 = -93 / ((arg0 - 26) / 42);
    }
}
