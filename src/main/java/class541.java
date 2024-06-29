import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class541 extends class513 implements class446 {

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "J")
    public static long field7862 = 0L;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "C")
    public char field7860;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
    public int field7858;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "I")
    public int field7863;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
    public int field7864;

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!nw", name = "w", descriptor = "J")
    public long field7868;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)C")
    public final char method2636(byte arg0) {
        int var2 = -7 % ((-arg0 - 34) / 60);
        field7861++;
        return this.field7860;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I")
    public final int method2634(int arg0) {
        if (arg0 != -31752) {
            this.method2637(106);
        }
        field7865++;
        return this.field7858;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)I")
    public final int method2638(boolean arg0) {
        field7856++;
        return arg0 ? this.field7864 : -125;
    }

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)V")
    public static final void method3171(int arg0) {
        field7859++;
        if (arg0 > -58) {
            return;
        }
        if (class176.field2173 <= 0) {
            class220.field2850 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class652.field9237.length; var2++) {
            if (class652.field9237[var2].indexOf("--> ") != -1) {
                var1++;
                if (class176.field2173 == var1) {
                    class220.field2850 = class652.field9237[var2].substring(class652.field9237[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)I")
    public final int method2637(int arg0) {
        if (arg0 <= 121) {
            this.field7860 = (char) 65501;
        }
        field7857++;
        return this.field7863;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)I")
    public static final int method3172(int arg0, int arg1) {
        if (arg1 != 28292) {
            field7862 = -76L;
        }
        field7866++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)J")
    public final long method2635(boolean arg0) {
        field7855++;
        return arg0 ? -6L : this.field7868;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(III)Z")
    public static final boolean method3173(int arg0, int arg1, int arg2) {
        field7867++;
        if (!class273.method1635(arg1, arg0, -27037)) {
            return false;
        } else if (arg2 == 55) {
            return class380.method2201(arg1, 0, arg0) | (arg0 & 0xB000) != 0 | class187.method1163((byte) 64, arg0, arg1) ? true : (class376.method2184(arg1, arg0, (byte) -21) | class33.method407(arg1, arg0, (byte) -115)) & (arg1 & 0x37) == 0;
        } else {
            return true;
        }
    }
}
