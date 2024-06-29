import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class322 extends class261 {

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field4919 = 0;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Los;")
    public static class309 field4907 = new class309("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field4926 = -1;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "[I")
    public static int[] field4925 = new int[2];

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "[I")
    public static int[] field4927 = new int[1];

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Lgh;")
    public class388 field4913;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Lgh;")
    public class388 field4918;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Lpb;")
    public static class469 field4924;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Ljava/lang/String;")
    public String field4921;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Z")
    public boolean field4916;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[I")
    public static int[] field4910;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "[I")
    public static int[] field4923;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field4911;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([J[Ljava/lang/Object;III)V", line = 10)
    public static final void method2060(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg4; var11++) {
                if (arg0[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method2060(arg0, arg1, 69, arg3, var6 - 1);
            method2060(arg0, arg1, 86, var6 + 1, arg4);
        }
        field4912++;
        if (arg2 <= 54) {
            method2061(true);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V", line = 73)
    public static void method2061(boolean arg0) {
        field4924 = null;
        field4927 = null;
        field4923 = null;
        field4910 = null;
        field4907 = null;
        field4925 = null;
        if (!arg0) {
            method2061(true);
        }
    }
}
