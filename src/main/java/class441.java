import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class441 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "B")
    public byte field6346;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public int field6360;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field6353;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field6351 = -1;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6349 = "";

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lub;")
    public static class301 field6358 = new class301("", 11);

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "[I")
    public static int[] field6361 = new int[8];

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Lrb;")
    public static class283 field6362 = new class283(40, 0);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lhe;")
    public class174 field6357;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lna;")
    public class252 field6359;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Les;")
    public class477 field6354;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lhn;")
    public class64 field6350;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
    public static int[] field6352;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 11)
    public static final void method2606(byte arg0) {
        class2.method15(class76.field1075.field3648, 92);
        field6347++;
        int var1 = (class118.field1848 >> 10) + (class110.field1775 >> 3);
        int var2 = -32 % ((arg0 - 13) / 44);
        int var3 = (class399.field5727 >> 3) + (class108.field1747 >> 10);
        class366.field5260 = class81.field1158.field6279 = 0;
        class81.field1158.method2888((byte) -127, 8, 8);
        byte var4 = 18;
        class100.field1585 = new byte[var4][];
        class94.field1536 = new byte[var4][];
        class98.field1560 = new int[var4];
        class397.field5706 = new byte[var4][];
        class137.field2065 = new byte[var4][];
        class302.field4119 = new int[var4];
        class44.field633 = new int[var4][4];
        class236.field3273 = new byte[var4][];
        class278.field3779 = new int[var4];
        class463.field6689 = new int[var4];
        class142.field2119 = new int[var4];
        class196.field2873 = new int[var4];
        int var5 = 0;
        for (int var6 = (var1 - (class9.field111 >> 4)) / 8; var6 <= (var1 + (class9.field111 >> 4)) / 8; var6++) {
            for (int var9 = (var3 - (class192.field2809 >> 4)) / 8; var9 <= (((class192.field2809 >> 4) + var3) / 8); var9++) {
                int var10 = (var6 << 8) + var9;
                class463.field6689[var5] = var10;
                class196.field2873[var5] = class103.field1618.method2488("m" + var6 + "_" + var9, false);
                class98.field1560[var5] = class103.field1618.method2488("l" + var6 + "_" + var9, false);
                class142.field2119[var5] = class103.field1618.method2488("n" + var6 + "_" + var9, false);
                class302.field4119[var5] = class103.field1618.method2488("um" + var6 + "_" + var9, false);
                class278.field3779[var5] = class103.field1618.method2488("ul" + var6 + "_" + var9, false);
                if (class142.field2119[var5] == -1) {
                    class196.field2873[var5] = -1;
                    class98.field1560[var5] = -1;
                    class302.field4119[var5] = -1;
                    class278.field3779[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class142.field2119.length; var7++) {
            class142.field2119[var7] = -1;
            class196.field2873[var7] = -1;
            class98.field1560[var7] = -1;
            class302.field4119[var7] = -1;
            class278.field3779[var7] = -1;
        }
        byte var8;
        if (class494.field7155 == 1 || class494.field7155 == 2) {
            var8 = 3;
        } else {
            var8 = 7;
        }
        class219.method1369(var8, var1, false, var3, -98);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 99)
    public static final void method2607(int arg0) {
        field6348++;
        class294.field3973.method152(-1);
        for (int var1 = 0; var1 < 32; var1++) {
            class24.field334[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class266.field3582[var2] = 0L;
        }
        class278.field3778 = 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBILpm;)V", line = 127)
    public static final void method2608(int arg0, int arg1, byte arg2, int arg3, class103 arg4) {
        field6355++;
        if (arg2 >= -22) {
            field6351 = -23;
        }
        for (class374 var5 = (class374) class398.field5713.method3137(0); var5 != null; var5 = (class374) class398.field5713.method3132(0)) {
            if (var5.field5377 == arg0 && arg3 << 7 == var5.field5370 && (arg1 << 7) == var5.field5382 && var5.field5371.field1646 == arg4.field1646) {
                if (var5.field5367 != null) {
                    class290.field3924.method298(var5.field5367);
                    var5.field5367 = null;
                }
                if (var5.field5369 != null) {
                    class290.field3924.method298(var5.field5369);
                    var5.field5369 = null;
                }
                var5.method2791((byte) 112);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 168)
    public static void method2609(byte arg0) {
        if (arg0 != 0) {
            field6362 = null;
        }
        field6358 = null;
        field6361 = null;
        field6349 = null;
        field6362 = null;
        field6352 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(BIIIII)V", line = 201)
    public class441(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6346 = arg0;
        this.field6363 = arg1;
        this.field6360 = arg3;
        this.field6353 = arg4;
        this.field6356 = arg5;
        this.field6364 = arg2;
    }
}
