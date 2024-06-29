import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class553 {

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "Lmf;")
    private class382 field7837 = new class382(64);

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "Lpu;")
    private class522 field7846;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
    public int field7844;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "Z")
    public static boolean field7840 = false;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Lml;")
    public static class352 field7842 = null;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(JILr;)V")
    public static final void method3134(long arg0, int arg1, class166 arg2) {
        field7836++;
        class626.field8771 = arg1;
        class552.field7830 = 0;
        class705.field9918 = class505.field7153;
        class505.field7153 = 0;
        long var4 = class490.method2840(true);
        for (class29 var6 = (class29) class448.field6482.method2417(false); var6 != null; var6 = (class29) class448.field6482.method2414(true)) {
            if (var6.method337(arg2, arg0)) {
                class552.field7830++;
            }
        }
        if (class53.field1045 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class448.field6482.method2416(arg1 + 23609) + ", running: " + class552.field7830);
            System.out.println("Emitters: " + class626.field8771 + " Particles: " + class505.field7153 + ". Time taken: " + (class490.method2840(true) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
    public static final void method3135(int arg0, int arg1) {
        field7834++;
        class460.field6579 = 2;
        class689.field9707 = arg0;
        long var2 = (long) arg1;
        if (class87.field1469 == null) {
            class516.method2951((byte) -79, 35);
        } else {
            class695 var4 = new class695(class353.method2163(class114.method894(class87.field1469, 0), arg1));
            long var5 = var4.method3854((byte) -12);
            class609.field8565 = var4.method3854((byte) -12);
            class296.method1912(true, class477.method2797(var5, arg1 + 12095), "", false);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BII)Z")
    public static final boolean method3136(byte arg0, int arg1, int arg2) {
        field7835++;
        if (arg0 != 103) {
            field7840 = true;
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)Lww;")
    public final class681 method3137(int arg0, int arg1) {
        field7845++;
        class382 var3 = this.field7837;
        class681 var4;
        synchronized (this.field7837) {
            var4 = (class681) this.field7837.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field7846;
        byte[] var6;
        synchronized (this.field7846) {
            var6 = this.field7846.method3007(arg0, arg1, 5);
        }
        class681 var7 = new class681();
        if (var6 != null) {
            var7.method3773(-9879, new class695(var6));
        }
        class382 var8 = this.field7837;
        synchronized (this.field7837) {
            this.field7837.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public static void method3138(byte arg0) {
        int var1 = 34 % ((-arg0 - 60) / 62);
        field7842 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFFI)I")
    public static final int method3139(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != 1) {
            method3135(-101, 34);
        }
        field7841++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var6 < var5) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg0 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public final void method3140(int arg0) {
        field7838++;
        if (arg0 != 25325) {
            field7842 = null;
        }
        class382 var2 = this.field7837;
        synchronized (this.field7837) {
            this.field7837.method2285((byte) -120);
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
    public final void method3141(int arg0) {
        field7839++;
        class382 var2 = this.field7837;
        synchronized (this.field7837) {
            this.field7837.method2279(0);
            if (arg0 != 29636) {
                this.method3137(90, -95);
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(II)V")
    public final void method3142(int arg0, int arg1) {
        if (arg1 != 25486) {
            field7840 = true;
        }
        field7833++;
        class382 var3 = this.field7837;
        synchronized (this.field7837) {
            this.field7837.method2290(false, arg0);
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lkr;ILpu;)V")
    public class553(class693 arg0, int arg1, class522 arg2) {
        this.field7846 = arg2;
        if (this.field7846 == null) {
            this.field7844 = 0;
        } else {
            this.field7844 = this.field7846.method2988(-63, 16);
        }
    }
}
