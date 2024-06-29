import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class350 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Lco;")
    private class210 field5026 = new class210(64);

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lg;")
    private class470 field5028;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Lwb;")
    public static class45 field5031;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field5033;

    static {
        new class40(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field5031 = new class45(16);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 3)
    public final void method2120(byte arg0) {
        field5033++;
        if (arg0 > -7) {
            method2123(56);
        }
        class210 var2 = this.field5026;
        synchronized (this.field5026) {
            this.field5026.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V", line = 17)
    public final void method2121(int arg0, int arg1) {
        class210 var3 = this.field5026;
        synchronized (this.field5026) {
            this.field5026.method1166(arg1, (byte) -52);
        }
        if (arg0 != 16) {
            field5031 = null;
        }
        field5025++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 39)
    public final void method2122(int arg0) {
        class210 var2 = this.field5026;
        synchronized (this.field5026) {
            this.field5026.method1169(1076);
        }
        if (arg0 != 16) {
            this.field5026 = null;
        }
        field5024++;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V", line = 53)
    public static void method2123(int arg0) {
        if (arg0 != 64) {
            method2123(-37);
        }
        field5031 = null;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)Lhh;", line = 63)
    public final class199 method2124(int arg0, int arg1) {
        field5027++;
        class210 var3 = this.field5026;
        class199 var4;
        synchronized (this.field5026) {
            var4 = (class199) this.field5026.method1163((byte) 112, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5028.method2768(-20472, arg1, arg0);
        class199 var6 = new class199();
        if (var5 != null) {
            var6.method1092((byte) 120, new class179(var5));
        }
        class210 var7 = this.field5026;
        synchronized (this.field5026) {
            this.field5026.method1172((long) arg1, arg0 - 15, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lci;ILg;)V", line = 91)
    public class350(class421 arg0, int arg1, class470 arg2) {
        this.field5028 = arg2;
        if (this.field5028 == null) {
            this.field5030 = 0;
        } else {
            this.field5030 = this.field5028.method2755(-124, 16);
        }
    }
}
