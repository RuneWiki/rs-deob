import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class410 {

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "Luaa;")
    private class395 field6088 = new class395(64);

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Luaa;")
    public class395 field6099 = new class395(30);

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Lgp;")
    public class561 field6096;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "Lgp;")
    private class561 field6091;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field6095 = 0;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "Liu;")
    public static class517 field6092 = new class517(110, -1);

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "[I")
    public static int[] field6097 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field6100;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 6)
    public static void method2485(int arg0) {
        field6092 = null;
        int var1 = -58 % ((arg0 + 27) / 39);
        field6097 = null;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 21)
    public final void method2486(int arg0) {
        field6098++;
        class395 var2 = this.field6088;
        synchronized (this.field6088) {
            this.field6088.method2406(56);
        }
        class395 var3 = this.field6099;
        synchronized (this.field6099) {
            this.field6099.method2406(-128);
        }
        if (arg0 != -14742) {
            method2491(-23, null);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZI)V", line = 37)
    public final void method2487(boolean arg0, int arg1) {
        field6087++;
        if (arg0) {
            method2491(36, null);
        }
        class395 var3 = this.field6088;
        synchronized (this.field6088) {
            this.field6088.method2397(arg1, (byte) -57);
        }
        class395 var4 = this.field6099;
        synchronized (this.field6099) {
            this.field6099.method2397(arg1, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V", line = 53)
    public final void method2488(int arg0) {
        field6090++;
        class395 var2 = this.field6088;
        synchronized (this.field6088) {
            if (arg0 != 21003) {
                method2485(17);
            }
            this.field6088.method2404((byte) -50);
        }
        class395 var3 = this.field6099;
        synchronized (this.field6099) {
            this.field6099.method2404((byte) -80);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Lcf;", line = 69)
    public final class347 method2489(int arg0, int arg1) {
        field6093++;
        class395 var3 = this.field6088;
        class347 var4;
        synchronized (this.field6088) {
            var4 = (class347) this.field6088.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field6091;
        byte[] var6;
        synchronized (this.field6091) {
            var6 = this.field6091.method3175(class204.method1312((byte) -7, arg1), (byte) -53, class56.method457((byte) 89, arg1));
        }
        class347 var7 = new class347();
        var7.field4972 = arg1;
        var7.field4970 = this;
        if (arg0 != 30) {
            this.field6100 = -68;
        }
        if (var6 != null) {
            var7.method2101(new class268(var6), (byte) 57);
        }
        class395 var8 = this.field6088;
        synchronized (this.field6088) {
            this.field6088.method2408(var7, (long) arg1, -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)V", line = 103)
    public final void method2490(int arg0, byte arg1) {
        field6089++;
        this.field6100 = arg0;
        class395 var3 = this.field6099;
        synchronized (this.field6099) {
            this.field6099.method2406(-119);
        }
        if (arg1 != -39) {
            field6097 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[B)[B", line = 117)
    public static final byte[] method2491(int arg0, byte[] arg1) {
        if (arg0 >= -2) {
            field6095 = -21;
        }
        field6094++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class164.method1151(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ljc;ILgp;Lgp;)V", line = 158)
    public class410(class584 arg0, int arg1, class561 arg2, class561 arg3) {
        this.field6096 = arg3;
        this.field6091 = arg2;
        int var5 = this.field6091.method3185(-62) - 1;
        this.field6091.method3164(var5, true);
    }
}
