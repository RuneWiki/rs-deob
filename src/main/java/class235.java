import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class235 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public int field3124 = -1;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public int field3130 = 64;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public int field3131 = 64;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Z")
    public boolean field3127 = false;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public int field3132 = 1;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Z")
    public boolean field3125 = false;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public int field3126 = 2;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "[I")
    public static int[] field3133 = new int[200];

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lhw;")
    public static class141 field3128;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Luq;")
    public static class172 field3135;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "[S")
    public static short[] field3136;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 3)
    public static void method1488(byte arg0) {
        field3135 = null;
        field3136 = null;
        field3133 = null;
        field3128 = null;
        if (arg0 != -54) {
            field3128 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILdt;I)V", line = 22)
    public final void method1489(int arg0, class254 arg1, int arg2) {
        if (arg2 != -15766) {
            field3135 = null;
        }
        while (true) {
            int var4 = arg1.method1731((byte) 64);
            if (var4 == 0) {
                field3139++;
                return;
            }
            this.method1494(var4, arg1, arg0, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)Z", line = 43)
    public static final boolean method1490(byte arg0, int arg1) {
        if (arg0 == 54) {
            field3137++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(BI)Z", line = 55)
    public static final boolean method1491(byte arg0, int arg1) {
        field3140++;
        if (arg0 == 35) {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z", line = 75)
    public static final boolean method1492(int arg0, int arg1) {
        field3129++;
        if (arg0 == 11 || arg0 == 51 || arg0 == 18 || arg0 == 23 || arg0 == 12) {
            return true;
        } else if (arg0 == 49 || arg0 == 1003) {
            return true;
        } else {
            return arg1 != 29470;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIBLofa;Lha;I)V", line = 109)
    public static final void method1493(int arg0, int arg1, byte arg2, class347 arg3, class66 arg4, int arg5) {
        int var6 = -36 % ((arg2 - 58) / 60);
        for (int var7 = 7; var7 >= 0; var7--) {
            for (int var8 = 127; var8 >= 0; var8--) {
                int var9 = (arg1 & 0x3F) << 10 | var7 & 0x7 << 7 | var8 & 0x7F;
                class96.method761(true, true, false);
                int var10 = class217.field2836[var9];
                class186.method1251(false, true, (byte) -70);
                arg4.method434((arg3.field4986 * var8 >> 7) + arg0, arg5 - -((7 - var7) * arg3.field4940 >> 3), (arg3.field4986 >> 7) + 1, (arg3.field4940 >> 3) + 1, var10, 0);
            }
        }
        field3134++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILdt;IB)V", line = 141)
    private final void method1494(int arg0, class254 arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            this.field3124 = arg1.method1728((byte) 64);
            if (this.field3124 == 65535) {
                this.field3124 = -1;
            }
        } else if (arg0 == 2) {
            this.field3131 = arg1.method1728((byte) 82) + 1;
            this.field3130 = arg1.method1728((byte) 34) + 1;
        } else if (arg0 == 3) {
            arg1.method1737(true);
        } else if (arg0 == 4) {
            this.field3126 = arg1.method1731((byte) 64);
        } else if (arg0 == 5) {
            this.field3132 = arg1.method1731((byte) 64);
        } else if (arg0 == 6) {
            this.field3127 = true;
        } else if (arg0 == 7) {
            this.field3125 = true;
        }
        int var5 = -34 / ((29 - arg3) / 58);
        field3138++;
    }
}
