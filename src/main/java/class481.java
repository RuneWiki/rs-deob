import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class481 extends class349 {

    @OriginalMember(owner = "client!nda", name = "G", descriptor = "[F")
    public static float[] field6475 = new float[16];

    @OriginalMember(owner = "client!nda", name = "C", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!nda", name = "D", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "I")
    private int field6473;

    @OriginalMember(owner = "client!nda", name = "F", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "I")
    private int field6476;

    @OriginalMember(owner = "client!nda", name = "I", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
    private int field6479;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field6478;
        int var3 = 1 / ((-32 - arg1) / 47);
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class39.field497 > var8; ++var8) {
                var5[var8] = this.field6479;
                var6[var8] = this.field6473;
                var7[var8] = this.field6476;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
    private final void method2681(int arg0, int arg1) {
        ++field6472;
        if (arg0 != -7844) {
            this.method9(-42, (byte) 65);
        }
        this.field6476 = (arg1 & 255) << 4;
        this.field6473 = (65280 & arg1) >> 4;
        this.field6479 = arg1 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (~arg1 == -1) {
            this.method2681(-7844, arg2.method904(arg0 ^ 3977));
        }
        ++field6474;
        if (arg0 != 4095) {
            this.method5(-126, 48, (class138) null);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "([I[I[IILdw;)V")
    public static final void method2682(int[] arg0, int[] arg1, int[] arg2, int arg3, class676 arg4) {
        ++field6477;
        for (int var5 = arg3; arg1.length > var5; ++var5) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (~var7 != -1 && ~var9 > ~arg4.field440.length) {
                if (~(var7 & 1) != -1) {
                    if (var6 != -1) {
                        class463 var10 = class77.field971.method776(var6, (byte) 127);
                        int var11 = var10.field6314;
                        class589 var12 = arg4.field440[var9];
                        if (var12 != null) {
                            if (~var12.field8091 == ~var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field440[var9] = null;
                                } else if (~var11 != -2) {
                                    if (~var11 == -3) {
                                        var12.field8090 = 0;
                                    }
                                } else {
                                    var12.field8089 = 0;
                                    var12.field8083 = 0;
                                    var12.field8092 = var8;
                                    var12.field8090 = 0;
                                    var12.field8088 = 1;
                                    class311.method1870(0, arg4.field3917, (byte) 1, false, arg4.field3929, var10, arg4.field3925);
                                }
                            } else if (~var10.field6334 <= ~class77.field971.method776(var12.field8091, (byte) -112).field6334) {
                                var12 = arg4.field440[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class589 var13 = arg4.field440[var9] = new class589();
                            var13.field8088 = 1;
                            var13.field8091 = var6;
                            var13.field8089 = 0;
                            var13.field8083 = 0;
                            var13.field8090 = 0;
                            var13.field8092 = var8;
                            class311.method1870(0, arg4.field3917, (byte) 1, false, arg4.field3929, var10, arg4.field3925);
                        }
                    } else {
                        arg4.field440[var9] = null;
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
    public static void method2683(boolean arg0) {
        field6475 = null;
        if (!arg0) {
            method2684((class138) null, -100);
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
    public class481() {
        this(0);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(I)V")
    private class481(int arg0) {
        super(0, false);
        this.method2681(-7844, arg0);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Ldga;I)V")
    public static final void method2684(class138 arg0, int arg1) {
        for (int var2 = 0; var2 < class690.field9745; ++var2) {
            int var3 = arg0.method914(-36);
            int var4 = arg0.method922((byte) -114);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class645.field9142[var3] != null) {
                class645.field9142[var3].field7583 = var4;
            }
        }
        if (arg1 == 23747) {
            ++field6471;
        }
    }

    static {
        new class229("", 76);
    }
}
