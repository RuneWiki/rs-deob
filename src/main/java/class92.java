import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class92 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lub;")
    public static class227 field1569 = class257.method1749("::gc", 17263);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[Lub;")
    public static class227[] field1574 = new class227[8];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Ln;")
    public static class138 field1573;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILub;ISLub;JB)V")
    public static final void method538(int arg0, class227 arg1, int arg2, short arg3, class227 arg4, long arg5, byte arg6) {
        field1571++;
        if (arg6 != -31) {
            field1569 = null;
        }
        if (class81.field1409 || class94.field1631 >= 500) {
            return;
        }
        class37.field611[class94.field1631] = arg4;
        class213.field3607[class94.field1631] = arg1;
        class19.field327[class94.field1631] = arg3;
        class161.field2720[class94.field1631] = arg5;
        class210.field3562[class94.field1631] = arg0;
        class236.field4099[class94.field1631] = arg2;
        class94.field1631++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method539(int arg0) {
        class175.field2918++;
        field1570++;
        class176.field2935.method664((byte) -127, arg0);
        class176.field2935.method1457(0L, 111);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static void method540(boolean arg0) {
        field1569 = null;
        field1574 = null;
        field1573 = null;
        if (arg0) {
            method540(false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method541(int arg0, int arg1) {
        if (arg1 <= 87) {
            method539(109);
        }
        field1576++;
        class142.field2441.method1727(true, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Lij;")
    public static final class50 method542(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2024;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static final void method543(int arg0) {
        if (arg0 >= -12) {
            field1572 = -33;
        }
        field1575++;
        for (class75 var1 = (class75) class235.field4074.method1277(76); var1 != null; var1 = (class75) class235.field4074.method1271(250)) {
            class18 var2 = var1.field1314;
            if (class64.field1171 != var2.field313 || var2.field320) {
                var1.method369(124);
            } else if (var2.field304 <= class253.field4393) {
                var2.method83((byte) -26, class85.field1481);
                if (var2.field320) {
                    var1.method369(-9);
                } else {
                    class167.method1030(var2.field313, var2.field315, var2.field311, var2.field316, 60, var2, 0, -1L, false);
                }
            }
        }
    }
}
