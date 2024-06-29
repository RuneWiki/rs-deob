import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class7 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[I")
    public static int[] field70 = new int[25];

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lbe;")
    public static class283 field72 = class153.method941(127, "Fps:");

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Ltf;")
    public static class242 field73 = new class242(64);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Lbe;")
    public static class283 field76 = class153.method941(125, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static volatile int field78 = 0;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Z")
    public static boolean field81 = true;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "B")
    public static byte field80;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 6)
    public static final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class246.field4176 * 128) {
            arg0 = class246.field4176 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class76.field1325 * 128) {
            arg2 = class76.field1325 * 128 - 1;
        }
        class256.field4317 = class139.field2309[arg3];
        class306.field5255 = class139.field2316[arg3];
        class137.field2283 = class139.field2309[arg4];
        class197.field3361 = class139.field2316[arg4];
        class231.field3926 = arg0;
        class232.field3930 = arg1;
        class160.field2635 = arg2;
        class61.field844 = arg0 / 128;
        class125.field2078 = arg2 / 128;
        class90.field1518 = class61.field844 - class241.field4064;
        if (class90.field1518 < 0) {
            class90.field1518 = 0;
        }
        class124.field2062 = class125.field2078 - class241.field4064;
        if (class124.field2062 < 0) {
            class124.field2062 = 0;
        }
        class309.field5288 = class61.field844 + class241.field4064;
        if (class309.field5288 > class246.field4176) {
            class309.field5288 = class246.field4176;
        }
        class88.field1482 = class241.field4064 + class125.field2078;
        if (class88.field1482 > class76.field1325) {
            class88.field1482 = class76.field1325;
        }
        short var15 = 3584;
        for (int var16 = 0; var16 < class241.field4064 + class241.field4064 + 2; var16++) {
            for (int var17 = 0; var17 < class241.field4064 + class241.field4064 + 2; var17++) {
                int var18 = (var16 - class241.field4064 << 7) - (class231.field3926 & 0x7F);
                int var19 = (var17 - class241.field4064 << 7) - (class160.field2635 & 0x7F);
                int var20 = class61.field844 + var16 - class241.field4064;
                int var21 = class125.field2078 + var17 - class241.field4064;
                if (var20 >= 0 && var21 >= 0 && var20 < class246.field4176 && var21 < class76.field1325) {
                    int var22;
                    if (class228.field3834 == null) {
                        var22 = class1.field12[0][var20][var21] + 128 - class232.field3930;
                    } else {
                        var22 = class228.field3834[0][var20][var21] + 128 - class232.field3930;
                    }
                    int var23 = class1.field12[3][var20][var21] - class232.field3930 - 1000;
                    class86.field1449[var16][var17] = class279.method1860(var18, var23, var22, var19, var15);
                } else {
                    class86.field1449[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class241.field4064 + class241.field4064 + 1; var24++) {
            for (int var25 = 0; var25 < class241.field4064 + class241.field4064 + 1; var25++) {
                class217.field3675[var24][var25] = class86.field1449[var24][var25] || class86.field1449[var24 + 1][var25] || class86.field1449[var24][var25 + 1] || class86.field1449[var24 + 1][var25 + 1];
            }
        }
        class259.field4403 = arg6;
        class10.field89 = arg7;
        class61.field847 = arg8;
        class302.field5113 = arg9;
        class67.field948 = arg10;
        class134.method831();
        if (class162.field2661 != null) {
            class75.method498(true);
            class260.method1761(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class1.field7 = false;
            class284.method1954(0, (byte) -77, 0);
            class59.method388((float[]) null);
            class17.method101();
            class75.method498(false);
        }
        class260.method1761(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 133)
    public static final void method42(int arg0, int arg1) {
        if (arg1 < 107) {
            field81 = true;
        }
        field67++;
        class231.field3922.method1637(true, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lgf;IIIZ)V", line = 145)
    public void method43(class7 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field77++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBII)V", line = 153)
    public void method44(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field71++;
        if (arg2 != 31) {
            field72 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 172)
    public static void method45(byte arg0) {
        field70 = null;
        field76 = null;
        field72 = null;
        if (arg0 == -118) {
            field73 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Lgf;", line = 185)
    public class7 method46(int arg0, int arg1, int arg2) {
        field69++;
        return this;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lde;", line = 194)
    public static final class58 method47(int arg0, int arg1) {
        field66++;
        class58 var2 = (class58) class34.field502.method1629(126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class190.field3253.method1107(16, arg0, 126);
        class58 var4 = new class58();
        if (var3 != null) {
            var4.method380(new class229(var3), true);
        }
        if (arg1 >= -110) {
            return (class58) null;
        } else {
            class34.field502.method1630(true, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()Z", line = 223)
    public boolean method48() {
        field68++;
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()I")
    public abstract int method40();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
