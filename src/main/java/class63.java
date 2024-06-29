import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class63 extends class130 {

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Z")
    public boolean field868 = false;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field865 = 2301979;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lqj;")
    public static class196 field866 = class80.method502("Benutzen", -48);

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "[Lnb;")
    public static class95[] field873 = new class95[256];

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "Lqj;")
    public static class196 field877 = class80.method502("labels)3dat", -48);

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Lqj;")
    public static class196 field871 = class80.method502("m", -48);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII[IIIIIB[B)V")
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, byte[] arg10) {
        int var11 = ((arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
        if (arg9 != -120) {
            field863 = -56;
        }
        field876++;
        int var12 = 256 - arg2;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                if (arg10[arg8++] == 0) {
                    arg6++;
                } else {
                    int var15 = arg4[arg6];
                    arg4[arg6++] = var11 + (class65.method409(16711680, var12 * class65.method409(var15, 65280)) + class65.method409(class65.method409(16711935, var15) * var12, -16711936) >> 8);
                }
            }
            arg6 += arg5;
            arg8 += arg7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method396(int arg0) {
        if (arg0 != -24206) {
            method397(-67, null, 110, -36);
        }
        field866 = null;
        field877 = null;
        field873 = null;
        field871 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILbk;II)Lwi;")
    public static final class233 method397(int arg0, class136 arg1, int arg2, int arg3) {
        if (arg0 >= -100) {
            method396(55);
        }
        field872++;
        return class84.method528(arg1, arg2, arg3, 0) ? class16.method86(0) : null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
    public static final void method398(int arg0, int arg1) {
        class153.field2463.method1535(arg1, 30704);
        field870++;
        if (arg0 > -122) {
            method400(-17, -127, null, 6);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)J")
    public static final long method399(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        return var3 == null || var3.field829 == null ? 0L : var3.field829.field3978;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method400(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 < 36) {
            method395(38, -88, -86, 41, null, -22, -50, -46, 103, (byte) 42, null);
        }
        boolean var4 = true;
        class56 var5 = new class56(arg2);
        field867++;
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method366(84);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class145 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method307((byte) 73);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method367(1);
                                    }
                                    int var10 = var5.method307((byte) 73);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method367(1) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = arg1 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class83.method521(var6, (byte) 101);
                } while (var13 == 22 && !class219.field3919 && var16.field2236 == 0 && var16.field2253 != 1 && !var16.field2258);
                var9 = true;
                if (!var16.method911((byte) 51)) {
                    var4 = false;
                    class64.field879++;
                }
            }
        }
    }
}
