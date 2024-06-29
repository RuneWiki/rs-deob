import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class309 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lak;")
    public class349 field3839 = null;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "[Loq;")
    public class358[] field3843 = null;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lak;")
    public class349 field3846 = null;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "[Loq;")
    private class358[] field3851 = null;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Lln;")
    private class377 field3845;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
    public boolean field3849;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field3850 = 1;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Z")
    public static boolean field3848 = true;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "F")
    public static float field3838;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lhu;")
    public static class131 field3842;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Loh;")
    public static class404 field3840;

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lln;)V", line = 174)
    public class309(class377 arg0) {
        this.field3845 = arg0;
        this.field3849 = this.field3845.field5082;
        if (this.field3849 && !this.field3845.method2313(class147.field1639, -6, class687.field9697)) {
            this.field3849 = false;
        }
        if (this.field3849 || this.field3845.method2192(class147.field1639, class687.field9697, true)) {
            class319.method1910(128);
            if (this.field3849) {
                byte[] var6 = class511.method3018((byte) -72, class229.field2673, false);
                this.field3846 = this.field3845.method2230(var6, 16, class147.field1639, 128, 128, 27728);
                byte[] var7 = class511.method3018((byte) -72, class247.field3006, false);
                this.field3845.method2230(var7, 16, class147.field1639, 128, 128, 27728);
            } else {
                this.field3843 = new class358[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class1.method2(var2 * 16384 * 2, 32768, class229.field2673, (byte) -7);
                    this.field3843[var2] = this.field3845.method2323(var5, class147.field1639, 128, 128, 87, true);
                }
                this.field3851 = new class358[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class1.method2(var3 * 128 * 256, 32768, class247.field3006, (byte) -7);
                    this.field3851[var3] = this.field3845.method2323(var4, class147.field1639, 128, 128, 123, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Z", line = 13)
    public final boolean method1841(int arg0) {
        if (this.field3839 == null) {
            if (class120.field1251 == null) {
                byte[] var2 = class192.method1168(-89, 0.6F, 4.0F, 0.5F, 128, 128, 16.0F, new class726(419684), 16, 8, 4.0F);
                class120.field1251 = class389.method2398(var2, false, arg0 ^ 0xFFFFC39B);
            }
            byte[] var3 = class511.method3018((byte) -72, class120.field1251, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 16384;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
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
            this.field3839 = this.field3845.method2230(var4, 16, class102.field1058, 128, 128, arg0 ^ 0xFFFFAFCB);
        }
        field3852++;
        if (arg0 != -15461) {
            this.field3849 = true;
        }
        return this.field3839 != null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Lcl;", line = 91)
    public static final class265 method1842(int arg0, int arg1) {
        if (arg0 != 19) {
            method1844((byte) -7, 35, null);
        }
        field3844++;
        return arg1 >= 0 && arg1 < 100 ? class206.field2433[arg1] : null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V", line = 110)
    public static void method1843(int arg0) {
        field3842 = null;
        field3840 = null;
        if (arg0 != -20675) {
            field3850 = 94;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BILig;)V", line = 123)
    public static final void method1844(byte arg0, int arg1, class244 arg2) {
        field3847++;
        if (class737.field10304 != null) {
            try {
                class737.field10304.method1583(0L, 255);
                class737.field10304.method1592(arg1, 24, arg2.field2912, -52);
            } catch (Exception var3) {
            }
        }
        if (arg0 != 107) {
            field3848 = true;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z", line = 164)
    public final boolean method1845(byte arg0) {
        field3841++;
        if (arg0 != -42) {
            this.method1845((byte) 115);
        }
        if (this.field3849) {
            return this.field3846 != null;
        } else {
            return this.field3843 != null;
        }
    }
}
