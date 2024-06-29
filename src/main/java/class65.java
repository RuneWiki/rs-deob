import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class65 extends class188 {

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field777 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public int field783 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public int field782 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public int field787 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public int field788 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field781 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field784 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public int field790 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "Lng;")
    public class182 field789;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field778 = "";

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field774 = 0;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lnk;")
    public static class16 field786;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 10)
    public static final void method393(int arg0) {
        if (class302.field4708 == 2) {
            if (class78.field1026 == class344.field5450 && class327.field5237 == class190.field2851) {
                class302.field4708 = 0;
                if (class67.field847 && class276.field4349[81] && class74.field924 > 2) {
                    class207.method1448(class74.field924 - 2, -93);
                } else {
                    class207.method1448(class74.field924 - 1, -98);
                }
            }
        } else if (class344.field5450 == class301.field4694 && class190.field2851 == class19.field223) {
            class302.field4708 = 0;
            if (class67.field847 && class276.field4349[81] && class74.field924 > 2) {
                class207.method1448(class74.field924 - 2, -113);
            } else {
                class207.method1448(class74.field924 - 1, -112);
            }
        } else {
            class327.field5237 = class19.field223;
            class302.field4708 = 2;
            class78.field1026 = class301.field4694;
        }
        int var1 = -119 % ((42 - arg0) / 47);
        field780++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 67)
    public static void method394(boolean arg0) {
        field786 = null;
        if (arg0) {
            method395((byte) 71);
        }
        field778 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 80)
    public static final void method395(byte arg0) {
        field785++;
        class255.field4033.method383((byte) -48);
        class252.field3999.method383((byte) -48);
        class135.field2027.method383((byte) -48);
        if (arg0 != -107) {
            method393(66);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lng;)V", line = 153)
    public class65(class182 arg0) {
        this.field789 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z", line = 118)
    public final boolean method396(int arg0, int arg1, int arg2) {
        field775++;
        if (arg0 != Integer.MAX_VALUE) {
            return false;
        } else if (this.field788 <= arg1 && arg1 <= this.field783 && this.field782 <= arg2 && arg2 <= this.field790) {
            return true;
        } else {
            return arg1 >= this.field781 && this.field777 >= arg1 && arg2 >= this.field787 && this.field784 >= arg2;
        }
    }
}
