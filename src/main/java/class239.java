import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class239 extends InputStream {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "Loca;")
    public static class221 field3331 = new class221(15, 0, 1, 0);

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "[I")
    public static int[] field3334 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "[Lkf;")
    public static class212[] field3332;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
    public static final int method1491(int arg0, int arg1) {
        int var2 = 69 % ((arg1 + 22) / 44);
        field3333++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
    public static final boolean method1492(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class144.field2227; var3++) {
            class626 var4 = class53.field996[var3];
            if (var4.field9113 == 1) {
                int var5 = var4.field9128 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field9118 * var5 >> 8) + var4.field9112;
                    int var7 = (var4.field9123 * var5 >> 8) + var4.field9129;
                    int var8 = (var4.field9135 * var5 >> 8) + var4.field9136;
                    int var9 = (var4.field9127 * var5 >> 8) + var4.field9125;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field9113 == 2) {
                int var10 = arg0 - var4.field9128;
                if (var10 > 0) {
                    int var11 = (var4.field9118 * var10 >> 8) + var4.field9112;
                    int var12 = (var4.field9123 * var10 >> 8) + var4.field9129;
                    int var13 = (var4.field9135 * var10 >> 8) + var4.field9136;
                    int var14 = (var4.field9127 * var10 >> 8) + var4.field9125;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field9113 == 3) {
                int var15 = var4.field9112 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field9121 * var15 >> 8) + var4.field9128;
                    int var17 = (var4.field9131 * var15 >> 8) + var4.field9117;
                    int var18 = (var4.field9135 * var15 >> 8) + var4.field9136;
                    int var19 = (var4.field9127 * var15 >> 8) + var4.field9125;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field9113 == 4) {
                int var20 = arg2 - var4.field9112;
                if (var20 > 0) {
                    int var21 = (var4.field9121 * var20 >> 8) + var4.field9128;
                    int var22 = (var4.field9131 * var20 >> 8) + var4.field9117;
                    int var23 = (var4.field9135 * var20 >> 8) + var4.field9136;
                    int var24 = (var4.field9127 * var20 >> 8) + var4.field9125;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field9113 == 5) {
                int var25 = arg1 - var4.field9136;
                if (var25 > 0) {
                    int var26 = (var4.field9121 * var25 >> 8) + var4.field9128;
                    int var27 = (var4.field9131 * var25 >> 8) + var4.field9117;
                    int var28 = (var4.field9118 * var25 >> 8) + var4.field9112;
                    int var29 = (var4.field9123 * var25 >> 8) + var4.field9129;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        class296.field4062 = null;
        class160.field2344 = null;
        field3329++;
        class56.field1006 = null;
        class401.field5715 = null;
        class80.field1308 = null;
        class572.field7888 = null;
        class385.field5166 = null;
        class487.field6842 = null;
        if (arg0 != -16956) {
            method1491(13, -117);
        }
        class401.field5720 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V")
    public static void method1494(boolean arg0) {
        field3331 = null;
        field3334 = null;
        if (arg0) {
            field3332 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "read", descriptor = "()I")
    public final int read() {
        field3330++;
        class21.method220(0, 30000L);
        return -1;
    }
}
