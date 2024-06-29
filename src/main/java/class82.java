import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class82 {

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field1291 = 0;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Leh;")
    private class94 field1292;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lhf;")
    private class287 field1290;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lme;")
    public static class295 field1287;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lhf;", line = 16)
    public final class287 method621(int arg0) {
        this.field1291 = arg0;
        field1289++;
        return this.method622(118);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lhf;", line = 29)
    public final class287 method622(int arg0) {
        field1293++;
        if (this.field1291 > 0 && this.field1292.field1463[this.field1291 - 1] != this.field1290) {
            class287 var2 = this.field1290;
            this.field1290 = var2.field4939;
            return var2;
        }
        int var3 = 73 % ((75 - arg0) / 42);
        class287 var4;
        do {
            if (this.field1292.field1453 <= this.field1291) {
                return null;
            }
            var4 = this.field1292.field1463[this.field1291++].field4939;
        } while (this.field1292.field1463[this.field1291 - 1] == var4);
        this.field1290 = var4.field4939;
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 60)
    public static void method623(boolean arg0) {
        if (arg0) {
            method623(true);
        }
        field1287 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIJZI)Ltl;", line = 71)
    public static final class59 method624(byte arg0, int arg1, long arg2, boolean arg3, int arg4) {
        field1288++;
        class59 var6 = class90.method670(arg0 - 104, 0);
        if (arg2 < 0L) {
            arg2 = -arg2;
            var6.method462(class123.field2032, -22);
        }
        class59 var7 = class37.field563;
        class59 var8 = class78.field1247;
        if (arg4 == 1) {
            var7 = class78.field1247;
            var8 = class37.field563;
        }
        if (arg0 != 104) {
            method623(false);
        }
        if (arg4 == 2) {
            var7 = class78.field1247;
            var8 = class108.field1804;
        }
        class59 var9 = class90.method670(arg0 - 104, 0);
        class59 var10 = class90.method670(0, 0);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method462(class81.method619((byte) -110, (int) (arg2 % 10L)), -52);
            arg2 /= 10L;
        }
        if (arg2 == 0L) {
            var9 = class206.field3373;
        }
        int var12 = 0;
        while (arg2 > 0L) {
            if (arg3 && var12 != 0 && (var12 % 3) == 0) {
                var9.method462(var8, 121);
            }
            var9.method462(class81.method619((byte) -107, (int) (arg2 % 10L)), arg0 ^ 0x14);
            var12++;
            arg2 /= 10L;
        }
        if (var10.method495(arg0 - 74) > 0) {
            var10.method462(var7, 124);
        }
        return class233.method1630(new class59[] { var6, var9.method468(0), var10.method468(0) }, -2883);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 143)
    public static final void method625(int arg0) {
        class18.field236.method1765(-1);
        field1286++;
        int var1 = class18.field236.method1762((byte) 124, arg0);
        if (var1 == 0) {
            return;
        }
        int var2 = class18.field236.method1762((byte) 6, 2);
        if (var2 == 0) {
            class301.field5143[class255.field4242++] = 2047;
        } else if (var2 == 1) {
            int var3 = class18.field236.method1762((byte) 81, 3);
            class286.field4920.method794(var3, -121, false);
            int var4 = class18.field236.method1762((byte) -118, 1);
            if (var4 == 1) {
                class301.field5143[class255.field4242++] = 2047;
            }
        } else if (var2 == 2) {
            int var9 = class18.field236.method1762((byte) 68, 3);
            class286.field4920.method794(var9, -125, true);
            int var10 = class18.field236.method1762((byte) -112, 3);
            class286.field4920.method794(var10, -20, true);
            int var11 = class18.field236.method1762((byte) -122, 1);
            if (var11 == 1) {
                class301.field5143[class255.field4242++] = 2047;
            }
        } else if (var2 == 3) {
            int var5 = class18.field236.method1762((byte) -114, 7);
            int var6 = class18.field236.method1762((byte) 114, 1);
            int var7 = class18.field236.method1762((byte) -128, 1);
            if (var7 == 1) {
                class301.field5143[class255.field4242++] = 2047;
            }
            class247.field4119 = class18.field236.method1762((byte) 15, 2);
            int var8 = class18.field236.method1762((byte) -111, 7);
            class286.field4920.method780(var6 == 1, var5, var8, (byte) 50);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Leh;)V", line = 220)
    public class82(class94 arg0) {
        this.field1292 = arg0;
    }
}
