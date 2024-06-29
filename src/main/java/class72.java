import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class72 extends class508 {

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
    public int field900 = 0;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "Z")
    public static boolean field899 = false;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "Lqt;")
    public class295 field891;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "Los;")
    public class383 field886;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "Los;")
    public class383 field893;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "Ljt;")
    public class402 field895;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "Lmv;")
    public class518 field894;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "Z")
    public boolean field884;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "[I")
    public int[] field887;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 5)
    public final void method409(int arg0) {
        field903++;
        int var2 = this.field902;
        if (this.field895 != null) {
            class402 var5 = this.field895.method2393(class198.field2555, (byte) 32);
            if (var5 == null) {
                this.field902 = -1;
                this.field887 = null;
                this.field905 = 0;
                this.field890 = 0;
                this.field885 = 0;
                this.field904 = 0;
            } else {
                this.field905 = var5.field5408;
                this.field887 = var5.field5413;
                this.field904 = var5.field5404;
                this.field902 = var5.field5402;
                this.field885 = var5.field5352;
                this.field890 = var5.field5374 << 7;
            }
        } else if (this.field891 != null) {
            int var3 = class485.method2902(this.field891, (byte) 74);
            if (var2 != var3) {
                this.field902 = var3;
                class10 var4 = this.field891.field3831;
                if (var4.field111 != null) {
                    var4 = var4.method63(false, class198.field2555);
                }
                if (var4 == null) {
                    this.field885 = this.field890 = 0;
                } else {
                    this.field885 = var4.field137;
                    this.field890 = var4.field106 << 7;
                }
            }
        } else if (this.field894 != null) {
            this.field902 = class470.method2822(18, this.field894);
            this.field890 = this.field894.field7662 << 7;
            this.field885 = this.field894.field7652;
        }
        if (this.field902 != var2 && this.field886 != null) {
            class18.field313.method1890(this.field886);
            this.field886 = null;
        }
        if (arg0 < 83) {
            method412(80, 86, -90, 102, 2, true);
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)Lfb;", line = 105)
    public static final class35 method410(int arg0) {
        field889++;
        if (arg0 != 8926) {
            return null;
        }
        try {
            return (class35) Class.forName("hr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILdn;ZI)Lce;", line = 125)
    public static final class325 method411(int arg0, class201 arg1, boolean arg2, int arg3) {
        field907++;
        class88 var4 = new class88(arg1.method1313((byte) -119, arg3, arg0));
        if (arg2) {
            method411(81, null, true, 47);
        }
        class325 var5 = new class325(arg0, var4.method591(20557), var4.method591(20557), var4.method578(113), var4.method578(100), var4.method617(2) == 1, var4.method617(2), var4.method617(2));
        int var6 = var4.method617(2);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field4174.method42(new class501(var4.method617(2), var4.method568((byte) 110), var4.method568((byte) 110), var4.method568((byte) 110), var4.method568((byte) 110), var4.method568((byte) 110), var4.method568((byte) 110), var4.method568((byte) 110), var4.method568((byte) 110)), 0);
        }
        var5.method1932(-5714);
        return var5;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIZ)V", line = 157)
    public static final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 != -1490384057) {
            field899 = false;
        }
        field898++;
        if (class460.field6432 != null && (arg4 != 3 || class421.field5647.field7718 != arg0 || class421.field5647.field7731 != arg2)) {
            class388.method2315(0, class460.field6432, class172.field2221);
            class460.field6432 = null;
        }
        if (arg4 == 3 && class460.field6432 == null) {
            class460.field6432 = class347.method2044(arg0, 0, class172.field2221, 0, false, arg2);
            if (class460.field6432 != null) {
                class421.field5647.field7731 = arg2;
                class421.field5647.field7718 = arg0;
                class421.field5647.method643(true, class172.field2221);
            }
        }
        if (arg4 == 3 && class460.field6432 == null) {
            method412(-1, arg1, -1, -1490384057, class421.field5647.field7727, true);
            return;
        }
        Container var6;
        if (class460.field6432 != null) {
            class403.field5424 = arg0;
            var6 = class460.field6432;
            class18.field303 = arg2;
        } else if (class516.field7590 == null) {
            var6 = class172.field2221.field6139;
            class403.field5424 = var6.getSize().width;
            class18.field303 = var6.getSize().height;
        } else {
            Insets var7 = class516.field7590.getInsets();
            class403.field5424 = class516.field7590.getSize().width - var7.left - var7.right;
            int var10001 = -var7.top;
            class18.field303 = class516.field7590.getSize().height + var10001 - var7.bottom;
            var6 = class516.field7590;
        }
        if (arg4 == 1) {
            class351.field4495 = (class403.field5424 - class366.field4716) / 2;
            class23.field419 = class366.field4716;
            class92.field1281 = class312.field4024;
            class509.field7474 = 0;
        } else if (class472.field6899 < 96 && class520.field7690 == 0) {
            int var8 = class403.field5424 > 1024 ? 1024 : class403.field5424;
            class23.field419 = var8;
            int var9 = class18.field303 > 768 ? 768 : class18.field303;
            class351.field4495 = (class403.field5424 - var8) / 2;
            class509.field7474 = 0;
            class92.field1281 = var9;
        } else {
            class351.field4495 = 0;
            class92.field1281 = class18.field303;
            class23.field419 = class403.field5424;
            class509.field7474 = 0;
        }
        if (class246.field3151 != class222.field2867) {
            boolean var10000;
            if (class23.field419 < 1024 && class92.field1281 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class517.method3071(-82);
        } else {
            class272.field3454.setSize(class23.field419, class92.field1281);
            class512.field7538.method852(class272.field3454);
            if (class516.field7590 == var6) {
                Insets var10 = class516.field7590.getInsets();
                class272.field3454.setLocation(var10.left + class351.field4495, class509.field7474 + var10.top);
            } else {
                class272.field3454.setLocation(class351.field4495, class509.field7474);
            }
        }
        if (arg4 < 2) {
            class159.field2092 = false;
        } else {
            class159.field2092 = true;
        }
        if (class282.field3610 != -1) {
            class296.method1780(true, (byte) 31);
        }
        if (class286.field3643 != null && (class65.field821 == 30 || class65.field821 == 25)) {
            class250.method1567(6);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class76.field967[var11] = true;
        }
        class436.field5982 = true;
    }
}
