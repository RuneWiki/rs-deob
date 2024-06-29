import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class10 implements Runnable {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[Lu;")
    public volatile class223[] field167 = new class223[2];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
    public volatile boolean field170 = false;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Z")
    public volatile boolean field168 = false;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Ljava/lang/String;")
    public static String field169 = " from your ignore list first.";

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lve;")
    public static class233 field179;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lbk;")
    public static class54 field180;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lca;")
    public class83 field172;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[[[B")
    public static byte[][][] field175;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method88(String arg0, int arg1, char arg2) {
        field178++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method89(byte arg0) {
        field180 = null;
        if (arg0 >= -43) {
            method93(-1, true, 121, -7, -16, -42);
        }
        field179 = null;
        field175 = null;
        field169 = null;
    }

    @OriginalMember(owner = "client!se", name = "run", descriptor = "()V")
    public final void run() {
        field173++;
        this.field168 = true;
        try {
            while (!this.field170) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class223 var2 = this.field167[var1];
                    if (var2 != null) {
                        var2.method1449((byte) 57);
                    }
                }
                class98.method660(10L, -82);
                class17.method129((Object) null, this.field172, -102);
            }
        } catch (Exception var9) {
            class37.method259(-86, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field168 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)Lja;")
    public static final class55 method90(int arg0, boolean arg1) {
        field177++;
        if (class56.field862 && arg0 >= class121.field1761 && arg0 <= class206.field2983) {
            return arg1 ? class283.field4514[arg0 - class121.field1761] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Lw;")
    public static final class237 method91(int arg0, int arg1) {
        field171++;
        class237 var2 = (class237) class225.field3382.method263((byte) 111, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 2) {
            field179 = null;
        }
        byte[] var3 = class67.field1042.method1538(class207.method1336(arg0 ^ 0xFFFFFFB2, arg1), class194.method1245(arg1, false), (byte) 45);
        class237 var4 = new class237();
        if (var3 != null) {
            var4.method1553(new class114(var3), (byte) -38);
        }
        class225.field3382.method255((long) arg1, var4, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method92(boolean arg0) {
        field174++;
        class27.field384.method257(arg0);
        class263.field3956.method257(false);
        class69.field1073.method257(false);
        class129.field1889.method257(false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZIIII)V")
    public static final void method93(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field176++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        class13.field207 = (short) arg3;
        class62.field996 = (short) arg0;
        if (arg4 != -1715) {
            method92(true);
        }
    }
}
