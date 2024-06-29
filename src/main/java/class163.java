import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class163 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lkb;")
    public static class39 field2654;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lkb;")
    public static class39 field2660;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
    public static int[] field2655;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "[I")
    public static int[] field2657;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[[[I")
    public static int[][][] field2656;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)Lag;", line = 5)
    public static final class123 method1130(boolean arg0) {
        field2661++;
        if (arg0) {
            return (class123) null;
        } else {
            class123 var1 = new class123(field2659, class113.field1698, field2657[0], class162.field2647[0], class244.field3885[0], class21.field316[0], class3.field20[0], class305.field4754);
            class17.method115((byte) 113);
            return var1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(JB)V", line = 23)
    public static final void method1131(long arg0, byte arg1) {
        if (!class325.field5079) {
            class329.field5112 += (float) arg0 * class218.field3504 / 40.0F;
            class312.field4862 += (float) arg0 * class144.field2156 / 40.0F;
        }
        field2658++;
        int var3 = class13.field159.field1980 + class300.field4676;
        int var4 = class13.field159.field1944 + class326.field5084;
        if (class131.field1935 - var3 < -500 || class131.field1935 - var3 > 500 || class255.field4045 - var4 < -500 || class255.field4045 - var4 > 500) {
            class131.field1935 = var3;
            class255.field4045 = var4;
        }
        if (class131.field1935 != var3) {
            int var5 = var3 - class131.field1935;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class131.field1935 += var6;
        }
        if (arg1 != -7) {
            return;
        }
        if (class255.field4045 != var4) {
            int var7 = var4 - class255.field4045;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class255.field4045 += var8;
        }
        class340.method2344(arg1 - 102);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 122)
    public static void method1132(int arg0) {
        field2655 = null;
        field2660 = null;
        field2656 = (int[][][]) null;
        if (arg0 != -31911) {
            field2659 = 3;
        }
        field2657 = null;
        field2654 = null;
    }
}
