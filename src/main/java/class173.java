import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class173 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lv;")
    public static class147 field3049 = new class147(100);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Leb;")
    public static class230 field3051 = class68.method589(0, "Ablegen");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Leb;")
    public static class230 field3055 = class68.method589(0, "Hierhin gehen");

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3058 = 0;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Leb;")
    public static class230 field3057 = class68.method589(0, "Lade)3)3)3");

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lpk;")
    public static class98 field3056 = new class98();

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lje;")
    public static class178 field3059 = new class178();

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[Leb;)[Leb;")
    public static final class230[] method1265(int arg0, class230[] arg1) {
        class230[] var2 = new class230[5];
        if (arg0 != 1515) {
            field3049 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = method1267((byte) 59, new class230[] { class37.method340(var3, (byte) -26), class210.field3660 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = method1267((byte) 59, new class230[] { var2[var3], arg1[var3] });
            }
        }
        field3050++;
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lfk;I)Lij;")
    public static final class189 method1266(class14 arg0, int arg1) {
        if (arg1 != -16810) {
            method1265(-56, (class230[]) null);
        }
        class189 var2 = new class189(arg0.method171((byte) 79), arg0.method171((byte) 79), arg0.method161(4), arg0.method161(4), arg0.method187((byte) 61), arg0.method200(255) == 1);
        field3048++;
        int var3 = arg0.method200(255);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3332.method843(-5, new class271(arg0.method161(4), arg0.method161(4), arg0.method161(4), arg0.method161(4)));
        }
        var2.method1352((byte) -61);
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[Leb;)Leb;")
    public static final class230 method1267(byte arg0, class230[] arg1) {
        field3053++;
        if (arg0 != 59) {
            field3059 = null;
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class197.method1408(true, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field3056 = null;
        field3051 = null;
        if (arg0 <= 22) {
            method1266((class14) null, -94);
        }
        field3059 = null;
        field3057 = null;
        field3055 = null;
        field3049 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static final void method1269(int arg0) {
        field3052++;
        int var1 = class267.field4745;
        int var2 = class141.field2536 - var1 - class180.field3155;
        int var3 = class259.field4588;
        int var4 = class169.field2983 - class135.field2434 - var3;
        if (arg0 != 2007) {
            method1267((byte) -31, (class230[]) null);
        }
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class108.field1952 != null) {
                var5 = class108.field1952;
            } else if (class267.field4736 == null) {
                var5 = class184.field3228.field2320;
            } else {
                var5 = class267.field4736;
            }
            int var6 = 0;
            int var7 = 0;
            if (class267.field4736 == var5) {
                Insets var8 = class267.field4736.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class169.field2983);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7, class141.field2536, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class141.field2536 + var6 - var2, var7, var2, class169.field2983);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class169.field2983 + var7 - var4, class141.field2536, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
