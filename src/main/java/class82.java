import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 extends class97 {

    @OriginalMember(owner = "client!nd", name = "rb", descriptor = "Z")
    public boolean field2096 = false;

    @OriginalMember(owner = "client!nd", name = "Bb", descriptor = "I")
    private int field2106 = 0;

    @OriginalMember(owner = "client!nd", name = "Pb", descriptor = "I")
    private int field2120 = 0;

    @OriginalMember(owner = "client!nd", name = "wb", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!nd", name = "xb", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!nd", name = "zb", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!nd", name = "Ib", descriptor = "Lua;")
    private class118 field2113;

    @OriginalMember(owner = "client!nd", name = "sb", descriptor = "Lhb;")
    private static class44 field2097 = class102.method810("This computers address has been blocked", -28606);

    @OriginalMember(owner = "client!nd", name = "Ab", descriptor = "Lhb;")
    private static class44 field2105 = class102.method810("Invalid loginserver requested)3", -28606);

    @OriginalMember(owner = "client!nd", name = "Gb", descriptor = "Lhb;")
    private static class44 field2111 = class102.method810("Loading friend list", -28606);

    @OriginalMember(owner = "client!nd", name = "yb", descriptor = "Lhb;")
    private static class44 field2103 = class102.method810("Moderator option: Mute player for 48 hours: <OFF>", -28606);

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lhb;")
    public static class44 field2095 = field2111;

    @OriginalMember(owner = "client!nd", name = "Fb", descriptor = "[Lra;")
    public static class103[] field2110 = new class103[2048];

    @OriginalMember(owner = "client!nd", name = "Hb", descriptor = "Lhb;")
    public static class44 field2112 = field2105;

    @OriginalMember(owner = "client!nd", name = "Jb", descriptor = "Lhb;")
    public static class44 field2114 = field2097;

    @OriginalMember(owner = "client!nd", name = "Cb", descriptor = "Lhb;")
    public static class44 field2107 = field2103;

    @OriginalMember(owner = "client!nd", name = "Kb", descriptor = "[[[Lhe;")
    public static class47[][][] field2115 = new class47[4][104][104];

    @OriginalMember(owner = "client!nd", name = "ub", descriptor = "Lhb;")
    public static class44 field2099 = class102.method810("Fps:", -28606);

    @OriginalMember(owner = "client!nd", name = "Lb", descriptor = "Lhb;")
    private static class44 field2116 = class102.method810("Your account has been disabled)3", -28606);

    @OriginalMember(owner = "client!nd", name = "Nb", descriptor = "Lhb;")
    public static class44 field2118 = class102.method810("(Y", -28606);

    @OriginalMember(owner = "client!nd", name = "Ob", descriptor = "I")
    public static int field2119 = 255;

    @OriginalMember(owner = "client!nd", name = "Mb", descriptor = "Lhb;")
    public static class44 field2117 = field2116;

    @OriginalMember(owner = "client!nd", name = "Qb", descriptor = "Lhb;")
    public static class44 field2121 = class102.method810("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen", -28606);

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!nd", name = "Db", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!nd", name = "Eb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V", line = 173)
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2101 = arg5 + arg6;
        this.field2098 = arg0;
        this.field2102 = arg3;
        this.field2100 = arg2;
        this.field2094 = arg4;
        this.field2104 = arg1;
        int var8 = class98.method773(-105, this.field2098).field2672;
        if (var8 == -1) {
            this.field2096 = true;
        } else {
            this.field2096 = false;
            this.field2113 = client.method139(1, var8);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V", line = 14)
    public static void method675(boolean arg0) {
        field2114 = null;
        field2115 = null;
        field2097 = null;
        field2116 = null;
        field2112 = null;
        field2095 = null;
        field2111 = null;
        if (!arg0) {
            return;
        }
        field2118 = null;
        field2099 = null;
        field2110 = null;
        field2107 = null;
        field2117 = null;
        field2105 = null;
        field2103 = null;
        field2121 = null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)Lde;", line = 41)
    public final class24 method209(byte arg0) {
        int var2 = 120 / ((arg0 - 35) / 59);
        class105 var3 = class98.method773(-118, this.field2098);
        field2108++;
        class24 var4;
        if (this.field2096) {
            var4 = var3.method826(-1, -1);
        } else {
            var4 = var3.method826(-1, this.field2120);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V", line = 80)
    public final void method676(int arg0, int arg1) {
        field2109++;
        if (this.field2096) {
            return;
        }
        if (arg0 != 0) {
            this.method209((byte) -65);
        }
        this.field2106 += arg1;
        while (this.field2113.field2885[this.field2120] < this.field2106) {
            this.field2106 -= this.field2113.field2885[this.field2120];
            this.field2120++;
            if (this.field2113.field2883.length <= this.field2120) {
                this.field2096 = true;
                return;
            }
        }
    }
}
