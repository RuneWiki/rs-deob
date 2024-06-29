import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class312 {

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    private int field4410 = 0;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    private int field4416 = 0;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    private int field4420 = 0;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Llf;")
    private class250 field4408;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "Ltf;")
    private class311 field4415;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "[Lbaa;")
    private class548[] field4413;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "Lqv;")
    public class469 field4417;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "J")
    public static long field4414 = 1L;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "Lal;")
    public static class109 field4419;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method2002(int arg0, int arg1) {
        if (arg0 == 2) {
            field4409++;
            return arg1 == 0 || arg1 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILru;I)Z", line = 19)
    public final boolean method2003(int arg0, class205 arg1, int arg2) {
        field4418++;
        if (this.field4410 == arg2) {
            return false;
        } else {
            this.field4413[this.field4410 & Integer.MAX_VALUE].method760(arg1, -1, arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 38)
    public static void method2004(int arg0) {
        if (arg0 != 4) {
            method2004(-28);
        }
        field4419 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Llf;)V", line = 223)
    public class312(class250 arg0) {
        this.field4408 = arg0;
        this.field4415 = new class311(arg0);
        this.field4413 = new class548[10];
        this.field4413[1] = new class393(arg0);
        this.field4413[2] = new class747(arg0, this.field4415);
        this.field4413[4] = new class120(arg0, this.field4415);
        this.field4413[5] = new class96(arg0, this.field4415);
        this.field4413[6] = new class272(arg0);
        this.field4413[7] = new class213(arg0);
        this.field4413[3] = this.field4417 = new class469(arg0);
        this.field4413[8] = new class163(arg0, this.field4415);
        this.field4413[9] = new class613(arg0, this.field4415);
        if (!this.field4413[8].method756(true)) {
            this.field4413[8] = this.field4413[4];
        }
        if (!this.field4413[9].method756(true)) {
            this.field4413[9] = this.field4413[8];
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZIIZI)V", line = 55)
    public final void method2005(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4411++;
        if (arg5 != -10) {
            this.method2007(-54, -16);
        }
        boolean var7 = arg1 & this.field4408.method459();
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg0 = arg3;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg4) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field4410 != arg2) {
            if (this.field4410 != 0) {
                this.field4413[this.field4410 & Integer.MAX_VALUE].method759(arg5 ^ 0xFFFFFFF5);
            }
            if (arg2 != 0) {
                this.field4413[arg2 & Integer.MAX_VALUE].method754(arg4, false);
                this.field4413[Integer.MAX_VALUE & arg2].method758(arg4, arg5 ^ 0xFFFFFFF6);
                this.field4413[arg2 & Integer.MAX_VALUE].method753(arg0, arg3, 14106);
            }
            this.field4416 = arg3;
            this.field4420 = arg0;
            this.field4410 = arg2;
        } else if (this.field4410 != 0) {
            this.field4413[this.field4410 & Integer.MAX_VALUE].method758(arg4, 0);
            if (this.field4416 != arg3 || this.field4420 != arg0) {
                this.field4413[this.field4410 & Integer.MAX_VALUE].method753(arg0, arg3, arg5 ^ 0xFFFFC8EC);
                this.field4420 = arg0;
                this.field4416 = arg3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIILha;)V", line = 110)
    public static final void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5) {
        field4407++;
        arg5.method453(arg3, arg2, arg0 + arg3, arg1 + arg2);
        arg5.method529(arg1, arg2, arg0, arg3, -16777216, 1);
        if (class286.field4101 < 100) {
            return;
        }
        float var6 = (float) class752.field10181 / (float) class752.field10176;
        int var7 = arg0;
        int var8 = arg1;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg1 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg3;
        int var10 = (arg1 - var8) / 2 + arg2;
        if (class767.field10537 == null || arg0 != class767.field10537.method350() || arg1 != class767.field10537.method351()) {
            class752.method4126(class752.field10177, class752.field10181 + class752.field10178, class752.field10177 - -class752.field10176, class752.field10178, var9, var10, var7 + var9, var8 + var10);
            class752.method4121(arg5);
            class767.field10537 = arg5.method454(var9, var10, var7, var8, false);
        }
        class767.field10537.method968(var9, var10);
        int var11 = class386.field5609 * var7 / class752.field10176;
        int var12 = class789.field10840 * var8 / class752.field10181;
        int var13 = class322.field4581 * var7 / class752.field10176 + var9;
        int var14 = var10 - (var12 - var8) - (class709.field9696 * var8 / class752.field10181);
        if (arg4 >= -118) {
            method2004(-97);
        }
        int var15 = -1996554240;
        if (class682.field9122 == class426.field6204) {
            var15 = -1996488705;
        }
        arg5.method434(var13, var14, var11, var12, var15, 1);
        arg5.method539(var13, var14, var11, var12, var15, 0);
        if (class419.field6021 <= 0) {
            return;
        }
        int var16;
        if (class7.field54 > 50) {
            var16 = (100 - class7.field54) * 5;
        } else {
            var16 = class7.field54 * 5;
        }
        for (class223 var17 = (class223) class752.field10168.method679((byte) -86); var17 != null; var17 = (class223) class752.field10168.method681(-19)) {
            class349 var18 = class752.field10153.method2074(124, var17.field2885);
            if (class763.method4205(var18, 1)) {
                if (class672.field9007 == var17.field2885) {
                    int var19 = var17.field2889 * var7 / class752.field10176 + var9;
                    int var20 = (class752.field10181 - var17.field2893) * var8 / class752.field10181 + var10;
                    arg5.method529(4, var20 - 2, 4, var19 - 2, var16 << 24 | 0xFFFF00, 1);
                } else if (class163.field2163 != -1 && class163.field2163 == var18.field5098) {
                    int var21 = var17.field2889 * var7 / class752.field10176 + var9;
                    int var22 = (class752.field10181 - var17.field2893) * var8 / class752.field10181 + var10;
                    arg5.method529(4, var22 - 2, 4, var21 - 2, var16 << 24 | 0xFFFF00, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(II)Z", line = 210)
    public final boolean method2007(int arg0, int arg1) {
        field4412++;
        if (arg1 != 9) {
            method2002(90, -9);
        }
        return this.field4413[arg0].method756(true);
    }
}
