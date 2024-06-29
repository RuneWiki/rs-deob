import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class356 extends class77 {

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    private int field5457 = 0;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    private int field5461 = -1;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    private int field5455;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "Lth;")
    public static class57 field5456 = new class57(64);

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
    public static int[] field5465 = new int[2];

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public static boolean field5459 = false;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Lrk;")
    public static class137 field5460;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Lof;")
    public static class223 field5463;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lph;")
    public static class361 field5462;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Lph;")
    public static class361 field5469;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "[I")
    public static int[] field5468;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)V", line = 6)
    public static final void method2471(int arg0, byte arg1, int arg2) {
        field5458++;
        if (arg1 != 102) {
            method2471(-81, (byte) -106, -118);
        }
        class95 var3 = class227.method1699(14, -1855723168, arg2);
        var3.method738((byte) 77);
        var3.field1328 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        if (this.field5461 != -1) {
            class305.method2145(this.field5461, this.field5457, this.field5455);
            this.field5461 = -1;
            this.field5457 = 0;
        }
        super.finalize();
        field5467++;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)V", line = 38)
    public static void method2472(byte arg0) {
        field5462 = null;
        if (arg0 != 84) {
            field5466 = -49;
        }
        field5465 = null;
        field5460 = null;
        field5468 = null;
        field5463 = null;
        field5469 = null;
        field5456 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILph;)V", line = 57)
    public static final void method2473(int arg0, class361 arg1) {
        if (arg0 != 0) {
            return;
        }
        field5453++;
        class304.field4561 = arg1.method2505("p11_full", (byte) 118);
        class203.field2993 = arg1.method2505("p12_full", (byte) -95);
        class347.field5366 = arg1.method2505("b12_full", (byte) -67);
        class225.field3395 = arg1.method2505("hitmarks", (byte) 116);
        class312.field4654 = arg1.method2505("hitbar_default", (byte) -97);
        class273.field4142 = arg1.method2505("headicons_pk", (byte) -109);
        class167.field2397 = arg1.method2505("headicons_prayer", (byte) 74);
        class135.field1964 = arg1.method2505("hint_headicons", (byte) -42);
        class22.field334 = arg1.method2505("hint_mapmarkers", (byte) -86);
        class318.field4788 = arg1.method2505("mapflag", (byte) -103);
        class2.field86 = arg1.method2505("cross", (byte) 58);
        class28.field388 = arg1.method2505("mapdots", (byte) -98);
        class237.field3554 = arg1.method2505("scrollbar", (byte) -119);
        field5466 = arg1.method2505("name_icons", (byte) -61);
        class120.field1687 = arg1.method2505("floorshadows", (byte) 121);
        class96.field1360 = arg1.method2505("compass", (byte) -72);
        class298.field4458 = arg1.method2505("hint_mapedge", (byte) -125);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V", line = 124)
    public class356(int arg0) {
        GL var2 = class141.field2025;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field5461 = var3[0];
        this.field5455 = class305.field4573;
        class141.method1000(this.field5461);
        int var4 = class345.field5349[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class305.field4570 += var6.limit() - this.field5457;
        this.field5457 = var6.limit();
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V", line = 103)
    public final void method2474(int arg0) {
        field5454++;
        int var2 = class190.method1323(true);
        if ((var2 & 0x1) == 0) {
            class141.method1000(this.field5461);
        }
        if ((arg0 & var2) == 0) {
            class141.method986(0);
        }
        if ((var2 & 0x4) == 0) {
            class141.method1013(0);
        }
    }
}
