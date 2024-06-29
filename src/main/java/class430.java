import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class430 extends class89 implements class416 {

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    private int field6103 = -1;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    private int field6097 = -1;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Lug;")
    private class395 field6106;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public int field6108;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    private int field6104;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public int field6109;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private int field6095;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lud;")
    public static class27 field6098 = new class27(9, 0, 4, 1);

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field6105;

    static {
        new class335("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field6107 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 5)
    public static void method2517(int arg0) {
        field6098 = null;
        int var1 = -99 % ((-arg0 - 65) / 36);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 15)
    public final void method2518(byte arg0) {
        if (this.field6100 > 0) {
            this.field6106.method2308(this.field6095, this.field6100, arg0 + 85);
            this.field6100 = 0;
        }
        field6102++;
        if (arg0 != -83) {
            method2517(25);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V", line = 32)
    public static final void method2519(int arg0, boolean arg1) {
        if (arg1) {
            if (class277.field3510 != -1) {
                class9.method60((byte) -81, class277.field3510);
            }
            for (class175 var2 = (class175) class397.field5684.method2021(-106); var2 != null; var2 = (class175) class397.field5684.method2017(-108)) {
                if (!var2.method2166(arg0 ^ 0xB48)) {
                    var2 = (class175) class397.field5684.method2021(arg0 - 2919);
                    if (var2 == null) {
                        break;
                    }
                }
                class290.method1706(var2, 103, true, false);
            }
            class277.field3510 = -1;
            class397.field5684 = new class352(8);
            class386.method2179(arg0 - 2888);
            class277.field3510 = class428.field6077;
            class161.method1039(false, arg0 - 2765);
            class68.method604(-9192);
            class239.method1438(class277.field3510);
        }
        field6096++;
        class209.field2709 = false;
        class361.field4657 = "";
        class493.field7171 = "";
        if (arg0 != 2888) {
            method2517(115);
        }
        class342.method1969(true);
        class236.field3000 = -1;
        class329.method1915((byte) 126, class298.field3838);
        class23.field336 = new class223();
        class23.field336.field2677 = class440.field6307 * 128 / 2;
        class23.field336.field4944[0] = class452.field6526 / 2;
        class23.field336.field2666 = class452.field6526 * 128 / 2;
        class193.field2500 = 0;
        class310.field3971 = 0;
        class23.field336.field4936[0] = class440.field6307 / 2;
        if (class142.field1835 == 2) {
            class193.field2500 = class450.field6452 << 7;
            class310.field3971 = class212.field2731 << 7;
        } else {
            class57.method540((byte) 113);
        }
        class38.method340(arg0 ^ 0xFFFFA118);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 93)
    public final void method864(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6103, this.field6097, 36161, 0);
        field6099++;
        this.field6097 = -1;
        this.field6103 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V", line = 113)
    protected final void finalize() throws Throwable {
        this.method2518((byte) -83);
        field6101++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lug;III)V", line = 157)
    public class430(class395 arg0, int arg1, int arg2, int arg3) {
        this.field6106 = arg0;
        this.field6108 = arg3;
        this.field6104 = arg1;
        this.field6109 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class25.field370, 0);
        this.field6100 = class25.field370[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6100);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6104, this.field6109, this.field6108);
        this.field6095 = this.field6108 * this.field6109 * this.field6106.method2297(this.field6104, (byte) -88);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lug;IIII)V", line = 172)
    public class430(class395 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6106 = arg0;
        this.field6104 = arg1;
        this.field6109 = arg2;
        this.field6108 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class25.field370, 0);
        this.field6100 = class25.field370[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6100);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6104, this.field6109, this.field6108);
        this.field6095 = this.field6109 * this.field6108 * this.field6106.method2297(this.field6104, (byte) -32);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 139)
    public final void method2520(int arg0, int arg1, int arg2) {
        field6105++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.field6100);
        this.field6097 = arg0;
        this.field6103 = arg1;
        if (arg2 <= 49) {
            this.field6095 = -26;
        }
    }
}
