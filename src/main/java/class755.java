import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class755 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lbh;")
    private class538 field10486 = new class538(256);

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lwu;")
    private class557 field10485;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I", line = 4)
    public static final int method4185(int arg0) {
        if (arg0 != 26) {
            field10482 = 64;
        }
        field10488++;
        return class586.field8431 == null ? 0 : class586.field8431.length * 2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z", line = 18)
    public static final boolean method4186(int arg0, int arg1, byte arg2) {
        field10489++;
        if (arg2 < 26) {
            return true;
        } else {
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V", line = 30)
    public final void method4187(boolean arg0, int arg1) {
        if (arg0) {
            this.field10486 = null;
        }
        field10481++;
        class538 var3 = this.field10486;
        synchronized (this.field10486) {
            this.field10486.method3204((byte) 75, arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lo;", line = 43)
    public final class177 method4188(int arg0, int arg1) {
        field10484++;
        class538 var3 = this.field10486;
        class177 var4;
        synchronized (this.field10486) {
            var4 = (class177) this.field10486.method3200((long) arg1, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field10485;
        byte[] var6;
        synchronized (this.field10485) {
            var6 = this.field10485.method3322(arg0, arg1, (byte) 84);
        }
        class177 var7 = new class177();
        if (var6 != null) {
            var7.method1108(new class26(var6), 25024);
        }
        class538 var8 = this.field10486;
        synchronized (this.field10486) {
            this.field10486.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 72)
    public final void method4189(int arg0) {
        field10483++;
        class538 var2 = this.field10486;
        synchronized (this.field10486) {
            this.field10486.method3202((byte) 127);
            if (arg0 != -4117) {
                field10482 = 59;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 89)
    public final void method4190(int arg0) {
        if (arg0 < 103) {
            return;
        }
        field10487++;
        class538 var2 = this.field10486;
        synchronized (this.field10486) {
            this.field10486.method3210(false);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lwj;ILwu;)V", line = 107)
    public class755(class121 arg0, int arg1, class557 arg2) {
        this.field10485 = arg2;
        this.field10485.method3333(26, 3443);
    }
}
