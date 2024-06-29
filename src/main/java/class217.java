import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class217 extends class88 {

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field3343 = 0;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Ljo;")
    public static class150 field3344 = new class150();

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "[Z")
    public static boolean[] field3346 = new boolean[5];

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "[I")
    public static int[] field3347 = new int[14];

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field3345 = -1;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Ljava/awt/Frame;")
    public static Frame field3350;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 4)
    public static void method1467(byte arg0) {
        field3344 = null;
        int var1 = 47 / ((arg0 - 30) / 35);
        field3350 = null;
        field3346 = null;
        field3347 = null;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(II)Lbl;", line = 22)
    public static final class311 method1468(int arg0, int arg1) {
        field3340++;
        if (arg0 < 108) {
            field3349 = 39;
        }
        class311 var2 = (class311) class202.field3101.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class320.field5278.method1504(class139.method986(1023, arg1), true, class15.method107(arg1, (byte) 87));
        class311 var4 = new class311();
        if (var3 != null) {
            var4.method2172(true, new class313(var3));
        }
        class202.field3101.method642(var4, (long) arg1, -78);
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIII)V", line = 51)
    public static final void method1469(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3341++;
        int var6 = arg0;
        int var7 = -58 % ((arg1 - 12) / 32);
        while (var6 <= arg5) {
            class270.method1906(arg4, arg2, arg3, class306.field4998[var6], 121);
            var6++;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 81)
    public static final String method1470(boolean arg0) {
        if (arg0) {
            return (String) null;
        }
        field3342++;
        String var1;
        if (class56.field856 == 1 && class117.field1701 < 2) {
            var1 = class182.field2834 + class132.field2024 + class37.field550 + " ->";
        } else if (class107.field1532 && class117.field1701 < 2) {
            var1 = class120.field1776 + class132.field2024 + class167.field2630 + " ->";
        } else if (class148.field2397 && class294.field4896[81] && class117.field1701 > 2) {
            var1 = client.method895(class117.field1701 - 2, 27003);
        } else {
            var1 = client.method895(class117.field1701 - 1, 27003);
        }
        if (class117.field1701 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class117.field1701 - 2) + class20.field240;
        }
        return var1;
    }
}
