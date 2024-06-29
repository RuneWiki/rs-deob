import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class393 {

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lh;")
    private class571 field5544 = new class571(16);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lan;")
    private class21 field5542;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field5537 = 0;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lcba;")
    public static class471 field5543 = new class471(55, 14);

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "[[I")
    public static int[][] field5545 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lej;")
    public static class104 field5547 = new class104("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
    public static int[] field5550 = new int[1000];

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lcba;")
    public static class471 field5549 = new class471(47, 4);

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "F")
    public static float field5551;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
    public static int[] field5546;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V")
    public final void method2356(byte arg0, int arg1) {
        field5540++;
        class571 var3 = this.field5544;
        synchronized (this.field5544) {
            this.field5544.method3253(arg1, -126);
        }
        if (arg0 >= -99) {
            method2359((byte) 40);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lcu;IIIII)Lle;")
    public final class257 method2357(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5541++;
        class83[] var7 = null;
        class642 var8 = this.method2361(true, arg5);
        if (var8.field9325 != null) {
            var7 = new class83[var8.field9325.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class575 var10 = arg0.method1156(83, var8.field9325[var9]);
                var7[var9] = new class83(var10.field7925, var10.field7915, var10.field7921, var10.field7919, var10.field7927, var10.field7924, var10.field7920, var10.field7916);
            }
        }
        if (arg4 != 4) {
            field5549 = null;
        }
        return new class257(var8.field9328, var7, var8.field9326, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method2358(int arg0) {
        if (arg0 != 2) {
            method2359((byte) 109);
        }
        class571 var2 = this.field5544;
        synchronized (this.field5544) {
            this.field5544.method3248(0);
        }
        field5538++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2359(byte arg0) {
        if (arg0 != -108) {
            return;
        }
        field5547 = null;
        field5549 = null;
        field5545 = null;
        field5546 = null;
        field5543 = null;
        field5550 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final void method2360(int arg0) {
        class571 var2 = this.field5544;
        synchronized (this.field5544) {
            this.field5544.method3246(false);
        }
        int var3 = 40 % ((-arg0 - 63) / 55);
        field5536++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Llo;")
    private final class642 method2361(boolean arg0, int arg1) {
        field5539++;
        class571 var3 = this.field5544;
        class642 var4;
        synchronized (this.field5544) {
            var4 = (class642) this.field5544.method3252((long) arg1, (byte) -71);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field5542;
        byte[] var6;
        synchronized (this.field5542) {
            var6 = this.field5542.method240(29, arg1, (byte) -124);
        }
        class642 var7 = new class642();
        if (var6 != null) {
            var7.method3705(new class11(var6), 3);
        }
        if (!arg0) {
            field5545 = null;
        }
        class571 var8 = this.field5544;
        synchronized (this.field5544) {
            this.field5544.method3243(var7, (long) arg1, 97);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class393(class111 arg0, int arg1, class21 arg2) {
        this.field5542 = arg2;
        this.field5542.method231(29, -126);
    }
}
