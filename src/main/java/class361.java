import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class361 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field4985 = 8;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field4986 = 16;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Z")
    public boolean field4988 = true;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public int field4991 = -1;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field4995 = -1;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field4990 = 1190717;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
    public boolean field4997 = true;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Z")
    public boolean field4996 = false;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field4989 = 0;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field4999 = 128;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field4994 = -1;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lec;")
    public static class129 field4987 = new class129(128);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field5000 = 3;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIILkh;)V")
    private final void method2318(boolean arg0, int arg1, int arg2, class11 arg3) {
        if (arg0) {
            return;
        }
        field4998++;
        if (arg2 == 1) {
            this.field4989 = class447.method2785(arg3.method208(27308), -31941);
        } else if (arg2 == 2) {
            this.field4991 = arg3.method172((byte) 52);
        } else if (arg2 == 3) {
            this.field4991 = arg3.method174(255);
            if (this.field4991 == 65535) {
                this.field4991 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field4988 = false;
        } else if (arg2 == 7) {
            this.field4994 = class447.method2785(arg3.method208(27308), -31941);
            return;
        } else if (arg2 == 8) {
            class56.field772 = arg1;
            return;
        } else if (arg2 == 9) {
            this.field4999 = arg3.method174(255);
            return;
        } else if (arg2 == 10) {
            this.field4997 = false;
            return;
        } else if (arg2 == 11) {
            this.field4985 = arg3.method172((byte) 52);
            return;
        } else if (arg2 == 12) {
            this.field4996 = true;
            return;
        } else if (arg2 == 13) {
            this.field4990 = arg3.method208(27308);
            return;
        } else {
            if (arg2 == 14) {
                this.field4986 = arg3.method172((byte) 52);
            } else if (arg2 == 15) {
                this.field4995 = arg3.method174(255);
                if (this.field4995 == 65535) {
                    this.field4995 = -1;
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method2319(byte arg0) {
        field4992++;
        if (arg0 != -36) {
            method2319((byte) 87);
        }
        class414.field5885 = 0;
        class205.field2820 = 0;
        class452.field6307 = 0;
        class360.field4983 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method2320(int arg0) {
        if (arg0 != 7829) {
            method2323(77, -79, -14, -3, 123, 87);
        }
        field4987 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public final void method2321(int arg0, int arg1) {
        field5003++;
        if (~this.field4995 == arg0) {
            this.field4995 = this.field4991;
        }
        this.field4985 = this.field4985 << 8 | arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILkh;I)V")
    public final void method2322(int arg0, class11 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method172((byte) 52);
            if (var4 == 0) {
                if (arg0 != -18913) {
                    return;
                }
                field4984++;
                return;
            }
            this.method2318(false, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
    public static final void method2323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4993++;
        int var6 = class302.method1951(class290.field4058, 0, arg5, class442.field6212);
        int var7 = class302.method1951(class290.field4058, 0, arg0, class442.field6212);
        if (arg3 < 94) {
            return;
        }
        int var8 = class302.method1951(class154.field2161, 0, arg4, class233.field3350);
        int var9 = class302.method1951(class154.field2161, 0, arg1, class233.field3350);
        for (int var10 = var6; var10 <= var7; var10++) {
            class295.method1924(3289650, class296.field4138[var10], var9, arg2, var8);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public static final void method2324(int arg0, int arg1) {
        field5002++;
        if (arg0 == 8 && class16.method238(arg1, 21)) {
            class80.method576(arg0 ^ 0x6E, -1, class143.field2057[arg1]);
        }
    }
}
