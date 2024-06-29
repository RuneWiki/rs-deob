import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class116 {

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lub;")
    public static class227 field2122 = class257.method1749("Angreifen", 17263);

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lub;")
    public static class227 field2132 = class257.method1749("lila:", 17263);

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[I")
    public static int[] field2137 = new int[100];

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2131 = -1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "J")
    public static long field2117;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Ljg;")
    public static class77 field2129;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
    public static final int method732(byte arg0) {
        if (arg0 > -30) {
            method734((byte) -82, (Component) null);
        }
        field2133++;
        return ((class248.field4311 == 0 ? 0 : 1) << 22) + ((class179.field3072 == 0 ? 0 : 1) << 21) + ((class71.field1256 ? 1 : 0) << 19) + (class14.field274 & 0x3 << 17) + ((client.field1450 ? 1 : 0) << 16) + ((class13.field251 ? 1 : 0) << 15) + ((class221.field3753 & 0x3) << 11) + ((class220.field3721 ? 1 : 0) << 10) + ((class128.field2262 ? 1 : 0) << 9) + ((class70.field1234 ? 1 : 0) << 8) + ((class77.field1358 ? 1 : 0) << 7) + ((class254.field4463 ? 1 : 0) << 5) + ((class95.field1645 ? 1 : 0) << 4) + (class125.field2242 & 0x7) + ((class67.field1216 ? 1 : 0) << 3) + ((class193.field3294 == 0 ? 0 : 1) << 20) - (-((class186.field3168 ? 1 : 0) << 6) + -((class31.field492 ? 1 : 0) << 13));
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILja;I)V")
    public static final void method733(int arg0, class4 arg1, int arg2) {
        field2140++;
        if (arg0 != -18677585) {
            return;
        }
        if (arg1.field66 > class253.field4393) {
            class45.method253(arg1, arg0 + 18671246);
        } else if (arg1.field65 >= class253.field4393) {
            class13.method61(-101, arg1);
        } else {
            class26.method132(-98, arg1);
        }
        if (arg1.field50 < 128 || arg1.field99 < 128 || arg1.field50 >= 13184 || arg1.field99 >= 13184) {
            arg1.field65 = 0;
            arg1.field69 = -1;
            arg1.field101 = -1;
            arg1.field50 = arg1.field78[0] * 128 + arg1.field45 * 64;
            arg1.field99 = arg1.field49[0] * 128 + arg1.field45 * 64;
            arg1.field66 = 0;
            arg1.method17((byte) 103);
        }
        if (class216.field3639 == arg1 && (arg1.field50 < 1536 || arg1.field99 < 1536 || arg1.field50 >= 11776 || arg1.field99 >= 11776)) {
            arg1.field66 = 0;
            arg1.field69 = -1;
            arg1.field65 = 0;
            arg1.field99 = arg1.field49[0] * 128 + arg1.field45 * 64;
            arg1.field50 = arg1.field78[0] * 128 + (arg1.field45 * 64);
            arg1.field101 = -1;
            arg1.method17((byte) 7);
        }
        class122.method757(arg1, (byte) 24);
        class112.method714(arg1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method734(byte arg0, Component arg1) {
        field2134++;
        Method var2 = class239.field4156;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        int var3 = 27 / ((arg0 + 20) / 61);
        arg1.addKeyListener(class134.field2341);
        arg1.addFocusListener(class134.field2341);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method735(byte arg0) {
        field2137 = null;
        field2129 = null;
        field2132 = null;
        int var1 = -4 % ((arg0 + 58) / 39);
        field2122 = null;
    }
}
