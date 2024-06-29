import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public abstract class class19 extends class362 {

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field289 = 1400;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "Lwq;")
    public static class169 field290 = new class169(3);

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "Lmu;")
    public static class303 field292 = new class303(101, 20);

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "Lmu;")
    public static class303 field293 = new class303(36, -2);

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "[Lfe;")
    public static class570[] field295 = new class570[4];

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "[Lmi;")
    public static class496[] field294;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 5)
    public static final void method144(int arg0) {
        class299.field4185 = new int[class510.field7094][class434.field6208 + 1][class432.field6185 + 1];
        field291++;
        class331.field4631 = 0;
        class10.field138 = class1.field3;
        class238.field3449 = new class546[2000];
        class22.field536 = class1.field3;
        class216.field3139 = false;
        class649.field8933 = new class546[500];
        class239.field3493 = 0;
        class85.field1531 = 0;
        class49.field1042 = new class546[1000];
        if (arg0 > -113) {
            field290 = null;
        }
        class454.field6412 = 0;
        class634.field8720 = new class546[500];
        if (class44.field982 instanceof class694) {
            class728.field9848 = false;
        } else {
            class728.field9848 = true;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILs;)V", line = 41)
    public static final void method148(int arg0, class281 arg1) {
        class683.field9250[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)V", line = 48)
    public static void method149(int arg0) {
        field293 = null;
        if (arg0 != 5) {
            method148(-103, null);
        }
        field292 = null;
        field295 = null;
        field294 = null;
        field290 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)I")
    public abstract int method143(byte arg0);

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I")
    public abstract int method145(int arg0);

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)I")
    public abstract int method146(int arg0);

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)J")
    public abstract long method147(byte arg0);

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(I)I")
    public abstract int method150(int arg0);
}
