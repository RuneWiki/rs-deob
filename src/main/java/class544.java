import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class544 {

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "Lqc;")
    private class325 field8129 = new class325(256);

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "Ldda;")
    private class597 field8125;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "[I")
    public static int[] field8127 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
    public static final void method3193(int arg0, int arg1, int arg2) {
        field8124++;
        if ((class113.field1433 > class113.field1426)) {
            class113.field1426 = (float) ((double) class113.field1426 / 30.0D + (double) class113.field1426);
            if (class113.field1426 > class113.field1433) {
                class113.field1426 = class113.field1433;
            }
            class424.method2511(-1);
            class113.field1430 = (int) class113.field1426 >> 1;
            class113.field1427 = class604.method3514(0, class113.field1430);
        } else if (class113.field1426 > class113.field1433) {
            class113.field1426 = (float) ((double) class113.field1426 - (double) class113.field1426 / 30.0D);
            if (class113.field1433 > class113.field1426) {
                class113.field1426 = class113.field1433;
            }
            class424.method2511(-1);
            class113.field1430 = (int) class113.field1426 >> 1;
            class113.field1427 = class604.method3514(arg1, class113.field1430);
        }
        if (~class53.field639 != arg1 && class17.field147 != -1) {
            int var3 = class53.field639 - class296.field4338;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class17.field147 - class527.field7824;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class296.field4338 -= -var3;
            if (var3 == 0 && var4 == 0) {
                class53.field639 = -1;
                class17.field147 = -1;
            }
            class527.field7824 += var4;
            class424.method2511(arg1 - 1);
        }
        if (class59.field710 > 0) {
            class181.field2785--;
            if (class181.field2785 == 0) {
                class59.field710--;
                class181.field2785 = 100;
            }
        } else {
            class535.field7925 = -1;
            class467.field6744 = -1;
        }
        if (!class582.field8560 || class34.field391 == null) {
            return;
        }
        for (class328 var5 = (class328) class34.field391.method2496((byte) -120); var5 != null; var5 = (class328) class34.field391.method2494(49)) {
            class42 var6 = class113.field1420.method1213(var5.field4845.field5633, 6);
            if (var5.method2045(arg0, Integer.MAX_VALUE, arg2)) {
                if (var6.field496 != null) {
                    if (var6.field496[4] != null) {
                        class436.method2670((long) var5.field4845.field5633, -1, 1007, 0, true, (byte) -5, var6.field496[4], var6.field470, var6.field513, -1, false);
                    }
                    if (var6.field496[3] != null) {
                        class436.method2670((long) var5.field4845.field5633, -1, 1003, 0, true, (byte) -5, var6.field496[3], var6.field470, var6.field513, -1, false);
                    }
                    if (var6.field496[2] != null) {
                        class436.method2670((long) var5.field4845.field5633, -1, 1004, 0, true, (byte) -5, var6.field496[2], var6.field470, var6.field513, -1, false);
                    }
                    if (var6.field496[1] != null) {
                        class436.method2670((long) var5.field4845.field5633, -1, 1009, 0, true, (byte) -5, var6.field496[1], var6.field470, var6.field513, -1, false);
                    }
                    if (var6.field496[0] != null) {
                        class436.method2670((long) var5.field4845.field5633, -1, 1008, 0, true, (byte) -5, var6.field496[0], var6.field470, var6.field513, -1, false);
                    }
                }
                if (!var5.field4845.field5637) {
                    var5.field4845.field5637 = true;
                    class330.method2078(class451.field6588, var5.field4845.field5633, var6.field470);
                }
                if (var5.field4845.field5637) {
                    class330.method2078(class404.field5802, var5.field4845.field5633, var6.field470);
                }
            } else if (var5.field4845.field5637) {
                var5.field4845.field5637 = false;
                class330.method2078(class627.field9191, var5.field4845.field5633, var6.field470);
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)V")
    public final void method3194(int arg0, int arg1) {
        class325 var3 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method2028(arg0, true);
            if (arg1 >= -53) {
                this.method3199(-42);
            }
        }
        field8126++;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)Ljn;")
    public final class490 method3195(int arg0, byte arg1) {
        field8130++;
        if (arg1 >= -82) {
            return null;
        }
        class325 var3 = this.field8129;
        class490 var4;
        synchronized (this.field8129) {
            var4 = (class490) this.field8129.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field8125;
        byte[] var6;
        synchronized (this.field8125) {
            var6 = this.field8125.method3486((byte) -83, arg0, 26);
        }
        class490 var7 = new class490();
        if (var6 != null) {
            var7.method2966((byte) 94, new class428(var6));
        }
        class325 var8 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
    public static void method3196(byte arg0) {
        if (arg0 == -16) {
            field8127 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public final void method3197(int arg0) {
        field8122++;
        class325 var2 = this.field8129;
        synchronized (this.field8129) {
            this.field8129.method2037(true);
            if (arg0 != -1) {
                field8127 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)I")
    public static final int method3198(int arg0, int arg1, int arg2) {
        field8123++;
        if (arg2 == 256) {
            return arg0 == 4 || arg0 == 5 ? class234.field3442[arg1 & 0x3] : 256;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
    public final void method3199(int arg0) {
        class325 var2 = this.field8129;
        synchronized (this.field8129) {
            if (arg0 != 1003) {
                return;
            }
            this.field8129.method2024((byte) -78);
        }
        field8128++;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class544(class559 arg0, int arg1, class597 arg2) {
        this.field8125 = arg2;
        this.field8125.method3462(26, 77);
    }
}
