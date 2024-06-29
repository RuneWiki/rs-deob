import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class169 {

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    private int field100 = 0;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "Z")
    public boolean field105 = false;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lke;")
    private class94 field102;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lcd;")
    public static class23 field88 = class54.method414("zur-Uck auf die RuneScape)2Webseite gehen", -1);

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "[Lcd;")
    public static class23[] field95 = new class23[200];

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field92 = 0;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "Lcd;")
    public static class23 field96 = class54.method414("b12_full", -1);

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field94 = -1;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Lcd;")
    public static class23 field93 = class54.method414("jlv", -1);

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lcd;")
    private static class23 field104 = class54.method414("Too many incorrect logins from your address)3", -1);

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lcd;")
    public static class23 field107 = field104;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public final void method28(int arg0, int arg1) {
        field103++;
        if (this.field105) {
            return;
        }
        if (arg0 != -18109) {
            this.field89 = -86;
        }
        this.field89 += arg1;
        while (this.field102.field1992[this.field100] < this.field89) {
            this.field89 -= this.field102.field1992[this.field100];
            this.field100++;
            if (this.field100 >= this.field102.field1973.length) {
                this.field105 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static void method29(int arg0) {
        field107 = null;
        if (arg0 != 0) {
            field107 = null;
        }
        field104 = null;
        field96 = null;
        field88 = null;
        field93 = null;
        field95 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method30(String arg0, int arg1) throws ClassNotFoundException {
        field90++;
        if (arg1 != 0) {
            return null;
        } else if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Lbh;")
    public final class18 method31(int arg0) {
        field101++;
        class29 var2 = class82.method553((byte) 6, this.field97);
        if (arg0 >= -101) {
            method29(-69);
        }
        class18 var3;
        if (this.field105) {
            var3 = var2.method221(-1, -55);
        } else {
            var3 = var2.method221(this.field100, -122);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIII)V")
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field108 = arg1;
        this.field87 = arg6 + arg5;
        this.field91 = arg3;
        this.field106 = arg4;
        this.field97 = arg0;
        this.field98 = arg2;
        int var8 = class82.method553((byte) 6, this.field97).field636;
        if (var8 == -1) {
            this.field105 = true;
        } else {
            this.field105 = false;
            this.field102 = class20.method128(var8, (byte) 72);
        }
    }
}
