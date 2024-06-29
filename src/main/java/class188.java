import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class188 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public boolean field3366 = true;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lid;")
    public static class149 field3363 = class60.method382("Benutzeroberfl-=che geladen)3", (byte) 23);

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[Lid;")
    public static class149[] field3372 = new class149[100];

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lmb;")
    public static class160 field3364;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lal;")
    public static class230 field3369;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method1285(byte arg0) {
        int var1 = (class77.field1449.field2347 >> 7) + class125.field2199;
        field3373++;
        int var2 = (class77.field1449.field2340 >> 7) + class115.field1969;
        class205.field3685 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class205.field3685 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class205.field3685 = 1;
        }
        if (class205.field3685 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class205.field3685 = 0;
        }
        if (arg0 >= -12) {
            method1286((byte[]) null, 47);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BI)Z")
    public static final boolean method1286(byte[] arg0, int arg1) {
        field3367++;
        class74 var2 = new class74(arg0);
        int var3 = var2.method489((byte) 121);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method489((byte) -74) == arg1;
        if (var4) {
            class13.method76(-70, var2);
        }
        class173.method1232(var2, arg1 + 79);
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method1287(byte arg0) {
        field3369 = null;
        field3363 = null;
        field3364 = null;
        field3372 = null;
        if (arg0 != -112) {
            field3369 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3368 = arg0;
        this.field3375 = arg5;
        this.field3370 = arg3;
        this.field3374 = arg4;
        this.field3365 = arg1;
        this.field3371 = arg2;
        this.field3366 = arg6;
    }
}
