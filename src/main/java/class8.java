import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class31 {

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public int field129 = 0;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Lid;")
    public static class60 field119 = class11.method72("m-Ochte sich mit Ihnen duellieren)3", (byte) -48);

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lid;")
    public static class60 field122 = class11.method72("Zu viele Anmelde)2Versuche von Ihrer Adresse", (byte) 96);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lid;")
    public static class60 field118 = class11.method72("Konfig geladen)3", (byte) -110);

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lid;")
    public static class60 field126 = class11.method72("l", (byte) -32);

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Lid;")
    public static class60 field125 = class11.method72("Gegenstand f-Ur Mitglieder", (byte) -110);

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "Lpa;")
    public static class105 field127;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "[Lae;")
    public static class6[] field123;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "[[[B")
    public static byte[][][] field117;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
    public static final void method51(int arg0, byte arg1) {
        field120++;
        if (arg0 == -1 || !class28.method209(arg0, -1)) {
            return;
        }
        class40[] var2 = class45.field1177[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class40 var4 = var2[var3];
            if (var4.field987 != null) {
                class15 var5 = new class15();
                var5.field361 = var4;
                var5.field353 = var4.field987;
                class61.method467(false, var5);
            }
        }
        if (arg1 != 2) {
            method51(50, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/awt/Component;I)Lvf;")
    public static final class152 method52(int arg0, int arg1, Component arg2, int arg3) {
        field115++;
        try {
            if (arg3 <= 62) {
                field118 = null;
            }
            Class var4 = Class.forName("me");
            class152 var5 = (class152) var4.getDeclaredConstructor().newInstance();
            var5.method60(arg1, arg2, arg0, (byte) -102);
            return var5;
        } catch (Throwable var7) {
            class9 var6 = new class9();
            var6.method60(arg1, arg2, arg0, (byte) -101);
            return var6;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    public static void method53(int arg0) {
        field123 = null;
        field118 = null;
        field125 = null;
        field117 = null;
        field122 = null;
        field127 = null;
        field119 = null;
        if (arg0 != 0) {
            method52(-112, -16, null, -115);
        }
        field126 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lof;II)V")
    private final void method54(class103 arg0, int arg1, int arg2) {
        int var4 = 29 % ((arg2 - 40) / 54);
        field130++;
        if (arg1 == 5) {
            this.field129 = arg0.method808(-20054);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLof;)V")
    public final void method55(boolean arg0, class103 arg1) {
        if (arg0) {
            this.field129 = 45;
        }
        field121++;
        while (true) {
            int var3 = arg1.method829((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method54(arg1, var3, -124);
        }
    }
}
