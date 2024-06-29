import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 extends class26 {

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Ld;")
    public static class7 field423 = class38.method251((byte) 70, "Gem Shop");

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Ld;")
    public static class7 field426 = class38.method251((byte) 96, "Prev page");

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "mapview!oa", name = "n", descriptor = "Ld;")
    public static class7 field429 = class38.method251((byte) -110, "loc)3dat");

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "Ld;")
    public static class7 field425 = class38.method251((byte) 124, "Transportation");

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "Ld;")
    public static class7 field427 = class38.method251((byte) -78, "underlay)3dat");

    @OriginalMember(owner = "mapview!oa", name = "q", descriptor = "[Z")
    public static boolean[] field432 = new boolean[112];

    @OriginalMember(owner = "mapview!oa", name = "r", descriptor = "Ld;")
    public static class7 field433 = class38.method251((byte) 59, "Staff Shop");

    @OriginalMember(owner = "mapview!oa", name = "m", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "mapview!oa", name = "o", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "mapview!oa", name = "p", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "mapview!oa", name = "s", descriptor = "Z")
    public static boolean field434;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Lk;III)Z", line = 9)
    public static final boolean method209(class20 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 23979) {
            method211(-61, null);
        }
        byte[] var4 = arg0.method143(true, arg3, arg2);
        if (var4 == null) {
            return false;
        } else {
            method211(-12948, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 46)
    public static final void method210(Component arg0, boolean arg1) {
        arg0.removeKeyListener(class21.field236);
        if (arg1) {
            arg0.removeFocusListener(class21.field236);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I[B)V", line = 65)
    private static final void method211(int arg0, byte[] arg1) {
        class35 var2 = new class35(arg1);
        var2.field470 = arg1.length - 2;
        class18.field195 = var2.method231(-887);
        class36.field479 = new int[class18.field195];
        mapview.field289 = new byte[class18.field195][];
        class11.field126 = new int[class18.field195];
        class16.field177 = new int[class18.field195];
        class24.field259 = new int[class18.field195];
        var2.field470 = arg1.length - class18.field195 * 8 - 7;
        class7.field78 = var2.method231(arg0 + 12061);
        if (arg0 != -12948) {
            return;
        }
        class24.field260 = var2.method231(-887);
        int var3 = (var2.method232(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class18.field195; var4++) {
            class24.field259[var4] = var2.method231(-887);
        }
        for (int var5 = 0; var5 < class18.field195; var5++) {
            class16.field177[var5] = var2.method231(-887);
        }
        for (int var6 = 0; var6 < class18.field195; var6++) {
            class11.field126[var6] = var2.method231(-887);
        }
        for (int var7 = 0; var7 < class18.field195; var7++) {
            class36.field479[var7] = var2.method231(-887);
        }
        var2.field470 = arg1.length + 3 - class18.field195 * 8 - var3 * 3 - 7;
        class37.field487 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class37.field487[var8] = var2.method230(false);
            if (class37.field487[var8] == 0) {
                class37.field487[var8] = 1;
            }
        }
        var2.field470 = 0;
        for (int var9 = 0; var9 < class18.field195; var9++) {
            int var10 = class11.field126[var9];
            int var11 = class36.field479[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            mapview.field289[var9] = var13;
            int var14 = var2.method232(false);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method229((byte) -17);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method229((byte) -17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Z)V", line = 214)
    public static void method212(boolean arg0) {
        field432 = null;
        if (!arg0) {
            method209(null, -124, 13, -106);
        }
        field426 = null;
        field423 = null;
        field427 = null;
        field433 = null;
        field425 = null;
        field429 = null;
    }
}
