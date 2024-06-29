import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class132 extends class221 {

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    private int field1697 = -1;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    private int field1702 = -1;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "Ltw;")
    public static class204 field1700;

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lac;II)V", line = 3)
    public class132(class541 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field1696 = arg2;
        super.field2851.method3006(1, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2860, arg2, arg2, 0, class716.method4008(super.field2860, 126), 5121, (byte[]) null, 0);
        }
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(Z)V", line = 20)
    public static final void method831(boolean arg0) {
        ++field1699;
        short var1 = 1024;
        short var2 = 3072;
        if (class670.field9312) {
            var2 = 4096;
            if (class179.field2208) {
                var1 = 2048;
            }
        }
        if ((float) var1 > class255.field3307) {
            class255.field3307 = (float) var1;
        }
        if (class255.field3307 > (float) var2) {
            class255.field3307 = (float) var2;
        }
        while (class183.field2237 >= 16384.0F) {
            class183.field2237 -= 16384.0F;
        }
        while (class183.field2237 < 0.0F) {
            class183.field2237 += 16384.0F;
        }
        int var3 = class558.field7855 >> 9;
        int var4 = class420.field5892 >> 9;
        int var5 = class86.method624(class61.field677, class420.field5892, class558.field7855, 24111);
        if (arg0) {
            int var6 = 0;
            if (~var3 < -4 && ~var4 < -4 && ~(class272.field3589 + -4) < ~var3 && ~(class3.field26 + -4) < ~var4) {
                for (int var7 = var3 + -4; ~(var3 + 4) <= ~var7; ++var7) {
                    for (int var8 = var4 - 4; var4 + 4 >= var8; ++var8) {
                        int var9 = class61.field677;
                        if (var9 < 3 && class669.method3767(var8, (byte) -104, var7)) {
                            ++var9;
                        }
                        int var10 = 0;
                        if (class78.field1060.field3786 != null && class78.field1060.field3786[var9] != null) {
                            var10 = (255 & class78.field1060.field3786[var9][var7][var8]) * 8 << 2;
                        }
                        if (class25.field188 != null && class25.field188[var9] != null) {
                            int var11 = var5 - class25.field188[var9].method1685(var8, -12639, var7) - -var10;
                            if (~var11 < ~var6) {
                                var6 = var11;
                            }
                        }
                    }
                }
            }
            int var12 = (var6 >> 2) * 1536;
            if (var12 > 786432) {
                var12 = 786432;
            }
            if (var12 < 262144) {
                var12 = 262144;
            }
            if (class61.field653 < var12) {
                class61.field653 += (-class61.field653 + var12) / 24;
            } else if (~class61.field653 < ~var12) {
                class61.field653 += (-class61.field653 + var12) / 80;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lac;IIZ[[BI)V", line = 122)
    public class132(class541 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field1696 = arg2;
        super.field2851.method3006(1, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field2860, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lac;IIZ[[I)V", line = 142)
    public class132(class541 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field1696 = arg2;
        super.field2851.method3006(1, this);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class387.method2263(super.field2860, 53, super.field2851.field7636, var6 + 34069, arg2, 32993, arg2, arg4[var6]);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(34069 - -var7, 0, super.field2860, arg2, arg2, 0, 32993, super.field2851.field7636, arg4[var7], 0);
            }
        }
        this.method1258(-28003, true);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 173)
    public final void method832(byte arg0) {
        ++field1701;
        if (arg0 > -117) {
            this.field1702 = -45;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field1697, this.field1702, 3553, 0, 0);
        this.field1697 = -1;
        this.field1702 = -1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILeda;)[I", line = 188)
    public static final int[] method833(int arg0, class103 arg1) {
        ++field1703;
        class611 var2 = new class611(518);
        if (arg0 != 12206) {
            method831(true);
        }
        int[] var3 = new int[4];
        for (int var4 = 0; ~var4 > -5; ++var4) {
            var3[var4] = (int) (9.9999999E7D * Math.random());
        }
        var2.method3393(10, 86);
        var2.method3384(1571862888, var3[0]);
        var2.method3384(1571862888, var3[1]);
        var2.method3384(arg0 ^ 1571854022, var3[2]);
        var2.method3384(1571862888, var3[3]);
        for (int var5 = 0; ~var5 > -11; ++var5) {
            var2.method3384(1571862888, (int) (9.9999999E7D * Math.random()));
        }
        var2.method3423((int) (Math.random() * 9.9999999E7D), arg0 ^ 1571854022);
        var2.method3404(class270.field3566, true, class342.field4597);
        arg1.field1379.method3416(var2.field8529, var2.field8520, arg0 + -12207, 0);
        return var3;
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(Z)V", line = 225)
    public static void method834(boolean arg0) {
        if (arg0) {
            method833(103, (class103) null);
        }
        field1700 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIB)V", line = 235)
    public final void method835(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg1, arg2, super.field2859, arg0);
        int var6 = -27 / ((-41 - arg4) / 34);
        ++field1698;
        this.field1702 = arg1;
        this.field1697 = arg3;
    }
}
