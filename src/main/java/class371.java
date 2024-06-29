import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class371 extends class510 {

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "[I")
    public static int[] field5289 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field5285 = 1;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "Lkn;")
    public static class530 field5291 = new class530("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5293 = null;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "Leh;")
    public static class246 field5292 = new class246(33, -1);

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "Z")
    public boolean field5287;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        if (arg0 != 0) {
            method2177(-27, true, 97, 100, 37);
        }
        field5280++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 < -71) {
            field5286++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        field5281++;
        return arg0 == 102 ? false : false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z")
    public static final boolean method2176(int arg0) {
        field5288++;
        if (class190.field2712) {
            try {
                class297.method1826("showVideoAd", -14648, class268.field3914.field2165);
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -88 / ((arg0 - 55) / 58);
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZIII)Lqf;")
    public static final class489 method2177(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5284++;
        class489 var5 = new class489();
        var5.field6840 = arg0;
        var5.field6835 = arg4;
        class255.field3763.method2413((long) arg3, var5, arg2 - 19090);
        class315.method1895(arg0, (byte) 3);
        class150 var6 = client.method1276(arg2 - 18982, arg3);
        if (var6 != null) {
            class187.method1190(var6, arg2 - 18988);
        }
        if (class411.field5809 != null) {
            class187.method1190(class411.field5809, 113);
            class411.field5809 = null;
        }
        class116.method776((byte) 9);
        if (var6 != null) {
            class509.method3040(!arg1, (byte) 73, var6);
        }
        if (!arg1) {
            class495.method2867(arg0);
        }
        if (!arg1 && class472.field6578 != -1) {
            class171.method1071(class472.field6578, 2, 1);
        }
        return arg2 == 19089 ? var5 : null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method2178(byte arg0) {
        field5293 = null;
        if (arg0 >= -96) {
            field5293 = null;
        }
        field5291 = null;
        field5292 = null;
        field5289 = null;
    }

    static {
        new class530("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
