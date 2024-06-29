import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class130 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3155 = -1;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    public static int[] field3160 = new int[25];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lmc;")
    public static class75 field3157 = class30.method234(true, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lmc;")
    public static class75 field3156 = class30.method234(true, ":chalreq:");

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lmc;")
    public static class75 field3159 = class30.method234(true, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lmc;")
    private static class75 field3154 = class30.method234(true, "Login server offline)3");

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lmc;")
    private static class75 field3169 = class30.method234(true, "Invalid username or password)3");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lmc;")
    public static class75 field3168 = class30.method234(true, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lmc;")
    public static class75 field3165 = field3154;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3161 = -1;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3162 = 0;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3167 = 3;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3172 = -1;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lmc;")
    public static class75 field3163 = class30.method234(true, ":0");

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lmc;")
    public static class75 field3173 = field3169;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lpb;")
    public static class92 field3164;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "[Laa;")
    public static class2[] field3171;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V", line = 110)
    public static final void method1016(int arg0, boolean arg1) {
        if (arg0 >= -24) {
            method1017(-115);
        }
        field3158++;
        if (class117.field2909 == null) {
            return;
        }
        try {
            class61 var2 = new class61(4);
            var2.method493((byte) 88, arg1 ? 2 : 3);
            var2.method533((byte) -28, 0);
            class117.field2909.method761(4, 0, var2.field1577, 0);
        } catch (IOException var4) {
            try {
                class117.field2909.method756(86);
            } catch (Exception var3) {
            }
            class117.field2909 = null;
            class70.field1791++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 163)
    public static void method1017(int arg0) {
        field3156 = null;
        field3173 = null;
        int var1 = 91 / ((arg0 + 64) / 50);
        field3159 = null;
        field3171 = null;
        field3164 = null;
        field3165 = null;
        field3160 = null;
        field3163 = null;
        field3169 = null;
        field3168 = null;
        field3154 = null;
        field3157 = null;
    }
}
