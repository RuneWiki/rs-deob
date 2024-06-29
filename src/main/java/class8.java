import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lah;")
    private class9 field137 = new class9(256);

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lah;")
    private class9 field151 = new class9(256);

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lvb;")
    private class197 field144;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lvb;")
    private class197 field136;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ltg;")
    public static class184 field142 = class135.method812("Startseite auf (WSpielkonto wiederherstellen(W)3", 3);

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Ltg;")
    public static class184 field143 = class135.method812("scrollen:", 3);

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Ltg;")
    public static class184 field146 = class135.method812("<br>(X", 3);

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Ltg;")
    private static class184 field149 = class135.method812(" from your ignore list first)3", 3);

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ltg;")
    public static class184 field141 = field149;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Ltg;")
    public static class184 field152 = class135.method812("<col=ffff00>*V", 3);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[II)Ldc;")
    private final class33 method42(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != 18398) {
            this.method47(-58, 84, null, 16);
        }
        field148++;
        int var5 = arg0 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFFE);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class33 var9 = (class33) this.field151.method51(var7, -107);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class48 var10 = class48.method274(this.field136, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class33 var11 = var10.method275();
            this.field151.method55((byte) -96, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field569.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[II)Ldc;")
    public final class33 method43(byte arg0, int[] arg1, int arg2) {
        field140++;
        if (this.field136.method1264(0) == 1) {
            return this.method42(arg2, 18398, arg1, 0);
        } else if (this.field136.method1272(arg2, 19661) == 1) {
            return this.method42(0, 18398, arg1, arg2);
        } else if (arg0 <= 26) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lde;I)V")
    public static final void method44(class35 arg0, int arg1) {
        if (arg1 != -23370) {
            method44(null, 22);
        }
        arg0.field664 = 0;
        field138++;
        if (arg0.field603 == 0) {
            arg0.field649 = 1024;
        }
        int var2 = arg0.field651 * 64 + arg0.field608 * 128;
        int var3 = arg0.field620 - class161.field2903;
        arg0.field635 += (var2 - arg0.field635) / var3;
        int var4 = arg0.field665 * 128 + arg0.field651 * 64;
        if (arg0.field603 == 1) {
            arg0.field649 = 1536;
        }
        if (arg0.field603 == 2) {
            arg0.field649 = 0;
        }
        if (arg0.field603 == 3) {
            arg0.field649 = 512;
        }
        arg0.field614 += (var4 - arg0.field614) / var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method45(int arg0) {
        field146 = null;
        if (arg0 != -1) {
            method45(42);
        }
        field152 = null;
        field141 = null;
        field142 = null;
        field149 = null;
        field143 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JI)V")
    public static final void method46(long arg0, int arg1) {
        field147++;
        if (arg0 == 0L || arg1 >= -65) {
            return;
        }
        for (int var3 = 0; var3 < class9.field170; var3++) {
            if (class103.field1878[var3] == arg0) {
                class206.field3956++;
                class9.field170--;
                for (int var4 = var3; var4 < class9.field170; var4++) {
                    class103.field1878[var4] = class103.field1878[var4 + 1];
                    class118.field2129[var4] = class118.field2129[var4 + 1];
                }
                class158.field2825 = class136.field2471;
                class117.field2122.method106(77, 1);
                class117.field2122.method607(arg0, 58);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II[II)Ldc;")
    private final class33 method47(int arg0, int arg1, int[] arg2, int arg3) {
        field150++;
        if (arg3 != 0) {
            return null;
        }
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x40000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class33 var9 = (class33) this.field151.method51(var7, 70);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class61 var10 = (class61) this.field137.method51(var7, 113);
            if (var10 == null) {
                var10 = class61.method343(this.field144, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field137.method55((byte) -126, var10, var7);
            }
            class33 var11 = var10.method339(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method797((byte) -89);
                this.field151.method55((byte) -75, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([III)Ldc;")
    public final class33 method48(int[] arg0, int arg1, int arg2) {
        field139++;
        if (~this.field144.method1264(0) == arg2) {
            return this.method47(arg1, 0, arg0, 0);
        } else if (this.field144.method1272(arg1, 19661) == 1) {
            return this.method47(0, arg1, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lvb;Lvb;)V")
    public class8(class197 arg0, class197 arg1) {
        this.field144 = arg1;
        this.field136 = arg0;
    }
}
