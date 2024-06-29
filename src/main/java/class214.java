import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class214 extends class60 {

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Ljava/lang/String;")
    public String field3337;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3338 = "white:";

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
    public static int[] field3343;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1553(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3339++;
        class209.field3305.field48 = 0;
        class209.field3305.method21(-124, 20);
        class209.field3305.method21(-100, arg0);
        class209.field3305.method21(107, arg3);
        class209.field3305.method14(-246866616, arg1);
        class209.field3305.method14(-246866616, arg2);
        class74.field1118 = 1;
        int var5 = -102 / ((-arg4 - 50) / 41);
        class8.field196 = 0;
        class257.field3824 = 0;
        class42.field663 = -3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 25)
    public class214() {
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1554(int arg0) {
        field3342++;
        for (int var1 = -1; var1 < class45.field703; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class325.field5068[var1];
            }
            class92 var3 = class74.field1140[var2];
            if (var3 != null && var3.field4669 > 0) {
                var3.field4669--;
                if (var3.field4669 == 0) {
                    var3.field4699 = null;
                }
            }
        }
        int var4 = 0;
        if (arg0 != 572) {
            field3338 = (String) null;
        }
        while (var4 < class83.field1290) {
            int var5 = class76.field1192[var4];
            class86 var6 = class197.field3029[var5];
            if (var6 != null && var6.field4669 > 0) {
                var6.field4669--;
                if (var6.field4669 == 0) {
                    var6.field4699 = null;
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 88)
    public static void method1555(int arg0) {
        field3338 = null;
        if (arg0 == 15228) {
            field3343 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 105)
    public static final void method1556(int arg0) {
        if (arg0 >= -63) {
            method1554(12);
        }
        field3345++;
        class247.field3680.method2282((byte) -126);
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 120)
    public class214(String arg0) {
        this.field3337 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([SI)[S", line = 131)
    public static final short[] method1557(short[] arg0, int arg1) {
        field3340++;
        if (arg1 != 2294) {
            return (short[]) null;
        } else if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class330.method2312(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }
}
