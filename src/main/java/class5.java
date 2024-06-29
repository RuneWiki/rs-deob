import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class5 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lud;")
    private static class279 field119 = class130.method1024("glow2:", 255);

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lud;")
    public static class279 field120 = field119;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Lud;")
    public static class279 field121 = class130.method1024(" de votre liste noire)3", 255);

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field122 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lud;")
    public static class279 field113 = field119;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field115;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 9)
    public static void method26(byte arg0) {
        field121 = null;
        field120 = null;
        if (arg0 != -29) {
            field121 = (class279) null;
        }
        field119 = null;
        field115 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLaf;Z)V", line = 35)
    public static final void method29(boolean arg0, class176 arg1, boolean arg2) {
        field118++;
        int var3 = arg1.field3165;
        int var4 = (int) arg1.field5539;
        if (arg0) {
            return;
        }
        arg1.method2221(true);
        if (arg2) {
            class18.method155(!arg0, var3);
        }
        class166.method1293(0, var3);
        class8 var5 = class273.method1940(var4, -121);
        if (var5 != null) {
            class50.method426(var5, false);
        }
        int var6 = class194.field3488;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class32.method293(123, class271.field4828[var7])) {
                class222.method1630(var7, -15);
            }
        }
        if (class194.field3488 == 1) {
            class238.field4184 = false;
            class35.method311(class3.field108, class7.field149, class155.field2803, class324.field5660, 32);
        } else {
            class35.method311(class3.field108, class7.field149, class155.field2803, class324.field5660, 32);
            int var8 = class292.field5210.method411(class90.field1697);
            for (int var9 = 0; var9 < class194.field3488; var9++) {
                int var10 = class292.field5210.method411(class24.method213(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class3.field108 = class194.field3488 * 15 + (class152.field2766 ? 26 : 22);
            class7.field149 = var8 + 8;
        }
        if (class307.field5444 != -1) {
            class111.method909(class307.field5444, (byte) 126, 1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)V", line = 103)
    public static final void method30(int arg0, byte arg1) {
        if (arg1 != 105) {
            method31(50, 86);
        }
        field114++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class50.method428(0);
        } else if (arg0 == 2) {
            class240.method1723((byte) -2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lkm;", line = 135)
    public static final class323 method31(int arg0, int arg1) {
        field117++;
        class323 var2 = (class323) class1.field83.method1336((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2305.method1192(0, 3, arg0);
        class323 var4 = new class323();
        if (var3 != null) {
            var4.method2277(new class53(var3), -14223);
        }
        if (arg1 <= 17) {
            field120 = (class279) null;
        }
        class1.field83.method1331(var4, 30237, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIIII)V", line = 161)
    public static final void method32(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field123++;
        class104 var5 = class293.method2085(8, arg2, !arg0);
        var5.method879(0);
        var5.field1965 = arg4;
        if (!arg0) {
            method32(true, 33, -62, 87, -110);
        }
        var5.field1962 = arg3;
        var5.field1966 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
    public abstract int method27(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method28(byte arg0, Component arg1);

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method33(byte arg0, Component arg1);
}
