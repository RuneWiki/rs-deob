import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class233 {

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lmh;")
    public static class128 field4023 = class22.method156(127, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Ldj;")
    public static class314 field4027;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
    public static int[] field4025;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I", line = 9)
    public static int method1599(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1600(int arg0) {
        field4019++;
        if (arg0 <= 122) {
            field4027 = (class314) null;
        }
        class201.field3559.method1834(17);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V", line = 35)
    public static final void method1601(int arg0, int arg1) {
        field4022++;
        if (class52.field1023 == arg0) {
            class263.field4567.method1171(arg1, 3);
        } else {
            class194.field3347 = arg1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZLmh;)V", line = 50)
    public static final void method1602(int arg0, boolean arg1, class128 arg2) {
        field4024++;
        class128 var3 = arg2.method836((byte) 72);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = arg0; var6 < class212.field3752; var6++) {
            class200 var7 = class180.method1226(false, var6);
            if ((!arg1 || var7.field3522) && var7.field3537 == -1 && var7.field3512 == -1 && var7.field3515 == 0 && var7.field3506.method836((byte) 72).method823(var3, true) != -1) {
                if (var5 >= 250) {
                    class118.field2001 = null;
                    class315.field5341 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        class315.field5341 = var5;
        class128[] var10 = new class128[class315.field5341];
        class215.field3786 = 0;
        class118.field2001 = var4;
        for (int var11 = 0; var11 < class315.field5341; var11++) {
            var10[var11] = class180.method1226(false, var4[var11]).field3506;
        }
        class34.method240(var10, class118.field2001, arg0 ^ 0x7E);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 124)
    public static final void method1603(int arg0) {
        class151.field2591 = new class120(arg0);
        field4021++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V", line = 133)
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4020++;
        int var8 = class7.method59(class181.field3173, arg0, class70.field1315, 0);
        int var9 = class7.method59(class181.field3173, arg4, class70.field1315, 0);
        int var10 = class7.method59(class43.field875, arg5, class193.field3335, arg2);
        int var11 = class7.method59(class43.field875, arg1, class193.field3335, 0);
        int var12 = class7.method59(class181.field3173, arg0 + arg3, class70.field1315, 0);
        int var13 = class7.method59(class181.field3173, arg4 - arg3, class70.field1315, 0);
        for (int var14 = var8; var14 < var12; var14++) {
            class314.method2138(var11, true, arg7, class219.field3850[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class314.method2138(var11, true, arg7, class219.field3850[var15], var10);
        }
        int var16 = class7.method59(class43.field875, arg3 + arg5, class193.field3335, arg2 ^ 0x0);
        int var17 = class7.method59(class43.field875, arg1 - arg3, class193.field3335, 0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class219.field3850[var18];
            class314.method2138(var16, true, arg7, var19, var10);
            class314.method2138(var17, true, arg6, var19, var16);
            class314.method2138(var11, true, arg7, var19, var17);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 182)
    public static void method1605(int arg0) {
        if (arg0 == 0) {
            field4023 = null;
            field4027 = null;
            field4025 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Lem;", line = 215)
    public static final class10 method1606(boolean arg0, int arg1) {
        field4026++;
        if (!arg0) {
            return (class10) null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class200.field3508[var2] == null || class200.field3508[var2][var3] == null) {
            boolean var4 = class133.method890(!arg0, var2);
            if (!var4) {
                return null;
            }
        }
        return class200.field3508[var2][var3];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V", line = 249)
    public static final void method1607(int arg0, int arg1, int arg2) {
        field4028++;
        class229 var3 = class241.method1638(arg0, 111, arg1);
        var3.method1574(3199);
        var3.field3981 = arg2;
    }
}
