import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class37 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Z")
    public boolean field592 = false;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
    public static int[] field601 = new int[100];

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lcd;")
    public static class64 field602 = class44.method335((byte) 71, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lcd;")
    public static class64 field598 = class44.method335((byte) 71, " ");

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field595 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lcd;")
    public static class64 field605 = class44.method335((byte) 71, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "J")
    public long field593;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "La;")
    public class262 field599;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLqm;II)Lvd;", line = 17)
    public static final class127 method297(byte arg0, class222 arg1, int arg2, int arg3) {
        field600++;
        if (arg0 > -107) {
            method300((byte) -78);
        }
        return class135.method966(124, arg3, arg2, arg1) ? class137.method983((byte) -48) : null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 32)
    public static final void method298(int arg0) {
        class228.field3878 = 0;
        field603++;
        class182.field3125 = 0;
        class83.method638(-104);
        class312.method2152(1);
        class247.method1786(0);
        for (int var1 = 0; var1 < class182.field3125; var1++) {
            int var2 = class310.field5265[var1];
            if (class29.field482 != class2.field12[var2].field1911) {
                if (class2.field12[var2].field3911.method62(arg0 - 15755)) {
                    class220.method1566(class2.field12[var2], false);
                }
                class2.field12[var2].field3911 = null;
                class2.field12[var2] = null;
            }
        }
        if (class26.field428 != class108.field1991.field281) {
            throw new RuntimeException("gnp1 pos:" + class108.field1991.field281 + " psize:" + class26.field428);
        } else if (arg0 == 24723) {
            for (int var3 = 0; var3 < class218.field3707; var3++) {
                if (class2.field12[class254.field4422[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class218.field3707);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BZ)Lka;", line = 87)
    public static final class179 method299(byte[] arg0, boolean arg1) {
        field597++;
        if (arg0 == null) {
            return null;
        }
        class179 var2;
        if (class123.field2216) {
            var2 = new class219(arg0, class234.field3959, class251.field4365, class223.field3811, class310.field5263, class58.field969);
        } else {
            var2 = new class231(arg0, class234.field3959, class251.field4365, class223.field3811, class310.field5263, class58.field969);
        }
        if (!arg1) {
            field595 = (Calendar) null;
        }
        class251.method1803(-1);
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 132)
    public static void method300(byte arg0) {
        field602 = null;
        field605 = null;
        field601 = null;
        field595 = null;
        field598 = null;
        if (arg0 != -68) {
            field598 = (class64) null;
        }
    }
}
