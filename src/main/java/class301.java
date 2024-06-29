import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class301 extends class19 {

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Z")
    public boolean field4549 = false;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    private int field4553 = -1;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    private int field4548 = 0;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    private int field4565 = 0;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    private int field4572 = -32768;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public int field4560;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public int field4563;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Ldn;")
    private class260 field4564;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[F")
    public static float[] field4558 = new float[4];

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Lgl;")
    private class275 field4551;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "Lbm;")
    public static class307 field4570;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 5)
    public static void method2001(byte arg0) {
        if (arg0 < 81) {
            field4559 = 51;
        }
        field4570 = null;
        field4558 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V", line = 18)
    public final void method2002(int arg0, int arg1) {
        field4568++;
        if (this.field4549) {
            return;
        }
        this.field4565 += arg1;
        while (this.field4565 > this.field4564.field4041[this.field4548]) {
            this.field4565 -= this.field4564.field4041[this.field4548];
            this.field4548++;
            if (this.field4564.field4044.length <= this.field4548) {
                this.field4549 = true;
                break;
            }
        }
        int var3 = -49 / ((-arg0 - 39) / 40);
        if (!this.field4549) {
            class255.method1705(this.field4567, this.field4563, (byte) -46, this.field4564, this.field4548, false);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()I", line = 49)
    public final int method39() {
        field4571++;
        return this.field4572;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 62)
    public static final void method2003(int arg0) {
        for (class222 var1 = (class222) class185.field3013.method306(0); var1 != null; var1 = (class222) class185.field3013.method300(arg0 + 11449)) {
            int var2 = var1.field3514;
            if (class165.method1056(var2, (byte) 24)) {
                boolean var3 = true;
                class68[] var4 = class138.field2300[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1429;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field702;
                    class68 var7 = class319.method2196(-1351736944, var6);
                    if (var7 != null) {
                        class317.method2183((byte) -7, var7);
                    }
                }
            }
        }
        field4552++;
        if (arg0 != -11448) {
            method2005(62, -128, 100, -96, (class19) null, (class19) null, 111, 86, 57, -124, -100L);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V", line = 123)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class283.field4380 = arg3;
        class252.field3946 = arg5;
        class326.field4981 = arg0;
        field4557++;
        class157.field2569 = arg2;
        if (arg4 != 21650) {
            method2003(-61);
        }
        class302.field4578 = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILsc;Lsc;IIIIJ)V", line = 138)
    public static final void method2005(int arg0, int arg1, int arg2, int arg3, class19 arg4, class19 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class11 var12 = new class11();
        var12.field228 = arg10;
        var12.field234 = arg1 * 128 + 64;
        var12.field229 = arg2 * 128 + 64;
        var12.field233 = arg3;
        var12.field224 = arg4;
        var12.field231 = arg5;
        var12.field218 = arg6;
        var12.field223 = arg7;
        var12.field219 = arg8;
        var12.field220 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class326.field4975[var13][arg1][arg2] == null) {
                class326.field4975[var13][arg1][arg2] = new class47(var13, arg1, arg2);
            }
        }
        class326.field4975[arg0][arg1][arg2].field975 = var12;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIII)V", line = 259)
    public class301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4566 = arg1;
        this.field4567 = arg3;
        this.field4547 = arg0;
        this.field4560 = arg5 + arg6;
        this.field4563 = arg2;
        this.field4561 = arg4;
        int var8 = class87.method609(this.field4547, (byte) 89).field177;
        if (var8 == -1) {
            this.field4549 = true;
        } else {
            this.field4549 = false;
            this.field4564 = class279.method1882(25397, var8);
        }
        if (this.field4560 == arg6) {
            class255.method1705(this.field4567, this.field4563, (byte) -124, this.field4564, this.field4548, false);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 181)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        field4550++;
        class309 var13 = this.method2006(0);
        if (var13 != null) {
            var13.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4551);
            this.field4572 = var13.method39();
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)Lbg;", line = 209)
    private final class309 method2006(int arg0) {
        field4569++;
        if (arg0 != 0) {
            return (class309) null;
        }
        class8 var2 = class87.method609(this.field4547, (byte) 69);
        class309 var3;
        if (this.field4549) {
            var3 = var2.method72(true, 0, -1, -1);
        } else {
            var3 = var2.method72(true, this.field4565, this.field4553, this.field4548);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V", line = 245)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4554++;
    }
}
