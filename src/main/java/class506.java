import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class506 extends class13 {

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
    public static int field7041 = 0;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "[F")
    public static float[] field7040 = new float[4];

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "[[Z")
    public static boolean[][] field7044 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "Leq;")
    private class213 field7043;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)V", line = 10)
    public static void method2970(byte arg0) {
        if (arg0 > 39) {
            field7040 = null;
            field7044 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIB)I", line = 24)
    public final int method2971(int arg0, int arg1, byte arg2) {
        field7039++;
        if (this.field7043 == null) {
            return arg1;
        }
        class113 var4 = (class113) this.field7043.method1465((long) arg0, -6008);
        if (arg2 < 91) {
            return 72;
        } else if (var4 == null) {
            return arg1;
        } else {
            return var4.field1945;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILcea;B)V", line = 50)
    private final void method2972(int arg0, class215 arg1, byte arg2) {
        if (arg2 != -86) {
            return;
        }
        field7038++;
        if (arg0 != 249) {
            return;
        }
        int var4 = arg1.method1535(255);
        if (this.field7043 == null) {
            int var5 = class529.method3059(var4, (byte) 108);
            this.field7043 = new class213(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method1535(arg2 + 341) == 1;
            int var8 = arg1.method1499(-1);
            class362 var9;
            if (var7) {
                var9 = new class568(arg1.method1525((byte) -39));
            } else {
                var9 = new class113(arg1.method1533((byte) -126));
            }
            this.field7043.method1468((byte) 29, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lcea;B)V", line = 95)
    public final void method2973(class215 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                field7046++;
                if (arg1 >= -59) {
                    method2974(-56, -67);
                    return;
                }
                return;
            }
            this.method2972(var3, arg0, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(II)Z", line = 118)
    public static final boolean method2974(int arg0, int arg1) {
        if (arg1 != 0) {
            return true;
        }
        field7045++;
        for (class324 var2 = (class324) class528.field7301.method1269(4); var2 != null; var2 = (class324) class528.field7301.method1264((byte) 99)) {
            if (class79.method729(var2.field4505, (byte) -28) && (long) arg0 == var2.field4502) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 145)
    public final String method2975(int arg0, String arg1, int arg2) {
        field7042++;
        if (this.field7043 == null) {
            return arg1;
        }
        if (arg0 != -250) {
            method2970((byte) 0);
        }
        class568 var4 = (class568) this.field7043.method1465((long) arg2, -6008);
        return var4 == null ? arg1 : var4.field7814;
    }
}
