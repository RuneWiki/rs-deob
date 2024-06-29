import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class382 {

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[Ltm;")
    private class187[] field5447;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field5443;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5444 = "Loaded client variable data";

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[Lwd;")
    public static class36[] field5435 = new class36[29];

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "J")
    public static long field5438 = 0L;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "J")
    private long field5441;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ltm;")
    private class187 field5436;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lam;")
    public static class286 field5449;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[Llg;")
    public static class20[] field5446;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method2359(int arg0) {
        if (class88.field1003.method1612()) {
            class206.method1119((byte) 115);
            class88.field1003.method1649(class38.field391);
            class84.method458((byte) -125);
        } else {
            class429.method2657(class101.field1182, 616516448);
        }
        if (arg0 == -12699) {
            field5437++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method2360(byte arg0) {
        if (arg0 == -43) {
            field5435 = null;
            field5446 = null;
            field5444 = null;
            field5449 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[[B[I[BI[[BII)I")
    public static final int method2361(int[] arg0, byte[][] arg1, int[] arg2, byte[] arg3, int arg4, byte[][] arg5, int arg6, int arg7) {
        field5451++;
        int var8 = arg2[arg7];
        int var9 = arg0[arg7] + var8;
        int var10 = arg2[arg6];
        int var11 = arg0[arg6] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg3[arg7] & arg4;
        if (var14 > (arg3[arg6] & 0xFF)) {
            var14 = arg3[arg6] & 0xFF;
        }
        byte[] var15 = arg5[arg7];
        byte[] var16 = arg1[arg6];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILam;)V")
    public static final void method2362(int arg0, class286 arg1) {
        class127.field1635 = arg1;
        field5448++;
        class127.field1635.method1691(35, arg0);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)Ltm;")
    public final class187 method2363(byte arg0) {
        field5440++;
        if (this.field5436 == null) {
            return null;
        }
        if (arg0 >= -17) {
            field5444 = null;
        }
        class187 var2 = this.field5447[(int) ((long) (this.field5443 - 1) & this.field5441)];
        while (this.field5436 != var2) {
            if (this.field5436.field2365 == this.field5441) {
                class187 var3 = this.field5436;
                this.field5436 = this.field5436.field2358;
                return var3;
            }
            this.field5436 = this.field5436.field2358;
        }
        this.field5436 = null;
        return null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Lsn;")
    public static final class449 method2364(int arg0, int arg1, int arg2) {
        class96 var3 = class176.field2209[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1136;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILtm;J)V")
    public final void method2365(int arg0, class187 arg1, long arg2) {
        if (arg1.field2362 != null) {
            arg1.method1009((byte) 118);
        }
        field5445++;
        int var5 = -101 / ((-arg0 - 39) / 45);
        class187 var6 = this.field5447[(int) (arg2 & (long) (this.field5443 - 1))];
        arg1.field2362 = var6.field2362;
        arg1.field2358 = var6;
        arg1.field2362.field2358 = arg1;
        arg1.field2365 = arg2;
        arg1.field2358.field2362 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public static final void method2366(byte arg0) {
        class244.field3323 = 0;
        field5439++;
        class342.field4577.method829(false);
        if (arg0 != -43) {
            method2360((byte) -42);
        }
        class342.field4577.method825(-106, class209.field2847);
        class244.field3323++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[Lqs;Lvm;I[BZI)V")
    public static final void method2367(byte arg0, class438[] arg1, class322 arg2, int arg3, byte[] arg4, boolean arg5, int arg6) {
        field5450++;
        class250 var7 = new class250(arg4);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1369((byte) 47);
            if (var9 == 0) {
                if (arg0 != -40) {
                    method2361((int[]) null, (byte[][]) null, (int[]) null, (byte[]) null, 11, (byte[][]) null, -7, 14);
                    return;
                }
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1383(255);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = (var10 & 0xFFD) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1350(31351);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg6 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && class315.field4214 - 1 > var18 && var19 < class340.field4549 - 1) {
                    class438 var20 = null;
                    if (!arg5) {
                        int var21 = var14;
                        if ((class282.field3872[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    client.method1414(arg5, var19, var18, var14, true, -1, var20, var8, var16, var14, 0, arg2, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
    public class382(int arg0) {
        this.field5447 = new class187[arg0];
        this.field5443 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field5447[var2] = new class187();
            var3.field2358 = var3;
            var3.field2362 = var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(JI)Ltm;")
    public final class187 method2368(long arg0, int arg1) {
        this.field5441 = arg0;
        field5442++;
        class187 var4 = this.field5447[(int) ((long) (this.field5443 - 1) & arg0)];
        this.field5436 = var4.field2358;
        if (arg1 != 2) {
            return null;
        }
        while (this.field5436 != var4) {
            if (this.field5436.field2365 == arg0) {
                class187 var5 = this.field5436;
                this.field5436 = this.field5436.field2358;
                return var5;
            }
            this.field5436 = this.field5436.field2358;
        }
        this.field5436 = null;
        return null;
    }
}
