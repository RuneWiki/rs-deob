import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class200 {

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "J")
    public long field3554 = 0L;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Ls;")
    public static class227 field3550 = new class227(64);

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lqj;")
    public static class196 field3557 = class80.method502("<col=40ff00>", -48);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lbk;")
    public static class136 field3552;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Lbk;")
    public static class136 field3559;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lpe;")
    public class258 field3544;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBII)V")
    public static final void method1349(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3540++;
        class249 var5 = (class249) class110.field1562.method1551(32768, (long) arg1);
        if (var5 == null) {
            var5 = new class249();
            class110.field1562.method1552(var5, (long) arg1, 0);
        }
        if (arg2 <= 11) {
            return;
        }
        if (var5.field4406.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field4406.length; var8++) {
                var6[var8] = var5.field4406[var8];
                var7[var8] = var5.field4411[var8];
            }
            for (int var9 = var5.field4406.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4411 = var7;
            var5.field4406 = var6;
        }
        var5.field4406[arg4] = arg3;
        var5.field4411[arg4] = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
    public static final void method1350(boolean arg0, int arg1) {
        if (arg0) {
            field3550 = null;
        }
        field3550.method1535(arg1, 30704);
        class246.field4381.method130(108, arg1);
        class236.field4201.method130(-84, arg1);
        field3541++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method1351(byte arg0) {
        field3550 = null;
        field3552 = null;
        if (arg0 <= 31) {
            method1352(83, 70, 26);
        }
        field3557 = null;
        field3559 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public static final void method1352(int arg0, int arg1, int arg2) {
        if (arg0 != -322623056) {
            method1351((byte) -53);
        }
        field3543++;
        long var3 = (long) ((arg2 << 16) + arg1);
        class182 var5 = (class182) class105.field1518.method1551(arg0 + 322655824, var3);
        if (var5 != null) {
            class234.field4154.method35((byte) 123, var5);
        }
    }
}
