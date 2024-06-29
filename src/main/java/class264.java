import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class264 extends class155 {

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Lrm;")
    public class162 field4403;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4400 = "Please remove ";

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4413 = "Connection lost.";

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public int field4414;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhg;I)Ljava/lang/String;")
    public static final String method1867(class207 arg0, int arg1) {
        field4405++;
        if (client.method732(arg0).method126((byte) -128) == 0) {
            return null;
        }
        if (arg1 != 3998) {
            method1867((class207) null, 50);
        }
        if (arg0.field3437 == null || arg0.field3437.trim().length() == 0) {
            return class45.field701 ? "Hidden-use" : null;
        } else {
            return arg0.field3437;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(CII)I")
    public static final int method1868(char arg0, int arg1, int arg2) {
        field4411++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return arg2 < 95 ? 67 : var3;
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V")
    public static final void method1869(int arg0) {
        field4406++;
        int var1 = client.method721(false);
        if (var1 == 0) {
            class161.field2621 = null;
            class241.method1725((byte) -122, 0);
        } else if (var1 == 1) {
            class307.method2076((byte) 0, 4);
            class241.method1725((byte) 112, 512);
            if (class67.field1132 != null) {
                class174.method1285(0);
            }
        } else {
            class307.method2076((byte) (class147.field2427 - 4 & 0xFF), 4);
            class241.method1725((byte) -46, 2);
        }
        if (arg0 == 0) {
            class244.field4090 = class182.field2898;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)V")
    public static final void method1870(int arg0, int arg1) {
        class16.field320 = -1;
        class220.field3704 = 0;
        if (arg1 >= -7) {
            return;
        }
        class23.field418 = null;
        class101.field1608 = 1;
        class134.field2201 = false;
        class3.field106 = arg0;
        field4402++;
        class254.field4315 = -1;
    }

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "(I)V")
    public static void method1871(int arg0) {
        field4413 = null;
        field4400 = null;
        int var1 = -46 / ((-arg0 - 31) / 56);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lrm;Lge;)V")
    public class264(class162 arg0, class139 arg1) {
        this.field4403 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
    public final void method1872(int arg0, int arg1, int arg2, int arg3) {
        this.field4404 = arg2;
        if (arg0 != -4903) {
            this.field4403 = null;
        }
        field4412++;
        this.field4409 = arg3;
        this.field4407 = arg1;
    }
}
