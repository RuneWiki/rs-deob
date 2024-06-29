import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class88 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    private int[] field2066;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
    private int[] field2078;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lv;")
    private class189 field2069;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lv;")
    private class189 field2077;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[Lv;")
    private class189[] field2071;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lgg;")
    private static class63 field2076 = class116.method911(43, "Examine");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lgg;")
    public static class63 field2065 = field2076;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
    public static boolean field2081 = false;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lgg;")
    public static class63 field2074 = class116.method911(43, "Hidden)2use");

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lgg;")
    public static class63 field2079 = class116.method911(43, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lgg;")
    public static class63 field2082 = class116.method911(43, "Untersuchen");

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lgg;")
    public static class63 field2068 = class116.method911(43, "Titelbild geladen)3");

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lgg;")
    public static class63 field2075 = class116.method911(43, "mapfunction");

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2083 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lrc;")
    public static class156 field2070;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method766(byte arg0) {
        field2065 = null;
        field2075 = null;
        field2082 = null;
        field2068 = null;
        field2070 = null;
        field2074 = null;
        field2079 = null;
        int var1 = -97 % ((arg0 - 50) / 36);
        field2076 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljc;IIDILwc;Z)[I")
    public final int[] method767(class85 arg0, int arg1, int arg2, double arg3, int arg4, class201 arg5, boolean arg6) {
        class29.field676 = arg5;
        field2080++;
        int[] var9 = new int[arg2 * arg4];
        class126.field2779 = arg0;
        class173.method1158(true, arg4, arg2);
        for (int var10 = 0; var10 < this.field2071.length; var10++) {
            this.field2071[var10].method1238((byte) -110, arg4, arg2);
        }
        int var11;
        byte var12;
        int var13;
        if (arg6) {
            var13 = arg4 - 1;
            var11 = -1;
            var12 = -1;
        } else {
            var11 = arg4;
            var12 = 1;
            var13 = 0;
        }
        int var14 = 0;
        if (arg1 <= 33) {
            field2064 = 7;
        }
        for (int var15 = 0; var15 < arg2; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2069.field3811) {
                int[] var17 = this.field2069.method90(0, var15);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field2069.method83(var15, 105);
                var20 = var21[1];
                var19 = var21[0];
                var18 = var21[2];
            }
            for (int var22 = var13; var22 != var11; var22 += var12) {
                double var23 = Math.pow((double) var19[var22] / 4096.0D, arg3);
                double var25 = Math.pow((double) var20[var22] / 4096.0D, arg3);
                double var27 = Math.pow((double) var18[var22] / 4096.0D, arg3);
                int var29 = (int) (var23 * 256.0D);
                int var30 = (int) (var27 * 256.0D);
                int var31 = (int) (var25 * 256.0D);
                if (var29 > 255) {
                    var29 = 255;
                }
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                if (var29 < 0) {
                    var29 = 0;
                }
                if (var30 > 255) {
                    var30 = 255;
                }
                if (var30 < 0) {
                    var30 = 0;
                }
                var9[var14++] = (var29 << 16) + (var31 << 8) + var30;
            }
        }
        for (int var16 = 0; var16 < this.field2071.length; var16++) {
            this.field2071[var16].method1242((byte) 85);
        }
        return var9;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)La;")
    public static final class1 method768(boolean arg0) {
        if (!arg0) {
            method766((byte) 50);
        }
        field2084++;
        try {
            return (class1) Class.forName("jd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class139();
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class88() {
        this.field2066 = new int[0];
        this.field2078 = new int[0];
        this.field2069 = new class180();
        this.field2077 = new class180();
        this.field2071 = new class189[] { this.field2069, this.field2077 };
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lab;)V")
    public class88(class3 arg0) {
        int var2 = arg0.method64(31790);
        class78 var3 = new class78(64);
        class78 var4 = new class78(64);
        class78 var5 = new class78(64);
        int[][] var6 = new int[var2][];
        this.field2071 = new class189[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class189 var21 = class68.method627(arg0, -102);
            int var22 = var21.method884((byte) -78);
            int var23 = var21.method1224((byte) 124);
            if (var22 >= 0 && var22 >= 0 && var4.method694(-23979, (long) var22) == null) {
                var4.method702((byte) 111, new class89(var22), (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var5.method694(-23979, (long) var23) == null) {
                var5.method702((byte) 98, new class89(var23), (long) var23);
            }
            int var26 = var21.field3833.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method64(31790);
            }
            var3.method702((byte) 117, var21, (long) var21.field3821);
            this.field2071[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class189 var17 = this.field2071[var8];
            int var18 = var17.field3833.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class189 var20 = (class189) var3.method694(-23979, (long) var6[var8][var19]);
                var17.field3833[var19] = var20;
            }
            var6[var8] = null;
        }
        Object var9 = null;
        this.field2069 = (class189) var3.method694(-23979, (long) arg0.method64(31790));
        this.field2077 = (class189) var3.method694(-23979, (long) arg0.method64(31790));
        this.field2078 = new int[var4.method700((byte) -117)];
        this.field2066 = new int[var5.method700((byte) -117)];
        class176[] var10 = new class176[var4.method700((byte) -117)];
        Object var11 = null;
        class176[] var12 = new class176[var5.method700((byte) -117)];
        var4.method696(0, var10);
        var5.method696(0, var12);
        Object var13 = null;
        Object var14 = null;
        for (int var15 = 0; var15 < var10.length; var15++) {
            this.field2078[var15] = ((class89) var10[var15]).field2091;
        }
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field2066[var16] = ((class89) var12[var16]).field2091;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjc;Lwc;)Z")
    public final boolean method769(int arg0, class85 arg1, class201 arg2) {
        int var4 = 34 % ((75 - arg0) / 36);
        field2072++;
        for (int var5 = 0; var5 < this.field2078.length; var5++) {
            if (!arg1.method765(this.field2078[var5], 0)) {
                return false;
            }
        }
        for (int var6 = 0; var6 < this.field2066.length; var6++) {
            if (!arg2.method1252(this.field2066[var6], (byte) 101)) {
                return false;
            }
        }
        return true;
    }
}
