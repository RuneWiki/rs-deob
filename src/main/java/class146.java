import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class146 {

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lok;")
    public static class41 field2220 = class137.method956("Ladevorgang )2 bitte warten Sie)3", 45);

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[[Z")
    public static boolean[][] field2222 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lok;")
    public static class41 field2217 = class137.method956("name_icons", 45);

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lok;")
    public static class41 field2221 = class137.method956("Loaded world list data", 45);

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Lok;")
    public static class41 field2225 = class137.method956("<col=ffffff>", 45);

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lok;")
    public static class41 field2230 = class137.method956("<col=ffffff>", 45);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lqm;")
    public class174 field2223;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[I")
    public int[] field2219;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)V", line = 5)
    public static final void method1007(boolean arg0, boolean arg1) {
        if (arg0) {
            field2230 = (class41) null;
        }
        if (arg1) {
            if (class136.field2015 != -1) {
                class244.method1745((byte) 99, class136.field2015);
            }
            for (class187 var2 = (class187) class113.field1658.method609(12); var2 != null; var2 = (class187) class113.field1658.method616(118)) {
                class206.method1457(var2, (byte) 127, true);
            }
            class136.field2015 = -1;
            class113.field1658 = new class86(8);
            class112.method777((byte) 100);
            class136.field2015 = class191.field3081;
            class16.method75(arg0, false);
            class92.method656(-95);
            class83.method587(class136.field2015, 8981);
        }
        class62.field913 = new class245();
        field2228++;
        class62.field913.field4311 = 3000;
        class62.field913.field4280 = 3000;
        if (!class166.field2625) {
            class161.method1136(true, class212.field3423);
            class282.method1991(-8, 10);
            return;
        }
        if (class28.field416 == 2) {
            class251.field3990 = class207.field3353 << 7;
            class235.field3779 = class128.field1903 << 7;
        } else {
            class63.method439(true);
        }
        class13.method58(-4);
        class198.method1410((byte) -111);
        class282.method1991(-8, 28);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 74)
    public static void method1008(int arg0) {
        int var1 = 85 % ((arg0 - 6) / 43);
        field2222 = (boolean[][]) null;
        field2225 = null;
        field2217 = null;
        field2230 = null;
        field2220 = null;
        field2221 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)[B", line = 90)
    public static final byte[] method1009(byte arg0, int arg1) {
        if (arg0 >= -28) {
            method1009((byte) 108, 64);
        }
        field2224++;
        class28 var2 = (class28) class92.field1336.method554((long) arg1, -120);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class91.method640(102, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class28(var3);
            class92.field1336.method555((long) arg1, (byte) -123, var2);
        }
        return var2.field419;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lmh;I)V", line = 164)
    public static final void method1010(class65 arg0, int arg1) {
        if (arg1 != 255) {
            method1009((byte) 112, -127);
        }
        field2218++;
        class292.field4735 = arg0;
    }
}
