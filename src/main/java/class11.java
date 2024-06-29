import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class11 {

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
    private int[] field207;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lia;")
    public static class257 field198 = class28.method234(99, "Fps:");

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lia;")
    private static class257 field200 = class28.method234(75, "Jul");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lia;")
    private static class257 field210 = class28.method234(71, "May");

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lia;")
    private static class257 field206 = class28.method234(78, "Aug");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lia;")
    private static class257 field209 = class28.method234(-124, "Oct");

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lia;")
    private static class257 field202 = class28.method234(-117, "Feb");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lia;")
    private static class257 field211 = class28.method234(-109, "Sep");

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lia;")
    private static class257 field203 = class28.method234(-42, "Nov");

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lia;")
    private static class257 field213 = class28.method234(124, "Jan");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lia;")
    private static class257 field214 = class28.method234(89, "Apr");

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
    public static int[] field215 = new int[100];

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lia;")
    private static class257 field199 = class28.method234(108, "Dec");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lia;")
    private static class257 field205 = class28.method234(124, "Jun");

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lia;")
    private static class257 field218 = class28.method234(-119, "Mar");

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[Lia;")
    public static class257[] field217 = new class257[] { field213, field202, field218, field214, field210, field205, field200, field206, field211, field209, field203, field199 };

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lld;")
    public static class51 field201;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
    public final int method122(byte arg0, int arg1) {
        field216++;
        int var3 = (this.field207.length >> 1) - 1;
        int var4 = 90 / ((-arg0 - 21) / 62);
        int var5 = arg1 & var3;
        while (true) {
            int var6 = this.field207[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field207[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
    public static final boolean method123(int arg0, byte arg1) {
        field208++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class32.field616[arg0];
        int var3 = 39 % ((arg1 - 53) / 62);
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lci;")
    public static final class20 method124(byte arg0) {
        field204++;
        try {
            int var1 = -36 / ((-arg0 - 37) / 59);
            return (class20) Class.forName("gf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class52();
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method125(byte arg0) {
        field213 = null;
        field215 = null;
        field211 = null;
        field203 = null;
        if (arg0 >= -27) {
            method125((byte) -49);
        }
        field198 = null;
        field218 = null;
        field200 = null;
        field205 = null;
        field217 = null;
        field202 = null;
        field201 = null;
        field210 = null;
        field214 = null;
        field209 = null;
        field206 = null;
        field199 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([I)V")
    public class11(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field207 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field207[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field207[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field207[var5 + var5] = arg0[var4];
            this.field207[var5 + var5 + 1] = var4++;
        }
    }
}
