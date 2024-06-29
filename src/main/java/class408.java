import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class408 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lis;")
    public class349 field6089 = null;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[Lfo;")
    public class361[] field6090 = null;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Lis;")
    public class349 field6093 = null;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[Lfo;")
    public class361[] field6096 = null;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lis;")
    public class349 field6092 = null;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Z")
    public boolean field6091;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)I")
    public static final int method2569(int arg0, int arg1, int arg2) {
        if (arg0 != -106766689) {
            method2570(true, -47, 58, 23, 110);
        }
        field6094++;
        int var3 = arg1 >> 31 & arg2 - 1;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZIIII)Z")
    public static final boolean method2570(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6095++;
        if ((class476.field6873[0][arg1][arg4] & 0x2) != 0) {
            return true;
        }
        if (arg0) {
            field6097 = -67;
        }
        if ((class476.field6873[arg2][arg1][arg4] & 0x10) == 0) {
            return class432.method2679(arg4, (byte) -117, arg1, arg2) == arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lkd;)V")
    public class408(class188 arg0) {
        this.field6091 = arg0.field3152;
        class218.method1569(16, arg0);
        if (this.field6091) {
            byte[] var6 = class191.method1338(class474.field6837, false, 0);
            this.field6093 = new class349(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class191.method1338(class89.field1273, false, 0);
            this.field6089 = new class349(arg0, 6410, 128, 128, 16, var7, 6410);
            class203 var8 = arg0.field3026;
            if (var8.method1418(0)) {
                byte[] var9 = class191.method1338(class434.field6424, false, 0);
                this.field6092 = new class349(arg0, 6408, 128, 128, 16);
                class349 var10 = new class349(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1417(this.field6092, 119, 2.0F, var10)) {
                    this.field6092.method2759(95);
                } else {
                    this.field6092.method2763((byte) 75);
                    this.field6092 = null;
                }
                var10.method2763((byte) 75);
            }
        } else {
            this.field6090 = new class361[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class529.method3134(class474.field6837, var2 * 16384 * 2, 32768, false);
                this.field6090[var2] = new class361(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field6096 = new class361[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class529.method3134(class89.field1273, var3 * 128 * 128 * 2, 32768, false);
                this.field6096[var3] = new class361(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
