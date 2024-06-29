import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class185 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public int field3000 = 16777215;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public int field3006 = 8;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[S")
    public static short[] field3005 = new short[] { 24, 42, 16, 45, 12, 6, 20, 23 };

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Lsl;")
    public static class39 field3013 = new class39(8);

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Z")
    public static boolean field3015 = false;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field3016 = 3353893;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3017 = "Loaded sprites";

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Z")
    public boolean field3012;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I", line = 6)
    public static final int method1181(int arg0) {
        class78.field1542 = arg0;
        field3011++;
        return class171.method1085(-1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Z", line = 15)
    public static final boolean method1182(byte arg0, int arg1) {
        field3009++;
        if (class19.field342 == arg1) {
            return false;
        }
        class99.field1748 = new int[4][13][13];
        class67.field1274 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class326.field4990[var2] = new class25(104, 104);
        }
        class99.field1749 = new byte[4][104][104];
        class6.field137 = new byte[4][104][104];
        class62.field1186 = new class55[4][104][104];
        if (class249.field3893) {
            class310.method2085(4, 104, 104);
            class60.method463(104, 104);
            class210.field3387 = new class336[13][13];
        }
        class19.field342 = arg1;
        if (arg0 <= 52) {
            method1181(34);
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 58)
    public static final void method1183(int arg0) {
        if (arg0 == 104) {
            class204.field3339.method1877(-29702);
            field3004++;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lag;IBI)V", line = 71)
    private final void method1184(class202 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 75) {
            this.field3003 = -111;
        }
        if (arg1 == 1) {
            this.field3006 = arg0.method1315(14289);
        } else if (arg1 == 2) {
            this.field3012 = true;
        } else if (arg1 == 3) {
            this.field3002 = arg0.method1356(false);
            this.field3007 = arg0.method1356(false);
            this.field3014 = arg0.method1356(false);
        } else if (arg1 == 4) {
            this.field3008 = arg0.method1317((byte) -125);
        } else if (arg1 == 5) {
            this.field3003 = arg0.method1315(14289);
        } else if (arg1 == 6) {
            this.field3000 = arg0.method1352((byte) 18);
        }
        field3001++;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 128)
    public static void method1185(int arg0) {
        field3013 = null;
        field3005 = null;
        if (arg0 > -76) {
            field3017 = (String) null;
        }
        field3017 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILag;)V", line = 140)
    public final void method1186(int arg0, int arg1, class202 arg2) {
        if (arg0 >= -116) {
            field3005 = (short[]) null;
        }
        field3010++;
        while (true) {
            int var4 = arg2.method1317((byte) -73);
            if (var4 == 0) {
                return;
            }
            this.method1184(arg2, var4, (byte) 75, arg1);
        }
    }
}
