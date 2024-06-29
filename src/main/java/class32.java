import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class32 {

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "Lnga;")
    private class510 field436 = new class510(64);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Leq;")
    private class209 field425;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field427 = 50;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
    public static int[] field428 = new int[field427];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[I")
    public static int[] field420 = new int[field427];

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "[I")
    public static int[] field429 = new int[field427];

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[I")
    public static int[] field421 = new int[field427];

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field432 = new String[field427];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[I")
    public static int[] field416 = new int[field427];

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[I")
    public static int[] field431 = new int[field427];

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method208(int arg0, int arg1, byte arg2) {
        field422++;
        if (arg2 != -19) {
            method209((byte) 119);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static void method209(byte arg0) {
        field421 = null;
        field428 = null;
        field416 = null;
        field420 = null;
        field432 = null;
        if (arg0 >= 79) {
            field431 = null;
            field429 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lua;")
    public final class662 method210(int arg0, int arg1) {
        field418++;
        class510 var3 = this.field436;
        class662 var4;
        synchronized (this.field436) {
            var4 = (class662) this.field436.method3054((byte) -93, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field425;
        byte[] var6;
        synchronized (this.field425) {
            var6 = this.field425.method1453(client.method1946(-13926, arg0), 8, class23.method142((byte) -108, arg0));
        }
        class662 var7 = new class662();
        if (var6 != null) {
            var7.method3725(-7, new class35(var6));
        }
        if (arg1 < 60) {
            field435 = -99;
        }
        class510 var8 = this.field436;
        synchronized (this.field436) {
            this.field436.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z")
    public static final boolean method211(byte arg0) {
        if (arg0 == -61) {
            field417++;
            return class269.field3877;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
    public final void method212(byte arg0, int arg1) {
        field426++;
        int var3 = 58 / ((arg0 + 26) / 56);
        class510 var4 = this.field436;
        synchronized (this.field436) {
            this.field436.method3048(false);
            this.field436 = new class510(arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BI)V")
    public final void method213(byte arg0, int arg1) {
        class510 var3 = this.field436;
        synchronized (this.field436) {
            this.field436.method3049(arg1, (byte) 126);
        }
        if (arg0 != 29) {
            method211((byte) 109);
        }
        field433++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public final void method214(int arg0) {
        field423++;
        class510 var2 = this.field436;
        synchronized (this.field436) {
            this.field436.method3048(false);
            if (arg0 != 50) {
                field431 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
    public final void method215(byte arg0) {
        if (arg0 >= -36) {
            method211((byte) -26);
        }
        class510 var2 = this.field436;
        synchronized (this.field436) {
            this.field436.method3050(false);
        }
        field434++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([SZ)[S")
    public static final short[] method216(short[] arg0, boolean arg1) {
        field419++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class622.method3593(arg0, 0, var2, 0, arg0.length);
            return arg1 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class32(class179 arg0, int arg1, class209 arg2) {
        this.field425 = arg2;
        if (this.field425 != null) {
            int var4 = this.field425.method1454(-1) - 1;
            this.field425.method1477(0, var4);
        }
    }
}
