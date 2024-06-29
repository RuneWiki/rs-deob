import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class179 {

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lff;")
    private class9 field2532 = new class9(64);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lvh;")
    private class240 field2531;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2530 = 0;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[Luo;")
    public static class405[] field2534 = new class405[32768];

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)Lvr;")
    public final class89 method1088(int arg0, byte arg1) {
        field2536++;
        class9 var3 = this.field2532;
        class89 var4;
        synchronized (this.field2532) {
            var4 = (class89) this.field2532.method56((long) arg0, 57);
        }
        if (arg1 > -118) {
            this.method1090(true);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2531.method1411(true, arg0, 11);
        class89 var6 = new class89();
        if (var5 != null) {
            var6.method618(-117, new class365(var5));
        }
        class9 var7 = this.field2532;
        synchronized (this.field2532) {
            this.field2532.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method1089(boolean arg0) {
        field2534 = null;
        if (arg0) {
            method1089(false);
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)V")
    public final void method1090(boolean arg0) {
        field2535++;
        if (!arg0) {
            class9 var2 = this.field2532;
            synchronized (this.field2532) {
                this.field2532.method67(-110);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
    public final void method1091(int arg0, int arg1) {
        field2533++;
        if (arg1 != 11) {
            this.field2531 = null;
        }
        class9 var3 = this.field2532;
        synchronized (this.field2532) {
            this.field2532.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class179(class157 arg0, int arg1, class240 arg2) {
        this.field2531 = arg2;
        if (this.field2531 != null) {
            this.field2531.method1397((byte) 64, 11);
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)V")
    public final void method1092(boolean arg0) {
        field2529++;
        if (arg0) {
            field2530 = -105;
        }
        class9 var2 = this.field2532;
        synchronized (this.field2532) {
            this.field2532.method65(arg0);
        }
    }
}
