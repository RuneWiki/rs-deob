import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class209 {

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lpca;")
    private class653 field2539 = new class653(256);

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Le;")
    private class486 field2541;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lap;")
    private class435 field2538;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lkfa;")
    public static class549 field2537 = new class549(36, 12);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lsg;")
    public static class361 field2546;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Le;")
    public static class486 field2545;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1258(byte arg0) {
        field2544++;
        if (arg0 != -26) {
            field2537 = null;
        }
        if (class266.field3350 != null) {
            class266.field3350.method3548(false);
            class567.field8034 = null;
            class266.field3350 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1259(int arg0) {
        field2537 = null;
        if (arg0 != -1) {
            method1258((byte) -39);
        }
        field2545 = null;
        field2546 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public final void method1260(int arg0) {
        if (arg0 != 15146) {
            this.field2539 = null;
        }
        this.field2539.method3691(false, 5);
        field2542++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public final void method1261(boolean arg0) {
        this.field2539.method3687((byte) -10);
        field2543++;
        if (arg0) {
            method1262(-27);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        class645.field9139.method3684(-17200);
        field2540++;
        class522.field7475.method3684(-17200);
        class461.field6407.method3684(-17200);
        class149.field1701.method3684(-17200);
        if (arg0 <= -60) {
            class591.field8401.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Lkp;")
    public final class446 method1263(int arg0, byte arg1) {
        field2536++;
        Object var3 = this.field2539.method3690((byte) 123, (long) arg0);
        if (var3 != null) {
            return (class446) var3;
        } else if (this.field2541.method843(arg0, 31340)) {
            int var4 = 22 / ((arg1 + 79) / 45);
            class414 var5 = this.field2541.method846((byte) -104, arg0);
            int var6 = var5.field5499 ? 64 : this.field2538.field5917;
            class446 var8;
            if (var5.field5485 && this.field2538.method310()) {
                float[] var7 = this.field2541.method851(false, 0.7F, (byte) -125, arg0, var6, var6);
                var8 = new class446(this.field2538, 3553, 34842, var6, var6, var5.field5497 != 0, var7, 6408);
            } else {
                int[] var9;
                if (var5.field5496) {
                    var9 = this.field2541.method845(arg0, 0.7F, var6, true, var6, false);
                } else {
                    var9 = this.field2541.method854(0.7F, -4476, true, var6, arg0, var6);
                }
                var8 = new class446(this.field2538, 3553, 6408, var6, var6, var5.field5497 != 0, var9, false);
            }
            var8.method2467(var5.field5490, var5.field5494, 59);
            this.field2539.method3683(var8, (byte) -112, (long) arg0);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lap;Le;)V")
    public class209(class435 arg0, class486 arg1) {
        this.field2541 = arg1;
        this.field2538 = arg0;
    }
}
