import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class196 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ljc;")
    public static class181 field3587;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lel;")
    public class232 field3595;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lhj;")
    public static class243 field3586;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lmc;")
    public class51 field3589;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    public static int[] field3583;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[S")
    public static short[] field3588;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[Z")
    public static boolean[] field3592;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[[[B")
    public static byte[][][] field3591;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1419(int arg0, int arg1) {
        class77 var2 = class156.method1158(5, false, arg1);
        field3584++;
        if (arg0 != 14873) {
            method1419(-39, -85);
        }
        var2.method586((byte) 98);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 19)
    public static void method1420(byte arg0) {
        field3583 = null;
        if (arg0 < 7) {
            return;
        }
        field3586 = null;
        field3591 = (byte[][][]) null;
        field3592 = null;
        field3588 = null;
        field3587 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I", line = 50)
    public static final int method1421(int arg0, int arg1, int arg2) {
        int var3 = 39 / ((66 - arg2) / 55);
        int var4 = arg1 - 1 & arg0 >> 31;
        field3594++;
        return (arg0 + (arg0 >>> 31)) % arg1 + var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V", line = 62)
    public static final void method1422(int arg0, byte arg1) {
        field3590++;
        if (class278.field4807 == null) {
            class278.field4807 = new byte[4][104][104];
        }
        if (arg0 != 7385) {
            method1421(-99, 70, 55);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class278.field4807[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 113)
    public static final void method1423(byte arg0) {
        field3585++;
        class117.field2054.method2084(122);
        class105.field1883.method2084(122);
        class294.field5115.method2084(117);
        if (arg0 > -12) {
            field3592 = (boolean[]) null;
        }
    }
}
