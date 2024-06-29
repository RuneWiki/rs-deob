import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class171 extends class69 {

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lha;")
    public static class46 field3052 = class271.method1828("Fps:", -46);

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lha;")
    public static class46 field3057 = class271.method1828("<col=c0ff00>", -46);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "J")
    public long field3053;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lle;")
    public class171 field3051;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lle;")
    public class171 field3055;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lhh;")
    public static class263 field3056;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[S")
    public static short[] field3060;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public final void method1219(int arg0) {
        field3059++;
        if (this.field3055 == null) {
            return;
        }
        this.field3055.field3051 = this.field3051;
        this.field3051.field3055 = this.field3055;
        this.field3055 = null;
        this.field3051 = null;
        if (arg0 != 64) {
            field3054 = -115;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lwe;I)Lbd;")
    public static final class74 method1220(class75 arg0, int arg1) {
        field3058++;
        class74 var2 = new class74(arg0.method577(0), arg0.method577(0), arg0.method545((byte) 40), arg0.method545((byte) 55), arg0.method562((byte) -71), arg0.method558(1) == 1);
        int var3 = arg0.method558(1);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field1315.method265(new class213(arg0.method545((byte) 68), arg0.method545((byte) -75), arg0.method545((byte) -125), arg0.method545((byte) -121)), -501);
        }
        int var5 = 74 % ((arg1 - 11) / 59);
        var2.method536(0);
        return var2;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)V")
    public static final void method1221(boolean arg0, boolean arg1) {
        field3062++;
        int var2 = class131.field2398.length;
        byte[][] var3 = class119.field2231;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class92.field1717[var4] >> 8) * 64 - class29.field567;
                int var7 = (class92.field1717[var4] & 0xFF) * 64 - class77.field1432;
                class267.method1789(95);
                class137.method1052(var7, class183.field3282, -3553, var5, arg0, var6);
            }
        }
        if (arg1) {
            field3054 = -70;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method1222(int arg0) {
        field3057 = null;
        field3056 = null;
        field3060 = null;
        if (arg0 != 0) {
            field3057 = null;
        }
        field3052 = null;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
    public static final boolean method1223(int arg0) {
        field3061++;
        if (arg0 != -2121191512) {
            return false;
        }
        if (class3.field59) {
            try {
                class64.field1087.method321(0, class8.field130.field143);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    public static final void method1224(int arg0, int arg1) {
        if (class96.field1796 == null || class96.field1796.length < arg1) {
            class96.field1796 = new int[arg1];
        }
        field3050++;
        if (arg0 != 32625) {
            method1223(124);
        }
    }
}
