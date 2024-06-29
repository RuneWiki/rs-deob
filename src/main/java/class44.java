import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class44 {

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field922 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
    public static int[] field925 = new int[5];

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lcd;")
    private static class23 field927 = class54.method414("Existing User", -1);

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lcd;")
    public static class23 field928 = field927;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lcd;")
    public static class23 field930 = class54.method414("und Ihr Passwort ein)3", -1);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lva;")
    public static class189 field924;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[Loe;")
    public static class130[] field919;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method346(int arg0) {
        if (arg0 > -41) {
            field925 = null;
        }
        field927 = null;
        field930 = null;
        field919 = null;
        field928 = null;
        field925 = null;
        field924 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lkh;ILcd;IIZLcd;)V")
    public static final void method347(class97 arg0, int arg1, class23 arg2, int arg3, int arg4, boolean arg5, class23 arg6) {
        field921++;
        int var7 = arg0.method647((byte) -70, arg6);
        if (arg1 == -16699) {
            int var8 = arg0.method642(var7, (byte) -118, arg2);
            class175.method1104(arg0, var8, arg5, arg4, arg3, var7, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILcd;Lkh;Lcd;)[Loe;")
    public static final class130[] method348(int arg0, class23 arg1, class97 arg2, class23 arg3) {
        field926++;
        int var4 = arg2.method647((byte) -109, arg3);
        int var5 = arg2.method642(var4, (byte) -109, arg1);
        int var6 = -44 % ((arg0 + 80) / 33);
        return class191.method1241(arg2, 6, var5, var4);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[BLug;B)V")
    public static final void method349(int arg0, byte[] arg1, class186 arg2, byte arg3) {
        field923++;
        class20 var4 = new class20();
        var4.field3317 = arg0;
        var4.field413 = arg1;
        var4.field427 = 0;
        var4.field411 = arg2;
        class25 var5 = class36.field740;
        synchronized (class36.field740) {
            class36.field740.method186(var4, -26692);
        }
        class145.method918(600);
        if (arg3 != -85) {
            field922 = 7;
        }
    }
}
