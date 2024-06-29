import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class431 extends class490 {

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "Ltr;")
    public class297 field5937;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "[I")
    public static int[] field5939 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "Lkaa;")
    public static class47 field5942 = new class47(72, 16);

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "[I")
    public static int[] field5943 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field5944 = 100;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([Lhu;I)V")
    public static final void method2486(class133[] arg0, int arg1) {
        field5940++;
        class569.field7491 = arg0.length;
        class264.field3681 = new int[class569.field7491 + 10];
        class657.field8682 = new class133[class569.field7491 + 10];
        class335.method2017(arg0, 0, class657.field8682, 0, class569.field7491);
        for (int var2 = 0; var2 < class569.field7491; var2++) {
            class264.field3681[var2] = class657.field8682[var2].method1048();
        }
        int var3 = -100 / ((arg1 + 43) / 57);
        for (int var4 = class569.field7491; var4 < class657.field8682.length; var4++) {
            class264.field3681[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)V")
    public static void method2487(byte arg0) {
        if (arg0 != -38) {
            method2486(null, -73);
        }
        field5943 = null;
        field5942 = null;
        field5939 = null;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILha;IIIB)V")
    public static final void method2488(int arg0, class59 arg1, int arg2, int arg3, int arg4, byte arg5) {
        class45.field585 = arg1;
        int var6 = -45 % ((arg5 - 14) / 59);
        field5938++;
        class194.field2930 = class45.field585.method421();
        class681.field9513 = class45.field585.method421();
        class156.field2382 = class45.field585.method421();
        class696.field9703 = arg3;
        class410.field5681 = 0;
        class577.field7567 = null;
        class550.field7256 = null;
        class229.field3266 = arg0;
        class640.method3501(27424, arg2, arg4);
        class177.field2666 = -1;
        class304.field4330 = -1;
        class735.field10160 = -1;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lrv;II[B)V")
    public class431(class111 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5937 = arg0.method866(arg3, 0, arg1, class155.field2358, arg2, false);
        this.field5937.method595(1645, false, false);
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lrv;II[I)V")
    public class431(class111 arg0, int arg1, int arg2, int[] arg3) {
        this.field5937 = arg0.method927(arg1, arg3, (byte) -78, false, arg2);
        this.field5937.method595(1645, false, false);
    }
}
