import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class class146 {

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lbv;")
    public class282 field2098;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    private int field2091;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Z")
    private boolean field2097;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Lui;")
    public static class375 field2094 = new class375("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z[BI)V")
    public final void method969(boolean arg0, byte[] arg1, int arg2) {
        this.method971(arg0);
        field2092++;
        if (arg2 > this.field2091) {
            OpenGL.glBufferDataARBub(this.field2095, arg2, arg1, 0, this.field2097 ? 35040 : 35044);
            this.field2098.field4097 += arg2 - this.field2091;
            this.field2091 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field2095, 0, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
    public static final void method970(int arg0, int arg1) {
        field2093++;
        if (arg1 != -15581) {
            field2094 = null;
        }
        class377 var2 = class99.method672(arg0, false, 16);
        var2.method2339(arg1 + 3893);
    }

    @OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2099++;
        this.field2098.method1836(this.field2096, 1, this.field2091);
        super.finalize();
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
    public abstract void method971(boolean arg0);

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lbv;I[BIZ)V")
    public class146(class282 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2098 = arg0;
        this.field2095 = arg1;
        this.field2091 = arg3;
        this.field2097 = arg4;
        OpenGL.glGenBuffersARB(1, class417.field6234, 0);
        this.field2096 = class417.field6234[0];
        this.method971(false);
        OpenGL.glBufferDataARBub(arg1, this.field2091, arg2, 0, this.field2097 ? 35040 : 35044);
        this.field2098.field4097 += this.field2091;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lbv;ILjaggl/memory/NativeBuffer;IZ)V")
    public class146(class282 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field2091 = arg3;
        this.field2097 = arg4;
        this.field2095 = arg1;
        this.field2098 = arg0;
        OpenGL.glGenBuffersARB(1, class417.field6234, 0);
        this.field2096 = class417.field6234[0];
        this.method971(false);
        OpenGL.glBufferDataARBa(arg1, this.field2091, arg2.method148(), this.field2097 ? 35040 : 35044);
        this.field2098.field4097 += this.field2091;
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
    public static void method972(int arg0) {
        if (arg0 == 1) {
            field2094 = null;
        }
    }
}
