import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class100 {

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Ljda;")
    private class239 field1402 = new class239(16);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Laj;")
    private class333 field1396;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 5)
    public final void method782(int arg0) {
        field1399++;
        class239 var2 = this.field1402;
        synchronized (this.field1402) {
            if (arg0 != 3138) {
                this.method786(-75, (byte) 72);
            }
            this.field1402.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 23)
    public final void method783(int arg0) {
        class239 var2 = this.field1402;
        synchronized (this.field1402) {
            this.field1402.method1552(-121);
            if (arg0 != -18300) {
                this.method786(-123, (byte) -79);
            }
        }
        field1398++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILdj;III)Llt;", line = 38)
    public final class705 method784(int arg0, int arg1, class363 arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -18085) {
            field1401 = 72;
        }
        field1403++;
        class242[] var7 = null;
        class666 var8 = this.method785(arg5, (byte) 90);
        if (var8.field9207 != null) {
            var7 = new class242[var8.field9207.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class140 var10 = arg2.method2279(var8.field9207[var9], arg0 ^ 0x46C3);
                var7[var9] = new class242(var10.field2043, var10.field2046, var10.field2045, var10.field2042, var10.field2040, var10.field2041, var10.field2047, var10.field2037);
            }
        }
        return new class705(var8.field9212, var7, var8.field9208, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)Lwda;", line = 70)
    private final class666 method785(int arg0, byte arg1) {
        field1397++;
        class239 var3 = this.field1402;
        class666 var4;
        synchronized (this.field1402) {
            var4 = (class666) this.field1402.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field1396;
        byte[] var6;
        synchronized (this.field1396) {
            var6 = this.field1396.method2095(arg0, 29, arg1 ^ 0x5B);
        }
        class666 var7 = new class666();
        if (var6 != null) {
            var7.method3690((byte) 102, new class376(var6));
        }
        class239 var8 = this.field1402;
        synchronized (this.field1402) {
            if (arg1 == 90) {
                this.field1402.method1544(true, var7, (long) arg0);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IB)V", line = 102)
    public final void method786(int arg0, byte arg1) {
        int var3 = 127 / ((52 - arg1) / 60);
        field1400++;
        class239 var4 = this.field1402;
        synchronized (this.field1402) {
            this.field1402.method1546(arg0, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lgia;ILaj;)V", line = 122)
    public class100(class285 arg0, int arg1, class333 arg2) {
        this.field1396 = arg2;
        this.field1396.method2090(29, false);
    }
}
