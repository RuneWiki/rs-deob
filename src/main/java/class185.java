import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class185 extends class64 {

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "Lsg;")
    public static class169 field3608 = class165.method1060("<br>", 1536);

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "Lsg;")
    public static class169 field3613 = class165.method1060("Ihr Charakter)2Profil wird in:", 1536);

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "Lsg;")
    public static class169 field3614 = class165.method1060("http:)4)4", 1536);

    @OriginalMember(owner = "client!ue", name = "ob", descriptor = "Lsg;")
    public static class169 field3620 = class165.method1060("Freie Welt", 1536);

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "Z")
    public static volatile boolean field3615 = false;

    @OriginalMember(owner = "client!ue", name = "sb", descriptor = "Lsg;")
    public static class169 field3624 = class165.method1060(": ", 1536);

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ue", name = "lb", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ue", name = "mb", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!ue", name = "nb", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!ue", name = "pb", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ue", name = "qb", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ue", name = "rb", descriptor = "I")
    private int field3623;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "Lbg;")
    public static class18 field3609;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "[I")
    public static int[] field3607;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
    private class185(int arg0) {
        super(0, false);
        this.method1227(arg0, 591774956);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILsg;)I")
    public static final int method1226(int arg0, class169 arg1) {
        ++field3611;
        if (class154.field2976 == 1) {
            return 7;
        } else if (arg1.method1124(class65.field1217, 71)) {
            return 1;
        } else if (arg1.method1124(class183.field3565, arg0 ^ -20209)) {
            return 1;
        } else if (arg1.method1124(class131.field2438, 70)) {
            return 2;
        } else if (arg1.method1124(class16.field331, 115)) {
            return 2;
        } else {
            if (arg0 != -20152) {
                field3607 = null;
            }
            if (arg1.method1124(class152.field2927, 97)) {
                return 3;
            } else if (arg1.method1124(class112.field2052, arg0 + 20272)) {
                return 4;
            } else if (arg1.method1124(class143.field2660, 72)) {
                return 4;
            } else if (arg1.method1124(class67.field1266, 87)) {
                return 5;
            } else {
                return arg1.method1124(class7.field193, 52) ? 6 : 0;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (~arg2 == -1) {
            this.method1227(arg1.method773((byte) -126), 591774956);
        }
        int var5 = 42 / ((arg0 - -60) / 36);
        ++field3617;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    private final void method1227(int arg0, int arg1) {
        this.field3618 = (255 & arg0) << 4;
        this.field3619 = (65280 & arg0) >> 4;
        ++field3622;
        this.field3623 = (16711680 & arg0) >> 12;
        if (arg1 != 591774956) {
            field3608 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        int[][] var3 = super.field1195.method177(1193, arg1);
        ++field3612;
        if (arg0 != -40) {
            this.method14((byte) 2, (class127) null, -60);
        }
        if (super.field1195.field532) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class147.field2715 > var7; ++var7) {
                var4[var7] = this.field3623;
                var5[var7] = this.field3619;
                var6[var7] = this.field3618;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILke;IZLsg;ILsg;)V")
    public static final void method1228(int arg0, class95 arg1, int arg2, boolean arg3, class169 arg4, int arg5, class169 arg6) {
        ++field3616;
        int var7 = arg1.method553(-34, arg4);
        int var8 = arg1.method562(var7, arg6, 25284);
        class112.method691(arg2, -120, var8, arg1, arg5, var7, arg3);
        if (arg0 > -95) {
            field3624 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
    public static void method1229(int arg0) {
        field3614 = null;
        field3613 = null;
        field3607 = null;
        field3609 = null;
        field3608 = null;
        field3624 = null;
        field3620 = null;
        if (arg0 != -15335) {
            method1230(84, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class185() {
        this(0);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)V")
    public static final void method1230(int arg0, byte arg1) {
        ++field3610;
        if (arg0 != -1) {
            if (class44.method280(arg0, true)) {
                class150[] var2 = class142.field2647[arg0];
                if (arg1 != 7) {
                    method1229(-108);
                }
                for (int var3 = 0; var2.length > var3; ++var3) {
                    class150 var4 = var2[var3];
                    if (var4.field2905 != null) {
                        class200 var5 = new class200();
                        var5.field3911 = var4.field2905;
                        var5.field3907 = var4;
                        class63.method391(4894, 2000000, var5);
                    }
                }
            }
        }
    }
}
