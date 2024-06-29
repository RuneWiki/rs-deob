import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "J")
    public long field338 = 0L;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Z")
    public static boolean field324 = false;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field326 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lid;")
    public static class149 field325 = class60.method382("mem=", (byte) 30);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
    public static int[] field332 = new int[1000];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lid;")
    public static class149 field319 = class60.method382("Veuillez commencer par supprimer ", (byte) 62);

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lid;")
    public static class149 field334 = class60.method382("", (byte) 17);

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "[I")
    public static int[] field341 = new int[14];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lug;")
    public class199 field343;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lal;")
    public static class230 field327;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Laj;")
    public static class47 field322;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
    public static final int method130(int arg0, byte arg1) {
        field321++;
        if (arg1 != -95) {
            field341 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method131(int arg0) {
        field319 = null;
        field325 = null;
        field332 = null;
        if (arg0 != 1023) {
            field341 = null;
        }
        field322 = null;
        field341 = null;
        field334 = null;
        field327 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public static final int method132(int arg0, int arg1) {
        if (arg0 >= -109) {
            return -63;
        } else {
            field339++;
            return arg1 == 16711935 ? -1 : class13.method73((byte) -117, arg1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method133(byte[] arg0, boolean arg1) {
        field333++;
        class74 var2 = new class74(arg0);
        int var3 = var2.method489((byte) -68);
        if (arg1) {
            method134(false, 118, 81, 31);
        }
        int var4 = var2.method498((byte) 125);
        if (var4 < 0 || !(class216.field3812 == 0 || class216.field3812 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method528(var4, 0, -2, var7);
            return var7;
        } else {
            int var5 = var2.method498((byte) 126);
            if (var5 < 0 || !(class216.field3812 == 0 || class216.field3812 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class265.method1846(var6, var5, arg0, var4, 9);
            } else {
                class271.field4883.method670(var6, (byte) -118, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIII)I")
    public static final int method134(boolean arg0, int arg1, int arg2, int arg3) {
        field328++;
        if ((class69.field1215[arg2][arg1][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class69.field1215[1][arg1][arg3] & 0x2) == 0) {
            if (arg0) {
                field319 = null;
            }
            return arg2;
        } else {
            return arg2 - 1;
        }
    }
}
