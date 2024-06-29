import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class29 extends class335 {

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "Ljava/lang/String;")
    public static String field420 = "Starting 3d Library";

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "J")
    public static long field425 = 0L;

    @OriginalMember(owner = "client!nn", name = "U", descriptor = "I")
    public static int field428 = -1;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!nn", name = "X", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!nn", name = "Y", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!nn", name = "V", descriptor = "Ll;")
    public static class133 field429;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "[Lsh;")
    private class131[] field422;

    @OriginalMember(owner = "client!nn", name = "W", descriptor = "[[B")
    public static byte[][] field430;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 6)
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V", line = 12)
    public static final void method247(byte arg0) {
        field431++;
        int var1 = 73 % ((arg0 + 18) / 47);
        if (class26.field399) {
            return;
        }
        if (class139.field2170) {
            class30.field443 = (float) ((int) class30.field443 + 47 & 0xFFFFFFF0);
        } else {
            class121.field1846 += (12.0F - class121.field1846) / 2.0F;
        }
        class232.field3672 = true;
        class26.field399 = true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([BZ)[B", line = 38)
    public static final byte[] method248(byte[] arg0, boolean arg1) {
        field427++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (!arg1) {
            field428 = 27;
        }
        class343.method2373(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)[[I", line = 57)
    public final int[][] method249(int arg0, byte arg1) {
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (arg1 != 51) {
            field420 = (String) null;
        }
        field421++;
        if (this.field5232.field2446) {
            int var4 = class75.field1213;
            int var5 = class105.field1630;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field5232.method1103((byte) 117);
            this.method251(var6, arg1 - 53);
            for (int var8 = 0; var8 < class75.field1213; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class105.field1630; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class270.method1860(var15, 255) << 4;
                    var12[var14] = class270.method1860(65280, var15) >> 4;
                    var11[var14] = class270.method1860(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILkh;I)V", line = 115)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 <= 51) {
            field428 = -110;
        }
        field424++;
        if (arg0 == 0) {
            this.field422 = new class131[arg1.method1178(0)];
            for (int var4 = 0; var4 < this.field422.length; var4++) {
                int var5 = arg1.method1178(0);
                if (var5 == 0) {
                    this.field422[var4] = class345.method2385(arg1, false);
                } else if (var5 == 1) {
                    this.field422[var4] = class272.method1871(arg1, 28363);
                } else if (var5 == 2) {
                    this.field422[var4] = class152.method1051(-70, arg1);
                } else if (var5 == 3) {
                    this.field422[var4] = class83.method587(arg1, 128);
                }
            }
        } else if (arg0 == 1) {
            this.field5234 = arg1.method1178(0) == 1;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "()V", line = 192)
    public static final void method250() {
        for (int var0 = 0; var0 < class65.field1018; var0++) {
            class26 var1 = class51.field840[var0];
            class195.method1389(var1);
            class51.field840[var0] = null;
        }
        class65.field1018 = 0;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)[I", line = 209)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        field432++;
        if (arg1 == 621) {
            if (this.field5233.field2467) {
                this.method251(this.field5233.method1107(arg1 - 621), -2);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([[II)V", line = 242)
    private final void method251(int[][] arg0, int arg1) {
        field419++;
        int var3 = class105.field1630;
        int var4 = class75.field1213;
        class296.method2011(arg0, true);
        if (arg1 != -2) {
            method247((byte) 122);
        }
        class333.method2315(class227.field3597, -54, 0, 0, class244.field3906);
        if (this.field422 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field422.length; var5++) {
            class131 var6 = this.field422[var5];
            int var7 = var6.field2056;
            int var8 = var6.field2059;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method3(var3, (byte) 105, var4);
                }
            } else if (var8 < 0) {
                var6.method6(arg1 ^ 0x90152DDF, var3, var4);
            } else {
                var6.method4(var4, 3, var3);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)V", line = 294)
    public static final void method252(String arg0, String arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field428 = 38;
        }
        field426++;
        class321.method2186(arg3, arg1, (String) null, 0, arg0, -1);
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)V", line = 309)
    public static void method253(byte arg0) {
        field429 = null;
        field430 = (byte[][]) null;
        if (arg0 > -30) {
            method252((String) null, (String) null, false, 63);
        }
        field420 = null;
    }
}
