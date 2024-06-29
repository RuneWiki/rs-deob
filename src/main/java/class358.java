import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class358 extends class42 {

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lbt;")
    public class33 field5191;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Z")
    public static boolean field5202 = false;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "Lqv;")
    public static class316 field5196 = new class316(99, -2);

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[I")
    public static int[] field5203 = new int[16384];

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "[I")
    public static int[] field5204 = new int[16384];

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Z")
    public boolean field5200;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5204[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field5203[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2217(boolean arg0) {
        if (!arg0) {
            field5196 = null;
            field5203 = null;
            field5204 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method2218(boolean arg0, int arg1) {
        field5195++;
        if (class477.field6940 == arg1) {
            return;
        }
        class69.field1139 = class255.field3763 = class46.field887[arg1];
        class176.method1231((byte) 16);
        class430.field6187 = new int[class69.field1139][class255.field3763];
        class320.field4754 = new int[4][class69.field1139 >> 3][class255.field3763 >> 3];
        class302.field4482 = new int[class69.field1139][class255.field3763];
        if (!arg0) {
            field5203 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class19.field213[var2] = class41.method411(-124, class69.field1139, class255.field3763);
        }
        class386.field5507 = new byte[4][class69.field1139][class255.field3763];
        class83.method615(class69.field1139, 0, 4, class255.field3763);
        class230.method1535(2, class69.field1139 >> 3, class76.field1256, class255.field3763 >> 3);
        class477.field6940 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lvr;", line = 51)
    public static final class92 method2219(int arg0, int arg1) {
        field5192++;
        class92[] var2 = class473.method2801(false);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            if (var2[var3].field1476 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z", line = 75)
    public final boolean method2220(int arg0) {
        int var2 = 25 / ((arg0 + 71) / 41);
        field5193++;
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)Z", line = 85)
    public static final boolean method2221(int arg0, int arg1, int arg2) {
        if (arg1 != 99) {
            method2221(-17, 14, -59);
        }
        field5199++;
        return ((arg0 & 0x2000) != 0 | class350.method2203(arg2, arg1 ^ 0x63, arg0) | class29.method171(3072, arg2, arg0)) & class508.method2963(arg2, arg1 ^ 0x63, arg0);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I", line = 102)
    public int method505(int arg0) {
        if (arg0 == 0) {
            field5201++;
            return 0;
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I", line = 113)
    public final int method2222(int arg0) {
        field5194++;
        return arg0 == -19843 ? 1 : 86;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(Z)Z", line = 129)
    public final boolean method2223(boolean arg0) {
        field5197++;
        if (arg0) {
            this.field5191 = null;
        }
        return this.field5200;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lbt;)V", line = 147)
    public class358(class33 arg0) {
        this.field5191 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public abstract void method499(int arg0, int arg1);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
    public abstract void method501(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILuk;Luk;Z)V")
    public abstract void method509(int arg0, class176 arg1, class176 arg2, boolean arg3);

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Z")
    public abstract boolean method508(int arg0);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
    public abstract boolean method502(int arg0);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(Z)V")
    public abstract void method507(boolean arg0);
}
