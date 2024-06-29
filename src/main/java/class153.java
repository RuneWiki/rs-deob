import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class153 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[[I")
    public static int[][] field2067;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    public static boolean field2072;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ljn;")
    public static class409 field2065;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2071;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field2074;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Ljava/lang/String;")
    public String field2070;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1045(int arg0) {
        field2065 = null;
        if (arg0 != 6) {
            field2062 = 79;
        }
        field2067 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method1046(byte arg0) {
        field2066++;
        if (arg0 != -30) {
            method1045(35);
        }
        try {
            Method var1 = (field2074 == null ? (field2074 = method1050("java.lang.Runtime")) : field2074).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class429.field6241 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
    public static final int method1047(byte arg0) {
        field2063++;
        if (arg0 != -119) {
            method1047((byte) 117);
        }
        return 2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIILkg;IILtm;)V")
    public static final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4, class223 arg5, int arg6, int arg7, class195 arg8) {
        int var9 = -26 % ((8 - arg0) / 62);
        field2061++;
        int var10 = arg3 * arg3 + (arg2 * arg2);
        if (arg4 < var10) {
            return;
        }
        int var11 = Math.min(arg5.field3233 / 2, arg5.field3352 / 2);
        if ((var11 * var11) >= var10) {
            class411.method2549(-1, arg3, arg5, class376.field5490[arg7], arg2, arg8, arg1, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class28.field402 == 4) {
            var12 = (int) class1.field19 & 0x3FFF;
        } else {
            var12 = (int) class1.field19 + class303.field4429 & 0x3FFF;
        }
        int var13 = class327.field4863[var12];
        int var14 = class327.field4862[var12];
        if (class28.field402 != 4) {
            var13 = var13 * 256 / (class30.field422 + 256);
            var14 = var14 * 256 / (class30.field422 + 256);
        }
        int var15 = arg2 * var13 + arg3 * var14 >> 15;
        int var16 = arg2 * var14 - arg3 * var13 >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class269.field3995[arg7].method1921((float) arg5.field3233 / 2.0F + (float) arg1 + (float) var19, (float) arg5.field3352 / 2.0F + (float) arg6 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lat;I)Lbb;")
    public static final class141 method1049(class256 arg0, int arg1) {
        field2069++;
        if (arg1 <= 14) {
            method1047((byte) -28);
        }
        class141 var2 = new class141();
        var2.field1923 = arg0.method1767(1930493576);
        var2.field1925 = class51.method399((byte) -28, var2.field1923);
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1050(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class409("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field2064 = -1;
        field2067 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
        field2072 = false;
        field2065 = new class409("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");
        field2073 = 0;
    }
}
