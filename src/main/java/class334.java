import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class334 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field5318 = new int[5];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Lmi;")
    public static class300[] field5319 = new class300[14];

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public static int[] field5322 = new int[2500];

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field5326 = 0;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5328 = "Opened title screen";

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "J")
    public static long field5325;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lek;")
    public static class206 field5321;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ll;")
    public static class328 field5324;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 3)
    public static final void method2355(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class224.field3701 * 128) {
            arg0 = class224.field3701 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class280.field4578 * 128) {
            arg2 = class280.field4578 * 128 - 1;
        }
        class16.field474 = class305.field4959[arg3];
        class86.field1496 = class305.field4957[arg3];
        class91.field1614 = class305.field4959[arg4];
        class340.field5379 = class305.field4957[arg4];
        class1.field3 = arg0;
        class267.field4370 = arg1;
        class105.field1915 = arg2;
        class107.field1943 = arg0 / 128;
        class274.field4465 = arg2 / 128;
        class266.field4341 = class107.field1943 - class111.field2035;
        if (class266.field4341 < 0) {
            class266.field4341 = 0;
        }
        class26.field673 = class274.field4465 - class111.field2035;
        if (class26.field673 < 0) {
            class26.field673 = 0;
        }
        class129.field2247 = class111.field2035 + class107.field1943;
        if (class129.field2247 > class224.field3701) {
            class129.field2247 = class224.field3701;
        }
        class251.field4121 = class274.field4465 + class111.field2035;
        if (class251.field4121 > class280.field4578) {
            class251.field4121 = class280.field4578;
        }
        short var15;
        if (class241.field4016) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class111.field2035 + class111.field2035 + 2; var16++) {
            for (int var17 = 0; var17 < class111.field2035 + class111.field2035 + 2; var17++) {
                int var18 = (var16 - class111.field2035 << 7) - (class1.field3 & 0x7F);
                int var19 = (var17 - class111.field2035 << 7) - (class105.field1915 & 0x7F);
                int var20 = class107.field1943 + var16 - class111.field2035;
                int var21 = class274.field4465 + var17 - class111.field2035;
                if (var20 >= 0 && var21 >= 0 && var20 < class224.field3701 && var21 < class280.field4578) {
                    int var22;
                    if (class55.field1085 == null) {
                        var22 = class123.field2166[0][var20][var21] + 128 - class267.field4370;
                    } else {
                        var22 = class55.field1085[0][var20][var21] + 128 - class267.field4370;
                    }
                    int var23 = class123.field2166[3][var20][var21] - class267.field4370 - 1000;
                    class284.field4647[var16][var17] = class191.method1320(var18, var23, var22, var19, var15);
                } else {
                    class284.field4647[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class111.field2035 + class111.field2035 + 1; var24++) {
            for (int var25 = 0; var25 < class111.field2035 + class111.field2035 + 1; var25++) {
                class200.field3358[var24][var25] = class284.field4647[var24][var25] || class284.field4647[var24 + 1][var25] || class284.field4647[var24][var25 + 1] || class284.field4647[var24 + 1][var25 + 1];
            }
        }
        class12.field371 = arg6;
        class172.field2862 = arg7;
        class339.field5374 = arg8;
        class130.field2252 = arg9;
        class50.field1032 = arg10;
        class131.method930();
        if (class253.field4154 != null) {
            class51.method450(true);
            class213.method1468(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class241.field4016) {
                class269.field4384 = false;
                class109.method815(-118, 0, 0);
                class259.method1818((float[]) null);
                class2.method29();
            }
            class51.method450(false);
        }
        class213.method1468(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 131)
    public static void method2356(boolean arg0) {
        field5318 = null;
        field5319 = null;
        if (!arg0) {
            field5321 = (class206) null;
        }
        field5322 = null;
        field5321 = null;
        field5324 = null;
        field5328 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z[S)[S", line = 167)
    public static final short[] method2357(boolean arg0, short[] arg1) {
        field5320++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            return (short[]) null;
        } else {
            short[] var2 = new short[arg1.length];
            class89.method690(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
