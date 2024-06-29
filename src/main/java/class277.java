import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class277 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    private int field4399 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lue;")
    private class222 field4395;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Llm;")
    public static class150 field4401 = new class150(64);

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field4403 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field4406 = 0;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Ltd;")
    public static class225 field4404 = new class225(64);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lhb;")
    private class154 field4394;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Lhb;")
    public final class154 method1797(int arg0) {
        this.field4399 = 0;
        field4402++;
        int var2 = 30 % (arg0 / 50);
        return this.method1801(-101);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Lpc;")
    public static final class13 method1798(byte arg0, int arg1) {
        class13 var2 = (class13) class194.field2960.method1486((long) arg1, -19212);
        field4397++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -40) {
            method1803(86, 50);
        }
        byte[] var3 = class51.field723.method2050(85, 5, arg1);
        class13 var4 = new class13();
        if (var3 != null) {
            var4.method84(new class215(var3), -1);
        }
        class194.field2960.method1489((long) arg1, 107, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method1799(int arg0) {
        if (arg0 != 64) {
            method1803(46, -100);
        }
        field4396++;
        for (class197 var1 = (class197) class69.field966.method369((byte) -91); var1 != null; var1 = (class197) class69.field966.method362(false)) {
            if (var1.field3013 == -1) {
                var1.field3015 = 0;
                class57.method354(var1, -119);
            } else {
                var1.method962(128);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static void method1800(int arg0) {
        field4404 = null;
        if (arg0 != -1) {
            field4404 = null;
        }
        field4401 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)Lhb;")
    public final class154 method1801(int arg0) {
        if (arg0 != -101) {
            this.method1797(-60);
        }
        field4405++;
        if (this.field4399 > 0 && this.field4395.field3448[this.field4399 - 1] != this.field4394) {
            class154 var2 = this.field4394;
            this.field4394 = var2.field2144;
            return var2;
        }
        while (this.field4399 < this.field4395.field3451) {
            class154 var3 = this.field4395.field3448[this.field4399++].field2144;
            if (this.field4395.field3448[this.field4399 - 1] != var3) {
                this.field4394 = var3.field2144;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lue;)V")
    public class277(class222 arg0) {
        this.field4395 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BB)Laa;")
    public static final class43 method1802(byte[] arg0, byte arg1) {
        int var2 = -90 / ((arg1 + 11) / 40);
        field4400++;
        class43 var3 = new class43();
        class215 var4 = new class215(arg0);
        var4.field3280 = var4.field3287.length - 2;
        int var5 = var4.method1379(-107);
        int var6 = var4.field3287.length - var5 - 2 - 12;
        var4.field3280 = var6;
        int var7 = var4.method1383((byte) 113);
        var3.field648 = var4.method1379(-87);
        var3.field642 = var4.method1379(-102);
        var3.field656 = var4.method1379(-96);
        var3.field644 = var4.method1379(-119);
        int var8 = var4.method1374((byte) -60);
        if (var8 > 0) {
            var3.field655 = new class222[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var4.method1379(-123);
                class222 var11 = new class222(class216.method1406(true, var10));
                var3.field655[var9] = var11;
                while ((var10--) > 0) {
                    int var12 = var4.method1383((byte) -109);
                    int var13 = var4.method1383((byte) -94);
                    var11.method1452((long) var12, new class313(var13), 0);
                }
            }
        }
        var4.field3280 = 0;
        int var14 = 0;
        var3.field640 = var4.method1362((byte) 118);
        var3.field652 = new int[var7];
        var3.field650 = new int[var7];
        var3.field636 = new String[var7];
        while (var6 > var4.field3280) {
            int var15 = var4.method1379(-95);
            if (var15 == 3) {
                var3.field636[var14] = var4.method1376(-113).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var3.field652[var14] = var4.method1374((byte) -60);
            } else {
                var3.field652[var14] = var4.method1383((byte) 33);
            }
            var3.field650[var14++] = var15;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public static final void method1803(int arg0, int arg1) {
        field4398++;
        class39 var2 = class149.method935(-99, arg0, 6);
        if (arg1 != 30153) {
            field4401 = null;
        }
        var2.method268((byte) -19);
    }
}
