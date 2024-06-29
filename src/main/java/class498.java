import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class498 {

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Z")
    private boolean field7495;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    private int field7489;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    private int field7490;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lna;")
    public class211 field7496;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public int field7493;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field7487 = new int[6];

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[I")
    public static int[] field7494 = new int[256];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lhd;")
    public static class242 field7492;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIII)V")
    public static final void method3047(byte arg0, int arg1, int arg2, int arg3) {
        field7488++;
        int var4 = arg3 + class453.field7018;
        int var5 = class126.field1718 + arg1;
        if (class217.field3699 == null || arg3 < 0 || arg1 < 0 || arg3 >= class135.field1839 || arg1 >= class197.field3038) {
            return;
        }
        long var6 = (long) (arg2 << 28 | var5 << 14 | var4);
        class257 var8 = (class257) class328.field5157.method1122((byte) 59, var6);
        if (var8 == null) {
            class511.method3088(arg2, arg3, arg1);
            return;
        }
        class454 var9 = (class454) var8.field4153.method2123(112);
        if (var9 == null) {
            class511.method3088(arg2, arg3, arg1);
            return;
        }
        class466 var10 = (class466) class511.method3088(arg2, arg3, arg1);
        if (var10 == null) {
            var10 = new class466();
        } else {
            var10.field7139 = var10.field7142 = -1;
        }
        var10.field7136 = var9.field7033;
        var10.field7140 = var9.field7025;
        label51: while (true) {
            class454 var11 = (class454) var8.field4153.method2126((byte) 61);
            if (var11 == null) {
                break;
            }
            if (var10.field7136 != var11.field7033) {
                var10.field7137 = var11.field7025;
                var10.field7139 = var11.field7033;
                while (true) {
                    class454 var12 = (class454) var8.field4153.method2126((byte) 61);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field7136 != var12.field7033 && var10.field7139 != var12.field7033) {
                        var10.field7142 = var12.field7033;
                        var10.field7135 = var12.field7025;
                    }
                }
            }
        }
        int var13 = class532.method3165(arg2, (arg3 << 7) + 64, false, (arg1 << 7) + 64);
        if (arg0 >= -41) {
            field7494 = null;
        }
        class262.method1793(arg2, arg3, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[BI)V")
    public final void method3048(int arg0, byte[] arg1, int arg2) {
        this.method137((byte) 35);
        if (arg0 != -2769) {
            return;
        }
        field7491++;
        if (arg2 > this.field7489) {
            OpenGL.glBufferDataARBub(this.field7490, arg2, arg1, 0, this.field7495 ? 35040 : 35044);
            this.field7496.field3493 += arg2 - this.field7489;
            this.field7489 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field7490, 0, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lna;I[BIZ)V")
    public class498(class211 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field7495 = arg4;
        this.field7489 = arg3;
        this.field7490 = arg1;
        this.field7496 = arg0;
        OpenGL.glGenBuffersARB(1, class361.field5588, 0);
        this.field7493 = class361.field5588[0];
        this.method137((byte) 35);
        OpenGL.glBufferDataARBub(arg1, this.field7489, arg2, 0, this.field7495 ? 35040 : 35044);
        this.field7496.field3493 += this.field7489;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
    public abstract void method137(byte arg0);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static void method3049(int arg0) {
        field7487 = null;
        field7494 = null;
        if (arg0 != 140735399) {
            method3047((byte) -105, -93, -88, -60);
        }
        field7492 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lna;ILjaggl/memory/NativeBuffer;IZ)V")
    public class498(class211 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field7489 = arg3;
        this.field7495 = arg4;
        this.field7496 = arg0;
        this.field7490 = arg1;
        OpenGL.glGenBuffersARB(1, class361.field5588, 0);
        this.field7493 = class361.field5588[0];
        this.method137((byte) 35);
        OpenGL.glBufferDataARBa(arg1, this.field7489, arg2.method112(), this.field7495 ? 35040 : 35044);
        this.field7496.field3493 += this.field7489;
    }

    @OriginalMember(owner = "client!gj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7497++;
        this.field7496.method1551((byte) -44, this.field7493, this.field7489);
        super.finalize();
    }
}
