import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class11 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Ltl;")
    public static class59 field146 = class85.method639("Ausw-=hlen", 9588);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Ltl;")
    public static class59 field150 = class85.method639("blinken3:", 9588);

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Ltl;")
    private static class59 field151 = class85.method639("Loading)3)3)3", 9588);

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Ltl;")
    public static class59 field149 = class85.method639("", 9588);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Ltl;")
    public static class59 field140 = field151;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    public static int[] field154 = new int[32];

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ltl;")
    public static class59 field147 = class85.method639("(Y", 9588);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Ltl;")
    public static class59 field153 = class85.method639("", 9588);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lme;")
    public static class295 field145;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
    public static int[] field137;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[Llj;")
    public static class5[] field152;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[S")
    public static short[] field144;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[[[B")
    public static byte[][][] field148;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 85)
    public static void method78(int arg0) {
        field137 = null;
        field148 = (byte[][][]) null;
        field154 = null;
        field146 = null;
        field140 = null;
        field152 = null;
        field144 = null;
        field151 = null;
        if (arg0 <= 86) {
            return;
        }
        field150 = null;
        field147 = null;
        field145 = null;
        field153 = null;
        field149 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 108)
    public static final int method79(int arg0, int arg1) {
        field143++;
        if (arg0 != 0) {
            method78(-99);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILma;)Lma;", line = 172)
    public static final class263 method80(int arg0, class263 arg1) {
        class263 var2 = client.method284(arg1);
        if (var2 == null) {
            var2 = arg1.field4435;
        }
        field139++;
        return arg0 == 9697 ? var2 : (class263) null;
    }
}
