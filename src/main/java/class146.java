import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class146 extends class81 {

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static volatile int field2609 = 0;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[Lhk;")
    public static class122[] field2610 = new class122[0];

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[Llj;")
    public static class25[] field2613 = new class25[4];

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IJ)Lpj;")
    public static final class237 method995(int arg0, long arg1) {
        field2608++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class33.field718[(int) (var8 - (arg1 * 37L))];
            }
            class237 var7 = new class237();
            if (arg0 != 270) {
                field2613 = null;
            }
            var7.field4151 = var6;
            var7.field4114 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static void method996(int arg0) {
        field2613 = null;
        field2610 = null;
        if (arg0 != 0) {
            field2613 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lpj;ZZ)V")
    public static final void method997(class237 arg0, boolean arg1, boolean arg2) {
        field2612++;
        if (arg1) {
            try {
                class234.field4048.getAppletContext().showDocument(arg0.method1617(class234.field4048.getCodeBase(), 0), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class234.field4048.getAppletContext().showDocument(arg0.method1617(class234.field4048.getCodeBase(), 0), "_top");
            } catch (Exception var4) {
            }
        }
        if (arg2) {
            method996(-53);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
    public class146(int arg0, int arg1) {
        this.field2614 = arg1;
        this.field2611 = arg0;
    }
}
