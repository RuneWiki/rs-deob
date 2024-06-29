import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class81 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lma;")
    private class274 field1310 = new class274();

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lff;")
    private class47 field1312;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lve;")
    public static class255 field1306 = class87.method607(56, "gelb:");

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Lve;")
    public static class255 field1315 = class87.method607(101, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Lfj;")
    public static class228 field1318;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
    public static boolean field1317;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[Lud;")
    public static class269[] field1313;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 20)
    public final void method553(int arg0) {
        field1307++;
        this.field1310.method1918((byte) -88);
        int var2 = -34 / ((arg0 - 50) / 62);
        this.field1312.method275(-671198520);
        this.field1321 = this.field1320;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 40)
    public final void method554(int arg0) {
        field1308++;
        if (arg0 != 0) {
            return;
        }
        for (class2 var2 = (class2) this.field1310.method1919(false); var2 != null; var2 = (class2) this.field1310.method1917(arg0 - 1)) {
            if (var2.method5(30757)) {
                var2.method1502((byte) -82);
                var2.method2024((byte) 92);
                this.field1321++;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 67)
    public final void method555(Object arg0, long arg1, int arg2) {
        field1304++;
        this.method559(arg1, (byte) 75);
        if (this.field1321 == 0) {
            class2 var5 = (class2) this.field1310.method1920((byte) 11);
            var5.method1502((byte) -82);
            var5.method2024((byte) 96);
        } else {
            this.field1321--;
        }
        class144 var6 = new class144(arg0);
        this.field1312.method284(true, arg1, var6);
        this.field1310.method1923(-8121, var6);
        var6.field4903 = (long) arg2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lve;", line = 92)
    public static final class255 method556(int arg0, int arg1) {
        field1316++;
        if (arg0 >= 999999999) {
            int var2 = -46 / ((-arg1 - 6) / 42);
            return class37.field563;
        } else {
            return class215.method1532(arg0, true);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 111)
    public static final void method557(int arg0) {
        field1309++;
        if (arg0 <= 65) {
            field1317 = true;
        }
        class271.field4658.method554(0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 136)
    public final Object method558(long arg0, boolean arg1) {
        field1314++;
        class2 var4 = (class2) this.field1312.method280(arg0, 29153);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method9(0);
        if (!arg1) {
            field1317 = false;
        }
        if (var5 == null) {
            var4.method1502((byte) -82);
            var4.method2024((byte) 108);
            this.field1321++;
            return null;
        }
        if (var4.method5(30757)) {
            class144 var6 = new class144(var5);
            this.field1312.method284(true, var4.field3568, var6);
            this.field1310.method1923(-8121, var6);
            var6.field4903 = 0L;
            var4.method1502((byte) -82);
            var4.method2024((byte) 124);
        } else {
            this.field1310.method1923(-8121, var4);
            var4.field4903 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(JB)V", line = 187)
    public final void method559(long arg0, byte arg1) {
        class2 var4 = (class2) this.field1312.method280(arg0, 29153);
        if (var4 != null) {
            var4.method1502((byte) -82);
            var4.method2024((byte) 108);
            this.field1321++;
        }
        field1311++;
        int var5 = -75 % ((-arg1 - 45) / 61);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 209)
    public static void method560(byte arg0) {
        field1306 = null;
        field1313 = null;
        field1315 = null;
        field1318 = null;
        if (arg0 != 0) {
            field1313 = (class269[]) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Lfc;", line = 222)
    public static final class213 method561(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4183;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V", line = 278)
    public class81(int arg0) {
        this.field1320 = arg0;
        this.field1321 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1312 = new class47(var2);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V", line = 233)
    public final void method562(byte arg0, int arg1) {
        if (class13.field177 != null) {
            for (class2 var3 = (class2) this.field1310.method1919(false); var3 != null; var3 = (class2) this.field1310.method1917(-1)) {
                if (var3.method5(30757)) {
                    if (var3.method9(0) == null) {
                        var3.method1502((byte) -82);
                        var3.method2024((byte) 113);
                        this.field1321++;
                    }
                } else if ((long) arg1 < ++var3.field4903) {
                    class2 var4 = class13.field177.method1307(var3, (byte) 90);
                    this.field1312.method284(true, var3.field3568, var4);
                    class234.method1624(var4, (byte) -46, var3);
                    var3.method1502((byte) -82);
                    var3.method2024((byte) 115);
                }
            }
        }
        if (arg0 <= 42) {
            this.method562((byte) 40, 65);
        }
        field1319++;
    }
}
