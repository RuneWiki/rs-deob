import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class573 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field8261;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Luia;")
    public static class272 field8260 = new class272();

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "J")
    public static long field8265;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)Z", line = 4)
    public static final boolean method3405(int arg0, int arg1, byte arg2) {
        field8263++;
        if (arg2 != 7) {
            field8260 = null;
        }
        return class211.method1495(arg0, arg1, -118) & class268.method1759(-119, arg1, arg0);
    }

    @OriginalMember(owner = "client!he", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field8264++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 25)
    public static void method3406(int arg0) {
        if (arg0 != 27455) {
            field8260 = null;
        }
        field8260 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 36)
    public static final void method3407(int arg0) {
        if (arg0 < 28) {
            method3406(-112);
        }
        for (class304 var1 = (class304) class303.field4137.method3565(122); var1 != null; var1 = (class304) class303.field4137.method3561((byte) 51)) {
            if (class618.method3588(115, var1.field4152)) {
                class382.method2362(var1, (byte) 69);
            }
        }
        field8259++;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 62)
    public class573(String arg0, int arg1) {
        this.field8261 = arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILha;)V", line = 79)
    public static final void method3408(int arg0, int arg1, class543 arg2) {
        field8262++;
        if (!class522.field7591 || !class511.field7403) {
            class618.field8798 = 0;
            return;
        }
        if (class327.field4443) {
            class413.field5888 = class127.field1759.method583(37);
        }
        class343.field4713 = 0;
        class661.field9448 = 0;
        if (arg0 < 37) {
            return;
        }
        class671.field9573 = 0;
        int[] var3 = arg2.method247();
        class332.field4510 = (int) ((float) var3[3] / 3.0F);
        class709.field9967 = (int) ((float) var3[2] / 3.0F);
        arg2.method390(class67.field1033);
        if (((int) ((float) class67.field1033[0] / 3.0F)) != class165.field2353 || ((int) ((float) class67.field1033[1] / 3.0F)) != class355.field5240) {
            class355.field5240 = (int) ((float) class67.field1033[1] / 3.0F);
            class165.field2353 = (int) ((float) class67.field1033[0] / 3.0F);
            class703.field9910 = new int[class355.field5240 * class165.field2353];
            class64.field1007 = class355.field5240 >> 1;
            class137.field1884 = class165.field2353 >> 1;
        }
        class561.field8130 = arg2.method304();
        class618.field8798 = 0;
        for (int var4 = 0; var4 < class445.field6359; var4++) {
            class448.method2743(arg1, class160.field2308[var4], (byte) -112, arg2);
        }
        for (int var5 = 0; var5 < class311.field4226; var5++) {
            class448.method2743(arg1, class633.field8932[var5], (byte) 80, arg2);
        }
        for (int var6 = 0; var6 < class495.field7114; var6++) {
            class448.method2743(arg1, class43.field733[var6], (byte) 43, arg2);
        }
        class163.field2324 = 0;
        if (class618.field8798 > 0) {
            int var7 = class703.field9910.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
                class703.field9910[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class703.field9910[var9++] = Integer.MAX_VALUE;
            }
            class513.field7427 = 1;
            for (int var10 = 0; var10 < class618.field8798; var10++) {
                class151 var11 = class755.field10518[var10];
                class590.method3468(var11.field2204[3], var11.field2209[3], var11.field2209[1], var11.field2204[0], var11.field2204[1], var11.field2196[0], var11.field2196[1], var11.field2196[3], var11.field2209[0], true);
                class590.method3468(var11.field2204[3], var11.field2209[3], var11.field2209[2], var11.field2204[1], var11.field2204[2], var11.field2196[1], var11.field2196[2], var11.field2196[3], var11.field2209[1], true);
            }
            class513.field7427 = 2;
        }
        if (class327.field4443) {
            class660.field9439 = class127.field1759.method583(31) - class413.field5888;
        }
    }
}
