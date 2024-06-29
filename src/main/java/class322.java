import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class322 extends class17 {

    @OriginalMember(owner = "client!oi", name = "ib", descriptor = "I")
    private int field5509 = 32768;

    @OriginalMember(owner = "client!oi", name = "db", descriptor = "Lsf;")
    public static class108 field5504 = class140.method973(255, "gelb:");

    @OriginalMember(owner = "client!oi", name = "hb", descriptor = "[F")
    public static float[] field5508 = new float[4];

    @OriginalMember(owner = "client!oi", name = "kb", descriptor = "I")
    public static int field5511 = -1;

    @OriginalMember(owner = "client!oi", name = "fb", descriptor = "Lcd;")
    public static class69 field5506 = new class69(64);

    @OriginalMember(owner = "client!oi", name = "ob", descriptor = "Lsf;")
    private static class108 field5515 = class140.method973(255, "Face here");

    @OriginalMember(owner = "client!oi", name = "nb", descriptor = "Lsf;")
    public static class108 field5514 = field5515;

    @OriginalMember(owner = "client!oi", name = "pb", descriptor = "Lhe;")
    public static class94 field5516 = new class94(64);

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!oi", name = "cb", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!oi", name = "gb", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!oi", name = "jb", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!oi", name = "lb", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!oi", name = "eb", descriptor = "[I")
    public static int[] field5505;

    @OriginalMember(owner = "client!oi", name = "mb", descriptor = "[[B")
    public static byte[][] field5513;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V", line = 9)
    public static void method2222(byte arg0) {
        field5506 = null;
        field5508 = null;
        if (arg0 > -72) {
            return;
        }
        field5513 = (byte[][]) null;
        field5514 = null;
        field5516 = null;
        field5515 = null;
        field5505 = null;
        field5504 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLrm;I)V", line = 26)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.method114((byte) 37, (class249) null, -10);
        }
        if (arg2 == 0) {
            this.field5509 = arg1.method1712(-1) << 4;
        } else if (arg2 == 1) {
            this.field225 = arg1.method1731(true) == 1;
        }
        field5503++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V", line = 62)
    public final void method116(boolean arg0) {
        class271.method1959(1);
        field5501++;
        if (!arg0) {
            field5505 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[[I", line = 80)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            field5511 = 56;
        }
        field5502++;
        int[][] var3 = this.field224.method2081(arg1, -124);
        if (this.field224.field5106) {
            int[] var4 = this.method124(105, 1, arg1);
            int[] var5 = this.method124(70, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class116.field2008; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF92F) >> 12;
                int var11 = var5[var9] * this.field5509 >> 12;
                int var12 = class256.field4505[var10] * var11 >> 12;
                int var13 = var9 + (var12 >> 12) & class249.field4327;
                int var14 = class246.field4264[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg1 & class219.field3899;
                int[][] var16 = this.method111(3, var15, 0);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 138)
    public class322() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(II)[I", line = 142)
    public final int[] method120(int arg0, int arg1) {
        field5507++;
        if (arg0 > -95) {
            this.method116(true);
        }
        int[] var3 = this.field217.method1698(119, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(92, 1, arg1);
            int[] var5 = this.method124(84, 2, arg1);
            for (int var6 = 0; var6 < class116.field2008; var6++) {
                int var7 = (var4[var6] & 0xFF4) >> 4;
                int var8 = var5[var6] * this.field5509 >> 12;
                int var9 = class246.field4264[var7] * var8 >> 12;
                int var10 = class256.field4505[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + var6 & class249.field4327;
                int var12 = class219.field3899 & (var9 >> 12) + arg1;
                int[] var13 = this.method124(87, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(II)I", line = 216)
    public static final int method2223(int arg0, int arg1) {
        field5512++;
        if (arg0 != 9162) {
            method2223(45, -123);
        }
        return arg1 >>> 8;
    }
}
