import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class227 extends class123 {

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Lde;")
    public class68 field3510;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "[I")
    public static int[] field3506 = new int[200];

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 4)
    public static final void method1657(int arg0) {
        class332.field5182.method2282((byte) -123);
        field3509++;
        if (arg0 <= 102) {
            method1658(-31);
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Lnk;", line = 17)
    public static final class14 method1658(int arg0) {
        if (arg0 != -1) {
            return (class14) null;
        }
        field3511++;
        try {
            return (class14) Class.forName("fn").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class263();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[Ljava/lang/Object;[JB)V", line = 32)
    public static final void method1659(int arg0, int arg1, Object[] arg2, long[] arg3, byte arg4) {
        if (arg4 > -17) {
            return;
        }
        field3508++;
        if (arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var7;
        Object var9 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var9;
        for (int var10 = arg0; var10 < arg1; var10++) {
            if (arg3[var10] < ((long) (var10 & 0x1) + var7)) {
                long var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                Object var13 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var13;
            }
        }
        arg3[arg1] = arg3[var6];
        arg3[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var9;
        method1659(arg0, var6 - 1, arg2, arg3, (byte) -56);
        method1659(var6 + 1, arg1, arg2, arg3, (byte) -124);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V", line = 95)
    public static void method1660(boolean arg0) {
        field3506 = null;
        if (arg0) {
            method1659(80, 93, (Object[]) null, (long[]) null, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 109)
    public static final void method1661(int arg0, int arg1) {
        field3513++;
        class32.field496 = -1;
        class180.field2863 = arg1;
        class339.field5234 = arg0;
        class344.method2385((byte) 25);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lde;)V", line = 118)
    public class227(class68 arg0) {
        this.field3510 = arg0;
    }
}
