import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class9 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lob;")
    public class375 field92 = null;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lbaa;")
    private class620[] field94 = null;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[Lbaa;")
    public class620[] field97 = null;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lob;")
    public class375 field100 = null;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lbm;")
    private class684 field102;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
    public boolean field99;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Z")
    public static boolean field96 = false;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lmb;ZZ)V", line = 5)
    public static final void method39(class410 arg0, boolean arg1, boolean arg2) {
        arg0.field5780 = arg2;
        if (!class6.field68) {
            class275.method1649(arg0, class455.field6382);
        } else if (arg1) {
            class317.field4078[class317.field4078.length - 1].method1913(arg0, (byte) -108);
        } else {
            int var3 = class87.method606(arg0.field5781);
            int var4 = class741.field10371[2] * arg0.method269((byte) 30) / arg0.field5783;
            int var5 = class87.method606(arg0.field5781 - var4);
            int var6 = class87.method606(arg0.field5781 + var4);
            if (var5 == var6) {
                class317.field4078[var3].method1913(arg0, (byte) -127);
            } else if (var6 - var5 == 1) {
                class317.field4078[class86.field1097 + var5].method1913(arg0, (byte) -124);
            } else {
                class317.field4078[class317.field4078.length - 1].method1913(arg0, (byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method40(int arg0) {
        if (arg0 != 3997) {
            this.field97 = null;
        }
        field93++;
        if (this.field92 == null) {
            if (class689.field9788 == null) {
                byte[] var2 = class414.method2454(0.5F, 128, 128, 16.0F, (byte) 17, 0.6F, 16, 4.0F, 8, 4.0F, new class130(419684));
                class689.field9788 = class574.method3222(var2, (byte) -120, false);
            }
            byte[] var3 = class638.method3459(-32767, class689.field9788, false);
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
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field92 = this.field102.method1410(16, 128, (byte) -47, class440.field6178, var4, 128);
        }
        return this.field92 != null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lbm;)V", line = 211)
    public class9(class684 arg0) {
        this.field102 = arg0;
        this.field99 = this.field102.field9604;
        if (this.field99 && !this.field102.method1385((byte) -69, class332.field4276, class240.field3093)) {
            this.field99 = false;
        }
        if (this.field99 || this.field102.method1399(class240.field3093, (byte) 62, class332.field4276)) {
            class658.method3572((byte) 40);
            if (this.field99) {
                byte[] var6 = class638.method3459(-32767, class347.field4493, false);
                this.field100 = this.field102.method1410(16, 128, (byte) -47, class332.field4276, var6, 128);
                byte[] var7 = class638.method3459(-32767, class38.field564, false);
                this.field102.method1410(16, 128, (byte) -47, class332.field4276, var7, 128);
            } else {
                this.field97 = new class620[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class408.method2419(false, var2 * 128 * 256, 32768, class347.field4493);
                    this.field97[var2] = this.field102.method3714(128, 0, 128, var5, true, class332.field4276);
                }
                this.field94 = new class620[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class408.method2419(false, var3 * 128 * 2 * 128, 32768, class38.field564);
                    this.field94[var3] = this.field102.method3714(128, 0, 128, var4, true, class332.field4276);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZ)V", line = 129)
    public static final void method41(boolean arg0, boolean arg1) {
        field98++;
        class384.method2308(-124);
        if (!class64.method489((byte) 124, class668.field9150)) {
            return;
        }
        class462.field6704++;
        if (arg1 || class462.field6704 < 50 && !arg0) {
            return;
        }
        class462.field6704 = 0;
        if (!class541.field7612 && class426.field6057 != null) {
            class696.field9863++;
            class650 var2 = class314.method1837(class572.field7973, true, class625.field8727);
            class108.method745(var2, -119);
            try {
                class704.method3905((byte) 116);
            } catch (IOException var3) {
                class541.field7612 = true;
            }
        }
        class384.method2308(-122);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z", line = 173)
    public final boolean method42(byte arg0) {
        field91++;
        if (arg0 != 118) {
            this.method40(-21);
        }
        if (this.field99) {
            return this.field100 != null;
        } else {
            return this.field97 != null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 187)
    public static final void method43(int arg0, int arg1) {
        field101++;
        class545.field7647 = arg1;
        class421.field5993.method776((byte) -120);
        if (arg0 != 26962) {
            field95 = 118;
        }
    }
}
