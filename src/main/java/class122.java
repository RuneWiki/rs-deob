import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class122 {

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public int field2859 = 0;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field2866 = 0;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lrd;")
    public static class114 field2848 = class84.method656("null", (byte) 115);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lrd;")
    public static class114 field2844 = class84.method656("Bitte starten Sie eine Mitgliedschaft", (byte) 122);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lrd;")
    public static class114 field2851 = class84.method656(" )2> ", (byte) 127);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Z")
    public static boolean field2850 = false;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lrd;")
    public static class114 field2849 = class84.method656("Unerwartete Antwort vom Anmelde)2Server", (byte) 115);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[[I")
    public static int[][] field2847 = new int[104][104];

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lrd;")
    public static class114 field2861 = class84.method656("Diese Betatest)2Welt ist nur f-Ur eingeladene", (byte) 117);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Lrd;")
    public static class114 field2870 = class84.method656("backhmid2", (byte) 127);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lha;")
    public class50 field2846;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lha;")
    public class50 field2864;

    // $FF: synthetic field
    @OriginalMember(owner = "client!t", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field2871;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lpb;ILpb;)V")
    public static final void method948(class100 arg0, int arg1, class100 arg2) {
        field2853++;
        class125.field2965 = arg0;
        class24.field452 = arg2;
        if (arg1 != -29075) {
            field2849 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method949(int arg0) {
        field2844 = null;
        int var1 = -50 / ((arg0 + 17) / 55);
        field2849 = null;
        field2870 = null;
        field2861 = null;
        field2851 = null;
        field2848 = null;
        field2847 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([BLd;IZ)V")
    public static final void method950(byte[] arg0, class22 arg1, int arg2, boolean arg3) {
        field2855++;
        class125 var4 = new class125();
        var4.field1448 = arg2;
        var4.field2968 = 0;
        var4.field2978 = arg0;
        var4.field2980 = arg1;
        class84 var5 = class118.field2761;
        synchronized (class118.field2761) {
            class118.field2761.method645(var4, (byte) 93);
        }
        if (!arg3) {
            field2861 = null;
        }
        class5.method51((byte) 57);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lnd;I)Lnd;")
    public static final class90 method951(class90 arg0, int arg1) {
        if (arg1 != 104) {
            return null;
        }
        class90 var2 = class102.method790(arg0, (byte) 100);
        if (var2 == null) {
            var2 = arg0.field2030;
        }
        field2863++;
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILpb;)V")
    public static final void method952(int arg0, class100 arg1) {
        class55.field1157 = arg1;
        field2858++;
        int var2 = 64 % ((arg0 + 75) / 36);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Lwb;")
    public static final class142 method953(int arg0, int arg1) {
        field2856++;
        class142 var2 = (class142) class39.field812.method194((byte) -102, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field537.method762(arg1, 0, (byte) 66);
        if (var3 == null) {
            return null;
        }
        class142 var4 = new class142();
        class60 var5 = new class60(var3);
        int var6 = 0;
        var5.field1227 = var5.field1248.length - 12;
        int var7 = var5.method442((byte) -55);
        var4.field3385 = var5.method467(arg0 - 24624);
        var4.field3398 = var5.method467(255);
        var4.field3388 = var5.method467(arg0 ^ 0x61D0);
        var4.field3386 = var5.method467(255);
        var4.field3393 = new int[var7];
        var5.field1227 = 0;
        var4.field3397 = new int[var7];
        var4.field3378 = new class114[var7];
        while (var5.field1227 < var5.field1248.length - 12) {
            int var8 = var5.method467(arg0 ^ 0x61D0);
            if (var8 == 3) {
                var4.field3378[var6] = var5.method456(-1);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3393[var6] = var5.method462((byte) 116);
            } else {
                var4.field3393[var6] = var5.method442((byte) -81);
            }
            var4.field3397[var6++] = var8;
        }
        if (arg0 != 24879) {
            method953(-43, -123);
        }
        class39.field812.method193(-108, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static final void method954(int arg0) {
        field2852++;
        if (class11.field190 == null) {
            return;
        }
        long var1 = class99.method747(arg0 - 1000);
        if (var1 <= class58.field1210) {
            return;
        }
        class11.field190.method226(var1);
        int var3 = (int) (var1 - class58.field1210);
        class58.field1210 = var1;
        synchronized (field2871 == null ? (field2871 = method956("eb")) : field2871) {
            class135.field3299 += class52.field1106 * var3;
            int var5 = (class135.field3299 - class52.field1106 * 2000) / arg0;
            if (var5 > 0) {
                if (class127.field3050 != null) {
                    class127.field3050.method27(var5);
                }
                class135.field3299 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBILpb;)Z")
    public static final boolean method955(int arg0, byte arg1, int arg2, class100 arg3) {
        byte[] var4 = arg3.method762(arg0, arg2, (byte) 66);
        if (arg1 >= -112) {
            return false;
        }
        field2862++;
        if (var4 == null) {
            return false;
        } else {
            class101.method785(85, var4);
            return true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method956(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
