import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class100 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1510 = "flash1:";

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
    public static int[] field1497 = new int[25];

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILqf;Lqf;IIIIJ)V", line = 5)
    public static final void method872(int arg0, int arg1, int arg2, int arg3, class64 arg4, class64 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class280 var12 = new class280();
        var12.field4325 = arg10;
        var12.field4320 = arg1 * 128 + 64;
        var12.field4329 = arg2 * 128 + 64;
        var12.field4327 = arg3;
        var12.field4319 = arg4;
        var12.field4317 = arg5;
        var12.field4323 = arg6;
        var12.field4326 = arg7;
        var12.field4328 = arg8;
        var12.field4318 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class170.field2689[var13][arg1][arg2] == null) {
                class170.field2689[var13][arg1][arg2] = new class329(var13, arg1, arg2);
            }
        }
        class170.field2689[arg0][arg1][arg2].field5065 = var12;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 33)
    public static final void method873(int arg0) {
        class333.method2346();
        class138.field2284 = new class182[8];
        field1512++;
        class138.field2284[1] = new class180();
        class138.field2284[2] = new class265();
        if (arg0 < 93) {
            return;
        }
        class138.field2284[3] = new class272();
        class138.field2284[4] = new class275();
        class138.field2284[5] = new class283();
        class138.field2284[6] = new class21();
        class138.field2284[7] = new class105();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V", line = 52)
    public static final void method874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 54) {
            method876(-106);
        }
        field1506++;
        for (int var5 = 0; var5 < class362.field5732; var5++) {
            if (arg2 < (class188.field2958[var5] + class236.field3677[var5]) && (arg1 + arg2) > class188.field2958[var5] && arg3 < (class91.field1390[var5] + class212.field3299[var5]) && class212.field3299[var5] < (arg3 + arg4)) {
                class349.field5544[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V", line = 82)
    public static final void method875(int arg0, int arg1) {
        field1514++;
        class138 var2 = class149.method1242(arg0, 0, arg1);
        var2.method1152(124);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 93)
    public static void method876(int arg0) {
        field1510 = null;
        field1497 = null;
        if (arg0 != 8) {
            field1497 = (int[]) null;
        }
    }
}
