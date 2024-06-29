import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class117 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lwg;")
    private class58 field1477 = new class58(64);

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lwg;")
    public class58 field1483 = new class58(2);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lkr;")
    private class329 field1472;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lkr;")
    public class329 field1479;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Ljn;")
    public static class491 field1480 = new class491();

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[F")
    public static float[] field1482 = new float[4];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public final void method640(byte arg0) {
        field1476++;
        class58 var2 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method317((byte) 21);
            if (arg0 != 114) {
                this.field1477 = null;
            }
        }
        class58 var3 = this.field1483;
        synchronized (this.field1483) {
            this.field1483.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static final void method641(int arg0) {
        class377.field5286++;
        if (arg0 != -1) {
            method641(-91);
        }
        field1471++;
        class118.method650(true, class293.field3819);
        class272.field3457.method3042(class53.field706, -124);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lmh;")
    public final class145 method642(int arg0, int arg1) {
        field1478++;
        class58 var3 = this.field1477;
        class145 var4;
        synchronized (this.field1477) {
            var4 = (class145) this.field1477.method323((long) arg0, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field1472;
        byte[] var7;
        synchronized (this.field1472) {
            if (arg1 != -21629) {
                return null;
            }
            var7 = this.field1472.method2054(true, 33, arg0);
        }
        class145 var8 = new class145();
        var8.field1883 = this;
        if (var7 != null) {
            var8.method796(new class551(var7), false);
        }
        class58 var9 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method316((long) arg0, (byte) -126, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljq;II)I")
    public static final int method643(class447 arg0, int arg1, int arg2) {
        field1481++;
        if (!client.method3572(arg0).method2771(arg2 ^ arg2, arg1) && arg0.field6292 == null) {
            return -1;
        } else if (arg0.field6329 == null || arg0.field6329.length <= arg1) {
            return -1;
        } else {
            return arg0.field6329[arg1];
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lhda;B)I")
    public static final int method644(class245 arg0, byte arg1) {
        field1473++;
        String var2 = class247.method1515(-82, arg0);
        int[] var3 = null;
        if (class630.method3645(true, arg0.field3094)) {
            var3 = class98.field1307.method3391(0, (int) arg0.field3099).field6491;
        } else if (arg0.field3100 != -1) {
            var3 = class98.field1307.method3391(0, arg0.field3100).field6491;
        } else if (class17.method77(-30195, arg0.field3094)) {
            class480 var4 = (class480) class131.field1619.method3476((long) ((int) arg0.field3099), (byte) 28);
            if (var4 != null) {
                class585 var5 = var4.field6729;
                class626 var6 = var5.field8478;
                if (var6.field9085 != null) {
                    var6 = var6.method3607(false, class257.field3191);
                }
                if (var6 != null) {
                    var3 = var6.field9110;
                }
            }
        } else if (class318.method1981(15, arg0.field3094)) {
            Object var7 = null;
            class137 var8;
            if (arg0.field3094 == 1012) {
                var8 = class626.field9084.method1093(0, (int) arg0.field3099);
            } else {
                var8 = class626.field9084.method1093(0, (int) (arg0.field3099 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field1719 != null) {
                var8 = var8.method722(class257.field3191, -1);
            }
            if (var8 != null) {
                var3 = var8.field1702;
            }
        }
        if (var3 != null) {
            var2 = var2 + class66.method384((byte) 97, var3);
        }
        if (arg1 < 90) {
            return -102;
        }
        int var9 = class627.field9137.method853(var2, class106.field1370, 1);
        if (arg0.field3091) {
            var9 += class53.field708.method637() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public final void method645(byte arg0) {
        field1474++;
        if (arg0 != 86) {
            this.method640((byte) 30);
        }
        class58 var2 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method315(1);
        }
        class58 var3 = this.field1483;
        synchronized (this.field1483) {
            this.field1483.method315(arg0 ^ 0x57);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method646(int arg0, int arg1) {
        class58 var3 = this.field1477;
        synchronized (this.field1477) {
            this.field1477.method320(arg1, -306674912);
        }
        field1475++;
        class58 var4 = this.field1483;
        synchronized (this.field1483) {
            this.field1483.method320(arg1, -306674912);
        }
        if (arg0 != 897197984) {
            this.field1472 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static void method647(boolean arg0) {
        if (arg0) {
            field1480 = null;
            field1482 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lg;ILkr;Lkr;)V")
    public class117(class513 arg0, int arg1, class329 arg2, class329 arg3) {
        this.field1472 = arg2;
        this.field1479 = arg3;
        this.field1472.method2064(0, 33);
    }
}
