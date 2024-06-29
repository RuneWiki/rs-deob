import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class170 extends class691 {

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field1891;

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "Lcq;")
    public static class110 field1896 = new class110(86, 4);

    @OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lkf;")
    public static class287 field1898 = new class287();

    @OriginalMember(owner = "client!kaa", name = "N", descriptor = "F")
    public static float field1899;

    @OriginalMember(owner = "client!kaa", name = "C", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!kaa", name = "H", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!kaa", name = "K", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "(I)V", line = 5)
    public static void method924(int arg0) {
        field1898 = null;
        field1896 = null;
        if (arg0 >= -119) {
            method928(75, 46, -27, null, false, -118);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(III)I", line = 16)
    public static final int method925(int arg0, int arg1, int arg2) {
        field1892++;
        int var3 = class147.method806(arg0 - 1, arg1 + -1, (byte) 79) + class147.method806(arg0 - 1, arg1 + 1, (byte) 79) + class147.method806(arg0 - -1, arg1 + -1, (byte) 79) + class147.method806(arg0 - -1, arg1 - -1, (byte) 79);
        int var4 = -108 % ((-arg2 - 56) / 42);
        int var5 = class147.method806(arg0, arg1 - 1, (byte) 79) - (-class147.method806(arg0, arg1 + 1, (byte) 79) - class147.method806(arg0 - 1, arg1, (byte) 79) - class147.method806(arg0 + 1, arg1, (byte) 79));
        int var6 = class147.method806(arg0, arg1, (byte) 79);
        return var6 / 4 + var3 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 33)
    public final Object method77(int arg0) {
        if (arg0 != 34168) {
            field1898 = null;
        }
        field1897++;
        return this.field1891;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lnp;I)V", line = 44)
    public static final void method926(class115 arg0, int arg1) {
        if (arg1 != -1) {
            method925(62, -77, 58);
        }
        for (int var2 = 0; var2 < class217.field2619; var2++) {
            int var3 = arg0.method662(true);
            int var4 = arg0.method643((byte) -77);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class674.field9394[var3] != null) {
                class674.field9394[var3].field9795 = var4;
            }
        }
        field1890++;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 73)
    public static final void method927(String arg0, int arg1, String arg2, int arg3) {
        class533.field7494 = 2;
        field1893++;
        class445.field6273 = arg1;
        if (arg3 != -1) {
            method928(48, -44, -100, null, true, 43);
        }
        class483.method2795(19326, false, arg0, arg2);
    }

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "(I)Z", line = 89)
    public final boolean method76(int arg0) {
        field1895++;
        if (arg0 != 5890) {
            this.field1891 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III[BZI)V", line = 100)
    public static final void method928(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5) {
        field1894++;
        if (arg2 >= arg5) {
            return;
        }
        if (arg4) {
            method925(29, -83, 29);
        }
        int var6 = arg5 - arg2 >> 2;
        int var7 = arg1 + arg2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var7++] = 1;
                }
            }
            arg3[var7++] = 1;
            arg3[var7++] = 1;
            arg3[var7++] = 1;
            arg3[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 130)
    public class170(Object arg0, int arg1) {
        super(arg1);
        this.field1891 = arg0;
    }
}
