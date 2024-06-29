import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class681 {

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Lvh;")
    private class328 field9596 = new class328(256);

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Lpj;")
    private class132 field9594;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "F")
    public static float field9595;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V", line = 9)
    public final void method3759(int arg0, byte arg1) {
        field9597++;
        class328 var3 = this.field9596;
        synchronized (this.field9596) {
            this.field9596.method1989(arg0, (byte) 118);
            if (arg1 <= 56) {
                this.method3760(-18);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 27)
    public final void method3760(int arg0) {
        class328 var2 = this.field9596;
        synchronized (this.field9596) {
            this.field9596.method1987(-31085);
            if (arg0 < 52) {
                this.field9594 = null;
            }
        }
        field9592++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lam;", line = 40)
    public final class578 method3761(int arg0, int arg1) {
        field9593++;
        class328 var3 = this.field9596;
        class578 var4;
        synchronized (this.field9596) {
            var4 = (class578) this.field9596.method1986((byte) -104, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == -17777) {
            class132 var5 = this.field9594;
            byte[] var6;
            synchronized (this.field9594) {
                var6 = this.field9594.method940(26, arg0, 0);
            }
            class578 var7 = new class578();
            if (var6 != null) {
                var7.method3165(new class96(var6), (byte) -126);
            }
            class328 var8 = this.field9596;
            synchronized (this.field9596) {
                this.field9596.method1985(var7, (long) arg0, (byte) -102);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 71)
    public final void method3762(int arg0) {
        field9590++;
        class328 var2 = this.field9596;
        synchronized (this.field9596) {
            this.field9596.method1997(1);
        }
        int var3 = -78 / ((-arg0 - 8) / 41);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V", line = 84)
    public static final void method3763(boolean arg0, int arg1) {
        field9589++;
        class1.method5(1, class30.field361);
        class675.field9505++;
        if (arg1 != 17062) {
            return;
        }
        for (class198 var2 = (class198) class368.field5262.method2066(false); var2 != null; var2 = (class198) class368.field5262.method2062(-19704)) {
            if (!var2.method2972(arg1 ^ 0x42A7)) {
                var2 = (class198) class368.field5262.method2066(false);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2924 == 0) {
                class258.method1594(arg0, arg1 - 17180, true, var2);
            }
        }
        if (class88.field1195 != null) {
            class432.method2481(class88.field1195, 100);
            class88.field1195 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 124)
    public class681(class647 arg0, int arg1, class132 arg2) {
        this.field9594 = arg2;
        this.field9594.method936(26, -113);
    }
}
