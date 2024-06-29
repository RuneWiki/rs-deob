import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class183 {

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Ljr;")
    private class112 field2762 = new class112(64);

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "Ljr;")
    public class112 field2775 = new class112(50);

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "Ljr;")
    public class112 field2777 = new class112(5);

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "Z")
    public boolean field2768;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "Lin;")
    private class91 field2770;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "Lin;")
    public class91 field2761;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "Lsj;")
    public class460 field2763;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZ)V", line = 9)
    public final void method1334(byte arg0, boolean arg1) {
        if (arg0 < 22) {
            return;
        }
        field2765++;
        if (this.field2768 != arg1) {
            this.field2768 = arg1;
            this.method1340(-6080);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V", line = 25)
    public final void method1335(int arg0, int arg1) {
        this.field2778 = arg1;
        field2776++;
        class112 var3 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method999(0);
        }
        class112 var4 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method999(0);
        }
        if (arg0 != -25032) {
            this.method1341(-66, 101);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 45)
    public final void method1336(int arg0) {
        class112 var2 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method999(0);
        }
        if (arg0 >= -94) {
            return;
        }
        field2767++;
        class112 var3 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method999(0);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z", line = 61)
    public static final boolean method1337(int arg0, int arg1, int arg2) {
        field2769++;
        if (arg1 > -125) {
            field2766 = -110;
        }
        return (arg0 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V", line = 72)
    public final void method1338(int arg0, boolean arg1) {
        field2774++;
        class112 var3 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method987(2, arg0);
        }
        class112 var4 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method987(2, arg0);
        }
        if (!arg1) {
            this.method1334((byte) 120, true);
        }
        class112 var5 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method987(2, arg0);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)Z", line = 91)
    public static final boolean method1339(int arg0, int arg1, int arg2) {
        int var3 = -75 % ((-arg0 - 43) / 40);
        field2773++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V", line = 101)
    public final void method1340(int arg0) {
        field2764++;
        class112 var2 = this.field2762;
        synchronized (this.field2762) {
            if (arg0 != -6080) {
                this.field2775 = null;
            }
            this.field2762.method999(arg0 + 6080);
        }
        class112 var3 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method999(arg0 + 6080);
        }
        class112 var4 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method999(0);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)Lbb;", line = 122)
    public final class334 method1341(int arg0, int arg1) {
        field2771++;
        class112 var3 = this.field2762;
        class334 var4;
        synchronized (this.field2762) {
            var4 = (class334) this.field2762.method992((long) arg0, -104);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field2770;
        byte[] var6;
        synchronized (this.field2770) {
            var6 = this.field2770.method863(arg1 - 1859, class375.method2371(arg0, (byte) 69), class74.method698(127, arg0));
        }
        class334 var7 = new class334();
        var7.field4661 = arg0;
        var7.field4665 = this;
        if (var6 != null) {
            var7.method2114(111, new class215(var6));
        }
        var7.method2115(-117);
        class112 var8 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method991(var7, (long) arg0, (byte) -102);
            if (arg1 != -1) {
                this.field2762 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V", line = 160)
    public final void method1342(int arg0) {
        field2772++;
        class112 var2 = this.field2762;
        synchronized (this.field2762) {
            this.field2762.method996(-118);
        }
        class112 var3 = this.field2775;
        synchronized (this.field2775) {
            this.field2775.method996(-100);
        }
        class112 var4 = this.field2777;
        synchronized (this.field2777) {
            this.field2777.method996(-107);
        }
        if (arg0 <= 122) {
            method1337(-125, -46, 9);
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lsj;IZLin;Lin;)V", line = 193)
    public class183(class460 arg0, int arg1, boolean arg2, class91 arg3, class91 arg4) {
        this.field2768 = arg2;
        this.field2770 = arg3;
        this.field2761 = arg4;
        this.field2763 = arg0;
        if (this.field2770 != null) {
            int var6 = this.field2770.method867(-1) - 1;
            this.field2770.method860(0, var6);
        }
    }
}
