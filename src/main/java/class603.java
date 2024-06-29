import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class603 extends class459 {

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "Ljava/lang/String;")
    public String field8710;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "Lwca;")
    public class708 field8713;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field8717 = new String[] { method4418(method4417("\u0016\u001d\u0017{V")), method4418(method4417("\r\u0007UV")), method4418(method4417("\u0016\u001d\u0017\u0006\u0017\r\u001bM\u0004V")), method4418(method4417("\u0018\\\u0017\u0014\u0003")), method4418(method4417("\u0016\u001d\u0017~V")), method4418(method4417("\u0016\u001d\u0017yV")), method4418(method4417("\u0016\u001d\u0017xV")) };

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "Lhl;")
    public static class556 field8709 = new class556(26, 4);

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field8716 = 0;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public int field8711;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "[[Lpea;")
    public static class758[][] field8714;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I", line = 4)
    public final int method4413(int arg0) {
        try {
            field8708++;
            int var2 = -117 / ((arg0 + 44) / 56);
            return this.field8713.field10193.field7074 == this.field8713.field10193 ? -1 : ((class59) this.field8713.field10193.field7074).field773;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8717[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILmk;)Z", line = 29)
    public final boolean method4414(int arg0, class59 arg1) {
        try {
            field8715++;
            int var3 = this.method4413(-112);
            arg1.method3558((byte) 118);
            this.field8711--;
            if (this.field8711 != arg0) {
                return this.method4413(107) != var3;
            }
            this.method4173(-1);
            this.method3558((byte) 71);
            class681.field9707--;
            class381.field6128.method295(false, arg1.field767, this);
            return false;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8717[6] + arg0 + ',' + (arg1 == null ? field8717[1] : field8717[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLmk;)Z", line = 52)
    public final boolean method4415(boolean arg0, class59 arg1) {
        try {
            field8712++;
            boolean var3 = true;
            arg1.method3558((byte) 117);
            class59 var4 = (class59) this.field8713.method5147((byte) -124);
            while (var4 != null) {
                if (class315.method2689(arg1.field773, -2, var4.field773)) {
                    class466.method3596(arg1, 2, var4);
                    this.field8711++;
                    if (var3) {
                        return false;
                    }
                    return true;
                }
                var4 = (class59) this.field8713.method5144(256);
                var3 = false;
            }
            this.field8713.method5142(arg1, (byte) -63);
            if (arg0) {
                this.field8713 = null;
            }
            this.field8711++;
            return var3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8717[4] + arg0 + ',' + (arg1 == null ? field8717[1] : field8717[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 88)
    public static void method4416(int arg0) {
        try {
            if (arg0 != -1) {
                method4416(91);
            }
            field8709 = null;
            field8714 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8717[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 98)
    public class603(String arg0) {
        try {
            this.field8710 = arg0;
            this.field8713 = new class708();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8717[2] + (arg0 == null ? field8717[1] : field8717[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4417(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4418(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
