import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class608 extends class159 {

    @OriginalMember(owner = "client!kha", name = "u", descriptor = "Z")
    public boolean field8225 = false;

    @OriginalMember(owner = "client!kha", name = "A", descriptor = "Z")
    public boolean field8231 = true;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "[I")
    public static int[] field8229 = new int[13];

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    public int field8215;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "I")
    public int field8217;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
    public int field8220;

    @OriginalMember(owner = "client!kha", name = "q", descriptor = "I")
    public int field8221;

    @OriginalMember(owner = "client!kha", name = "s", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!kha", name = "t", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!kha", name = "v", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!kha", name = "w", descriptor = "I")
    public int field8227;

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
    public int field8228;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "I")
    public int field8230;

    @OriginalMember(owner = "client!kha", name = "B", descriptor = "I")
    public int field8232;

    @OriginalMember(owner = "client!kha", name = "C", descriptor = "I")
    public int field8233;

    @OriginalMember(owner = "client!kha", name = "r", descriptor = "Ljca;")
    public class711 field8222;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)I")
    public static final int method3383(int arg0) {
        field8224++;
        return ~class206.field2664 == arg0 ? class169.field2222 : class265.field3899;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILjava/net/Socket;)Lqia;")
    public static final class23 method3384(int arg0, int arg1, Socket arg2) throws IOException {
        field8219++;
        if (arg0 != -25141) {
            method3386(null, -42, 9);
        }
        return new class688(arg2, arg1);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)Z")
    public static final boolean method3385(int arg0, int arg1, int arg2) {
        field8223++;
        int var3 = -82 / ((arg2 + 42) / 37);
        return class328.method2119(arg0, arg1, -39) | (arg1 & 0x70000) != 0 || class521.method3030(arg0, -41, arg1);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "([Lfq;II)V")
    public static final void method3386(class214[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class214 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2806;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2806 < (var7 & 0x1) + var6) {
                class214 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method3386(arg0, arg1, var4 - 1);
        method3386(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IBIII)V")
    public static final void method3387(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 98 % ((arg1 - 2) / 63);
        field8216++;
        class778 var6 = class389.method2406(110, (long) arg2, 4);
        var6.method4274(119);
        var6.field10692 = arg0;
        var6.field10690 = arg3;
        var6.field10693 = arg4;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B[BI)[B")
    public static final byte[] method3388(byte arg0, byte[] arg1, int arg2) {
        field8218++;
        byte[] var3 = new byte[arg2];
        class421.method2534(arg1, 0, var3, 0, arg2);
        if (arg0 != 31) {
            method3385(41, 51, -100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)V")
    public static void method3389(boolean arg0) {
        field8229 = null;
        if (!arg0) {
            field8229 = null;
        }
    }
}
