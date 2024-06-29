import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public abstract class class363 {

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLwia;)V", line = 3)
    public static final void method2277(byte arg0, class791 arg1) {
        field5071++;
        class656.field9144 = arg1.method4356(33, "hitmarks");
        if (arg0 != 43) {
            return;
        }
        class10.field204 = arg1.method4356(arg0 ^ 0x48, "hitbar_default");
        class632.field8876 = arg1.method4356(53, "timerbar_default");
        class445.field6055 = arg1.method4356(8, "headicons_pk");
        class622.field8742 = arg1.method4356(46, "headicons_prayer");
        class471.field6613 = arg1.method4356(arg0 + 31, "hint_headicons");
        class219.field3383 = arg1.method4356(97, "hint_mapmarkers");
        class89.field1007 = arg1.method4356(arg0 + 17, "mapflag");
        class103.field1190 = arg1.method4356(arg0 - 33, "cross");
        class290.field4245 = arg1.method4356(117, "mapdots");
        class479.field6735 = arg1.method4356(77, "scrollbar");
        class358.field5029 = arg1.method4356(69, "name_icons");
        class255.field3752 = arg1.method4356(77, "floorshadows");
        class737.field10171 = arg1.method4356(arg0 + 70, "compass");
        class576.field8126 = arg1.method4356(28, "otherlevel");
        class209.field3241 = arg1.method4356(18, "hint_mapedge");
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V", line = 29)
    public static final void method2278(int arg0, int arg1, boolean arg2) {
        field5070++;
        class787 var3 = class447.method2666(arg0, Integer.MIN_VALUE, arg2);
        if (arg1 < -20 && var3 != null) {
            for (int var4 = 0; var4 < var3.field10809.length; var4++) {
                var3.field10809[var4] = -1;
                var3.field10805[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)I", line = 57)
    public static final int method2279(int arg0, int arg1) {
        if (arg1 <= 52) {
            method2277((byte) 35, null);
        }
        field5068++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIIIIII)V", line = 77)
    public static final void method2280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 == 25959) {
            class773.method4258(arg6, arg4, (byte) -125, arg8, arg0, arg7, arg3, arg2, 0, arg5);
            field5069++;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(FFIFIFIIII[F)V")
    public abstract void method1254(float arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10);
}
