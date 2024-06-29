import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class232 {

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "Lmt;")
    private class249 field3501 = new class249();

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    private int field3498;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "Lcp;")
    private class470 field3518;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "Lhl;")
    public static class339 field3513;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Lkj;")
    public static class366 field3503;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)I")
    public static final int method1471(int arg0, byte arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        if (arg1 != 23) {
            return -102;
        }
        field3510++;
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
    public final int method1472(byte arg0) {
        field3509++;
        if (arg0 >= -40) {
            this.method1479(-50, -53L);
        }
        return this.field3498;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method1473(Object arg0, long arg1, int arg2) {
        field3515++;
        int var5 = -83 / ((68 - arg2) / 42);
        this.method1481(arg1, 1, 671, arg0);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public static final void method1474(byte arg0) {
        field3500++;
        if (arg0 != 80) {
            method1471(-63, (byte) 51);
        }
        class100.field1282.method955(false);
        for (int var1 = 0; var1 < 32; var1++) {
            class377.field5433[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class141.field1882[var2] = 0L;
        }
        class201.field2963 = 0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method1475(int arg0) {
        if (arg0 != 0) {
            this.field3501 = null;
        }
        field3506++;
        for (class61 var2 = (class61) this.field3501.method1558(true); var2 != null; var2 = (class61) this.field3501.method1554(-11541)) {
            if (var2.method380((byte) -100)) {
                var2.method1510((byte) -13);
                var2.method1673((byte) 27);
                this.field3516 += var2.field809;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        field3513 = null;
        if (arg0 != 34) {
            method1474((byte) 95);
        }
        field3503 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1477(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3517++;
        class61 var2 = (class61) this.field3518.method2768((byte) -88);
        while (var2 != null) {
            Object var3 = var2.method381((byte) -46);
            if (var3 != null) {
                return var3;
            }
            class61 var4 = var2;
            var2 = (class61) this.field3518.method2768((byte) -88);
            var4.method1510((byte) -13);
            var4.method1673((byte) 27);
            this.field3516 += var2.field809;
        }
        return null;
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)V")
    public final void method1478(byte arg0) {
        if (arg0 >= -81) {
            this.field3501 = null;
        }
        field3499++;
        this.field3501.method1557(true);
        this.field3518.method2771(-5);
        this.field3516 = this.field3498;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1479(int arg0, long arg1) {
        if (arg0 != 0) {
            field3513 = null;
        }
        field3508++;
        class61 var4 = (class61) this.field3518.method2761(arg1, (byte) -112);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method381((byte) -60);
        if (var5 == null) {
            var4.method1510((byte) -13);
            var4.method1673((byte) 27);
            this.field3516 += var4.field809;
            return null;
        }
        if (var4.method380((byte) -125)) {
            class414 var6 = new class414(var5, var4.field809);
            this.field3518.method2767(-1, var4.field3568, var6);
            this.field3501.method1553(arg0 ^ 0xFFFFFF85, var6);
            var6.field3960 = 0L;
            var4.method1510((byte) -13);
            var4.method1673((byte) 27);
        } else {
            this.field3501.method1553(-97, var4);
            var4.field3960 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IJ)V")
    private final void method1480(int arg0, long arg1) {
        if (arg0 != 32) {
            this.method1483(-37);
        }
        field3511++;
        class61 var4 = (class61) this.field3518.method2761(arg1, (byte) -112);
        this.method1485(var4, (byte) 8);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(JIILjava/lang/Object;)V")
    private final void method1481(long arg0, int arg1, int arg2, Object arg3) {
        field3502++;
        if (arg1 > this.field3498) {
            throw new IllegalStateException("s>cs");
        }
        this.method1480(arg2 ^ 0x2BF, arg0);
        this.field3516 -= arg1;
        while (this.field3516 < 0) {
            class61 var7 = (class61) this.field3501.method1559(false);
            this.method1485(var7, (byte) 100);
        }
        class414 var6 = new class414(arg3, arg1);
        this.field3518.method2767(-1, arg0, var6);
        this.field3501.method1553(-94, var6);
        if (arg2 != 671) {
            this.method1473((Object) null, -108L, -83);
        }
        var6.field3960 = 0L;
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)I")
    public final int method1482(byte arg0) {
        if (arg0 != -76) {
            this.field3516 = 37;
        }
        field3504++;
        int var2 = 0;
        for (class61 var3 = (class61) this.field3501.method1558(true); var3 != null; var3 = (class61) this.field3501.method1554(arg0 - 11465)) {
            if (!var3.method380((byte) 44)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1483(int arg0) {
        field3507++;
        if (arg0 != 32) {
            method1476((byte) -103);
        }
        class61 var2 = (class61) this.field3518.method2769((byte) -102);
        while (var2 != null) {
            Object var3 = var2.method381((byte) -89);
            if (var3 != null) {
                return var3;
            }
            class61 var4 = var2;
            var2 = (class61) this.field3518.method2768((byte) -88);
            var4.method1510((byte) -13);
            var4.method1673((byte) 27);
            this.field3516 += var2.field809;
        }
        return null;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)I")
    public final int method1484(int arg0) {
        if (arg0 > -61) {
            method1474((byte) -2);
        }
        field3512++;
        return this.field3516;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ler;B)V")
    private final void method1485(class61 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method1510((byte) -13);
            arg0.method1673((byte) 27);
            this.field3516 += arg0.field809;
        }
        int var3 = -58 % ((-arg1 - 58) / 35);
        field3505++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
    public final void method1486(int arg0, int arg1) {
        field3514++;
        if (class314.field4442 != null) {
            for (class61 var3 = (class61) this.field3501.method1558(true); var3 != null; var3 = (class61) this.field3501.method1554(-11541)) {
                if (var3.method380((byte) 48)) {
                    if (var3.method381((byte) -60) == null) {
                        var3.method1510((byte) -13);
                        var3.method1673((byte) 27);
                        this.field3516++;
                    }
                } else if (((long) arg1) < (++var3.field3960)) {
                    class61 var4 = class314.field4442.method742(arg0 ^ 0x1A1D42F2, var3);
                    this.field3518.method2767(arg0 ^ 0xE5E2B5EF, var3.field3568, var4);
                    class337.method2120(1, var3, var4);
                    var3.method1510((byte) -13);
                    var3.method1673((byte) 27);
                }
            }
        }
        if (arg0 != 438127120) {
            method1471(96, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(I)V")
    public class232(int arg0) {
        this.field3498 = arg0;
        this.field3516 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3518 = new class470(var2);
    }
}
