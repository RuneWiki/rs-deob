import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class208 extends class112 {

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lhj;")
    public static class596 field2466 = new class596(5, 12);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2471 = new String[200];

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
    public static int[] field2473 = null;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lme;")
    public class208 field2467;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lme;")
    public class208 field2468;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lbt;")
    public static class48 field2470;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "[Lrc;")
    public static class565[] field2472;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1313(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class704.field9914[var1] = null;
        }
        if (arg0 != -4) {
            method1313((byte) -65);
        }
        field2465++;
        class89.field1190 = 0;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V", line = 22)
    public static void method1314(byte arg0) {
        field2471 = null;
        int var1 = 24 / ((64 - arg0) / 62);
        field2473 = null;
        field2472 = null;
        field2466 = null;
        field2470 = null;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V", line = 37)
    public final void method1315(byte arg0) {
        field2469++;
        if (this.field2468 == null) {
            return;
        }
        this.field2468.field2467 = this.field2467;
        this.field2467.field2468 = this.field2468;
        this.field2468 = null;
        this.field2467 = null;
        if (arg0 >= -35) {
            this.method1315((byte) -70);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lbt;I)I", line = 56)
    public static final int method1316(class48 arg0, int arg1) {
        field2464++;
        int var2 = 0;
        if (arg0.method433((byte) -104, class395.field5123)) {
            var2++;
        }
        if (arg0.method433((byte) -90, class653.field9016)) {
            var2++;
        }
        if (arg0.method433((byte) -79, class648.field8838)) {
            var2++;
        }
        if (arg0.method433((byte) -114, class507.field7208)) {
            var2++;
        }
        if (arg0.method433((byte) -105, class687.field9371)) {
            var2++;
        }
        if (arg0.method433((byte) -123, class183.field2236)) {
            var2++;
        }
        if (arg0.method433((byte) -120, class274.field3219)) {
            var2++;
        }
        if (arg0.method433((byte) -118, class424.field5632)) {
            var2++;
        }
        if (arg0.method433((byte) -91, class459.field6465)) {
            var2++;
        }
        if (arg0.method433((byte) -113, class298.field3563)) {
            var2++;
        }
        if (arg0.method433((byte) -127, class757.field10490)) {
            var2++;
        }
        if (arg0.method433((byte) -94, class141.field1768)) {
            var2++;
        }
        if (arg0.method433((byte) -120, class60.field796)) {
            var2++;
        }
        if (arg0.method433((byte) -93, class74.field1022)) {
            var2++;
        }
        if (arg1 != 200) {
            field2470 = null;
        }
        if (arg0.method433((byte) -112, class563.field7775)) {
            var2++;
        }
        if (arg0.method433((byte) -76, class256.field3030)) {
            var2++;
        }
        return var2;
    }
}
