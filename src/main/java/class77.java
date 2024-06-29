import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class77 {

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lof;")
    private class328 field1143 = new class328(64);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lmn;")
    private class162 field1145;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Lbi;")
    public static class104 field1150 = new class104(16, 6);

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Ljd;")
    public static class426 field1152 = new class426("LOCAL", 4);

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1153 = null;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Lpt;")
    public static class403 field1151;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "[[B")
    public static byte[][] field1154;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public final void method551(int arg0) {
        class328 var2 = this.field1143;
        synchronized (this.field1143) {
            int var3 = 101 % ((-arg0 - 42) / 58);
            this.field1143.method2187(-1);
        }
        field1144++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public static void method552(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1152 = null;
        field1154 = null;
        field1151 = null;
        field1150 = null;
        field1153 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V")
    public final void method553(int arg0, boolean arg1) {
        field1149++;
        if (arg1) {
            class328 var3 = this.field1143;
            synchronized (this.field1143) {
                this.field1143.method2202(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lkl;")
    public final class101 method554(int arg0, int arg1) {
        field1147++;
        class328 var3 = this.field1143;
        class101 var4;
        synchronized (this.field1143) {
            var4 = (class101) this.field1143.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field1145;
        byte[] var6;
        synchronized (this.field1145) {
            var6 = this.field1145.method1004(31, false, arg1);
        }
        class101 var7 = new class101();
        if (var6 != null) {
            var7.method681(new class208(var6), 15411);
        }
        class328 var8 = this.field1143;
        synchronized (this.field1143) {
            this.field1143.method2188(-123, (long) arg1, var7);
            if (arg0 != 12275) {
                field1152 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public final void method555(int arg0) {
        class328 var2 = this.field1143;
        synchronized (this.field1143) {
            if (arg0 != 19277) {
                field1154 = null;
            }
            this.field1143.method2189(false);
        }
        field1146++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Lfv;")
    public static final class477 method556(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6188;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class77(class236 arg0, int arg1, class162 arg2) {
        this.field1145 = arg2;
        this.field1145.method1008(31, (byte) -21);
    }
}
