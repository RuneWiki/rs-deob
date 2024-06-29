import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class66 implements class217 {

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "Lqga;")
    public class192 field899;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "Lpl;")
    private class612 field894;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Z")
    public static boolean field896 = false;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Lwp;")
    public static class453 field893 = new class453(35, 3);

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Lf;")
    public class536 field895;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V", line = 3)
    public static void method391(int arg0) {
        field893 = null;
        if (arg0 != 14793) {
            method393(null);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z", line = 15)
    public final boolean method392(byte arg0) {
        if (arg0 == 82) {
            field900++;
            return this.field894.method3368(1912, this.field899.field2389);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Llo;)V", line = 28)
    public static final void method393(class488 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class593.field8335[var1]; var2++) {
                if (class102.field1375[var1][var2] == arg0) {
                    class293.method1639(class102.field1375[var1], var2 + 1, class102.field1375[var1], var2, class593.field8335[var1] - var2 - 1);
                    var10002 = class593.field8335[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class173.field2256[var1]; var3++) {
                if (class337.field4341[var1][var3] == arg0) {
                    class293.method1639(class337.field4341[var1], var3 + 1, class337.field4341[var1], var3, class173.field2256[var1] - var3 - 1);
                    var10002 = class173.field2256[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class469.field5960[var1]; var4++) {
                if (class252.field3090[var1][var4] == arg0) {
                    class293.method1639(class252.field3090[var1], var4 + 1, class252.field3090[var1], var4, class469.field5960[var1] - var4 - 1);
                    var10002 = class469.field5960[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V", line = 87)
    public final void method394(int arg0) {
        field903++;
        this.field895 = class121.method649(this.field894, 1024, this.field899.field2389);
        if (arg0 > -41) {
            this.method395(false, -112);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V", line = 101)
    public void method395(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field899.field2388.method2206(class593.field8327, this.field895.method160(), 2) + this.field899.field2394;
            int var4 = this.field899.field2391.method195(class316.field4060, this.field895.method166(), -87) + this.field899.field2393;
            this.field895.method2902(var3, var4);
        }
        field902++;
        if (arg1 != 6621) {
            field905 = -81;
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lpl;Lqga;)V", line = 129)
    public class66(class612 arg0, class192 arg1) {
        this.field899 = arg1;
        this.field894 = arg0;
    }
}
