import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([JIII[I)V", line = 5)
    public static final void method596(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 != 19013) {
            return;
        }
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            for (int var10 = arg2; var10 < arg1; var10++) {
                if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method596(arg0, var6 - 1, arg2, 19013, arg4);
            method596(arg0, arg1, var6 + 1, arg3 ^ 0x0, arg4);
        }
        field1046++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 70)
    public static final void method597(byte arg0) {
        if (arg0 < 57) {
            field1045 = -65;
        }
        class307.field4788.method1428(10935);
        field1038++;
        class106.field1623.method1428(10935);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 90)
    public static final void method598(byte arg0) {
        int var1 = -8 / ((-arg0 - 67) / 52);
        field1040++;
        class22.field237.method1428(10935);
        class266.field3983.method1428(10935);
        class79.field1107.method1428(10935);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIIII)V", line = 101)
    public static final void method599(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class327.field5072 = arg2;
        class298.field4667 = arg4;
        field1042++;
        class34.field432 = arg3;
        if (!arg0) {
            class75.field1064 = arg1;
        }
    }
}
