import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class610 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Len;")
    public class289 field8473;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[S")
    public static short[] field8474 = new short[256];

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Luc;")
    public static class27 field8478 = new class27(64, -1);

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[F")
    public static float[] field8480 = new float[4];

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BIIII)V", line = 7)
    public static final void method3370(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -4638) {
            field8480 = null;
        }
        field8476++;
        if (arg2 <= arg5) {
            return;
        }
        int var6 = arg2 - arg5 >> 2;
        int var7 = arg3 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var7++] = 1;
                }
            }
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JJ)J", line = 37)
    public static long method3371(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Len;)V", line = 46)
    public class610(class289 arg0) {
        this.field8473 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 60)
    public static void method3372(int arg0) {
        field8478 = null;
        int var1 = 18 % ((-arg0 - 33) / 43);
        field8474 = null;
        field8480 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 71)
    public static final void method3373(boolean arg0) {
        field8477++;
        if (arg0) {
            return;
        }
        try {
            if (class268.field3802 == 1) {
                int var1 = class230.field3284.method2475(123);
                if (var1 > 0 && class230.field3284.method2462(-2085)) {
                    int var2 = var1 - class599.field8326;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class230.field3284.method2459(var2, -1);
                } else {
                    class230.field3284.method2471(-22443);
                    class230.field3284.method2461(-16384);
                    class546.field7407 = null;
                    class423.field5969 = null;
                    if (class7.field68 == null) {
                        class268.field3802 = 0;
                    } else {
                        class268.field3802 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class230.field3284.method2471(-22443);
            class7.field68 = null;
            class546.field7407 = null;
            class268.field3802 = 0;
            class423.field5969 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
    public abstract void method257(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z")
    public abstract boolean method262(int arg0);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public abstract void method252(int arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILit;)V")
    public abstract void method255(int arg0, int arg1, class591 arg2);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)V")
    public abstract void method258(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZ)V")
    public abstract void method254(boolean arg0, boolean arg1);
}
