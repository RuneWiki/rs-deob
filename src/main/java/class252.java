import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class252 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lhj;")
    public static class69 field4548 = class181.method1318("settings=", (byte) -106);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4550 = -1;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lpf;")
    public static class271 field4552;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1755(byte arg0) {
        field4548 = null;
        if (arg0 < 65) {
            method1755((byte) -120);
        }
        field4552 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)J")
    public static final long method1756(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        return var3 == null || var3.field3946 == null ? 0L : var3.field3946.field3849;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lnc;Z)V")
    public static final void method1757(class83 arg0, boolean arg1) {
        if (!arg1) {
            method1755((byte) -122);
        }
        class28.field403 = arg0;
        field4553++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([Lkc;[Lhk;B[Lhk;[Lhk;Lnc;[Lhk;)V")
    public static final void method1758(class264[] arg0, class121[] arg1, byte arg2, class121[] arg3, class121[] arg4, class83 arg5, class121[] arg6) {
        class208.field3792 = arg0;
        class17.field225 = arg4;
        class141.field2638 = arg1;
        class240.field4414 = arg6;
        class136.field2546 = arg5;
        field4549++;
        class216.field3911 = arg3;
        class258.field4619.method1732(117);
        int var7 = class136.field2546.method589((byte) -108, class11.field95);
        if (arg2 <= 28) {
            field4548 = null;
        }
        int[] var8 = class136.field2546.method608(-20161, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class258.field4619.method1727(-104, class192.method1388(new class128(class136.field2546.method590(var8[var9], var7, 0)), -120));
        }
    }
}
