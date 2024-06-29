import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class331 extends class128 {

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field5058 = -1;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field5061 = 0;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field5060 = 1;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lbk;")
    public static class69 field5057 = new class69(0, 0);

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field5064 = 0;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "Lub;")
    public static class23 field5062;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 6)
    public static void method2281(byte arg0) {
        field5062 = null;
        field5057 = null;
        if (arg0 < 73) {
            method2281((byte) 125);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 16)
    public class331() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(BI)[I", line = 21)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 <= 100) {
            method2282(95, 70, -11, 95, -17, -61, 124, 67, (class47) null, 27, false, -18L);
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[][] var4 = this.method855(-3102, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class10.field141; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        field5059++;
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIILen;IZJ)Z", line = 66)
    public static final boolean method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class47 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class99.field1291 == class167.field2324;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class62.field788 || var16 >= class326.field4993) {
                    return false;
                }
                class225 var17 = class158.field2184[arg0][var15][var16];
                if (var17 != null && var17.field3214 >= 5) {
                    return false;
                }
            }
        }
        class80 var18 = new class80();
        var18.field1026 = arg11;
        var18.field1025 = arg0;
        var18.field1030 = arg5;
        var18.field1032 = arg6;
        var18.field1033 = arg7;
        var18.field1024 = arg8;
        var18.field1016 = arg9;
        var18.field1015 = arg1;
        var18.field1027 = arg2;
        var18.field1035 = arg1 + arg3 - 1;
        var18.field1028 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class158.field2184[var22][var19][var20] == null) {
                        class158.field2184[var22][var19][var20] = new class225(var22, var19, var20);
                    }
                }
                class225 var23 = class158.field2184[arg0][var19][var20];
                var23.field3199[var23.field3214] = var18;
                var23.field3201[var23.field3214] = var21;
                var23.field3217 |= var21;
                var23.field3214++;
                if (var13 && class312.field4826[var19][var20] != 0) {
                    var14 = class312.field4826[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class312.field4826[var24][var25] == 0) {
                        class312.field4826[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class176.field2563[class318.field4894++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 186)
    public static final void method2283(int arg0) {
        if (arg0 != 0) {
            field5061 = -76;
        }
        field5063++;
        if (class147.field2042) {
            return;
        }
        class147.field2042 = true;
        class90.field1125 = true;
        if (class258.field3925) {
            class280.field4344 = (float) ((int) class280.field4344 - 65 & 0xFFFFFF80);
        } else {
            class272.field4271 += (-class272.field4271 - 24.0F) / 2.0F;
        }
    }
}
