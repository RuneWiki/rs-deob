import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class174 extends InputStream {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2725 = "Loaded config";

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static volatile int field2730 = -1;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!wg", name = "read", descriptor = "()I")
    public final int read() {
        field2728++;
        class170.method1183(30000L, (byte) 94);
        return -1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIZ[Lld;I)V")
    public static final void method1223(int arg0, byte[] arg1, int arg2, boolean arg3, class79[] arg4, int arg5) {
        field2726++;
        if (arg5 != 8) {
            field2730 = -120;
        }
        class25 var6 = new class25(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method209(-2073973340);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method192((byte) -20);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = (var9 & 0xFC2) >> 6;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method201(arg5 ^ 0xF7);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg2 + var11;
                int var18 = arg0 + var12;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class79 var19 = null;
                    if (!arg3) {
                        int var20 = var13;
                        if ((class35.field449[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class56.method412(var18, var19, (byte) 125, !arg3, var16, var15, var13, var17, var13, var7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1224(byte arg0) {
        int var1 = 46 / ((arg0 + 28) / 60);
        field2725 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public static final void method1225(int arg0, boolean arg1) {
        field2729++;
        byte var2 = 4;
        byte[][] var3 = class235.field3770;
        if (arg0 != 8) {
            field2730 = -2;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class154.field2295[var5] >> 8) * 64 - class126.field1869;
            int var12 = (class154.field2295[var5] & 0xFF) * 64 - class246.field3943;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class10.method63(13371);
                class19.method129((class179.field2794 - 6) * 8, -1, arg1, var12, var13, class138.field2043 * 8 - 48, var11, class290.field4574);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class154.field2295[var6] >> 8) * 64 - class126.field1869;
            int var8 = (class154.field2295[var6] & 0xFF) * 64 - class246.field3943;
            byte[] var9 = var3[var6];
            if (var9 == null && class138.field2043 < 800) {
                class10.method63(13371);
                for (int var10 = 0; var10 < var2; var10++) {
                    class27.method231(64, (byte) 97, var7, var8, 64, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
    public static final boolean method1226(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class272.field4328; var3++) {
            class13 var4 = class229.field3700[var3];
            if (var4.field158 == 1) {
                int var5 = var4.field160 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field163 * var5 >> 8) + var4.field171;
                    int var7 = (var4.field177 * var5 >> 8) + var4.field156;
                    int var8 = (var4.field159 * var5 >> 8) + var4.field164;
                    int var9 = (var4.field155 * var5 >> 8) + var4.field170;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field158 == 2) {
                int var10 = arg0 - var4.field160;
                if (var10 > 0) {
                    int var11 = (var4.field163 * var10 >> 8) + var4.field171;
                    int var12 = (var4.field177 * var10 >> 8) + var4.field156;
                    int var13 = (var4.field159 * var10 >> 8) + var4.field164;
                    int var14 = (var4.field155 * var10 >> 8) + var4.field170;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field158 == 3) {
                int var15 = var4.field171 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field175 * var15 >> 8) + var4.field160;
                    int var17 = (var4.field173 * var15 >> 8) + var4.field161;
                    int var18 = (var4.field159 * var15 >> 8) + var4.field164;
                    int var19 = (var4.field155 * var15 >> 8) + var4.field170;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field158 == 4) {
                int var20 = arg2 - var4.field171;
                if (var20 > 0) {
                    int var21 = (var4.field175 * var20 >> 8) + var4.field160;
                    int var22 = (var4.field173 * var20 >> 8) + var4.field161;
                    int var23 = (var4.field159 * var20 >> 8) + var4.field164;
                    int var24 = (var4.field155 * var20 >> 8) + var4.field170;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field158 == 5) {
                int var25 = arg1 - var4.field164;
                if (var25 > 0) {
                    int var26 = (var4.field175 * var25 >> 8) + var4.field160;
                    int var27 = (var4.field173 * var25 >> 8) + var4.field161;
                    int var28 = (var4.field163 * var25 >> 8) + var4.field171;
                    int var29 = (var4.field177 * var25 >> 8) + var4.field156;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
