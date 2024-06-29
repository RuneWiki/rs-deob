import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class737 {

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Ljw;")
    public static class581 field10193 = new class581(5, 2);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "J")
    public static long field10194;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ldga;I[[B)V")
    public static final void method4081(class219 arg0, int arg1, byte[][] arg2) {
        field10192++;
        int var3 = class476.field6617.length;
        if (arg1 != 64) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class186.field2487[var4] >> 8) * 64 - class121.field1765;
                int var7 = (class186.field2487[var4] & 0xFF) * 64 - class230.field3147;
                class230.method1508((byte) -37);
                arg0.method1443(class379.field5542, var6, (byte) -62, class514.field7038, var5, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method4082(byte arg0) {
        field10193 = null;
        if (arg0 <= 68) {
            field10193 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4083(int arg0, byte arg1, int arg2) {
        if (arg1 != 27) {
            method4082((byte) 75);
        }
        field10190++;
        return (arg2 & 0x60000) != 0 | class682.method3785(arg2, (byte) -11, arg0) || class291.method1844(arg0, arg1 - 27, arg2) || class733.method4069(arg2, 3, arg0);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILrb;)Lrb;")
    public abstract class374 method2683(int arg0, class374 arg1);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBIIII)Ldn;")
    public static final class544 method4084(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field10191++;
        if (arg2 > -106) {
            return null;
        }
        long var7 = (long) arg3 * 986053L ^ (long) arg1 * 97549L ^ (long) arg0 * 67481L ^ (long) arg4 * 475427L ^ (long) arg6 * 32147369L ^ (long) arg5 * 76724863L;
        class544 var9 = (class544) class474.field6607.method1541(-10, var7);
        if (var9 == null) {
            class544 var10 = class66.field937.method467(arg0, arg1, arg4, arg3, arg6, arg5);
            class474.field6607.method1544(true, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }
}
