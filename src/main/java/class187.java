import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class187 extends class59 {

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lok;")
    public static class41 field3051 = class137.method956(" zuerst von Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lok;")
    private static class41 field3054 = class137.method956(" has logged in)3", 45);

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lok;")
    public static class41 field3047 = field3054;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lok;I)Lok;", line = 6)
    public static final class41 method1346(class41[] arg0, int arg1) {
        if (arg1 != 0) {
            field3051 = (class41) null;
        }
        field3046++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class262.method1839(arg0.length, 4961, arg0, 0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method1347(boolean arg0) {
        field3048++;
        class45.method328(-2, 5);
        class169.method1212(5, (byte) 95);
        class133.method931(5, -123);
        class177.method1265((byte) 7, 5);
        class310.method2150(5, (byte) 92);
        if (arg0) {
            return;
        }
        class133.method933((byte) -78, 5);
        class242.method1736(-3, 5);
        class95.method680(5, (byte) 94);
        class153.method1087((byte) -95, 5);
        class130.method920(24091, 5);
        class91.method641(1, 5);
        class194.method1390(50, 88);
        class192.method1375(5, true);
        class288.method2012((byte) -85, 5);
        class245.field3914.method138(5, 0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lgf;", line = 63)
    public static final class238 method1348(byte arg0, int arg1) {
        field3049++;
        class238 var2 = (class238) class63.field927.method136((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class239.field3821.method454(16, 0, arg1);
        class238 var4 = new class238();
        if (arg0 != 121) {
            return (class238) null;
        }
        if (var3 != null) {
            var4.method1706(true, new class112(var3));
        }
        class63.field927.method132((long) arg1, var4, arg0 ^ 0xFFFFFF86);
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 105)
    public static void method1349(int arg0) {
        field3047 = null;
        if (arg0 == 0) {
            field3054 = null;
            field3051 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lag;B)V", line = 127)
    public static final void method1350(class211 arg0, byte arg1) {
        class262.field4171 = 3;
        class220 var2 = null;
        class290.method2019(true, (byte) -91);
        class14.field181 = true;
        class167.field2655 = 0;
        class207.field3359 = true;
        class285.field4641 = 0;
        class33.field499 = true;
        class314.field5298 = 0;
        class244.field3900 = 255;
        class296.field4787 = true;
        class235.field3760 = true;
        class66.field1006 = true;
        class241.field3848 = false;
        class27.field393 = true;
        class226.field3616 = 0;
        class241.field3863 = true;
        class1.field3 = 127;
        class296.field4778 = true;
        class152.field2419 = 2;
        class46.field722 = true;
        class81.field1200 = true;
        class178.field2888 = 0;
        class225.field3606 = 127;
        field3050++;
        try {
            class182 var3 = arg0.method1492((byte) 119, "runescape");
            while (var3.field2948 == 0) {
                class300.method2068(125, 1L);
            }
            if (var3.field2948 == 1) {
                var2 = (class220) var3.field2945;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1578((byte) 16)];
                while (var4 < var5.length) {
                    int var6 = var2.method1583(var5, var4, var5.length - var4, true);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class192.method1376(122, new class112(var5));
            }
        } catch (Exception var10) {
        }
        if (arg1 > -24) {
            method1346((class41[]) null, -123);
        }
        try {
            if (var2 != null) {
                var2.method1580(-3810);
            }
        } catch (Exception var9) {
        }
    }
}
