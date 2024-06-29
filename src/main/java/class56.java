import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class56 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
    public static int[] field904 = new int[256];

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lsm;")
    public static class249 field907;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "S")
    public static short field910;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lfs;")
    public static class208 field902;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
    public static int[] field909;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field904[var0] = var1;
        }
        field907 = new class249();
        field910 = 32767;
        field908 = 0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBI)I", line = 6)
    public static final int method429(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 100) {
            field904 = null;
        }
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        field903++;
        return (arg0 >> 5 << 7) + ((arg1 & 0xFF) >> 2 << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V", line = 33)
    public static final void method430(int arg0, int arg1, int arg2) {
        field905++;
        int var3 = class47.field766 * arg1 >> 8;
        if (arg0 == -1 && !class7.field122) {
            class303.method1841(109);
        } else if (arg0 != -1 && (class282.field3867 != arg0 || !class59.method439((byte) 100)) && var3 != 0 && !class7.field122) {
            class202.method1288(-1, var3, false, class101.field1440, 2, 0, arg0);
        }
        int var4 = 33 % ((arg2 - 8) / 34);
        class282.field3867 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z", line = 61)
    public static final boolean method431(int arg0, int arg1) {
        field906++;
        if (class460.field6482[arg1]) {
            return true;
        } else if (class255.field3576.method2044(-124, arg1)) {
            int var2 = class255.field3576.method2054(0, arg1);
            if (var2 == 0) {
                class460.field6482[arg1] = true;
                return true;
            }
            if (arg0 != 12449) {
                method432(64);
            }
            if (class39.field666[arg1] == null) {
                class39.field666[arg1] = new class363[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class39.field666[arg1][var3] == null) {
                    byte[] var4 = class255.field3576.method2029(arg1, var3, 0);
                    if (var4 != null) {
                        class363 var5 = class39.field666[arg1][var3] = new class363();
                        var5.field5096 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2210((byte) -58, new class425(var4));
                    }
                }
            }
            class460.field6482[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 149)
    public static void method432(int arg0) {
        field904 = null;
        field902 = null;
        field907 = null;
        field909 = null;
        if (arg0 >= -98) {
            method432(83);
        }
    }
}
