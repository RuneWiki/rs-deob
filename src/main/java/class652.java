import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class652 {

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    private int field9238 = 0;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public int field9233;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "[Lii;")
    public class513[] field9222;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Lgga;")
    public static class265 field9230 = new class265();

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "J")
    private long field9229;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "Lii;")
    private class513 field9232;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "Lii;")
    private class513 field9241;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "Z")
    public static boolean field9240;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field9237;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 4)
    public static final void method3668(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field9242++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class188.field2292.field4232 : class188.field2292.field4230);
        for (int var8 = var6; var8 < var7; var8++) {
            class406 var11 = class188.field2292.method1869(var8, -106);
            if (var11.field5762 && var11.method2464(true).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class70.field1071 = null;
                    class596.field8615 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class596.field8615 = var5;
        class285.field3862 = 0;
        class70.field1071 = var4;
        String[] var9 = new String[class596.field8615];
        for (int var10 = arg0; var10 < class596.field8615; var10++) {
            var9[var10] = class188.field2292.method1869(var4[var10], -105).method2464(true);
        }
        class228.method1386(var9, 77, class70.field1071);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Lii;", line = 74)
    public final class513 method3669(byte arg0) {
        if (arg0 != 28) {
            this.field9233 = 53;
        }
        this.field9238 = 0;
        field9227++;
        return this.method3676((byte) -12);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(JLii;B)V", line = 89)
    public final void method3670(long arg0, class513 arg1, byte arg2) {
        if (arg1.field7522 != null) {
            arg1.method3045(true);
        }
        if (arg2 != 127) {
            this.field9229 = -17L;
        }
        field9228++;
        class513 var5 = this.field9222[(int) (arg0 & (long) (this.field9233 - 1))];
        arg1.field7520 = var5;
        arg1.field7522 = var5.field7522;
        arg1.field7522.field7520 = arg1;
        arg1.field7520.field7522 = arg1;
        arg1.field7519 = arg0;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)Lii;", line = 114)
    public final class513 method3671(byte arg0) {
        field9226++;
        if (arg0 <= 58) {
            field9237 = null;
        }
        if (this.field9232 == null) {
            return null;
        }
        class513 var2 = this.field9222[(int) ((long) (this.field9233 - 1) & this.field9229)];
        while (this.field9232 != var2) {
            if (this.field9232.field7519 == this.field9229) {
                class513 var3 = this.field9232;
                this.field9232 = this.field9232.field7520;
                return var3;
            }
            this.field9232 = this.field9232.field7520;
        }
        this.field9232 = null;
        return null;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)I", line = 145)
    public static final int method3672(byte arg0) {
        if (arg0 != 123) {
            field9230 = null;
        }
        field9225++;
        return 19;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)I", line = 156)
    public final int method3673(int arg0) {
        field9235++;
        if (arg0 != 17467) {
            this.method3679(-101);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field9233; var3++) {
            class513 var4 = this.field9222[var3];
            class513 var5 = var4.field7520;
            while (var4 != var5) {
                var5 = var5.field7520;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(B)V", line = 192)
    public final void method3674(byte arg0) {
        for (int var2 = 0; var2 < this.field9233; var2++) {
            class513 var3 = this.field9222[var2];
            while (true) {
                class513 var4 = var3.field7520;
                if (var3 == var4) {
                    break;
                }
                var4.method3045(true);
            }
        }
        field9239++;
        if (arg0 > -13) {
            method3668(-33, true, null);
        }
        this.field9241 = null;
        this.field9232 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([Lii;I)I", line = 227)
    public final int method3675(class513[] arg0, int arg1) {
        if (arg1 >= -22) {
            method3668(-77, false, null);
        }
        field9224++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field9233; var4++) {
            class513 var5 = this.field9222[var4];
            for (class513 var6 = var5.field7520; var6 != var5; var6 = var6.field7520) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "(B)Lii;", line = 258)
    public final class513 method3676(byte arg0) {
        field9234++;
        if (this.field9238 > 0 && this.field9222[this.field9238 - 1] != this.field9241) {
            class513 var2 = this.field9241;
            this.field9241 = var2.field7520;
            return var2;
        }
        if (arg0 != -12) {
            this.method3674((byte) -115);
        }
        while (this.field9238 < this.field9233) {
            class513 var3 = this.field9222[this.field9238++].field7520;
            if (this.field9222[this.field9238 - 1] != var3) {
                this.field9241 = var3.field7520;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V", line = 291)
    public static void method3677(int arg0) {
        if (arg0 <= 29) {
            method3672((byte) -106);
        }
        field9237 = null;
        field9230 = null;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(I)V", line = 304)
    public class652(int arg0) {
        this.field9233 = arg0;
        this.field9222 = new class513[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class513 var3 = this.field9222[var2] = new class513();
            var3.field7522 = var3;
            var3.field7520 = var3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(JI)Lii;", line = 327)
    public final class513 method3678(long arg0, int arg1) {
        this.field9229 = arg0;
        field9236++;
        class513 var4 = this.field9222[(int) ((long) (this.field9233 - 1) & arg0)];
        for (this.field9232 = var4.field7520; this.field9232 != var4; this.field9232 = this.field9232.field7520) {
            if (this.field9232.field7519 == arg0) {
                class513 var5 = this.field9232;
                this.field9232 = this.field9232.field7520;
                return var5;
            }
        }
        if (arg1 >= -118) {
            this.method3670(22L, null, (byte) -47);
        }
        this.field9232 = null;
        return null;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)I", line = 357)
    public final int method3679(int arg0) {
        field9231++;
        if (arg0 != 2) {
            this.method3671((byte) 109);
        }
        return this.field9233;
    }
}
