import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class494 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Ldc;")
    private class5 field7535 = new class5(128);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lhe;")
    private class239 field7531;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lae;B)V", line = 3)
    public static final void method2968(class156 arg0, byte arg1) {
        field7534++;
        if (arg1 != -109) {
            method2968(null, (byte) -47);
        }
        for (int var2 = 0; var2 < class202.field2805; var2++) {
            int var3 = arg0.method953((byte) -40);
            int var4 = arg0.method993((byte) -100);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class479.field6928[var3] != null) {
                class479.field6928[var3].field2721 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lfn;", line = 40)
    public final class87 method2969(byte arg0, int arg1) {
        field7532++;
        class5 var3 = this.field7535;
        class87 var4;
        synchronized (this.field7535) {
            var4 = (class87) this.field7535.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7531.method1470(arg0 ^ 0xFFFFFFB2, class510.method3063((byte) 89, arg1), class79.method516(arg1, 37711432));
        if (arg0 != -74) {
            return null;
        }
        class87 var6 = new class87();
        if (var5 != null) {
            var6.method551(new class156(var5), (byte) -80);
        }
        class5 var7 = this.field7535;
        synchronized (this.field7535) {
            this.field7535.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 78)
    public class494(class298 arg0, int arg1, class239 arg2) {
        this.field7531 = arg2;
        if (this.field7531 != null) {
            int var4 = this.field7531.method1466(false) - 1;
            this.field7531.method1473(4309, var4);
        }
    }
}
