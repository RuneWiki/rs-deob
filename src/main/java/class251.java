import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class251 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lwj;")
    public static class153 field4153 = new class153(128);

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lma;")
    public static class5 field4165 = class12.method119("runes", (byte) 120);

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Z")
    public static boolean field4162 = false;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lma;")
    public static class5 field4164 = class12.method119("Ladevorgang )2 bitte warten Sie)3", (byte) 73);

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Lma;")
    public static class5 field4167 = class12.method119("<col=ffffff> )4 ", (byte) 109);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lma;")
    public static class5 field4160 = class12.method119("Ablegen", (byte) 64);

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lma;")
    public static class5 field4161 = class12.method119("", (byte) 54);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
    public static int[] field4159;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[[Z")
    public static boolean[][] field4166;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1751(int arg0, int arg1) {
        field4154++;
        if (!(arg1 < 97 || arg1 > 122) || !(arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg0 == -15117) {
            return arg1 == 156 ? 140 : arg1;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BZ)V", line = 33)
    public static final void method1752(byte arg0, boolean arg1) {
        for (int var2 = 0; var2 < class129.field1940; var2++) {
            class177 var3 = class119.field1804[class73.field1153[var2]];
            long var4 = (long) class73.field1153[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method117((byte) -122) && var3.field2699.field4894 == arg1 && var3.field2699.method1947((byte) -101)) {
                int var6 = var3.field178 >> 7;
                int var7 = var3.field211 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field226 == 1 && (var3.field178 & 0x7F) == 64 && (var3.field211 & 0x7F) == 64) {
                        if (class165.field2523[var6][var7] == class60.field938) {
                            continue;
                        }
                        class165.field2523[var6][var7] = class60.field938;
                    }
                    if (!var3.field2699.field4879) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field185 = class20.method161(var3.field211, var3.field178, 1, class276.field4701);
                    class11.method114(class276.field4701, var3.field178, var3.field211, var3.field185, (var3.field226 - 1) * 64 + 60, var3, var3.field174, var4, var3.field225);
                }
            }
        }
        if (arg0 > -118) {
            method1756(-64);
        }
        field4151++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)I", line = 98)
    public static final int method1755(int arg0, int arg1) {
        field4157++;
        if (arg0 != 19206) {
            field4158 = -5;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 119)
    public static void method1756(int arg0) {
        if (arg0 != -31935) {
            method1752((byte) 26, false);
        }
        field4164 = null;
        field4165 = null;
        field4160 = null;
        field4153 = null;
        field4161 = null;
        field4166 = (boolean[][]) null;
        field4167 = null;
        field4159 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILni;I)Lfi;", line = 142)
    public static final class222 method1757(int arg0, int arg1, class202 arg2, int arg3) {
        field4152++;
        if (arg3 == 64) {
            return class180.method1171(arg0, arg1, arg2, (byte) -128) ? class223.method1583(0) : null;
        } else {
            return (class222) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 175)
    protected class251() {
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method1753(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public abstract void method1754(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5);
}
