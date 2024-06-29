import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class155 {

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2493 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "C")
    public static char field2496;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[[[Lpk;")
    public static class99[][][] field2492;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IJ)V")
    public static final void method1041(int arg0, long arg1) {
        if (!class107.field1867) {
            class121.field2039 += (float) arg1 * class120.field2027 / 40.0F;
            client.field3605 += (float) arg1 * class130.field2175 / 40.0F;
        }
        int var3 = class3.field43 + class197.field3179.field614;
        field2501++;
        int var4 = class232.field3694 + class197.field3179.field613;
        if ((class291.field4635 - var3) < -500 || class291.field4635 - var3 > 500 || class140.field2296 - var4 < -500 || (class140.field2296 - var4) > 500) {
            class140.field2296 = var4;
            class291.field4635 = var3;
        }
        if (arg0 >= -79) {
            return;
        }
        if (class291.field4635 != var3) {
            int var5 = var3 - class291.field4635;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class291.field4635 += var6;
        }
        if (class140.field2296 != var4) {
            int var7 = var4 - class140.field2296;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class140.field2296 += var8;
        }
        class156.method1046(109);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        int var1 = 112 % ((arg0 - 60) / 60);
        class219.field3510.method1831(-99);
        field2499++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
    public static final void method1043(byte arg0, int arg1) {
        class202.field3239.method1832(arg1, (byte) -114);
        field2497++;
        if (arg0 > -65) {
            method1045(-24);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static void method1044(int arg0) {
        int var1 = 119 % ((37 - arg0) / 42);
        field2492 = null;
        field2493 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)I")
    public static final int method1045(int arg0) {
        field2495++;
        if (arg0 > -110) {
            method1043((byte) 95, 68);
        }
        return 15;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class155() {
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lhg;)V")
    public class155(class155 arg0) {
        this.field2500 = arg0.field2500;
        this.field2498 = arg0.field2498;
        this.field2491 = arg0.field2491;
        this.field2490 = arg0.field2490;
    }
}
