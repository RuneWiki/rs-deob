import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class36 extends class107 {

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Lrc;")
    public static class346 field546;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
    public static int[] field545;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "[Ljd;")
    public static class139[] field549;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLr;)V", line = 8)
    public static final void method271(byte arg0, class110 arg1) {
        class51.field680 = arg1.method688((byte) 87, "p11_full");
        field547++;
        class31.field422 = arg1.method688((byte) 87, "p12_full");
        class322.field4292 = arg1.method688((byte) 87, "b12_full");
        class295.field3941 = arg1.method688((byte) 87, "hitmarks");
        class16.field228 = arg1.method688((byte) 87, "hitbar_default");
        class230.field3060 = arg1.method688((byte) 87, "timerbar_default");
        class257.field3425 = arg1.method688((byte) 87, "headicons_pk");
        class202.field2744 = arg1.method688((byte) 87, "headicons_prayer");
        class109.field1628 = arg1.method688((byte) 87, "hint_headicons");
        class94.field1379 = arg1.method688((byte) 87, "hint_mapmarkers");
        class356.field4915 = arg1.method688((byte) 87, "mapflag");
        class422.field5733 = arg1.method688((byte) 87, "cross");
        int var2 = -107 / ((-arg0 - 56) / 40);
        class272.field3623 = arg1.method688((byte) 87, "mapdots");
        class64.field853 = arg1.method688((byte) 87, "scrollbar");
        class195.field2635 = arg1.method688((byte) 87, "name_icons");
        class246.field3286 = arg1.method688((byte) 87, "floorshadows");
        class196.field2670 = arg1.method688((byte) 87, "compass");
        class302.field4028 = arg1.method688((byte) 87, "otherlevel");
        class295.field3944 = arg1.method688((byte) 87, "hint_mapedge");
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIIZ)V", line = 41)
    public static final void method272(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field548++;
        long var6 = (long) (arg3 | (arg5 ? Integer.MIN_VALUE : 0));
        class257 var8 = (class257) class138.field1994.method1528(var6, 87);
        if (var8 == null) {
            var8 = new class257();
            class138.field1994.method1525((byte) 19, var8, var6);
        }
        if (arg1 != -41) {
            field545 = null;
        }
        if (var8.field3418.length <= arg0) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var11 < var8.field3418.length; var11++) {
                var9[var11] = var8.field3418[var11];
                var10[var11] = var8.field3415[var11];
            }
            for (int var12 = var8.field3418.length; var12 < arg0; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field3415 = var10;
            var8.field3418 = var9;
        }
        var8.field3418[arg0] = arg4;
        var8.field3415[arg0] = arg2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 96)
    public static void method273(boolean arg0) {
        field549 = null;
        field545 = null;
        if (arg0) {
            field545 = null;
        }
        field546 = null;
    }
}
