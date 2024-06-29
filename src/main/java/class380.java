import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class380 {

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lh;")
    private class571 field5124 = new class571(64);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lan;")
    private class21 field5118;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "J")
    public static long field5122 = 0L;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2245(long arg0, int arg1) {
        field5127++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg1 != 21629) {
                return null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class525.field7385[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method2246(int arg0) {
        class571 var2 = this.field5124;
        synchronized (this.field5124) {
            if (arg0 != 64) {
                this.method2247(-124, -62);
            }
            this.field5124.method3248(0);
        }
        field5129++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    public final void method2247(int arg0, int arg1) {
        class571 var3 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3246(false);
            this.field5124 = new class571(arg1);
        }
        if (arg0 > -33) {
            method2245(36L, -112);
        }
        field5125++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
    public static final void method2248(int arg0, boolean arg1) {
        field5121++;
        if (arg1 && class413.field5806 != null) {
            class3.field39 = class413.field5806.field6715;
        } else {
            class3.field39 = -1;
        }
        class132.field2109 = 0;
        class413.field5806 = null;
        class317.field4305 = null;
        class319.field4326 = null;
        class413.method2477();
        class413.field5819.method465(true);
        class473.field6655 = null;
        class205.field2886 = null;
        class315.field4241 = -1;
        class183.field2588 = null;
        class139.field2178 = null;
        class413.field5815 = null;
        class20.field252 = null;
        class506.field7057 = null;
        class132.field2105 = null;
        if (arg0 > 0) {
            method2248(51, true);
        }
        class39.field793 = null;
        class300.field4096 = -1;
        class648.field9398 = null;
        class413.field5809.method2137(-22);
        class413.field5803.method3255(64, 64, -1);
        class413.field5809.method2132(128, -20773, 64);
        class413.field5808.method1205(64, (byte) -128);
        class595.field8604.method2247(-68, 64);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
    public final void method2249(byte arg0, int arg1) {
        class571 var3 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3253(arg1, -119);
        }
        field5123++;
        if (arg0 <= 118) {
            field5122 = -100L;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZIIZ)V")
    public static final void method2250(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field5128++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class610.field8778 - class547.field7576) * var6 / 100 + class547.field7576;
        if (class494.field6917 > var7) {
            var7 = class494.field6917;
        } else if (var7 > class187.field2623) {
            var7 = class187.field2623;
        }
        int var8 = var7 * 512 * arg3 / (arg1 * 334);
        if (var8 < class206.field2904) {
            short var12 = class206.field2904;
            var7 = arg1 * 334 * var12 / (arg3 * 512);
            if (class187.field2623 < var7) {
                var7 = class187.field2623;
                int var13 = arg3 * var7 * 512 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg5) {
                    class69.field1165.method1269();
                    class69.field1165.method1368(arg4, var14, arg3, -16777216, arg0, (byte) -16);
                    class69.field1165.method1368(arg4, var14, arg3, -16777216, arg1 + arg0 - var14, (byte) -16);
                }
                arg0 += var14;
                arg1 -= var14 * 2;
            }
        } else if (class387.field5195 < var8) {
            short var9 = class387.field5195;
            var7 = var9 * 334 * arg1 / (arg3 * 512);
            if (var7 < class494.field6917) {
                var7 = class494.field6917;
                int var10 = arg1 * var9 * 334 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg5) {
                    class69.field1165.method1269();
                    class69.field1165.method1368(arg4, arg1, var11, -16777216, arg0, (byte) -16);
                    class69.field1165.method1368(arg3 + arg4 - var11, arg1, var11, -16777216, arg0, (byte) -16);
                }
                arg3 -= var11 * 2;
                arg4 += var11;
            }
        }
        class637.field9280 = arg4;
        if (!arg2) {
            method2245(90L, 73);
        }
        class8.field101 = arg0;
        class426.field6056 = (short) arg3;
        class318.field4315 = (short) arg1;
        class194.field2756 = arg3 * var7 / 334;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIILmc;JLpa;)V")
    public static final void method2251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class114 arg6, long arg7, class310 arg8) {
        field5126++;
        if (arg5 != -19791) {
            field5122 = -44L;
        }
        int var10 = arg0 * arg0 + arg1 * arg1;
        if (arg7 < (long) var10) {
            return;
        }
        int var11 = Math.min(arg6.field1853 / 2, arg6.field1769 / 2);
        if (var10 <= (var11 * var11)) {
            class401.method2397(arg4, arg0, arg8, arg1, class101.field1541[arg3], arg6, arg2, 2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class107.field1653 == 4) {
            var12 = (int) class1.field13 & 0x3FFF;
        } else {
            var12 = (int) class1.field13 + class2.field27 & 0x3FFF;
        }
        int var13 = class1.field2[var12];
        int var14 = class1.field7[var12];
        if (class107.field1653 != 4) {
            var14 = var14 * 256 / (class353.field4779 + 256);
            var13 = var13 * 256 / (class353.field4779 + 256);
        }
        int var15 = arg0 * var14 + arg1 * var13 >> 15;
        int var16 = arg1 * var14 - (arg0 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class630.field9214[arg3].method500((float) arg6.field1853 / 2.0F + (float) arg4 + (float) var19, (float) arg6.field1769 / 2.0F + (float) arg2 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Ljl;")
    public final class227 method2252(int arg0, int arg1) {
        if (arg1 > -60) {
            this.method2246(-91);
        }
        field5120++;
        class571 var3 = this.field5124;
        class227 var4;
        synchronized (this.field5124) {
            var4 = (class227) this.field5124.method3252((long) arg0, (byte) 54);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field5118;
        byte[] var6;
        synchronized (this.field5118) {
            var6 = this.field5118.method240(class229.method1461(arg0, 1017261258), class503.method2914((byte) -86, arg0), (byte) -124);
        }
        class227 var7 = new class227();
        if (var6 != null) {
            var7.method1447(new class11(var6), 28033);
        }
        class571 var8 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3243(var7, (long) arg0, 63);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method2253(int arg0) {
        field5119++;
        class571 var2 = this.field5124;
        synchronized (this.field5124) {
            if (arg0 == 512) {
                this.field5124.method3246(false);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class380(class111 arg0, int arg1, class21 arg2) {
        this.field5118 = arg2;
        if (this.field5118 != null) {
            int var4 = this.field5118.method239(-115) - 1;
            this.field5118.method231(var4, -126);
        }
    }
}
