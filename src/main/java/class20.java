import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Lhs;")
    public class218 field228 = new class218();

    @OriginalMember(owner = "client!an", name = "g", descriptor = "[Lfd;")
    public static class373[] field234 = new class373[8];

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[[S")
    public static short[][] field230 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Leh;")
    public static class246 field237 = new class246(0, -1);

    @OriginalMember(owner = "client!an", name = "k", descriptor = "Lfc;")
    public static class174 field238 = new class174(4);

    @OriginalMember(owner = "client!an", name = "l", descriptor = "[Ltj;")
    public static class135[] field239 = new class135[0];

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Lhs;")
    private class218 field236;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lhs;I)V")
    public final void method104(class218 arg0, int arg1) {
        if (arg0.field3155 != null) {
            arg0.method1355(arg1 ^ 0xFFFFBD2E);
        }
        field233++;
        arg0.field3163 = this.field228;
        arg0.field3155 = this.field228.field3155;
        arg0.field3155.field3163 = arg0;
        arg0.field3163.field3155 = arg0;
        if (arg1 != 24) {
            this.method107((byte) -126);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
    public final int method105(byte arg0) {
        field235++;
        int var2 = 0;
        class218 var3 = this.field228.field3163;
        while (this.field228 != var3) {
            var3 = var3.field3163;
            var2++;
        }
        if (arg0 < 80) {
            field234 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public final void method106(byte arg0) {
        if (arg0 <= 38) {
            field237 = null;
        }
        field232++;
        while (true) {
            class218 var2 = this.field228.field3163;
            if (this.field228 == var2) {
                this.field236 = null;
                return;
            }
            var2.method1355(-17098);
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lhs;")
    public final class218 method107(byte arg0) {
        field231++;
        class218 var2 = this.field236;
        int var3 = 55 % ((-arg0 - 83) / 41);
        if (this.field228 == var2) {
            this.field236 = null;
            return null;
        } else {
            this.field236 = var2.field3163;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static void method108(int arg0) {
        if (arg0 != -27335) {
            method108(-9);
        }
        field234 = null;
        field230 = null;
        field239 = null;
        field238 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lhs;")
    public final class218 method109(int arg0) {
        if (arg0 != -14019) {
            this.method109(105);
        }
        field229++;
        class218 var2 = this.field228.field3163;
        if (this.field228 == var2) {
            this.field236 = null;
            return null;
        } else {
            this.field236 = var2.field3163;
            return var2;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class20() {
        this.field228.field3163 = this.field228;
        this.field228.field3155 = this.field228;
    }
}
