import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class472 extends class31 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[I")
    public int[] field6866;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
    public int[] field6865;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6868 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Z")
    public static boolean field6873 = true;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "[[Ltf;")
    public static class198[][] field6869;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 7)
    public static void method2796(int arg0) {
        if (arg0 <= 26) {
            method2799(null, -61, (byte) -85, -54, false);
        }
        field6869 = null;
        field6868 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILwn;)Ljava/lang/String;", line = 22)
    public static final String method2797(int arg0, class519 arg1) {
        if (arg0 != 32767) {
            method2796(47);
        }
        field6872++;
        return class110.method791(23481, arg1, 32767);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIII)V", line = 33)
    public static final void method2798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6864++;
        if (class175.method1224(arg3, 7607)) {
            if (arg0 != 4) {
                method2796(-29);
            }
            if (field6869[arg3] == null) {
                class525.method3111(arg5, arg4, 0, arg7, class283.field4217[arg3], arg2, -1, arg6, arg8, arg1);
            } else {
                class525.method3111(arg5, arg4, arg0 ^ 0x4, arg7, field6869[arg3], arg2, -1, arg6, arg8, arg1);
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class25.field361[var9] = true;
            }
        } else {
            class25.field361[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II[I[I)V", line = 65)
    public class472(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6866 = arg2;
        this.field6865 = arg3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ltf;IBIZ)V", line = 79)
    public static final void method2799(class198 arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field6867++;
        int var5 = arg0.field3008;
        if (arg0.field2917 == 0) {
            arg0.field3008 = arg0.field2983;
        } else if (arg0.field2917 == 1) {
            arg0.field3008 = arg3 - arg0.field2983;
        } else if (arg0.field2917 == 2) {
            arg0.field3008 = arg0.field2983 * arg3 >> 14;
        }
        int var6 = arg0.field2988;
        if (arg0.field3025 == 0) {
            arg0.field2988 = arg0.field2922;
        } else if (arg0.field3025 == 1) {
            arg0.field2988 = arg1 - arg0.field2922;
        } else if (arg0.field3025 == 2) {
            arg0.field2988 = arg0.field2922 * arg1 >> 14;
        }
        if (arg0.field2917 == 4) {
            arg0.field3008 = arg0.field3046 * arg0.field2988 / arg0.field2973;
        }
        if (arg0.field3025 == 4) {
            arg0.field2988 = arg0.field3008 * arg0.field2973 / arg0.field3046;
        }
        if (class65.field1107 && (client.method1395(arg0).field4366 != 0 || arg0.field2941 == 0)) {
            if (arg0.field2988 < 5 && arg0.field3008 < 5) {
                arg0.field3008 = 5;
                arg0.field2988 = 5;
            } else {
                if (arg0.field2988 <= 0) {
                    arg0.field2988 = 5;
                }
                if (arg0.field3008 <= 0) {
                    arg0.field3008 = 5;
                }
            }
        }
        if (class213.field3224 == arg0.field2966) {
            class496.field7174 = arg0;
        }
        if (arg4 && arg0.field2951 != null && (arg0.field3008 != var5 || arg0.field2988 != var6)) {
            class361 var7 = new class361();
            var7.field5256 = arg0.field2951;
            var7.field5252 = arg0;
            class287.field4256.method866((byte) 10, var7);
        }
        if (arg2 <= 125) {
            field6873 = false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)V", line = 165)
    public static final void method2800(int arg0, byte arg1) {
        field6870++;
        if (arg1 != -76) {
            field6869 = null;
        }
        for (class42 var2 = class363.field5276.method2285(39); var2 != null; var2 = class363.field5276.method2283((byte) 11)) {
            if ((var2.field863 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method421(arg1 ^ 0xFFFFA983);
            }
        }
    }
}
