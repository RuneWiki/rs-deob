import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class757 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    private int field10432 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    private int field10429 = 0;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    private int field10440 = 0;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lhk;")
    private class111 field10437;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lol;")
    private class301 field10436;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[Lcka;")
    private class187[] field10428;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lii;")
    public class580 field10435;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field10433 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lfja;")
    public static class783 field10441;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBII)Z", line = 5)
    public static final boolean method4186(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -49) {
            return false;
        }
        field10438++;
        if (!class378.field5160 || !class633.field8766) {
            return false;
        } else if (class22.field461 < 100) {
            return false;
        } else {
            int var4 = class168.field2704[arg0][arg2][arg3];
            if (-class497.field6804 == var4) {
                return false;
            } else if (class497.field6804 == var4) {
                return true;
            } else if (class745.field10286 == class178.field2805) {
                return false;
            } else {
                int var5 = arg2 << class654.field9055;
                int var6 = arg3 << class654.field9055;
                if (class625.method3519(var6 + class365.field4955 - 1, var5 - -1, var6 + 1, var6 - -class365.field4955 + -1, var5 + 1, class745.field10286[arg0].method1897((byte) -34, arg3, arg2), class745.field10286[arg0].method1897((byte) -34, arg3 + 1, arg2 + 1), 94, class745.field10286[arg0].method1897((byte) -34, arg3 + 1, arg2), class365.field4955 + var5 - 1) && class625.method3519(var6 + class365.field4955 - 1, var5 + 1, var6 + 1, var6 + 1, class365.field4955 + var5 - 1, class745.field10286[arg0].method1897((byte) -34, arg3, arg2), class745.field10286[arg0].method1897((byte) -34, arg3, arg2 + 1), -79, class745.field10286[arg0].method1897((byte) -34, arg3 + 1, arg2 + 1), var5 - (1 - class365.field4955))) {
                    class137.field2345++;
                    class168.field2704[arg0][arg2][arg3] = class497.field6804;
                    return true;
                } else {
                    class168.field2704[arg0][arg2][arg3] = -class497.field6804;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLqk;I)Z", line = 53)
    public final boolean method4187(byte arg0, class18 arg1, int arg2) {
        field10442++;
        if (this.field10440 == 0) {
            return false;
        }
        this.field10428[this.field10440 & Integer.MAX_VALUE].method167(arg2, (byte) -126, arg1);
        if (arg0 != 111) {
            this.field10436 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z", line = 70)
    public final boolean method4188(byte arg0, int arg1) {
        if (arg0 > -115) {
            return false;
        } else {
            field10430++;
            return this.field10428[arg1].method171(20220);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/Object;IIB)[B", line = 83)
    public static final byte[] method4189(Object arg0, int arg1, int arg2, byte arg3) {
        field10427++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class735.method4079(var4, arg1, arg2, -1);
        } else if (arg0 instanceof class531) {
            class531 var5 = (class531) arg0;
            return var5.method1504(arg2, arg1, -122);
        } else if (arg3 == -10) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 116)
    public static void method4190(int arg0) {
        if (arg0 == 0) {
            field10441 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lhk;)V", line = 168)
    public class757(class111 arg0) {
        this.field10437 = arg0;
        this.field10436 = new class301(arg0);
        this.field10428 = new class187[10];
        this.field10428[1] = new class190(arg0);
        this.field10428[2] = new class289(arg0, this.field10436);
        this.field10428[4] = new class737(arg0, this.field10436);
        this.field10428[5] = new class563(arg0, this.field10436);
        this.field10428[6] = new class396(arg0);
        this.field10428[7] = new class754(arg0);
        this.field10428[3] = this.field10435 = new class580(arg0);
        this.field10428[8] = new class392(arg0, this.field10436);
        this.field10428[9] = new class25(arg0, this.field10436);
        if (!this.field10428[8].method171(20220)) {
            this.field10428[8] = this.field10428[4];
        }
        if (!this.field10428[9].method171(20220)) {
            this.field10428[9] = this.field10428[8];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z", line = 135)
    public static final boolean method4191(boolean arg0, int arg1) {
        field10439++;
        if (!arg0) {
            method4186(71, (byte) -89, 13, -103);
        }
        return arg1 == 7 || arg1 == 9;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[SZ)[S", line = 155)
    public static final short[] method4192(int arg0, short[] arg1, boolean arg2) {
        if (!arg2) {
            method4192(124, null, true);
        }
        field10434++;
        short[] var3 = new short[arg0];
        class275.method1776(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZZI)V", line = 195)
    public final void method4193(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field10431++;
        boolean var7 = arg4 & this.field10437.method588();
        if (arg2 != -1) {
            return;
        }
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg0 = arg5;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg3) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field10440 != arg1) {
            if (this.field10440 != 0) {
                this.field10428[this.field10440 & Integer.MAX_VALUE].method169(true);
            }
            if (arg1 != 0) {
                this.field10428[arg1 & Integer.MAX_VALUE].method168(arg3, (byte) -12);
                this.field10428[arg1 & Integer.MAX_VALUE].method172(60, arg3);
                this.field10428[arg1 & Integer.MAX_VALUE].method170(arg5, true, arg0);
            }
            this.field10440 = arg1;
            this.field10429 = arg5;
            this.field10432 = arg0;
        } else if (this.field10440 != 0) {
            this.field10428[this.field10440 & Integer.MAX_VALUE].method172(102, arg3);
            if (this.field10429 != arg5 || this.field10432 != arg0) {
                this.field10428[this.field10440 & Integer.MAX_VALUE].method170(arg5, true, arg0);
                this.field10429 = arg5;
                this.field10432 = arg0;
            }
            return;
        }
    }
}
