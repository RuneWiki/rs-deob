import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class718 {

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Liv;")
    public static class25 field9995 = new class25(2);

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)I", line = 3)
    public static final int method4022(int arg0, int arg1, int arg2) {
        field10002++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (arg1 != -24115) {
                field10001 = 104;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[F)[F", line = 40)
    public static final float[] method4023(int arg0, int arg1, float[] arg2) {
        field9996++;
        float[] var3 = new float[arg0];
        if (arg1 == 27852) {
            class245.method1651(arg2, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILuu;Ljava/lang/String;Z)Ldp;", line = 55)
    public static final class375 method4024(int arg0, class237 arg1, String arg2, boolean arg3) {
        field10000++;
        int var4 = arg1.method1598(arg2, false);
        if (var4 == -1) {
            return new class375(0);
        }
        int[] var5 = arg1.method1585(var4, false);
        if (arg0 <= 114) {
            method4028((byte) -68, -120, 122, -112, -26);
        }
        class375 var6 = new class375(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field5276 > var7) {
                class63 var9 = new class63(arg1.method1572(var4, 0, var5[var8++]));
                int var10 = var9.method457(-14532);
                int var11 = var9.method482(-772591672);
                int var12 = var9.method505((byte) -119);
                if (!arg3 && var12 == 1) {
                    var6.field5276--;
                } else {
                    var6.field5275[var7] = var10;
                    var6.field5274[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fv", name = "toString", descriptor = "()Ljava/lang/String;", line = 103)
    public final String toString() {
        field9997++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/awt/Canvas;III)Lev;", line = 112)
    public static final class349 method4025(Canvas arg0, int arg1, int arg2, int arg3) {
        field9994++;
        try {
            Class var4 = Class.forName("ho");
            class349 var5 = (class349) var4.getDeclaredConstructor().newInstance();
            var5.method585(arg2, arg1, (byte) -95, arg0);
            if (arg3 != 21739) {
                field9998 = 9;
            }
            return var5;
        } catch (Throwable var7) {
            class80 var6 = new class80();
            var6.method585(arg2, arg1, (byte) -67, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Z", line = 140)
    public final boolean method4026(int arg0) {
        field9992++;
        if (arg0 != 126) {
            method4027(-64);
        }
        return class347.field4936 == this | class331.field4702 == this;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 155)
    public static void method4027(int arg0) {
        field9995 = null;
        if (arg0 != -15798) {
            field9995 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIIII)Z", line = 170)
    public static final boolean method4028(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field9999++;
        int var5 = -16 / ((arg0 + 16) / 63);
        if ((class692.field9623[0][arg4][arg1] & 0x2) != 0) {
            return true;
        } else if ((class692.field9623[arg2][arg4][arg1] & 0x10) == 0) {
            return arg3 == class643.method3593(arg4, arg2, arg1, 2);
        } else {
            return false;
        }
    }
}
