import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class81 extends class171 {

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    public int[] field989;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
    public int[] field993;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field990 = 0;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[B")
    public static byte[] field994 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public static void method457(byte arg0) {
        if (arg0 != 2) {
            field990 = -73;
        }
        field994 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILsm;Ldt;IIIIII)V")
    public static final void method458(int arg0, class171 arg1, class145 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field995++;
        int var9 = arg5 * arg5 + (arg0 * arg0);
        if (arg3 <= 123 || var9 > arg4) {
            return;
        }
        int var10 = Math.min(arg2.field2010 / 2, arg2.field2021 / 2);
        if (var9 <= var10 * var10) {
            class55.method343(arg0, class280.field4126[arg8], arg7, (byte) 90, arg1, arg5, arg6, arg2);
            return;
        }
        var10 -= 10;
        int var11;
        if (class136.field1807 == 4) {
            var11 = (int) class157.field2346 & 0x3FFF;
        } else {
            var11 = (int) class157.field2346 + class84.field1032 & 0x3FFF;
        }
        int var12 = class53.field727[var11];
        int var13 = class53.field726[var11];
        if (class136.field1807 != 4) {
            var12 = var12 * 256 / (class216.field3251 + 256);
            var13 = var13 * 256 / (class216.field3251 + 256);
        }
        int var14 = arg0 * var12 + arg5 * var13 >> 15;
        int var15 = arg0 * var13 - (arg5 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var10 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var10);
        class306.field4362[arg8].method1078((float) arg2.field2010 / 2.0F + (float) arg7 + (float) var18, (float) arg2.field2021 / 2.0F + (float) arg6 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
    public static final void method459(byte arg0) {
        if (class128.field1666 < 0) {
            class128.field1666 = 0;
            class230.field3474 = -1;
            class377.field5427 = -1;
        }
        field992++;
        if (class128.field1666 > class395.field5625) {
            class377.field5427 = -1;
            class128.field1666 = class395.field5625;
            class230.field3474 = -1;
        }
        if (class220.field3280 < 0) {
            class230.field3474 = -1;
            class220.field3280 = 0;
            class377.field5427 = -1;
        }
        int var1 = -126 % ((arg0 + 46) / 50);
        if (class395.field5628 < class220.field3280) {
            class377.field5427 = -1;
            class220.field3280 = class395.field5628;
            class230.field3474 = -1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II[I[I)V")
    public class81(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field989 = arg2;
        this.field993 = arg3;
    }
}
