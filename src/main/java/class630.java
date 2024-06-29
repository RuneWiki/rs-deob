import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class630 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "[Llda;")
    private class513[] field8750;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    private int field8752;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "J")
    private long field8754;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Llda;")
    private class513 field8747;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Llu;")
    public static class742 field8751;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IJ)Llda;", line = 4)
    public final class513 method3536(int arg0, long arg1) {
        if (arg0 != -3) {
            this.field8750 = null;
        }
        field8756++;
        this.field8754 = arg1;
        class513 var4 = this.field8750[(int) (arg1 & (long) (this.field8752 - 1))];
        for (this.field8747 = var4.field7006; this.field8747 != var4; this.field8747 = this.field8747.field7006) {
            if (this.field8747.field7008 == arg1) {
                class513 var5 = this.field8747;
                this.field8747 = this.field8747.field7006;
                return var5;
            }
        }
        this.field8747 = null;
        return null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Llda;IJ)V", line = 34)
    public final void method3537(class513 arg0, int arg1, long arg2) {
        if (arg0.field7004 != null) {
            arg0.method2942(false);
        }
        field8749++;
        if (arg1 >= -74) {
            field8751 = null;
        }
        class513 var5 = this.field8750[(int) (arg2 & (long) (this.field8752 - 1))];
        arg0.field7004 = var5.field7004;
        arg0.field7006 = var5;
        arg0.field7004.field7006 = arg0;
        arg0.field7006.field7004 = arg0;
        arg0.field7008 = arg2;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 62)
    public static final void method3538(int arg0) {
        field8748++;
        int var1 = 47 / ((arg0 + 33) / 61);
        int var2 = class532.field7197.length;
        for (int var3 = 0; var3 < var2; var3++) {
            if (class532.field7197[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class607.field8468; var5++) {
                    if (class525.field7135[var5] == class201.field3055[var3]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class525.field7135[class607.field8468] = class201.field3055[var3];
                    var4 = class607.field8468++;
                }
                class93 var6 = new class93(class532.field7197[var3]);
                int var7 = 0;
                while (class532.field7197[var3].length > var6.field1442 && var7 < 511 && class610.field8520 < 1023) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method763(104);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FB9) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class201.field3055[var3] >> 8) * 64 + var11 - class217.field3198;
                    int var14 = (class201.field3055[var3] & 0xFF) * 64 + var12 - class400.field5510;
                    class568 var15 = class495.field6783.method2005(6, var6.method763(-80));
                    class755 var16 = (class755) class664.field9216.method337((long) var8, 1);
                    if (var16 == null && (var15.field8034 & 0x1) > 0 && class426.field5820 == var10 && var13 >= 0 && var15.field8076 + var13 < class483.field6515 && var14 >= 0 && (var15.field8076 + var14) < class65.field926) {
                        class666 var17 = new class666();
                        var17.field5288 = var8;
                        class755 var18 = new class755(var17);
                        class664.field9216.method341((long) var8, var18, (byte) 58);
                        class491.field6712[class406.field5583++] = var18;
                        class744.field10273[class610.field8520++] = var8;
                        var17.field5258 = class440.field5977;
                        var17.method3764(51, var15);
                        var17.method2338(-120, var17.field9253.field8076);
                        var17.field5225 = var17.field9253.field8058 << 3;
                        var17.method2340(39, var17.field9253.field8099 + 4 << 11 & 0x3E49, true);
                        var17.method3766(var14, var10, var17.method2342((byte) -58), var13, 122, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I", line = 161)
    public static final int method3539(boolean arg0, String arg1, String arg2, int arg3) {
        field8755++;
        int var4 = arg1.length();
        if (arg0) {
            method3538(-4);
        }
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > (var7 - var9)) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class128.method1091(90, var22);
            var9 = class128.method1091(90, var24);
            char var26 = class379.method2312((byte) 62, var22, arg3);
            char var27 = class379.method2312((byte) 62, var24, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class405.method2422((byte) 22, var28, arg3) - class405.method2422((byte) 22, var29, arg3);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class405.method2422((byte) 22, var20, arg3) - class405.method2422((byte) 22, var21, arg3);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class405.method2422((byte) 22, var14, arg3) - class405.method2422((byte) 22, var15, arg3);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I)V", line = 293)
    public class630(int arg0) {
        this.field8750 = new class513[arg0];
        this.field8752 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class513 var3 = this.field8750[var2] = new class513();
            var3.field7004 = var3;
            var3.field7006 = var3;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V", line = 318)
    public static void method3540(boolean arg0) {
        if (!arg0) {
            field8751 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Llda;", line = 332)
    public final class513 method3541(int arg0) {
        field8753++;
        if (this.field8747 == null) {
            return null;
        }
        class513 var2 = this.field8750[(int) (this.field8754 & (long) (this.field8752 - 1))];
        while (this.field8747 != var2) {
            if (this.field8747.field7008 == this.field8754) {
                class513 var3 = this.field8747;
                this.field8747 = this.field8747.field7006;
                return var3;
            }
            this.field8747 = this.field8747.field7006;
        }
        if (arg0 < 83) {
            this.method3541(-91);
        }
        this.field8747 = null;
        return null;
    }
}
