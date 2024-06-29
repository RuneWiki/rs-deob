import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class388 extends class104 {

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "[[B")
    private byte[][] field5853 = new byte[10][];

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "Lib;")
    private class163 field5861 = new class163(null);

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "Lib;")
    private class163 field5864 = new class163(null);

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "Lla;")
    private class476 field5863;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    private int field5857;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "[Ljava/lang/String;")
    private static final String[] field5865 = new String[] { method3095(method3094("yq'Z4")), method3095(method3094("yq'Y4")), method3095(method3094("yq'0ugy}24")), method3095(method3094("r>'\"a")), method3095(method3094("gee`")), method3095(method3094("yq'O4")), method3095(method3094("yq'X4")) };

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field5854 = 0;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field5859 = -1;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "D")
    public static double field5856;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    private int field5851;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "[I")
    private int[] field5858;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(ILla;I)V")
    public class388(int arg0, class476 arg1, int arg2) {
        super(arg0);
        try {
            this.field5863 = arg1;
            this.field5857 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5865[2] + arg0 + ',' + (arg1 == null ? field5865[4] : field5865[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(B)V")
    public final void method3091(byte arg0) {
        try {
            field5852++;
            if (this.field5858 != null) {
                int var2 = 0;
                if (arg0 <= 21) {
                    field5854 = 8;
                }
                while (var2 < 10) {
                    if (this.field5858.length <= var2 + this.field5851) {
                        return;
                    }
                    if (this.field5853[var2] == null && this.field5863.method3621(0, -124, this.field5858[this.field5851 + var2])) {
                        this.field5853[var2] = this.field5863.method3632(this.field5858[this.field5851 + var2], 0, -126);
                    }
                    var2++;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5865[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V")
    public static final void method3092(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field5862++;
            if (arg0 < 5) {
                field5856 = -0.8945599577961155D;
            }
            int var5 = class617.field9068;
            int var6 = class597.field8779;
            if (class235.field3549) {
                var5 += class398.method3141(1);
                var6 += class779.method5635((byte) 32);
            }
            if (class245.field3753 == 1) {
                class581 var7 = class774.field11246[class382.field5791 / 100];
                var7.method4347(var5 - 8, var6 - 8);
                class758.method5495((byte) 50, var7.method997() + var6 - 8, var6 + -8, var5 + var7.method988() - 8, var5 + -8);
            }
            if (class245.field3753 == 2) {
                class581 var8 = class774.field11246[(class382.field5791 / 100) + 4];
                var8.method4347(var5 - 8, var6 - 8);
                class758.method5495((byte) 50, var6 - (8 - var8.method997()), var6 + -8, var5 + var8.method988() - 8, var5 + -8);
            }
            class107.method939(-3009);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5865[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
    public static final int method3093(int arg0, byte arg1) {
        try {
            int var4 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
            if (arg1 < 124) {
                return -92;
            }
            field5860++;
            var4 = (var4 >>> 2 & 0xF3333333) + (var4 & 0x33333333);
            var4 = (var4 >>> 4) + var4 & 0xF0F0F0F;
            var4 += var4 >>> 8;
            var4 += var4 >>> 16;
            return var4 & 0xFF;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5865[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BI)I")
    public final int method926(byte[] arg0, int arg1) throws IOException {
        try {
            if (arg1 >= -64) {
                method3093(-107, (byte) -3);
            }
            field5855++;
            if (this.field5858 == null) {
                if (!this.field5863.method3621(0, -123, this.field5857)) {
                    return 0;
                }
                byte[] var3 = this.field5863.method3632(this.field5857, 0, 74);
                if (var3 == null) {
                    throw new IllegalStateException("");
                }
                this.field5864.field2209 = var3;
                this.field5864.field2201 = 0;
                int var4 = var3.length >> 1;
                this.field5858 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5858[var5] = this.field5864.method1445((byte) 109);
                }
            }
            if (this.field5858.length <= this.field5851) {
                return -1;
            }
            this.method3091((byte) 37);
            this.field5864.field2201 = 0;
            this.field5864.field2209 = arg0;
            do {
                if (this.field5864.field2201 >= this.field5864.field2209.length) {
                    this.field5864.field2209 = null;
                    return arg0.length;
                }
                if (this.field5861.field2209 == null) {
                    if (this.field5853[0] == null) {
                        this.field5864.field2209 = null;
                        return this.field5864.field2201;
                    }
                    this.field5861.field2209 = this.field5853[0];
                }
                int var6 = this.field5864.field2209.length - this.field5864.field2201;
                int var7 = this.field5861.field2209.length - this.field5861.field2201;
                if (var7 > var6) {
                    this.field5861.method1413(this.field5864.field2209, -16385, var6, this.field5864.field2201);
                    this.field5864.field2209 = null;
                    return arg0.length;
                }
                this.field5864.method1454(var7, this.field5861.field2201, this.field5861.field2209, (byte) 77);
                this.field5861.field2201 = 0;
                this.field5851++;
                this.field5861.field2209 = null;
                for (int var8 = 0; var8 < 9; var8++) {
                    this.field5853[var8] = this.field5853[var8 + 1];
                }
                this.field5853[9] = null;
            } while (this.field5851 < this.field5858.length);
            this.field5864.field2209 = null;
            return this.field5864.field2201;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5865[5] + (arg0 == null ? field5865[4] : field5865[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3094(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3095(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
