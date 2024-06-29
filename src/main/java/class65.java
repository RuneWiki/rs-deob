import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 extends class9 {

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1056 = "rating: ";

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "Z")
    public static boolean field1055 = true;

    @OriginalMember(owner = "client!hl", name = "jb", descriptor = "Z")
    public static boolean field1064 = true;

    @OriginalMember(owner = "client!hl", name = "lb", descriptor = "[I")
    public static int[] field1066 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!hl", name = "kb", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!hl", name = "nb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!hl", name = "mb", descriptor = "[[I")
    public static int[][] field1067;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[[I", line = 8)
    public final int[][] method74(int arg0, int arg1) {
        field1057++;
        if (arg1 != 82) {
            field1066 = (int[]) null;
        }
        int[][] var3 = this.field4772.method1175(-56, arg0);
        if (this.field4772.field2488 && this.method75(16891)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % this.field142 * this.field142;
            for (int var8 = 0; var8 < class70.field1108; var8++) {
                int var9 = this.field146[var8 % this.field134 + var7];
                var5[var8] = class280.method2001(4080, var9 << 4);
                var6[var8] = class280.method2001(65280, var9) >> 4;
                var4[var8] = class280.method2001(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)V", line = 54)
    public static final void method495(byte arg0) {
        if (arg0 > -30) {
            return;
        }
        field1054++;
        class29.method192();
        for (int var1 = 0; var1 < 4; var1++) {
            class244.field3772[var1].method414(-17697);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lja;Lja;BLja;)V", line = 74)
    public static final void method496(class64 arg0, class64 arg1, byte arg2, class64 arg3) {
        if (arg2 >= -78) {
            field1058 = -116;
        }
        class24.field416 = arg1;
        class312.field4905 = arg0;
        class84.field1245 = arg3;
        field1065++;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)Lbk;", line = 90)
    public static final class63 method497(int arg0, int arg1) {
        if (arg0 != 1886497452) {
            field1058 = -98;
        }
        class63 var2 = (class63) class240.field3732.method1830((long) arg1, (byte) 52);
        field1063++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2788.method467(arg1, 74, 32);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method458(new class101(var3), (byte) 94);
        }
        var4.method457(-13258);
        class240.field3732.method1831((long) arg1, var4, arg0 ^ 0x8F8E631B);
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V", line = 119)
    public static void method498(int arg0) {
        field1066 = null;
        int var1 = 26 / ((arg0 + 30) / 59);
        field1067 = (int[][]) null;
        field1056 = null;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)V", line = 134)
    public static final void method499(byte arg0) {
        field1061++;
        if (class180.field2885 != null || class76.field1165 != null) {
            return;
        }
        if (arg0 != -71) {
            method499((byte) -112);
        }
        int var1 = class152.field2452;
        if (!class243.field3754) {
            if (var1 == 1 && field1062 > 0) {
                short var2 = class12.field233[field1062 - 1];
                if (var2 == 1 || var2 == 28 || var2 == 24 || var2 == 30 || var2 == 31 || var2 == 44 || var2 == 58 || var2 == 17 || var2 == 41 || var2 == 37 || var2 == 57 || var2 == 1005) {
                    int var3 = class59.field930[field1062 - 1];
                    int var4 = class156.field2492[field1062 - 1];
                    class292 var5 = class215.method1555((byte) -48, var3);
                    class42 var6 = client.method1786(var5);
                    if (var6.method336((byte) 56) || var6.method337(arg0 - 20747)) {
                        class102.field1721 = false;
                        class204.field3237 = 0;
                        if (class180.field2885 != null) {
                            class143.method1091(class180.field2885, (byte) 84);
                        }
                        class180.field2885 = class215.method1555((byte) -48, var3);
                        class59.field926 = class223.field3569;
                        class303.field4761 = class267.field4136;
                        class25.field421 = var4;
                        class143.method1091(class180.field2885, (byte) 98);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class76.field1170 == 1 && field1062 > 2 || class19.method156(field1062 - 1, arg0 + 2071))) {
                var1 = 2;
            }
            if (var1 == 2 && field1062 > 0 || class43.field761 == 1) {
                class282.method2006(71);
            }
            if (var1 == 1 && field1062 > 0 || class43.field761 == 2) {
                class148.method1145(81);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class203.field3225;
            int var8 = class278.field4309;
            if (class76.field1168 - 10 > var7 || var7 > class217.field3485 + class76.field1168 + 10 || (class316.field4931 - 10) > var8 || var8 > class316.field4931 + class169.field2626 + 10) {
                class243.field3754 = false;
                class77.method567(class169.field2626, class76.field1168, class217.field3485, arg0 ^ 0xFFFFFFB9, class316.field4931);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class316.field4931;
        int var10 = class217.field3485;
        int var11 = class76.field1168;
        int var12 = class267.field4136;
        int var13 = class223.field3569;
        int var14 = -1;
        for (int var15 = 0; var15 < field1062; var15++) {
            int var16;
            if (class77.field1176) {
                var16 = (field1062 - var15 - 1) * 15 + var9 + 35;
            } else {
                var16 = (field1062 - var15 - 1) * 15 + var9 + 31;
            }
            if (var11 < var13 && var13 < (var10 + var11) && var12 > (var16 - 13) && (var16 + 3) > var12) {
                var14 = var15;
            }
        }
        if (var14 != -1) {
            class132.method1003(var14, (byte) 109);
        }
        class243.field3754 = false;
        class77.method567(class169.field2626, class76.field1168, class217.field3485, 0, class316.field4931);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZI[Lsj;[B)V", line = 276)
    public static final void method500(int arg0, int arg1, boolean arg2, int arg3, class56[] arg4, byte[] arg5) {
        field1068++;
        if (arg3 != -26597) {
            field1056 = (String) null;
        }
        int var6 = -1;
        class101 var7 = new class101(arg5);
        while (true) {
            int var8 = var7.method783((byte) 116);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method738(-957401312);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method741(50);
                int var15 = var14 & 0x3;
                int var16 = arg1 + var12;
                int var17 = var14 >> 2;
                int var18 = arg0 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class56 var19 = null;
                    if (!arg2) {
                        int var20 = var13;
                        if ((class250.field3857[1][var16][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class181.method1347(var13, -42, var15, arg2, var6, var17, var13, !arg2, var16, var19, var18);
                }
            }
        }
    }
}
