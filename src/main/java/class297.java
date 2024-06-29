import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class297 {

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "J")
    public long field4611 = 0L;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4601 = "shake:";

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field4610 = -1;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[I")
    public static int[] field4618 = new int[50];

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Lrg;")
    public static class342 field4619 = null;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field4600;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lqf;")
    public class64 field4605;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
    public static int[] field4608;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 18)
    public static final void method2137(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class154.field2492 * 128) {
            arg0 = class154.field2492 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class166.field2642 * 128) {
            arg2 = class166.field2642 * 128 - 1;
        }
        class270.field4175 = class107.field1604[arg3];
        class356.field5671 = class107.field1605[arg3];
        class13.field161 = class107.field1604[arg4];
        class195.field3066 = class107.field1605[arg4];
        class205.field3165 = arg0;
        class215.field3371 = arg1;
        class190.field2977 = arg2;
        class4.field46 = arg0 / 128;
        class192.field3033 = arg2 / 128;
        class79.field1147 = class4.field46 - class131.field2216;
        if (class79.field1147 < 0) {
            class79.field1147 = 0;
        }
        class185.field2896 = class192.field3033 - class131.field2216;
        if (class185.field2896 < 0) {
            class185.field2896 = 0;
        }
        class120.field1857 = class4.field46 + class131.field2216;
        if (class120.field1857 > class154.field2492) {
            class120.field1857 = class154.field2492;
        }
        class33.field512 = class192.field3033 + class131.field2216;
        if (class33.field512 > class166.field2642) {
            class33.field512 = class166.field2642;
        }
        short var15;
        if (class240.field3737) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class131.field2216 + class131.field2216 + 2; var16++) {
            for (int var17 = 0; var17 < class131.field2216 + class131.field2216 + 2; var17++) {
                int var18 = (var16 - class131.field2216 << 7) - (class205.field3165 & 0x7F);
                int var19 = (var17 - class131.field2216 << 7) - (class190.field2977 & 0x7F);
                int var20 = class4.field46 + var16 - class131.field2216;
                int var21 = class192.field3033 + var17 - class131.field2216;
                if (var20 >= 0 && var21 >= 0 && var20 < class154.field2492 && var21 < class166.field2642) {
                    int var22;
                    if (class93.field1425 == null) {
                        var22 = class121.field1924[0][var20][var21] + 128 - class215.field3371;
                    } else {
                        var22 = class93.field1425[0][var20][var21] + 128 - class215.field3371;
                    }
                    int var23 = class121.field1924[3][var20][var21] - class215.field3371 - 1000;
                    class286.field4445[var16][var17] = class101.method879(var18, var23, var22, var19, var15);
                } else {
                    class286.field4445[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class131.field2216 + class131.field2216 + 1; var24++) {
            for (int var25 = 0; var25 < class131.field2216 + class131.field2216 + 1; var25++) {
                class353.field5632[var24][var25] = class286.field4445[var24][var25] || class286.field4445[var24 + 1][var25] || class286.field4445[var24][var25 + 1] || class286.field4445[var24 + 1][var25 + 1];
            }
        }
        class37.field572 = arg6;
        class149.field2447 = arg7;
        class243.field3783 = arg8;
        class191.field3008 = arg9;
        class210.field3235 = arg10;
        class148.method1226();
        if (class72.field1087 != null) {
            class181.method1401(true);
            class320.method2260(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class240.field3737) {
                class144.field2355 = false;
                class211.method1562(0, 0, -84);
                class103.method891((float[]) null);
                class299.method2146();
            }
            class181.method1401(false);
        }
        class320.method2260(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 147)
    public static void method2138(byte arg0) {
        if (arg0 > -110) {
            field4602 = 21;
        }
        field4601 = null;
        field4618 = null;
        field4608 = null;
        field4619 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILug;)Ldh;", line = 179)
    public static final class204 method2139(int arg0, class25 arg1) {
        field4599++;
        class204 var2 = new class204();
        var2.field3152 = arg1.method314((byte) 120);
        var2.field3151 = class359.method2520(var2.field3152, (byte) -104);
        int var3 = -121 / ((-arg0 - 12) / 51);
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILrn;)V", line = 193)
    public static final void method2140(int arg0, class18 arg1) {
        field4607++;
        class248.field3848 = arg1;
        class51.field798 = class248.field3848.method197((byte) -69, 4);
        if (arg0 != 0) {
            method2138((byte) 67);
        }
    }
}
