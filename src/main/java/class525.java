import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class525 {

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    private int field7690;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lkd;")
    public class188 field7681;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
    private boolean field7680;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    private int field7682;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lak;")
    public static class234 field7678 = new class234("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lak;")
    public static class234 field7687 = new class234("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field7688 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "[I")
    public static int[] field7689 = new int[32];

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lul;")
    public static class406 field7684;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BII)V")
    public final void method3116(byte[] arg0, int arg1, int arg2) {
        this.method160(-20485);
        int var4 = -44 % ((-arg1 - 47) / 47);
        field7683++;
        if (this.field7690 < arg2) {
            OpenGL.glBufferDataARBub(this.field7682, arg2, arg0, 0, this.field7680 ? 35040 : 35044);
            this.field7681.field3041 += arg2 - this.field7690;
            this.field7690 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field7682, 0, arg2, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public abstract void method160(int arg0);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public static final void method3117(byte arg0) {
        class364.field5379.method1494(101);
        field7686++;
        for (int var1 = 0; var1 < 32; var1++) {
            class237.field3812[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 != -110) {
            return;
        }
        while (var2 < 32) {
            class191.field3223[var2] = 0L;
            var2++;
        }
        class375.field5615 = 0;
    }

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7685++;
        this.field7681.method1280(106, this.field7690, this.field7679);
        super.finalize();
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public static void method3118(int arg0) {
        field7687 = null;
        field7684 = null;
        field7689 = null;
        field7678 = null;
        if (arg0 > -56) {
            method3118(39);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lkd;I[BIZ)V")
    public class525(class188 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field7690 = arg3;
        this.field7681 = arg0;
        this.field7680 = arg4;
        this.field7682 = arg1;
        OpenGL.glGenBuffersARB(1, class503.field7255, 0);
        this.field7679 = class503.field7255[0];
        this.method160(-20485);
        OpenGL.glBufferDataARBub(arg1, this.field7690, arg2, 0, this.field7680 ? 35040 : 35044);
        this.field7681.field3041 += this.field7690;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lkd;ILjaggl/memory/NativeBuffer;IZ)V")
    public class525(class188 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field7681 = arg0;
        this.field7682 = arg1;
        this.field7680 = arg4;
        this.field7690 = arg3;
        OpenGL.glGenBuffersARB(1, class503.field7255, 0);
        this.field7679 = class503.field7255[0];
        this.method160(-20485);
        OpenGL.glBufferDataARBa(arg1, this.field7690, arg2.method2717(), this.field7680 ? 35040 : 35044);
        this.field7681.field3041 += this.field7690;
    }
}
