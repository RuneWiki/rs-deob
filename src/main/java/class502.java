import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class502 extends class715 {

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "F")
    private float field7174 = 0.0F;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lwv;")
    private class34 field7167;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "[Lej;")
    public static class122[] field7171;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
    public static void method3014(byte arg0) {
        int var1 = 77 / ((arg0 - -13) / 46);
        field7171 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
    public final void method888(boolean arg0) {
        ++field7169;
        if (!arg0) {
            if (~super.field9979.method2727(true) == -1) {
                class25 var2 = super.field9979.method2722(-124);
                super.field9979.method2753((byte) -17, 1);
                class25 var3 = super.field9979.method2773((byte) -30);
                var3.method160(var2);
                var3.method178(0.125F, 0.125F, 1.0F, (byte) 89);
                var3.method170(0.0F, (byte) 95, 0.0F, this.field7174);
                super.field9979.method2699(class8.field128, -9);
                super.field9979.method2753((byte) -17, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            this.method693(125, (class355) null, -69);
        }
        ++field7175;
        return this.field7167.method219(arg0 + -14069);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        super.field9979.method2769(class140.field2165, class571.field8118, 18721);
        if (arg0 < -105) {
            ++field7170;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        ++field7173;
        super.field9979.method2753((byte) -17, 1);
        super.field9979.method2769(class571.field8118, class571.field8118, 18721);
        int var2 = 68 / ((-71 - arg0) / 42);
        super.field9979.method2767(0, 25103, class68.field1225);
        super.field9979.method2755(false, 0, class68.field1225);
        super.field9979.method1028(1, 0);
        super.field9979.method2732(-110, (class355) null);
        super.field9979.method2753((byte) -17, 0);
        super.field9979.method2755(false, 0, class68.field1225);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        ++field7168;
        super.field9979.method2753((byte) -17, 1);
        if (~(128 & arg0) != -1) {
            super.field9979.method2732(arg1 + -1850, (class355) null);
        } else if ((arg2 & 1) != 1) {
            if (this.field7167.field452) {
                super.field9979.method2732(-127, this.field7167.field440);
            } else {
                super.field9979.method2732(arg1 + -1857, this.field7167.field443[0]);
            }
        } else if (this.field7167.field452) {
            this.field7174 = (float) (super.field9979.field6479 % 4000) / 4000.0F;
            super.field9979.method2732(-101, this.field7167.field440);
        } else {
            int var4 = super.field9979.field6479 % 4000 * 16 / 4000;
            super.field9979.method2732(-91, this.field7167.field443[var4]);
        }
        if (arg1 == 1782) {
            super.field9979.method2753((byte) -17, 0);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        int var4 = -58 / ((arg0 - 31) / 50);
        super.field9979.method2732(-122, arg1);
        ++field7172;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lgt;Lwv;)V")
    public class502(class453 arg0, class34 arg1) {
        super(arg0);
        this.field7167 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        if (arg1 == 4) {
            ++field7166;
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2769(class140.field2165, class316.field4492, 18721);
            super.field9979.method1020(false, true, (byte) 65, 0, class68.field1225);
            super.field9979.method2755(false, 0, class44.field665);
            super.field9979.method1028(0, 0);
            super.field9979.method2753((byte) -17, 0);
            super.field9979.method2730(-16777216, -32755);
            super.field9979.method2755(false, 0, class142.field2176);
            this.method888(false);
        }
    }
}
