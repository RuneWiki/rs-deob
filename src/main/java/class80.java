import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class80 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lud;")
    private class38 field1362 = null;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    private int field1368 = 65000;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lud;")
    private class38 field1372 = null;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[[I")
    public static int[][] field1360 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lgb;")
    public static class213 field1371;

    @OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field1366++;
        return "Cache:" + this.field1361;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 13)
    public static final void method571(byte arg0) {
        if (arg0 < 90) {
            method571((byte) 82);
        }
        field1367++;
        for (int var1 = 0; var1 < class226.field3895; var1++) {
            int var2 = class92.field1616[var1];
            class107 var3 = class16.field214[var2];
            if (var3 != null) {
                class239.method1640((byte) -65, var3.field1906.field2548, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZI[B)Z", line = 46)
    private final boolean method572(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field1365++;
        class38 var6 = this.field1372;
        synchronized (this.field1372) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (this.field1362.method281(32) < (long) (arg1 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1362.method290(false, (long) (arg1 * 6));
                    this.field1362.method285(class299.field5121, 6, -1, 0);
                    var7 = (class299.field5121[5] & 0xFF) + ((class299.field5121[4] & 0xFF) << 8) + ((class299.field5121[3] & 0xFF) << 16);
                    if (var7 <= 0 || (this.field1372.method281(32) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1372.method281(32) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class299.field5121[1] = (byte) (arg3 >> 8);
                class299.field5121[5] = (byte) var7;
                class299.field5121[2] = (byte) arg3;
                int var8 = 98 / ((31 - arg0) / 34);
                class299.field5121[4] = (byte) (var7 >> 8);
                class299.field5121[0] = (byte) (arg3 >> 16);
                class299.field5121[3] = (byte) (var7 >> 16);
                this.field1362.method290(false, (long) (arg1 * 6));
                int var9 = 0;
                int var10 = 0;
                this.field1362.method292(105, class299.field5121, 0, 6);
                while (true) {
                    if (arg3 > var9) {
                        label135: {
                            int var11 = 0;
                            if (arg2) {
                                this.field1372.method290(false, (long) (var7 * 520));
                                try {
                                    this.field1372.method285(class299.field5121, 8, -1, 0);
                                } catch (EOFException var19) {
                                    break label135;
                                }
                                var11 = (class299.field5121[4] & 0xFF << 16) - (-(class299.field5121[5] & 0xFF << 8) - (class299.field5121[6] & 0xFF));
                                int var13 = ((class299.field5121[0] & 0xFF) << 8) + (class299.field5121[1] & 0xFF);
                                int var14 = class299.field5121[7] & 0xFF;
                                int var15 = (class299.field5121[2] & 0xFF << 8) + (class299.field5121[3] & 0xFF);
                                if (arg1 != var13 || var10 != var15 || this.field1361 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var11 < 0 || (this.field1372.method281(32) / 520L) < ((long) var11)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var11 == 0) {
                                arg2 = false;
                                var11 = (int) ((this.field1372.method281(32) + 519L) / 520L);
                                if (var11 == 0) {
                                    var11++;
                                }
                                if (var7 == var11) {
                                    var11++;
                                }
                            }
                            int var16 = arg3 - var9;
                            if (var16 > 512) {
                                var16 = 512;
                            }
                            if ((arg3 - var9) <= 512) {
                                var11 = 0;
                            }
                            class299.field5121[0] = (byte) (arg1 >> 8);
                            class299.field5121[7] = (byte) this.field1361;
                            class299.field5121[3] = (byte) var10;
                            class299.field5121[6] = (byte) var11;
                            class299.field5121[1] = (byte) arg1;
                            class299.field5121[2] = (byte) (var10 >> 8);
                            var10++;
                            class299.field5121[5] = (byte) (var11 >> 8);
                            class299.field5121[4] = (byte) (var11 >> 16);
                            this.field1372.method290(false, (long) (var7 * 520));
                            this.field1372.method292(83, class299.field5121, 0, 8);
                            var7 = var11;
                            this.field1372.method292(87, arg4, var9, var16);
                            var9 += var16;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 167)
    public static void method573(int arg0) {
        field1371 = null;
        if (arg0 == 4) {
            field1360 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lrk;IIIII)V", line = 188)
    public static final void method574(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class300.field5129 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class23.field277) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class290.field4995 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class228 var14 = class178.field3180[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class201.field3482[var11][var12 + 1][var13] + class201.field3482[var11][var12][var13] + class201.field3482[var11][var12][var13 + 1] + class201.field3482[var11][var12 + 1][var13 + 1]) / 4 - (class201.field3482[arg1][arg2 + 1][arg3] + class201.field3482[arg1][arg2][arg3] + class201.field3482[arg1][arg2][arg3 + 1] + class201.field3482[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class23 var16 = var14.field3923;
                                    if (var16 != null) {
                                        if (var16.field291.method709()) {
                                            arg0.method711(var16.field291, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field289 != null && var16.field289.method709()) {
                                            arg0.method711(var16.field289, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3950; var17++) {
                                        class219 var18 = var14.field3932[var17];
                                        if (var18 != null && var18.field3801.method709() && (var18.field3793 == var12 || var7 == var12) && (var18.field3797 == var13 || var9 == var13)) {
                                            int var19 = var18.field3785 + 1 - var18.field3793;
                                            int var20 = var18.field3789 + 1 - var18.field3797;
                                            arg0.method711(var18.field3801, (var18.field3793 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3797 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(ILud;Lud;I)V", line = 429)
    public class80(int arg0, class38 arg1, class38 arg2, int arg3) {
        this.field1362 = arg2;
        this.field1368 = arg3;
        this.field1372 = arg1;
        this.field1361 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)Z", line = 304)
    public static final boolean method575(boolean arg0, int arg1) {
        if (arg0) {
            field1371 = (class213) null;
        }
        field1369++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[B", line = 317)
    public final byte[] method576(int arg0, int arg1) {
        field1363++;
        class38 var3 = this.field1372;
        synchronized (this.field1372) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field1362.method281(32)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1362.method290(false, (long) (arg1 * 6));
                this.field1362.method285(class299.field5121, 6, -1, 0);
                int var4 = ((class299.field5121[1] & 0xFF) << 8) + (((class299.field5121[0] & 0xFF) << 16) + (class299.field5121[arg0] & 0xFF));
                int var5 = (class299.field5121[5] & 0xFF) + ((class299.field5121[3] & 0xFF) << 16) + (class299.field5121[4] & 0xFF << 8);
                if (var4 < 0 || var4 > this.field1368) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field1372.method281(32) / 520L < (long) var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var4 > var7) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1372.method290(false, (long) (var5 * 520));
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1372.method285(class299.field5121, var9 + 8, -1, 0);
                        int var10 = ((class299.field5121[0] & 0xFF) << 8) + (class299.field5121[1] & 0xFF);
                        int var11 = ((class299.field5121[4] & 0xFF) << 16) - (-(class299.field5121[5] & 0xFF << 8) - (class299.field5121[6] & 0xFF));
                        int var12 = class299.field5121[7] & 0xFF;
                        int var13 = (class299.field5121[2] & 0xFF << 8) + (class299.field5121[3] & 0xFF);
                        if (arg1 != var10 || var8 != var13 || this.field1361 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || this.field1372.method281(32) / 520L < (long) var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var8++;
                        var5 = var11;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class299.field5121[var14 + 8];
                        }
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BIII)Z", line = 402)
    public final boolean method577(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 119 % ((60 - arg1) / 60);
        field1364++;
        class38 var6 = this.field1372;
        synchronized (this.field1372) {
            if (arg3 < 0 || arg3 > this.field1368) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method572(82, arg2, true, arg3, arg0);
            if (!var7) {
                var7 = this.method572(116, arg2, false, arg3, arg0);
            }
            return var7;
        }
    }
}
