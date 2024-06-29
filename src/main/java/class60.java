import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class60 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lhd;")
    public class773 field798;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field800 = -1;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 4)
    public static final void method516(byte arg0) {
        field804++;
        class665.field9130.method3012(552725320);
        if (arg0 < 122) {
            field796 = -66;
        }
        class300.field3598 = null;
        class558.field7751 = 1;
        class8.field138 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V", line = 28)
    public final void method517(int arg0, int arg1) {
        field797++;
        if (arg1 > -23) {
            this.field799 = -119;
        }
        if (this.method406(0, arg0) != 3) {
            this.method407((byte) 81, arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB[B)I", line = 44)
    public static final int method518(int arg0, int arg1, byte arg2, byte[] arg3) {
        int var4 = -94 % ((-arg2 - 20) / 32);
        field795++;
        int var5 = -1;
        for (int var6 = arg1; var6 < arg0; var6++) {
            var5 = class151.field1882[(var5 ^ arg3[var6]) & 0xFF] ^ var5 >>> 8;
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 69)
    public static final String method519(int arg0, String arg1) {
        field801++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (arg0 >= ~var3) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lhd;)V", line = 113)
    public class60(class773 arg0) {
        this.field798 = arg0;
        this.field799 = this.method405(false);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILhd;)V", line = 124)
    public class60(int arg0, class773 arg1) {
        this.field799 = arg0;
        this.field798 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBLgda;Lfs;)V", line = 136)
    public static final void method520(int arg0, byte arg1, class61 arg2, class582 arg3) {
        if (arg1 > -56) {
            field803 = -114;
        }
        field802++;
        if (class707.field9936 >= 50 || arg3 == null || arg3.field7938 == null || arg3.field7938.length <= arg0 || arg3.field7938[arg0] == null) {
            return;
        }
        int var4 = arg3.field7938[arg0][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        if (arg3.field7938[arg0].length > 1) {
            int var7 = (int) (Math.random() * (double) arg3.field7938[arg0].length);
            if (var7 > 0) {
                var5 = arg3.field7938[arg0][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg3.field7948 != null && arg3.field7959 != null) {
            var9 = arg3.field7948[arg0] + (int) (Math.random() * (double) (arg3.field7959[arg0] - arg3.field7948[arg0]));
        }
        int var10 = arg3.field7949 == null ? 255 : arg3.field7949[arg0];
        if (var8 == 0) {
            if (class300.field3596 == arg2) {
                if (!arg3.field7933) {
                    class676.method3809(0, var5, var9, var6, var10, 0);
                    return;
                }
                class731.method4131(0, var9, var10, var6, var5, false, 0);
            }
        } else if (class118.field1503.field10661.method1581(0) != 0) {
            int var11 = arg2.field823 - 256 >> 9;
            int var12 = arg2.field813 - 256 >> 9;
            int var13 = class300.field3596 == arg2 ? 0 : (var12 << 8) + ((arg2.field808 << 24) - (-(var11 << 16) - var8));
            class415.field5422[class707.field9936++] = new class228((byte) (arg3.field7933 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
    public abstract void method407(byte arg0, int arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)I")
    public abstract int method405(boolean arg0);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public abstract void method409(byte arg0);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)I")
    public abstract int method406(int arg0, int arg1);
}
