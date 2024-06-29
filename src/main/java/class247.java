import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class247 extends class155 {

    @OriginalMember(owner = "client!th", name = "P", descriptor = "J")
    public static long field3649 = 0L;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "Z")
    public static boolean field3655 = false;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field3654 = -1;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Le;")
    public static class215 field3641;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Ljava/lang/String;")
    public String field3651;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "[I")
    public int[] field3650;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "[I")
    public int[] field3652;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "[Lrb;")
    public class143[] field3642;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field3646;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    public static final void method1697(int arg0) {
        field3643++;
        if (!class192.field2839) {
            return;
        }
        if (arg0 != 2048) {
            method1698((class2) null, -116, -16, -66);
        }
        class192.field2839 = false;
        class85.field1353 = null;
        class51.field708 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lie;III)V")
    public static final void method1698(class2 arg0, int arg1, int arg2, int arg3) {
        field3637++;
        class101.field1715.method5(arg1 + 33);
        if (arg1 != -1 || class214.field3152) {
            return;
        }
        for (class159 var4 = (class159) arg0.method8(-124); var4 != null; var4 = (class159) arg0.method12((byte) 69)) {
            class66 var5 = class206.method1458(var4.field2466, 22464);
            if (class69.method522(var5, (byte) -111)) {
                class237.method1634(arg3, (byte) 77, var5, var4, arg2);
                if (var4.field2465) {
                    class4.method19(var5, var4, (byte) 109);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
    public static final int method1699(int arg0, int arg1) {
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        field3645++;
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 < 87) {
            method1701(-126, 40);
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public static final void method1700(int arg0) {
        int var1 = class20.field220 * 128 + 64;
        field3653++;
        int var2 = class299.field4827 * 128 + 64;
        int var3 = class113.method851(class37.field474, -80, var2, var1) - class267.field4258;
        if (class224.field3296 < 100) {
            if (class93.field1533 < var1) {
                class93.field1533 += (var1 - class93.field1533) * class224.field3296 / 1000 + class212.field3129;
                if (class93.field1533 > var1) {
                    class93.field1533 = var1;
                }
            }
            if (var2 > class260.field4024) {
                class260.field4024 += (var2 - class260.field4024) * class224.field3296 / 1000 + class212.field3129;
                if (var2 < class260.field4024) {
                    class260.field4024 = var2;
                }
            }
            if (class226.field3324 < var3) {
                class226.field3324 += (var3 - class226.field3324) * class224.field3296 / 1000 + class212.field3129;
                if (var3 < class226.field3324) {
                    class226.field3324 = var3;
                }
            }
            if (class226.field3324 > var3) {
                class226.field3324 -= class212.field3129 + ((class226.field3324 - var3) * class224.field3296 / 1000);
                if (class226.field3324 < var3) {
                    class226.field3324 = var3;
                }
            }
            if (var1 < class93.field1533) {
                class93.field1533 -= (class93.field1533 - var1) * class224.field3296 / 1000 + class212.field3129;
                if (var1 > class93.field1533) {
                    class93.field1533 = var1;
                }
            }
            if (class260.field4024 > var2) {
                class260.field4024 -= (class260.field4024 - var2) * class224.field3296 / 1000 + class212.field3129;
                if (class260.field4024 < var2) {
                    class260.field4024 = var2;
                }
            }
        } else {
            class93.field1533 = class20.field220 * 128 + 64;
            class260.field4024 = class299.field4827 * 128 + 64;
            class226.field3324 = class113.method851(class37.field474, 86, class260.field4024, class93.field1533) - class267.field4258;
        }
        int var4 = class121.field2001 * 128 + 64;
        int var5 = class162.field2509 * 128 + 64;
        int var6 = class113.method851(class37.field474, 89, var4, var5) - class301.field4853;
        int var7 = var5 - class93.field1533;
        int var8 = var4 - class260.field4024;
        int var9 = var6 - class226.field3324;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class268.field4303;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < arg0) {
            var13 += 2048;
        }
        if (var11 > class115.field1906) {
            class115.field1906 += (var11 - class115.field1906) * class139.field2263 / 1000 + class234.field3421;
            if (class115.field1906 > var11) {
                class115.field1906 = var11;
            }
        }
        if (var13 > 0) {
            class268.field4303 += class139.field2263 * var13 / 1000 + class234.field3421;
            class268.field4303 &= 0x7FF;
        }
        if (var11 < class115.field1906) {
            class115.field1906 -= (class115.field1906 - var11) * class139.field2263 / 1000 + class234.field3421;
            if (class115.field1906 < var11) {
                class115.field1906 = var11;
            }
        }
        if (var13 < 0) {
            class268.field4303 -= class234.field3421 + (-var13 * class139.field2263 / 1000);
            class268.field4303 &= 0x7FF;
        }
        int var14 = var12 - class268.field4303;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class268.field4303 = var12;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
    public static final void method1701(int arg0, int arg1) {
        if (arg1 == 1000) {
            if (class114.field1887 == null || arg0 > class114.field1887.length) {
                class114.field1887 = new int[arg0];
            }
            field3648++;
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static void method1702(int arg0) {
        if (arg0 == 6422) {
            field3641 = null;
        }
    }
}
