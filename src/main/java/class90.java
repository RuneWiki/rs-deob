import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class90 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    public static int[] field1888 = new int[1000];

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Leh;")
    public static class47 field1887 = class195.method1282((byte) -4, "title_mute");

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Leh;")
    public static class47 field1893 = class195.method1282((byte) -4, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Leh;")
    public static class47 field1890 = class195.method1282((byte) -4, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[Z")
    public static boolean[] field1892 = new boolean[112];

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
    public static int[] field1899 = new int[100];

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lah;")
    public static class9 field1891;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lah;")
    public static class9 field1896;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
    public static int[] field1894;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z")
    public static final boolean method723(int arg0, int arg1, int arg2) {
        if (arg0 != -29438) {
            field1893 = null;
        }
        field1889++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1894 = null;
        field1892 = null;
        field1893 = null;
        field1888 = null;
        if (arg0 != 250) {
            method727(null, (byte) -122, null);
        }
        field1891 = null;
        field1899 = null;
        field1887 = null;
        field1890 = null;
        field1896 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLeh;Z)V")
    public static final void method725(byte arg0, class47 arg1, boolean arg2) {
        field1886++;
        class47 var3 = arg1.method406(-116);
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg0 <= 15) {
            method725((byte) 104, null, false);
        }
        for (int var6 = 0; var6 < class32.field608; var6++) {
            class73 var9 = class87.method713(116, var6);
            if ((!arg2 || var9.field1613) && var9.field1563.method406(-88).method378(4, var3) != -1) {
                if (var5 >= 250) {
                    class84.field1787 = -1;
                    class54.field1047 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class54.field1047 = var4;
        class199.field3892 = 0;
        class84.field1787 = var5;
        class47[] var7 = new class47[class84.field1787];
        for (int var8 = 0; var8 < class84.field1787; var8++) {
            var7[var8] = class87.method713(32, var4[var8]).field1563;
        }
        class165.method1124(var7, false, class54.field1047);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lgg;ILfd;I)V")
    public static final void method726(class62 arg0, int arg1, class52 arg2, int arg3) {
        field1897++;
        byte[] var4 = null;
        class40 var5 = class80.field1725;
        synchronized (class80.field1725) {
            for (class181 var6 = (class181) class80.field1725.method345(-122); var6 != null; var6 = (class181) class80.field1725.method348(13949)) {
                if ((long) arg1 == var6.field2283 && var6.field3475 == arg0 && var6.field3463 == 0) {
                    var4 = var6.field3467;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg2.method462(arg1, arg0, (byte) 109, true, var4);
            return;
        }
        if (arg3 != 0) {
            field1893 = null;
        }
        byte[] var7 = arg0.method528(7308, arg1);
        arg2.method462(arg1, arg0, (byte) 79, true, var7);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/Object;BLqf;)V")
    public static final void method727(Object arg0, byte arg1, class150 arg2) {
        field1895++;
        if (arg2.field2943 == null) {
            return;
        }
        if (arg1 <= 50) {
            field1885 = 19;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2943.peekEvent() != null; var3++) {
            class76.method666(1L, 1);
        }
        if (arg0 != null) {
            arg2.field2943.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
