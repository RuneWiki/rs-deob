import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class10 {

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "[I")
    public static int[] field169 = new int[4096];

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "Ldaa;")
    public class10 field174;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "Lfb;")
    public class675 field170;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method97(int arg0) {
        class550.field7257 = new class177[2000];
        class64.field787 = new int[class225.field3201][class735.field10163 + 1][class143.field2290 + 1];
        class332.field4730 = new class177[500];
        class247.field3434 = new class177[1000];
        class356.field4995 = 0;
        class392.field5478 = class384.field5377;
        class546.field7220 = class384.field5377;
        class44.field575 = new class177[500];
        class691.field9633 = 0;
        class383.field5368 = 0;
        class37.field525 = false;
        if (arg0 != -29670) {
            field169 = null;
        }
        field167++;
        class218.field3145 = 0;
        if ((class184.field2781 instanceof class695)) {
            class499.field6715 = false;
        } else {
            class499.field6715 = true;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 37)
    public static final void method98(boolean arg0, String arg1, byte arg2) {
        class538.method2985(arg2 ^ 0xD9, arg1, -1, -1, arg0);
        field172++;
        if (arg2 != 38) {
            field169 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII)I", line = 48)
    public static final int method99(int arg0, int arg1, int arg2, int arg3) {
        field173++;
        if (arg1 <= 2) {
            method99(94, -17, -75, 98);
        }
        if (arg3 >= arg2) {
            return arg0 >= arg3 ? arg3 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 59)
    public static void method100(int arg0) {
        if (arg0 != 0) {
            field169 = null;
        }
        field169 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V", line = 74)
    public final void method101(boolean arg0) {
        field168++;
        if (class34.field508 >= 500) {
            return;
        }
        if (!arg0) {
            this.field170 = null;
        }
        this.field174 = class371.field5164;
        this.field170 = null;
        class34.field508++;
        class371.field5164 = this;
    }
}
