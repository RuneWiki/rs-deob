import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class284 extends class268 {

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    private int field4432;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    private int field4428;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Z")
    public static boolean field4424 = false;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field4434 = 0;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Z")
    public static boolean field4430 = true;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Z")
    public static boolean field4429 = false;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4426 = "cyan:";

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Lrj;")
    public static class269 field4425;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1965(boolean arg0) {
        field4433++;
        class330.field5072.method750((byte) 80);
        if (!arg0) {
            field4424 = true;
        }
        class121.field1862.method750((byte) 79);
        class91.field1321.method750((byte) 104);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIII)V", line = 26)
    public static final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4423++;
        int var8 = class335.method2343(-1, class212.field3261, arg2, class182.field2888);
        int var9 = class335.method2343(-1, class212.field3261, arg0, class182.field2888);
        int var10 = class335.method2343(-1, class234.field3569, arg7, class322.field4965);
        int var11 = class335.method2343(-1, class234.field3569, arg3, class322.field4965);
        int var12 = class335.method2343(-1, class212.field3261, arg1 + arg2, class182.field2888);
        int var13 = class335.method2343(-1, class212.field3261, arg0 - arg1, class182.field2888);
        for (int var14 = var8; var14 < var12; var14++) {
            class7.method72(var11, -7, var10, class79.field1178[var14], arg5);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class7.method72(var11, -7, var10, class79.field1178[var15], arg5);
        }
        int var16 = class335.method2343(-1, class234.field3569, arg1 + arg7, class322.field4965);
        int var17 = class335.method2343(-1, class234.field3569, arg3 - arg1, class322.field4965);
        if (arg4 <= 107) {
            return;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class79.field1178[var18];
            class7.method72(var16, -7, var10, var19, arg5);
            class7.method72(var17, -7, var16, var19, arg6);
            class7.method72(var11, -7, var17, var19, arg5);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(DB)V", line = 76)
    public static final void method1967(double arg0, byte arg1) {
        if (class340.field5287 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class98.field1410[var3] = var4 > 255 ? 255 : var4;
            }
            class340.field5287 = arg0;
        }
        if (arg1 <= 50) {
            field4425 = (class269) null;
        }
        field4439++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V", line = 112)
    public final void method406(int arg0, int arg1, int arg2) {
        field4435++;
        int var4 = this.field4432 * arg0 >> 12;
        int var5 = this.field4437 * arg2 >> 12;
        if (arg1 != 219) {
            field4425 = (class269) null;
        }
        int var6 = this.field4431 * arg0 >> 12;
        int var7 = this.field4428 * arg2 >> 12;
        class132.method1024(var5, -108, var6, var4, this.field4173, this.field4162, var7);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILwm;B)Lnf;", line = 132)
    public static final class262 method1968(int arg0, class254 arg1, byte arg2) {
        int var3 = 105 % ((-arg2 - 22) / 46);
        field4442++;
        class262 var4 = new class262(arg0, arg1.method1778(1258), arg1.method1778(1258), arg1.method1741(-32769), arg1.method1741(-32769), arg1.method1774((byte) 105) == 1, arg1.method1774((byte) -106));
        int var5 = arg1.method1774((byte) -114);
        for (int var6 = 0; var6 < var5; var6++) {
            var4.field4041.method1952(new class280(arg1.method1774((byte) -98), arg1.method1774((byte) 81), arg1.method1755(false), arg1.method1755(false), arg1.method1755(false), arg1.method1755(false), arg1.method1755(false), arg1.method1755(false), arg1.method1755(false), arg1.method1755(false)), -38);
        }
        var4.method1839(false);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 172)
    public static void method1969(byte arg0) {
        field4426 = null;
        if (arg0 <= 97) {
            field4425 = (class269) null;
        }
        field4425 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIII)V", line = 182)
    public class284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4431 = arg2;
        this.field4437 = arg1;
        this.field4432 = arg0;
        this.field4428 = arg3;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V", line = 197)
    public final void method405(int arg0, int arg1, int arg2) {
        field4441++;
        if (arg2 < 63) {
            return;
        }
        int var4 = this.field4432 * arg1 >> 12;
        int var5 = this.field4431 * arg1 >> 12;
        int var6 = this.field4437 * arg0 >> 12;
        int var7 = this.field4428 * arg0 >> 12;
        class114.method875(-1, var4, this.field4170, this.field4173, var6, var7, this.field4162, var5);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V", line = 222)
    public final void method400(int arg0, int arg1, int arg2) {
        int var4 = this.field4432 * arg0 >> 12;
        field4440++;
        int var5 = 16 / ((arg1 + 74) / 43);
        int var6 = this.field4428 * arg2 >> 12;
        int var7 = this.field4437 * arg2 >> 12;
        int var8 = this.field4431 * arg0 >> 12;
        class207.method1491(var4, this.field4170, var6, 87, var8, var7);
    }
}
