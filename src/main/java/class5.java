import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class105 {

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    private int field76 = 4096;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "Z")
    private boolean field78 = true;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Leh;")
    private static class47 field81 = class195.method1282((byte) -4, "Hidden");

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Leh;")
    public static class47 field86 = class195.method1282((byte) -4, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "Leh;")
    public static class47 field87 = field81;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lpa;")
    public static class136 field85 = new class136(500);

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "Leh;")
    public static class47 field89 = class195.method1282((byte) -4, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "Leh;")
    public static class47 field91 = class195.method1282((byte) -4, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lfb;")
    public static class50 field84;

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static void method23(byte arg0) {
        field85 = null;
        field81 = null;
        int var1 = -21 % ((arg0 - 62) / 46);
        field91 = null;
        field84 = null;
        field89 = null;
        field86 = null;
        field87 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field78 = arg1.method604((byte) -124) == 1;
            }
        } else {
            this.field76 = arg1.method569(arg2 ^ -26496);
        }
        if (arg2 != -256) {
            field89 = null;
        }
        ++field74;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Leh;B)Leh;")
    public static final class47 method24(class47[] arg0, byte arg1) {
        ++field75;
        if (arg1 < 55) {
            field89 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class74.method650(0, (byte) 104, arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field79;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (!arg1) {
            this.method17(96, (class68) null, -8);
        }
        if (super.field2186.field28) {
            int[] var4 = this.method851(0, true, arg0 + -1 & class122.field2468);
            int[] var5 = this.method851(0, arg1, arg0);
            int[] var6 = this.method851(0, true, arg0 + 1 & class122.field2468);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class149.field2928; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field76;
                int var12 = (var5[class121.field2453 & var10 + 1] + -var5[var10 - 1 & class121.field2453]) * this.field76;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((var15 + var16 + 4096) / 4096)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                }
                if (this.field78) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var8[var10] = var19;
                var7[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lgf;B)I")
    public static final int method25(class61 arg0, byte arg1) {
        if (arg1 <= 68) {
            field89 = null;
        }
        class190 var2 = (class190) class35.field685.method1342(((long) arg0.field1211 << 32) + (long) arg0.field1263, (byte) -20);
        ++field73;
        return var2 != null ? var2.field3682 : arg0.field1228;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
    public static final void method26(int arg0, byte arg1) {
        ++field82;
        int var2 = -15 % ((arg1 - 11) / 51);
        class120 var3 = (class120) class2.field21.method1342((long) arg0, (byte) -20);
        if (var3 != null) {
            var3.method885(3);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBI)I")
    public static final int method27(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 3;
        ++field90;
        if (arg2 != 65) {
            field86 = null;
        }
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else {
            return var4 == 2 ? 7 - arg3 : 7 - arg1;
        }
    }
}
