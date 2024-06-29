import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lic;")
    private static class59 field1192 = class59.method433(0, "flash1:");

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lic;")
    public static class59 field1196 = class59.method433(0, ")3runescape)3com");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lic;")
    public static class59 field1193 = class59.method433(0, "sl_back");

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Lic;")
    public static class59 field1202 = field1192;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
    public static int[] field1204 = new int[99];

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lic;")
    public static class59 field1206 = field1192;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lic;")
    private static class59 field1208;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lic;")
    public static class59 field1207;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lic;")
    public static class59 field1209;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[Ln;")
    public static class90[] field1210;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[Lce;")
    public static class20[] field1195;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method366(int arg0, Component arg1) {
        if (arg0 != 1) {
            return;
        }
        Method var2 = class67.field1664;
        field1200++;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class18.field353);
        arg1.addFocusListener(class18.field353);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static final void method367(byte arg0) {
        field1199++;
        class106.field2526 = 0;
        class59.field1445 = 0;
        class3.method17((byte) 101);
        class41.method315(3);
        class5.method24(13680);
        for (int var1 = 0; var1 < class59.field1445; var1++) {
            int var3 = class2.field34[var1];
            if (class23.field561 != field1210[var3].field1749) {
                field1210[var3].field2276 = null;
                field1210[var3] = null;
            }
        }
        if (class34.field914 != class10.field213.field3457) {
            throw new RuntimeException("gnp1 pos:" + class10.field213.field3457 + " psize:" + class34.field914);
        }
        if (arg0 > -16) {
            method367((byte) -45);
        }
        for (int var2 = 0; var2 < class103.field2510; var2++) {
            if (field1210[class53.field1309[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class103.field2510);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method368(boolean arg0, int arg1, byte[] arg2) {
        field1197++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > arg1 && !class10.field227) {
            try {
                class96 var3 = (class96) Class.forName("qb").getDeclaredConstructor().newInstance();
                var3.method789(arg2, arg1 ^ 0x4D7A);
                return var3;
            } catch (Throwable var4) {
                class10.field227 = true;
            }
        }
        return arg0 ? class114.method920(123, arg2) : arg2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLfe;I)V")
    public static final void method369(boolean arg0, class41 arg1, int arg2) {
        field1198++;
        int var3 = arg1.field1044;
        int var4 = (int) arg1.field2736;
        arg1.method929(124);
        if (arg0) {
            class23.method141(var3, (byte) 108);
        }
        class1.method3(var3, arg2 ^ 0x61);
        class159 var5 = class134.method1032(var4, 499749840);
        if (var5 != null) {
            class42.method320(false, var5);
        }
        class107.field2557 = 0;
        class98.field2440 = false;
        class149.method1106(-15412, class30.field781, class138.field3081, class128.field2895, class159.field3646);
        if (~class126.field2866 != arg2) {
            class24.method152(arg2 - 128, class126.field2866, 1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method370(boolean arg0) {
        field1210 = null;
        field1192 = null;
        field1209 = null;
        field1207 = null;
        field1196 = null;
        field1204 = null;
        field1202 = null;
        if (arg0) {
            field1204 = null;
        }
        field1193 = null;
        field1206 = null;
        field1208 = null;
        field1195 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
    public static final void method371(int arg0, boolean arg1) {
        field1205++;
        if (arg1) {
            field1192 = null;
        }
        class153.field3321 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILic;)I")
    public static final int method372(int arg0, class59 arg1) {
        field1194++;
        if (class136.field3013 == 1) {
            return 7;
        } else if (arg1.method443((byte) 34, class99.field2460)) {
            return 1;
        } else if (arg1.method443((byte) 34, class42.field1074)) {
            return 1;
        } else {
            if (arg0 <= 82) {
                field1192 = null;
            }
            if (arg1.method443((byte) 34, class65.field1641)) {
                return 2;
            } else if (arg1.method443((byte) 34, class76.field1877)) {
                return 2;
            } else if (arg1.method443((byte) 34, class142.field3124)) {
                return 3;
            } else if (arg1.method443((byte) 34, class17.field337)) {
                return 4;
            } else if (arg1.method443((byte) 34, class2.field48)) {
                return 4;
            } else if (arg1.method443((byte) 34, class26.field664)) {
                return 5;
            } else if (arg1.method443((byte) 34, class23.field544)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1204[var1] = var0 / 4;
        }
        field1208 = class59.method433(0, "Members only world");
        field1207 = field1208;
        field1209 = class59.method433(0, "mapback");
        field1210 = new class90[32768];
    }
}
