import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class138 {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lqaa;")
    public static class27 field2151 = new class27(30, 7);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "[Ls;")
    public static class278[] field2153;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lgs;II)V")
    public static final void method1097(class43[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class43 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field647;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field647 > (var7 & 0x1) + var6) {
                class43 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1097(arg0, arg1, var4 - 1);
        method1097(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILjava/lang/Object;BI)[B")
    public static final byte[] method1098(int arg0, Object arg1, byte arg2, int arg3) {
        field2150++;
        if (arg1 == null) {
            return null;
        } else if (arg2 <= 25) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class190.method1338(var4, arg3, arg0, (byte) 54);
        } else if (arg1 instanceof class230) {
            class230 var5 = (class230) arg1;
            return var5.method1579(arg3, arg0, -1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        int var1 = -125 % ((arg0 + 28) / 59);
        field2151 = null;
        field2153 = null;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    public static final void method1100(byte arg0) {
        field2152++;
        int var1 = class471.field6781.field6668.method3947(27669);
        if (var1 == 0) {
            class10.field141 = null;
            class449.method2674(0, (byte) -125);
        } else if (var1 == 1) {
            class524.method3112((byte) 0, 895);
            class449.method2674(512, (byte) -120);
            if (class435.field6078 != null) {
                class130.method996((byte) 64);
            }
        } else {
            class524.method3112((byte) (class258.field3741 - 4 & 0xFF), 895);
            class449.method2674(2, (byte) -123);
        }
        if (arg0 == -47) {
            class345.field4856 = class312.field4409;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1101(boolean arg0, int arg1) {
        field2149++;
        if (arg0) {
            method1101(true, 78);
        }
        return arg1 == 0 || arg1 == 2;
    }
}
