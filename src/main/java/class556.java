import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class556 {

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field8112;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    private int field8114;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8119 = new String[] { method4110(method4109("K\u0013@.\u001cp\u000b\u001c3\u001dDW")), method4110(method4109("K\u0013@\u0019[")), method4110(method4109("K\u0013@\u0018[")), method4110(method4109("K\u0013@f\u001aM\u0016\u001ad[")), method4110(method4109("K\u0013@\u001b[")) };

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Lua;")
    public static class696 field8116 = new class696(3);

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lvn;")
    public static class330 field8117 = new class330(2, -1);

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Lhl;")
    public static class556 field8118 = new class556(113, -1);

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method4106(int arg0) {
        try {
            if (class355.field5711 != null) {
                class355.field5711.method4925(-24773);
            }
            field8113++;
            if (arg0 == 2 && class789.field11526 != null) {
                while (true) {
                    try {
                        class789.field11526.join();
                        return;
                    } catch (InterruptedException var2) {
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8119[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static void method4107(int arg0) {
        try {
            field8117 = null;
            field8116 = null;
            field8118 = null;
            if (arg0 != -28632) {
                method4106(49);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8119[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
    public final int method4108(byte arg0) {
        try {
            field8111++;
            if (arg0 <= 14) {
                this.method4108((byte) 63);
            }
            return this.field8114;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8119[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field8115++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8119[0] + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V")
    public class556(int arg0, int arg1) {
        try {
            this.field8112 = arg1;
            this.field8114 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8119[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4109(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4110(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
