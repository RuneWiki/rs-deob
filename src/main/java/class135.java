import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class135 {

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "Lii;")
    public class546 field1785 = null;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "[Lw;")
    public class471[] field1787 = null;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "[Lw;")
    private class471[] field1788 = null;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "Lii;")
    public class546 field1790 = null;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Lgd;")
    private class696 field1780;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "Z")
    public boolean field1786;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "Lrn;")
    public static class633 field1784 = new class633(25, 8);

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
    public static int field1792 = -1;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method781(int arg0) {
        field1782++;
        if (arg0 != -1) {
            field1792 = -26;
        }
        if (this.field1786) {
            return this.field1785 != null;
        } else {
            return this.field1787 != null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V", line = 18)
    public static void method782(byte arg0) {
        if (arg0 != -25) {
            field1784 = null;
        }
        field1784 = null;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V", line = 28)
    public static final void method783(int arg0) {
        field1789++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class454.field5919[var1] = true;
        }
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method784(int arg0) {
        if (this.field1790 == null) {
            if (class221.field3009 == null) {
                byte[] var2 = class325.method1883(16, 16.0F, -18369, 0.5F, 8, 0.6F, 4.0F, 128, new class565(419684), 128, 4.0F);
                class221.field3009 = class287.method1743(99999999, false, var2);
            }
            byte[] var3 = class170.method1076(class221.field3009, 18406, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = var8 + ((var9 - 1 & 0x7F) * 128);
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[var10 + (var13 - 1 & 0x7F)] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field1790 = this.field1780.method1201(0, 128, class417.field5505, 16, var4, 128);
        }
        field1781++;
        if (arg0 < 90) {
            return false;
        } else {
            return this.field1790 != null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)V", line = 124)
    public static final void method785(int arg0) {
        if (arg0 != -1421) {
            return;
        }
        class536 var1 = class628.field7980;
        synchronized (class628.field7980) {
            class628.field7980.method2919(0);
        }
        field1791++;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lgd;)V", line = 177)
    public class135(class696 arg0) {
        this.field1780 = arg0;
        this.field1786 = this.field1780.field9204;
        if (this.field1786 && !this.field1780.method1208(class73.field990, 0, class470.field6127)) {
            this.field1786 = false;
        }
        if (this.field1786 || this.field1780.method1188(class470.field6127, (byte) -37, class73.field990)) {
            class349.method2019(127);
            if (this.field1786) {
                byte[] var6 = class170.method1076(class651.field8307, 18406, false);
                this.field1785 = this.field1780.method1201(0, 128, class470.field6127, 16, var6, 128);
                byte[] var7 = class170.method1076(class464.field6026, 18406, false);
                this.field1780.method1201(0, 128, class470.field6127, 16, var7, 128);
            } else {
                this.field1787 = new class471[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class24.method109(class651.field8307, 32768, -2312, var2 * 128 * 256);
                    this.field1787[var2] = this.field1780.method3753(124, 128, var5, 128, class470.field6127, true);
                }
                this.field1788 = new class471[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class24.method109(class464.field6026, 32768, -2312, var3 * 128 * 256);
                    this.field1788[var3] = this.field1780.method3753(100, 128, var4, 128, class470.field6127, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Ljava/lang/String;", line = 151)
    public static final String method786(int arg0) {
        field1783++;
        if (class525.field6678 || class643.field8232 == null) {
            return "";
        } else if ((class643.field8232.field10408 == null || class643.field8232.field10408.length() == 0) && class643.field8232.field10410 != null && class643.field8232.field10410.length() > 0) {
            return class643.field8232.field10410;
        } else {
            int var1 = -107 % ((-arg0 - 10) / 44);
            return class643.field8232.field10408;
        }
    }
}
