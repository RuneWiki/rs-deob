import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class431 extends class388 {

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "S")
    public short field6339;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "B")
    public byte field6330;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "S")
    public short field6332;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public int field6335;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "S")
    public short field6337;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field6327;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "S")
    public short field6340;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public int field6334;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
    public boolean field6329;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "B")
    public byte field6328;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
    public abstract int method890(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
    public static final boolean method2616(int arg0, int arg1, int arg2) {
        field6338++;
        if (arg0 != -18445) {
            method2616(-27, 83, 57);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2617(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class250.field3685++;
        class63.field752 = 0;
        for (int var6 = class168.field2378; var6 < class308.field4395; var6++) {
            class148[][] var17 = class422.field6240[var6];
            for (int var18 = class400.field5938; var18 < class74.field1016; var18++) {
                for (int var19 = class101.field1415; var19 < class215.field3099; var19++) {
                    class148 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class350.field4844[var18 + class385.field5672 - class321.field4527][var19 + class385.field5672 - class209.field3040] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field2092 = true;
                            var20.field2097 = true;
                            if (var20.field2086 == null) {
                                var20.field2093 = false;
                            } else {
                                var20.field2093 = true;
                            }
                            class63.field752++;
                        } else {
                            var20.field2092 = false;
                            var20.field2097 = false;
                            var20.field2088 = 0;
                            if (var18 >= class321.field4527 - 16 && var18 <= class321.field4527 + 16 && var19 >= class209.field3040 - 16 && var19 <= class209.field3040 + 16 && (var20.field2098 != null || var20.field2078 != null || var20.field2079 != null || var20.field2085 != null || var20.field2082 != null || var20.field2086 != null)) {
                                class198.field2896.method1202(var20, (byte) -39);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class52.field578 == class131.field1899;
        for (int var8 = class168.field2378; var8 < class308.field4395; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class442.field6561.method298() && var8 >= arg2 && arg1 != null) {
                int var10 = class350.field4844.length;
                if (class350.field4844.length + class400.field5938 > class241.field3562) {
                    var10 -= class350.field4844.length + class400.field5938 - class241.field3562;
                }
                int var11 = class350.field4844[0].length;
                if (class350.field4844[0].length + class101.field1415 > class497.field7388) {
                    var11 -= class350.field4844[0].length + class101.field1415 - class497.field7388;
                }
                int var12 = class251.field3699;
                while (true) {
                    if (var12 >= var10) {
                        class198.field2896.method1197(var8, true, class131.field1899[var8], var9, (byte) 46);
                        break;
                    }
                    int var13 = class400.field5938 + var12 - class251.field3699;
                    for (int var14 = class226.field3302; var14 < var11; var14++) {
                        class89.field1221[var12][var14] = false;
                        if (class350.field4844[var12][var14]) {
                            int var15 = class101.field1415 + var14 - class226.field3302;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class422.field6240[var16][var13][var15] != null && class422.field6240[var16][var13][var15].field2100 == var8) {
                                    class89.field1221[var12][var14] = class422.field6240[var16][var13][var15].field2092;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class198.field2896.method1197(var8, false, class131.field1899[var8], var9, (byte) 46);
            }
            class198.field2896.method1203(5000);
        }
        if (!class230.method1545(true)) {
            class230.method1545(false);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB[I[[B[BI[I[[B)I")
    public static final int method2618(int arg0, byte arg1, int[] arg2, byte[][] arg3, byte[] arg4, int arg5, int[] arg6, byte[][] arg7) {
        field6336++;
        int var8 = arg2[arg5];
        int var9 = arg6[arg5] + var8;
        int var10 = arg2[arg0];
        int var11 = var10 + arg6[arg0];
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg5] & 0xFF;
        if ((arg4[arg0] & 0xFF) < var14) {
            var14 = arg4[arg0] & 0xFF;
        }
        byte[] var15 = arg3[arg5];
        byte[] var16 = arg7[arg0];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        int var19 = 80 % ((59 - arg1) / 32);
        for (int var20 = var12; var20 < var13; var20++) {
            int var21 = var16[var18++] + var15[var17++];
            if (var21 < var14) {
                var14 = var21;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public void method885(int arg0) {
        if (arg0 != 11264) {
            method2616(113, 83, 92);
        }
        field6333++;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6339 = (short) arg6;
        this.field6330 = arg9;
        this.field6332 = (short) arg4;
        this.field6335 = arg1;
        this.field6337 = (short) arg7;
        this.field6327 = arg2;
        this.field6340 = (short) arg5;
        this.field6334 = arg3;
        this.field6329 = arg8;
        this.field6328 = (byte) arg0;
    }
}
