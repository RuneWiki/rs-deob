import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class94 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public int field1322 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lhn;")
    public static class509 field1327;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lhn;")
    public static class509 field1328;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "J")
    public static long field1329;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lc;")
    public static class125 field1324;

    static {
        new class234("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field1327 = new class509(12, 5);
        field1328 = new class509(60, 2);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 6)
    public static final void method751(int arg0) {
        field1323++;
        if (arg0 != 8589) {
            field1328 = null;
        }
        client.field3297 = 0;
        class45.field581 = 0;
        class226.field3683 = 0;
        class177.field2648 = 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 21)
    public static final void method752(String arg0, byte arg1) {
        class6.field71 = arg0;
        field1326++;
        if (class360.field5349.field5199 == null) {
            return;
        }
        try {
            String var2 = class360.field5349.field5199.getParameter("cookieprefix");
            String var3 = class360.field5349.field5199.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class295.method1920(class493.method2937(-122) + 94608000000L, -1445) + "; Max-Age=" + 94608000L;
            }
            class513.method3042("document.cookie=\"" + var5 + "\"", 14, class360.field5349.field5199);
        } catch (Throwable var6) {
        }
        if (arg1 != -106) {
            field1324 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILuq;)V", line = 67)
    public static final void method753(int arg0, int arg1, int arg2, class114 arg3) {
        field1325++;
        if (arg1 <= 100) {
            method756(76, 118, 28);
        }
        class10 var4 = arg3.method871(-99, class377.field5692);
        if (var4 == null) {
            return;
        }
        class377.field5692.method313(arg0, arg2, arg3.field1642 + arg0, arg3.field1627 + arg2);
        if (class364.field5384 >= 3) {
            class377.field5692.method270(-16777216, var4, arg0, arg2);
        } else {
            class514.field7474.method131((float) arg3.field1642 / 2.0F + (float) arg0, (float) arg3.field1627 / 2.0F + (float) arg2, 4096, (int) (-class473.field6830) & 0x3FFF << 2, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILhp;)V", line = 93)
    public final void method754(int arg0, class217 arg1) {
        field1321++;
        if (arg0 > -53) {
            return;
        }
        while (true) {
            int var3 = arg1.method1515((byte) 125);
            if (var3 == 0) {
                return;
            }
            this.method757(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 113)
    public static void method755(int arg0) {
        field1327 = null;
        if (arg0 != 60) {
            method751(-6);
        }
        field1324 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z", line = 126)
    public static final boolean method756(int arg0, int arg1, int arg2) {
        field1319++;
        int var3 = 89 / ((arg2 + 7) / 40);
        return (arg1 & 0x70000) != 0 | class446.method2738(34, arg1, arg0) || class281.method1830(arg0, -16385, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lhp;II)V", line = 140)
    private final void method757(class217 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method757(null, 93, 61);
        }
        field1320++;
        if (arg1 == 5) {
            this.field1322 = arg0.method1511(arg2 + 103);
        }
    }
}
