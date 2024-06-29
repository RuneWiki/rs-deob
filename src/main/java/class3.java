import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Liv;")
    public static class64 field102 = new class64(33, 3);

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lbw;")
    public static class483 field101;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lck;B)V", line = 5)
    public static final void method28(class452 arg0, byte arg1) {
        field99++;
        arg0.method2701(19466);
        int var2 = class148.field2368;
        class256 var3 = class139.field2224 = class183.field2747[var2] = new class256();
        var3.field7669 = var2;
        int var4 = arg0.method2700((byte) 87, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFED8A) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field7692[0] = var6 - class200.field2931;
        var3.field6228 = (var3.field7692[0] << 7) + (var3.method1654(79) << 6);
        var3.field7694[0] = var7 - class403.field6059;
        var3.field6233 = (var3.field7694[0] << 7) + (var3.method1654(78) << 6);
        class163.field2525 = var3.field6232 = var5;
        if (class445.field6640[var2] != null) {
            var3.method1661((byte) -101, class445.field6640[var2]);
        }
        if (arg1 > -103) {
            field101 = null;
        }
        class409.field6135 = 0;
        class358.field5445[class409.field6135++] = var2;
        class386.field5822[var2] = 0;
        class498.field7359 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2700((byte) 87, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFA3) >> 8;
                int var12 = var9 & 0xFF;
                class382 var13 = class167.field2601[var8] = new class382();
                var13.field5782 = (var10 << 28) + (var11 << 14) + var12;
                var13.field5783 = false;
                var13.field5781 = 0;
                var13.field5786 = -1;
                class447.field6709[class498.field7359++] = var8;
                class386.field5822[var8] = 0;
            }
        }
        arg0.method2702(10492);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V", line = 80)
    public static final void method29(int arg0, int arg1, int arg2) {
        field103++;
        int var3 = -51 / ((arg1 - 32) / 50);
        class54 var4 = class442.method2651(arg0, 1, -13208);
        var4.method480(0);
        var4.field934 = arg2;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIZILbu;)V", line = 100)
    public static final void method30(int arg0, int arg1, int arg2, boolean arg3, int arg4, class17 arg5) {
        field100++;
        class406.field6095 = arg4;
        class289.field4118 = 1;
        class488.field7226 = arg5;
        class102.field1693 = arg2;
        if (arg1 != 9576) {
            method28(null, (byte) 112);
        }
        class219.field3158 = arg3;
        class431.field6417 = 10000;
        class281.field4024 = arg0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V", line = 125)
    public static void method31(boolean arg0) {
        field102 = null;
        field101 = null;
        if (!arg0) {
            method30(106, 63, 7, false, -11, null);
        }
    }
}
