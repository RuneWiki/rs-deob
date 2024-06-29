import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class74 {

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Lge;")
    private class511 field1210 = new class511(64);

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lci;")
    private class320 field1209;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lci;")
    public class320 field1204;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field1211 = -1;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public final void method574(byte arg0) {
        if (arg0 != -46) {
            this.method574((byte) 50);
        }
        class511 var2 = this.field1210;
        synchronized (this.field1210) {
            this.field1210.method2980(-182819096);
        }
        field1208++;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Liq;")
    public final class439 method575(int arg0, int arg1) {
        field1206++;
        class511 var3 = this.field1210;
        class439 var4;
        synchronized (this.field1210) {
            var4 = (class439) this.field1210.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field1209;
        byte[] var6;
        synchronized (this.field1209) {
            var6 = this.field1209.method2037(arg1, (byte) 88, arg0);
        }
        class439 var7 = new class439();
        var7.field6239 = this;
        if (var6 != null) {
            var7.method2583(new class519(var6), 0);
        }
        class511 var8 = this.field1210;
        synchronized (this.field1210) {
            this.field1210.method2981(var7, 124, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public final void method576(int arg0) {
        if (arg0 != 64) {
            this.method574((byte) 94);
        }
        field1203++;
        class511 var2 = this.field1210;
        synchronized (this.field1210) {
            this.field1210.method2990((byte) -60);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BILci;)Lgg;")
    public static final class119 method577(byte arg0, int arg1, class320 arg2) {
        if (arg0 < 75) {
            return null;
        } else {
            field1205++;
            byte[] var3 = arg2.method2029(arg1, false);
            return var3 == null ? null : new class119(var3);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V")
    public final void method578(int arg0, byte arg1) {
        field1207++;
        class511 var3 = this.field1210;
        synchronized (this.field1210) {
            if (arg1 == 54) {
                this.field1210.method2989(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lsn;ILci;Lci;)V")
    public class74(class453 arg0, int arg1, class320 arg2, class320 arg3) {
        this.field1209 = arg2;
        this.field1204 = arg3;
        this.field1209.method2030(-10914, 3);
    }
}
