import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class13 extends class43 {

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Lmb;")
    public static class132 field166 = class166.method1092("Fehler bei der Verbindung zum Server)3", 127);

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "[I")
    public static int[] field168 = new int[100];

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field167 = 1;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Lmb;")
    public static class132 field173 = class166.method1092(")3runescape)3com)4l=", 127);

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field165 = 0;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(Z)V")
    public static void method62(boolean arg0) {
        field166 = null;
        field168 = null;
        field173 = null;
        if (!arg0) {
            field167 = 3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)I")
    private final int method63(int arg0, int arg1, int arg2) {
        ++field172;
        int var4 = arg1 * 57 + arg0;
        if (arg2 != 4096) {
            return -121;
        } else {
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field170;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class2.field35[arg0];
            for (int var5 = 0; var5 < class131.field2427; ++var5) {
                var3[var5] = this.method63(class156.field2849[var5], var4, 4096) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Z")
    public static final boolean method65(int arg0, int arg1) {
        if (arg1 != 0) {
            method62(false);
        }
        ++field169;
        return (arg0 >> 31 & 1) != 0;
    }
}
