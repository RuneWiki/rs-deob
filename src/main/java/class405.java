import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class405 extends class100 {

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field5709 = 0;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "J")
    public static long field5711;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "[B")
    private byte[] field5706;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "[[Lqf;")
    public static class783[][] field5707;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method713(int arg0, int arg1, byte arg2) {
        field5712++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + arg1);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field5706[var10001] = var4;
        this.field5706[var6] = var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[SI)[S", line = 17)
    public static final short[] method2482(int arg0, short[] arg1, int arg2) {
        if (arg0 == 2) {
            field5710++;
            short[] var3 = new short[arg2];
            class335.method2119(arg1, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)Z", line = 31)
    public static final boolean method2483(int arg0, int arg1, int arg2) {
        if (arg1 >= -96) {
            return false;
        } else {
            field5708++;
            return class140.method930(arg0, arg2, -20667) || class403.method2473(arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)[B", line = 44)
    public final byte[] method2484(int arg0, int arg1, int arg2, int arg3) {
        this.field5706 = new byte[arg1 * arg3 * arg0 * 2];
        field5713++;
        if (arg2 != 0) {
            method2485((byte) -43);
        }
        this.method1806(arg3, arg1, (byte) -85, arg0);
        return this.field5706;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V", line = 58)
    public static void method2485(byte arg0) {
        if (arg0 != 69) {
            method2483(113, -109, 110);
        }
        field5707 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 73)
    public class405() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
