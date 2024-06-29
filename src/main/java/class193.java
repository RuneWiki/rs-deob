import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class193 extends class279 {

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    private int field3207 = 32768;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Ltl;")
    public static class59 field3201 = class85.method639("logo", 9588);

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Ltl;")
    private static class59 field3202 = class85.method639("Created gameworld", 9588);

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "[[B")
    public static byte[][] field3212 = new byte[50][];

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "Ltl;")
    public static class59 field3214 = field3202;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "Z")
    public static boolean field3216 = true;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZILtl;)V", line = 30)
    public static final void method1409(boolean arg0, int arg1, class59 arg2) {
        class59 var3 = arg2.method451((byte) -118).method480((byte) 33);
        field3203++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class29.field385; var5++) {
            class102 var6 = class211.field3438[class243.field4060[var5]];
            if (var6 != null && var6.field1663 != null && var6.field1663.method472(var3, 90)) {
                class28.method178(var6.field1773[0], 2, 0, (byte) -6, class286.field4920.field1729[0], 1, class286.field4920.field1773[0], 0, var6.field1729[0], 0, 1, false);
                if (arg1 == 1) {
                    class234.field3888.method1768(arg0, 237);
                    class299.field5121++;
                    class234.field3888.method1238(1871071368, class243.field4060[var5]);
                } else if (arg1 == 4) {
                    class190.field3178++;
                    class234.field3888.method1768(true, 42);
                    class234.field3888.method1238(1871071368, class243.field4060[var5]);
                } else if (arg1 == 5) {
                    class260.field4344++;
                    class234.field3888.method1768(true, 177);
                    class234.field3888.method1237(true, class243.field4060[var5]);
                } else if (arg1 == 6) {
                    class235.field3904++;
                    class234.field3888.method1768(true, 183);
                    class234.field3888.method1196((byte) 78, class243.field4060[var5]);
                } else if (arg1 == 7) {
                    class234.field3888.method1768(true, 84);
                    class234.field3888.method1200(class243.field4060[var5], 32602);
                    class100.field1622++;
                }
                var4 = true;
                break;
            }
        }
        if (arg0 && !var4) {
            class288.method2003(class275.field4742, 0, 79, class233.method1630(new class59[] { class264.field4562, var3 }, -2883));
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILs;)V", line = 111)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field3207 = arg2.method1214(-18254) << 4;
        } else if (arg1 == 1) {
            this.field4789 = arg2.method1221(94) == 1;
        }
        field3211++;
        if (arg0 >= -125) {
            this.method44(false, -17);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)[[I", line = 139)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            this.field3207 = 64;
        }
        field3204++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[] var4 = this.method1960(arg0 + 7402, arg1, 1);
            int[] var5 = this.method1960(-125, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class56.field835; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field3207 >> 12;
                int var12 = class53.field787[var10] * var11 >> 12;
                int var13 = class243.field4064[var10] * var11 >> 12;
                int var14 = class132.field2197 & arg1 + (var12 >> 12);
                int var15 = class310.field5270 & var9 + (var13 >> 12);
                int[][] var16 = this.method1956(0, var14, (byte) -112);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/lang/Object;[JIII)V", line = 205)
    public static final void method1410(Object[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg4 + arg3) / 2;
            long var6 = arg1[var5];
            int var8 = arg4;
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var6;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (arg1[var10] < ((long) (var10 & 0x1) + var6)) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var8];
                    arg1[var8] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8++] = var13;
                }
            }
            arg1[arg3] = arg1[var8];
            arg1[var8] = var6;
            arg0[arg3] = arg0[var8];
            arg0[var8] = var9;
            method1410(arg0, arg1, 6859, var8 - 1, arg4);
            method1410(arg0, arg1, 6859, arg3, var8 + 1);
        }
        if (arg2 == 6859) {
            field3205++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 269)
    public class193() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V", line = 278)
    public static void method1411(boolean arg0) {
        field3214 = null;
        field3202 = null;
        field3212 = (byte[][]) null;
        field3201 = null;
        if (!arg0) {
            field3214 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLtl;Ltl;ILtl;)V", line = 292)
    public static final void method1412(boolean arg0, class59 arg1, class59 arg2, int arg3, class59 arg4) {
        if (arg0) {
            field3212 = (byte[][]) ((byte[][]) null);
        }
        field3209++;
        class200.method1439(arg1, arg4, -1, arg2, 45, arg3);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)[I", line = 306)
    public final int[] method44(boolean arg0, int arg1) {
        field3208++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            field3212 = (byte[][]) ((byte[][]) null);
        }
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-124, arg1, 1);
            int[] var5 = this.method1960(-127, arg1, 2);
            for (int var6 = 0; var6 < class56.field835; var6++) {
                int var7 = (var4[var6] & 0xFFD) >> 4;
                int var8 = var5[var6] * this.field3207 >> 12;
                int var9 = class243.field4064[var7] * var8 >> 12;
                int var10 = class310.field5270 & var6 + (var9 >> 12);
                int var11 = class53.field787[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg1 & class132.field2197;
                int[] var13 = this.method1960(-122, var12, 0);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 351)
    public final void method319(byte arg0) {
        field3215++;
        class162.method1155(0);
        if (arg0 >= -9) {
            this.method51(-118, 91, (class170) null);
        }
    }
}
