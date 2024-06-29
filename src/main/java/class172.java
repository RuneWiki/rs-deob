import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class172 extends class60 {

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2759 = new String[200];

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2761 = 0;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[I")
    public static int[] field2756;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "[Lwk;")
    public static class186[] field2767;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZLpk;Lpk;)V", line = 28)
    public static final void method1278(int arg0, boolean arg1, class120 arg2, class120 arg3) {
        class152.field2499 = arg3;
        field2758++;
        class4.field108 = arg2;
        class129.field2069 = arg1;
        if (arg0 <= 14) {
            method1280((class150) null, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 41)
    public static void method1279(int arg0) {
        field2756 = null;
        if (arg0 == 8138) {
            field2767 = null;
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljd;B)V", line = 55)
    public static final void method1280(class150 arg0, byte arg1) {
        class307.method2176(200000, arg0, arg1 - 13);
        field2757++;
        if (arg1 != 12) {
            field2759 = (String[]) null;
        }
    }
}
