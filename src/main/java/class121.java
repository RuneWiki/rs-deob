import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("n")
public class class121 extends class190 {

    @OriginalMember(owner = "n", name = "v", descriptor = "[J")
    private long[] field2355 = new long[10];

    @OriginalMember(owner = "n", name = "u", descriptor = "I")
    private int field2354 = 0;

    @OriginalMember(owner = "n", name = "x", descriptor = "I")
    private int field2357 = 256;

    @OriginalMember(owner = "n", name = "o", descriptor = "I")
    private int field2348 = 1;

    @OriginalMember(owner = "n", name = "n", descriptor = "J")
    private long field2347 = class123.method880(false);

    @OriginalMember(owner = "n", name = "l", descriptor = "Llf;")
    public static class109 field2345 = class35.method275("Regeln versto-8en hat)3", 2);

    @OriginalMember(owner = "n", name = "m", descriptor = "[Led;")
    public static class45[] field2346 = new class45[5000];

    @OriginalMember(owner = "n", name = "h", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "n", name = "i", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "n", name = "j", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "n", name = "p", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "n", name = "q", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "n", name = "r", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "n", name = "s", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "n", name = "t", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "n", name = "w", descriptor = "I")
    private int field2356;

    @OriginalMember(owner = "n", name = "y", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "n", name = "z", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "n", name = "k", descriptor = "[Lkf;")
    public static class100[] field2344;

    @OriginalMember(owner = "n", name = "c", descriptor = "(I)V")
    public static final void method869(int arg0) {
        class194.field3719 = -1;
        class200.field3850.field1773 = 0;
        class41.field860 = 0;
        field2350++;
        class204.field4006 = arg0;
        class95.field1934.field1773 = 0;
        class30.field655 = 0;
        class15.field289 = -1;
        class136.field2628 = -1;
        class51.field1041 = false;
        class40.field845 = 0;
        class115.field2283 = 0;
        class82.field1622 = -1;
        class149.field2882 = 0;
        for (int var1 = 0; var1 < class202.field3975.length; var1++) {
            if (class202.field3975[var1] != null) {
                class202.field3975[var1].field3582 = -1;
            }
        }
        for (int var2 = 0; var2 < class183.field3444.length; var2++) {
            if (class183.field3444[var2] != null) {
                class183.field3444[var2].field3582 = -1;
            }
        }
        class70.method448(102);
        class36.method278(30, (byte) -64);
        for (int var3 = 0; var3 < 100; var3++) {
            class194.field3721[var3] = true;
        }
    }

    @OriginalMember(owner = "n", name = "d", descriptor = "(I)V")
    public static void method870(int arg0) {
        field2344 = null;
        field2346 = null;
        if (arg0 != 0) {
            field2341 = 56;
        }
        field2345 = null;
    }

    @OriginalMember(owner = "n", name = "e", descriptor = "(I)V")
    public static final void method871(int arg0) {
        field2343++;
        if (class55.field1114 != null) {
            class55.field1114.method915((byte) -94);
            class55.field1114 = null;
        }
        class125.method917((byte) -93);
        class26.method219();
        for (int var1 = 0; var1 < 4; var1++) {
            class168.field3116[var1].method751(true);
        }
        System.gc();
        class49.method333(2, 1);
        class131.field2524 = arg0;
        class36.field792 = false;
        class109.method780(110);
        class36.method278(10, (byte) -64);
    }

    @OriginalMember(owner = "n", name = "a", descriptor = "(IIB)I")
    public final int method872(int arg0, int arg1, byte arg2) {
        field2353++;
        int var4 = this.field2357;
        if (arg2 != -58) {
            method875(54, -116);
        }
        this.field2357 = 300;
        int var5 = this.field2348;
        this.field2348 = 1;
        this.field2347 = class123.method880(false);
        if (this.field2355[this.field2356] == 0L) {
            this.field2357 = var4;
            this.field2348 = var5;
        } else if (this.field2355[this.field2356] < this.field2347) {
            this.field2357 = (int) ((long) (arg0 * 2560) / (this.field2347 - this.field2355[this.field2356]));
        }
        if (this.field2357 < 25) {
            this.field2357 = 25;
        }
        if (this.field2357 > 256) {
            this.field2357 = 256;
            this.field2348 = (int) ((long) arg0 - (this.field2347 - this.field2355[this.field2356]) / 10L);
        }
        if (this.field2348 > arg0) {
            this.field2348 = arg0;
        }
        this.field2355[this.field2356] = this.field2347;
        this.field2356 = (this.field2356 + 1) % 10;
        if (this.field2348 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2355[var6] != 0L) {
                    this.field2355[var6] += this.field2348;
                }
            }
        }
        if (arg1 > this.field2348) {
            this.field2348 = arg1;
        }
        class54.method354((long) this.field2348, -113);
        int var7 = 0;
        while (this.field2354 < 256) {
            this.field2354 += this.field2357;
            var7++;
        }
        this.field2354 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "n", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method873(int arg0, Component arg1) {
        arg1.removeKeyListener(class205.field4019);
        arg1.removeFocusListener(class205.field4019);
        field2351++;
        class77.field1475 = arg0;
    }

    @OriginalMember(owner = "n", name = "b", descriptor = "(I)V")
    public final void method874(int arg0) {
        field2358++;
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field2355[var2] = 0L;
        }
    }

    @OriginalMember(owner = "n", name = "<init>", descriptor = "()V")
    public class121() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2355[var1] = this.field2347;
        }
    }

    @OriginalMember(owner = "n", name = "a", descriptor = "(II)V")
    public static final void method875(int arg0, int arg1) {
        if (arg0 != 255) {
            field2342 = -60;
        }
        field2352++;
        class106 var2 = (class106) class76.field1466.method337((long) arg1, (byte) -76);
        if (var2 != null) {
            var2.method452(true);
        }
    }
}
