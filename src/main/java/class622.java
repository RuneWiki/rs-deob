import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class622 implements class499 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lbs;")
    private class717 field8530;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field8539;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[I")
    public int[] field8537;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field8534;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Ltn;")
    private class95 field8538;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[F")
    public float[] field8529;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lhj;")
    public static class596 field8536 = new class596(102, 2);

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
    public static int[] field8544 = new int[25];

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lhj;")
    public static class596 field8541 = new class596(85, 11);

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Llja;")
    public static class744 field8545 = new class744(4, -1);

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[[I")
    public static int[][] field8546 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lhj;")
    public static class596 field8547 = new class596(79, 6);

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "F")
    public static float field8542;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Lfg;")
    public static class140 field8543;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method3539(int arg0) {
        field8543 = null;
        field8541 = null;
        field8546 = null;
        field8544 = null;
        if (arg0 > 75) {
            field8545 = null;
            field8536 = null;
            field8547 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lrq;")
    public static final class371 method3540(int arg0, int arg1) {
        field8532++;
        class371 var2 = (class371) class17.field308.method1684((long) arg0, -359);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class444.field5953.method437(1, (byte) -95, arg0);
        class371 var4 = new class371();
        var4.field4653 = arg0;
        if (var3 != null) {
            var4.method2169(new class403(var3), 0);
        }
        var4.method2170((byte) 75);
        if (var4.field4659 == 2 && class501.field7024.method2121(104, (long) arg0) == null) {
            class501.field7024.method2112(new class365(class89.field1186), (byte) 6, (long) arg0);
            class141.field1765[class89.field1186++] = var4;
        }
        class17.field308.method1686(-25638, (long) arg0, var4);
        if (arg1 != 4622) {
            field8547 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)B")
    public static final byte method3541(int arg0, int arg1, int arg2) {
        field8540++;
        int var3 = 9 % ((arg2 - 7) / 51);
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method2948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field8535++;
        class296.method1731(arg4, this.field8530.field10038.field7973, this.field8539, arg5, arg6 ? this.field8537 : null, arg2, arg3, arg0, arg7 ? this.field8530.field10044 : null, (byte) -48, this.field8530.field10038.field7972, arg7 ? this.field8529 : null, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method2949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class296.method1731(arg4, this.field8537, this.field8530.field10038.field7972, arg5, arg6 ? this.field8530.field10038.field7973 : null, arg2, arg3, arg0, arg7 ? this.field8529 : null, (byte) -43, this.field8539, arg7 ? this.field8530.field10044 : null, arg1);
        field8531++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Laa;IIIIJLkq;II)V")
    public static final void method3542(class513 arg0, int arg1, int arg2, int arg3, int arg4, long arg5, class620 arg6, int arg7, int arg8) {
        field8533++;
        int var10 = arg2 * arg2 + arg7 * arg7;
        if (arg5 < (long) var10) {
            return;
        }
        if (arg4 >= -91) {
            method3540(59, -37);
        }
        int var11 = Math.min(arg6.field8506 / 2, arg6.field8416 / 2);
        if (var10 <= var11 * var11) {
            class455.method2758(arg2, class342.field4287[arg8], arg7, arg0, (byte) -6, arg1, arg3, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class7.field100 == 4) {
            var12 = (int) class47.field626 & 0x3FFF;
        } else {
            var12 = (int) class47.field626 + class579.field7884 & 0x3FFF;
        }
        int var13 = class789.field10868[var12];
        int var14 = class789.field10864[var12];
        if (class7.field100 != 4) {
            var14 = var14 * 256 / (class251.field2948 + 256);
            var13 = var13 * 256 / (class251.field2948 + 256);
        }
        int var15 = arg2 * var13 + arg7 * var14 >> 14;
        int var16 = arg2 * var14 - arg7 * var13 >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class310.field3851[arg8].method1841((float) arg6.field8506 / 2.0F + (float) arg3 + (float) var19, (float) arg6.field8416 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lbs;Ltf;Ltn;)V")
    public class622(class717 arg0, class312 arg1, class95 arg2) {
        this.field8530 = arg0;
        if (arg1 instanceof class236) {
            class236 var4 = (class236) arg1;
            this.field8539 = var4.field9467;
            this.field8537 = var4.field2790;
            this.field8534 = var4.field9459;
        } else if ((arg1 instanceof class21)) {
            class21 var5 = (class21) arg1;
            this.field8539 = var5.field9467;
            this.field8534 = var5.field9459;
            this.field8537 = var5.field350;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field8538 = arg2;
            if (this.field8538.field1242 != this.field8539 || this.field8538.field1239 != this.field8534) {
                throw new RuntimeException();
            }
            this.field8529 = this.field8538.field1243;
        }
    }
}
