import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class670 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
    private boolean field9136 = false;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
    private boolean field9143 = true;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public int field9135 = 443;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field9145 = 43594;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
    public static int[] field9142 = new int[25];

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
    public static boolean field9148 = false;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field9140;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Ljava/lang/String;")
    public String field9144;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
    public static final boolean method3760(int arg0, int arg1, int arg2) {
        if (arg1 != -9301) {
            method3765(true);
        }
        field9147++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public final void method3761(int arg0) {
        if (arg0 != 0) {
            method3760(39, 119, 4);
        }
        field9146++;
        if (!this.field9143) {
            this.field9136 = true;
            this.field9143 = true;
        } else if (this.field9136) {
            this.field9136 = false;
        } else {
            this.field9143 = false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZILbp;)V")
    public static final void method3762(boolean arg0, int arg1, class387 arg2) {
        if (class593.field8116) {
            class593.field8116 = false;
            arg1 = 0;
        }
        field9137++;
        if (class394.field5785 == null || !class394.field5785.method2441(arg2, (byte) 84)) {
            class394.field5785 = arg2;
            class607.field8332 = class554.method3190(-78);
            class700.field9463 = arg1;
            class643.field8858 = arg1;
            if (class643.field8858 == 0) {
                class466.method2742(-1);
            } else {
                class177.field2724 = class371.field5292;
                class53.field1099 = class186.field2794;
                class94.field1659 = class590.field8054;
                class472.field6615 = class638.field8778;
                class614.field8390 = class537.field7432;
                class91.field1628 = class480.field6703;
                class284.field3971 = class507.field7057;
                class308.field4274 = class570.field7849;
                class494.field6827 = class182.field2758;
                class93.field1639 = class585.field7989;
            }
        }
        if (arg0) {
            field9148 = true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method3763(byte arg0) {
        if (arg0 > 46) {
            field9142 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lwea;B)Lof;")
    public final class622 method3764(class158 arg0, byte arg1) {
        if (arg1 != 36) {
            method3760(-105, -70, -80);
        }
        field9141++;
        return arg0.method1209(this.field9136, this.field9143 ? this.field9135 : this.field9145, this.field9144, arg1 ^ 0x6E65);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static final void method3765(boolean arg0) {
        class693.field9368.method2065((byte) 74, class693.field9368.field4452, 1);
        field9139++;
        class693.field9368.method2065((byte) 74, class693.field9368.field4458, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4447, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4461, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4417, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4453, 1);
        class693.field9368.method2065((byte) 74, class693.field9368.field4433, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4443, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4467, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4435, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4432, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4427, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4456, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4444, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4413, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4445, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4421, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4423, 0);
        class693.field9368.method2065((byte) 74, class693.field9368.field4440, 0);
        class254.method1731(55);
        class693.field9368.method2065((byte) 74, class693.field9368.field4428, 2);
        class693.field9368.method2065((byte) 74, class693.field9368.field4426, 2);
        class297.method1947(-1);
        class440.method2652(arg0);
        class274.field3858 = true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLpc;)Z")
    public final boolean method3766(byte arg0, class670 arg1) {
        if (arg0 <= 69) {
            return false;
        }
        field9138++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field9140 == arg1.field9140 && this.field9144.equals(arg1.field9144);
        }
    }
}
