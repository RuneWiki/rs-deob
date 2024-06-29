import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class388 {

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lqc;")
    private class325 field5669 = new class325(64);

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field5673 = 0;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ldda;")
    private class597 field5665;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field5671;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lnj;")
    public static class487 field5670 = new class487("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2342(int arg0, int arg1, byte[] arg2) {
        field5668++;
        byte[] var3 = new byte[arg0];
        class473.method2883(arg2, 0, var3, 0, arg0);
        if (arg1 != 9576) {
            field5670 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public final void method2343(boolean arg0) {
        field5664++;
        class325 var2 = this.field5669;
        synchronized (this.field5669) {
            this.field5669.method2037(arg0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method2344(int arg0) {
        if (arg0 == 4) {
            field5670 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public final void method2345(int arg0) {
        field5672++;
        class325 var2 = this.field5669;
        synchronized (this.field5669) {
            if (arg0 != 4) {
                field5670 = null;
            }
            this.field5669.method2024((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public final void method2346(int arg0, int arg1) {
        class325 var3 = this.field5669;
        synchronized (this.field5669) {
            int var4 = -34 / ((74 - arg0) / 37);
            this.field5669.method2028(arg1, true);
        }
        field5667++;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Lch;")
    public final class206 method2347(int arg0, int arg1) {
        field5666++;
        class325 var3 = this.field5669;
        class206 var4;
        synchronized (this.field5669) {
            var4 = (class206) this.field5669.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field5665;
        byte[] var6;
        synchronized (this.field5665) {
            var6 = this.field5665.method3486((byte) -107, arg1, 4);
        }
        class206 var7 = new class206();
        var7.field3073 = this;
        var7.field3075 = arg1;
        if (var6 != null) {
            var7.method1343((byte) -112, new class428(var6));
        }
        var7.method1347(arg0 - 2131032455);
        class325 var8 = this.field5669;
        synchronized (this.field5669) {
            this.field5669.method2029(false, var7, (long) arg1);
        }
        if (arg0 != -16497) {
            this.field5673 = 72;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class388(class559 arg0, int arg1, class597 arg2) {
        this.field5665 = arg2;
        this.field5671 = this.field5665.method3462(4, 104);
    }
}
