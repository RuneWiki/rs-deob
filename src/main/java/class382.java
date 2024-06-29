import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class382 {

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lnga;")
    private class510 field5361 = new class510(128);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Leq;")
    private class209 field5358;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[[Z")
    public static boolean[][] field5354 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lkg;")
    public static class271 field5355 = new class271("", 18);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public final void method2398(byte arg0) {
        class510 var2 = this.field5361;
        synchronized (this.field5361) {
            if (arg0 >= -11) {
                return;
            }
            this.field5361.method3050(false);
        }
        field5357++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
    public static final void method2399(byte arg0, long[] arg1, Object[] arg2) {
        if (arg0 >= 102) {
            field5362++;
            class446.method2667(arg1, 0, arg2, -125, arg1.length - 1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Lwl;")
    public final class406 method2400(boolean arg0, int arg1) {
        field5360++;
        class510 var3 = this.field5361;
        class406 var4;
        synchronized (this.field5361) {
            var4 = (class406) this.field5361.method3054((byte) -128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field5358;
        byte[] var6;
        synchronized (this.field5358) {
            var6 = this.field5358.method1453(arg1, -119, 1);
        }
        class406 var7 = new class406();
        if (var6 != null) {
            var7.method2495(new class35(var6), (byte) -124);
        }
        class510 var8 = this.field5361;
        synchronized (this.field5361) {
            this.field5361.method3047(arg0, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([[S[[FI)[[S")
    public static final short[][] method2401(short[][] arg0, float[][] arg1, int arg2) {
        if (arg2 != 16383) {
            method2401(null, null, 73);
        }
        field5359++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            for (int var4 = 0; var4 < arg0[var3].length; var4++) {
                arg0[var3][var4] = (short) ((int) (arg1[var3][var4] * 16383.0F));
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public final void method2402(int arg0) {
        class510 var2 = this.field5361;
        synchronized (this.field5361) {
            this.field5361.method3048(false);
        }
        field5363++;
        if (arg0 > -125) {
            this.method2402(29);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method2403(int arg0) {
        field5354 = null;
        if (arg0 > -65) {
            field5354 = null;
        }
        field5355 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public final void method2404(int arg0, int arg1) {
        if (arg0 != -1) {
            return;
        }
        field5356++;
        class510 var3 = this.field5361;
        synchronized (this.field5361) {
            this.field5361.method3049(arg1, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class382(class179 arg0, int arg1, class209 arg2) {
        this.field5358 = arg2;
        this.field5358.method1477(0, 1);
    }
}
