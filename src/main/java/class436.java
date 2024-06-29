import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class436 {

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Laf;")
    private class39 field6052 = new class39(64);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lae;")
    private class283 field6042;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lae;")
    public class283 field6048;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Z")
    public static boolean field6053 = false;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lho;")
    public static class318 field6056;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public final void method2613(boolean arg0) {
        class39 var2 = this.field6052;
        synchronized (this.field6052) {
            if (!arg0) {
                return;
            }
            this.field6052.method319(-41);
        }
        field6050++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method2614(int arg0) {
        field6043++;
        if (class372.field5346 != null) {
            return;
        }
        class372.field5346 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = arg0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + var24 + (var23 << 8) - 16777216;
                class372.field5346[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method2615(int arg0) {
        field6049++;
        client.field1307.method255(class56.field664, class688.field9602.field8499.method2227((byte) -98) == 1 ? class172.field2186 + 256 << 2 : -1, 0);
        if (arg0 <= 98) {
            field6056 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public static final void method2616(int arg0) {
        if (arg0 < 85) {
            method2619(false);
        }
        field6051++;
        if (class111.field1332.method135()) {
            class111.field1332.method168(class749.field10341);
            class726.method4037(-72);
            if (class55.field651) {
                class354.method2229(0, class749.field10341);
            } else {
                Dimension var1 = class749.field10341.getSize();
                class111.field1332.method221(class749.field10341, var1.width, var1.height);
            }
            class111.field1332.method155(class749.field10341);
        } else {
            class532.method3154(class688.field9602.field8517.method2604((byte) -98), false, 1);
        }
        class23.method99(100);
        class282.field4043 = true;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
    public final void method2617(int arg0, int arg1) {
        class39 var3 = this.field6052;
        synchronized (this.field6052) {
            this.field6052.method308(-1, arg1);
        }
        field6047++;
        if (arg0 != -16777216) {
            field6056 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final void method2618(byte arg0) {
        class39 var2 = this.field6052;
        synchronized (this.field6052) {
            if (arg0 != -83) {
                return;
            }
            this.field6052.method314(-2);
        }
        field6057++;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static final void method2619(boolean arg0) {
        class255.field3779 = 0;
        field6044++;
        if (arg0) {
            class683.field9568 = -1;
            class461.field6447 = -1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Lus;")
    public final class340 method2620(int arg0, int arg1) {
        field6055++;
        class39 var3 = this.field6052;
        class340 var4;
        synchronized (this.field6052) {
            var4 = (class340) this.field6052.method312(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field6042;
        byte[] var6;
        synchronized (this.field6042) {
            var6 = this.field6042.method1849(arg0, (byte) -97, arg1);
        }
        class340 var7 = new class340();
        var7.field4922 = this;
        if (var6 != null) {
            var7.method2160(new class511(var6), false);
        }
        class39 var8 = this.field6052;
        synchronized (this.field6052) {
            this.field6052.method305(var7, (long) arg0, arg1 ^ 0x4793);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)I")
    public static final int method2621(int arg0, int arg1, int arg2, int arg3) {
        field6045++;
        if (arg3 != 512) {
            field6053 = true;
        }
        if (arg0 < arg2) {
            return arg2;
        } else if (arg1 < arg0) {
            return arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static void method2622(int arg0) {
        field6056 = null;
        if (arg0 != 18112) {
            field6054 = 51;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIII)I")
    public static final int method2623(int arg0, int arg1, int arg2, int arg3) {
        field6046++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (arg3 == var4) {
            return 4095 - arg1;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljk;ILae;Lae;)V")
    public class436(class788 arg0, int arg1, class283 arg2, class283 arg3) {
        this.field6042 = arg2;
        this.field6048 = arg3;
        this.field6042.method1867(3, (byte) 49);
    }
}
