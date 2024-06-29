import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class104 {

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Lot;")
    private class255 field1484 = new class255();

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Lsq;")
    private class454 field1478;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "Ltm;")
    public static class112 field1485 = new class112("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Lfn;")
    public static class52 field1499 = new class52(27, 7);

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "[I")
    public static int[] field1501 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "Z")
    public static boolean field1498;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJ)V", line = 4)
    private final void method651(int arg0, long arg1) {
        field1482++;
        class31 var4 = (class31) this.field1478.method2614(arg1, 30);
        int var5 = 45 / ((-arg0 - 80) / 38);
        this.method657(-15044, var4);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I", line = 16)
    public final int method652(byte arg0) {
        field1480++;
        int var2 = 0;
        if (arg0 > -41) {
            return -74;
        }
        for (class31 var3 = (class31) this.field1484.method1587(0); var3 != null; var3 = (class31) this.field1484.method1583((byte) -69)) {
            if (!var3.method245(-26199)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 43)
    public final void method653(int arg0, long arg1, Object arg2) {
        field1500++;
        this.method662(1, arg1, arg2, (byte) 2);
        if (arg0 <= 28) {
            method658(-68);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V", line = 54)
    public final void method654(boolean arg0) {
        field1479++;
        for (class31 var2 = (class31) this.field1484.method1587(0); var2 != null; var2 = (class31) this.field1484.method1583((byte) -69)) {
            if (var2.method245(-26199)) {
                var2.method1182(28818);
                var2.method738(-13002);
                this.field1477 += var2.field504;
            }
        }
        if (arg0) {
            field1498 = false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)I", line = 86)
    public final int method655(boolean arg0) {
        if (arg0) {
            field1493 = -23;
        }
        field1491++;
        return this.field1477;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 99)
    public final void method656(int arg0) {
        if (arg0 > 91) {
            this.field1484.method1586((byte) -25);
            field1487++;
            this.field1478.method2623((byte) -85);
            this.field1477 = this.field1481;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILuf;)V", line = 112)
    private final void method657(int arg0, class31 arg1) {
        field1497++;
        if (arg0 != -15044) {
            field1485 = null;
        }
        if (arg1 != null) {
            arg1.method1182(28818);
            arg1.method738(-13002);
            this.field1477 += arg1.field504;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 130)
    public static final void method658(int arg0) {
        field1494++;
        try {
            if (arg0 == 2 && class70.field1040 == 1) {
                int var1 = class224.field3181.method288((byte) -126);
                if (var1 > 0 && class224.field3181.method287(true)) {
                    int var2 = var1 - class351.field4802;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class224.field3181.method281(var2, -82);
                } else {
                    class224.field3181.method290((byte) 107);
                    class224.field3181.method268(2);
                    class255.field3573 = null;
                    if (class351.field4805 == null) {
                        class70.field1040 = 0;
                    } else {
                        class70.field1040 = 2;
                    }
                    class123.field1710 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class224.field3181.method290((byte) 107);
            class70.field1040 = 0;
            class351.field4805 = null;
            class123.field1710 = null;
            class255.field3573 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 178)
    public final Object method659(long arg0, byte arg1) {
        field1486++;
        class31 var4 = (class31) this.field1478.method2614(arg0, -110);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method248((byte) 121);
        if (var5 == null) {
            var4.method1182(28818);
            var4.method738(-13002);
            this.field1477 += var4.field504;
            return null;
        }
        if (arg1 != -1) {
            this.method653(116, 40L, (Object) null);
        }
        if (var4.method245(-26199)) {
            class374 var6 = new class374(var5, var4.field504);
            this.field1478.method2620(var4.field2608, var6, false);
            this.field1484.method1584(arg1 ^ 0xFFFFFFA8, var6);
            var6.field1649 = 0L;
            var4.method1182(28818);
            var4.method738(arg1 ^ 0x32C9);
        } else {
            this.field1484.method1584(80, var4);
            var4.field1649 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V", line = 223)
    public static void method660(byte arg0) {
        field1485 = null;
        if (arg0 != -109) {
            method663((class363) null, (byte) 35, (class487) null);
        }
        field1499 = null;
        field1501 = null;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)I", line = 238)
    public final int method661(int arg0) {
        if (arg0 != 19227) {
            this.method667((byte) 65);
        }
        field1488++;
        return this.field1481;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJLjava/lang/Object;B)V", line = 249)
    private final void method662(int arg0, long arg1, Object arg2, byte arg3) {
        int var6 = -2 % ((arg3 - 60) / 48);
        field1495++;
        if (arg0 > this.field1481) {
            throw new IllegalStateException("s>cs");
        }
        this.method651(-37, arg1);
        this.field1477 -= arg0;
        while (this.field1477 < 0) {
            class31 var8 = (class31) this.field1484.method1589(0);
            this.method657(-15044, var8);
        }
        class374 var7 = new class374(arg2, arg0);
        this.field1478.method2620(arg1, var7, false);
        this.field1484.method1584(79, var7);
        var7.field1649 = 0L;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V", line = 444)
    public class104(int arg0) {
        this.field1481 = arg0;
        this.field1477 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1478 = new class454(var2);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lms;BLkm;)V", line = 282)
    public static final void method663(class363 arg0, byte arg1, class487 arg2) {
        field1492++;
        boolean var3 = class58.field918.method346(arg0.field5175, (byte) 102, arg0.field5059 | 0xFF000000, arg0.field5063, arg2, arg0.field5182 ? class2.field21.field400 : null, arg0.field5071, arg0.field5195) == null;
        int var4 = 78 / ((-arg1 - 53) / 44);
        if (var3) {
            class55.field892.method1553((byte) -80, new class9(arg0.field5195, arg0.field5175, arg0.field5071, arg0.field5059 | 0xFF000000, arg0.field5063, arg0.field5182));
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 298)
    public final Object method664(byte arg0) {
        if (arg0 != 64) {
            this.field1477 = 69;
        }
        field1496++;
        class31 var2 = (class31) this.field1478.method2615((byte) -18);
        while (var2 != null) {
            Object var3 = var2.method248((byte) 108);
            if (var3 != null) {
                return var3;
            }
            class31 var4 = var2;
            var2 = (class31) this.field1478.method2619((byte) -98);
            var4.method1182(28818);
            var4.method738(-13002);
            this.field1477 += var2.field504;
        }
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BB)C", line = 330)
    public static final char method665(byte arg0, byte arg1) {
        field1483++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class480.field6793[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg1 < 47) {
            field1485 = null;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V", line = 358)
    public final void method666(int arg0, boolean arg1) {
        field1490++;
        if (class115.field1612 != null) {
            for (class31 var3 = (class31) this.field1484.method1587(0); var3 != null; var3 = (class31) this.field1484.method1583((byte) -69)) {
                if (var3.method245(-26199)) {
                    if (var3.method248((byte) 118) == null) {
                        var3.method1182(28818);
                        var3.method738(-13002);
                        this.field1477++;
                    }
                } else if (((long) arg0) < (++var3.field1649)) {
                    class31 var4 = class115.field1612.method678((byte) 77, var3);
                    this.field1478.method2620(var3.field2608, var4, arg1);
                    class475.method2796(var4, var3, 0);
                    var3.method1182(28818);
                    var3.method738(-13002);
                }
            }
        }
        if (arg1) {
            field1498 = false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 410)
    public final Object method667(byte arg0) {
        field1489++;
        class31 var2 = (class31) this.field1478.method2619((byte) -98);
        while (var2 != null) {
            Object var3 = var2.method248((byte) 119);
            if (var3 != null) {
                return var3;
            }
            class31 var4 = var2;
            var2 = (class31) this.field1478.method2619((byte) -98);
            var4.method1182(arg0 + 28842);
            var4.method738(-13002);
            this.field1477 += var2.field504;
        }
        if (arg0 != -24) {
            this.field1478 = null;
        }
        return null;
    }
}
