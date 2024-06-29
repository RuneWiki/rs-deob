import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class625 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lpca;")
    private class714 field8683 = new class714(64);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lfp;")
    private class323 field8688;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lqfa;")
    public static class98 field8689 = new class98(90, -1);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8690 = -1;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lqha;")
    public static class102 field8692 = new class102();

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Ljda;", line = 10)
    public final class224 method3506(int arg0, int arg1) {
        field8685++;
        class714 var3 = this.field8683;
        class224 var4;
        synchronized (this.field8683) {
            var4 = (class224) this.field8683.method4022((long) arg0, (byte) -76);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 64) {
            this.field8688 = null;
        }
        class323 var5 = this.field8688;
        byte[] var6;
        synchronized (this.field8688) {
            var6 = this.field8688.method2100(arg0, (byte) 112, 32);
        }
        class224 var7 = new class224();
        if (var6 != null) {
            var7.method1405(new class675(var6), -97);
        }
        class714 var8 = this.field8683;
        synchronized (this.field8683) {
            this.field8683.method4018((byte) 125, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 42)
    public final void method3507(int arg0) {
        class714 var2 = this.field8683;
        synchronized (this.field8683) {
            this.field8683.method4023((byte) -126);
            if (arg0 >= -88) {
                field8691 = -88;
            }
        }
        field8687++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 56)
    public final void method3508(int arg0) {
        if (arg0 != 32) {
            method3509(false);
        }
        class714 var2 = this.field8683;
        synchronized (this.field8683) {
            this.field8683.method4024(0);
        }
        field8684++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 69)
    public static void method3509(boolean arg0) {
        field8692 = null;
        if (!arg0) {
            method3509(false);
        }
        field8689 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 80)
    public final void method3510(int arg0, byte arg1) {
        class714 var3 = this.field8683;
        synchronized (this.field8683) {
            this.field8683.method4016(arg0, (byte) -73);
            int var4 = -37 % ((arg1 - 43) / 61);
        }
        field8686++;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 109)
    public class625(class326 arg0, int arg1, class323 arg2) {
        this.field8688 = arg2;
        this.field8688.method2084(32, 0);
    }
}
