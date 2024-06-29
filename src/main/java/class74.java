import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class74 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Ljv;")
    private class55 field1251 = new class55(64);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lbu;")
    private class17 field1250;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Liv;")
    public static class64 field1253 = new class64(52, 18);

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lrn;")
    public static class174 field1255 = new class174(79, -1);

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[Lkf;")
    public static class165[] field1258 = new class165[14];

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 3)
    public final void method596(int arg0, int arg1) {
        class55 var3 = this.field1251;
        synchronized (this.field1251) {
            this.field1251.method493(false, arg1);
        }
        field1254++;
        if (arg0 != 64) {
            this.method598((byte) -97);
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Lsd;", line = 18)
    public final class61 method597(int arg0, int arg1) {
        field1256++;
        class55 var3 = this.field1251;
        class61 var4;
        synchronized (this.field1251) {
            var4 = (class61) this.field1251.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1250.method114(arg1, arg0, -87);
        class61 var6 = new class61();
        if (var5 != null) {
            var6.method530(new class145(var5), arg0 - 12);
        }
        class55 var7 = this.field1251;
        synchronized (this.field1251) {
            this.field1251.method485((long) arg1, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 44)
    public final void method598(byte arg0) {
        class55 var2 = this.field1251;
        synchronized (this.field1251) {
            if (arg0 < 42) {
                return;
            }
            this.field1251.method484(120);
        }
        field1252++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 61)
    public static void method599(int arg0) {
        if (arg0 >= -54) {
            method599(81);
        }
        field1253 = null;
        field1258 = null;
        field1255 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 84)
    public final void method600(byte arg0) {
        class55 var2 = this.field1251;
        synchronized (this.field1251) {
            this.field1251.method488(-3);
        }
        field1257++;
        if (arg0 >= -86) {
            field1258 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 102)
    public class74(class239 arg0, int arg1, class17 arg2) {
        this.field1250 = arg2;
        if (this.field1250 != null) {
            this.field1250.method119(29630, 11);
        }
    }
}
