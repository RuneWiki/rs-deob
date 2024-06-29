import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class227 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Loq;")
    public class232 field3300 = null;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[Llba;")
    public class225[] field3298 = null;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Loq;")
    public class232 field3301 = null;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[Llba;")
    private class225[] field3304 = null;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lmj;")
    private class114 field3307;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Z")
    public boolean field3302;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lgga;")
    public static class513 field3308;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1539(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field3309 = 42;
        }
        field3303++;
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILuf;)V")
    public static final void method1540(int arg0, int arg1, int arg2, class519 arg3) {
        field3306++;
        if (arg3 == null) {
            return;
        }
        if (arg1 != 23342) {
            method1543(125);
        }
        if (arg3.field7252 != null) {
            class511 var4 = new class511();
            var4.field7023 = arg3;
            var4.field7021 = arg3.field7252;
            class46.method357(var4);
        }
        class65.field979 = arg3.field7193;
        class121.field2051 = arg3.field7129;
        class578.field8338 = arg3.field7284;
        class345.field4896 = arg0;
        class295.field4298 = true;
        class626.field8893 = arg2;
        class745.field10364 = arg3.field7173;
        class568.field7906 = arg3.field7247;
        class172.method1268(arg3, -103);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z")
    public final boolean method1541(boolean arg0) {
        if (!arg0) {
            return true;
        }
        field3299++;
        if (this.field3302) {
            return this.field3301 != null;
        } else {
            return this.field3298 != null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Z")
    public final boolean method1542(int arg0) {
        if (this.field3300 == null) {
            if (class124.field2113 == null) {
                byte[] var2 = class509.method2974(0.6F, 4.0F, 0, 16, 8, 16.0F, 128, 128, 4.0F, 0.5F, new class28(419684));
                class124.field2113 = class381.method2301(var2, false, false);
            }
            byte[] var3 = class197.method1407((byte) 52, class124.field2113, false);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 16384;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = var8 + ((var9 - 1 & 0x7F) * 128);
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
            this.field3300 = this.field3307.method112(16, 128, class133.field2225, 128, var4, 0);
        }
        field3305++;
        int var17 = 75 / ((-arg0 - 5) / 54);
        return this.field3300 != null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method1543(int arg0) {
        if (arg0 != 128) {
            field3308 = null;
        }
        field3308 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lmj;)V")
    public class227(class114 arg0) {
        this.field3307 = arg0;
        this.field3302 = this.field3307.field1891;
        if (this.field3302 && !this.field3307.method92(class505.field6931, class629.field8918, -117)) {
            this.field3302 = false;
        }
        if (this.field3302 || this.field3307.method69((byte) -114, class505.field6931, class629.field8918)) {
            class237.method1602(-1717750587);
            if (this.field3302) {
                byte[] var6 = class197.method1407((byte) 107, class613.field8700, false);
                this.field3301 = this.field3307.method112(16, 128, class505.field6931, 128, var6, 0);
                byte[] var7 = class197.method1407((byte) 60, class69.field1119, false);
                this.field3307.method112(16, 128, class505.field6931, 128, var7, 0);
            } else {
                this.field3298 = new class225[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class667.method3738(var2 * 128 * 128 * 2, class613.field8700, (byte) 95, 32768);
                    this.field3298[var2] = this.field3307.method990(class505.field6931, true, 128, var5, 128, (byte) 64);
                }
                this.field3304 = new class225[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class667.method3738(var3 * 128 * 2 * 128, class69.field1119, (byte) 95, 32768);
                    this.field3304[var3] = this.field3307.method990(class505.field6931, true, 128, var4, 128, (byte) -30);
                }
            }
        }
    }
}
