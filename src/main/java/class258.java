import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class258 extends class88 {

    @OriginalMember(owner = "client!og", name = "O", descriptor = "J")
    public static volatile long field4186 = 0L;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4187 = "level: ";

    @OriginalMember(owner = "client!og", name = "M", descriptor = "C")
    private char field4184;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "Ljava/lang/String;")
    public String field4178;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "[Lrb;")
    public static class135[] field4179;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILpd;)V")
    public final void method1761(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method584(255);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field4180++;
                return;
            }
            this.method1766(2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(ILjava/lang/String;)I")
    public static final int method1762(int arg0, String arg1) {
        field4177++;
        if (class209.field3336 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class209.field3336.field497; var2++) {
            if (class5.method32((byte) 62, class209.field3336.field492[var2], " ", "<br>").equals(arg1)) {
                return var2;
            }
        }
        return arg0 <= 107 ? -49 : -1;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)Z")
    public final boolean method1763(byte arg0) {
        int var2 = 60 % ((-arg0 - 88) / 33);
        field4183++;
        return this.field4184 == 's';
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static void method1764(byte arg0) {
        if (arg0 <= -73) {
            field4187 = null;
            field4179 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public static final void method1765(int arg0) {
        field4176++;
        if (arg0 == -1129) {
            class287.field4577.method1699(0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILpd;I)V")
    private final void method1766(int arg0, class96 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4184 = class161.method1123((byte) -27, arg1.method587(arg0 - 49));
        } else if (arg2 == 2) {
            this.field4181 = arg1.method597(-1197332568);
        } else if (arg2 == 5) {
            this.field4178 = arg1.method588(false);
        }
        field4185++;
        if (arg0 != 2) {
            this.field4184 = '\u0013';
        }
    }
}
