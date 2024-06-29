import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class105 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ljc;")
    public static class305 field1414 = new class305("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1416 = -1;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lho;")
    public static class103 field1415 = new class103(27, 4);

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lsr;")
    public static class167 field1417 = new class167();

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method635(byte arg0) {
        field1415 = null;
        field1414 = null;
        if (arg0 >= 110) {
            field1417 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static final void method636(byte arg0) {
        field1409++;
        if (arg0 < 48) {
            method635((byte) -105);
        }
        for (class397 var1 = (class397) class116.field1514.method970(12); var1 != null; var1 = (class397) class116.field1514.method976((byte) 75)) {
            class417 var2 = var1.field5790;
            if (class210.field2808 != var2.field3695 || var2.field6041 < class532.field7836) {
                var1.method2674(true);
                var2.method2576(5591);
            } else if (var2.field6029 <= class532.field7836) {
                if (var2.field6061 > 0) {
                    class22 var3 = class339.field4484[var2.field6061 - 1];
                    if (var3 != null && var3.field3704 >= 0 && class308.field4128 * 128 > var3.field3704 && var3.field3694 >= 0 && class426.field6200 * 128 > var3.field3694) {
                        var2.method2579(class532.field7836, var3.field3704, class470.method2868(-59, var2.field3695, var3.field3704, var3.field3694) - var2.field6039, var3.field3694, (byte) -104);
                    }
                }
                if (var2.field6061 < 0) {
                    int var4 = -var2.field6061 - 1;
                    class531 var5;
                    if (class308.field4121 == var4) {
                        var5 = class96.field1170;
                    } else {
                        var5 = class29.field272[var4];
                    }
                    if (var5 != null && var5.field3704 >= 0 && var5.field3704 < (class308.field4128 * 128) && var5.field3694 >= 0 && var5.field3694 < (class426.field6200 * 128)) {
                        var2.method2579(class532.field7836, var5.field3704, class470.method2868(-85, var2.field3695, var5.field3704, var5.field3694) - var2.field6039, var5.field3694, (byte) -70);
                    }
                }
                var2.method2575(class123.field1594, (byte) 111);
                class279.method1691(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)V")
    public abstract void method637(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public abstract void method638(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(III)V")
    public class105(int arg0, int arg1, int arg2) {
        this.field1411 = arg1;
        this.field1413 = arg2;
        this.field1412 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I")
    public static final int method639(int arg0, int arg1) {
        field1410++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else {
            if (arg0 >= -37) {
                field1416 = -127;
            }
            if (arg1 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
    public abstract void method640(int arg0, int arg1, int arg2);
}
