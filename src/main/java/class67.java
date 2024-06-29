import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class67 {

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "J")
    public long field1110 = 0L;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
    public static int[] field1099 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1115 = "Loaded config";

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lbg;")
    public class264 field1102;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lbg;")
    public class264 field1112;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 >= -73) {
            return;
        }
        field1109++;
        if (class176.method1165(arg2, -31001)) {
            class103.method751(arg7, arg8, arg0, 97, arg6, arg4, -1, arg1, arg5, class275.field4236[arg2]);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class17.field315[var9] = true;
            }
        } else {
            class17.field315[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method533(byte arg0) {
        field1115 = null;
        if (arg0 != 24) {
            field1114 = 2;
        }
        field1099 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIZLpk;II)V")
    public static final void method534(byte arg0, int arg1, boolean arg2, class237 arg3, int arg4, int arg5) {
        class133.field1952 = arg4;
        class280.field4299 = arg5;
        class181.field2643 = arg1;
        class287.field4391 = 1;
        int var6 = -42 % ((arg0 + 31) / 50);
        class37.field649 = 10000;
        class11.field162 = arg3;
        class141.field2034 = arg2;
        field1104++;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method535(byte arg0) {
        field1108++;
        class155.field2273 = new class39(32);
        if (arg0 > -61) {
            field1099 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
    public static final void method536(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return;
        }
        field1103++;
        class218.method1467(false, -111);
        class51.field836 = arg2;
        class156.field2282 = arg0;
        class102.method748((byte) 39, arg3);
    }
}
