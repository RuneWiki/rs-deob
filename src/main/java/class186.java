import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class186 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lpm;")
    public static class349 field2652 = new class349("M", "M", "M", "M");

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2659 = -1;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
    public static int[] field2660 = new int[50];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[[Lbr;")
    public static class223[][] field2657;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 4)
    public static void method1332(int arg0) {
        if (arg0 != -1) {
            field2657 = null;
        }
        field2657 = null;
        field2652 = null;
        field2660 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 20)
    public static final void method1333(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6, int arg7) {
        field2653++;
        for (int var8 = 99; var8 > 0; var8--) {
            class358.field5173[var8] = class358.field5173[var8 - 1];
            class317.field4660[var8] = class317.field4660[var8 - 1];
            class301.field4399[var8] = class301.field4399[var8 - 1];
            class215.field3078[var8] = class215.field3078[var8 - 1];
            class204.field2887[var8] = class204.field2887[var8 - 1];
            class305.field4451[var8] = class305.field4451[var8 - 1];
            class429.field6108[var8] = class429.field6108[var8 - 1];
        }
        class358.field5173[0] = arg1;
        class301.field4399[0] = arg6;
        class317.field4660[0] = arg7;
        class215.field3078[0] = arg4;
        class204.field2887[0] = arg3;
        class125.field1670 = class428.field6095;
        class142.field2157++;
        class429.field6108[arg0] = arg5;
        class305.field4451[0] = arg2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IC)Z", line = 53)
    public static final boolean method1334(int arg0, char arg1) {
        field2655++;
        if (arg0 != 97) {
            method1333(-48, -65, (String) null, (String) null, (String) null, 122, (String) null, -55);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILbr;)Lbr;", line = 65)
    public static final class223 method1335(int arg0, class223 arg1) {
        field2658++;
        if (~arg1.field3212 != arg0) {
            return class438.method2732(arg1.field3212, 0);
        }
        int var2 = arg1.field3227 >>> 16;
        class410 var3 = new class410(class318.field4662);
        for (class253 var4 = (class253) var3.method2598(12584); var4 != null; var4 = (class253) var3.method2595((byte) 67)) {
            if (var4.field3746 == var2) {
                return class438.method2732((int) var4.field6070, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 99)
    public static final void method1336(int arg0, int arg1) {
        class15 var2 = class317.field4658;
        synchronized (class317.field4658) {
            if (arg1 != -1) {
                return;
            }
            class317.field4658.method91(4, arg0);
        }
        field2654++;
        class15 var3 = class392.field5506;
        synchronized (class392.field5506) {
            class392.field5506.method91(arg1 + 5, arg0);
        }
    }
}
