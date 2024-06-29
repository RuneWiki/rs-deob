import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class250 {

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Z")
    public static boolean field3967 = true;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lgj;")
    public static class257 field3968 = new class257();

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lti;")
    public static class248 field3948;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ltm;")
    public class80 field3961;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
    public int[] field3953;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
    public int[] field3955;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
    public int[] field3960;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "[I")
    public int[] field3963;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
    public int[] field3972;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[I")
    public int[] field3973;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[Ltm;")
    public class80[] field3954;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3958;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[[I")
    public int[][] field3947;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[[I")
    public int[][] field3956;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lrj;Ljava/awt/Frame;I)V", line = 7)
    public static final void method1774(class22 arg0, Frame arg1, int arg2) {
        while (true) {
            class153 var3 = arg0.method168(-120, arg1);
            while (var3.field2419 == 0) {
                class19.method140(10L, 16711680);
            }
            if (var3.field2419 == 1) {
                if (arg2 != 0) {
                    return;
                }
                field3966++;
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class19.method140(100L, 16711680);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lfk;", line = 43)
    public static final class54 method1775(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2994;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 53)
    public static final void method1776(boolean arg0) {
        field3952++;
        class71.field879++;
        if (!arg0) {
            field3967 = true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V", line = 74)
    public static final void method1777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg7 - 334;
        field3951++;
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = arg2;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var11 = (class119.field1650 - class44.field500) * var8 / 100 + class44.field500;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = arg0 * var11 >> 8;
        int var15 = var14;
        if (var9 != 0) {
            int var16 = class104.field1426[var9];
            var10 = -var14 * var16 >> 16;
            int var17 = class104.field1435[var9];
            var15 = var14 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class104.field1426[var12];
            var13 = var15 * var18 >> 16;
            int var19 = class104.field1435[var12];
            var15 = var15 * var19 >> 16;
        }
        class283.field4508 = arg3;
        class10.field96 = arg5 - var13;
        class119.field1657 = arg1 - var10;
        class280.field4415 = arg6 - var15;
        class257.field4067 = arg4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Llf;", line = 132)
    public static final class143 method1778(byte arg0) {
        if (arg0 > -65) {
            method1777(-45, 110, 22, 27, 50, 66, -31, -20);
        }
        class143 var1 = new class143(34);
        field3949++;
        var1.method1055(11, 89);
        var1.method1055(class164.field2522, 116);
        var1.method1055(class337.field5384 ? 1 : 0, 111);
        var1.method1055(class38.field430 ? 1 : 0, 126);
        var1.method1055(class353.field5629 ? 1 : 0, 88);
        var1.method1055(class13.field136 ? 1 : 0, 82);
        var1.method1055(class327.field5233 ? 1 : 0, 86);
        var1.method1055(class10.field104 ? 1 : 0, 79);
        var1.method1055(class139.field2087 ? 1 : 0, 98);
        var1.method1055(class171.field2601 ? 1 : 0, 109);
        var1.method1055(class16.field164, 115);
        var1.method1055(class290.field4566 ? 1 : 0, 112);
        var1.method1055(class76.field993 ? 1 : 0, 121);
        var1.method1055(class347.field5512 ? 1 : 0, 113);
        var1.method1055(client.field4441, 115);
        var1.method1055(class90.field1192 ? 1 : 0, 90);
        var1.method1055(class189.field2847, 101);
        var1.method1055(class31.field365, 83);
        var1.method1055(class213.field3240, 84);
        var1.method1003(class352.field5609, -2);
        var1.method1003(class226.field3413, -2);
        var1.method1055(class141.method980(), 102);
        var1.method1052(class261.field4133, false);
        var1.method1055(class161.field2482, 91);
        var1.method1055(class283.field4519 ? 1 : 0, 113);
        var1.method1055(class222.field3355 ? 1 : 0, 106);
        var1.method1055(class75.field966, 121);
        var1.method1055(class151.field2386 ? 1 : 0, 121);
        var1.method1055(class178.field2680 ? 1 : 0, 125);
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 175)
    public static void method1779(byte arg0) {
        field3968 = null;
        field3958 = null;
        if (arg0 != -51) {
            field3948 = (class248) null;
        }
        field3948 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILio;JZ)V", line = 186)
    public static final void method1780(int arg0, int arg1, int arg2, int arg3, class294 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class360 var8 = new class360();
        var8.field5697 = arg4;
        var8.field5698 = arg1 * 128 + 64;
        var8.field5694 = arg2 * 128 + 64;
        var8.field5702 = arg3;
        var8.field5699 = arg5;
        var8.field5695 = arg6;
        if (class194.field2947[arg0][arg1][arg2] == null) {
            class194.field2947[arg0][arg1][arg2] = new class196(arg0, arg1, arg2);
        }
        class194.field2947[arg0][arg1][arg2].field3003 = var8;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 209)
    public static final void method1781(int arg0) {
        field3950++;
        class144.method1068();
        class10.field94 = new class97[8];
        class10.field94[1] = new class21();
        class10.field94[2] = new class202();
        class10.field94[3] = new class167();
        class10.field94[4] = new class137();
        class10.field94[5] = new class61();
        if (arg0 > -117) {
            field3948 = (class248) null;
        }
        class10.field94[6] = new class34();
        class10.field94[7] = new class163();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[B)V", line = 233)
    private final void method1782(byte arg0, byte[] arg1) {
        if (arg0 != -116) {
            return;
        }
        field3971++;
        class143 var3 = new class143(class127.method866(true, arg1));
        int var4 = var3.method1043(true);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3962 = var3.method1057(arg0 ^ 0x3);
        } else {
            this.field3962 = 0;
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method1043(true);
        this.field3965 = var3.method1051(1);
        this.field3973 = new int[this.field3965];
        for (int var8 = 0; var8 < this.field3965; var8++) {
            this.field3973[var8] = var6 += var3.method1051(1);
            if (this.field3973[var8] > var5) {
                var5 = this.field3973[var8];
            }
        }
        this.field3970 = var5 + 1;
        this.field3956 = new int[this.field3970][];
        this.field3963 = new int[this.field3970];
        this.field3953 = new int[this.field3970];
        this.field3955 = new int[this.field3970];
        this.field3960 = new int[this.field3970];
        if (var7 != 0) {
            this.field3972 = new int[this.field3970];
            for (int var9 = 0; var9 < this.field3970; var9++) {
                this.field3972[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3965; var10++) {
                this.field3972[this.field3973[var10]] = var3.method1057(-100);
            }
            this.field3961 = new class80(this.field3972);
        }
        for (int var11 = 0; var11 < this.field3965; var11++) {
            this.field3963[this.field3973[var11]] = var3.method1057(-100);
        }
        for (int var12 = 0; var12 < this.field3965; var12++) {
            this.field3953[this.field3973[var12]] = var3.method1057(-122);
        }
        for (int var13 = 0; var13 < this.field3965; var13++) {
            this.field3960[this.field3973[var13]] = var3.method1051(1);
        }
        for (int var14 = 0; var14 < this.field3965; var14++) {
            int var15 = 0;
            int var16 = this.field3973[var14];
            int var17 = this.field3960[var16];
            this.field3956[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field3956[var16][var19] = var15 += var3.method1051(arg0 + 117);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field3955[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field3956[var16] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field3947 = new int[var5 + 1][];
        this.field3954 = new class80[var5 + 1];
        for (int var21 = 0; var21 < this.field3965; var21++) {
            int var22 = this.field3973[var21];
            int var23 = this.field3960[var22];
            this.field3947[var22] = new int[this.field3955[var22]];
            for (int var24 = 0; var24 < this.field3955[var22]; var24++) {
                this.field3947[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field3956[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field3956[var22][var25];
                }
                this.field3947[var22][var26] = var3.method1057(-109);
            }
            this.field3954[var22] = new class80(this.field3947[var22]);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)Lig;", line = 405)
    public static final class199 method1783(byte arg0, int arg1) {
        field3964++;
        class199 var2 = (class199) class348.field5519.method380(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -51) {
            method1781(-40);
        }
        byte[] var3 = class223.field3379.method100(1, arg1, (byte) -107);
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1387(arg1, new class143(var3), 0);
        }
        class348.field5519.method377((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([BI)V", line = 436)
    public class250(byte[] arg0, int arg1) {
        this.field3959 = class203.method1418(51, arg0, arg0.length);
        if (this.field3959 != arg1) {
            throw new RuntimeException();
        }
        this.method1782((byte) -116, arg0);
    }
}
