import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class480 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Ltq;")
    private class536 field6217 = new class536(64);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Ltq;")
    public class536 field6218 = new class536(64);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lwm;")
    public class30 field6202;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lwm;")
    private class30 field6210;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "[[Z")
    public static boolean[][] field6209 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
    public static boolean field6205 = false;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lgh;")
    public static class54 field6213 = new class54(14, 0, 4, 1);

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field6214 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method2689(boolean arg0, int arg1) {
        field6203++;
        class536 var3 = this.field6217;
        synchronized (this.field6217) {
            this.field6217.method2928(true, arg1);
        }
        class536 var4 = this.field6218;
        synchronized (this.field6218) {
            this.field6218.method2928(true, arg1);
        }
        if (arg0) {
            this.method2695((byte) 66);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V", line = 20)
    public final void method2690(int arg0, int arg1, int arg2) {
        this.field6217 = new class536(arg2);
        if (arg1 != -1) {
            method2691(-100);
        }
        field6216++;
        this.field6218 = new class536(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 34)
    public static void method2691(int arg0) {
        field6209 = null;
        field6213 = null;
        if (arg0 != -16099) {
            method2698(92, 12);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZZ)I", line = 46)
    public static final int method2692(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            field6214 = 33;
        }
        field6212++;
        class148 var4 = class398.method2306(arg1, arg2, (byte) 41);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field1884.length) {
            return var4.field1884[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ld;ILwm;)V", line = 66)
    public static final void method2693(class284 arg0, int arg1, class30 arg2) {
        field6204++;
        class477.field6188 = arg0;
        class400.field5300 = arg2;
        int var3 = -62 % ((arg1 - 19) / 42);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Lcia;", line = 78)
    public final class510 method2694(byte arg0, int arg1) {
        field6211++;
        class536 var3 = this.field6217;
        class510 var4;
        synchronized (this.field6217) {
            var4 = (class510) this.field6217.method2931((long) arg1, (byte) -112);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 73 / ((arg0 - 47) / 50);
        class30 var6 = this.field6210;
        byte[] var7;
        synchronized (this.field6210) {
            var7 = this.field6210.method139(34, (byte) -94, arg1);
        }
        class510 var8 = new class510();
        var8.field6508 = this;
        if (var7 != null) {
            var8.method2822(-771965842, new class234(var7));
        }
        class536 var9 = this.field6217;
        synchronized (this.field6217) {
            this.field6217.method2918((long) arg1, var8, 94);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 111)
    public final void method2695(byte arg0) {
        class536 var2 = this.field6217;
        synchronized (this.field6217) {
            this.field6217.method2919(0);
            if (arg0 != 115) {
                this.method2695((byte) 47);
            }
        }
        field6207++;
        class536 var3 = this.field6218;
        synchronized (this.field6218) {
            this.field6218.method2919(arg0 - 115);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 129)
    public final void method2696(boolean arg0) {
        field6201++;
        class536 var2 = this.field6217;
        synchronized (this.field6217) {
            this.field6217.method2932((byte) 80);
        }
        class536 var3 = this.field6218;
        synchronized (this.field6218) {
            if (arg0) {
                field6215 = 42;
            }
            this.field6218.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V", line = 158)
    public static final void method2697(byte arg0, boolean arg1) {
        field6208++;
        if (class252.field3437 != null) {
            class252.field3437.method1817(-125);
            class252.field3437 = null;
        }
        class203.field2816 = 0;
        class146.method836(0);
        class790.method4321();
        for (int var2 = 0; var2 < 4; var2++) {
            class179.field2391[var2].method1961((byte) -36);
        }
        class3.method9(64, false);
        System.gc();
        class417.method2409(true, 2);
        class136.field1797 = -1;
        class718.field9436 = false;
        class309.method1819(false);
        class64.method376(true, 1);
        class449.field5854 = 0;
        class133.field1765 = 0;
        class742.field10047 = 0;
        class240.field3293 = 0;
        class527.field6693 = 0;
        class714.field9407 = 0;
        int var3 = 61 % ((arg0 - 54) / 36);
        for (int var4 = 0; var4 < class589.field7475.length; var4++) {
            class589.field7475[var4] = null;
        }
        class656.method3578(2048);
        for (int var5 = 0; var5 < 2048; var5++) {
            class263.field3508[var5] = null;
        }
        class349.field4271 = 0;
        class444.field5811.method2617(28812);
        class750.field10228 = 0;
        class407.field5401.method2617(28812);
        class128.method755((byte) 124);
        class515.field6574 = 0;
        class381.field4705.method1468((byte) -37);
        class363.method2086(true);
        class21.method95(-65535);
        class232.field3124 = null;
        class719.field9456 = null;
        class278.field3619 = 0L;
        class235.field3214 = null;
        class299.field3795 = null;
        class412.field5466 = null;
        if (arg1) {
            class26.method113((byte) 95, 12);
            return;
        }
        class26.method113((byte) 95, 3);
        try {
            class586.method3137(8259, "loggedout", class80.field1134);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 240)
    public static final void method2698(int arg0, int arg1) {
        field6206++;
        class614 var2 = class497.method2759(arg1, 5977, (long) arg0);
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lega;ILwm;Lwm;)V", line = 274)
    public class480(class473 arg0, int arg1, class30 arg2, class30 arg3) {
        this.field6202 = arg3;
        this.field6210 = arg2;
        this.field6210.method138(0, 34);
    }
}
