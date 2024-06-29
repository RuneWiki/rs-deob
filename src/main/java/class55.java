import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class55 {

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Ljk;")
    public static class117 field637;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lak;")
    public static class31 field636;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method309(byte arg0) {
        field637 = null;
        field636 = null;
        if (arg0 > -43) {
            method309((byte) 46);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)V")
    public static final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field638++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = arg3;
        class384.method2394(arg4, 105, class228.field2877[arg1], arg0 + arg2, arg0 - arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class228.field2877[arg1 + var6];
                int[] var10 = class228.field2877[arg1 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class384.method2394(arg4, 122, var9, var11, var12);
                class384.method2394(arg4, arg3 ^ 0xFFFFFF98, var10, var11, var12);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class228.field2877[arg1 + var5];
            int[] var16 = class228.field2877[arg1 - var5];
            class384.method2394(arg4, 119, var15, var13, var14);
            class384.method2394(arg4, 108, var16, var13, var14);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILwo;)V")
    public static final void method311(int arg0, class285 arg1) {
        field639++;
        class231.field3042 = arg1.method1806((byte) -100, "p11_full");
        class12.field153 = arg1.method1806((byte) -127, "p12_full");
        if (arg0 != -1) {
            return;
        }
        class191.field2238 = arg1.method1806((byte) -119, "b12_full");
        class259.field3346 = arg1.method1806((byte) -117, "hitmarks");
        class150.field1749 = arg1.method1806((byte) -112, "hitbar_default");
        class103.field1209 = arg1.method1806((byte) -126, "timerbar_default");
        class241.field3164 = arg1.method1806((byte) -96, "headicons_pk");
        class364.field4954 = arg1.method1806((byte) -126, "headicons_prayer");
        class413.field5677 = arg1.method1806((byte) -127, "hint_headicons");
        class39.field459 = arg1.method1806((byte) -102, "hint_mapmarkers");
        class31.field336 = arg1.method1806((byte) -94, "mapflag");
        class316.field4257 = arg1.method1806((byte) -127, "cross");
        class229.field2892 = arg1.method1806((byte) -126, "mapdots");
        class432.field5902 = arg1.method1806((byte) -107, "scrollbar");
        class388.field5298 = arg1.method1806((byte) -104, "name_icons");
        class150.field1751 = arg1.method1806((byte) -127, "floorshadows");
        class390.field5309 = arg1.method1806((byte) -109, "compass");
        class191.field2249 = arg1.method1806((byte) -117, "hint_mapedge");
    }
}
