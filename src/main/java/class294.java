import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class294 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "Lrq;")
    public static class482 field3833;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Lha;")
    public static class545 field3836;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
    public static void method1721(byte arg0) {
        field3836 = null;
        field3833 = null;
        if (arg0 != 79) {
            method1722(-107);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static final void method1722(int arg0) {
        field3834++;
        if (arg0 != 0) {
            field3833 = null;
        }
        if (!class612.method3575(100)) {
            return;
        }
        if (class688.field9646 == null) {
            class112.method751((byte) -63);
        }
        class622.field8846 = 0;
        class8.field81 = true;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
    public static final void method1723(boolean arg0) {
        class124.field1690.method908((byte) -49);
        field3832++;
        class304.field3958.method16((byte) 58);
        class486.field6564.method827(85);
        class264.field3604.method3194(arg0);
        class643.field9112.method3884(50);
        class487.field6572.method3050(-1);
        class274.field3684.method1879(true);
        class267.field3625.method3980(-93);
        class62.field836.method1664((byte) -94);
        class410.field5694.method3707(arg0);
        class544.field7653.method1639(-32);
        class625.field8924.method893(-32199);
        class92.field1241.method1974(-122);
        class535.field7498.method2062(95);
        class223.field3134.method2384(-11574);
        class533.field7474.method1227(16518);
        class128.field1758.method4022((byte) -60);
        class125.field1706.method3564((byte) -3);
        class466.field6364.method1071((byte) -77);
        class98.field1425.method4190(120);
        class620.method3632(-123);
        class457.method2743(-1423170879);
        class401.method2439((byte) -44);
        class706.method3974(-126);
        if (class746.field10392 != class456.field6280) {
            for (int var1 = 0; var1 < class82.field1119.length; var1++) {
                class82.field1119[var1] = null;
            }
            class424.field5880 = 0;
        }
        class413.method2519(65536);
        class232.method1490(0);
        class442.method2643(-102);
        class231.method1488(-2);
        class491.method2867(1);
        class318.field4105.method3210(false);
        class96.field1401.method2203();
        class204.method1361(-30099);
        class570.method3407((byte) -72);
        class332.field4260.method3328((byte) -124);
        class351.field4466.method3328((byte) -124);
        class437.field5994.method3328((byte) -124);
        class335.field4305.method3328((byte) -124);
        class264.field3590.method3328((byte) -124);
        class281.field3729.method3328((byte) -124);
        class76.field1047.method3328((byte) -124);
        class547.field7709.method3328((byte) -124);
        class323.field4156.method3328((byte) -124);
        class372.field5101.method3328((byte) -124);
        class245.field3413.method3328((byte) -124);
        class728.field10211.method3328((byte) -124);
        class300.field3919.method3328((byte) -124);
        class448.field6168.method3328((byte) -124);
        class445.field6084.method3328((byte) -124);
        class91.field1237.method3328((byte) -124);
        class331.field4253.method3328((byte) -124);
        class574.field8111.method3328((byte) -124);
        class506.field7072.method3328((byte) -124);
        class743.field10355.method3328((byte) -124);
        class216.field3065.method3328((byte) -124);
        class579.field8272.method3328((byte) -124);
        class399.field5524.method3328((byte) -124);
        class378.field5267.method3328((byte) -124);
        class132.field1785.method3328((byte) -124);
        class610.field8678.method3328((byte) -124);
        class604.field8637.method3328((byte) -124);
        class262.field3579.method3328((byte) -124);
        class602.field8615.method3328((byte) -124);
        class430.field5923.method3328((byte) -124);
        class640.field9093.method3328((byte) -124);
        class387.field5400.method3328((byte) -124);
        class635.field9039.method3328((byte) -124);
        class713.field10114.method3210(false);
        class331.field4251.method3210(false);
        class542.field7584.method3210(false);
        class674.field9504.method3210(!arg0);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class252.field3483 = arg5;
        class676.field9532 = arg0;
        if (arg1 != -3582) {
            method1724(-102, 54, 54, 110, false, -9, 109);
        }
        class646.field9156 = arg2;
        class559.field7944 = arg3;
        class651.field9208 = arg6;
        field3835++;
        if (arg4 && class559.field7944 >= 100) {
            class235.field3250 = class676.field9532 * 512 + 256;
            class24.field266 = class651.field9208 * 512 + 256;
            class57.field798 = class438.method2628(class24.field266, class392.field5459, class235.field3250, (byte) -83) - class646.field9156;
        }
        class665.field9377 = 2;
        class374.field5167 = -1;
        class13.field180 = -1;
    }
}
