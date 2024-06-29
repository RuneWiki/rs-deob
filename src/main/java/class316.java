import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class316 extends class262 {

    @OriginalMember(owner = "client!al", name = "W", descriptor = "Z")
    private boolean field5364 = true;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "Z")
    private boolean field5369 = true;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Lok;")
    public static class146 field5357 = class235.method1724(-12908, "::clientjs5drop");

    @OriginalMember(owner = "client!al", name = "O", descriptor = "Lok;")
    public static class146 field5356 = class235.method1724(-12908, "overlay");

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "Lok;")
    public static class146 field5358 = class235.method1724(-12908, "classement ");

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    public static int field5368 = 0;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "Llg;")
    public static class119 field5365;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "Ljava/lang/Thread;")
    public static Thread field5367;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Loj;I)V", line = 5)
    public static final void method2208(class318 arg0, int arg1) {
        field5366++;
        if (arg0.field5418 == 0) {
            return;
        }
        if (arg0.field5428 != -1 && arg0.field5428 < 32768) {
            class282 var2 = class173.field2906[arg0.field5428];
            if (var2 != null) {
                int var3 = arg0.field5409 - var2.field5409;
                int var4 = arg0.field5380 - var2.field5380;
                if (var3 != 0 || var4 != 0) {
                    arg0.field5421 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field5428 >= 32768) {
            int var5 = arg0.field5428 - 32768;
            if (class161.field2730 == var5) {
                var5 = 2047;
            }
            class234 var6 = class75.field1215[var5];
            if (var6 != null) {
                int var7 = arg0.field5409 - var6.field5409;
                int var8 = arg0.field5380 - var6.field5380;
                if (var7 != 0 || var8 != 0) {
                    arg0.field5421 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field5400 != 0 || arg0.field5383 != 0) && (arg0.field5424 == 0 || arg0.field5404 > 0)) {
            int var9 = arg0.field5380 - ((arg0.field5383 - class201.field3357 - class201.field3357) * 64);
            int var10 = arg0.field5409 - (arg0.field5400 - class15.field300 - class15.field300) * 64;
            if (var10 != 0 || var9 != 0) {
                arg0.field5421 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field5383 = 0;
            arg0.field5400 = 0;
        }
        int var11 = arg0.field5421 - arg0.field5406 & 0x7FF;
        if (var11 == 0) {
            arg0.field5435 = 0;
        } else {
            arg0.field5435++;
            if (var11 > 1024) {
                arg0.field5406 -= arg0.field5418;
                boolean var12 = true;
                if (arg0.field5418 > var11 || (2048 - arg0.field5418) < var11) {
                    arg0.field5406 = arg0.field5421;
                    var12 = false;
                }
                if (arg0.field5429 == arg0.field5398 && (arg0.field5435 > 25 || var12)) {
                    if (arg0.field5433 == -1) {
                        arg0.field5429 = arg0.field5372;
                    } else {
                        arg0.field5429 = arg0.field5433;
                    }
                }
            } else {
                arg0.field5406 += arg0.field5418;
                boolean var13 = true;
                if (var11 < arg0.field5418 || 2048 - arg0.field5418 < var11) {
                    arg0.field5406 = arg0.field5421;
                    var13 = false;
                }
                if (arg0.field5429 == arg0.field5398 && (arg0.field5435 > 25 || var13)) {
                    if (arg0.field5370 == -1) {
                        arg0.field5429 = arg0.field5372;
                    } else {
                        arg0.field5429 = arg0.field5370;
                    }
                }
            }
            arg0.field5406 &= 0x7FF;
        }
        if (arg1 > -61) {
            method2209(false, (class146) null, 114, (class146) null);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLok;ILok;)V", line = 129)
    public static final void method2209(boolean arg0, class146 arg1, int arg2, class146 arg3) {
        class71.method529(arg3, arg2, 140, -1, arg1, (class146) null);
        if (!arg0) {
            field5362++;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[I", line = 146)
    public final int[] method38(int arg0, byte arg1) {
        field5359++;
        if (arg1 > -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 97);
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, this.field5364 ? class259.field4297 - arg0 : arg0);
            if (this.field5369) {
                for (int var5 = 0; var5 < class98.field1598; var5++) {
                    var3[var5] = var4[class218.field3595 - var5];
                }
            } else {
                class244.method1765(var4, 0, var3, 0, class98.field1598);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lwe;II)V", line = 193)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field5369 = arg0.method368(arg1 ^ 0x84E) == 1;
        } else if (arg2 == 1) {
            this.field5364 = arg0.method368(42) == 1;
        } else if (arg2 == 2) {
            this.field4365 = arg0.method368(112) == 1;
        }
        if (arg1 != 2048) {
            method2209(true, (class146) null, 86, (class146) null);
        }
        field5361++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[BI)Lok;", line = 229)
    public static final class146 method2210(int arg0, int arg1, byte[] arg2, int arg3) {
        field5363++;
        class146 var4 = new class146();
        var4.field2462 = new byte[arg1];
        var4.field2461 = 0;
        if (arg0 != 1) {
            field5367 = (Thread) null;
        }
        for (int var5 = arg3; var5 < (arg1 + arg3); var5++) {
            if (arg2[var5] != 0) {
                var4.field2462[var4.field2461++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(I)V", line = 265)
    public static void method2211(int arg0) {
        field5367 = null;
        field5365 = null;
        field5358 = null;
        field5356 = null;
        field5357 = null;
        int var1 = -11 % ((41 - arg0) / 48);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[[I", line = 281)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != 7) {
            method2211(-21);
        }
        field5360++;
        int[][] var3 = this.field4347.method536(arg1, arg0 ^ 0x1007);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, this.field5364 ? class259.field4297 - arg1 : arg1, arg0 + 100);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field5369) {
                for (int var11 = 0; var11 < class98.field1598; var11++) {
                    var7[var11] = var5[class218.field3595 - var11];
                    var9[var11] = var6[class218.field3595 - var11];
                    var10[var11] = var8[class218.field3595 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class98.field1598; var12++) {
                    var7[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 344)
    public class316() {
        super(1, false);
    }
}
