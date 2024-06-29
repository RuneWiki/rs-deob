import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class152 extends class142 {

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "Lhi;")
    public static class82 field2568 = class95.method664((byte) -68, "K");

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "Lhi;")
    public static class82 field2572 = class95.method664((byte) -93, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "Lhi;")
    public static class82 field2570 = class95.method664((byte) -118, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!ll", name = "cb", descriptor = "Lhi;")
    private static class82 field2577 = class95.method664((byte) -87, "slide:");

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "Lhi;")
    public static class82 field2567 = field2577;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "Lhi;")
    public static class82 field2569 = field2577;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "B")
    public byte field2566;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ll", name = "ab", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!ll", name = "bb", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ll", name = "Z", descriptor = "Lbc;")
    public class153 field2574;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "Lei;")
    public static class70 field2571;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(JZ)V", line = 9)
    public static final void method1043(long arg0, boolean arg1) {
        field2576++;
        if (arg0 == 0L) {
            return;
        }
        if (class171.field2964 >= 100) {
            class200.method1406(class129.field2247, 0, class52.field842, 4);
            return;
        }
        class82 var3 = class56.method388(arg0, 0).method553((byte) -66);
        for (int var4 = 0; var4 < class171.field2964; var4++) {
            if (class144.field2458[var4] == arg0) {
                class200.method1406(class129.field2247, 0, class29.method182(-6039, new class82[] { var3, class196.field3335 }), 4);
                return;
            }
        }
        for (int var5 = 0; var5 < class90.field1632; var5++) {
            if (class107.field1903[var5] == arg0) {
                class200.method1406(class129.field2247, 0, class29.method182(-6039, new class82[] { class308.field5257, var3, class43.field752 }), 4);
                return;
            }
        }
        if (!arg1) {
            method1044((class153) null, (class82) null, 44);
        }
        if (var3.method534(-41, class168.field2932.field1409)) {
            class200.method1406(class129.field2247, 0, class159.field2767, 4);
            return;
        }
        class132.field2282++;
        class144.field2458[class171.field2964] = arg0;
        class157.field2736[class171.field2964++] = class56.method388(arg0, 0);
        class232.field4012 = class157.field2726;
        class61.field957.method1504(195, -1);
        class61.field957.method1057((byte) 43, arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lbc;Lhi;I)I", line = 98)
    public static final int method1044(class153 arg0, class82 arg1, int arg2) {
        field2573++;
        int var3 = arg0.field2611;
        arg0.method1048(arg1.field1468, 87);
        arg0.field2611 += class315.field5424.method464((byte) 95, arg2, arg0.field2598, arg1.field1419, arg1.field1468, arg0.field2611);
        return arg0.field2611 - var3;
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)[B", line = 109)
    public final byte[] method964(int arg0) {
        if (arg0 != -1) {
            field2568 = (class82) null;
        }
        field2564++;
        if (this.field2433 || this.field2574.field2611 < this.field2574.field2598.length - this.field2566) {
            throw new RuntimeException();
        }
        return this.field2574.field2598;
    }

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "(I)I", line = 132)
    public final int method967(int arg0) {
        field2565++;
        if (arg0 >= -33) {
            return 97;
        } else if (this.field2574 == null) {
            return 0;
        } else {
            return this.field2574.field2611 * 100 / (this.field2574.field2598.length - this.field2566);
        }
    }

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "(I)V", line = 147)
    public static void method1045(int arg0) {
        field2571 = null;
        field2567 = null;
        field2570 = null;
        int var1 = 55 % ((arg0 + 60) / 62);
        field2569 = null;
        field2568 = null;
        field2572 = null;
        field2577 = null;
    }
}
