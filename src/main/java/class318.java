import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class318 {

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field4652 = -1;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field4653 = -1;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lps;")
    public static class394 field4648;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
    public int[] field4651;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLnj;I)V", line = 6)
    public final void method2142(boolean arg0, class228 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1348(-89);
            if (var4 == 0) {
                field4657++;
                if (arg0) {
                    field4655 = -100;
                    return;
                }
                return;
            }
            this.method2143(0, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILnj;I)V", line = 29)
    private final void method2143(int arg0, int arg1, class228 arg2, int arg3) {
        field4654++;
        if (arg0 != 0) {
            method2146(-127, -90);
        }
        if (arg3 == 1) {
            this.field4653 = arg2.method1343(arg0 ^ 0xFF);
        } else if (arg3 == 2) {
            this.field4651 = new int[arg2.method1348(arg0 ^ 0xFFFFFFA3)];
            for (int var5 = 0; var5 < this.field4651.length; var5++) {
                this.field4651[var5] = arg2.method1343(255);
            }
        } else if (arg3 == 3) {
            this.field4652 = arg2.method1348(-89);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBIIII)V", line = 62)
    public static final void method2144(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4650++;
        int var6 = arg4 - arg2;
        int var7 = arg5 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class83.method595(112, arg3, arg2, arg0, arg4);
            }
        } else if (var6 == 0) {
            class201.method1190(arg3, arg0, arg2, arg5, arg1 ^ 0x7FAC);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg5;
                arg0 = arg2;
                arg5 = arg4;
                arg2 = var9;
                arg4 = var10;
            }
            if (arg5 < arg0) {
                int var11 = arg0;
                int var12 = arg2;
                arg0 = arg5;
                arg5 = var11;
                arg2 = arg4;
                arg4 = var12;
            }
            int var13 = arg2;
            int var14 = arg5 - arg0;
            int var15 = arg4 - arg2;
            if (arg1 != 83) {
                method2146(-71, 77);
            }
            int var16 = -(var14 >> 1);
            int var17 = arg2 < arg4 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg0; var19 <= arg5; var19++) {
                    class384.field5560[var19][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg5; var18++) {
                    class384.field5560[var13][var18] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 187)
    public static void method2145(int arg0) {
        field4648 = null;
        if (arg0 != 3) {
            field4649 = -121;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 213)
    public static final void method2146(int arg0, int arg1) {
        field4656++;
        class189 var2 = class211.field2822;
        synchronized (class211.field2822) {
            class211.field2822.method1142((byte) -98, arg1);
            if (arg0 > -44) {
                field4649 = -92;
            }
        }
        class189 var3 = class143.field1939;
        synchronized (class143.field1939) {
            class143.field1939.method1142((byte) -58, arg1);
        }
    }
}
