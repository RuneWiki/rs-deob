import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class639 {

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "[Ltr;")
    public class297[] field8468 = null;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "[Ltr;")
    private class297[] field8474 = null;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "Lop;")
    public class191 field8473 = null;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "Lop;")
    public class191 field8477 = null;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lrv;")
    private class111 field8475;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Z")
    public boolean field8467;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "Lkaa;")
    public static class47 field8476 = new class47(75, 3);

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field8478 = 0;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method3494(int arg0) {
        field8471++;
        if (arg0 != -17546) {
            field8478 = 86;
        }
        if (this.field8473 == null) {
            if (class411.field5710 == null) {
                byte[] var2 = class408.method2387(4.0F, 0.6F, 4.0F, (byte) 127, new class658(419684), 128, 16.0F, 16, 8, 128, 0.5F);
                class411.field5710 = class166.method1195(false, var2, (byte) 77);
            }
            byte[] var3 = class464.method2631(class411.field5710, false, -30711);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var8 + (var9 * 128);
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field8473 = this.field8475.method905(22302, 16, var4, class315.field4498, 128, 128);
        }
        return this.field8473 != null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILha;ZI)Lko;", line = 88)
    public static final class507 method3495(int arg0, class59 arg1, boolean arg2, int arg3) {
        field8469++;
        if (arg3 == -1) {
            return null;
        }
        if (class595.field7748 != null) {
            for (int var4 = 0; var4 < class595.field7748.length; var4++) {
                if (class595.field7748[var4] == arg3) {
                    return class68.field833[var4];
                }
            }
        }
        class507 var5 = (class507) class384.field5373.method552(4, (long) arg3);
        if (var5 != null) {
            if (arg2 && var5.field6772 == null) {
                class539 var6 = class165.method1184(class629.field8381, 13580, arg3);
                if (var6 == null) {
                    return null;
                }
                var5.field6772 = var6;
            }
            return var5;
        }
        if (arg0 >= -104) {
            method3496(-93);
        }
        class720[] var7 = class720.method4046(class517.field6905, arg3);
        if (var7 == null) {
            return null;
        }
        class539 var8 = class165.method1184(class629.field8381, 13580, arg3);
        if (var8 == null) {
            return null;
        }
        class507 var9;
        if (arg2) {
            var9 = new class507(arg1.method425(var8, var7, true), var8);
        } else {
            var9 = new class507(arg1.method425(var8, var7, true));
        }
        class384.field5373.method556((byte) 0, (long) arg3, var9);
        return var9;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I", line = 157)
    public static final int method3496(int arg0) {
        field8470++;
        return ~class410.field5681 == arg0 ? class425.field5857 : class640.field8484;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lrv;)V", line = 209)
    public class639(class111 arg0) {
        this.field8475 = arg0;
        this.field8467 = this.field8475.field1805;
        if (this.field8467 && !this.field8475.method938(class408.field5668, class628.field8365, 14)) {
            this.field8467 = false;
        }
        if (this.field8467 || this.field8475.method827(-3119, class408.field5668, class628.field8365)) {
            class142.method1085(117);
            if (this.field8467) {
                byte[] var2 = class464.method2631(class83.field1002, false, -30711);
                this.field8477 = this.field8475.method905(22302, 16, var2, class628.field8365, 128, 128);
                byte[] var3 = class464.method2631(class298.field4244, false, -30711);
                this.field8475.method905(22302, 16, var3, class628.field8365, 128, 128);
            } else {
                this.field8468 = new class297[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class501.method2821(class83.field1002, 41, 32768, var4 * 128 * 256);
                    this.field8468[var4] = this.field8475.method866(var7, 0, 128, class628.field8365, 128, true);
                }
                this.field8474 = new class297[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class501.method2821(class298.field4244, 48, 32768, var5 * 128 * 128 * 2);
                    this.field8474[var5] = this.field8475.method866(var6, 0, 128, class628.field8365, 128, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)V", line = 176)
    public static void method3497(int arg0) {
        if (arg0 != 0) {
            method3495(-128, null, true, 73);
        }
        field8476 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Z", line = 189)
    public final boolean method3498(byte arg0) {
        if (arg0 != -42) {
            return false;
        }
        field8472++;
        if (this.field8467) {
            return this.field8477 != null;
        } else {
            return this.field8468 != null;
        }
    }
}
