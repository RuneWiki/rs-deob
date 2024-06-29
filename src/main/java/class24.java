import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class145 {

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[Ldc;")
    public static class25[] field644 = new class25[2048];

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lfc;")
    public static class39 field651 = class90.method774("auf einer freien Welt zu spielen)3", -101);

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[J")
    public static long[] field647 = new long[32];

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lfc;")
    private static class39 field659 = class90.method774("Type", -99);

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lfc;")
    private static class39 field665 = class90.method774("Unable to find ", -121);

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Lfc;")
    public static class39 field650 = class90.method774("Keine Antwort vom Anmelde)2Server)3", -84);

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lfc;")
    public static class39 field649 = field659;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field669 = 127;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "Lfc;")
    public static class39 field670 = class90.method774("60 Sekunden noch einmal)3)3)3", -87);

    @OriginalMember(owner = "client!db", name = "W", descriptor = "[I")
    public static int[] field668 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lfc;")
    public static class39 field662 = field665;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field663 = 0;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field675 = -1;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Loe;")
    public class102 field654;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Loe;")
    public class102 field673;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Lef;")
    public class35 field672;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[I")
    public int[] field645;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "[Lb;")
    public static class8[] field648;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 18)
    public final void method276(boolean arg0) {
        field656++;
        int var2 = this.field655;
        class35 var3 = this.field672.method402(false);
        if (!arg0) {
            return;
        }
        if (var3 == null) {
            this.field660 = 0;
            this.field645 = null;
            this.field643 = 0;
            this.field655 = -1;
            this.field657 = 0;
        } else {
            this.field655 = var3.field939;
            this.field645 = var3.field936;
            this.field657 = var3.field949;
            this.field643 = var3.field911 * 128;
            this.field660 = var3.field932;
        }
        if (this.field655 != var2 && this.field673 != null) {
            class37.field1014.method535(this.field673);
            this.field673 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V", line = 57)
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field667++;
        if (class66.method631(0, arg7)) {
            class146.method1172(arg0, arg3, arg5, class65.field1571[arg7], (byte) 125, 0, arg2, arg8, 0, arg6, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 93)
    public static void method278(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field650 = null;
        field668 = null;
        field644 = null;
        field665 = null;
        field648 = null;
        field651 = null;
        field647 = null;
        field659 = null;
        field649 = null;
        field670 = null;
        field662 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V", line = 157)
    public static final void method279(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field674++;
        class24 var5 = (class24) class83.field1840.method8(-1);
        if (arg3 != -117) {
            field661 = -67;
        }
        while (var5 != null) {
            if (var5.field655 != -1 || var5.field645 != null) {
                int var6 = 0;
                if (arg1 > var5.field671) {
                    var6 += arg1 - var5.field671;
                } else if (arg1 < var5.field666) {
                    var6 += var5.field666 - arg1;
                }
                if (arg2 > var5.field658) {
                    var6 += arg2 - var5.field658;
                } else if (arg2 < var5.field652) {
                    var6 += var5.field652 - arg2;
                }
                if (var5.field643 < var6 - 64 || field669 == 0 || var5.field664 != arg0) {
                    if (var5.field673 != null) {
                        class37.field1014.method535(var5.field673);
                        var5.field673 = null;
                    }
                    if (var5.field654 != null) {
                        class37.field1014.method535(var5.field654);
                        var5.field654 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field643 - var6) * field669 / var5.field643;
                    if (var5.field673 != null) {
                        var5.field673.method889(var7);
                    } else if (var5.field655 >= 0) {
                        class21 var8 = class21.method227(class53.field1333, var5.field655, 0);
                        if (var8 != null) {
                            class105 var9 = var8.method224().method938(class63.field1550);
                            class102 var10 = class102.method907(var9, 100, var7);
                            var10.method877(-1);
                            class37.field1014.method536(var10);
                            var5.field673 = var10;
                        }
                    }
                    if (var5.field654 != null) {
                        var5.field654.method889(var7);
                        if (!var5.field654.method1171((byte) -121)) {
                            var5.field654 = null;
                        }
                    } else if (var5.field645 != null && (var5.field646 -= arg4) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field645.length);
                        class21 var12 = class21.method227(class53.field1333, var5.field645[var11], 0);
                        if (var12 != null) {
                            class105 var13 = var12.method224().method938(class63.field1550);
                            class102 var14 = class102.method907(var13, 100, var7);
                            var14.method877(0);
                            class37.field1014.method536(var14);
                            var5.field646 = (int) (Math.random() * (double) (var5.field657 - var5.field660)) + var5.field660;
                            var5.field654 = var14;
                        }
                    }
                }
            }
            var5 = (class24) class83.field1840.method9(1);
        }
    }
}
