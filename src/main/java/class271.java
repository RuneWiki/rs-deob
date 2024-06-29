import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class271 extends class337 {

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Lki;")
    public static class498 field3933 = new class498(69, 15);

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "[[B")
    public static byte[][] field3943 = new byte[50][];

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public static int field3942 = 0;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "J")
    public long field3936;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "Lqa;")
    public static class162 field3941;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "Lmt;")
    public class271 field3935;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "Lmt;")
    public class271 field3939;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
    public static final void method1781(int arg0, int arg1) {
        if (arg1 > -28) {
            field3942 = 53;
        }
        class226 var2 = class263.field3855;
        synchronized (class263.field3855) {
            class263.field3855.method1534(0, arg0);
        }
        field3934++;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method1782(int arg0, int arg1, int arg2, byte[] arg3) {
        field3937++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg1 < 13) {
            return null;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class178.field2622[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public final void method1783(byte arg0) {
        if (arg0 > -67) {
            field3943 = null;
        }
        field3932++;
        if (this.field3935 != null) {
            this.field3935.field3939 = this.field3939;
            this.field3939.field3935 = this.field3935;
            this.field3935 = null;
            this.field3939 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)Z")
    public final boolean method1784(byte arg0) {
        field3938++;
        if (arg0 != -77) {
            method1782(-63, 41, -4, null);
        }
        return this.field3935 != null;
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)V")
    public static void method1785(int arg0) {
        field3941 = null;
        if (arg0 != 24164) {
            method1782(55, -60, 69, null);
        }
        field3933 = null;
        field3943 = null;
    }

    static {
        new class475(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
