import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class281 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Z")
    public static boolean field4640 = true;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lck;")
    public static class119 field4643 = class298.method1987((byte) 61, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lck;")
    public static class119 field4646 = class298.method1987((byte) 116, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lck;")
    public static class119 field4648 = class298.method1987((byte) 95, "null");

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lck;")
    public static class119 field4647 = class298.method1987((byte) 39, "p12_full");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lsd;")
    public static class278 field4639;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 16)
    public static void method1863(byte arg0) {
        field4646 = null;
        field4639 = null;
        field4643 = null;
        field4647 = null;
        field4648 = null;
        if (arg0 != 18) {
            method1863((byte) -71);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIZIII)V", line = 34)
    public static final void method1864(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= 0 && arg7 >= 0 && arg3 < 103 && arg7 < 103) {
            if (arg5 == 0) {
                class146 var8 = class234.method1505(arg6, arg3, arg7);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2341 >>> 32);
                    if (arg0 == 2) {
                        var8.field2348 = new class222(var9, 2, arg2 + 4, arg6, arg3, arg7, arg1, false, var8.field2348);
                        var8.field2347 = new class222(var9, 2, arg2 + 1 & 0x3, arg6, arg3, arg7, arg1, false, var8.field2347);
                    } else {
                        var8.field2348 = new class222(var9, arg0, arg2, arg6, arg3, arg7, arg1, false, var8.field2348);
                    }
                }
            }
            if (arg5 == 1) {
                class106 var10 = class139.method918(arg6, arg3, arg7);
                if (var10 != null) {
                    int var11 = (int) (var10.field1617 >>> 32) & Integer.MAX_VALUE;
                    if (arg0 == 4 || arg0 == 5) {
                        var10.field1627 = new class222(var11, 4, arg2, arg6, arg3, arg7, arg1, false, var10.field1627);
                    } else if (arg0 == 6) {
                        var10.field1627 = new class222(var11, 4, arg2 + 4, arg6, arg3, arg7, arg1, false, var10.field1627);
                    } else if (arg0 == 7) {
                        var10.field1627 = new class222(var11, 4, (arg2 + 2 & 0x3) + 4, arg6, arg3, arg7, arg1, false, var10.field1627);
                    } else if (arg0 == 8) {
                        var10.field1627 = new class222(var11, 4, arg2 + 4, arg6, arg3, arg7, arg1, false, var10.field1627);
                        var10.field1633 = new class222(var11, 4, (arg2 + 2 & 0x3) + 4, arg6, arg3, arg7, arg1, false, var10.field1633);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg0 == 11) {
                    arg0 = 10;
                }
                class196 var12 = class221.method1399(arg6, arg3, arg7);
                if (var12 != null) {
                    var12.field3140 = new class222((int) (var12.field3130 >>> 32) & Integer.MAX_VALUE, arg0, arg2, arg6, arg3, arg7, arg1, false, var12.field3140);
                }
            }
            if (arg5 == 3) {
                class199 var13 = class201.method1277(arg6, arg3, arg7);
                if (var13 != null) {
                    var13.field3178 = new class222((int) (var13.field3175 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg6, arg3, arg7, arg1, false, var13.field3178);
                }
            }
        }
        field4645++;
        if (!arg4) {
            field4642 = 69;
        }
    }
}
