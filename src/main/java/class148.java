import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class148 extends class96 {

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lna;")
    public static class26 field2312 = class69.method505("::cardmem", (byte) -128);

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Lna;")
    public static class26 field2315 = class69.method505(" )2> ", (byte) -120);

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lna;")
    public static class26 field2314 = class69.method505(" )2> <col=ffff00>", (byte) -120);

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Lna;")
    public static class26 field2318 = class69.method505("W-=hlen Sie eine Option", (byte) -125);

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Lbe;")
    public static class297 field2321 = null;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(B)V", line = 4)
    public static void method1010(byte arg0) {
        field2321 = null;
        field2314 = null;
        field2318 = null;
        if (arg0 == 108) {
            field2315 = null;
            field2312 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)Lbe;", line = 31)
    public static final class297 method1011(byte arg0, int arg1, int arg2) {
        field2322++;
        class297 var3 = class178.method1226((byte) 109, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (arg0 == -19) {
            return var3 == null || var3.field5068 == null || var3.field5068.length <= arg2 ? null : var3.field5068[arg2];
        } else {
            return (class297) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V", line = 72)
    public final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1470985020) {
            return;
        }
        int var6 = this.field2309 << 3;
        field2317++;
        int var7 = this.field2319 << 3;
        int var8 = (arg3 << 4) + (var6 & 0xF);
        int var9 = (arg0 << 4) + (var7 & 0xF);
        this.method880(var6, var7, var8, var9, arg1, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
    public abstract void method879(int arg0, int arg1);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public abstract void method883(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
    public abstract void method878(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)V")
    public abstract void method875(int arg0, int arg1);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIII)V")
    public abstract void method881(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(II)V")
    public abstract void method876(int arg0, int arg1);
}
