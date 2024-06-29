import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 {

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Ldf;")
    private class28 field225 = new class28();

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[J")
    public static long[] field220 = new long[32];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lja;")
    public static class62 field219 = class30.method243(43, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lja;")
    public static class62 field228 = class30.method243(43, "Hidden)2use");

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lja;")
    public static class62 field233 = class30.method243(43, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lja;")
    private static class62 field221 = class30.method243(43, "OFF");

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lja;")
    public static class62 field227 = field221;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lca;")
    public static class15 field226;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Z")
    public static boolean field231;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Ldf;")
    public final class28 method69(int arg0) {
        class28 var2 = this.field225.field689;
        field224++;
        if (this.field225 == var2) {
            return null;
        }
        var2.method228((byte) 117);
        if (arg0 != 23771) {
            this.method74(-85, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILdf;)V")
    public final void method70(int arg0, class28 arg1) {
        field229++;
        if (arg1.field684 != null) {
            arg1.method228((byte) 115);
        }
        arg1.field684 = this.field225.field684;
        if (arg0 != -4652) {
            this.method71(true);
        }
        arg1.field689 = this.field225;
        arg1.field684.field689 = arg1;
        arg1.field689.field684 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Ldf;")
    public final class28 method71(boolean arg0) {
        field230++;
        class28 var2 = this.field225.field689;
        if (this.field225 == var2) {
            return null;
        } else {
            if (!arg0) {
                field228 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method72(int arg0) {
        try {
            if (class100.field2320 == null) {
                class100.field2320 = new class79(class148.field3481, class70.method594(new class62[] { class111.field2555, class83.field1999, class62.field1531 }, 1229).method454((byte) 88));
            } else {
                byte[] var1 = class100.field2320.method630(-11188);
                if (var1 != null) {
                    class128 var2 = new class128(var1);
                    class82.field1981 = var2.method1041(212464720);
                    class126.field2861 = new class139[class82.field1981];
                    for (int var3 = 0; var3 < class82.field1981; var3++) {
                        class139 var4 = class126.field2861[var3] = new class139();
                        int var5 = var2.method1041(arg0 + 212443277);
                        var4.field3232 = var5 & 0x7FFF;
                        var4.field3229 = (var5 & 0x8000) != 0;
                        var4.field3227 = var2.method1015((byte) -92);
                        var4.field3223 = var2.method1027((byte) 99);
                        var4.field3230 = var3;
                        var4.field3233 = class79.method629(var4.field3227, (byte) -50);
                    }
                    class122.method967(class151.field3557, class126.field2861.length - 1, 0, class59.field1450, class126.field2861, arg0 - 21443);
                    class51.field1181 = true;
                    class100.field2320 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class100.field2320 = null;
        }
        if (arg0 == 21443) {
            field223++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method73(byte arg0) {
        field227 = null;
        field219 = null;
        field221 = null;
        field220 = null;
        field228 = null;
        if (arg0 != -96) {
            method73((byte) 12);
        }
        field226 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class8() {
        this.field225.field684 = this.field225;
        this.field225.field689 = this.field225;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(ILdf;)V")
    public final void method74(int arg0, class28 arg1) {
        field222++;
        if (arg0 != -6789) {
            field221 = null;
        }
        if (arg1.field684 != null) {
            arg1.method228((byte) 127);
        }
        arg1.field684 = this.field225;
        arg1.field689 = this.field225.field689;
        arg1.field684.field689 = arg1;
        arg1.field689.field684 = arg1;
    }
}
