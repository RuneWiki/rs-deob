import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class523 extends class431 {

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "Z")
    public boolean field7650 = false;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public int field7645 = -1;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Lhn;")
    public static class509 field7648 = new class509(8, -2);

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field7652 = -1;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "[I")
    public static int[] field7653;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public int field7644;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public int field7646;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public int field7649;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field7655;

    static {
        new class315("", 76);
        field7653 = new int[25];
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lkk;I)V", line = 4)
    public static final void method3111(class129 arg0, int arg1) {
        field7651++;
        boolean var2 = false;
        if (class475.field6854 == arg0.field1893 || arg0.field1959 == -1 || arg0.field1907 != 0) {
            var2 = true;
        } else {
            class189 var3 = class242.field3846.method2238(arg0.field1959, (byte) 78);
            if (var3.field3190 || var3.field3204[arg0.field1939] < arg0.field1903 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1893 - arg0.field1940;
            int var5 = class475.field6854 - arg0.field1940;
            int var6 = arg0.field1942 * 128 + arg0.method953(-102) * 64;
            int var7 = arg0.field1909 * 128 + arg0.method953(-117) * 64;
            int var8 = arg0.field1951 * 128 + arg0.method953(-103) * 64;
            int var9 = arg0.field1888 * 128 + arg0.method953(-108) * 64;
            arg0.field5837 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field5833 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
        }
        arg0.field1985 = 0;
        if (arg0.field1956 == 0) {
            arg0.method952(-443277064, 8192);
        }
        if (arg0.field1956 == 1) {
            arg0.method952(-443277064, 12288);
        }
        if (arg0.field1956 == 2) {
            arg0.method952(-443277064, 0);
        }
        if (arg0.field1956 == 3) {
            arg0.method952(-443277064, 4096);
        }
        if (arg1 >= -62) {
            method3111(null, -112);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 61)
    public static void method3112(int arg0) {
        field7648 = null;
        if (arg0 != -2) {
            field7653 = null;
        }
        field7653 = null;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V", line = 88)
    public class523(int arg0) {
        this.field7645 = arg0;
    }
}
