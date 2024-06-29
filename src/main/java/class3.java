import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class3 extends class498 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lmaa;")
    public static class508 field17 = new class508(10, 8);

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lbk;")
    public static class446 field26 = new class446("RC", 1);

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field27 = 7000;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field30 = field27;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Luq;")
    public class318 field21;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field31;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field32;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
    public boolean field22;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[Lkia;")
    public class574[] field18;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method19(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[I[J)V", line = 15)
    public static final void method13(byte arg0, int[] arg1, long[] arg2) {
        class520.method3100(0, arg1, arg2, arg0 - 120, arg2.length + -1);
        field25++;
        if (arg0 != 120) {
            field24 = 61;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 26)
    public static final void method14(byte arg0) {
        class690 var1 = class301.field4258;
        synchronized (class301.field4258) {
            if (arg0 > -31) {
                method16(61, null);
            }
            class301.field4258.method3902(0);
        }
        field29++;
        class690 var2 = class684.field9509;
        synchronized (class684.field9509) {
            class684.field9509.method3902(0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILha;BI)Z", line = 42)
    public final boolean method15(int arg0, class548 arg1, byte arg2, int arg3) {
        field20++;
        int var5 = this.field21.method2058(0);
        if (this.field18 != null) {
            for (int var6 = 0; var6 < this.field18.length; var6++) {
                this.field18[var6].field7914 <<= var5;
                if (this.field18[var6].method3361(arg0, arg3) && this.field21.method644(arg0, arg1, arg3, (byte) -114)) {
                    this.field18[var6].field7914 >>= var5;
                    return true;
                }
                this.field18[var6].field7914 >>= var5;
            }
        }
        return arg2 > -13;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V", line = 85)
    public static final void method16(int arg0, String arg1) {
        System.exit(1);
        if (arg0 == 0) {
            field19++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I", line = 108)
    public static final int method17(byte arg0) {
        field28++;
        if (arg0 != -125) {
            method17((byte) 63);
        }
        int var1 = 0;
        Field[] var2 = (field31 == null ? (field31 = method19("qea")) : field31).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field32 == null ? (field32 = method19("ek")) : field32).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 139)
    public static void method18(byte arg0) {
        field17 = null;
        field26 = null;
        if (arg0 != 108) {
            field26 = null;
        }
    }
}
