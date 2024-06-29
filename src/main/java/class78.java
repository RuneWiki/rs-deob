import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class78 {

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "Lmga;")
    private class666 field1218 = new class666(64);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "Lbi;")
    private class449 field1217;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "Ldb;")
    public static class298 field1224 = new class298(38, 14);

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "[[F")
    public static float[][] field1227 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "Lcu;")
    public static class206 field1225 = new class206(40, 2);

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)J", line = 4)
    public static final long method605(int arg0) {
        if (arg0 != -26890) {
            method605(97);
        }
        field1220++;
        return class433.field5920.method1272(arg0 ^ 0x6909);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZ)Lwj;", line = 18)
    public final class366 method606(int arg0, boolean arg1) {
        field1223++;
        class666 var3 = this.field1218;
        class366 var4;
        synchronized (this.field1218) {
            var4 = (class366) this.field1218.method3750((long) arg0, arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field1217;
        byte[] var6;
        synchronized (this.field1217) {
            var6 = this.field1217.method2537(false, class470.method2649((byte) 79, arg0), class690.method3832(false, arg0));
        }
        class366 var7 = new class366();
        if (var6 != null) {
            var7.method2160((byte) 66, new class335(var6));
        }
        class666 var8 = this.field1218;
        synchronized (this.field1218) {
            this.field1218.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V", line = 45)
    public final void method607(boolean arg0) {
        class666 var2 = this.field1218;
        synchronized (this.field1218) {
            this.field1218.method3748(6);
        }
        field1222++;
        if (arg0) {
            this.method610(73, 38);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V", line = 58)
    public final void method608(byte arg0) {
        field1219++;
        class666 var2 = this.field1218;
        synchronized (this.field1218) {
            if (arg0 < 72) {
                this.field1218 = null;
            }
            this.field1218.method3739(0);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)V", line = 78)
    public final void method609(int arg0, int arg1) {
        if (arg0 != -2821) {
            return;
        }
        field1216++;
        class666 var3 = this.field1218;
        synchronized (this.field1218) {
            this.field1218.method3740((byte) 60, arg1);
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(II)V", line = 93)
    public final void method610(int arg0, int arg1) {
        class666 var3 = this.field1218;
        synchronized (this.field1218) {
            this.field1218.method3739(0);
            this.field1218 = new class666(arg0);
            if (arg1 != 40) {
                method611(false);
            }
        }
        field1221++;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lpca;ILbi;)V", line = 126)
    public class78(class671 arg0, int arg1, class449 arg2) {
        this.field1217 = arg2;
        if (this.field1217 != null) {
            int var4 = this.field1217.method2545(0) - 1;
            this.field1217.method2527(0, var4);
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(Z)V", line = 113)
    public static void method611(boolean arg0) {
        if (arg0) {
            method611(false);
        }
        field1227 = null;
        field1225 = null;
        field1224 = null;
    }
}
