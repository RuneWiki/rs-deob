import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class73 extends class199 {

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    private int field1199 = 0;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    private int field1198 = -1;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Lpg;")
    public static class320 field1193 = new class320(260);

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1205 = "Connected to update server";

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "[I")
    public static int[] field1204 = new int[2];

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "Z")
    public static boolean field1203 = false;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lsn;")
    public static class319 field1202;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "[I")
    public static int[] field1201;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)V", line = 6)
    public static final void method545(int arg0, int arg1) {
        field1194++;
        class43.field689.method2175(arg0, -1401253017);
        class276.field4260.method2175(arg0, -1401253017);
        class165.field2477.method2175(arg0, -1401253017);
        if (arg1 <= 110) {
            method546((byte) -122);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 23)
    public static void method546(byte arg0) {
        field1205 = null;
        if (arg0 < 34) {
            method545(31, -59);
        }
        field1201 = null;
        field1202 = null;
        field1204 = null;
        field1193 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V", line = 76)
    public class73(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class94.field1473;
        var3.glGenTextures(1, var2, 0);
        this.field1200 = class198.field2966;
        this.field1198 = var2[0];
        class94.method698(this.field1198);
        int var4 = class15.field215[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class198.field2961 += var6.limit() - this.field1199;
        this.field1199 = var6.limit();
    }

    @OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field1195++;
        if (this.field1198 != -1) {
            class198.method1404(this.field1198, this.field1199, this.field1200);
            this.field1198 = -1;
            this.field1199 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V", line = 107)
    public final void method547(int arg0) {
        field1192++;
        int var2 = class205.method1453(-29705);
        if ((var2 & 0x1) == 0) {
            class94.method698(this.field1198);
        }
        if ((var2 & 0x2) == 0) {
            class94.method677(0);
        }
        if (arg0 != 2477) {
            field1204 = (int[]) null;
        }
        if ((var2 & 0x4) == 0) {
            class94.method675(0);
        }
    }
}
