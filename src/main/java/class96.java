import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class96 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Z")
    public static boolean field2041 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lrf;")
    public static class163 field2044 = class53.method392(-60, "::fpsoff");

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[Lud;")
    public static class188[] field2049 = new class188[50];

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
    public static boolean field2047 = false;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lad;")
    public static class5 field2046 = new class5();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[Lrh;")
    public static class165[] field2045;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
    public static final void method662(boolean arg0, int arg1) {
        field2048++;
        if (class199.field3935 == null) {
            return;
        }
        try {
            if (arg1 < 69) {
                field2049 = null;
            }
            class52 var2 = new class52(4);
            var2.method370(arg0 ? 2 : 3, (byte) 123);
            var2.method336(false, 0);
            class199.field3935.method697(var2.field1054, 4, (byte) -128, 0);
        } catch (IOException var4) {
            try {
                class199.field3935.method694((byte) -93);
            } catch (Exception var3) {
            }
            class199.field3935 = null;
            class109.field2265++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method663(byte arg0) {
        if (arg0 > -32) {
            field2044 = null;
        }
        field2049 = null;
        field2045 = null;
        field2044 = null;
        field2046 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)Lrf;")
    public static final class163 method664(int arg0, byte arg1) {
        field2043++;
        if (arg1 != 118) {
            field2041 = false;
        }
        if (arg0 < 100000) {
            return class180.method1216(new class163[] { class58.field1168, class34.method217(arg0, -59), class181.field3629 }, false);
        } else if (arg0 < 10000000) {
            return class180.method1216(new class163[] { class61.field1293, class34.method217(arg0 / 1000, -54), client.field593, class181.field3629 }, false);
        } else {
            return class180.method1216(new class163[] { class184.field3666, class34.method217(arg0 / 1000000, -93), class107.field2215, class181.field3629 }, false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)Lne;")
    public static final class126 method665(byte[] arg0, int arg1) {
        field2040++;
        if (arg1 != 1) {
            method664(-56, (byte) -47);
        }
        if (arg0 == null) {
            return null;
        } else {
            class126 var2 = new class126(arg0, class102.field2135, class129.field2686, class108.field2242, class57.field1158, class167.field3393, class202.field3980);
            class119.method814((byte) 103);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static final void method666(int arg0) {
        field2042++;
        if (class86.field1880 && class60.field1227 != class186.field3713) {
            class189.method1281(class60.field1227, class23.field403, true, class56.field1136.field718[0], class56.field1136.field692[0], class116.field2454);
            return;
        }
        if (class60.field1227 != class191.field3788) {
            class191.field3788 = class60.field1227;
            class193.method1290(class60.field1227, -7042);
        }
        int var1 = -74 / ((arg0 - 55) / 54);
    }
}
