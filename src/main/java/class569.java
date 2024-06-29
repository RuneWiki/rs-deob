import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class class569 implements class33 {

    @OriginalMember(owner = "client!us", name = "j", descriptor = "Ltf;")
    private class701 field8095;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Ltf;")
    public class701 field8086;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "Ldd;")
    public class176 field8096;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field8088 = 0;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field8097 = 0;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    private int field8094;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "J")
    private long field8098;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Lla;")
    private class413 field8090;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZIZ)V")
    public abstract void method452(int arg0, boolean arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZ)V")
    public abstract void method449(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public void method156(int arg0) {
        field8093++;
        if (arg0 != 23004) {
            this.method155(true, -105);
        }
        class463 var2 = class658.method3651(-114, this.field8096.field1969, this.field8095);
        this.field8090 = class701.field9813.method998(var2, class550.method3119(this.field8086, this.field8096.field1969), true);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
    public final void method155(boolean arg0, int arg1) {
        field8087++;
        int var3 = this.field8096.field1965.method1426(class267.field3329, this.field8096.field1972, arg1 ^ 0xDEA) + this.field8096.field1967;
        if (arg1 != -3563) {
            this.method157(false);
        }
        int var4 = this.field8096.field1962.method3625(this.field8096.field1971, class87.field873, 0) + this.field8096.field1970;
        this.method452(var4, true, var3, arg0);
        this.method449(arg1 ^ 0xFFFFF217, var4, var3, arg0);
        String var5 = class203.field2404.method3090((byte) 98);
        if (class557.method3157(-95) - this.field8098 > 10000L) {
            var5 = var5 + " (" + class203.field2404.method3094(0).method149((byte) 72) + ")";
        }
        this.field8090.method2325(var5, this.field8096.field1968, 1292016200, -1, this.field8096.field1971 / 2 + this.field8096.field1973 + var4 + 4, var3 - -(this.field8096.field1972 / 2));
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)I")
    public final int method3223(byte arg0) {
        field8092++;
        if (arg0 < 51) {
            this.method157(true);
        }
        int var2 = class203.field2404.method3089(86);
        int var3 = var2 * 100;
        if (this.field8094 == var2 && var2 != 0) {
            int var4 = class203.field2404.method3092(-114);
            if (var2 < var4) {
                long var5 = this.field8098 - class203.field2404.method3093((byte) -90);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class557.method3157(-73) - this.field8098) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field8094 = var2;
            this.field8098 = class557.method3157(-112);
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z")
    public boolean method157(boolean arg0) {
        field8089++;
        boolean var2 = true;
        if (!this.field8086.method3849(this.field8096.field1969, arg0)) {
            var2 = false;
        }
        if (!this.field8095.method3849(this.field8096.field1969, arg0)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Ltf;Ltf;Ldd;)V")
    public class569(class701 arg0, class701 arg1, class176 arg2) {
        this.field8095 = arg1;
        this.field8086 = arg0;
        this.field8096 = arg2;
    }
}
