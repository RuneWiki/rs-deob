import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class412 implements class640 {

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Z")
    private boolean field5463 = false;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    private int field5460;

    @OriginalMember(owner = "client!uda", name = "u", descriptor = "Lap;")
    public class435 field5478;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "Z")
    private boolean field5459;

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public int field5464;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "[Lij;")
    public static class383[] field5458 = new class383[2048];

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "F")
    public static float field5472;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!uda", name = "p", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!uda", name = "t", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!uda", name = "v", descriptor = "J")
    public static long field5479;

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5471;

    @OriginalMember(owner = "client!uda", name = "s", descriptor = "Z")
    public static boolean field5476;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public final void method2228(int arg0) {
        field5462++;
        if (this.field5466 > 0) {
            this.field5478.method2339(this.method2234((byte) -106), this.field5466, 81);
            this.field5466 = 0;
        }
        if (arg0 > -60) {
            method2231(100, null, null, null, 26, null, null, -53, -46);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)Z")
    public final boolean method2229(byte arg0) {
        field5465++;
        if (arg0 >= -33) {
            this.method2235((byte) -73);
        }
        if (!this.field5478.field6063) {
            return false;
        }
        int var2 = this.method2234((byte) -74);
        this.field5478.method2388((byte) 96, this);
        OpenGL.glGenerateMipmapEXT(this.field5464);
        this.field5459 = true;
        this.method2230(-128);
        this.method2236((byte) 106, var2);
        return true;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    private final void method2230(int arg0) {
        if (arg0 > -127) {
            return;
        }
        this.field5478.method2388((byte) -54, this);
        field5461++;
        if (this.field5463) {
            OpenGL.glTexParameteri(this.field5464, 10241, this.field5459 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5464, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5464, 10241, this.field5459 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5464, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
    public static final void method2231(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        field5475++;
        class165 var9 = class561.field7978[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class561.field7978[var10] = class561.field7978[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class165(arg0, arg8, arg2, arg1, arg6, arg5, arg4, arg3);
        } else {
            var9.method994(arg0, arg5, arg6, arg1, (byte) -34, arg3, arg2, arg4, arg8);
        }
        class304.field3981 = class204.field2494;
        class561.field7978[0] = var9;
        class382.field5127++;
        if (arg7 != -20468) {
            method2237(-40);
        }
    }

    @OriginalMember(owner = "client!uda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5477++;
        this.method2228(-90);
        super.finalize();
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BZ)V")
    public final void method2232(byte arg0, boolean arg1) {
        if (this.field5459 != arg1) {
            int var3 = this.method2234((byte) -74);
            this.field5459 = true;
            this.method2230(-128);
            this.method2236((byte) 95, var3);
        }
        field5474++;
        if (arg0 != -3) {
            this.method2230(74);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(BZ)V")
    public final void method2233(byte arg0, boolean arg1) {
        if (arg0 != -99) {
            method2237(104);
        }
        field5468++;
        if (arg1 != this.field5463) {
            this.field5463 = arg1;
            this.method2230(-128);
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lap;IIIZ)V")
    public class412(class435 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5460 = arg3;
        this.field5478 = arg0;
        this.field5459 = arg4;
        this.field5470 = arg2;
        this.field5464 = arg1;
        OpenGL.glGenTextures(1, class50.field533, 0);
        this.field5466 = class50.field533[0];
        this.method2236((byte) 113, 0);
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)I")
    private final int method2234(byte arg0) {
        field5467++;
        if (arg0 >= -42) {
            field5472 = -0.6255333F;
        }
        int var2 = this.field5478.method2340(this.field5470, false) * this.field5460;
        return this.field5459 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(B)I")
    public final int method2235(byte arg0) {
        if (arg0 == 53) {
            field5469++;
            return this.field5466;
        } else {
            return 85;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)V")
    private final void method2236(byte arg0, int arg1) {
        if (arg0 >= 71) {
            this.field5478.field5942 -= arg1;
            field5473++;
            this.field5478.field5942 += this.method2234((byte) -48);
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)V")
    public static void method2237(int arg0) {
        field5471 = null;
        field5458 = null;
        if (arg0 < 96) {
            field5476 = true;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public abstract void method260(byte arg0);
}
