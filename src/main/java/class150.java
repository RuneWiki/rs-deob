import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class150 extends class139 {

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lcc;")
    public static class216 field2441 = new class216(64);

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[I")
    public static int[] field2445 = new int[5];

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2446 = "Connection lost.";

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "C")
    private char field2443;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Ljava/lang/String;")
    public String field2436;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BILv;)V")
    private final void method1062(byte arg0, int arg1, class152 arg2) {
        if (arg1 == 1) {
            this.field2443 = class226.method1620(104, arg2.method1092((byte) -62));
        } else if (arg1 == 2) {
            this.field2440 = arg2.method1097(127);
        } else if (arg1 == 5) {
            this.field2436 = arg2.method1078(-1);
        }
        field2437++;
        if (arg0 >= -104) {
            this.field2443 = (char) 65428;
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public static final void method1063(int arg0) {
        field2442++;
        if (class73.field1051) {
            return;
        }
        if (class113.field1640) {
            class190.field3068 = (float) ((int) class190.field3068 - 65 & 0xFFFFFF80);
        } else {
            class44.field642 += (-24.0F - class44.field642) / 2.0F;
        }
        class211.field3380 = true;
        int var1 = -17 / ((-arg0 - 39) / 43);
        class73.field1051 = true;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        if (arg0 >= 67) {
            field2445 = null;
            field2441 = null;
            field2446 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)Z")
    public final boolean method1065(int arg0) {
        field2438++;
        if (arg0 != -116) {
            field2444 = -83;
        }
        return this.field2443 == 's';
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILv;)V")
    public final void method1066(int arg0, class152 arg1) {
        if (arg0 != 29795) {
            return;
        }
        while (true) {
            int var3 = arg1.method1111(255);
            if (var3 == 0) {
                field2439++;
                return;
            }
            this.method1062((byte) -127, var3, arg1);
        }
    }
}
