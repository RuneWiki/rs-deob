import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class601 {

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "Lqc;")
    private class325 field8872 = new class325(64);

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Lqc;")
    private class325 field8878 = new class325(100);

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "Ldda;")
    private class597 field8874;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Z")
    public static boolean field8873 = false;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "[[S")
    public static short[][] field8869;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZI)Laba;", line = 3)
    public final class224 method3498(boolean arg0, int arg1) {
        field8875++;
        class325 var3 = this.field8872;
        class224 var4;
        synchronized (this.field8872) {
            var4 = (class224) this.field8872.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field8874;
        byte[] var6;
        synchronized (this.field8874) {
            var6 = this.field8874.method3486((byte) -53, class105.method610(arg1, (byte) 101), class221.method1455(arg1, (byte) 7));
        }
        class224 var7 = new class224();
        var7.field3312 = arg1;
        var7.field3298 = this;
        if (var6 != null) {
            var7.method1474((byte) -68, new class428(var6));
        }
        var7.method1472(-1);
        class325 var8 = this.field8872;
        synchronized (this.field8872) {
            this.field8872.method2029(arg0, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 35)
    public final void method3499(int arg0) {
        field8877++;
        class325 var2 = this.field8872;
        synchronized (this.field8872) {
            this.field8872.method2037(true);
        }
        class325 var3 = this.field8878;
        synchronized (this.field8878) {
            this.field8878.method2037(true);
            if (arg0 != 1) {
                this.field8878 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)Lvq;", line = 51)
    public final class433 method3500(int arg0, int arg1) {
        field8876++;
        if (arg1 >= -69) {
            return null;
        }
        class325 var3 = this.field8878;
        class433 var4;
        synchronized (this.field8878) {
            var4 = (class433) this.field8878.method2025((long) arg0, 2);
            if (var4 == null) {
                var4 = new class433(arg0);
                this.field8878.method2029(false, var4, (long) arg0);
            }
        }
        synchronized (var4) {
            return var4.method2641((byte) -78) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 81)
    public static void method3501(int arg0) {
        if (arg0 == 1) {
            field8869 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZ)V", line = 92)
    public final void method3502(int arg0, boolean arg1) {
        field8870++;
        class325 var3 = this.field8872;
        synchronized (this.field8872) {
            this.field8872.method2028(arg0, true);
        }
        class325 var4 = this.field8878;
        synchronized (this.field8878) {
            this.field8878.method2028(arg0, true);
            if (arg1) {
                this.method3500(-91, -92);
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V", line = 112)
    public final void method3503(int arg0) {
        class325 var2 = this.field8872;
        synchronized (this.field8872) {
            this.field8872.method2024((byte) -97);
        }
        if (arg0 != -14292) {
            return;
        }
        field8871++;
        class325 var3 = this.field8878;
        synchronized (this.field8878) {
            this.field8878.method2024((byte) -81);
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Loda;ILdda;Ldda;Ldda;)V", line = 141)
    public class601(class559 arg0, int arg1, class597 arg2, class597 arg3, class597 arg4) {
        this.field8874 = arg2;
        if (this.field8874 != null) {
            int var6 = this.field8874.method3477(false) - 1;
            this.field8874.method3462(var6, -96);
        }
        class474.method2887(arg4, arg3, 21304);
    }
}
