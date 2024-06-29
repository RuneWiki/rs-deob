import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Liha;")
    private class29 field149 = new class29(64);

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lgda;")
    private class58 field147;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field158 = new String[] { method99(method98("\u0012\b(\tL")), method99(method98("\u0012\b(p\r\n\rrrL")), method99(method98("\u001fJ(b\u0019")), method99(method98("\n\u0011j ")), method99(method98("D\u0014u%\u001e\u0001^")), method99(method98("\u0003\nvxD\u0011\u000f<")), method99(method98("D\u0017o6\u0001^")), method99(method98("\u0003\nv\u007fD\t\ruv")), method99(method98("\u0003\nv~D\u0014\u000buv")), method99(method98("\u0012\b(\rL")), method99(method98("\u0003\nv}D\u0014\u000buv")), method99(method98("\u0012\b(\u000eL")), method99(method98("\u0012\b(\nL")), method99(method98("\u0012\b(\u000fL")), method99(method98("\u0012\b(\u000bL")) };

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Lhl;")
    public static class556 field148 = new class556(57, 6);

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field154 = -1;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lhl;")
    public static class556 field155 = new class556(39, 1);

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Lnp;")
    public static class518 field156;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method91(byte arg0) {
        try {
            field148 = null;
            field156 = null;
            int var1 = -20 / ((44 - arg0) / 57);
            field155 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field158[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILlda;)V")
    public static final void method92(int arg0, int arg1, int arg2, class513 arg3) {
        class290 var4 = class438.method3442(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field4677 = arg3;
        int var5 = class757.field11125 == class740.field10902 ? 1 : 0;
        if (arg3.method41((byte) 118)) {
            if (arg3.method45(-32768)) {
                arg3.field9987 = class50.field608[var5];
                class50.field608[var5] = arg3;
                return;
            }
            arg3.field9987 = class42.field476[var5];
            class42.field476[var5] = arg3;
            class540.field7961 = true;
            return;
        }
        arg3.field9987 = class570.field8262[var5];
        class570.field8262[var5] = arg3;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public final void method93(int arg0) {
        try {
            class29 var2 = this.field149;
            synchronized (this.field149) {
                this.field149.method304(arg0 ^ 0x1);
            }
            if (arg0 != 0) {
                this.method96((byte) -22);
            }
            field146++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field158[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method94(int arg0) {
        try {
            field150++;
            class263.field4275 = 0;
            class245.field3794++;
            class149.field2088 = 0;
            class694.method5041(116);
            class422.method3355(arg0 + 1);
            class57.method567((byte) -36);
            boolean var1 = false;
            for (int var2 = 0; var2 < class263.field4275; var2++) {
                int var3 = class609.field8770[var2];
                class19 var4 = (class19) class176.field2797.method737((byte) -39, (long) var3);
                class426 var5 = var4.field194;
                if (class16.field177 && class29.method299((byte) 123, var3)) {
                    class632.method4589(-19298);
                }
                if (class245.field3794 != var5.field1106) {
                    if (var5.field6716.method1528(arg0)) {
                        class277.method2376(var5, (byte) -113);
                    }
                    var5.method3382(0, null);
                    var1 = true;
                    var4.method4173(arg0 - 1);
                }
            }
            if (var1) {
                class421.field6647 = class176.field2797.method733((byte) 38);
                class176.field2797.method732(-14248, class78.field1214);
            }
            if (class185.field2948.field2663 != class185.field2948.field2660.field2799) {
                throw new RuntimeException(field158[10] + class185.field2948.field2660.field2799 + field158[4] + class185.field2948.field2663);
            }
            for (int var6 = 0; var6 < class632.field9088; var6++) {
                if (class176.field2797.method737((byte) -39, (long) class263.field4278[var6]) == null) {
                    throw new RuntimeException(field158[8] + var6 + field158[6] + class632.field9088);
                }
            }
            if ((class421.field6647 - class632.field9088) != 0) {
                throw new RuntimeException(field158[7] + (class421.field6647 - class632.field9088));
            }
            for (int var7 = arg0; var7 < class421.field6647; var7++) {
                if (class245.field3794 != class78.field1214[var7].field194.field1106) {
                    throw new RuntimeException(field158[5] + class78.field1214[var7].field194.field1129);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field158[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public final void method95(int arg0, int arg1) {
        try {
            class29 var3 = this.field149;
            synchronized (this.field149) {
                if (arg0 != 0) {
                    return;
                }
                this.field149.method294(arg1, -630);
            }
            field151++;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field158[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        try {
            field153++;
            class29 var2 = this.field149;
            synchronized (this.field149) {
                if (arg0 == 19) {
                    this.field149.method298(5);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field158[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)Lav;")
    public final class668 method97(int arg0, byte arg1) {
        try {
            field152++;
            class29 var3 = this.field149;
            class668 var4;
            synchronized (this.field149) {
                var4 = (class668) this.field149.method302(-100, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field147;
            byte[] var6;
            synchronized (this.field147) {
                var6 = this.field147.method604((byte) 26, arg0, 11);
            }
            class668 var7 = new class668();
            if (var6 != null) {
                var7.method4846(new class176(var6), arg1 ^ 0x5E);
            }
            class29 var8 = this.field149;
            synchronized (this.field149) {
                this.field149.method295(false, (long) arg0, var7);
                if (arg1 != 38) {
                    this.method96((byte) 110);
                }
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field158[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class13(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field147 = arg2;
            if (this.field147 != null) {
                this.field147.method580(77, 11);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field158[1] + (arg0 == null ? field158[3] : field158[2]) + ',' + arg1 + ',' + (arg2 == null ? field158[3] : field158[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method98(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method99(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
