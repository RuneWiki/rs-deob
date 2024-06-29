import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class249 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lss;")
    private class272 field3675 = new class272();

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Lus;")
    public static class1 field3677 = new class1(3, 8);

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "Z")
    public static boolean field3685 = false;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lss;")
    private class272 field3681;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILss;)V")
    public final void method1553(int arg0, class272 arg1) {
        if (arg1.field3964 != null) {
            arg1.method1673((byte) 27);
        }
        field3679++;
        if (arg0 >= -83) {
            this.method1557(true);
        }
        arg1.field3968 = this.field3675;
        arg1.field3964 = this.field3675.field3964;
        arg1.field3964.field3968 = arg1;
        arg1.field3968.field3964 = arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Lss;")
    public final class272 method1554(int arg0) {
        field3678++;
        class272 var2 = this.field3681;
        if (arg0 != -11541) {
            this.method1556((byte) 111);
        }
        if (this.field3675 == var2) {
            this.field3681 = null;
            return null;
        } else {
            this.field3681 = var2.field3968;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)V")
    public static final void method1555(int arg0, byte arg1) {
        class30.field405 = new int[arg0];
        class320.field4633 = new int[arg0];
        class34.field444 = new int[arg0];
        if (arg1 == 76) {
            class69.field875 = new int[arg0];
            field3676++;
            class421.field5881 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
    public final int method1556(byte arg0) {
        field3682++;
        int var2 = -87 / ((arg0 + 13) / 56);
        int var3 = 0;
        class272 var4 = this.field3675.field3968;
        while (this.field3675 != var4) {
            var4 = var4.field3968;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public final void method1557(boolean arg0) {
        if (!arg0) {
            method1555(-122, (byte) -77);
        }
        while (true) {
            class272 var2 = this.field3675.field3968;
            if (this.field3675 == var2) {
                field3684++;
                this.field3681 = null;
                return;
            }
            var2.method1673((byte) 27);
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)Lss;")
    public final class272 method1558(boolean arg0) {
        if (!arg0) {
            this.field3675 = null;
        }
        field3680++;
        class272 var2 = this.field3675.field3968;
        if (this.field3675 == var2) {
            this.field3681 = null;
            return null;
        } else {
            this.field3681 = var2.field3968;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(Z)Lss;")
    public final class272 method1559(boolean arg0) {
        field3683++;
        class272 var2 = this.field3675.field3968;
        if (this.field3675 == var2) {
            return null;
        }
        if (arg0) {
            this.method1557(true);
        }
        var2.method1673((byte) 27);
        return var2;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
    public class249() {
        this.field3675.field3968 = this.field3675;
        this.field3675.field3964 = this.field3675;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
    public static void method1560(byte arg0) {
        field3677 = null;
        if (arg0 != 70) {
            field3685 = false;
        }
    }
}
