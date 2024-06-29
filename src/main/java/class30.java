import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class30 extends class104 {

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "[S")
    public static short[] field371 = new short[500];

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field382 = new String[1000];

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field383 = -1;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "C")
    private char field381;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "Ljava/lang/String;")
    public String field373;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lge;IZBIZLge;)I", line = 5)
    public static final int method180(class163 arg0, int arg1, boolean arg2, byte arg3, int arg4, boolean arg5, class163 arg6) {
        field376++;
        int var7 = class137.method912(arg1, arg6, arg0, arg5, (byte) 111);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            if (arg3 != 127) {
                method185((byte) -38);
            }
            int var8 = class137.method912(arg4, arg6, arg0, arg2, (byte) -55);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Z", line = 41)
    public final boolean method181(int arg0) {
        field372++;
        if (arg0 != 500) {
            this.field373 = (String) null;
        }
        return this.field381 == 's';
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z", line = 56)
    public static final boolean method182(int arg0, int arg1) {
        field379++;
        if (arg0 == 10876) {
            return (-arg1 & arg1) == arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 70)
    public static final void method183(int arg0) {
        field375++;
        class58.field706 = null;
        if (arg0 != 21385) {
            method185((byte) 87);
        }
        class162.method1066(class314.field4847, 0, -1, 0, class188.field2712, class146.field2031, 0, -18460, 0);
        if (class58.field706 != null) {
            class25.method161(class134.field1850, 0, class314.field4847, -1412584499, class188.field2712, 0, class110.field1540.field4064, 15024, class58.field706, class166.field2294);
            class58.field706 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lp;I)V", line = 96)
    public final void method184(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method661(-1);
            if (var3 == 0) {
                field384++;
                if (arg1 != -1) {
                    method183(-122);
                }
                return;
            }
            this.method186(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 117)
    public static void method185(byte arg0) {
        field371 = null;
        if (arg0 != 98) {
            field371 = (short[]) null;
        }
        field382 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLp;I)V", line = 128)
    private final void method186(boolean arg0, class107 arg1, int arg2) {
        if (arg0) {
            this.method181(104);
        }
        if (arg2 == 1) {
            this.field381 = class236.method1678(arg1.method679(-3), -1);
        } else if (arg2 == 2) {
            this.field377 = arg1.method676(!arg0);
        } else if (arg2 == 5) {
            this.field373 = arg1.method628(false);
        }
        field374++;
    }
}
