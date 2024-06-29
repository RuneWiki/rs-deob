import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class332 extends class424 {

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    private int field4486 = 585;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "F")
    public static float field4483 = 0.0F;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "[C")
    public static char[] field4487 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Lbc;")
    public static class285 field4479;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
    public static int[] field4478;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Lqg;", line = 12)
    public static final class157 method2010(int arg0) {
        if (arg0 != -22108) {
            field4478 = null;
        }
        ++field4485;
        if (class333.field4500 != null && class398.field5506 != null) {
            class398.field5506.method2567(true, class333.field4500);
            class157 var1 = (class157) class398.field5506.method2572(95);
            if (var1 == null) {
                return null;
            } else {
                class430 var2 = class204.method1389(var1.field2229, 86);
                return var2 != null && var2.field5993 && var2.method2650((byte) 40) ? var1 : class82.method661(2);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 45)
    public static final void method2011(int arg0) {
        class300.method1825(class294.field3962, -1);
        ++field4482;
        int var1 = (class63.field874 >> 10) + (class6.field65 >> 3);
        int var2 = (class375.field5213 >> 10) + (class371.field5148 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class147.field2129 = new int[var6];
        class446.field6256 = new byte[var6][];
        class140.field2048 = new int[var6];
        class122.field1833 = new int[var6][4];
        class134.field2008 = new byte[var6][];
        class415.field5756 = new int[var6];
        class15.field209 = new int[var6];
        class115.field1750 = new byte[var6][];
        class66.field923 = new int[var6];
        class143.field2083 = new byte[var6][];
        class171.field2413 = new int[var6];
        class204.field2902 = new byte[var6][];
        int var7 = 0;
        if (arg0 >= -4) {
            method2012((byte) -96);
        }
        for (int var8 = (-(class11.field107 >> 4) + var1) / 8; (var1 - -(class11.field107 >> 4)) / 8 >= var8; ++var8) {
            for (int var10 = (var2 - (class264.field3620 >> 4)) / 8; ~(((class264.field3620 >> 4) + var2) / 8) <= ~var10; ++var10) {
                int var11 = (var8 << 8) + var10;
                class171.field2413[var7] = var11;
                class15.field209[var7] = class314.field4254.method1909(-1, "m" + var8 + "_" + var10);
                class415.field5756[var7] = class314.field4254.method1909(-1, "l" + var8 + "_" + var10);
                class147.field2129[var7] = class314.field4254.method1909(-1, "n" + var8 + "_" + var10);
                class140.field2048[var7] = class314.field4254.method1909(-1, "um" + var8 + "_" + var10);
                class66.field923[var7] = class314.field4254.method1909(-1, "ul" + var8 + "_" + var10);
                if (~class147.field2129[var7] == 0) {
                    class15.field209[var7] = -1;
                    class415.field5756[var7] = -1;
                    class140.field2048[var7] = -1;
                    class66.field923[var7] = -1;
                }
                ++var7;
            }
        }
        for (int var9 = var7; ~var9 > ~class147.field2129.length; ++var9) {
            class147.field2129[var9] = -1;
            class15.field209[var9] = -1;
            class415.field5756[var9] = -1;
            class140.field2048[var9] = -1;
            class66.field923[var9] = -1;
        }
        class90.method716(var3, var4, false, true, var2, -119, var1, var5);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 130)
    public class332() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V", line = 133)
    public static void method2012(byte arg0) {
        field4479 = null;
        field4487 = null;
        if (arg0 <= 108) {
            field4487 = null;
        }
        field4478 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[I", line = 145)
    public final int[] method43(int arg0, byte arg1) {
        ++field4484;
        int[] var3 = super.field5892.method783(arg0, (byte) -81);
        if (arg1 != -10) {
            this.method43(-45, (byte) 112);
        }
        if (super.field5892.field1427) {
            int var4 = class409.field5711[arg0];
            for (int var5 = 0; ~var5 > ~class303.field4135; ++var5) {
                int var6 = field4478[var5];
                if (~this.field4486 > ~var6 && ~(-this.field4486 + 4096) < ~var6 && -this.field4486 + 2048 < var4 && this.field4486 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4486 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field4486 + 2048) > ~var6 && ~(2048 - -this.field4486) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field4486;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4486 + 2048);
                } else if (~this.field4486 >= ~var4 && var4 <= 4096 - this.field4486) {
                    if (var6 >= this.field4486 && ~var6 >= ~(-this.field4486 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4486 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field4486;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4486 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lrg;BI)V", line = 233)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field4481;
        if (~arg2 == -1) {
            this.field4486 = arg0.method2297(arg1 ^ -13320);
        }
        if (arg1 != -48) {
            this.method19((class366) null, (byte) 101, 99);
        }
    }
}
