import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class121 {

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lao;")
    public static class191 field1568 = new class191(32, -2);

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Z")
    public static boolean field1571 = false;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "Lgf;")
    public static class183 field1570;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 6)
    public static void method725(int arg0) {
        field1570 = null;
        field1568 = null;
        int var1 = -22 / ((arg0 + 44) / 38);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIILrv;)V", line = 21)
    public static final void method726(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        class498 var5 = class61.method369(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field921 = (arg1 << class351.field4688) + class123.field1595;
        arg4.field919 = arg3;
        arg4.field926 = (arg2 << class351.field4688) + class123.field1595;
        for (class192 var7 = var5.field7263; var7 != null; var7 = var7.field2469) {
            if (var7.field2466.field3693) {
                int var8 = var7.field2466.method132(-125);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field919 += var6;
            arg4.field918 = true;
        } else if (var5.field7268 != null) {
            arg4.field919 -= var5.field7268.field2938;
        }
        var5.field7273 = arg4;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lza;ILfo;Lfo;)V", line = 65)
    public static final void method727(class287 arg0, int arg1, class361 arg2, class361 arg3) {
        class328.field4362 = class123.method733(0, class299.field3929, -128, arg3);
        field1569++;
        class161.field2096 = arg0.method1201(class328.field4362, class491.method2976(arg2, class299.field3929, 0), true);
        class293.field3883 = class123.method733(0, class365.field4985, -90, arg3);
        class225.field3028 = arg0.method1201(class293.field3883, class491.method2976(arg2, class365.field4985, arg1), true);
        field1570 = class123.method733(0, class349.field4642, -124, arg3);
        class79.field976 = arg0.method1201(field1570, class491.method2976(arg2, class349.field4642, 0), true);
    }
}
