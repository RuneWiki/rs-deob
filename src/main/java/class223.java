import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class223 extends class32 {

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Z")
    public volatile boolean field4084 = true;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "Lqk;")
    public static class207 field4077 = class24.method212(255, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field4082 = 2301979;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Z")
    public static boolean field4081 = false;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "Lbf;")
    public static class199 field4080 = new class199(32);

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lqk;")
    public static class207 field4085 = class24.method212(255, ")2");

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field4087 = 0;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lqk;")
    public static class207 field4086 = class24.method212(255, "mem=");

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Z")
    public boolean field4075;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "Z")
    public boolean field4078;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
    public static void method1579(boolean arg0) {
        field4080 = null;
        field4085 = null;
        field4086 = null;
        if (!arg0) {
            method1581(false, true, (class226) null);
        }
        field4077 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)[B")
    public abstract byte[] method1180(byte arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public static final void method1580(int arg0, int arg1, int arg2) {
        field4079++;
        class132 var3 = class276.field4844[class93.field1645][arg2][arg0];
        if (var3 == null) {
            class112.method797(class93.field1645, arg2, arg0);
            return;
        }
        int var4 = arg1;
        class242 var5 = null;
        for (class242 var6 = (class242) var3.method922((byte) 51); var6 != null; var6 = (class242) var3.method928(-76)) {
            class173 var13 = class117.method829(var6.field4408.field4447, (byte) 83);
            int var14 = var13.field3105;
            if (var13.field3067 == 1) {
                var14 = (var6.field4408.field4453 + 1) * var14;
            }
            if (var14 > var4) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class112.method797(class93.field1645, arg2, arg0);
            return;
        }
        var3.method932(var5, true);
        class242 var7 = (class242) var3.method922((byte) 66);
        class245 var8 = null;
        class245 var9 = null;
        while (var7 != null) {
            class245 var12 = var7.field4408;
            if (var5.field4408.field4447 != var12.field4447) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field4447 != var12.field4447 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class242) var3.method928(-118);
        }
        long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
        class31.method242(class93.field1645, arg2, arg0, class22.method139(arg2 * 128 + 64, arg0 * 128 + 64, 23979, class93.field1645), var5.field4408, var10, var8, var9);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZLrg;)V")
    public static final void method1581(boolean arg0, boolean arg1, class226 arg2) {
        if (arg1) {
            int var3 = class244.field4428;
            int var4 = var3 * 956 / 503;
            class165.field2909.method374((class31.field625 - var4) / 2, 0, var4, var3);
            class125.field2180.method247(class31.field625 / 2 - (class125.field2180.field661 / 2), 18);
        }
        arg2.method1600(class18.field298, class31.field625 / 2, class244.field4428 / 2 - 26, 16777215, -1);
        field4083++;
        int var5 = class244.field4428 / 2 - 18;
        class23.method166(class31.field625 / 2 - 152, var5, 304, 34, 9179409);
        class23.method166(class31.field625 / 2 - 151, var5 + 1, 302, 32, 0);
        class23.method167(class31.field625 / 2 - 150, var5 - -2, class153.field2663 * 3, 30, 9179409);
        class23.method167(class31.field625 / 2 + class153.field2663 * 3 - 150, var5 + 2, 300 - (class153.field2663 * 3), 30, 0);
        if (arg0) {
            method1581(true, false, (class226) null);
        }
        arg2.method1600(class169.field2981, class31.field625 / 2, class244.field4428 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)I")
    public abstract int method1181(int arg0);
}
