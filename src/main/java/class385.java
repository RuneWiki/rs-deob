import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class385 {

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[Lvda;")
    private class164[] field5126;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    private int field5120;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field5121 = 0;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "J")
    private long field5119;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lvda;")
    private class164 field5123;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lhaa;")
    public static class71 field5129;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lvda;IJ)V")
    public final void method2206(class164 arg0, int arg1, long arg2) {
        if (arg0.field2002 != null) {
            arg0.method1037(-115);
        }
        field5122++;
        class164 var5 = this.field5126[(int) (arg2 & (long) (this.field5120 - arg1))];
        arg0.field2003 = var5;
        arg0.field2002 = var5.field2002;
        arg0.field2002.field2003 = arg0;
        arg0.field2006 = arg2;
        arg0.field2003.field2002 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method2207(int arg0) {
        field5129 = null;
        if (arg0 != -26076) {
            field5130 = -22;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Z")
    public static final boolean method2208(byte arg0, int arg1) {
        if (arg0 != 72) {
            method2208((byte) 78, -32);
        }
        field5125++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
    public class385(int arg0) {
        this.field5126 = new class164[arg0];
        this.field5120 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class164 var3 = this.field5126[var2] = new class164();
            var3.field2003 = var3;
            var3.field2002 = var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lvda;")
    public final class164 method2209(int arg0) {
        field5127++;
        if (this.field5123 == null) {
            return null;
        }
        if (arg0 != 2) {
            this.method2209(92);
        }
        class164 var2 = this.field5126[(int) (this.field5119 & (long) (this.field5120 - 1))];
        while (this.field5123 != var2) {
            if (this.field5123.field2006 == this.field5119) {
                class164 var3 = this.field5123;
                this.field5123 = this.field5123.field2003;
                return var3;
            }
            this.field5123 = this.field5123.field2003;
        }
        this.field5123 = null;
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)Lvda;")
    public final class164 method2210(long arg0, int arg1) {
        this.field5119 = arg0;
        field5124++;
        if (arg1 <= 66) {
            this.field5120 = -66;
        }
        class164 var4 = this.field5126[(int) ((long) (this.field5120 - 1) & arg0)];
        for (this.field5123 = var4.field2003; this.field5123 != var4; this.field5123 = this.field5123.field2003) {
            if (this.field5123.field2006 == arg0) {
                class164 var5 = this.field5123;
                this.field5123 = this.field5123.field2003;
                return var5;
            }
        }
        this.field5123 = null;
        return null;
    }
}
