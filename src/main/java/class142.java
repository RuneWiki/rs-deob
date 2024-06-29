import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class142 extends class117 {

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
    public static int[] field2062 = new int[1000];

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Z")
    public static boolean field2064 = false;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field2063 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 8)
    public static void method1025(byte arg0) {
        field2062 = null;
        if (arg0 != 116) {
            method1025((byte) -27);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIBLjava/lang/String;)V", line = 34)
    public static final void method1026(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5, byte arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class213.field3073[var8] = class213.field3073[var8 - 1];
            class30.field427[var8] = class30.field427[var8 - 1];
            class146.field2102[var8] = class146.field2102[var8 - 1];
            class259.field3862[var8] = class259.field3862[var8 - 1];
            class143.field2074[var8] = class143.field2074[var8 - 1];
            class15.field221[var8] = class15.field221[var8 - 1];
            class209.field3049[var8] = class209.field3049[var8 - 1];
        }
        if (arg6 != 30) {
            method1025((byte) 79);
        }
        class146.field2102[0] = arg2;
        class213.field3073[0] = arg5;
        class30.field427[0] = arg4;
        class209.field3049[0] = arg3;
        class207.field3028 = class68.field989;
        class259.field3862[0] = arg7;
        field2060++;
        class20.field318++;
        class143.field2074[0] = arg1;
        class15.field221[0] = arg0;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V", line = 66)
    public class142(int arg0, int arg1) {
        this.field2061 = arg1;
        this.field2059 = arg0;
    }
}
