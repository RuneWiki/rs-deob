import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class261 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Ltf;")
    public static class242 field4431 = new class242(64);

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lbe;")
    private static class283 field4436 = class153.method941(126, "flash3:");

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lbe;")
    public static class283 field4437 = field4436;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lbe;")
    public static class283 field4439 = field4436;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Loh;")
    public static class15 field4438 = new class15(16);

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lbe;")
    public static class283 field4442 = class153.method941(125, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lbe;")
    public static class283 field4441 = class153.method941(125, "mapdots");

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1762(int arg0) {
        if (class172.field2908 < 128) {
            class172.field2908 = 128;
        }
        class203.field3477 &= 0x7FF;
        field4433++;
        if (class172.field2908 > 383) {
            class172.field2908 = 383;
        }
        int var1 = class88.field1503 >> 7;
        int var2 = 0;
        int var3 = class154.field2528 >> 7;
        int var4 = class42.method254(class61.field850, class88.field1503, class154.field2528, -20341);
        if (var3 > 3 && var1 > 3 && var3 < 100 && var1 < 100) {
            for (int var5 = var3 - 4; var5 <= (var3 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class61.field850;
                    if (var7 < 3 && (class252.field4282[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class65.field890[var7][var5][var6];
                    if (var8 > var2) {
                        var2 = var8;
                    }
                }
            }
        }
        if (arg0 != 25063) {
            method1767((class69[]) null, -9, 76);
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class196.field3357) {
            class196.field3357 += (var9 - class196.field3357) / 24;
        } else if (class196.field3357 > var9) {
            class196.field3357 += (var9 - class196.field3357) / 80;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 88)
    public static final void method1763(int arg0) {
        field4432++;
        if (arg0 != 2076) {
            return;
        }
        for (int var1 = -1; var1 < class297.field5033; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class162.field2666[var1];
            }
            class191 var3 = class149.field2436[var2];
            if (var3 != null) {
                class118.method753(var3, var3.method460((byte) 126), (byte) -56);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILkd;)V", line = 121)
    public static final void method1764(int arg0, class70 arg1) {
        int var2 = arg1.field1166 - class75.field1309;
        field4430++;
        int var3 = -119 % ((12 - arg0) / 56);
        int var4 = arg1.field1185 * 128 + arg1.method460((byte) 114) * 64;
        int var5 = arg1.field1198 * 128 + arg1.method460((byte) 16) * 64;
        arg1.field1210 += (var5 - arg1.field1210) / var2;
        if (arg1.field1177 == 0) {
            arg1.field1153 = 1024;
        }
        if (arg1.field1177 == 1) {
            arg1.field1153 = 1536;
        }
        if (arg1.field1177 == 2) {
            arg1.field1153 = 0;
        }
        arg1.field1193 += (var4 - arg1.field1193) / var2;
        arg1.field1173 = 0;
        if (arg1.field1177 == 3) {
            arg1.field1153 = 512;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 162)
    public static void method1765(int arg0) {
        field4438 = null;
        field4437 = null;
        field4439 = null;
        field4442 = null;
        field4431 = null;
        field4436 = null;
        field4441 = null;
        if (arg0 != 0) {
            method1762(-72);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)I", line = 179)
    public static final int method1766(byte arg0) {
        field4440++;
        return arg0 <= 109 ? 92 : 6;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([Lkg;II)V", line = 208)
    public static final void method1767(class69[] arg0, int arg1, int arg2) {
        if (arg2 <= 12) {
            return;
        }
        field4434++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class69 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1143 == 0) {
                    if (var4.field1043 != null) {
                        method1767(var4.field1043, arg1, 106);
                    }
                    class159 var5 = (class159) class58.field805.method1612((long) var4.field1079, 117);
                    if (var5 != null) {
                        class99.method654(var5.field2600, arg1, (byte) 67);
                    }
                }
                if (arg1 == 0 && var4.field1140 != null) {
                    class231 var6 = new class231();
                    var6.field3919 = var4.field1140;
                    var6.field3912 = var4;
                    class194.method1253(var6, 21258);
                }
                if (arg1 == 1 && var4.field1077 != null) {
                    if (var4.field1126 >= 0) {
                        class69 var7 = class65.method418(-8429, var4.field1079);
                        if (var7 == null || var7.field1043 == null || var7.field1043.length <= var4.field1126 || var7.field1043[var4.field1126] != var4) {
                            continue;
                        }
                    }
                    class231 var8 = new class231();
                    var8.field3912 = var4;
                    var8.field3919 = var4.field1077;
                    class194.method1253(var8, 21258);
                }
            }
        }
    }
}
