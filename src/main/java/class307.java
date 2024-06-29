import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class307 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5242 = 0;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lcd;")
    private static class64 field5241 = class44.method335((byte) 71, "Loaded config");

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field5248 = 0;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "J")
    public static volatile long field5252 = 0L;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5246 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lcd;")
    public static class64 field5243 = field5241;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5244 = 0;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lcd;")
    public static class64 field5253 = class44.method335((byte) 71, "blaugr-Un:");

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5251;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lkh;B)V", line = 20)
    public static final void method2137(class13 arg0, byte arg1) {
        int var2 = 59 % ((arg1 + 4) / 37);
        for (int var3 = 0; var3 < class72.field1398; var3++) {
            int var4 = arg0.method163(255);
            int var5 = arg0.method112((byte) 92);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class70.field1344[var4] != null) {
                class70.field1344[var4].field4576 = var5;
            }
        }
        field5249++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILqm;)V", line = 50)
    public static final void method2138(int arg0, class222 arg1) {
        field5247++;
        if (arg0 != 0) {
            method2137((class13) null, (byte) 44);
        }
        class60.field1172 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BZ)V", line = 64)
    public static final void method2139(byte arg0, boolean arg1) {
        field5240++;
        byte var2;
        byte[][] var3;
        if (class123.field2216 && arg1) {
            var2 = 1;
            var3 = class97.field1768;
        } else {
            var2 = 4;
            var3 = class13.field268;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class246.method1778(5);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class131.field2339[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 3 & 0x7FF;
                            int var12 = (var8 & 0xFFD596) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class89.field1611.length; var14++) {
                                if (class89.field1611[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class157.method1130(var6 * 8, var4, false, arg1, class91.field1637, var9, var10, (var11 & 0x7) * 8, var3[var14], var5 * 8, (var12 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class60.method464(false, var6 * 8, var5 * 8, 8, 8, var4);
                    }
                }
            }
        }
        if (arg0 != 114) {
            field5252 = 23L;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 157)
    public static void method2140(int arg0) {
        field5243 = null;
        if (arg0 == 0) {
            field5253 = null;
            field5241 = null;
            field5251 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V", line = 216)
    public static final void method2141(boolean arg0, int arg1) {
        for (class246 var2 = (class246) class93.field1733.method778(arg1); var2 != null; var2 = (class246) class93.field1733.method775(arg1 ^ 0x6795)) {
            if (var2.field4283 != null) {
                class250.field4341.method1419(var2.field4283);
                var2.field4283 = null;
            }
            if (var2.field4270 != null) {
                class250.field4341.method1419(var2.field4270);
                var2.field4270 = null;
            }
            var2.method232(128);
        }
        field5245++;
        if (!arg0) {
            return;
        }
        for (class246 var3 = (class246) class115.field2115.method778(0); var3 != null; var3 = (class246) class115.field2115.method775(26517)) {
            if (var3.field4283 != null) {
                class250.field4341.method1419(var3.field4283);
                var3.field4283 = null;
            }
            var3.method232(arg1 + 128);
        }
        for (class246 var4 = (class246) class17.field336.method1143(0); var4 != null; var4 = (class246) class17.field336.method1147((byte) 18)) {
            if (var4.field4283 != null) {
                class250.field4341.method1419(var4.field4283);
                var4.field4283 = null;
            }
            var4.method232(128);
        }
    }
}
