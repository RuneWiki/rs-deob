import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class291 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lmh;")
    public static class62 field4940 = class201.method1405(true, "floorshadows");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[Z")
    public static boolean[] field4945 = new boolean[8];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lmh;")
    public static class62 field4938 = class201.method1405(true, "headicons_prayer");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lmh;")
    public static class62 field4942 = class201.method1405(true, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lmh;")
    public static class62 field4941 = class201.method1405(true, "::clientdrop");

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lmh;")
    public static class62 field4946 = class201.method1405(true, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[Z")
    public static boolean[] field4939 = new boolean[112];

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lmh;")
    public static class62 field4948 = class201.method1405(true, "sl_arrows");

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lmh;")
    public static class62 field4944 = null;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4950 = 0;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Ljm;")
    public class123 field4947;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lfd;")
    public class61 field4937;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1977(int arg0) {
        field4949++;
        class270.field4575.method1392(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 44)
    public static void method1978(byte arg0) {
        field4948 = null;
        field4940 = null;
        field4938 = null;
        if (arg0 <= 26) {
            return;
        }
        field4941 = null;
        field4939 = null;
        field4944 = null;
        field4946 = null;
        field4945 = null;
        field4942 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 65)
    public static final void method1979(int arg0) {
        field4943++;
        if (arg0 != 0) {
            method1979(-80);
        }
        for (class146 var1 = (class146) class214.field3632.method317(-60); var1 != null; var1 = (class146) class214.field3632.method314(-99)) {
            int var2 = var1.field2312;
            if (class20.method95(true, var2)) {
                class191[] var3 = class275.field4713[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3209;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field3499;
                    class191 var7 = class1.method2(var6, (byte) -37);
                    if (var7 != null) {
                        class250.method1744(var7, (byte) -106);
                    }
                }
            }
        }
    }
}
