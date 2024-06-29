import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class229 extends class63 {

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Z")
    public static boolean field3538 = false;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "Z")
    public static boolean field3542 = false;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field3546 = "Ok";

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field3547 = 3;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "Ljm;")
    public static class225 field3537;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "[I")
    public static int[] field3539;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1612(Component arg0, byte arg1) {
        int var2 = -22 / ((-32 - arg1) / 42);
        arg0.removeKeyListener(class205.field3214);
        ++field3540;
        arg0.removeFocusListener(class205.field3214);
        class235.field3802 = -1;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
    public static void method1613(byte arg0) {
        field3546 = null;
        field3539 = null;
        if (arg0 != 27) {
            method1614(-29, (byte) 126, 68);
        }
        field3537 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(IBI)V")
    public static final void method1614(int arg0, byte arg1, int arg2) {
        if (arg1 <= 22) {
            field3544 = 116;
        }
        class72.field1069 = class207.field3247 - 1 - arg2 - -class207.field3237;
        ++field3545;
        class282.field4592 = -class207.field3241 + arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIIIII)V")
    public static final void method1615(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class248.field4033 = arg4;
        class69.field1029 = arg2;
        ++field3543;
        class174.field2727 = arg0;
        if (arg5 != 8806) {
            method1614(101, (byte) -72, -59);
        }
        class234.field3780 = arg6;
        class13.field187 = arg3;
        if (arg1 && ~class69.field1029 <= -101) {
            class99.field1474 = class13.field187 * 128 - -64;
            class255.field4159 = class248.field4033 * 128 + 64;
            class21.field279 = class52.method351(-113, class255.field4159, class99.field1474, class148.field2204) - class234.field3780;
        }
        class158.field2370 = 2;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field3548;
        int var3 = 107 % (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) 85);
        if (super.field4786.field1200 && this.method407(-1)) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int var8 = arg1 % super.field914 * super.field914;
            for (int var9 = 0; ~var9 > ~class180.field2826; ++var9) {
                int var10 = super.field917[var8 - -(var9 % super.field921)];
                var6[var9] = class205.method1411(var10 << 4, 4080);
                var7[var9] = class205.method1411(var10 >> 4, 4080);
                var5[var9] = class205.method1411(16711680, var10) >> 12;
            }
        }
        return var4;
    }
}
