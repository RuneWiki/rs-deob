import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class416 extends class656 {

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5739 = "";

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "[I")
    public static int[] field5737 = new int[13];

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Z")
    public static boolean field5742 = false;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[Z")
    public static boolean[] field5745 = new boolean[8];

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Ldu;")
    public static class360 field5750 = new class360(16);

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field5751 = 0;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "J")
    public long field5747;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Ldg;")
    public class416 field5744;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Ldg;")
    public class416 field5748;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILvfa;IB)V")
    public static final void method2410(int arg0, class672 arg1, int arg2, byte arg3) {
        if (arg3 == 13) {
            class12.field190 = arg2;
            class50.field637 = arg0;
            class294.field4214 = arg1;
            field5743++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Z")
    public final boolean method2411(byte arg0) {
        if (arg0 == 65) {
            field5746++;
            return this.field5744 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)V")
    public static void method2412(boolean arg0) {
        if (!arg0) {
            field5750 = null;
            field5737 = null;
            field5745 = null;
            field5739 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V")
    public static final void method2413() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class550.field7263.length; var1++) {
                if (class550.field7263[var1].method3274()) {
                    class557.field7331[var1] = class550.field7263[var1].method3275();
                } else {
                    synchronized (class550.field7263[var1]) {
                        class550.field7263[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class550.field7263[class550.field7263.length - 1].method3270();
                class380.method2245(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class550.field7263.length - 1; var4++) {
                        if (!class550.field7263[var4].method3274()) {
                            synchronized (class550.field7263[var4]) {
                                class550.field7263[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class550.field7263.length - 2; var6++) {
                            class550.field7263[var6].method3270();
                        }
                        class380.method2245(2);
                        while (!class550.field7263[0].method3274()) {
                            synchronized (class550.field7263[0]) {
                                class550.field7263[0].notify();
                            }
                            try {
                                class226.method1447((byte) -124, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class550.field7263[0].method3270();
                        return;
                    }
                    try {
                        class226.method1447((byte) -124, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class226.method1447((byte) -124, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
    public final void method2414(byte arg0) {
        if (arg0 != -26) {
            return;
        }
        field5741++;
        if (this.field5744 != null) {
            this.field5744.field5748 = this.field5748;
            this.field5748.field5744 = this.field5744;
            this.field5748 = null;
            this.field5744 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIBZ)Lff;")
    public static final class8 method2415(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field5749++;
        class8 var5 = new class8();
        var5.field157 = arg0;
        var5.field161 = arg1;
        class350.field4925.method2143(-1, var5, (long) arg2);
        int var6 = 34 % ((arg3 - 81) / 39);
        class100.method746(arg1, (byte) 102);
        class672 var7 = class21.method225(65535, arg2);
        if (var7 != null) {
            class399.method2347(var7, 2260);
        }
        if (class420.field5787 != null) {
            class399.method2347(class420.field5787, 2260);
            class420.field5787 = null;
        }
        class653.method3556(-4);
        if (var7 != null) {
            class312.method1914(!arg4, (byte) 100, var7);
        }
        if (!arg4) {
            class182.method1251(arg1);
        }
        if (!arg4 && class443.field6101 != -1) {
            class2.method18(1, class443.field6101, (byte) -45);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII[B[BII)V")
    public static final void method2416(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
        field5740++;
        int var9 = -(arg2 >> 2);
        if (arg4 != 13427) {
            field5739 = null;
        }
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg6[var10001] += arg5[arg7++];
                int var14 = arg1++;
                arg6[var14] += arg5[arg7++];
                int var15 = arg1++;
                arg6[var15] += arg5[arg7++];
                int var16 = arg1++;
                arg6[var16] += arg5[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg6[var10001] += arg5[arg7++];
            }
            arg7 += arg0;
            arg1 += arg8;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lfha;B)I")
    public static final int method2417(class383 arg0, byte arg1) {
        field5738++;
        int var2 = arg0.field5361;
        class98 var3 = arg0.method4141(0);
        if (arg1 <= 21) {
            field5751 = 97;
        }
        if (arg0.field10247 == -1 || arg0.field10304) {
            var2 = arg0.field5356;
        } else if (arg0.field10247 == var3.field1209 || arg0.field10247 == var3.field1212 || arg0.field10247 == var3.field1241 || arg0.field10247 == var3.field1225) {
            var2 = arg0.field5316;
        } else if (arg0.field10247 == var3.field1223 || arg0.field10247 == var3.field1263 || arg0.field10247 == var3.field1257 || arg0.field10247 == var3.field1211) {
            var2 = arg0.field5336;
        }
        return var2;
    }
}
