import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class34 {

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lde;")
    public class24 field858 = new class24();

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
    public static int[] field837 = new int[500];

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field842 = 0;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lv;")
    public static class122 field849 = class55.method425(-69, "Benutzen Sie die (WPasswort \u001c1ndern(W Option");

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lv;")
    private static class122 field861 = class55.method425(-66, "Prepared visibility map");

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lv;")
    public static class122 field860 = class55.method425(-86, " hat sich eingeloggt)3");

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lv;")
    private static class122 field859 = class55.method425(-96, "Loaded title screen");

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field840 = 0;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Lv;")
    public static class122 field863 = field861;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lv;")
    public static class122 field862 = field859;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field854 = 0;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lv;")
    private static class122 field853 = class55.method425(-66, "Add ignore");

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lv;")
    public static class122 field846 = field853;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lv;")
    public static class122 field867 = class55.method425(-76, "Aus");

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lv;")
    private static class122 field857 = class55.method425(-107, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lv;")
    public static class122 field866 = field857;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Lrd;")
    public static class106 field868;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lde;")
    private class24 field869;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[Lvb;")
    public static class124[] field835;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "[[[B")
    public static byte[][][] field864;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lde;Lde;I)V", line = 9)
    public final void method300(class24 arg0, class24 arg1, int arg2) {
        if (arg1.field642 != null) {
            arg1.method249(0);
        }
        if (arg2 != 0) {
            return;
        }
        field843++;
        arg1.field654 = arg0;
        arg1.field642 = arg0.field642;
        arg1.field642.field654 = arg1;
        arg1.field654.field642 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLde;)V", line = 32)
    public final void method301(boolean arg0, class24 arg1) {
        if (arg1.field642 != null) {
            arg1.method249(0);
        }
        field836++;
        arg1.field642 = this.field858;
        if (arg0) {
            this.method312(false, null);
        }
        arg1.field654 = this.field858.field654;
        arg1.field642.field654 = arg1;
        arg1.field654.field642 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lde;", line = 61)
    public final class24 method302(byte arg0) {
        if (arg0 > -23) {
            this.method308((byte) -54);
        }
        field839++;
        class24 var2 = this.field869;
        if (this.field858 == var2) {
            this.field869 = null;
            return null;
        } else {
            this.field869 = var2.field654;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZIIIBILrd;)V", line = 88)
    public static final void method303(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class106 arg6) {
        field845++;
        long var7 = (long) ((arg1 << 16) + arg5);
        class82 var9 = (class82) class56.field1474.method631(var7, -26644);
        if (var9 != null) {
            return;
        }
        class82 var10 = (class82) class51.field1297.method631(var7, -26644);
        if (var10 != null) {
            return;
        }
        class82 var11 = (class82) class18.field440.method631(var7, -26644);
        if (var11 == null) {
            if (!arg0) {
                class82 var12 = (class82) class22.field600.method631(var7, arg2 - 26644);
                if (var12 != null) {
                    return;
                }
            }
            class82 var13 = new class82();
            var13.field2136 = arg6;
            var13.field2127 = arg3;
            if (arg2 == 0) {
                var13.field2129 = arg4;
                if (arg0) {
                    class56.field1474.method633(var7, -100, var13);
                    class118.field2843++;
                } else {
                    class28.field730.method577(var13, true);
                    class18.field440.method633(var7, -100, var13);
                    class73.field1922++;
                }
            }
        } else if (arg0) {
            var11.method1012(-1);
            class56.field1474.method633(var7, arg2 - 100, var11);
            class118.field2843++;
            class73.field1922--;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)Lde;", line = 151)
    public final class24 method304(byte arg0) {
        field838++;
        if (arg0 > -87) {
            return null;
        }
        class24 var2 = this.field858.field654;
        if (this.field858 == var2) {
            return null;
        } else {
            var2.method249(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lde;", line = 187)
    public final class24 method305(int arg0) {
        field844++;
        class24 var2 = this.field869;
        if (this.field858 == var2) {
            this.field869 = null;
            return null;
        } else {
            int var3 = -114 / ((arg0 - 32) / 44);
            this.field869 = var2.field642;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Lde;", line = 209)
    public final class24 method306(byte arg0) {
        if (arg0 != -36) {
            field864 = null;
        }
        field850++;
        class24 var2 = this.field858.field642;
        if (this.field858 == var2) {
            return null;
        } else {
            var2.method249(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Lde;", line = 236)
    public final class24 method307(byte arg0) {
        field851++;
        int var2 = -68 / ((-arg0 - 42) / 63);
        class24 var3 = this.field858.field642;
        if (this.field858 == var3) {
            this.field869 = null;
            return null;
        } else {
            this.field869 = var3.field642;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V", line = 257)
    public final void method308(byte arg0) {
        int var2 = 60 % ((-arg0 - 30) / 51);
        field841++;
        while (true) {
            class24 var3 = this.field858.field654;
            if (this.field858 == var3) {
                return;
            }
            var3.method249(0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 285)
    public static void method309(int arg0) {
        field866 = null;
        field859 = null;
        field862 = null;
        field853 = null;
        field864 = null;
        field846 = null;
        field863 = null;
        if (arg0 != 32) {
            method309(-29);
        }
        field837 = null;
        field860 = null;
        field857 = null;
        field849 = null;
        field867 = null;
        field861 = null;
        field868 = null;
        field835 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 311)
    public static final void method310(boolean arg0) {
        field852++;
        if (arg0) {
            method303(true, 108, 38, 65, (byte) 73, -10, null);
        }
        for (int var1 = 0; var1 < class107.field2661; var1++) {
            int var2 = class118.field2859[var1];
            class55 var3 = class125.field3043[var2];
            int var4 = class14.field372.method520(-119);
            if ((var4 & 0x20) != 0) {
                var4 += class14.field372.method520(-121) << 8;
            }
            class10.method100(-12339, var4, var2, var3);
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)Lde;", line = 364)
    public final class24 method311(byte arg0) {
        field855++;
        if (arg0 < 70) {
            return null;
        }
        class24 var2 = this.field858.field654;
        if (this.field858 == var2) {
            this.field869 = null;
            return null;
        } else {
            this.field869 = var2.field654;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZLde;)V", line = 388)
    public final void method312(boolean arg0, class24 arg1) {
        if (arg1.field642 != null) {
            arg1.method249(0);
        }
        arg1.field654 = this.field858;
        arg1.field642 = this.field858.field642;
        arg1.field642.field654 = arg1;
        field847++;
        arg1.field654.field642 = arg1;
        if (arg0) {
            field857 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 432)
    public class34() {
        this.field858.field654 = this.field858;
        this.field858.field642 = this.field858;
    }
}
