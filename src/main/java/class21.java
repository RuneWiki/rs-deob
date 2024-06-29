import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class21 extends class26 {

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    private final int field367;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    private final int field361;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    private final int field364;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    private final int field377;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    private final int field376;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    private final int field379;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    private final int field362;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    private final int field372;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Lub;")
    public static class227 field369 = class257.method1749("Lade)3)3)3", 17263);

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[Lub;")
    public static class227[] field363 = new class227[200];

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "Lub;")
    public static class227 field380 = class257.method1749(":chalreq:", 17263);

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "Lub;")
    private static class227 field382 = class257.method1749("Ok", 17263);

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "[I")
    public static int[] field383 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lub;")
    public static class227 field370 = field382;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "[[B")
    public static byte[][] field381;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        ++field373;
        if (arg0 != 512) {
            field369 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field367 = arg4;
        this.field361 = arg6;
        this.field364 = arg2;
        this.field377 = arg3;
        this.field376 = arg0;
        this.field379 = arg5;
        this.field362 = arg7;
        this.field372 = arg1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZ[Ldj;I[BIIIII)V")
    public static final void method101(int arg0, int arg1, boolean arg2, class134[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 1716) {
            method104((byte) 36);
        }
        ++field375;
        int var11 = -1;
        class226 var12 = new class226(arg5);
        while (true) {
            int var13 = var12.method1474(49);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1467(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = 63 & var14;
                int var17 = var14 >> 6 & 63;
                int var18 = var14 >> 12;
                int var19 = var12.method1471(255);
                int var20 = var19 >> 2;
                int var21 = var19 & 3;
                if (arg4 == var18 && ~arg6 >= ~var17 && ~(arg6 + 8) < ~var17 && arg7 <= var16 && arg7 + 8 > var16) {
                    class45 var22 = class220.method1389(var11, (byte) 92);
                    int var23 = class219.method1386(var16 & 7, var22.field810, arg9, var21, var17 & 7, (byte) -72, var22.field790) + arg8;
                    int var24 = class211.method1346(arg0 + -1709, var17 & 7, 7 & var16, var21, arg9, var22.field810, var22.field790) + arg10;
                    if (~var23 < -1 && ~var24 < -1 && var23 < 103 && var24 < 103) {
                        class134 var25 = null;
                        if (!arg2) {
                            int var26 = arg1;
                            if ((class40.field654[1][var23][var24] & 2) == 2) {
                                var26 = arg1 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg3[var26];
                            }
                        }
                        class225.method1421(var20, var23, !arg2, var11, arg1, arg2, var25, arg1, 42, var24, 3 & arg9 + var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLa;I)V")
    public static final void method102(boolean arg0, class20 arg1, int arg2) {
        if (class149.field2596 != null) {
            try {
                class149.field2596.method97(0);
            } catch (Exception var8) {
            }
            class149.field2596 = null;
        }
        class149.field2596 = arg1;
        ++field378;
        class192.method1223(arg0, true);
        class193.field3291 = null;
        class47.field844 = 0;
        class253.field4438.field3879 = arg2;
        class153.field2664 = null;
        while (true) {
            class214 var3 = (class214) class236.field4093.method1299((byte) 55);
            if (var3 == null) {
                while (true) {
                    class214 var4 = (class214) class99.field1728.method1299((byte) -63);
                    if (var4 == null) {
                        if (class238.field4137 != 0) {
                            try {
                                class226 var5 = new class226(4);
                                var5.method1443(4, 0);
                                var5.method1443(class238.field4137, 0);
                                var5.method1451(0, (byte) -126);
                                class149.field2596.method94(4, (byte) -24, var5.field3901, 0);
                            } catch (IOException var7) {
                                try {
                                    class149.field2596.method97(arg2);
                                } catch (Exception var6) {
                                }
                                class149.field2596 = null;
                                ++class29.field469;
                            }
                        }
                        class216.field3638 = 0;
                        class166.field2783 = class12.method57(-105);
                        return;
                    }
                    class100.field1750.method218(var4, (byte) 98);
                    class140.field2420.method1300(var4, var4.field1113, -2875);
                    --class63.field1159;
                    ++class254.field4471;
                }
            }
            class176.field2930.method1300(var3, var3.field1113, arg2 + -2875);
            ++class56.field1014;
            --class56.field1013;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IIB)V")
    public final void method103(int arg0, int arg1, byte arg2) {
        if (arg2 < 98) {
            field380 = null;
        }
        ++field365;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method104(byte arg0) {
        field380 = null;
        field363 = null;
        field370 = null;
        field382 = null;
        field383 = null;
        field381 = null;
        if (arg0 > -125) {
            method101(-39, 22, false, (class134[]) null, -112, (byte[]) null, -9, -74, -33, -77, 114);
        }
        field369 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIII)V")
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class23.method111(arg2, class161.field2718, class46.field817, arg5 + -7);
        int var7 = class23.method111(arg4, class161.field2718, class46.field817, 0);
        ++field371;
        int var8 = class23.method111(arg1, class125.field2234, class19.field331, arg5 ^ 7);
        int var9 = class23.method111(arg3, class125.field2234, class19.field331, arg5 ^ arg5);
        for (int var10 = var6; var10 <= var7; ++var10) {
            class246.method1644(arg0, class59.field1094[var10], var9, var8, arg5 ^ 6);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)V")
    public final void method106(int arg0, int arg1, byte arg2) {
        ++field368;
        int var4 = this.field372 * arg1 >> 12;
        int var5 = this.field364 * arg0 >> 12;
        int var6 = this.field376 * arg0 >> 12;
        int var7 = this.field377 * arg1 >> 12;
        int var8 = this.field379 * arg1 >> 12;
        if (arg2 != -75) {
            field381 = null;
        }
        int var9 = this.field367 * arg0 >> 12;
        int var10 = this.field362 * arg1 >> 12;
        int var11 = this.field361 * arg0 >> 12;
        class76.method447(var11, var6, var8, super.field433, var5, -1, var9, var4, var7, var10);
    }
}
