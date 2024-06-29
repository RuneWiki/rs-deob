import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class185 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "S")
    public short field2420;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Z")
    public boolean field2421;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "S")
    public short field2417;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "S")
    public short field2416;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "B")
    public byte field2430;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "B")
    public byte field2419;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lhb;")
    public static class250 field2424 = new class250(10, 2);

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
    public static int[] field2428 = new int[2048];

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[[I")
    public static int[][] field2426 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljd;")
    public static class408 field2429 = new class408(0, 2, 2, 1);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[F")
    public static float[] field2431 = new float[4];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZII)V")
    public static final void method1223(int arg0, boolean arg1, int arg2, int arg3) {
        field2418++;
        if (arg3 == 0) {
            class168.field2187++;
            class420.method2472((byte) -101, class477.field6968);
        }
        if (arg3 == 1) {
            class420.method2472((byte) -101, class4.field36);
            class61.field800++;
        }
        class319.field4112.method565(112, class439.field6113.method1488((byte) 69, 82) ? 1 : 0);
        class319.field4112.method560(false, class35.field545 + arg2);
        class319.field4112.method566(-12633, class336.field4299 + arg0);
        class403.field5425 = false;
        class138.field1847 = arg0;
        class429.field5919 = arg2;
        class167.method1119(arg1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Leo;I)V")
    public static final void method1224(class423 arg0, int arg1) {
        field2427++;
        if (!class515.field7573) {
            return;
        }
        if (arg0.field5755 != null) {
            class423 var2 = class520.method3091(class172.field2229, (byte) 126, class206.field2687);
            if (var2 != null) {
                class195 var3 = new class195();
                var3.field2516 = arg0;
                var3.field2523 = arg0.field5755;
                var3.field2518 = var2;
                class490.method2928(var3);
            }
        }
        class147.field1955++;
        class420.method2472((byte) -101, class115.field1628);
        class319.field4112.method572(-115, arg0.field5734);
        class319.field4112.method609(class206.field2687, -107);
        class319.field4112.method607(23, class172.field2229);
        class319.field4112.method606(class315.field4065, (byte) -90);
        int var4 = 126 / ((-arg1 - 46) / 46);
        class319.field4112.method609(arg0.field5763, -126);
        class319.field4112.method606(arg0.field5756, (byte) -105);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1225(int arg0, int arg1, boolean arg2) {
        field2423++;
        if (arg2) {
            field2426 = null;
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)Llb;")
    public final class185 method1226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2425++;
        return arg1 == 0 ? new class185(arg0, arg4, arg2, arg3, this.field2420, this.field2417, this.field2416, this.field2419, this.field2430, this.field2421) : null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field2420 = (short) arg4;
        this.field2421 = arg9;
        this.field2417 = (short) arg5;
        this.field2416 = (short) arg6;
        this.field2422 = arg0;
        this.field2430 = (byte) arg8;
        this.field2419 = (byte) arg7;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field2428 = null;
        if (arg0 < -92) {
            field2426 = null;
            field2429 = null;
            field2424 = null;
            field2431 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILnm;Lnm;)V")
    public static final void method1228(int arg0, int arg1, int arg2, class270 arg3, class270 arg4) {
        class510 var5 = class478.method2870(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7499 = arg3;
            var5.field7502 = arg4;
        }
    }
}
