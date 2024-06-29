import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class294 extends class325 {

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    private int field4535 = 0;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field4533 = -1;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    private int field4540;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "La;")
    public static class281 field4534 = new class281();

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZ)V", line = 7)
    public static final void method2029(boolean arg0, boolean arg1) {
        class179.method1345(class133.field2026, class144.field2206, class65.field950, class130.field2000);
        field4539++;
        class179.method1339(class132.field2021, class106.field1541, arg1);
        class179.method1343((float) class171.field2764, (float) class207.field3169, (float) class139.field2086);
        if (arg0) {
            return;
        }
        class179.method1340();
        class282.field4385 = class240.field3666;
        class61.field806 = class101.field1452;
        class282.field4388 = class300.field4615;
        class282.field4384 = class52.field706;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V", line = 27)
    public static final void method2030(boolean arg0) {
        class79.field1166++;
        if (arg0) {
            method2035(91, -33, 76);
        }
        field4538++;
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        field4541++;
        if (this.field4533 != -1) {
            class80.method625(this.field4533, this.field4535, this.field4540);
            this.field4533 = -1;
            this.field4535 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIZ)V", line = 54)
    public static final void method2031(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class212.field3261 <= arg2 && class182.field2888 >= arg2) {
            int var5 = class335.method2343(-1, class234.field3569, arg0, class322.field4965);
            int var6 = class335.method2343(-1, class234.field3569, arg3, class322.field4965);
            class305.method2092(var5, var6, arg2, true, arg1);
        }
        field4537++;
        if (arg4) {
            method2031(-44, -62, 78, -25, true);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V", line = 73)
    public static final void method2032(boolean arg0, int arg1) {
        class174.field2811 = 99;
        field4532++;
        class231.field3516 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class43.field615 = new int[104];
        class217.field3325 = new byte[var2][104][104];
        class13.field179 = new byte[var2][105][105];
        if (arg1 < 106) {
            return;
        }
        class13.field165 = new int[104];
        class183.field2900 = new byte[var2][104][104];
        class333.field5199 = new byte[var2][104][104];
        class283.field4396 = new int[var2][105][105];
        class189.field2970 = new byte[var2][104][104];
        class142.field2185 = new int[5];
        class181.field2870 = new int[104];
        class291.field4474 = new int[104];
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 102)
    public final void method2033(int arg0) {
        if (arg0 != 30702) {
            method2032(false, -58);
        }
        field4536++;
        int var2 = class196.method1433((byte) 118);
        if ((var2 & 0x1) == 0) {
            class73.method537(this.field4533);
        }
        if ((var2 & 0x2) == 0) {
            class73.method519(0);
        }
        if ((var2 & 0x4) == 0) {
            class73.method548(0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V", line = 177)
    public class294(int arg0) {
        GL var2 = class73.field1051;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field4533 = var3[0];
        this.field4540 = class80.field1183;
        class73.method537(this.field4533);
        int var4 = class164.field2659[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class80.field1186 += var6.limit() - this.field4535;
        this.field4535 = var6.limit();
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V", line = 129)
    public static void method2034(byte arg0) {
        field4534 = null;
        if (arg0 != -92) {
            field4534 = (class281) null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Lcn;", line = 152)
    public static final class228 method2035(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1169; var4++) {
            class228 var5 = var3.field1157[var4];
            if ((var5.field3482 >> 29 & 0x3L) == 2L && var5.field3472 == arg1 && var5.field3475 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
