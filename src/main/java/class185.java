import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class185 extends class45 {

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lwf;")
    public static class1 field2507 = new class1(5000);

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lar;")
    public static class47 field2509 = new class47();

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Llm;")
    public static class347 field2501;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lcq;")
    public class67 field2500;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Z")
    public boolean field2506;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Llm;B)V")
    public static final void method1122(class347 arg0, byte arg1) {
        field2508++;
        if (arg1 != 18) {
            field2510 = 52;
        }
        class89.field1244 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILnj;)Llj;")
    public static final class41 method1123(int arg0, class228 arg1) {
        field2504++;
        if (arg0 == -2) {
            class41 var2 = new class41();
            var2.field574 = arg1.method1343(255);
            var2.field569 = class418.method2678(var2.field574, arg0 + 14319);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)Lep;")
    public static final class145 method1124(int arg0, byte[] arg1) {
        field2505++;
        class145 var2 = new class145();
        class228 var3 = new class228(arg1);
        var3.field3029 = var3.field3040.length - 2;
        int var4 = var3.method1343(255);
        int var5 = var3.field3040.length - var4 - 2 - 12;
        var3.field3029 = var5;
        int var6 = var3.method1344((byte) 61);
        var2.field1986 = var3.method1343(255);
        var2.field1994 = var3.method1343(arg0 ^ 0xFF);
        var2.field1991 = var3.method1343(255);
        var2.field1987 = var3.method1343(arg0 ^ 0xFF);
        int var7 = var3.method1348(arg0 - 87);
        if (var7 > 0) {
            var2.field1989 = new class56[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1343(255);
                class56 var10 = new class56(class139.method896(var9, 84));
                var2.field1989[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1344((byte) 47);
                    int var12 = var3.method1344((byte) 120);
                    var10.method381(true, new class279(var12), (long) var11);
                }
            }
        }
        var3.field3029 = arg0;
        var2.field1981 = var3.method1337(arg0 ^ 0x79);
        var2.field1993 = new String[var6];
        var2.field1996 = new int[var6];
        var2.field1995 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field3029) {
            int var14 = var3.method1343(255);
            if (var14 == 3) {
                var2.field1993[var13] = var3.method1329(991328496).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1995[var13] = var3.method1348(-87);
            } else {
                var2.field1995[var13] = var3.method1344((byte) 49);
            }
            var2.field1996[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method1125(int arg0, int arg1) {
        class189 var2 = class346.field4984;
        synchronized (class346.field4984) {
            int var3 = 43 % ((arg0 + 34) / 45);
            class346.field4984.method1142((byte) -126, arg1);
        }
        field2502++;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static final void method1126(int arg0) {
        field2499++;
        if (class83.field1200) {
            return;
        }
        int var1 = -28 / ((-arg0 - 51) / 50);
        if (class184.field2496) {
            class396.field5847 = (float) ((int) class396.field5847 + 191 & 0xFFFFFF80);
        } else {
            class178.field2361 += (24.0F - class178.field2361) / 2.0F;
        }
        class83.field1200 = true;
        class172.field2303 = true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lcd;IIZ)V")
    public static final void method1127(class43 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field2503++;
        if (arg0.field4290 == arg2 && arg2 != -1) {
            class12 var4 = class33.method221((byte) 102, arg2);
            int var5 = var4.field193;
            if (var5 == 1) {
                arg0.field4300 = 0;
                arg0.field4332 = arg1;
                arg0.field4291 = 0;
                arg0.field4305 = 1;
                arg0.field4270 = 0;
                class298.method2049(arg0.field734, false, arg0.field740, 9757, arg0.field4300, var4);
            }
            if (var5 == 2) {
                arg0.field4270 = 0;
                return;
            }
        } else if (arg2 == -1 || arg0.field4290 == -1 || class33.method221((byte) 102, arg2).field190 >= class33.method221((byte) 102, arg0.field4290).field190) {
            arg0.field4270 = 0;
            arg0.field4300 = 0;
            arg0.field4332 = arg1;
            arg0.field4365 = arg0.field4369;
            arg0.field4291 = 0;
            arg0.field4305 = 1;
            arg0.field4290 = arg2;
            if (arg0.field4290 == -1) {
                return;
            }
            class298.method2049(arg0.field734, false, arg0.field740, 9757, arg0.field4300, class33.method221((byte) 102, arg0.field4290));
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static void method1128(int arg0) {
        field2509 = null;
        field2501 = null;
        if (arg0 >= -74) {
            field2509 = null;
        }
        field2507 = null;
    }
}
