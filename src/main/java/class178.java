import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class178 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field3236 = -1;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
    public static int[] field3243 = new int[1000];

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
    public static int[] field3245 = new int[32];

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3246 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "La;")
    public class114 field3237;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[I")
    public int[] field3244;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[Lhh;")
    public class163[] field3240;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[[[Leg;")
    public static class144[][][] field3247;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static void method1312(boolean arg0) {
        field3245 = null;
        if (arg0) {
            field3246 = null;
            field3247 = null;
            field3243 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILpa;BI)Lvf;")
    public static final class71 method1313(int arg0, class123 arg1, byte arg2, int arg3) {
        int var4 = 105 / ((-arg2 - 5) / 48);
        field3238++;
        return class85.method677(arg0, arg1, 20888, arg3) ? class231.method1613(0) : null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lhc;")
    public static final class177 method1314(byte arg0) {
        field3235++;
        try {
            int var1 = 111 % ((arg0 + 56) / 60);
            return (class177) Class.forName("of").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B[SI[Lhh;I)V")
    public static final void method1315(byte arg0, short[] arg1, int arg2, class163[] arg3, int arg4) {
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            class163 var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].method1192(var7, -118)) {
                    class163 var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1315((byte) -64, arg1, var6 - 1, arg3, arg4);
            method1315((byte) -123, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 < -50) {
            field3239++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIII)V")
    public static final void method1316(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3241++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        if (arg0 <= 93) {
            method1315((byte) 45, (short[]) null, -43, (class163[]) null, -51);
        }
        int var9 = class221.method1561(class127.field2465, (byte) -42, arg3 + arg4, class252.field4407);
        int var10 = class221.method1561(class127.field2465, (byte) -42, arg3 - arg4, class252.field4407);
        class227.method1585(var10, (byte) -66, arg1, class85.field1605[arg2], var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class182.field3344 <= var12 && class201.field3593 >= var11) {
                    int var13 = class221.method1561(class127.field2465, (byte) -42, arg3 + var5, class252.field4407);
                    int var14 = class221.method1561(class127.field2465, (byte) -42, arg3 - var5, class252.field4407);
                    if (var12 <= class201.field3593) {
                        class227.method1585(var14, (byte) -66, arg1, class85.field1605[var12], var13);
                    }
                    if (var11 >= class182.field3344) {
                        class227.method1585(var14, (byte) -66, arg1, class85.field1605[var11], var13);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (class182.field3344 <= var16 && class201.field3593 >= var15) {
                int var17 = class221.method1561(class127.field2465, (byte) -42, arg3 + var6, class252.field4407);
                int var18 = class221.method1561(class127.field2465, (byte) -42, arg3 - var6, class252.field4407);
                if (class201.field3593 >= var16) {
                    class227.method1585(var18, (byte) -66, arg1, class85.field1605[var16], var17);
                }
                if (var15 >= class182.field3344) {
                    class227.method1585(var18, (byte) -66, arg1, class85.field1605[var15], var17);
                }
            }
        }
    }
}
