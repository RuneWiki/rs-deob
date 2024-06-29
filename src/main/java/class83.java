import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class83 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
    public static boolean field1616 = false;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Ljd;")
    public static class86 field1624 = class122.method868("Benutzeroberfl-=che geladen)3", true);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljd;")
    public static class86 field1625 = class122.method868("(U1", true);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
    public static boolean field1621 = true;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lvj;")
    public class113 field1626;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lei;")
    public static class167 field1619;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public int[] field1623;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lqk;")
    public static final class200 method577(boolean arg0) {
        field1617++;
        class200 var1 = new class200(30);
        var1.method1388(-64, 7);
        var1.method1388(-56, class21.field547);
        var1.method1388(-125, class239.field4304 ? 1 : 0);
        var1.method1388(-86, class79.field1555 ? 1 : 0);
        var1.method1388(-116, class116.field2224 ? 1 : 0);
        var1.method1388(-119, class202.field3655 ? 1 : 0);
        var1.method1388(-58, class42.field936 ? 1 : 0);
        var1.method1388(-39, class4.field63 ? 1 : 0);
        var1.method1388(-86, class107.field2061 ? 1 : 0);
        var1.method1388(-59, class272.field4769 ? 1 : 0);
        var1.method1388(-87, class133.field2513);
        var1.method1388(-52, class168.field3114 ? 1 : 0);
        var1.method1388(-62, class161.field3029 ? 1 : 0);
        var1.method1388(-116, field1621 ? 1 : 0);
        var1.method1388(-110, class64.field1257);
        var1.method1388(-68, class31.field647 ? 1 : 0);
        var1.method1388(-69, class264.field4672);
        var1.method1388(-43, class139.field2646);
        if (arg0) {
            return null;
        }
        var1.method1388(-110, class152.field2879);
        var1.method1428((byte) -121, class65.field1286);
        var1.method1428((byte) -107, class7.field248);
        var1.method1388(-97, 2);
        var1.method1406(1472534024, class194.field3481);
        var1.method1388(-128, class42.field949);
        var1.method1388(-122, class50.field1045 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lqa;")
    public static final class147 method578(int arg0, int arg1) {
        field1618++;
        if (arg1 < 14) {
            method577(true);
        }
        class147 var2 = (class147) class130.field2484.method395((long) arg0, (byte) 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class87.field1727.method1084((byte) -120, 5, arg0);
        class147 var4 = new class147();
        if (var3 != null) {
            var4.method1054(0, new class200(var3));
        }
        class130.field2484.method398((long) arg0, (byte) 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method579(int arg0) {
        field1625 = null;
        if (arg0 != 0) {
            method578(63, -33);
        }
        field1624 = null;
        field1619 = null;
    }
}
