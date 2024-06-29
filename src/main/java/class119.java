import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class119 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[J")
    public static long[] field1995 = new long[256];

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2000;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1998;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[[[B")
    public static byte[][][] field2002;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBILjava/awt/Component;)Lcb;")
    public static final class137 method896(int arg0, byte arg1, int arg2, Component arg3) {
        field1992++;
        try {
            if (arg1 <= 40) {
                return null;
            } else {
                Class var4 = Class.forName("pd");
                class137 var5 = (class137) var4.getDeclaredConstructor().newInstance();
                var5.method1000(arg2, arg3, arg0, 1994341016);
                return var5;
            }
        } catch (Throwable var7) {
            class135 var6 = new class135();
            var6.method1000(arg2, arg3, arg0, 1994341016);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method897(byte arg0) {
        if (arg0 < -102) {
            field1995 = null;
            field1998 = null;
            field2002 = null;
            field2000 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lr;")
    public static final class23 method898(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        return var3 == null || var3.field2805 == null ? null : var3.field2805;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)I")
    public static final int method899(int arg0, int arg1, int arg2) {
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field1994++;
        if (arg1 <= 85) {
            field1995 = null;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
    public static final int method900(int arg0, byte arg1) {
        field1993++;
        if (arg1 != 74) {
            field1998 = null;
        }
        return (arg0 & 0x3FEEC) >> 11;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
    public static final void method901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class209.field3533 = arg1;
        class49.field840 = arg4;
        class243.field4080 = arg0;
        class223.field3737 = arg2;
        class261.field4384 = arg5;
        field1997++;
        if (arg3 != -29319) {
            return;
        }
        if (class209.field3533 >= 100) {
            int var6 = class223.field3737 * 128 + 64;
            int var7 = class49.field840 * 128 + 64;
            int var8 = class277.method1939(class182.field2898, var6, var7, (byte) -34) - class243.field4080;
            int var9 = var6 - class107.field1758;
            int var10 = var8 - class263.field4393;
            int var11 = var7 - class76.field1302;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class183.field2926 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class245.field4102 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class183.field2926 < 128) {
                class183.field2926 = 128;
            }
            if (class183.field2926 > 383) {
                class183.field2926 = 383;
            }
        }
        class169.field2739 = 2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V")
    public static final void method902(boolean arg0, int arg1) {
        field1996++;
        if (arg0 == class65.field1095) {
            return;
        }
        if (arg1 != 0) {
            method900(45, (byte) 86);
        }
        class65.field1095 = arg0;
        class71.method504(-95);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1995[var0] = var1;
        }
        field2001 = 0;
        field2000 = "rating: ";
        field1998 = "wave2:";
    }
}
