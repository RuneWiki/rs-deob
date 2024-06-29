import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class93 extends RuntimeException {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1320;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Ljava/lang/String;")
    public String field1323;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "J")
    public static volatile long field1324 = 0L;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lka;")
    public static class169 field1322 = new class169(0, 0);

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1328 = "Ok";

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1329 = "Loaded textures";

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lbc;")
    public static class105 field1326;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method650(byte arg0) {
        field1325++;
        if (arg0 < 5) {
            method650((byte) -53);
        }
        class76.field1039.method1831(-121);
        class125.field2100.method1831(-120);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Z")
    public static final boolean method651(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class267.field4324; var3++) {
            class240 var4 = class12.field168[var3];
            if (var4.field3833 == 1) {
                int var5 = var4.field3838 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3855 * var5 >> 8) + var4.field3837;
                    int var7 = (var4.field3839 * var5 >> 8) + var4.field3832;
                    int var8 = (var4.field3854 * var5 >> 8) + var4.field3853;
                    int var9 = (var4.field3850 * var5 >> 8) + var4.field3841;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3833 == 2) {
                int var10 = arg0 - var4.field3838;
                if (var10 > 0) {
                    int var11 = (var4.field3855 * var10 >> 8) + var4.field3837;
                    int var12 = (var4.field3839 * var10 >> 8) + var4.field3832;
                    int var13 = (var4.field3854 * var10 >> 8) + var4.field3853;
                    int var14 = (var4.field3850 * var10 >> 8) + var4.field3841;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3833 == 3) {
                int var15 = var4.field3837 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3843 * var15 >> 8) + var4.field3838;
                    int var17 = (var4.field3849 * var15 >> 8) + var4.field3835;
                    int var18 = (var4.field3854 * var15 >> 8) + var4.field3853;
                    int var19 = (var4.field3850 * var15 >> 8) + var4.field3841;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3833 == 4) {
                int var20 = arg2 - var4.field3837;
                if (var20 > 0) {
                    int var21 = (var4.field3843 * var20 >> 8) + var4.field3838;
                    int var22 = (var4.field3849 * var20 >> 8) + var4.field3835;
                    int var23 = (var4.field3854 * var20 >> 8) + var4.field3853;
                    int var24 = (var4.field3850 * var20 >> 8) + var4.field3841;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3833 == 5) {
                int var25 = arg1 - var4.field3853;
                if (var25 > 0) {
                    int var26 = (var4.field3843 * var25 >> 8) + var4.field3838;
                    int var27 = (var4.field3849 * var25 >> 8) + var4.field3835;
                    int var28 = (var4.field3855 * var25 >> 8) + var4.field3837;
                    int var29 = (var4.field3839 * var25 >> 8) + var4.field3832;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class93(Throwable arg0, String arg1) {
        this.field1320 = arg0;
        this.field1323 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method652(int arg0) {
        if (arg0 >= -11) {
            method652(-95);
        }
        field1328 = null;
        field1326 = null;
        field1329 = null;
        field1322 = null;
    }
}
