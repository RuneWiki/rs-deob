import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class268 {

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public int field3546 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field3545 = 0;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lfc;")
    private class262 field3553 = new class262(64);

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Laia;")
    private class230 field3557 = null;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lni;")
    private class522 field3556;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lni;")
    private class522 field3549;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lkt;")
    public static class159 field3544 = new class159(1);

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3551 = new Rectangle[100];

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field3550 = 1;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lkba;")
    public static class108 field3555 = new class108();

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "J")
    public static long field3559 = 1L;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lhda;")
    public static class750 field3558 = new class750(5, 1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lem;I)V")
    public static final void method1602(class227 arg0, int arg1) {
        field3547++;
        if (class83.field1156) {
            return;
        }
        arg0.method315(87);
        if (arg1 != -32612) {
            method1607(110);
        }
        class43.field470--;
        if (!arg0.field2947) {
            long var2 = arg0.field2949;
            class756 var4;
            for (var4 = (class756) class513.field6948.method2552(var2, -1); var4 != null && !var4.field10550.equals(arg0.field2950); var4 = (class756) class513.field6948.method2555(125)) {
            }
            if (var4 != null && var4.method4207((byte) -105, arg0)) {
                class23.method88(var4, (byte) 87);
                return;
            }
            return;
        }
        for (class756 var5 = (class756) class526.field7066.method2348(-1); var5 != null; var5 = (class756) class526.field7066.method2343(0)) {
            if (var5.field10550.equals(arg0.field2950)) {
                boolean var6 = false;
                for (class227 var7 = (class227) var5.field10553.method2348(-1); var7 != null; var7 = (class227) var5.field10553.method2343(0)) {
                    if (arg0 == var7) {
                        if (var5.method4207((byte) -125, arg0)) {
                            class23.method88(var5, (byte) 87);
                        }
                        var6 = true;
                        break;
                    }
                }
                if (var6) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lgj;")
    public final class634 method1603(int arg0, int arg1) {
        field3548++;
        class634 var3 = (class634) this.field3553.method1571(-125, (long) arg0);
        if (arg1 <= 31) {
            this.method1604(null, null, (byte) 46, -3L);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3549.method2885(arg0 & 0x7FFF, 1, false);
        } else {
            var4 = this.field3556.method2885(arg0, 1, false);
        }
        class634 var5 = new class634();
        var5.field8814 = this;
        if (var4 != null) {
            var5.method3571((byte) -89, new class611(var4));
        }
        if (arg0 >= 32768) {
            var5.method3562((byte) -123);
        }
        this.field3553.method1574((long) arg0, var5, (byte) -80);
        return var5;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lvea;[IBJ)Ljava/lang/String;")
    public final String method1604(class276 arg0, int[] arg1, byte arg2, long arg3) {
        field3542++;
        int var6 = -32 % ((arg2 + 41) / 46);
        if (this.field3557 != null) {
            String var7 = this.field3557.method534(17438, arg3, arg0, arg1);
            if (var7 != null) {
                return var7;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILgaa;B)V")
    public static final void method1605(int arg0, class300 arg1, byte arg2) {
        field3552++;
        if (class635.field8835 >= 50 || arg1 == null || arg1.field4046 == null || arg1.field4046.length <= arg0 || arg1.field4046[arg0] == null) {
            return;
        }
        int var3 = arg1.field4046[arg0][0];
        int var4 = var3 >> 8;
        if (arg1.field4046[arg0].length > 1) {
            int var5 = (int) (Math.random() * (double) arg1.field4046[arg0].length);
            if (var5 > 0) {
                var4 = arg1.field4046[arg0][var5];
            }
        }
        int var6 = (var3 & 0xF6) >> 5;
        int var7 = 60 / ((arg2 - 16) / 45);
        int var8 = 256;
        if (arg1.field4031 != null && arg1.field4038 != null) {
            var8 = class358.method2059(arg1.field4031[arg0], arg1.field4038[arg0], 52);
        }
        if (arg1.field4034) {
            class595.method3297(-1962608884, 255, var6, var4, false, 0, var8);
        } else {
            class728.method4083(var8, (byte) 1, var4, var6, 0, 255);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIILqfa;)V")
    public static final void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, class101 arg5) {
        field3554++;
        if (arg5.field1329 == -1 && arg5.field1327 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg5.field1358 * class11.field68.field5516.method750((byte) 124) >> 8;
        if (arg3 > arg5.field1345) {
            var6 += arg3 - arg5.field1345;
        } else if (arg3 < arg5.field1351) {
            var6 += arg5.field1351 - arg3;
        }
        if (arg5.field1335 < arg0) {
            var6 += arg0 - arg5.field1335;
        } else if (arg5.field1347 > arg0) {
            var6 += arg5.field1347 - arg0;
        }
        if (arg5.field1350 == 0 || var6 - 256 > arg5.field1350 || class11.field68.field5516.method750((byte) 120) == 0 || arg5.field1340 != arg2) {
            if (arg5.field1354 != null) {
                class143.field1851.method2542(arg5.field1354);
                arg5.field1333 = null;
                arg5.field1354 = null;
                arg5.field1332 = null;
            }
            if (arg5.field1352 != null) {
                class143.field1851.method2542(arg5.field1352);
                arg5.field1330 = null;
                arg5.field1353 = null;
                arg5.field1352 = null;
            }
            return;
        }
        int var8 = var6 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5.field1350 - arg5.field1337;
        if (var9 < 0) {
            var9 = arg5.field1350;
        }
        int var10 = var7;
        int var11 = var8 - arg5.field1337;
        if (var11 > 0 && var9 > 0) {
            var10 = (var9 - var11) * var7 / var9;
        }
        class653.field9086.method543(arg1 - 256);
        int var12 = 8192;
        int var13 = (arg5.field1351 + arg5.field1345) / 2 - arg3;
        int var14 = (arg5.field1347 + arg5.field1335) / 2 - arg0;
        if (var13 != 0 || var14 != 0) {
            int var15 = -class710.field9907 - ((int) (Math.atan2((double) var13, (double) var14) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var15 > 8192) {
                var15 = 16384 - var15;
            }
            int var16;
            if (var8 <= 0) {
                var16 = 8192;
            } else if (var8 >= 4096) {
                var16 = 16384;
            } else {
                var16 = (var8 * 8192 / 4096) + 8192;
            }
            var12 = (16384 - var16 >> 1) + var15 * var16 / 8192;
        }
        if (arg5.field1354 != null) {
            arg5.field1354.method2626(var10);
            arg5.field1354.method2630(var12);
        } else if (arg5.field1329 >= 0) {
            int var17 = arg5.field1359 == 256 && arg5.field1344 == 256 ? 256 : class358.method2059(arg5.field1344, arg5.field1359, arg1 - 347);
            if (arg5.field1334) {
                if (arg5.field1332 == null) {
                    arg5.field1332 = class57.method326(class303.field4094, arg5.field1329);
                }
                if (arg5.field1332 != null) {
                    if (arg5.field1333 == null) {
                        arg5.field1333 = arg5.field1332.method321(new int[] { 22050 });
                    }
                    if (arg5.field1333 != null) {
                        class466 var21 = class466.method2601(arg5.field1333, var17, var10 << 6, var12);
                        var21.method2621(-1);
                        class143.field1851.method2539(var21);
                        arg5.field1354 = var21;
                    }
                }
            } else {
                class269 var18 = class269.method1609(class556.field7844, arg5.field1329, 0);
                if (var18 != null) {
                    class155 var19 = var18.method1611().method947(class108.field1427);
                    class466 var20 = class466.method2601(var19, var17, var10 << 6, var12);
                    var20.method2621(-1);
                    class143.field1851.method2539(var20);
                    arg5.field1354 = var20;
                }
            }
        }
        if (arg5.field1352 != null) {
            arg5.field1352.method2626(var10);
            arg5.field1352.method2630(var12);
            if (arg5.field1352.method314((byte) 78)) {
                return;
            }
            arg5.field1352 = null;
            arg5.field1353 = null;
            arg5.field1330 = null;
        } else if (arg5.field1327 != null && (arg5.field1341 -= arg4) <= 0) {
            int var22 = arg5.field1359 == 256 && arg5.field1344 == 256 ? 256 : arg5.field1344 + (int) (Math.random() * (double) (arg5.field1359 - arg5.field1344));
            if (arg5.field1348) {
                if (arg5.field1353 == null) {
                    int var23 = (int) (Math.random() * (double) arg5.field1327.length);
                    arg5.field1353 = class57.method326(class303.field4094, arg5.field1327[var23]);
                }
                if (arg5.field1353 != null) {
                    if (arg5.field1330 == null) {
                        arg5.field1330 = arg5.field1353.method321(new int[] { 22050 });
                    }
                    if (arg5.field1330 != null) {
                        class466 var24 = class466.method2601(arg5.field1330, var22, var10 << 6, var12);
                        var24.method2621(0);
                        class143.field1851.method2539(var24);
                        arg5.field1352 = var24;
                        arg5.field1341 = (int) (Math.random() * (double) (arg5.field1324 - arg5.field1339)) + arg5.field1339;
                        return;
                    }
                }
                return;
            }
            int var25 = (int) (Math.random() * (double) arg5.field1327.length);
            class269 var26 = class269.method1609(class556.field7844, arg5.field1327[var25], 0);
            if (var26 != null) {
                class155 var27 = var26.method1611().method947(class108.field1427);
                class466 var28 = class466.method2601(var27, var22, var10 << 6, var12);
                var28.method2621(0);
                class143.field1851.method2539(var28);
                arg5.field1341 = (int) ((double) (arg5.field1324 - arg5.field1339) * Math.random()) + arg5.field1339;
                arg5.field1352 = var28;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1607(int arg0) {
        field3555 = null;
        field3551 = null;
        field3544 = null;
        if (arg0 > -120) {
            method1605(-15, null, (byte) -55);
        }
        field3558 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        class262 var1 = class552.field7810;
        synchronized (class552.field7810) {
            if (arg0 != 1) {
                field3555 = null;
            }
            class552.field7810.method1563(arg0 + 30);
        }
        field3543++;
        class262 var2 = class407.field5741;
        synchronized (class407.field5741) {
            class407.field5741.method1563(16);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ILni;Lni;Laia;)V")
    public class268(int arg0, class522 arg1, class522 arg2, class230 arg3) {
        this.field3556 = arg1;
        this.field3557 = arg3;
        this.field3549 = arg2;
        if (this.field3556 != null) {
            this.field3545 = this.field3556.method2901(0, 1);
        }
        if (this.field3549 != null) {
            this.field3546 = this.field3549.method2901(0, 1);
        }
    }
}
