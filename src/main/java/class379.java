import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class379 extends class494 {

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lkg;")
    public static class179 field4996;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "F")
    public static float field4988;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public int field4995;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "J")
    public long field4981;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lrp;")
    public static class302 field4999;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lqn;")
    public static class47 field4982;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "[[[B")
    public static byte[][][] field4998;

    static {
        new class335("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field4997 = 1339;
        field4996 = new class179(32, 8);
        new class335("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        new class335("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2146(int arg0, int arg1) {
        field4994++;
        int var2 = 127 % ((arg1 + 8) / 32);
        int var3 = arg0 & 0x3F;
        int var4 = arg0 >> 6 & 0x3;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)V", line = 56)
    public static void method2147(boolean arg0) {
        field4999 = null;
        field4996 = null;
        field4982 = null;
        field4998 = null;
        if (!arg0) {
            method2156(false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)I", line = 75)
    public static final int method2148(int arg0) {
        field4993++;
        if ((double) class241.field3106 == 3.0D) {
            return 37;
        } else if (arg0 != 1339) {
            return 120;
        } else if ((double) class241.field3106 == 4.0D) {
            return 50;
        } else if ((double) class241.field3106 == 6.0D) {
            return 75;
        } else if ((double) class241.field3106 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 104)
    public static final Object method2149(int arg0, boolean arg1, byte[] arg2) {
        field4986++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 != -20569) {
            field4999 = null;
        }
        if (arg2.length > 136 && !class88.field1092) {
            try {
                class406 var3 = (class406) Class.forName("bg").getDeclaredConstructor().newInstance();
                var3.method1905(arg2, false);
                return var3;
            } catch (Throwable var4) {
                class88.field1092 = true;
            }
        }
        return arg1 ? class196.method1210(arg2, arg0 + 20569) : arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 138)
    public static final void method2150(int arg0, int arg1, int arg2) {
        field4990++;
        class153 var3 = class75.method656(1, 255, arg1);
        int var4 = -110 / ((arg0 + 1) / 36);
        var3.method1003((byte) 123);
        var3.field1933 = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)I", line = 151)
    public final int method2151(int arg0) {
        if (arg0 > -74) {
            return -33;
        } else {
            field4984++;
            return this.field4987;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)I", line = 163)
    public final int method2152(boolean arg0) {
        if (arg0) {
            method2147(true);
        }
        field4985++;
        return this.field4995;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J", line = 174)
    public final long method2153(int arg0) {
        field4992++;
        return arg0 == 1 ? this.field4981 : 111L;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 186)
    public static final void method2154(byte arg0) {
        field4989++;
        if (arg0 != 105) {
            field4988 = 0.46145844F;
        }
        if (class464.field6695) {
            return;
        }
        class469.field6792 = true;
        class464.field6695 = true;
        if (class407.field5817.field3615) {
            class463.field6626 = ((int) class463.field6626 - 65 & 0xFFFFFF80);
        } else {
            class461.field6598 += (-24.0F - class461.field6598) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I", line = 223)
    public final int method2155(byte arg0) {
        field4991++;
        if (arg0 >= -14) {
            field4982 = null;
        }
        return this.field4980;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(Z)V", line = 235)
    public static final void method2156(boolean arg0) {
        field4983++;
        if (!class211.field2717 || !arg0) {
            return;
        }
        class523 var1 = class202.method1268(class21.field309, class322.field4090, 0);
        if (var1 != null && var1.field7565 != null) {
            class170 var2 = new class170();
            var2.field2178 = var1.field7565;
            var2.field2179 = var1;
            class239.method1444(var2);
        }
        class211.field2717 = false;
        class470.field6816 = -1;
        class236.field3000 = -1;
        if (var1 != null) {
            class136.method935(var1, -128);
        }
    }
}
