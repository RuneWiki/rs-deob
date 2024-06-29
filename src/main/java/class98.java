import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class98 extends class67 {

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public int field2217 = 0;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public int field2230 = -1;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "[[B")
    public static byte[][] field2219 = new byte[1000][];

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Lrd;")
    public static class114 field2234 = class84.method656("@gr2@", (byte) 127);

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lrd;")
    public static class114 field2232 = class84.method656("Startseite auf (WSpielkonto wiederherstellen(W)3", (byte) 127);

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "[I")
    public static int[] field2229 = new int[25];

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lsb;")
    public static class118 field2216;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "[I")
    public static int[] field2227;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public static final void method739(int arg0, int arg1) {
        field2218++;
        if (arg0 >= -35) {
            method741(-17);
        }
        class61.field1306 = arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILnd;)Z")
    public static final boolean method740(int arg0, class90 arg1) {
        field2221++;
        if (arg1.field2086 == null) {
            return false;
        }
        if (arg0 > -114) {
            field2216 = null;
        }
        for (int var2 = 0; var2 < arg1.field2086.length; var2++) {
            int var3 = class55.method412(arg1, var2, (byte) -72);
            int var4 = arg1.field2065[var2];
            if (arg1.field2086[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2086[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2086[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public static final void method741(int arg0) {
        field2226++;
        for (int var1 = -1; var1 < class8.field116; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class110.field2573[var1];
            }
            class126 var6 = class36.field762[var5];
            if (var6 != null && var6.field747 > 0) {
                var6.field747--;
                if (var6.field747 == 0) {
                    var6.field715 = null;
                }
            }
        }
        if (arg0 != 4) {
            field2229 = null;
        }
        for (int var2 = 0; var2 < class77.field1765; var2++) {
            int var3 = class16.field317[var2];
            class8 var4 = class123.field2894[var3];
            if (var4 != null && var4.field747 > 0) {
                var4.field747--;
                if (var4.field747 == 0) {
                    var4.field715 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public static final void method742(int arg0) {
        if (arg0 >= -118) {
            field2234 = null;
        }
        field2223++;
        while (true) {
            class84 var1 = class118.field2761;
            class125 var2;
            synchronized (class118.field2761) {
                var2 = (class125) class103.field2407.method653(-63);
            }
            if (var2 == null) {
                return;
            }
            var2.field2966.method596((int) var2.field1448, -125, var2.field2978, var2.field2980, false);
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
    public static void method743(int arg0) {
        field2229 = null;
        if (arg0 != -1) {
            field2219 = null;
        }
        field2227 = null;
        field2234 = null;
        field2219 = null;
        field2232 = null;
        field2216 = null;
    }
}
