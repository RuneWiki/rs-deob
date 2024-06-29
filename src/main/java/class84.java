import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class84 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lil;")
    public class104 field1164;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
    public int[] field1162;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)C", line = 5)
    public static final char method686(char arg0, byte arg1) {
        field1161++;
        if (arg1 != 41) {
            method690(6);
        }
        return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lie;I)Ljava/lang/String;", line = 20)
    public static final String method687(class138 arg0, int arg1) {
        field1157++;
        if (arg1 != -1) {
            method690(74);
        }
        return arg0.field1785 == null || arg0.field1785.length() <= 0 ? arg0.field1778 : arg0.field1778 + class74.field1041 + arg0.field1785;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZILtj;)V", line = 35)
    public static final void method688(int arg0, boolean arg1, int arg2, class298 arg3) {
        class144.field1829 = new class238[arg0][arg2];
        class117.field1529 = arg3;
        field1160++;
        if (class210.field2848 != null) {
            class232.field3224 = class365.method2413(class210.field2848[5], 0, class210.field2848[0], class210.field2848[3], class210.field2848[2], class210.field2848[4], class210.field2848[1]);
        }
        class165.field2241 = new class238();
        class21.method195(arg1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIBIIIII)V", line = 49)
    public static final void method689(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1165++;
        if (arg3 >= -125) {
            return;
        }
        if (class338.method2195(arg0, 6173)) {
            class377.method2462(arg8, arg4, arg5, class4.field71[arg0], arg2, -1, arg6, arg1, arg7, 1);
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class33.field536[var9] = true;
            }
        } else {
            class33.field536[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 80)
    public static final void method690(int arg0) {
        field1163++;
        if (arg0 < 93) {
            return;
        }
        try {
            if (class217.field3024 == 1) {
                int var1 = class78.field1095.method155((byte) 127);
                if (var1 > 0 && class78.field1095.method166(-86)) {
                    int var2 = var1 - class223.field3074;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class78.field1095.method147(-20849, var2);
                } else {
                    class78.field1095.method177((byte) -111);
                    class78.field1095.method171(-12399);
                    class431.field6270 = null;
                    if (class264.field3890 == null) {
                        class217.field3024 = 0;
                    } else {
                        class217.field3024 = 2;
                    }
                    class452.field6556 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class78.field1095.method177((byte) -92);
            class431.field6270 = null;
            class217.field3024 = 0;
            class452.field6556 = null;
            class264.field3890 = null;
        }
    }
}
