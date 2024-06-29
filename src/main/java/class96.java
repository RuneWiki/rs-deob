import jaggl.memory.NativeBuffer;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class96 extends class236 implements class253 {

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lak;")
    public static class234 field1379 = new class234("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1384 = -1;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lkd;I[BI)V")
    public class96(class188 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1383 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public static void method778(int arg0) {
        field1379 = null;
        int var1 = -73 % ((34 - arg0) / 63);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILpj;I)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, class101 arg4, int arg5) {
        ++field1385;
        if (~arg4.field1436 != 0 || arg4.field1448 != null) {
            int var6 = 0;
            int var7 = class193.field3258.field7218 * arg4.field1441 >> 8;
            if (arg4.field1442 >= arg1) {
                if (~arg4.field1451 < ~arg1) {
                    var6 += -arg1 + arg4.field1451;
                }
            } else {
                var6 += arg1 - arg4.field1442;
            }
            if (arg4.field1450 < arg5) {
                var6 += -arg4.field1450 + arg5;
            } else if (~arg4.field1433 < ~arg5) {
                var6 += -arg5 + arg4.field1433;
            }
            if (arg4.field1438 != 0 && var6 - 64 <= arg4.field1438 && class193.field3258.field7218 != 0 && arg4.field1440 == arg3) {
                var6 -= 64;
                if (arg0 < ~var6) {
                    var6 = 0;
                }
                int var8 = (arg4.field1438 - var6) * var7 / arg4.field1438;
                if (arg4.field1443 == null) {
                    if (~arg4.field1436 <= -1) {
                        class535 var9 = class535.method3172(class338.field5040, arg4.field1436, 0);
                        if (var9 != null) {
                            class79 var10 = var9.method3170().method676(class180.field2705);
                            class392 var11 = class392.method2442(var10, 100, var8);
                            var11.method2454(-1);
                            class359.field5328.method392(var11);
                            arg4.field1443 = var11;
                        }
                    }
                } else {
                    arg4.field1443.method2452(var8);
                }
                if (arg4.field1454 != null) {
                    arg4.field1454.method2452(var8);
                    if (!arg4.field1454.method2674(26931)) {
                        arg4.field1454 = null;
                        return;
                    }
                } else {
                    if (arg4.field1448 == null || ~(arg4.field1452 -= arg2) < -1) {
                        return;
                    }
                    int var12 = (int) (Math.random() * (double) arg4.field1448.length);
                    class535 var13 = class535.method3172(class338.field5040, arg4.field1448[var12], 0);
                    if (var13 == null) {
                        return;
                    }
                    class79 var14 = var13.method3170().method676(class180.field2705);
                    class392 var15 = class392.method2442(var14, 100, var8);
                    var15.method2454(0);
                    class359.field5328.method392(var15);
                    arg4.field1454 = var15;
                    arg4.field1452 = arg4.field1457 - -((int) ((double) (-arg4.field1457 + arg4.field1445) * Math.random()));
                }
            } else {
                if (arg4.field1443 != null) {
                    class359.field5328.method385(arg4.field1443);
                    arg4.field1443 = null;
                }
                if (arg4.field1454 != null) {
                    class359.field5328.method385(arg4.field1454);
                    arg4.field1454 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)I")
    public final int method780(boolean arg0) {
        if (!arg0) {
            return -76;
        } else {
            ++field1380;
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIZ)V")
    public final void method781(byte[] arg0, int arg1, int arg2, boolean arg3) {
        this.method1639(arg0, arg1);
        if (arg3) {
            this.field1383 = 0;
        }
        ++field1376;
        this.field1383 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
    public final int method782(int arg0) {
        if (arg0 != -10485) {
            return 109;
        } else {
            ++field1381;
            return this.field1383;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lkd;ILjaggl/memory/NativeBuffer;)V")
    public class96(class188 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field1383 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
    public static final int method783(byte arg0) {
        ++field1386;
        if (arg0 != 99) {
            field1384 = -106;
        }
        class38 var1 = class377.field5692;
        boolean var2 = false;
        if (~field1384 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class38.method303((class279) null, 0, (class352) null, var3, (byte) 70, 0);
            var2 = true;
        }
        long var4 = class493.method2937(-101);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method285(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class493.method2937(-121));
        var1.method364(0, 1, -16777216, 100, 0, 100);
        if (var2) {
            var1.method305(-26760);
        }
        return var7;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)J")
    public final long method784(int arg0) {
        ++field1382;
        if (arg0 != 17555) {
            this.field1383 = -118;
        }
        return super.field3795.method2717();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILuq;ILma;IJIII)V")
    public static final void method785(int arg0, class114 arg1, int arg2, class10 arg3, int arg4, long arg5, int arg6, int arg7, int arg8) {
        ++field1378;
        int var10 = arg4 * arg4 + arg8 * arg8;
        if (arg5 >= (long) var10) {
            if (arg7 > -24) {
                field1379 = null;
            }
            int var11 = Math.min(arg1.field1642 / 2, arg1.field1627 / 2);
            if (var10 > var11 * var11) {
                var11 -= 10;
                int var12;
                if (~class176.field2611 == -5) {
                    var12 = (int) class473.field6830 & 16383;
                } else {
                    var12 = 16383 & (int) class473.field6830 - -class162.field2414;
                }
                int var13 = class281.field4278[var12];
                int var14 = class281.field4279[var12];
                if (~class176.field2611 != -5) {
                    var14 = var14 * 256 / (class4.field23 - -256);
                    var13 = var13 * 256 / (class4.field23 + 256);
                }
                int var15 = arg8 * var13 - -(arg4 * var14) >> 15;
                int var16 = arg8 * var14 + -(arg4 * var13) >> 15;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class425.field6324[arg6].method128((float) arg1.field1642 / 2.0F + (float) arg0 + (float) var19, (float) arg1.field1627 / 2.0F + (float) arg2 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            } else {
                class283.method1839(class366.field5393[arg6], arg0, arg2, arg8, arg4, arg1, arg3, -23);
            }
        }
    }
}
