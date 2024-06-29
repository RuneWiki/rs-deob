import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class138 extends class124 {

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public static int field3317 = 1;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "[Lrd;")
    public static class117[] field3307 = new class117[5];

    @OriginalMember(owner = "client!va", name = "mb", descriptor = "Lrd;")
    public static class117 field3320 = class95.method812("Hidden)2", (byte) 8);

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "Lrd;")
    private static class117 field3315 = class95.method812("This computers address has been blocked", (byte) 8);

    @OriginalMember(owner = "client!va", name = "ob", descriptor = "I")
    public static int field3322 = 0;

    @OriginalMember(owner = "client!va", name = "nb", descriptor = "[[I")
    public static int[][] field3321 = new int[104][104];

    @OriginalMember(owner = "client!va", name = "tb", descriptor = "Lrd;")
    public static class117 field3327 = class95.method812("m", (byte) 8);

    @OriginalMember(owner = "client!va", name = "pb", descriptor = "I")
    public static int field3323 = 0;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lrd;")
    public static class117 field3308 = field3315;

    @OriginalMember(owner = "client!va", name = "ub", descriptor = "Lrd;")
    public static class117 field3328 = class95.method812("Ausw-=hlen", (byte) 8);

    @OriginalMember(owner = "client!va", name = "rb", descriptor = "J")
    public static long field3325 = 0L;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "B")
    public byte field3314;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!va", name = "lb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!va", name = "qb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!va", name = "sb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "Lge;")
    public static class47 field3316;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "Laf;")
    public class7 field3306;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "Lba;")
    public static class9 field3313;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "[Lrd;")
    public static class117[] field3309;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field3320 = null;
        field3308 = null;
        field3307 = null;
        field3321 = null;
        field3316 = null;
        field3313 = null;
        field3328 = null;
        field3309 = null;
        field3315 = null;
        if (arg0 == 0) {
            field3327 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)I")
    public static final int method1119(int arg0, int arg1, int arg2) {
        field3326++;
        class45 var3 = (class45) class84.field2191.method20((long) arg1, true);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg2 >= -48) {
                field3320 = null;
            }
            for (int var5 = 0; var5 < var3.field1265.length; var5++) {
                if (var3.field1269[var5] == arg0) {
                    var4 += var3.field1265[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
    public static final boolean method1120(byte arg0) {
        field3319++;
        if (class79.field2112 == 0) {
            return arg0 > -5 ? false : class1.field27.method1030(-17);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZBI)V")
    public static final void method1121(int arg0, boolean arg1, byte arg2, int arg3) {
        field3312++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class85.field2224 = arg0;
        class77.field2096 = arg3;
        class59.field1633 = arg1;
        int var4 = 52 / ((-arg2 - 53) / 60);
    }
}
