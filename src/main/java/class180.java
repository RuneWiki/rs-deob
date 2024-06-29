import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class180 {

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lhn;")
    private class509 field2349 = new class509(64);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lfo;")
    private class361 field2345;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lme;")
    public static class132 field2350;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    public static int[] field2346;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1050(int arg0) {
        field2350 = null;
        field2346 = null;
        if (arg0 != 5) {
            method1053(-96, null);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static final void method1051(int arg0) {
        field2352++;
        class478.method2923();
        for (int var1 = 0; var1 < 4; var1++) {
            class96.field1223[var1].method661(-113);
        }
        if (arg0 != 23413) {
            method1053(-49, null);
        }
        class212.method1356(-1);
        class377.method2252((byte) 76);
        System.gc();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)I")
    public static final int method1052(int arg0, int arg1, int arg2) {
        field2347++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 != 5) {
            return -5;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1053(int arg0, String arg1) {
        field2348++;
        class119.method714(arg1, "", 0, (byte) 102, "", arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lfg;")
    public final class85 method1054(int arg0, int arg1) {
        field2344++;
        class509 var3 = this.field2349;
        class85 var5;
        synchronized (this.field2349) {
            if (arg0 != 0) {
                return null;
            }
            var5 = (class85) this.field2349.method3032(3589, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class361 var6 = this.field2345;
        byte[] var7;
        synchronized (this.field2345) {
            var7 = this.field2345.method2130(5, arg1, -117);
        }
        class85 var8 = new class85();
        if (var7 != null) {
            var8.method466(new class396(var7), false);
        }
        class509 var9 = this.field2349;
        synchronized (this.field2349) {
            this.field2349.method3046((long) arg1, var8, 1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class180(class104 arg0, int arg1, class361 arg2) {
        this.field2345 = arg2;
        this.field2345.method2136(-42, 5);
    }
}
