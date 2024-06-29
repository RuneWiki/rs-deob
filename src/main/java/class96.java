import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class96 {

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lnl;")
    private class435 field1350;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Lrc;")
    public static class108 field1347 = new class108(28, 6);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lad;")
    public static class463 field1344;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "[Z")
    public static boolean[] field1348;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lld;B)V", line = 6)
    public static final void method796(class73 arg0, byte arg1) {
        field1349++;
        if (class205.field3005) {
            return;
        }
        arg0.method2714(66);
        class303.field4310--;
        if (arg1 <= 100) {
            method800((class383) null, 100);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIII)V", line = 22)
    public static final void method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class34 var7 = new class34();
        var7.field359 = arg1 >> class380.field5232;
        var7.field364 = arg2 >> class380.field5232;
        var7.field347 = arg3 >> class380.field5232;
        var7.field370 = arg4 >> class380.field5232;
        var7.field354 = arg0;
        var7.field351 = arg1;
        var7.field367 = arg2;
        var7.field355 = arg3;
        var7.field350 = arg4;
        var7.field365 = arg5;
        var7.field353 = arg6;
        class153.field2126[class198.field2924++] = var7;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;Lkk;I)I", line = 37)
    public static final int method798(String arg0, class161 arg1, int arg2) {
        field1345++;
        int var3 = arg1.field2298;
        byte[] var4 = class105.method840(arg0, arg2 - 133);
        arg1.method1161((byte) -24, var4.length);
        arg1.field2298 += class155.field2152.method520(arg2 ^ 0xE, var4, arg1.field2298, arg1.field2262, 0, var4.length);
        if (arg2 != 15) {
            method797(66, 95, 41, 30, 42, -98, -47);
        }
        return arg1.field2298 - var3;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 60)
    public static void method799(int arg0) {
        field1344 = null;
        field1348 = null;
        field1347 = null;
        if (arg0 != 22683) {
            field1348 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljd;I)Z", line = 90)
    public static final boolean method800(class383 arg0, int arg1) {
        if (arg1 != -11714) {
            field1354 = 81;
        }
        field1346++;
        return class404.field5527 == arg0 || class406.field5544 == arg0 || class325.field4529 == arg0;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 111)
    public class96(class280 arg0, int arg1, class435 arg2) {
        new class336(64);
        this.field1350 = arg2;
        this.field1352 = this.field1350.method2638(1, 15);
    }
}
