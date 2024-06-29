import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class60 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lbf;")
    private class17 field1235 = new class17(256);

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lbf;")
    private class17 field1243 = new class17(256);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lga;")
    private class58 field1237;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lga;")
    private class58 field1231;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1234 = -2;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Led;")
    private static class43 field1241 = class191.method1219("Too many connections from your address)3", false);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Led;")
    public static class43 field1226 = class191.method1219("<img=0>", false);

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Led;")
    public static class43 field1239 = field1241;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Led;")
    private static class43 field1244 = class191.method1219("Please check your message)2centre for details)3", false);

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Led;")
    public static class43 field1236 = field1244;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Ltg;")
    public static class179 field1229;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB[I)Lgf;")
    private final class62 method378(int arg0, int arg1, byte arg2, int[] arg3) {
        field1233++;
        int var5 = (arg0 >>> 12 | (arg0 & 0xB0000FFF) << 4) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class62 var9 = (class62) this.field1243.method75(var7, -122);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg2 <= 48) {
                this.field1231 = null;
            }
            class130 var10 = (class130) this.field1235.method75(var7, -127);
            if (var10 == null) {
                var10 = class130.method846(this.field1237, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1235.method82(-79, var10, var7);
            }
            class62 var11 = var10.method841(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method417(17);
                this.field1243.method82(66, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([IIII)Lgf;")
    private final class62 method379(int[] arg0, int arg1, int arg2, int arg3) {
        field1232++;
        if (arg2 != -2) {
            method382((byte) -116);
        }
        int var5 = arg1 ^ ((arg3 & 0xFFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class62 var9 = (class62) this.field1243.method75(var7, -66);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class8 var10 = class8.method46(this.field1231, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class62 var11 = var10.method44();
            this.field1243.method82(-73, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field1262.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)V")
    public static final void method380(byte arg0, long arg1) {
        field1230++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 >= -11) {
            field1229 = null;
        }
        for (int var3 = 0; var3 < class40.field778; var3++) {
            if (class117.field2286[var3] == arg1) {
                class40.field778--;
                class122.field2440++;
                for (int var4 = var3; var4 < class40.field778; var4++) {
                    class148.field3018[var4] = class148.field3018[var4 + 1];
                    class80.field1585[var4] = class80.field1585[var4 + 1];
                    class117.field2286[var4] = class117.field2286[var4 + 1];
                    class78.field1545[var4] = class78.field1545[var4 + 1];
                }
                class27.field479 = class200.field3940;
                class29.field522.method338(253, 99);
                class29.field522.method550(-90, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI[I)Lgf;")
    public final class62 method381(byte arg0, int arg1, int[] arg2) {
        field1240++;
        if (arg0 != 107) {
            return null;
        } else if (this.field1231.method357(67) == 1) {
            return this.method379(arg2, arg1, -2, 0);
        } else if (this.field1231.method344(arg1, 1) == 1) {
            return this.method379(arg2, 0, arg0 - 109, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static final void method382(byte arg0) {
        class17.field274 = null;
        class66.field1328 = null;
        if (arg0 >= -92) {
            return;
        }
        field1227++;
        class52.field1055 = null;
        class1.field1 = null;
        class30.field573 = null;
        class114.field2220 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([III)Lgf;")
    public final class62 method383(int[] arg0, int arg1, int arg2) {
        field1242++;
        if (this.field1237.method357(84) == 1) {
            return this.method378(0, arg1, (byte) 85, arg0);
        } else if (arg2 != -14692) {
            return null;
        } else if (this.field1237.method344(arg1, 1) == 1) {
            return this.method378(arg1, 0, (byte) 86, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        field1226 = null;
        field1244 = null;
        field1241 = null;
        field1229 = null;
        if (arg0 >= 97) {
            field1236 = null;
            field1239 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lga;Lga;)V")
    public class60(class58 arg0, class58 arg1) {
        this.field1237 = arg1;
        this.field1231 = arg0;
    }
}
