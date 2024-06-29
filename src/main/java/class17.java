import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class280 {

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[Z")
    public static boolean[] field187 = new boolean[8];

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lsi;")
    public static class204 field190;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[Lsi;")
    public static class204[] field185;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method118(Component arg0, int arg1) {
        arg0.removeKeyListener(class220.field3524);
        if (arg1 >= 104) {
            field193++;
            arg0.removeFocusListener(class220.field3524);
            class128.field1935 = -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static void method119(int arg0) {
        field187 = null;
        int var1 = 91 % ((32 - arg0) / 63);
        field190 = null;
        field185 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[Lqi;ZI)V")
    public static final void method120(int arg0, int arg1, int arg2, class131[] arg3, boolean arg4, int arg5) {
        if (arg0 >= -104) {
            method119(-14);
        }
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class131 var7 = arg3[var6];
            if (var7 != null && var7.field2054 == arg1) {
                class178.method1334(arg2, var7, arg5, arg4, (byte) 105);
                class187.method1383(arg2, var7, -13075, arg5);
                if (var7.field2003 - var7.field2102 < var7.field2065) {
                    var7.field2065 = var7.field2003 - var7.field2102;
                }
                if (var7.field2065 < 0) {
                    var7.field2065 = 0;
                }
                if (var7.field1995 > var7.field2025 - var7.field2167) {
                    var7.field1995 = var7.field2025 - var7.field2167;
                }
                if (var7.field1995 < 0) {
                    var7.field1995 = 0;
                }
                if (var7.field2150 == 0) {
                    class289.method1962(var7, false, arg4);
                }
            }
        }
        field194++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static final void method121(byte arg0) {
        if (arg0 <= 59) {
            field190 = null;
        }
        field186++;
        if (class110.field1584 > 0) {
            class225.method1612((byte) -45);
        } else {
            class171.field2759 = class180.field2901;
            class180.field2901 = null;
            class256.method1811(40, true);
        }
    }
}
