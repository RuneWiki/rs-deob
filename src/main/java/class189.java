import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class189 {

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Ljp;")
    private class236 field2654 = new class236(64);

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lpc;")
    private class473 field2653;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Lpc;")
    private class473 field2657;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Lvj;")
    public static class304 field2660 = new class304("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2661 = new Rectangle[100];

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Lff;")
    public static class9 field2664 = new class9(88, -1);

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "[I")
    public static int[] field2665 = new int[5];

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "F")
    public static float field2662;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "Ldf;")
    public static class274 field2663;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lfm;Z)V")
    public static final void method1213(class514 arg0, boolean arg1) {
        field2652++;
        arg0.field7567 = null;
        if (arg1) {
            return;
        }
        int var2 = arg0.field7563.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field7563[var3].field4818 = false;
        }
        class305[] var4 = class76.field1133;
        synchronized (class76.field1133) {
            if (var2 < class76.field1133.length && class257.field3383[var2] < 200) {
                class76.field1133[var2].method1766((byte) 114, arg0);
                int var10002 = class257.field3383[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lsk;")
    public final class438 method1214(byte arg0, int arg1) {
        field2659++;
        class438 var3 = (class438) this.field2654.method1456((long) arg1, 110);
        if (arg0 <= 111) {
            method1215((byte) 79);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field2653.method2708(0, arg1, (byte) 54);
        } else {
            var4 = this.field2657.method2708(0, arg1 & 0x7FFF, (byte) 54);
        }
        class438 var5 = new class438();
        if (var4 != null) {
            var5.method2515(6, new class379(var4));
        }
        if (arg1 >= 32768) {
            var5.method2517(32768);
        }
        this.field2654.method1462(var5, (long) arg1, -118);
        return var5;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        field2661 = null;
        field2664 = null;
        field2660 = null;
        field2665 = null;
        field2663 = null;
        if (arg0 != -57) {
            method1218(102, -89, -96);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIB)V")
    public static final void method1216(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2651++;
        class253 var5 = class332.method1911(arg2, (byte) -117, 4);
        var5.method1522(0);
        var5.field3355 = arg1;
        if (arg4 >= 20) {
            var5.field3358 = arg0;
            var5.field3356 = arg3;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(ILpc;Lpc;)V")
    public class189(int arg0, class473 arg1, class473 arg2) {
        this.field2653 = arg1;
        this.field2657 = arg2;
        if (this.field2653 != null) {
            this.field2653.method2710(0, (byte) -110);
        }
        if (this.field2657 != null) {
            this.field2657.method2710(0, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIILcr;)V")
    public static final void method1217(int arg0, int arg1, int arg2, class403 arg3) {
        field2655++;
        if (class484.field6735 != null || class379.field5189 || arg3 == null || class21.method195(arg3, (byte) 77) == null) {
            return;
        }
        class484.field6735 = arg3;
        if (arg1 != 64) {
            field2661 = null;
        }
        class393.field5317 = class21.method195(arg3, (byte) 52);
        class270.field3544 = false;
        class176.field2567 = 0;
        class37.field583 = arg2;
        class18.field311 = arg0;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Z")
    public static final boolean method1218(int arg0, int arg1, int arg2) {
        int var3 = 76 % ((23 - arg0) / 56);
        field2658++;
        return (arg2 & 0x800) != 0 | class123.method903(arg1, (byte) -119, arg2) || class480.method2760(arg1, 112, arg2);
    }
}
