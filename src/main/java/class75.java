import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class75 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lco;")
    private class210 field908 = new class210(64);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public int field910 = 0;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lg;")
    private class470 field906;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lrq;")
    public static class350 field907;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Ljb;")
    public static class460 field909;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 14)
    public static void method381(int arg0) {
        field907 = null;
        if (arg0 == 0) {
            field909 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 25)
    public final void method382(int arg0) {
        class210 var2 = this.field908;
        synchronized (this.field908) {
            this.field908.method1165((byte) 118);
        }
        if (arg0 == -20312) {
            field904++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Ltb;", line = 39)
    public final class112 method383(int arg0, byte arg1) {
        if (arg1 > -106) {
            this.method385(84, -78);
        }
        field901++;
        class210 var3 = this.field908;
        class112 var4;
        synchronized (this.field908) {
            var4 = (class112) this.field908.method1163((byte) -80, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field906.method2768(-20472, arg0, 4);
        class112 var6 = new class112();
        var6.field1376 = this;
        var6.field1372 = arg0;
        if (var5 != null) {
            var6.method539(false, new class179(var5));
        }
        var6.method538(-89);
        class210 var7 = this.field908;
        synchronized (this.field908) {
            this.field908.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 73)
    public final void method384(int arg0) {
        class210 var2 = this.field908;
        synchronized (this.field908) {
            this.field908.method1169(1076);
            int var3 = -90 / ((arg0 - 63) / 39);
        }
        field903++;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lci;ILg;)V", line = 108)
    public class75(class421 arg0, int arg1, class470 arg2) {
        this.field906 = arg2;
        this.field905 = this.field906.method2755(-94, 4);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 90)
    public final void method385(int arg0, int arg1) {
        field911++;
        class210 var3 = this.field908;
        synchronized (this.field908) {
            this.field908.method1166(arg1, (byte) -52);
        }
        if (arg0 != 0) {
            this.method382(-26);
        }
    }
}
