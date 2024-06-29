import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class281 extends class266 {

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    private int field4760 = 0;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    private int field4763 = -1;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    private int field4753;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "[I")
    public static int[] field4761 = new int[2];

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Lma;")
    public static class5 field4762 = class12.method119("", (byte) 74);

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "Ltj;")
    public static class73 field4751 = new class73(64);

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Lma;")
    private static class5 field4764 = class12.method119("Continue", (byte) 111);

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lma;")
    public static class5 field4767 = field4764;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V", line = 6)
    public static final void method1900(int arg0) {
        class179.field2712.method523(123);
        if (arg0 != -1) {
            method1905(-35);
        }
        field4755++;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 17)
    public final void method1901(int arg0) {
        field4754++;
        int var2 = -62 % ((-arg0 - 80) / 40);
        int var3 = class90.method591((byte) -14);
        if ((var3 & 0x1) == 0) {
            class45.method321(this.field4763);
        }
        if ((var3 & 0x2) == 0) {
            class45.method330(0);
        }
        if ((var3 & 0x4) == 0) {
            class45.method305(0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V", line = 38)
    public static final void method1902(boolean arg0) {
        class177.field2703 = -1;
        field4756++;
        class167.field2549 = -1;
        class15.field281 = 0;
        class147.field2127.field3610 = 0;
        class213.field3383 = 0;
        class88.field1317 = 0;
        class240.field3988 = -1;
        class200.field3184.field3610 = 0;
        class171.field2625 = 0;
        class282.field4794 = 0;
        class100.field1499 = 0;
        class242.field4027 = -1;
        if (!arg0) {
            return;
        }
        class251.field4162 = false;
        for (int var1 = 0; var1 < class267.field4593.length; var1++) {
            if (class267.field4593[var1] != null) {
                class267.field4593[var1].field223 = -1;
            }
        }
        for (int var2 = 0; var2 < class119.field1804.length; var2++) {
            if (class119.field1804[var2] != null) {
                class119.field1804[var2].field223 = -1;
            }
        }
        class11.method113(44);
        class270.field4631 = 1;
        class112.method741(30, 5);
        for (int var3 = 0; var3 < 100; var3++) {
            class296.field4975[var3] = true;
        }
        class61.field945.method1474((byte) 42);
        class80.method551(-6);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILnc;)V", line = 100)
    public static final void method1903(int arg0, class12 arg1) {
        int var2 = arg1.field198 - class50.field784;
        if (arg1.field203 == 0) {
            arg1.field215 = 1024;
        }
        if (arg1.field203 == 1) {
            arg1.field215 = 1536;
        }
        arg1.field181 = 0;
        int var3 = arg1.field226 * 64 + arg1.field179 * 128;
        if (arg1.field203 == 2) {
            arg1.field215 = 0;
        }
        arg1.field178 += (var3 - arg1.field178) / var2;
        if (arg0 != 512) {
            field4765 = -81;
        }
        if (arg1.field203 == 3) {
            arg1.field215 = 512;
        }
        int var4 = arg1.field226 * 64 + arg1.field209 * 128;
        field4752++;
        arg1.field211 += (var4 - arg1.field211) / var2;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V", line = 145)
    public static void method1904(int arg0) {
        field4762 = null;
        field4751 = null;
        int var1 = 21 % ((4 - arg0) / 48);
        field4761 = null;
        field4767 = null;
        field4764 = null;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V", line = 159)
    public static final void method1905(int arg0) {
        class246.field4084++;
        class147.field2127.method1389((byte) 124, 233);
        field4759++;
        if (arg0 > -38) {
            field4766 = -94;
        }
        for (class174 var1 = (class174) class81.field1253.method1379(true); var1 != null; var1 = (class174) class81.field1253.method1380((byte) 66)) {
            if (var1.field2663 == 0) {
                class301.method2044(true, 29786, var1);
            }
        }
        if (class73.field1145 != null) {
            class29.method205(class73.field1145, (byte) 123);
            class73.field1145 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 191)
    protected final void finalize() throws Throwable {
        if (this.field4763 != -1) {
            class36.method262(this.field4763, this.field4760, this.field4753);
            this.field4760 = 0;
            this.field4763 = -1;
        }
        field4757++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V", line = 220)
    public class281(int arg0) {
        GL var2 = class45.field688;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field4763 = var3[0];
        this.field4753 = class36.field576;
        class45.method321(this.field4763);
        int var4 = class229.field3791[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class36.field574 += var6.limit() - this.field4760;
        this.field4760 = var6.limit();
    }
}
