import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class55 {

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lo;")
    public static class84 field104 = class15.method124("@red@Offline", 255);

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "J")
    public static long field101 = 0L;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Lod;")
    public static class88 field100 = new class88();

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lo;")
    public static class84 field115 = class15.method124("Mem:", 255);

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
    public static int[] field116 = new int[50];

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lo;")
    private static class84 field117 = class15.method124("@whi@ )4 ", 255);

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "Z")
    public static boolean field118 = false;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lo;")
    public static class84 field119 = class15.method124("Hide", 255);

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lo;")
    public static class84 field120 = class15.method124("Loading fonts )2 ", 255);

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lqc;")
    public static class97 field121 = new class97(64);

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
    public static int[] field122 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field123 = 0;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lad;")
    public static class5 field111;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 11)
    public static final void method35(int arg0) {
        field107++;
        if (class40.field805 < 2 && class93.field2048 == 0 && class30.field601 == 0) {
            return;
        }
        class84 var1;
        if (class93.field2048 == 1 && class40.field805 < 2) {
            var1 = class97.method746(0, new class84[] { class33.field643, class106.field2255, class51.field1097 });
        } else if (class30.field601 == 1 && class40.field805 < 2) {
            var1 = class97.method746(0, new class84[] { class101.field2141, class8.field164 });
        } else {
            var1 = class21.field385[class40.field805 - 1];
        }
        if (arg0 < class40.field805) {
            var1 = class97.method746(arg0 - 2, new class84[] { var1, field117, class62.method489(class40.field805 - 2, (byte) -128), class74.field1554 });
        }
        class16.field291.method325(var1, 4, 15, 16777215, true, class128.field2837 / 1000);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lee;", line = 38)
    public static final class30 method36(byte arg0, int arg1) {
        if (arg0 != 30) {
            method35(-11);
        }
        field108++;
        class30 var2 = (class30) field121.method737((long) arg1, (byte) -119);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field1326.method909((byte) -119, arg1, 13);
        class30 var4 = new class30();
        var4.field584 = arg1;
        if (var3 != null) {
            var4.method267(2, new class27(var3));
        }
        field121.method744(-120, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lud;B)V", line = 63)
    public static final void method37(class118 arg0, byte arg1) {
        if (arg1 != -70) {
            method40(-57);
        }
        field112++;
        class50.field1087 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V", line = 85)
    public static void method38(int arg0) {
        field116 = null;
        field120 = null;
        field104 = null;
        field100 = null;
        field121 = null;
        field111 = null;
        int var1 = 31 / ((arg0 + 21) / 54);
        field122 = null;
        field119 = null;
        field115 = null;
        field117 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILeb;I)V", line = 121)
    private final void method39(int arg0, class27 arg1, int arg2) {
        if (arg2 == 1) {
            this.field106 = arg1.method227(127);
            this.field102 = arg1.method231(255);
            this.field99 = arg1.method231(255);
        }
        field114++;
        if (arg0 != 30578) {
            method37(null, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)I", line = 144)
    public static final int method40(int arg0) {
        if (arg0 < 22) {
            return 32;
        } else {
            field110++;
            return 5;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Leb;B)V", line = 159)
    public final void method41(class27 arg0, byte arg1) {
        field109++;
        while (true) {
            int var3 = arg0.method231(255);
            if (var3 == 0) {
                if (arg1 > -118) {
                    field117 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method39(30578, arg0, var3);
        }
    }
}
