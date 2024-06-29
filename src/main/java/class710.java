import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class710 extends class103 implements class682 {

    @OriginalMember(owner = "client!nfa", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field10284 = new String[] { method5160(method5159("v95TE0")), method5160(method5159("v95TD0")), method5160(method5159("v95TI0")), method5160(method5159("v95TO0")), method5160(method5159("v95TN0")), method5160(method5159("v95TJ0")), method5160(method5159("v95TL0")), method5160(method5159("v*8\u0016")), method5160(method5159("cqzTp")), method5160(method5159("v95TH0")) };

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "Lko;")
    public static class532 field10275 = new class532("", 10);

    @OriginalMember(owner = "client!nfa", name = "G", descriptor = "Z")
    public static volatile boolean field10282 = true;

    @OriginalMember(owner = "client!nfa", name = "H", descriptor = "Lmp;")
    public static class796 field10281 = new class796(method5160(method5159("T\u0016\u0002?")), "", "", 0);

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "B")
    private byte field10277;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
    public static int field10273;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!nfa", name = "E", descriptor = "I")
    public static int field10278;

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "[[I")
    public static int[][] field10276;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)I")
    public final int method975(boolean arg0) {
        try {
            ++field10274;
            if (arg0) {
                this.method975(false);
            }
            return super.method975(false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10284[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)Z")
    public final boolean method3932(byte arg0) {
        try {
            ++field10273;
            if (arg0 != -114) {
                field10275 = null;
            }
            return super.method977(arg0 ^ 11, super.field1503.field4544);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10284[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Ltia;Z)V")
    public class710(class278 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BII)Z")
    public final boolean method3933(byte arg0, int arg1, int arg2) {
        try {
            this.field10277 = (byte) arg2;
            ++field10280;
            super.method980(arg1, false);
            if (arg0 >= -22) {
                this.method975(false);
            }
            return true;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10284[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)I")
    public final int method5157(boolean arg0) {
        try {
            if (!arg0) {
                field10282 = false;
            }
            ++field10272;
            return this.field10277;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10284[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
    public final void method981(int arg0) {
        try {
            ++field10278;
            super.method981(arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10284[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method3931(int arg0, int arg1, int arg2, Source arg3) {
        try {
            ++field10279;
            this.field10277 = (byte) arg0;
            super.method973(arg2, arg3, -1);
            return arg1 < 42 ? true : true;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10284[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10284[8] : field10284[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "(B)V")
    public static void method5158(byte arg0) {
        try {
            if (arg0 != -65) {
                method5158((byte) 88);
            }
            field10275 = null;
            field10281 = null;
            field10276 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10284[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method3929(boolean arg0, int arg1) {
        try {
            if (arg1 != -31222) {
                this.method975(false);
            }
            ++field10283;
            return super.method978((byte) -34, arg0, super.field1503.field4544);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10284[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5159(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5160(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
