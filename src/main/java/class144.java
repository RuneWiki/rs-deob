import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class144 {

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field1849 = 1409;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field1848++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLib;)V", line = 15)
    public static final void method955(byte arg0, class723 arg1) {
        if (arg0 != 82) {
            method956(null, 109, null, 70, 37);
        }
        field1850++;
        class571 var2 = (class571) class12.field74.method3669(false, (long) arg1.field9186);
        if (var2 == null) {
            class713.method4002(null, null, arg1.field9219[0], arg1.field9214[0], arg1, 0, arg1.field3467, false);
        } else {
            var2.method3357(arg0 ^ 0xB64EFF9B);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "([SI[Ljava/lang/String;II)V", line = 37)
    public static final void method956(short[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
        field1846++;
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method956(arg0, 2, arg2, var6 - 1, arg4);
            method956(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg1 != 2) {
            field1849 = -100;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Llp;BZ)V", line = 91)
    public static final void method957(class82 arg0, byte arg1, boolean arg2) {
        if (arg1 >= -52) {
            return;
        }
        field1847++;
        class32.field307.method1904((byte) -124, arg0);
        if (arg2) {
            class240.method1619(class32.field307, class406.field5726, class269.field3901, arg0, class102.field1184, (byte) -111);
        }
    }
}
