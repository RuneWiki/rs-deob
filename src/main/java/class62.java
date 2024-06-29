import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class62 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lmf;")
    private class382 field1166 = new class382(64);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lpu;")
    private class522 field1169;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public final void method646(int arg0, int arg1) {
        class382 var3 = this.field1166;
        synchronized (this.field1166) {
            this.field1166.method2290(false, arg0);
            if (arg1 <= 125) {
                this.field1169 = null;
            }
        }
        field1170++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;")
    public static final Object method647(byte arg0, byte[] arg1, boolean arg2) {
        field1171++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class602.field8510) {
            try {
                class70 var3 = (class70) Class.forName("at").getDeclaredConstructor().newInstance();
                var3.method679(arg1, -1);
                return var3;
            } catch (Throwable var4) {
                class602.field8510 = true;
            }
        }
        if (arg0 < 12) {
            return null;
        } else if (arg2) {
            return class630.method3511(false, arg1);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lhk;")
    public final class87 method648(int arg0, int arg1) {
        field1168++;
        class382 var3 = this.field1166;
        class87 var4;
        synchronized (this.field1166) {
            var4 = (class87) this.field1166.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field1169;
        byte[] var6;
        synchronized (this.field1169) {
            var6 = this.field1169.method3007(arg1, arg0, 5);
        }
        class87 var7 = new class87();
        if (var6 != null) {
            var7.method760(new class695(var6), 0);
        }
        class382 var8 = this.field1166;
        synchronized (this.field1166) {
            this.field1166.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public final void method649(boolean arg0) {
        class382 var2 = this.field1166;
        synchronized (this.field1166) {
            this.field1166.method2279(0);
        }
        if (!arg0) {
            field1167++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method650(byte arg0) {
        field1172++;
        if (arg0 > -14) {
            this.field1169 = null;
        }
        class382 var2 = this.field1166;
        synchronized (this.field1166) {
            this.field1166.method2285((byte) -87);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lkr;ILpu;)V")
    public class62(class693 arg0, int arg1, class522 arg2) {
        this.field1169 = arg2;
        this.field1169.method2988(124, 32);
    }
}
