import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class116 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lvf;")
    public static class265 field2047 = class87.method582(-46, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2048 = 1;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static volatile int field2049 = 0;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lvf;")
    public static class265 field2060 = class87.method582(-46, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lvf;")
    public static class265 field2062 = class87.method582(-46, "(U3");

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lfl;")
    public static class192 field2061;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Llj;")
    public class39 field2058;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    public int[] field2050;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
    public static final void method777(byte arg0, boolean arg1) {
        class44.method369(true);
        field2052++;
        if (class246.field4281 != 30 && class246.field4281 != 25) {
            return;
        }
        class143.field2680++;
        if (class143.field2680 < 50 && !arg1) {
            return;
        }
        class143.field2680 = 0;
        if (arg0 != 34) {
            field2062 = null;
        }
        if (!class17.field473 && class197.field3520 != null) {
            class55.field1133.method1863(true, 252);
            class183.field3249++;
            try {
                class197.field3520.method982(0, true, class55.field1133.field2483, class55.field1133.field2449);
                class55.field1133.field2449 = 0;
            } catch (IOException var2) {
                class17.field473 = true;
            }
        }
        class44.method369(true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
    public static final void method778(int arg0, byte arg1) {
        field2053++;
        if (arg0 == -1 || !class202.method1390(2, arg0)) {
            return;
        }
        class6[] var2 = class178.field3174[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class6 var4 = var2[var3];
            if (var4.field212 != null) {
                class277 var5 = new class277();
                var5.field4901 = var4;
                var5.field4883 = var4.field212;
                class96.method645(2000000, (byte) 116, var5);
            }
        }
        if (arg1 < 83) {
            field2056 = -115;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZLfl;Lfl;)Lf;")
    public static final class209 method779(int arg0, int arg1, boolean arg2, class192 arg3, class192 arg4) {
        if (arg0 != 1) {
            field2062 = null;
        }
        field2055++;
        int[] var5 = arg4.method1303(0, arg1);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method1304(arg0 + 88, var5[var7], arg1);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method1304(-128, var9, 0);
                } else {
                    var10 = arg3.method1304(-121, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class209(arg4, arg3, arg1, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lue;")
    public static final class13 method780(int arg0) {
        field2051++;
        if (arg0 < 73) {
            field2054 = -21;
        }
        return class181.field3211;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)V")
    public static final void method781(int arg0, byte arg1) {
        if (arg1 > -48) {
            method782(-110);
        }
        field2057++;
        class178 var2 = class188.method1282(arg0, 7, 261360480);
        var2.method1160(121);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static void method782(int arg0) {
        if (arg0 != 0) {
            field2060 = null;
        }
        field2061 = null;
        field2047 = null;
        field2062 = null;
        field2060 = null;
    }
}
