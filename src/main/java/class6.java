import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class6 extends RuntimeException {

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Ljava/lang/Throwable;")
    public Throwable field84;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Ljava/lang/String;")
    public String field81;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[[I")
    public static int[][] field80 = new int[5][5000];

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field77 = 0;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lij;")
    private static class50 field78 = class78.method578(125, "M");

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lij;")
    public static class50 field70 = field78;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Z")
    public static boolean field82 = true;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lij;")
    public static class50 field75 = field78;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lre;")
    public static class148 field73;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lwi;")
    public static class21 field74;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lfb;")
    public static class9 field71;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method40(boolean arg0) {
        if (arg0) {
            method42((byte) -7);
        }
        field74 = null;
        field73 = null;
        field80 = null;
        field75 = null;
        field70 = null;
        field71 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLij;)Z")
    public static final boolean method41(byte arg0, class50 arg1) {
        field85++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 > -53) {
            method40(true);
        }
        while (class73.field1379 > var2) {
            if (arg1.method387(class20.field426[var2], true)) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static final void method42(byte arg0) {
        if (class219.field3664 != null) {
            class219.field3664.method597(125);
        }
        field83++;
        if (class133.field2330 != null) {
            class133.field2330.method597(127);
        }
        class5.method34(22050, -24096, class5.field68, 2);
        if (arg0 < 89) {
            method42((byte) 3);
        }
        class219.field3664 = class119.method865(class228.field3834, 22050, 0, class186.field3058, (byte) 110);
        class219.field3664.method603(class148.field2545, (byte) 47);
        class133.field2330 = class119.method865(class228.field3834, 2048, 1, class186.field3058, (byte) 60);
        class133.field2330.method603(class174.field2907, (byte) 47);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class6(Throwable arg0, String arg1) {
        this.field84 = arg0;
        this.field81 = arg1;
    }
}
