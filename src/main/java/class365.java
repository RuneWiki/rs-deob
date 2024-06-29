import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class365 implements class126 {

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Lgl;")
    private class574 field5350;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "[Ljt;")
    private class590[] field5358;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "[B")
    public static byte[] field5344;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "Lr;")
    private class98 field5352;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5356;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Z")
    private boolean field5354;

    static {
        int var0 = 0;
        field5344 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5344[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method901(boolean arg0, boolean arg1) {
        field5349++;
        boolean var3 = arg1;
        class590[] var4 = this.field5358;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class590 var6 = var4[var5];
            if (var6 != null) {
                var6.method944(-31764, var3 || this.field5354);
            }
        }
        this.field5354 = false;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZJ)Z", line = 29)
    public final boolean method904(boolean arg0, long arg1) {
        if (!arg0) {
            this.method903(44);
        }
        field5359++;
        return arg1 + ((long) this.field5350.field8337) <= class60.method371(false);
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V", line = 40)
    public final void method902(byte arg0) {
        field5353++;
        if (class332.field4821 != this.field5352) {
            this.field5354 = true;
            this.field5352 = class332.field4821;
        }
        this.field5352.method646(0);
        class590[] var2 = this.field5358;
        int var3 = 0;
        int var4 = 16 / ((37 - arg0) / 38);
        while (var3 < var2.length) {
            class590 var5 = var2[var3];
            if (var5 != null) {
                var5.method940(-32557);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V", line = 78)
    public static void method2236(boolean arg0) {
        field5356 = null;
        field5344 = null;
        if (!arg0) {
            field5344 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I", line = 90)
    public final int method903(int arg0) {
        if (arg0 != 32342) {
            this.method902((byte) 26);
        }
        field5346++;
        return this.field5350.field8341;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([II)Ljava/lang/String;", line = 102)
    public static final String method2237(int[] arg0, int arg1) {
        field5345++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class66.field1053;
        if (arg1 != -16907) {
            return null;
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class208 var5 = class586.field8507.method1449(arg1 + 16942, arg0[var4]);
            if (var5.field2837 != -1) {
                class256 var6 = (class256) class693.field9788.method3901((long) var5.field2837, -69);
                if (var6 == null) {
                    class616 var7 = class616.method3509(class595.field8616, var5.field2837, 0);
                    if (var7 != null) {
                        var6 = class332.field4821.method660(var7, true);
                        class693.field9788.method3894(var6, (byte) 60, (long) var5.field2837);
                    }
                }
                if (var6 != null) {
                    class386.field5772[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V", line = 154)
    public static final void method2238(byte arg0) {
        field5355++;
        for (int var1 = 0; var1 < class20.field383.length; var1++) {
            for (int var2 = 0; var2 < class20.field383[var1].length; var2++) {
                class20.field383[var1][var2] = class641.field9195;
            }
        }
        if (arg0 < 78) {
            method2237(null, 2);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I", line = 183)
    public final int method900(byte arg0) {
        field5347++;
        int var2 = 0;
        int var3 = 42 / ((-arg0 - 69) / 48);
        class590[] var4 = this.field5358;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class590 var6 = var4[var5];
            if (var6 == null || var6.method941((byte) -22)) {
                var2++;
            }
        }
        return var2 * 100 / this.field5358.length;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V", line = 232)
    public final void method905(boolean arg0) {
        field5351++;
        if (!arg0) {
            this.field5352 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lgl;Lja;)V", line = 243)
    public class365(class574 arg0, class595 arg1) {
        this.field5350 = arg0;
        this.field5358 = new class590[this.field5350.field8336.length];
        for (int var3 = 0; var3 < this.field5358.length; var3++) {
            this.field5358[var3] = arg1.method3389(-1, this.field5350.field8336[var3]);
        }
    }
}
