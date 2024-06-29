import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class138 {

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
    private int[] field2948;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ldd;")
    public static class35 field2944 = class180.method1196((byte) -32, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ldd;")
    public static class35 field2942 = class180.method1196((byte) -89, "mapscene");

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Ldd;")
    public static class35 field2946 = class180.method1196((byte) 126, "sl_stars");

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[I")
    public static int[] field2950 = new int[1000];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
    public static int[] field2945;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public final int method939(int arg0, int arg1) {
        field2949++;
        int var3 = (this.field2948.length >> 1) - arg0;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field2948[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2948[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z")
    public static final boolean method940(boolean arg0) {
        field2940++;
        try {
            if (class54.field1204 == 2) {
                if (class107.field2395 == null) {
                    class107.field2395 = class213.method1385(class127.field2757, class201.field4024, class114.field2540);
                    if (class107.field2395 == null) {
                        return false;
                    }
                }
                if (class96.field2120 == null) {
                    class96.field2120 = new class158(class191.field3852, class122.field2691);
                }
                if (class83.field1920.method1121(class107.field2395, true, class22.field455, class96.field2120, 22050)) {
                    class83.field1920.method1135(-84);
                    class83.field1920.method1140(-41, class28.field580);
                    class83.field1920.method1136(class193.field3870, (byte) -63, class107.field2395);
                    class54.field1204 = 0;
                    class96.field2120 = null;
                    class127.field2757 = null;
                    class107.field2395 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class83.field1920.method1150(8342426);
            class107.field2395 = null;
            class96.field2120 = null;
            class127.field2757 = null;
            class54.field1204 = 0;
        }
        if (arg0) {
            field2942 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILfd;ILba;III)V")
    public static final void method941(int arg0, class55 arg1, int arg2, class12 arg3, int arg4, int arg5, int arg6) {
        field2941++;
        if (arg3 == null) {
            return;
        }
        int var7 = class90.field2003 + class2.field40 & 0x7FF;
        int var8 = Math.max(arg1.field1249 / 2, arg1.field1329 / 2) + 10;
        int var9 = arg4 * arg4 + arg6 * arg6;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class11.field201[var7];
        int var11 = var10 * 256 / (class67.field1561 + 256);
        int var12 = class11.field211[var7];
        int var13 = var12 * 256 / (class67.field1561 + 256);
        int var14 = arg4 * var11 - arg6 * var13 >> 16;
        int var15 = arg4 * var13 + arg6 * var11 >> 16;
        arg3.method108(arg1.field1249 / 2 + arg2 + var15 - arg3.field218 / arg0, -var14 + arg5 - (arg3.field220 / 2 + -(arg1.field1329 / 2)), arg1.field1388, arg1.field1378);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Ldd;")
    public static final class35 method942(String arg0, int arg1) {
        field2939++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class35 var3 = new class35();
        var3.field758 = 0;
        if (arg1 <= 11) {
            return null;
        }
        var3.field730 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field758++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2950 = null;
        if (arg0 != -110661439) {
            method941(-110, null, 81, null, 76, -111, -88);
        }
        field2946 = null;
        field2944 = null;
        field2942 = null;
        field2945 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method944(int arg0) {
        class96.field2128.method813(-114);
        field2947++;
        if (arg0 < 32) {
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
    public static final void method945(int arg0, int arg1) {
        field2943++;
        if (~arg0 == arg1 || !class52.field1192[arg0]) {
            return;
        }
        class69.field1674.method45(arg0, (byte) 90);
        if (class163.field3299[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class163.field3299[arg0].length; var3++) {
            if (class163.field3299[arg0][var3] != null) {
                if (class163.field3299[arg0][var3].field1355 == 2) {
                    var2 = false;
                } else {
                    class163.field3299[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class163.field3299[arg0] = null;
        }
        class52.field1192[arg0] = false;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([I)V")
    public class138(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2948 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2948[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2948[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2948[var5 + var5] = arg0[var4];
            this.field2948[var5 + var5 + 1] = var4++;
        }
    }
}
