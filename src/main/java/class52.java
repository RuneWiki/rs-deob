import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class52 extends class134 {

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lmb;")
    public static class96 field901 = class243.method1708("Lade Schrifts-=tze )2 ", (byte) 115);

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "[I")
    public static int[] field903 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "Lmb;")
    private static class96 field915 = class243.method1708("Checking for updates )2 ", (byte) 116);

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Lmb;")
    public static class96 field902 = field915;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lmb;")
    public static class96 field916 = class243.method1708("0(U", (byte) 125);

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
    public static int[] field911 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    public static int field920 = 0;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "Lmb;")
    private static class96 field919 = class243.method1708(" from your friend list first)3", (byte) 109);

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "Lmb;")
    public static class96 field917 = field919;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "B")
    public byte field909;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Lrg;")
    public class239 field904;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "Lff;")
    public static class3 field900;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)I")
    public final int method394(int arg0) {
        int var2 = -51 % ((-82 - arg0) / 42);
        ++field918;
        return this.field904 == null ? 0 : this.field904.field4124 * 100 / (this.field904.field4144.length + -this.field909);
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)[Lka;")
    public static final class174[] method395(int arg0) {
        ++field906;
        int var1 = 120 / ((arg0 - -67) / 51);
        class174[] var2 = new class174[class252.field4368];
        for (int var3 = 0; ~var3 > ~class252.field4368; ++var3) {
            int var4 = class31.field490[var3] * class170.field2982[var3];
            int[] var5 = new int[var4];
            byte[] var6 = class217.field3724[var3];
            for (int var7 = 0; ~var7 > ~var4; ++var7) {
                var5[var7] = class139.field2492[class130.method985(var6[var7], 255)];
            }
            var2[var3] = new class174(class249.field4309, class109.field2019, class241.field4187[var3], class176.field3064[var3], class31.field490[var3], class170.field2982[var3], var5);
        }
        class192.method1344(0);
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public static void method396(int arg0) {
        field916 = null;
        field901 = null;
        field903 = null;
        field915 = null;
        field911 = null;
        field900 = null;
        field902 = null;
        int var1 = 2 % ((-3 - arg0) / 59);
        field919 = null;
        field917 = null;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)[B")
    public final byte[] method397(int arg0) {
        ++field912;
        int var2 = -6 % ((arg0 - 65) / 44);
        if (!super.field2403 && this.field904.field4124 >= this.field904.field4144.length + -this.field909) {
            return this.field904.field4144;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILw;)Z")
    public static final boolean method398(int arg0, class107 arg1) {
        ++field907;
        if (arg0 != 0) {
            field920 = -55;
        }
        if (~arg1.field1869 == -206) {
            class148.field2617 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIII)V")
    public static final void method399(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field914;
        if (arg0) {
            for (int var5 = 0; ~class47.field822 < ~var5; ++var5) {
                if (~(class270.field4698[var5] - -class271.field4717[var5]) < ~arg3 && ~(arg2 + arg3) < ~class270.field4698[var5] && ~arg4 > ~(class61.field1046[var5] + class266.field4643[var5]) && ~class266.field4643[var5] > ~(arg4 - -arg1)) {
                    class176.field3059[var5] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
    public static final void method400(boolean arg0, int arg1) {
        ++field910;
        if (arg1 != -1) {
            if (class154.field2715[arg1]) {
                class108.field2009.method18((byte) -61, arg1);
                if (class100.field1704[arg1] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; ~class100.field1704[arg1].length < ~var3; ++var3) {
                        if (class100.field1704[arg1][var3] != null) {
                            if (class100.field1704[arg1][var3].field1833 != 2) {
                                class100.field1704[arg1][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }
                    if (var2) {
                        class100.field1704[arg1] = null;
                    }
                    class154.field2715[arg1] = arg0;
                }
            }
        }
    }
}
