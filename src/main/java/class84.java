import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class84 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ltl;")
    private class400 field1186 = new class400(16);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lui;")
    private class451 field1188;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILbp;IBI)Lbt;", line = 3)
    public final class83 method681(int arg0, int arg1, class58 arg2, int arg3, byte arg4, int arg5) {
        field1187++;
        if (arg4 != 53) {
            this.method684(-82, -66);
        }
        class175[] var7 = null;
        class387 var8 = this.method684(arg1, arg4 ^ 0xFFFFFFB7);
        if (var8.field5709 != null) {
            var7 = new class175[var8.field5709.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class345 var10 = arg2.method453((byte) -93, var8.field5709[var9]);
                var7[var9] = new class175(var10.field5264, var10.field5249, var10.field5269, var10.field5257, var10.field5259, var10.field5266, var10.field5267, var10.field5262);
            }
        }
        return new class83(var8.field5710, var7, var8.field5706, arg5, arg0, arg3);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 34)
    public final void method682(boolean arg0) {
        class400 var2 = this.field1186;
        synchronized (this.field1186) {
            this.field1186.method2401((byte) -67);
        }
        field1194++;
        if (!arg0) {
            this.field1188 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 50)
    public final void method683(int arg0) {
        class400 var2 = this.field1186;
        synchronized (this.field1186) {
            this.field1186.method2388(-100);
        }
        field1190++;
        if (arg0 != 16) {
            this.method682(true);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 107)
    public class84(class430 arg0, int arg1, class451 arg2) {
        this.field1188 = arg2;
        this.field1188.method2662(29, (byte) -7);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lqj;", line = 77)
    private final class387 method684(int arg0, int arg1) {
        field1185++;
        class400 var3 = this.field1186;
        class387 var4;
        synchronized (this.field1186) {
            if (arg1 >= -124) {
                this.method685(67, -6);
            }
            var4 = (class387) this.field1186.method2393(-120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1188.method2691(arg0, 29, 0);
        class387 var6 = new class387();
        if (var5 != null) {
            var6.method2342(new class446(var5), true);
        }
        class400 var7 = this.field1186;
        synchronized (this.field1186) {
            this.field1186.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)V", line = 123)
    public final void method685(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method681(-81, -16, (class58) null, -15, (byte) -102, 34);
        }
        field1189++;
        class400 var3 = this.field1186;
        synchronized (this.field1186) {
            this.field1186.method2389(false, arg0);
        }
    }
}
