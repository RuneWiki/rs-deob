import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class23 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lnf;")
    public static class251 field349 = new class251();

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 4)
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class311.field4734 * 128) {
            arg0 = class311.field4734 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class191.field2844 * 128) {
            arg2 = class191.field2844 * 128 - 1;
        }
        class26.field366 = class148.field2239[arg3];
        class113.field1748 = class148.field2229[arg3];
        class28.field382 = class148.field2239[arg4];
        class184.field2756 = class148.field2229[arg4];
        class44.field556 = arg0;
        class257.field3885 = arg1;
        class316.field4773 = arg2;
        class271.field4153 = arg0 / 128;
        class147.field2214 = arg2 / 128;
        class183.field2741 = class271.field4153 - class90.field1339;
        if (class183.field2741 < 0) {
            class183.field2741 = 0;
        }
        class212.field3223 = class147.field2214 - class90.field1339;
        if (class212.field3223 < 0) {
            class212.field3223 = 0;
        }
        class327.field4917 = class90.field1339 + class271.field4153;
        if (class327.field4917 > class311.field4734) {
            class327.field4917 = class311.field4734;
        }
        class76.field993 = class90.field1339 + class147.field2214;
        if (class76.field993 > class191.field2844) {
            class76.field993 = class191.field2844;
        }
        short var15;
        if (class117.field1817) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class90.field1339 + class90.field1339 + 2; var16++) {
            for (int var17 = 0; var17 < class90.field1339 + class90.field1339 + 2; var17++) {
                int var18 = (var16 - class90.field1339 << 7) - (class44.field556 & 0x7F);
                int var19 = (var17 - class90.field1339 << 7) - (class316.field4773 & 0x7F);
                int var20 = class271.field4153 + var16 - class90.field1339;
                int var21 = class147.field2214 + var17 - class90.field1339;
                if (var20 >= 0 && var21 >= 0 && var20 < class311.field4734 && var21 < class191.field2844) {
                    int var22;
                    if (class318.field4797 == null) {
                        var22 = class55.field690[0][var20][var21] + 128 - class257.field3885;
                    } else {
                        var22 = class318.field4797[0][var20][var21] + 128 - class257.field3885;
                    }
                    int var23 = class55.field690[3][var20][var21] - class257.field3885 - 1000;
                    class94.field1419[var16][var17] = class78.method528(var18, var23, var22, var19, var15);
                } else {
                    class94.field1419[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class90.field1339 + class90.field1339 + 1; var24++) {
            for (int var25 = 0; var25 < class90.field1339 + class90.field1339 + 1; var25++) {
                class293.field4487[var24][var25] = class94.field1419[var24][var25] || class94.field1419[var24 + 1][var25] || class94.field1419[var24][var25 + 1] || class94.field1419[var24 + 1][var25 + 1];
            }
        }
        class256.field3879 = arg6;
        class167.field2512 = arg7;
        class84.field1250 = arg8;
        class326.field4909 = arg9;
        class7.field37 = arg10;
        class252.method1703();
        if (class38.field460 != null) {
            class152.method1092(true);
            class169.method1184(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class117.field1817) {
                class225.field3424 = false;
                class204.method1397(-104, 0, 0);
                class280.method1954((float[]) null);
                class31.method211();
            }
            class152.method1092(false);
        }
        class169.method1184(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 133)
    public static void method158(int arg0) {
        if (arg0 != -23265) {
            method160(57, 3);
        }
        field349 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)V", line = 148)
    public static final void method159(byte arg0, int arg1) {
        class169 var2 = class101.method712(arg1, 5, 2089666400);
        field348++;
        var2.method1178((byte) 107);
        if (arg0 != 127) {
            method159((byte) 27, 68);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I", line = 159)
    public static final int method160(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
