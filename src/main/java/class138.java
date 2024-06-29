import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class138 {

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "J")
    public long field2550 = 0L;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field2556 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static volatile int field2557 = 0;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Loh;")
    public static class263 field2560 = class253.method1681(-127, "cross");

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljj;")
    public static class102 field2544;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lnj;")
    public class139 field2546;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lnj;")
    public class139 field2559;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBILoh;IIJ)V")
    public static final void method901(int arg0, byte arg1, int arg2, class263 arg3, int arg4, int arg5, long arg6) {
        field2554++;
        class194 var8 = new class194(128);
        var8.method1288((byte) -64, 10);
        var8.method1276((int) (Math.random() * 99999.0D), -44);
        var8.method1276(521, -86);
        var8.method1272((byte) 110, arg6);
        var8.method1286(-11740, (int) (Math.random() * 9.9999999E7D));
        int var9 = 11 % ((arg1 + 7) / 55);
        var8.method1312(-76, arg3);
        var8.method1286(-11740, (int) (Math.random() * 9.9999999E7D));
        var8.method1276(class271.field4789, -74);
        var8.method1288((byte) -35, arg5);
        var8.method1288((byte) -26, arg4);
        var8.method1286(-11740, (int) (Math.random() * 9.9999999E7D));
        var8.method1276(arg0, -46);
        var8.method1276(arg2, -56);
        var8.method1286(-11740, (int) (Math.random() * 9.9999999E7D));
        var8.method1322((byte) -98, class89.field1760, class222.field3931);
        class154.field2792.field3497 = 0;
        class154.field2792.method1288((byte) -121, 20);
        class154.field2792.method1288((byte) -4, var8.field3497);
        class154.field2792.method1271(var8.field3497, 0, var8.field3469, 18501);
        class236.field4120 = -3;
        class178.field3274 = 0;
        class248.field4330 = 0;
        class162.field2949 = 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method902(int arg0) {
        field2560 = null;
        if (arg0 <= 26) {
            field2560 = null;
        }
        field2544 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI)Loh;")
    public static final class263 method903(int arg0, int arg1, byte[] arg2, int arg3) {
        field2548++;
        class263 var4 = new class263();
        var4.field4591 = 0;
        if (arg0 != -2378) {
            method903(-63, 7, (byte[]) null, -91);
        }
        var4.field4605 = new byte[arg1];
        for (int var5 = arg3; var5 < (arg1 + arg3); var5++) {
            if (arg2[var5] != 0) {
                var4.field4605[var4.field4591++] = arg2[var5];
            }
        }
        return var4;
    }
}
