import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class26 extends class120 {

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    private int field375 = 4096;

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
    private int field382 = 4096;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "I")
    private int field383 = 4096;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "[I")
    private int[] field376 = new int[3];

    @OriginalMember(owner = "client!hi", name = "jb", descriptor = "I")
    private int field389 = 409;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "Lok;")
    public static class41 field378 = class137.method956(")4", 45);

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "Lok;")
    public static class41 field373 = class137.method956("l", 45);

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "J")
    public static long field381 = 0L;

    @OriginalMember(owner = "client!hi", name = "gb", descriptor = "Lok;")
    public static class41 field386 = class137.method956("::gc", 45);

    @OriginalMember(owner = "client!hi", name = "ib", descriptor = "Lok;")
    private static class41 field388 = class137.method956("Started 3d Library", 45);

    @OriginalMember(owner = "client!hi", name = "hb", descriptor = "Lok;")
    public static class41 field387 = field388;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "Lok;")
    public static class41 field384;

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "Lmh;")
    public static class65 field385;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 251)
    public class26() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lok;I)Lok;", line = 12)
    public static final class41 method167(class41 arg0, int arg1) {
        if (arg1 != 3) {
            field385 = (class65) null;
        }
        field377++;
        int var2 = class131.method923(arg0, (byte) -87);
        return var2 == -1 ? class15.field200 : class268.field4273.field4754[var2].method302(class230.field3650, class285.field4644, -34);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IZ)[[I", line = 34)
    public final int[][] method168(int arg0, boolean arg1) {
        field374++;
        if (!arg1) {
            field381 = -53L;
        }
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class307.field5160; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field376[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field389) {
                    var9[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field376[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field389 >= var15) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field376[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field389) {
                            var9[var11] = this.field383 * var12 >> 12;
                            var8[var11] = this.field382 * var14 >> 12;
                            var10[var11] = this.field375 * var16 >> 12;
                        } else {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(II)I", line = 128)
    public static int method169(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V", line = 148)
    public static void method170(boolean arg0) {
        field385 = null;
        field387 = null;
        field373 = null;
        field388 = null;
        field386 = null;
        field384 = null;
        if (arg0) {
            method167((class41) null, 105);
        }
        field378 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)I", line = 170)
    public static final int method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 1) {
            method167((class41) null, -87);
        }
        field380++;
        int var5 = 65536 - class31.field455[arg1 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Llb;II)V", line = 186)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field379++;
        if (arg1 != -1) {
            field373 = (class41) null;
        }
        if (arg2 == 0) {
            this.field389 = arg0.method759((byte) -114);
        } else if (arg2 == 1) {
            this.field375 = arg0.method759((byte) -86);
        } else if (arg2 == 2) {
            this.field382 = arg0.method759((byte) -77);
        } else if (arg2 == 3) {
            this.field383 = arg0.method759((byte) -40);
        } else if (arg2 == 4) {
            int var5 = arg0.method757(arg1 ^ 0xFFFFD122);
            this.field376[0] = class217.method1563(16711680, var5) << 4;
            this.field376[2] = class217.method1563(var5, 255) >> 12;
            this.field376[1] = class217.method1563(var5, 65280) >> 4;
        }
    }
}
