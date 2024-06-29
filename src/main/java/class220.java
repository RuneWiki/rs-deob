import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class220 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public int field3168 = 127;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public int field3170 = 16;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
    public boolean field3175 = true;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field3177 = -1;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public int field3166 = 128;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public int field3183 = 8;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
    public boolean field3176 = true;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public int field3172 = -1;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Z")
    public boolean field3184 = false;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public int field3165 = 0;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public int field3179 = 1190717;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public int field3182 = -1;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "[I")
    public static int[] field3171 = new int[32];

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field3181 = 20;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field3185 = 0;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Ljb;")
    public class340 field3174;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BILti;)V", line = 12)
    private final void method1456(byte arg0, int arg1, class303 arg2) {
        field3178++;
        if (arg0 >= -69) {
            field3181 = 1;
        }
        if (arg1 == 1) {
            this.field3165 = class481.method2873(0, arg2.method1866(false));
        } else if (arg1 == 2) {
            this.field3172 = arg2.method1918((byte) -47);
        } else if (arg1 == 3) {
            this.field3172 = arg2.method1868(0);
            if (this.field3172 == 65535) {
                this.field3172 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field3175 = false;
            return;
        } else if (arg1 == 7) {
            this.field3177 = class481.method2873(0, arg2.method1866(false));
            return;
        } else if (arg1 == 8) {
            this.field3174.field5200 = this.field3186;
        } else if (arg1 == 9) {
            this.field3166 = arg2.method1868(0) << 0;
            return;
        } else if (arg1 == 10) {
            this.field3176 = false;
            return;
        } else if (arg1 == 11) {
            this.field3183 = arg2.method1918((byte) 79);
            return;
        } else if (arg1 == 12) {
            this.field3184 = true;
            return;
        } else if (arg1 == 13) {
            this.field3179 = arg2.method1866(false);
            return;
        } else {
            if (arg1 == 14) {
                this.field3170 = arg2.method1918((byte) -51);
            } else if (arg1 == 15) {
                this.field3182 = arg2.method1868(0);
                if (this.field3182 == 65535) {
                    this.field3182 = -1;
                    return;
                }
            } else if (arg1 == 16) {
                this.field3168 = arg2.method1918((byte) -61);
                return;
            } else {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILti;)V", line = 95)
    public final void method1457(int arg0, class303 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1918((byte) 99);
            if (var3 == 0) {
                field3180++;
                return;
            }
            this.method1456((byte) -91, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 134)
    public final void method1458(byte arg0) {
        this.field3183 = this.field3186 | this.field3183 << 8;
        if (this.field3182 == -1) {
            this.field3182 = this.field3172;
        }
        field3173++;
        int var2 = 101 % ((-arg0 - 27) / 34);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 150)
    public static void method1459(int arg0) {
        field3171 = null;
        if (arg0 != 1190717) {
            method1459(-49);
        }
    }
}
