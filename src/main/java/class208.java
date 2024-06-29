import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class208 {

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Lqk;")
    public static class207 field3694 = class24.method212(255, "<br>");

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method1472(byte arg0) {
        if (arg0 < 103) {
            method1476((class256) null, -68, 100, -10);
        }
        field3694 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lmd;II)Lqk;")
    public static final class207 method1473(class220 arg0, int arg1, int arg2) {
        field3692++;
        if (arg2 >= -21) {
            field3694 = null;
        }
        if (!client.method1112(arg0).method827(arg1, -122) && arg0.field4057 == null) {
            return null;
        } else if (arg0.field3947 == null || arg0.field3947.length <= arg1 || arg0.field3947[arg1] == null || arg0.field3947[arg1].method1443(-27).method1450((byte) -120) == 0) {
            return class138.field2385 ? class105.method757(false, new class207[] { class58.field1074, class262.method1815(arg1, (byte) 51) }) : null;
        } else {
            return arg0.field3947[arg1];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZ)I")
    public static final int method1474(int arg0, int arg1, boolean arg2) {
        field3693++;
        class40 var3 = (class40) class177.field3194.method1867((long) arg1, arg2);
        if (!arg2) {
            field3694 = null;
        }
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field804.length; var5++) {
                if (var3.field810[var5] == arg0) {
                    var4 += var3.field804[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)[Luh;")
    public static final class100[] method1475(byte arg0) {
        class100[] var1 = new class100[class280.field4928];
        if (arg0 != 22) {
            method1476((class256) null, -23, 21, 51);
        }
        for (int var2 = 0; var2 < class280.field4928; var2++) {
            int var3 = class241.field4402[var2] * class107.field1895[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class185.field3286[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class243.field4421[class121.method860(var5[var6], 255)];
            }
            var1[var2] = new class139(class242.field4406, class230.field4224, class287.field5127[var2], class170.field3021[var2], class107.field1895[var2], class241.field4402[var2], var4);
        }
        class116.method821((byte) -123);
        field3691++;
        return var1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lka;III)V")
    public static final void method1476(class256 arg0, int arg1, int arg2, int arg3) {
        field3695++;
        if (arg1 != -5636) {
            return;
        }
        if (arg0.field5052 == arg2 && arg2 != -1) {
            class65 var4 = class16.method101((byte) -107, arg2);
            int var5 = var4.field1171;
            if (var5 == 1) {
                arg0.field5081 = 1;
                arg0.field5103 = arg3;
                arg0.field5048 = 0;
                arg0.field5047 = 0;
                arg0.field5069 = 0;
                class69.method497(arg0.field5104, false, arg0.field5069, -55, arg0.field5072, var4);
            }
            if (var5 == 2) {
                arg0.field5048 = 0;
            }
        } else if (arg2 == -1 || arg0.field5052 == -1 || class16.method101((byte) 51, arg2).field1169 >= class16.method101((byte) -109, arg0.field5052).field1169) {
            arg0.field5011 = arg0.field5061;
            arg0.field5069 = 0;
            arg0.field5048 = 0;
            arg0.field5081 = 1;
            arg0.field5052 = arg2;
            arg0.field5103 = arg3;
            arg0.field5047 = 0;
            if (arg0.field5052 == -1) {
                return;
            }
            class69.method497(arg0.field5104, false, arg0.field5069, -48, arg0.field5072, class16.method101((byte) 96, arg0.field5052));
        }
    }
}
