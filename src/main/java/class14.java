import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lwd;")
    public static class150 field372 = class2.method9(true, "Angreifen");

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lwd;")
    public static class150 field371 = class2.method9(true, "null");

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field375 = -1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
    public static final void method106(int arg0, byte arg1) {
        class124.field2874 += arg0 * 128;
        if (class124.field2874 > class74.field1855.length) {
            class124.field2874 -= class74.field1855.length;
            int var2 = (int) (Math.random() * 12.0D);
            class109.method779(128, class43.field1157[var2]);
        }
        field374++;
        int var3 = 0;
        if (arg1 <= 84) {
            field375 = 48;
        }
        short var4 = 256;
        int var5 = arg0 * 128;
        int var6 = (var4 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class82.field1976[var3 + var5] - class74.field1855[class124.field2874 + var3 & class74.field1855.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class82.field1976[var3++] = var27;
        }
        for (int var8 = var4 - arg0; var8 < var4; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class82.field1976[var25 + var24] = 255;
                } else {
                    class82.field1976[var24 + var25] = 0;
                }
            }
        }
        if (class77.field1902 > 0) {
            class77.field1902 -= arg0 * 4;
        }
        if (class21.field571 > 0) {
            class21.field571 -= arg0 * 4;
        }
        if (class21.field571 == 0 && class77.field1902 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 0) {
                class21.field571 = 1024;
            }
            if (var9 == 1) {
                class77.field1902 = 1024;
            }
        }
        for (int var10 = 0; var10 < var4 - arg0; var10++) {
            class76.field1889[var10] = class76.field1889[arg0 + var10];
        }
        for (int var11 = var4 - arg0; var11 < var4; var11++) {
            class76.field1889[var11] = (int) (Math.sin((double) client.field627 / 14.0D) * 16.0D + Math.sin((double) client.field627 / 15.0D) * 14.0D + Math.sin((double) client.field627 / 16.0D) * 12.0D);
            client.field627++;
        }
        int var12 = ((class11.field280 & 0x1) + arg0) / 2;
        class131.field3080 += arg0;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class131.field3080 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class82.field1976[(var22 << 7) + var23] = 192;
        }
        class131.field3080 = 0;
        for (int var14 = 0; var14 < var4; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class82.field1976[var20 + var21 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class82.field1976[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class65.field1651[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var4; var17++) {
                int var18 = var17 * 128;
                if (var4 > var12 + var17) {
                    var16 += class65.field1651[var15 + var18 + var12 * 128];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class65.field1651[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class82.field1976[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method107(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(arg0);
        field369++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lse;IZ)V")
    public static final void method108(class127 arg0, int arg1, boolean arg2) {
        if (class11.field280 < arg0.field2996) {
            class107.method736(2, arg0);
        } else if (class11.field280 > arg0.field3014) {
            class148.method1139(arg0, 0);
        } else {
            class149.method1161(arg0, -24315);
        }
        field373++;
        if (arg0.field3000 < 128 || arg0.field2939 < 128 || arg0.field3000 >= 13184 || arg0.field2939 >= 13184) {
            arg0.field3014 = 0;
            arg0.field3005 = -1;
            arg0.field2991 = -1;
            arg0.field2939 = arg0.field2934[0] * 128 + arg0.field2993 * 64;
            arg0.field3000 = arg0.field2963[0] * 128 + arg0.field2993 * 64;
            arg0.field2996 = 0;
            arg0.method960(118);
        }
        if (class46.field1244 == arg0 && (arg0.field3000 < 1536 || arg0.field2939 < 1536 || arg0.field3000 >= 11776 || arg0.field2939 >= 11776)) {
            arg0.field2996 = 0;
            arg0.field2939 = arg0.field2934[0] * 128 + arg0.field2993 * 64;
            arg0.field3014 = 0;
            arg0.field3000 = arg0.field2963[0] * 128 + arg0.field2993 * 64;
            arg0.field3005 = -1;
            arg0.field2991 = -1;
            arg0.method960(118);
        }
        class25.method207(arg0, 21769);
        if (arg2) {
            class138.method1020(false, arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method109(boolean arg0) {
        if (arg0) {
            field372 = null;
        }
        field372 = null;
        field371 = null;
    }
}
