import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class58 implements class637 {

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "Lee;")
    public class676 field622;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "Lhaa;")
    public class82 field615;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "Ljava/lang/String;")
    public String field612;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field621 = new String[200];

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "Lea;")
    public static class547 field628 = new class547(93, 6);

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!tga", name = "q", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "Lclient;")
    public static client field623;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Lhda;")
    public final class750 method333(int arg0) {
        if (arg0 != 30778) {
            field623 = null;
        }
        field611++;
        return class659.field9196;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
    public static void method334(boolean arg0) {
        field621 = null;
        field623 = null;
        if (!arg0) {
            field628 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
    public static final void method335(int arg0) {
        field616++;
        if (arg0 <= -31) {
            class554.field7826.method1575((byte) -118);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZZLjava/lang/String;ZLfl;)V")
    public static final void method336(boolean arg0, boolean arg1, String arg2, boolean arg3, class739 arg4) {
        field627++;
        if (!arg3) {
            return;
        }
        if (!arg0) {
            class96.method660(-18871, arg2, arg4, 3);
            return;
        }
        if (class739.field10307.startsWith("win") && arg4.field10290) {
            String var5 = null;
            if (class144.field1868 != null) {
                var5 = class144.field1868.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class107 var6 = class96.method660(-18871, arg2, arg4, 0);
                class307.field4171 = arg4;
                class750.field10398 = var6;
                class215.field2599 = arg2;
                return;
            }
        }
        if (class739.field10307.startsWith("mac")) {
            String var7 = null;
            if (class144.field1868 != null) {
                var7 = class144.field1868.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg1) {
                class96.method660(-18871, arg2, arg4, 1);
                return;
            }
        }
        class96.method660(-18871, arg2, arg4, 2);
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Ljava/lang/String;Lee;Lhaa;IIIIIIIIII)V")
    public class58(String arg0, class676 arg1, class82 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field624 = arg7;
        this.field618 = arg5;
        this.field619 = arg10;
        this.field622 = arg1;
        this.field617 = arg11;
        this.field626 = arg8;
        this.field629 = arg6;
        this.field614 = arg3;
        this.field620 = arg9;
        this.field625 = arg12;
        this.field613 = arg4;
        this.field615 = arg2;
        this.field612 = arg0;
    }
}
