import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class171 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Ljd;")
    public static class95 field2760;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z", line = 6)
    public static final boolean method1288(byte arg0) {
        field2766++;
        if (class99.field1427) {
            try {
                return !(Boolean) class199.method1445(-127, "showingVideoAd", class330.field5074.field95);
            } catch (Throwable var3) {
            }
        }
        int var2 = -24 / ((81 - arg0) / 44);
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 26)
    public static void method1289(int arg0) {
        if (arg0 < 1) {
            method1294((class161) null, 66);
        }
        field2760 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I", line = 43)
    public static final int method1290(int arg0, int arg1, int arg2) {
        int var3 = 99 % ((24 - arg1) / 60);
        field2761++;
        class130 var4 = (class130) class29.field355.method1716(-1, (long) arg0);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var4.field1995.length) {
            return var4.field1995[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 65)
    public static final void method1291(int arg0, int arg1) {
        class27.field303 = arg0;
        class160.method1196(-1, arg1);
        field2768++;
        class160.method1196(-1, 4);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V", line = 75)
    public static final void method1292(byte arg0, int arg1) {
        if (!class305.field4698) {
            arg1 = -1;
        }
        field2767++;
        if (class62.field827 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class209 var2 = class251.method1721(arg1, 33);
            class195 var3 = var2.method1497(false);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class330.field5074.method47(var3.method1421(), var3.field4179, class102.field1480, var3.field4188, new Point(var2.field3196, var2.field3200), 2);
                class62.field827 = arg1;
            }
        }
        if (arg0 == 101 && arg1 == -1 && class62.field827 != -1) {
            class330.field5074.method47((int[]) null, -1, class102.field1480, -1, new Point(), 2);
            class62.field827 = -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V", line = 116)
    public static final void method1293(int arg0, boolean arg1) {
        field2763++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class260.field3998 += arg0 * 128;
        if (class260.field3998 > class254.field3820.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class260.field3998 -= class254.field3820.length;
            class31.method232((byte) -119, class5.field79[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        int var7 = 0;
        if (!arg1) {
            return;
        }
        while (var6 > var7) {
            int var8 = class166.field2690[var4 + var5] - (class254.field3820[class260.field3998 + var4 & class254.field3820.length + -1] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class166.field2690[var4++] = var8;
            var7++;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class166.field2690[var11 + var10] = 255;
                } else {
                    class166.field2690[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class77.field1123[var13] = class77.field1123[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class77.field1123[var14] = (int) (Math.sin((double) class112.field1695 / 14.0D) * 16.0D + Math.sin((double) class112.field1695 / 15.0D) * 14.0D + Math.sin((double) class112.field1695 / 16.0D) * 12.0D);
            class112.field1695++;
        }
        class324.field5007 += arg0;
        int var15 = (arg0 + (class233.field3542 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class324.field5007; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class166.field2690[(var17 << 7) + var18] = 192;
        }
        class324.field5007 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class166.field2690[var15 + var22 + var20];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var21 -= class166.field2690[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class212.field3259[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class212.field3259[var15 * 128 + var23 + var26];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class212.field3259[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class166.field2690[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lmn;I)Lmn;", line = 294)
    public static final class161 method1294(class161 arg0, int arg1) {
        field2765++;
        if (arg0.field2566 != -1) {
            return class331.method2308((byte) 100, arg0.field2566);
        }
        int var2 = arg0.field2615 >>> 16;
        class71 var3 = new class71(class222.field3383);
        class242 var4 = (class242) var3.method504(arg1 ^ 0xFFFFFFF5);
        if (arg1 != 10) {
            field2762 = -77;
        }
        while (var4 != null) {
            if (var4.field3689 == var2) {
                return class331.method2308((byte) 110, (int) var4.field69);
            }
            var4 = (class242) var3.method507(true);
        }
        return null;
    }
}
