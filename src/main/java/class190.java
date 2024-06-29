import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class190 extends class159 {

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2938 = new String[500];

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[Lsb;")
    public static class131[] field2943 = new class131[14];

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2946 = "Walk here";

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "J")
    public static long field2942 = 0L;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2955 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lsi;")
    public class264 field2937;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "Lsi;")
    public class264 field2951;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Ljava/lang/String;")
    public String field2947;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "Z")
    public boolean field2945;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "[I")
    public static int[] field2956;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field2940;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 4)
    public static final String method1312(byte arg0, long arg1) {
        field2952++;
        class294.field4895.setTime(new Date(arg1));
        int var3 = class294.field4895.get(7);
        int var4 = class294.field4895.get(5);
        if (arg0 != 64) {
            return (String) null;
        }
        int var5 = class294.field4895.get(2);
        int var6 = class294.field4895.get(1);
        int var7 = class294.field4895.get(11);
        int var8 = class294.field4895.get(12);
        int var9 = class294.field4895.get(13);
        return class243.field3840[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class107.field1539[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V", line = 36)
    public static void method1313(int arg0) {
        field2946 = null;
        field2938 = null;
        field2956 = null;
        if (arg0 != -5) {
            field2942 = 28L;
        }
        field2943 = null;
        field2955 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 58)
    public static final void method1314(boolean arg0) {
        if (!arg0) {
            class117.field1704.method644((byte) -67);
            class123.field1826.method644((byte) -68);
            field2941++;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILod;I)V", line = 73)
    public static final void method1315(int arg0, int arg1, class233 arg2, int arg3) {
        field2957++;
        if (arg1 != 8600) {
            field2943 = (class131[]) null;
        }
        if (arg2.field4795 == arg3 && arg3 != -1) {
            class131 var4 = class68.method476((byte) 118, arg3);
            int var5 = var4.field2004;
            if (var5 == 1) {
                arg2.field4776 = 0;
                arg2.field4767 = 1;
                arg2.field4715 = arg0;
                arg2.field4773 = 0;
                arg2.field4703 = 0;
                class276.method1970(var4, false, arg2.field4783, 90, arg2.field4796, arg2.field4773);
            }
            if (var5 == 2) {
                arg2.field4703 = 0;
            }
        } else if (arg3 == -1 || arg2.field4795 == -1 || class68.method476((byte) 105, arg3).field2011 >= class68.method476((byte) 119, arg2.field4795).field2011) {
            arg2.field4694 = arg2.field4792;
            arg2.field4795 = arg3;
            arg2.field4715 = arg0;
            arg2.field4767 = 1;
            arg2.field4773 = 0;
            arg2.field4703 = 0;
            arg2.field4776 = 0;
            if (arg2.field4795 != -1) {
                class276.method1970(class68.method476((byte) 118, arg2.field4795), false, arg2.field4783, arg1 - 8493, arg2.field4796, arg2.field4773);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V", line = 150)
    public static final void method1316(int arg0) {
        if (class15.field199 != null) {
            class15.field199.method1091(1);
        }
        if (arg0 >= -121) {
            method1313(-107);
        }
        field2944++;
        if (class291.field4828 != null) {
            class291.field4828.method1091(1);
        }
    }
}
