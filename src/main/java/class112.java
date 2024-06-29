import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class112 {

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field1396 = 2048;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field1393 = 2048;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field1399 = 0;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field1404 = 0;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1394 = "slide:";

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1405 = 0;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Laj;")
    public static class70 field1400 = new class70();

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Z")
    public static boolean field1407 = false;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Ls;")
    public static class380 field1408;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILtq;I)V")
    public final void method595(int arg0, class250 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1350(arg2 ^ 0x4588);
            if (var4 == 0) {
                field1397++;
                if (arg2 != 16383) {
                    this.method595(11, (class250) null, -32);
                    return;
                }
                return;
            }
            this.method596(arg0, var4, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILtq;)V")
    private final void method596(int arg0, int arg1, int arg2, class250 arg3) {
        if (arg1 == 1) {
            this.field1404 = arg3.method1350(31351);
        } else if (arg1 == 2) {
            this.field1396 = arg3.method1374(-2);
        } else if (arg1 == 3) {
            this.field1393 = arg3.method1374(-2);
        } else if (arg1 == 4) {
            this.field1399 = arg3.method1366((byte) -112);
        }
        field1401++;
        if (arg2 != 0) {
            this.method596(-102, -72, -54, (class250) null);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static void method597(boolean arg0) {
        field1394 = null;
        field1400 = null;
        if (arg0) {
            method600((class419) null, -9);
        }
        field1408 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3) {
        field1403++;
        int var4 = class160.field2062 * arg0 >> 8;
        if (arg3 != 0) {
            field1407 = false;
        }
        if (var4 != 0 && arg1 != -1) {
            class319.method1840(14652, class125.field1599, var4, arg1, false, 0);
            class41.field431 = true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)V")
    public static final void method599(int arg0, byte arg1, int arg2) {
        field1402++;
        class68.field715 = arg0 - class443.field6469;
        class428.field6284 = arg2 - class443.field6479;
        if (arg1 >= 0) {
            method598(-42, 83, -15, -8);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Llo;I)I")
    public static final int method600(class419 arg0, int arg1) {
        field1398++;
        if (arg0.field6070 == 0) {
            return 0;
        }
        if (arg0.field6024 != -1 && arg0.field6024 < 32768) {
            class91 var2 = class38.field397[arg0.field6024];
            if (var2 != null) {
                int var3 = arg0.field152 - var2.field152;
                int var4 = arg0.field154 - var2.field154;
                if (var3 != 0 || var4 != 0) {
                    arg0.method2612(4, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0.field6024 >= 32768) {
            int var5 = arg0.field6024 - 32768;
            if (class324.field4325 == var5) {
                var5 = 2047;
            }
            class158 var6 = class85.field957[var5];
            if (var6 != null) {
                int var7 = arg0.field152 - var6.field152;
                int var8 = arg0.field154 - var6.field154;
                if (var7 != 0 || var8 != 0) {
                    arg0.method2612(4, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0.field6099 != 0 || arg0.field6023 != 0) && (arg0.field6111 == 0 || arg0.field6112 > 0)) {
            int var9 = arg0.field152 - (arg0.field6099 - class70.field767 - class70.field767) * 64;
            int var10 = arg0.field154 - (arg0.field6023 - class291.field3961 - class291.field3961) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.method2612(4, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF);
            }
            arg0.field6099 = 0;
            arg0.field6023 = 0;
        }
        if (arg1 != -32769) {
            field1400 = null;
        }
        return arg0.method2607(13924);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V")
    public static final void method601(int arg0, boolean arg1, int arg2) {
        field1406++;
        class40 var3 = class162.method872(arg2, (byte) 92, 7);
        if (arg1) {
            field1394 = null;
        }
        var3.method190(0);
        var3.field418 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public static final void method602(boolean arg0) {
        class114 var1 = class330.field4399;
        synchronized (class330.field4399) {
            class330.field4399.method613(arg0);
        }
        field1395++;
        class114 var2 = class376.field5277;
        synchronized (class376.field5277) {
            class376.field5277.method613(true);
        }
        class131 var3 = class119.field1482;
        synchronized (class119.field1482) {
            class119.field1482.method703((byte) -32);
        }
    }
}
