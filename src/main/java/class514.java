import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class514 extends class379 {

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field7245;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public int field7248;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public int field7251;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public int field7249;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Z")
    public boolean field7253;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public int field7246;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lbt;")
    public static class48 field7247;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method3079(int arg0) {
        field7247 = null;
        if (arg0 <= 78) {
            method3080(92, 71, null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILfs;)V")
    public static final void method3080(int arg0, int arg1, class582 arg2) {
        field7252++;
        if (class707.field9936 >= 50 || arg2 == null || arg2.field7938 == null || arg0 >= arg2.field7938.length || arg2.field7938[arg0] == null) {
            return;
        }
        if (arg1 != 641545256) {
            method3079(20);
        }
        int var3 = arg2.field7938[arg0][0];
        int var4 = var3 >> 8;
        int var5 = (var3 & 0xE5) >> 5;
        if (arg2.field7938[arg0].length > 1) {
            int var6 = (int) ((double) arg2.field7938[arg0].length * Math.random());
            if (var6 > 0) {
                var4 = arg2.field7938[arg0][var6];
            }
        }
        int var7 = 256;
        if (arg2.field7948 != null && arg2.field7959 != null) {
            var7 = class12.method186(arg2.field7959[arg0], arg1 ^ 0xD9C2CBA9, arg2.field7948[arg0]);
        }
        if (arg2.field7933) {
            class731.method4131(0, var7, 255, var5, var4, false, 0);
        } else {
            class676.method3809(0, var4, var7, var5, 255, arg1 - 641545256);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
    public static final int method3081(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        if (arg3 == 8425) {
            field7250++;
            return (arg1 >> 1) + (((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7));
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIZ)V")
    public class514(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7245 = arg1;
        this.field7248 = arg0;
        this.field7251 = arg3;
        this.field7249 = arg2;
        this.field7253 = arg5;
        this.field7246 = arg4;
    }
}
