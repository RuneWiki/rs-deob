import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class155 {

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "[B")
    public static byte[] field2173 = new byte[2048];

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1040(int arg0) {
        class650.field8937 = class89.field1072.method3750((byte) 35);
        field2174++;
        boolean var1 = class89.field1072.method3710(arg0 - 6093) == 1;
        int var2 = class89.field1072.method3744(true);
        int var3 = class89.field1072.method3757((byte) -65);
        int var4 = class89.field1072.method3736(true);
        class513.method3024(arg0 - 146);
        class262.method1717(var4, false);
        class89.field1072.method3831(7);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class336.field4683 >> 3; var20++) {
                for (int var21 = 0; var21 < class700.field9768 >> 3; var21++) {
                    int var22 = class89.field1072.method3821(1, (byte) 108);
                    if (var22 == 1) {
                        class745.field10350[var5][var20][var21] = class89.field1072.method3821(26, (byte) 108);
                    } else {
                        class745.field10350[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class89.field1072.method3827((byte) 127);
        int var6 = (class398.field5617 - class89.field1072.field9146) / 16;
        class268.field3822 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class268.field3822[var7][var19] = class89.field1072.method3703(126);
            }
        }
        class636.field8763 = new byte[var6][];
        class46.field546 = new int[var6];
        class499.field7164 = new byte[var6][];
        class376.field5273 = null;
        class179.field2396 = null;
        class500.field7181 = new byte[var6][];
        class61.field753 = new int[var6];
        class539.field7560 = new int[var6];
        class401.field5698 = new int[var6];
        class207.field2720 = new int[var6];
        class604.field8481 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class336.field4683 >> 3); var10++) {
                for (int var11 = 0; var11 < class700.field9768 >> 3; var11++) {
                    int var12 = class745.field10350[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFA) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class207.field2720[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class207.field2720[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class539.field7560[var8] = class299.field4218.method2090(arg0 + 89, "m" + var17 + "_" + var18);
                            class46.field546[var8] = class299.field4218.method2090(113, "l" + var17 + "_" + var18);
                            class401.field5698[var8] = class299.field4218.method2090(class286.method1875(arg0, -28), "um" + var17 + "_" + var18);
                            class61.field753[var8] = class299.field4218.method2090(-116, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class657.method3610(11, var1, var3, var2, false);
        if (arg0 != 26) {
            field2166 = -75;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V", line = 158)
    public static void method1041(boolean arg0) {
        field2173 = null;
        if (!arg0) {
            method1042(-114, 90, 43);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V", line = 168)
    public static final void method1042(int arg0, int arg1, int arg2) {
        if (arg0 != 11) {
            field2173 = null;
        }
        field2171++;
        class592 var3 = class682.method3825(-652872096, 5, arg2);
        var3.method3351(0);
        var3.field8337 = arg1;
    }

    @OriginalMember(owner = "client!kt", name = "toString", descriptor = "()Ljava/lang/String;", line = 192)
    public final String toString() {
        field2168++;
        throw new IllegalStateException();
    }
}
