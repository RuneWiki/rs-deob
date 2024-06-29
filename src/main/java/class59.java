import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class59 extends class11 {

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field800 = 50;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Ljava/lang/String;")
    public static String field804 = "slide:";

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Ljava/lang/String;")
    public static String field805 = "cyan:";

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "B")
    public byte field802;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lcg;")
    public class316 field798;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V", line = 14)
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class324[] var7 = class294.field4367;
        if (arg1 != -1) {
            method403(-81, 12, -32, 39, 79, -37, -81);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class324 var9 = var7[var8];
            if (var9 != null && var9.field4910 == 2) {
                class232.method1604(arg6, var9.field4921 * 2, arg3 >> 1, (var9.field4923 - class296.field4394 << 7) + var9.field4922, (-class132.field1809 + var9.field4914 << 7) - -var9.field4916, arg5 >> 1, (byte) -93, arg2);
                if (class208.field3001 > -1 && class329.field4966 % 20 < 10) {
                    class286.field4252[var9.field4915].method840(class208.field3001 + arg4 - 12, class330.field4982 + arg0 + -28);
                }
            }
        }
        field806++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZI)V", line = 44)
    public static final void method404(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field795++;
        int var5 = 0;
        int var6 = arg1;
        if (arg3) {
            field800 = 59;
        }
        int var7 = -1;
        int var8 = -arg1;
        int var9 = class185.method1299(arg1 + arg2, (byte) 124, class259.field3813, class206.field2952);
        int var10 = class185.method1299(arg2 - arg1, (byte) 117, class259.field3813, class206.field2952);
        class190.method1329(class126.field1723[arg0], var9, arg4, (byte) -76, var10);
        while (var5 < var6) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var6--;
                int var11 = arg0 - var6;
                var8 -= var6 << 1;
                int var12 = arg0 + var6;
                if (class101.field1397 <= var12 && class44.field536 >= var11) {
                    int var13 = class185.method1299(arg2 + var5, (byte) 113, class259.field3813, class206.field2952);
                    int var14 = class185.method1299(arg2 - var5, (byte) 126, class259.field3813, class206.field2952);
                    if (class44.field536 >= var12) {
                        class190.method1329(class126.field1723[var12], var13, arg4, (byte) -82, var14);
                    }
                    if (var11 >= class101.field1397) {
                        class190.method1329(class126.field1723[var11], var13, arg4, (byte) -128, var14);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class101.field1397 && var15 <= class44.field536) {
                int var17 = class185.method1299(arg2 + var6, (byte) 119, class259.field3813, class206.field2952);
                int var18 = class185.method1299(arg2 - var6, (byte) 117, class259.field3813, class206.field2952);
                if (var16 <= class44.field536) {
                    class190.method1329(class126.field1723[var16], var17, arg4, (byte) -115, var18);
                }
                if (class101.field1397 <= var15) {
                    class190.method1329(class126.field1723[var15], var17, arg4, (byte) -120, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I", line = 126)
    public static final int method405(int arg0, int arg1) {
        if (arg1 < 95) {
            method404(70, 33, -105, true, 88);
        }
        field801++;
        if (class39.field442 != null) {
            class39.field442.method1577((byte) -104);
            class39.field442 = null;
        }
        class181.field2452++;
        if (class181.field2452 > 4) {
            class181.field2452 = 0;
            class318.field4860 = 0;
            return arg0;
        }
        if (class273.field4088 == class137.field1888) {
            class273.field4088 = class66.field873;
        } else {
            class273.field4088 = class137.field1888;
        }
        class318.field4860 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[S)[S", line = 162)
    public static final short[] method406(int arg0, short[] arg1) {
        field794++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class281.method1938(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)I", line = 176)
    public final int method64(byte arg0) {
        if (arg0 == -73) {
            field796++;
            return this.field798 == null ? 0 : this.field798.field4777 * 100 / (this.field798.field4798.length - this.field802);
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(B)V", line = 190)
    public static void method407(byte arg0) {
        if (arg0 == 10) {
            field805 = null;
            field804 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(B)[B", line = 207)
    public final byte[] method66(byte arg0) {
        field799++;
        if (arg0 != -115) {
            return (byte[]) null;
        } else if (this.field115 || (this.field798.field4798.length - this.field802) > this.field798.field4777) {
            throw new RuntimeException();
        } else {
            return this.field798.field4798;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 226)
    public static final void method408(boolean arg0) {
        class8.field84.method717((byte) 124);
        field797++;
        if (arg0) {
            method405(-113, 5);
        }
    }
}
