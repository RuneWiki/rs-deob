import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class263 extends class6 {

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "Lqp;")
    public static class466 field3633 = new class466("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "[I")
    public static int[] field3637 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "[I")
    public static int[] field3635;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLya;)V", line = 3)
    public static final void method1575(boolean arg0, class38 arg1) {
        arg1.method279(0, 0, class117.field1754, 350);
        field3638++;
        arg1.method243(0, 0, class117.field1754, 350, class77.field1061 << 24 | 0x332277, 1);
        int var2 = 350 / class171.field2544;
        if (class410.field5996 > 0) {
            int var3 = 346 - class171.field2544 - 4;
            int var4 = var2 * var3 / (class410.field5996 + var2 - 1);
            int var5 = 4;
            if (class410.field5996 > 1) {
                var5 += (class410.field5996 - class6.field107 - 1) * (var3 - var4) / (class410.field5996 - 1);
            }
            arg1.method243(class117.field1754 - 16, var5, 12, var4, class77.field1061 << 24 | 0x332277, 2);
            for (int var6 = class6.field107; class6.field107 + var2 > var6 && var6 < class410.field5996; var6++) {
                String[] var7 = class38.method284('\b', class63.field790[var6], false);
                int var8 = (class117.field1754 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method279(var10, 0, var8 + var10 - 8, 350);
                    class297.field4084.method1833(var10, var7[var9], -16777216, 14, 350 - class216.field3010 - ((-class6.field107 + var6) * class171.field2544) - class278.field3809.field7155 - 2, -1);
                }
            }
        }
        arg1.method279(0, 0, class117.field1754, 350);
        arg1.method230(-1, class117.field1754, 350 - class216.field3010, (byte) -85, 0);
        class135.field1949.method1833(10, "--> " + class218.field3047, -16777216, 45, 350 - class407.field5952.field7155 - 1, -1);
        if (!arg0) {
            return;
        }
        int var11 = -1;
        if (class441.field6516 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method307(350 - class407.field5952.field7155 - 11, 12, class407.field5952.method2867("--> " + class218.field3047.substring(0, class378.field5542), (byte) -70) + 10, -84, var11);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 66)
    public static void method1576(boolean arg0) {
        field3635 = null;
        if (arg0) {
            field3637 = null;
        }
        field3637 = null;
        field3633 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)V", line = 82)
    public static final void method1577(int arg0, long arg1) {
        field3639++;
        int var3 = class74.field999 + class316.field4324.field1732;
        int var4 = class185.field2688 + class316.field4324.field1735;
        if (class240.field3370 - var3 < -500 || (class240.field3370 - var3) > 500 || class121.field1818 - var4 < -500 || class121.field1818 - var4 > 500) {
            class121.field1818 = var4;
            class240.field3370 = var3;
        }
        if (class240.field3370 != var3) {
            int var5 = var3 - class240.field3370;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class240.field3370 += var6;
        }
        if (class121.field1818 != var4) {
            int var7 = var4 - class121.field1818;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class121.field1818 += var8;
        }
        if (arg0 != 0) {
            field3635 = null;
        }
        if (!class20.field269.field7654) {
            class498.field7255 += (float) arg1 * class78.field1128 / 6.0F;
            class252.field3498 += (float) arg1 * class187.field2712 / 6.0F;
        }
        class314.method1816(10299);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILco;Z)V", line = 176)
    public static final void method1578(int arg0, class77 arg1, boolean arg2) {
        field3636++;
        int var3 = -1;
        int var4 = 0;
        if (class441.field6516 < arg1.field1088) {
            class484.method2846(-4, arg1);
        } else if (class441.field6516 > arg1.field1090) {
            class354.method2118(arg1, (byte) 98, false);
            var4 = class455.field6698;
            var3 = class343.field4947;
        } else {
            class391.method2334(0, arg1);
        }
        if (arg1.field1732 < 128 || arg1.field1735 < 128 || (class527.field7799 * 128 - 128) <= arg1.field1732 || (class422.field6182 * 128 - 128) <= arg1.field1735) {
            arg1.field1088 = 0;
            arg1.field1064 = -1;
            arg1.field1049 = -1;
            arg1.field1023 = -1;
            var3 = -1;
            arg1.field1090 = 0;
            var4 = 0;
            arg1.field1732 = arg1.field1127[0] * 128 + (arg1.method626((byte) 120) * 64);
            arg1.field1735 = arg1.field1117[0] * 128 + (arg1.method626((byte) 120) * 64);
            arg1.method624(49);
        }
        if (class316.field4324 == arg1 && (arg1.field1732 < 1536 || arg1.field1735 < 1536 || (class527.field7799 * 128 - 1536) <= arg1.field1732 || ((class422.field6182 - 12) * 128) <= arg1.field1735)) {
            arg1.field1090 = 0;
            arg1.field1023 = -1;
            var4 = 0;
            arg1.field1064 = -1;
            var3 = -1;
            arg1.field1088 = 0;
            arg1.field1049 = -1;
            arg1.field1732 = arg1.field1127[0] * 128 + arg1.method626((byte) 120) * 64;
            arg1.field1735 = arg1.field1117[0] * 128 + arg1.method626((byte) 120) * 64;
            arg1.method624(66);
        }
        int var5 = class77.method627(arg1, 102);
        if (!arg2) {
            method1575(false, null);
        }
        class27.method154(var5, -8898, arg1, var4, var3);
        class240.method1460(0, arg1);
    }
}
