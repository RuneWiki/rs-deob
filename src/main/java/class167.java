import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class167 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field2978 = 255;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[I")
    public static int[] field2980 = new int[25];

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lsb;")
    public static class98 field2981 = class47.method368(")4a=", 0);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[Lq;")
    public static class148[] field2979;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1189(int arg0, Component arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field2981 = null;
        field2980 = null;
        if (arg0 != -9812) {
            method1196(-62, -116);
        }
        field2979 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)I")
    public static final int method1191(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2983++;
        if (var4 == 0) {
            return arg2;
        } else if (arg0 == var4) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1192(Component arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
    public static final int method1193(int arg0, int arg1, int arg2) {
        field2977++;
        int var3 = arg1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Lbe;")
    public static final class14 method1194(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1149; var4++) {
            class14 var5 = var3.field1140[var4];
            if ((var5.field260 >> 29 & 0x3L) == 2L && var5.field268 == arg1 && var5.field256 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
    public abstract int method1195(byte arg0);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lsb;")
    public static final class98 method1196(int arg0, int arg1) {
        field2982++;
        if (arg1 < 100000) {
            return class186.method1288(new class98[] { class117.field2096, class125.method930(25904, arg1), class76.field1372 }, 31618);
        } else if (arg0 == 1000) {
            return arg1 < 10000000 ? class186.method1288(new class98[] { class262.field4591, class125.method930(arg0 ^ 0x66D8, arg1 / 1000), class142.field2504, class76.field1372 }, 31618) : class186.method1288(new class98[] { class190.field3294, class125.method930(25904, arg1 / 1000000), class232.field3999, class76.field1372 }, 31618);
        } else {
            return null;
        }
    }
}
