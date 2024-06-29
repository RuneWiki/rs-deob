import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class145 extends class83 {

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    private int field1864 = 585;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field1865 = new String[100];

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "Lum;")
    public static class184 field1866 = new class184();

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ep", name = "S", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ep", name = "T", descriptor = "Ldj;")
    public static class304 field1873;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(II)V", line = 3)
    public static final void method786(int arg0, int arg1) {
        ++field1869;
        if (arg0 != 2048) {
            method786(82, 124);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        throw new RuntimeException();
                    } else {
                        class176.method926(arg0 + -2048);
                    }
                } else {
                    class141.method767(24198);
                }
            } else {
                class159.method863(23910);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V", line = 39)
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V", line = 42)
    public static final void method787(int arg0) {
        class114 var1 = client.field3456;
        synchronized (client.field3456) {
            client.field3456.method613(true);
        }
        if (arg0 != -4) {
            field1873 = null;
        }
        ++field1867;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)V", line = 57)
    public static void method788(byte arg0) {
        field1865 = null;
        if (arg0 == 39) {
            field1866 = null;
            field1873 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBLtq;)V", line = 69)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field1872;
        int var4 = -123 % ((-27 - arg1) / 50);
        if (arg0 == 0) {
            this.field1864 = arg2.method1374(-2);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIII)V", line = 101)
    public static final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; ~arg5 <= ~var6; ++var6) {
            class296.method1740(arg0, class153.field1932[var6], (byte) 81, arg3, arg4);
        }
        if (arg2 < 61) {
            method788((byte) -103);
        }
        ++field1868;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)[I", line = 124)
    public final int[] method37(int arg0, int arg1) {
        ++field1871;
        if (arg0 != 2) {
            return null;
        } else {
            int[] var3 = super.field916.method1813(arg1, (byte) 121);
            if (super.field916.field4174) {
                int var4 = class225.field3036[arg1];
                for (int var5 = 0; class420.field6139 > var5; ++var5) {
                    int var6 = class402.field5863[var5];
                    if (~this.field1864 > ~var6 && ~var6 > ~(-this.field1864 + 4096) && ~(2048 - this.field1864) > ~var4 && var4 < this.field1864 + 2048) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field1864 + 2048);
                        var3[var5] = 4096 - var10;
                    } else if (-this.field1864 + 2048 < var6 && var6 < this.field1864 + 2048) {
                        int var11 = var4 - 2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field1864;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field1864);
                    } else if (~var4 <= ~this.field1864 && ~(-this.field1864 + 4096) <= ~var4) {
                        if (~var6 <= ~this.field1864 && -this.field1864 + 4096 >= var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = 2048 - var4;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field1864 + 2048);
                            var3[var5] = 4096 - var18;
                        }
                    } else {
                        int var19 = var6 - 2048;
                        int var20 = ~var19 <= -1 ? var19 : -var19;
                        int var21 = var20 - this.field1864;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field1864);
                    }
                }
            }
            return var3;
        }
    }
}
