import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class731 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Ltba;")
    private class165 field10167 = new class165(256);

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "Ltba;")
    private class165 field10181 = new class165(256);

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Lnd;")
    private class547 field10177;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lnd;")
    private class547 field10175;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field10176 = null;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field10179;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
    public static int[] field10169;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[Liea;")
    public static class481[] field10170;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 3)
    public static void method4075(boolean arg0) {
        field10169 = null;
        field10170 = null;
        if (arg0) {
            field10170 = null;
        }
        field10179 = null;
        field10176 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILsl;)Lkn;", line = 18)
    public static final class742 method4076(int arg0, class461 arg1) {
        if (arg0 != 0) {
            method4079((byte) 37, 0);
        }
        field10174++;
        return new class742(arg1.method2577(2), arg1.method2577(2), arg1.method2577(2), arg1.method2577(2), arg1.method2577(2), arg1.method2577(arg0 + 2), arg1.method2577(2), arg1.method2577(2), arg1.method2576((byte) 64), arg1.method2600((byte) -126));
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[IBI)Lct;", line = 31)
    private final class148 method4077(int arg0, int[] arg1, byte arg2, int arg3) {
        field10172++;
        int var5 = arg0 ^ ((arg3 & 0xB0000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class148 var9 = (class148) this.field10181.method1160(var7, 122);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class49 var10 = class49.method371(this.field10177, arg3, arg0);
            if (arg2 <= 116) {
                method4076(47, null);
            }
            if (var10 == null) {
                return null;
            }
            class148 var11 = var10.method372();
            this.field10181.method1153(var11, var7, -1);
            if (arg1 != null) {
                arg1[0] -= var11.field2054.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([IIB)Lct;", line = 70)
    public final class148 method4078(int[] arg0, int arg1, byte arg2) {
        field10178++;
        if (this.field10175.method3155((byte) -12) == 1) {
            return this.method4083(arg0, 0, (byte) -125, arg1);
        } else if (this.field10175.method3178((byte) 56, arg1) == 1) {
            return this.method4083(arg0, arg1, (byte) 103, 0);
        } else {
            int var4 = -79 / ((arg2 + 49) / 57);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)V", line = 89)
    public static final void method4079(byte arg0, int arg1) {
        field10168++;
        if (arg0 != 66) {
            method4075(false);
        }
        class37 var2 = class636.method3571(8, arg1, -118);
        var2.method230(arg0 ^ 0x36);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[IB)Lct;", line = 105)
    public final class148 method4080(int arg0, int[] arg1, byte arg2) {
        field10171++;
        if (arg2 <= 60) {
            this.method4077(-102, null, (byte) -75, -22);
        }
        if (this.field10177.method3155((byte) -68) == 1) {
            return this.method4077(arg0, arg1, (byte) 126, 0);
        } else if (this.field10177.method3178((byte) 99, arg0) == 1) {
            return this.method4077(0, arg1, (byte) 124, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILd;Lnd;)V", line = 134)
    public static final void method4081(int arg0, class153 arg1, class547 arg2) {
        field10173++;
        class313.field4094 = arg1;
        class510.field7192 = arg2;
        if (arg0 >= -24) {
            field10170 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V", line = 154)
    public static final void method4082(boolean arg0, int arg1, int arg2) {
        field10166++;
        if (arg1 == 14094) {
            class515 var3 = class534.method3075(arg0, arg2, arg1 - 14169);
            if (var3 != null) {
                var3.method1175(-2);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([IIBI)Lct;", line = 171)
    private final class148 method4083(int[] arg0, int arg1, byte arg2, int arg3) {
        field10180++;
        int var5 = 52 / ((arg2 + 63) / 50);
        int var6 = (arg1 << 4 & 0xFFFD | arg1 >>> 12) ^ arg3;
        int var7 = var6 | arg1 << 16;
        long var8 = (long) var7 ^ 0x100000000L;
        class148 var10 = (class148) this.field10181.method1160(var8, 123);
        if (var10 != null) {
            return var10;
        } else if (arg0 == null || arg0[0] > 0) {
            class413 var11 = (class413) this.field10167.method1160(var8, 119);
            if (var11 == null) {
                var11 = class413.method2318(this.field10175, arg1, arg3);
                if (var11 == null) {
                    return null;
                }
                this.field10167.method1153(var11, var8, -1);
            }
            class148 var12 = var11.method2312(arg0);
            if (var12 == null) {
                return null;
            } else {
                var11.method1175(-2);
                this.field10181.method1153(var12, var8, -1);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lnd;Lnd;)V", line = 227)
    public class731(class547 arg0, class547 arg1) {
        this.field10177 = arg0;
        this.field10175 = arg1;
    }
}
