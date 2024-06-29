import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class428 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    public static int[] field5980 = new int[14];

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Llh;")
    public static class487 field5981 = new class487(54, 6);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lla;")
    public static class417 field5986;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2458(byte arg0) {
        if (arg0 <= -90) {
            field5982++;
            class51 var1 = class703.method3938(-1989279584, 0, 15);
            var1.method404(79);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 16)
    public static void method2459(boolean arg0) {
        field5980 = null;
        if (arg0) {
            field5986 = null;
            field5981 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lls;B)V", line = 32)
    public static final void method2460(class124 arg0, byte arg1) {
        if (arg1 != -22) {
            return;
        }
        field5985++;
        boolean var2 = false;
        if (class186.field2697 == arg0.field1751 || arg0.field1779 == -1 || arg0.field1706 != 0) {
            var2 = true;
        } else {
            class403 var3 = class192.field2727.method3090(-76, arg0.field1779);
            if (var3.field5644 || var3.field5646[arg0.field1739] < arg0.field1766 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1751 - arg0.field1770;
            int var5 = class186.field2697 - arg0.field1770;
            int var6 = arg0.field1734 * 512 + (arg0.method881(-108) * 256);
            int var7 = arg0.field1752 * 512 + arg0.method881(-115) * 256;
            int var8 = arg0.field1733 * 512 + arg0.method881(arg1 - 95) * 256;
            int var9 = arg0.field1788 * 512 + arg0.method881(arg1 ^ 0x6A) * 256;
            arg0.field4047 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg0.field4042 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg0.field1799 = 0;
        if (arg0.field1732 == 0) {
            arg0.method894((byte) 75, false, 8192);
        }
        if (arg0.field1732 == 1) {
            arg0.method894((byte) 99, false, 12288);
        }
        if (arg0.field1732 == 2) {
            arg0.method894((byte) 107, false, 0);
        }
        if (arg0.field1732 == 3) {
            arg0.method894((byte) 97, false, 4096);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IC)Z", line = 89)
    public static final boolean method2461(int arg0, char arg1) {
        field5984++;
        if (arg0 >= -45) {
            method2459(false);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V", line = 100)
    public class428(int arg0) {
        this.field5979 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "toString", descriptor = "()Ljava/lang/String;", line = 115)
    public final String toString() {
        field5983++;
        throw new IllegalStateException();
    }
}
