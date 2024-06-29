import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class252 {

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Lge;")
    private class499 field3338 = new class499();

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "Lld;")
    private class114 field3346 = new class114();

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Lub;")
    private class18 field3347;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
    public static int[] field3337 = new int[25];

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "[I")
    public static int[] field3342 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "[F")
    public static float[] field3345 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "Lcu;")
    public static class145 field3334 = new class145(54, 3);

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[[B")
    public static byte[][] field3333;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
    public static final boolean method1514(int arg0) {
        if (arg0 != -1) {
            method1519(-81);
        }
        field3339++;
        return class412.field5693 > 0;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IJ)Lge;")
    public final class499 method1515(int arg0, long arg1) {
        field3332++;
        if (arg0 != 0) {
            return null;
        }
        class499 var4 = (class499) this.field3347.method182(arg1, (byte) 110);
        if (var4 != null) {
            this.field3346.method783(var4, (byte) -6);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
    public final void method1516(int arg0) {
        this.field3346.method784(arg0 + 90);
        field3336++;
        this.field3347.method176(-1);
        this.field3338 = new class499();
        this.field3344 = this.field3343;
        if (arg0 != 3) {
            field3342 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
    public static final void method1517(int arg0, byte arg1) {
        class108.method755((byte) 112);
        int var2 = 23 % ((arg1 + 26) / 54);
        field3335++;
        int var3 = class206.field2850.method423(true, arg0).field3328;
        if (var3 == 0) {
            return;
        }
        int var4 = class301.field3980.field3856[arg0];
        if (var3 == 5) {
            class513.field7561 = var4;
        }
        if (var3 == 6) {
            class329.field4343 = var4;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lge;BJ)V")
    public final void method1518(class499 arg0, byte arg1, long arg2) {
        field3341++;
        if (this.field3344 == 0) {
            class499 var5 = this.field3346.method787((byte) 127);
            var5.method300(false);
            var5.method2856(0);
            if (this.field3338 == var5) {
                class499 var6 = this.field3346.method787((byte) 127);
                var6.method300(false);
                var6.method2856(0);
            }
        } else {
            this.field3344--;
        }
        this.field3347.method173(arg2, arg0, (byte) 74);
        if (arg1 != 123) {
            method1520(9);
        }
        this.field3346.method783(arg0, (byte) -57);
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field3337 = null;
        if (arg0 == -24681) {
            field3345 = null;
            field3342 = null;
            field3333 = null;
            field3334 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
    public static final void method1520(int arg0) {
        field3340++;
        class302.field3987.method559(((float) class154.field2244.field7746 * 0.1F + 0.7F) * 1.1523438F);
        class302.field3987.method592(class105.field1546, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class302.field3987.method606(class353.field4778, -1, 256);
        if (arg0 >= -102) {
            field3334 = null;
        }
        class302.field3987.method527(class434.field5954);
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(I)V")
    public class252(int arg0) {
        this.field3343 = arg0;
        this.field3344 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3347 = new class18(var2);
    }
}
