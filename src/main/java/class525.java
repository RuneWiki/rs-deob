import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class525 {

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lgf;")
    public static class180 field7717 = new class180("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lao;")
    public static class188 field7720 = new class188(74, 3);

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "[F")
    public static float[] field7721 = new float[4];

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lgf;")
    public static class180 field7722 = new class180("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field7712;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Ltp;")
    public class370 field7711;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lmo;")
    public class525 field7716;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lhh;I)V", line = 5)
    public static final void method3100(class84 arg0, int arg1) {
        if (arg1 == 29055) {
            class390.field5792 = arg0.method677(-1, "titlebg");
            field7715++;
            class418.field6176 = arg0.method677(-1, "logo");
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 18)
    public static void method3101(boolean arg0) {
        field7720 = null;
        field7721 = null;
        field7717 = null;
        if (!arg0) {
            method3104(66, -83);
        }
        field7722 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I", line = 31)
    public static final int method3102(int arg0) {
        field7714++;
        class162 var1 = class394.field5821;
        boolean var2 = false;
        if (class399.field5865 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class162.method1179(var3, -34, 0, 0, null, null);
            var2 = true;
        }
        if (arg0 <= 16) {
            method3101(false);
        }
        long var4 = class464.method2773((byte) 103);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method456(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class464.method2773((byte) 103) - var4);
        var1.method1175(100, 8, 0, -16777216, 100, 0);
        if (var2) {
            var1.method1174(-1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V", line = 76)
    public static final void method3103(int arg0, int arg1) {
        field7718++;
        if (!class91.method738(false, arg0)) {
            return;
        }
        if (arg1 >= -36) {
            method3100(null, 94);
        }
        class58[] var2 = class416.field6157[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class58 var4 = var2[var3];
            if (var4 != null) {
                var4.field901 = 1;
                var4.field866 = 0;
                var4.field944 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)I", line = 111)
    public static final int method3104(int arg0, int arg1) {
        field7719++;
        return arg1 < 1 ? -98 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 122)
    public final void method3105(byte arg0) {
        field7713++;
        if (arg0 != -69 || class503.field7380 >= 500) {
            return;
        }
        this.field7712 = 0;
        this.field7711 = null;
        this.field7716 = class520.field7641;
        class520.field7641 = this;
        class503.field7380++;
    }
}
