import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class46 extends class29 {

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
    public boolean field553 = false;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Z")
    public boolean field561 = false;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field548 = new String[8];

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field558 = 0;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[Lgj;")
    public static class381[] field550;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
    public static final void method270(int arg0, int arg1, int arg2) {
        if (arg0 <= 22) {
            return;
        }
        field551++;
        class20 var3 = class369.method2351((byte) 87, 15, 0);
        var3.method146(69);
        var3.field252 = arg1;
        var3.field255 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
    public static final boolean method271(int arg0, int arg1) {
        if (arg1 != 17) {
            method272(-97, true, 114, -110, false);
        }
        field552++;
        return arg0 == 5 || arg0 == 17 || arg0 == 1006 || arg0 == 23 || arg0 == 48;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIIZ)V")
    public static final void method272(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (class26.field329 == 0) {
            class17.method112(28450, false);
        } else {
            class176.field2400 = class26.field329;
            class377.method2441(0, (byte) -117);
        }
        if (!arg1) {
            method274(10);
        }
        field554++;
        class356.field5013 = arg4;
        class255.field3675 = arg2;
        class121.field1490 = arg3;
        class308.method2030(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field557++;
        if (arg3 <= arg0) {
            class296.method1954(arg2, arg0, class291.field4067[arg4], arg3, -1);
        } else {
            class296.method1954(arg2, arg3, class291.field4067[arg4], arg0, -1);
        }
        if (arg1 <= 13) {
            field555 = 18;
        }
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V")
    public static void method274(int arg0) {
        field550 = null;
        if (arg0 <= 71) {
            method270(-99, 17, -14);
        }
        field548 = null;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIZZ)V")
    public class46(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field561 = arg3;
        this.field560 = arg0;
        this.field553 = arg4;
        this.field549 = arg1;
        this.field562 = arg2;
    }
}
