import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class167 extends class76 {

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "Lsf;")
    public class547 field2428;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "Z")
    public boolean field2427;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "[Lsp;")
    public class660[] field2426;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIB)Lli;")
    public static final class449 method1291(int arg0, int arg1, int arg2, byte arg3) {
        field2423++;
        class379 var4 = class378.field5427[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class449 var5 = null;
        int var6 = -1;
        for (class393 var7 = var4.field5437; var7 != null; var7 = var7.field5574) {
            class778 var8 = var7.field5578;
            if (var8 instanceof class449) {
                class449 var9 = (class449) var8;
                int var10 = var9.method2692((byte) -6) * 256 + 252 - 256;
                int var11 = var9.field7718 - var10 >> 9;
                int var12 = var9.field7719 - var10 >> 9;
                int var13 = var9.field7718 + var10 >> 9;
                int var14 = var9.field7719 + var10 >> 9;
                if (var11 <= arg1 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        if (arg3 >= -90) {
            method1291(-33, 24, -12, (byte) -47);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method1292(int arg0, int arg1, int arg2, class66 arg3) {
        field2424++;
        int var5 = this.field2428.method1599(arg0 ^ 0x7F8D6461);
        if (arg0 != -2139972631) {
            method1291(-61, -7, 13, (byte) -48);
        }
        if (this.field2426 != null) {
            for (int var6 = 0; var6 < this.field2426.length; var6++) {
                this.field2426[var6].field9276 <<= var5;
                if (this.field2426[var6].method3768(arg1, arg2) && this.field2428.method253(arg2, true, arg3, arg1)) {
                    this.field2426[var6].field9276 >>= var5;
                    return true;
                }
                this.field2426[var6].field9276 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class73.field976 = arg2;
        class205.field3020 = arg0;
        field2425++;
        if (!arg4) {
            method1291(-98, -101, 122, (byte) 12);
        }
        class115.field1450 = arg1;
        class539.field7576 = arg5;
        class786.field10811 = arg3;
        class435.field6183 = arg6;
    }
}
