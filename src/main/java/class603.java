import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class603 extends class379 {

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "J")
    public long field8142;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Lfj;")
    public static class684 field8144 = new class684(14, 7);

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field8147 = 0;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field8145 = 0;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "Lbt;")
    public static class48 field8148;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static final void method3436(byte arg0) {
        field8140++;
        if (class31.field491 != null) {
            class243.method1465(class506.field7198, 2);
        } else if (class48.field648 == -1) {
            class410.method2453(class506.field7198, -24782, class710.field9967, class742.field10333);
        } else {
            class424.method2534(72, class506.field7198);
        }
        if (arg0 <= 80) {
            method3438(false);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static final void method3437(int arg0) {
        field8143++;
        if (!class372.field4675) {
            class174.field2108 += (-12.0F - class174.field2108) / 2.0F;
            class197.field2345 = true;
            int var1 = -87 % ((arg0 - 74) / 40);
            class372.field4675 = true;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
    public static final void method3438(boolean arg0) {
        field8139++;
        if (class757.field10482 != null) {
            class691.field9417 = new class647();
            class691.field9417.method3642(class757.field10482, class114.field1434, class757.field10482.field389, class757.field10482.field386.method3584(class770.field10592, arg0), 0);
            class462.field6488 = new Thread(class691.field9417, "");
            class462.field6488.start();
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public static final void method3439(byte arg0) {
        int var1 = 104 / ((arg0 - 4) / 35);
        field8141++;
        if (class73.field1012 <= 0) {
            class569.field7802 = "";
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class75.field1041.length; var3++) {
            if (class75.field1041[var3].indexOf("--> ") != -1) {
                var2++;
                if (class73.field1012 == var2) {
                    class569.field7802 = class75.field1041[var3].substring(class75.field1041[var3].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class603() {
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public static void method3440(int arg0) {
        field8144 = null;
        field8148 = null;
        if (arg0 != -9086) {
            method3440(64);
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(J)V")
    public class603(long arg0) {
        this.field8142 = arg0;
    }
}
