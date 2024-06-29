import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class207 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lrp;")
    private class288 field3244 = new class288(64);

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Llt;")
    private class458 field3248;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lrp;")
    public static class288 field3246 = new class288(8);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Llf;")
    public static class151 field3250;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Llt;")
    public static class458 field3242;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lvr;", line = 4)
    public final class85 method1267(byte arg0, int arg1) {
        field3245++;
        class288 var3 = this.field3244;
        class85 var4;
        synchronized (this.field3244) {
            var4 = (class85) this.field3244.method1752(arg0 - 41, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3248.method2715(arg1, 11, false);
        class85 var6 = new class85();
        if (var5 != null) {
            var6.method604(arg0 - 16038, new class40(var5));
        }
        if (arg0 != 41) {
            method1270((byte) -51);
        }
        class288 var7 = this.field3244;
        synchronized (this.field3244) {
            this.field3244.method1758(arg0 - 40, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 33)
    public final void method1268(int arg0) {
        if (arg0 < 59) {
            return;
        }
        class288 var2 = this.field3244;
        synchronized (this.field3244) {
            this.field3244.method1761(-106);
        }
        field3243++;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 46)
    public final void method1269(int arg0) {
        class288 var2 = this.field3244;
        synchronized (this.field3244) {
            if (arg0 >= -9) {
                return;
            }
            this.field3244.method1749((byte) 125);
        }
        field3247++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 61)
    public static void method1270(byte arg0) {
        field3250 = null;
        field3246 = null;
        int var1 = -18 / ((arg0 - 37) / 41);
        field3242 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lcm;ILlt;)V", line = 96)
    public class207(class491 arg0, int arg1, class458 arg2) {
        this.field3248 = arg2;
        if (this.field3248 != null) {
            this.field3248.method2726((byte) 113, 11);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 84)
    public final void method1271(int arg0, int arg1) {
        if (arg1 >= -65) {
            this.method1271(30, -5);
        }
        class288 var3 = this.field3244;
        synchronized (this.field3244) {
            this.field3244.method1760(arg0, 30398);
        }
        field3249++;
    }
}
