import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
    private int[] field2850;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lhe;")
    private static class54 field2856 = class6.method58("OFF", false);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Lhe;")
    private static class54 field2859 = class6.method58("red:", false);

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lhe;")
    public static class54 field2853 = field2859;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lhe;")
    public static class54 field2863 = field2859;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lhe;")
    public static class54 field2857 = class6.method58("<col=ff9040>", false);

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lhe;")
    public static class54 field2865 = field2856;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lsf;")
    public static class131 field2858 = new class131(200);

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lhe;")
    public static class54 field2866 = null;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field2868 = 0;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Ldd;")
    public static class26 field2852;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lef;")
    public static class35 field2867;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[I")
    public static int[] field2860;

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([I)V")
    public class124(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2850 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2850[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2850[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2850[var5 + var5] = arg0[var4];
            this.field2850[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
    public static final void method950(boolean arg0, int arg1) {
        if (arg0) {
            field2859 = null;
        }
        field2862++;
        if (arg1 == -1 || !class86.method691((byte) 125, arg1)) {
            return;
        }
        class93[] var2 = class59.field1481[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class93 var4 = var2[var3];
            if (var4.field2343 != null) {
                class100 var5 = new class100();
                var5.field2522 = var4.field2343;
                var5.field2537 = var4;
                class32.method242(1, var5);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public static final void method951(int arg0, int arg1, int arg2) {
        class130 var3 = class77.field1878[class157.field3573][arg1][arg0];
        field2855++;
        if (var3 == null) {
            class74.field1831.method1039(class157.field3573, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class48 var5 = null;
        for (class48 var6 = (class48) var3.method979(arg2 ^ 0xFFFFFFC5); var6 != null; var6 = (class48) var3.method983(arg2 + 18421)) {
            class67 var11 = class141.method1088(var6.field1169, (byte) -124);
            int var12 = var11.field1678;
            if (var11.field1673 == 1) {
                var12 = (var6.field1168 + 1) * var12;
            }
            if (var4 < var12) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class74.field1831.method1039(class157.field3573, arg1, arg0);
            return;
        }
        var3.method985(false, var5);
        class48 var7 = (class48) var3.method979(-128);
        class48 var8 = null;
        int var9 = arg1 + (arg0 << 7) + 1610612736;
        class48 var10 = null;
        while (var7 != null) {
            if (var5.field1169 != var7.field1169) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field1169 != var8.field1169 && var10 == null) {
                    var10 = var7;
                }
            }
            var7 = (class48) var3.method983(arg2 + 18421);
        }
        class74.field1831.method1036(class157.field3573, arg1, arg0, class134.method1007(arg1 * 128 + arg2, arg0 * 128 - -64, true, class157.field3573), var5, var9, var8, var10);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static final void method952(boolean arg0) {
        field2864++;
        class28.method212(-1);
        class114.method873(false);
        class15.method140(-18722);
        class88.method698((byte) 86);
        class73.method568(-19752);
        class52.method370(-113);
        class58.method458(28317);
        class94.method751(114);
        class70.method555(1);
        class112.method840(25947);
        class88.method703(0);
        class135.method1012(2);
        ((class66) class152.field3422).method509(0);
        if (!arg0) {
            method952(true);
        }
        class100.field2541.method992(0);
        class146.field3309.method257(0);
        class7.field213.method257(0);
        class114.field2708.method257(0);
        class131.field2977.method257(0);
        class52.field1252.method257(0);
        class105.field2602.method257(0);
        class143.field3280.method257(0);
        client.field607.method257(0);
        class34.field862.method257(0);
        class150.field3394.method257(0);
        class49.field1186.method257(0);
        class107.field2621.method257(0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I")
    public final int method953(int arg0, byte arg1) {
        field2851++;
        int var3 = this.field2850.length - 2;
        if (arg1 > -120) {
            field2867 = null;
        }
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field2850[var4];
            if (arg0 == var5) {
                return this.field2850[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
    public static void method954(boolean arg0) {
        field2866 = null;
        if (!arg0) {
            return;
        }
        field2852 = null;
        field2860 = null;
        field2859 = null;
        field2867 = null;
        field2863 = null;
        field2856 = null;
        field2853 = null;
        field2857 = null;
        field2858 = null;
        field2865 = null;
    }
}
