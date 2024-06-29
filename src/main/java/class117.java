import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class117 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lpca;")
    private class714 field1418 = new class714(64);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lfp;")
    private class323 field1422;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Lci;")
    public final class449 method819(int arg0, boolean arg1) {
        field1423++;
        class714 var3 = this.field1418;
        class449 var4;
        synchronized (this.field1418) {
            var4 = (class449) this.field1418.method4022((long) arg0, (byte) -92);
        }
        if (!arg1) {
            this.method819(33, false);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field1422;
        byte[] var6;
        synchronized (this.field1422) {
            var6 = this.field1422.method2100(arg0, (byte) 112, 5);
        }
        class449 var7 = new class449();
        if (var6 != null) {
            var7.method2689(-15650, new class675(var6));
        }
        class714 var8 = this.field1418;
        synchronized (this.field1418) {
            this.field1418.method4018((byte) 125, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
    public static final boolean method820(int arg0, int arg1, int arg2) {
        if (arg0 == 5) {
            field1424++;
            return class686.method3837(arg1, arg2, 30743) & class69.method569(arg2, (byte) 69, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class117(class326 arg0, int arg1, class323 arg2) {
        this.field1422 = arg2;
        this.field1422.method2084(5, 0);
    }
}
