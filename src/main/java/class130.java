import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class130 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lkb;")
    private static class93 field2456 = class76.method390("Members only world", 0);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    public static int[] field2455 = new int[32];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lkb;")
    public static class93 field2452 = class76.method390("sch-Utteln:", 0);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lkb;")
    public static class93 field2454 = field2456;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lkb;")
    public static class93 field2460;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lkb;")
    public static class93 field2461;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field2464;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[S")
    public static short[] field2463;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
    public abstract int method555(boolean arg0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method759(int arg0) {
        field2453++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        if (arg0 != 32) {
            method760(121);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method760(int arg0) {
        field2452 = null;
        field2464 = null;
        field2463 = null;
        field2460 = null;
        field2455 = null;
        if (arg0 != 32) {
            field2455 = null;
        }
        field2454 = null;
        field2456 = null;
        field2461 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILkb;Lkb;Ljg;)Lob;")
    public static final class129 method761(int arg0, class93 arg1, class93 arg2, class89 arg3) {
        field2458++;
        int var4 = arg3.method454(236, arg2);
        if (arg0 == 0) {
            int var5 = arg3.method468(21, arg1, var4);
            return class170.method1141(var5, -115, arg3, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method556(Component arg0, int arg1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method554(Component arg0, byte arg1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
    public static final boolean method762(int arg0, int arg1) {
        field2457++;
        if (arg0 > arg1) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)[Lna;")
    public static final class119[] method763(int arg0) {
        field2459++;
        if (arg0 != -2385) {
            field2462 = 8;
        }
        class119[] var1 = new class119[class8.field131];
        for (int var2 = 0; var2 < class8.field131; var2++) {
            class119 var3 = new class119();
            var3.field2207 = class133.field2557;
            var3.field2213 = class189.field3700;
            var3.field2214 = class153.field2993[var2];
            var3.field2209 = class82.field1513[var2];
            var3.field2211 = class64.field1010[var2];
            var3.field2212 = class100.field1844[var2];
            var3.field2210 = class103.field1895;
            var3.field2208 = class35.field577[var2];
            var1[var2] = var3;
        }
        class206.method1340(arg0 - 21172);
        return var1;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2455[var1] = var0 - 1;
            var0 += var0;
        }
        field2460 = class76.method390("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 0);
        field2461 = class76.method390("", 0);
        field2462 = 0;
    }
}
