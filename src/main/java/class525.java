import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class525 implements class489 {

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private int field7513 = -1;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    private int field7504 = 0;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    private int field7517;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
    private boolean field7510;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lag;")
    private class587 field7509;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Lbu;")
    public static class19 field7519;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Llu;")
    public static class610 field7520;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    private int field7512;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    private int field7518;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7508;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    private final void method3092(int arg0) {
        if (arg0 != 11376) {
            this.method282(50, true);
        }
        field7503++;
        if (this.field7513 >= 0) {
            return;
        }
        if (this.field7509.field8713) {
            OpenGL.glGenBuffersARB(1, class199.field2931, 0);
            this.field7513 = class199.field2931[0];
            OpenGL.glBindBufferARB(this.field7517, this.field7513);
        } else {
            this.field7513 = 0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public Buffer method282(int arg0, boolean arg1) {
        field7516++;
        if (this.field7504 == 0) {
            this.method3092(11376);
            if (this.field7513 <= 0) {
                this.field7504 = 2;
                return this.field7508;
            }
            OpenGL.glBindBufferARB(this.field7517, this.field7513);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field7517, this.field7512, null, 0, this.field7510 ? 35040 : 35044);
                if (this.field7518 <= this.field7509.field5907.field8515) {
                    this.field7504 = 1;
                    return this.field7509.field5907;
                }
            }
            MapBuffer var3 = this.field7509.field8704;
            if (!var3.method3220() && var3.method3218(this.field7517, this.field7518, 35001)) {
                this.field7504 = 2;
                return var3;
            }
        }
        return arg0 == -13803 ? null : null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljaclib/memory/Source;BI)Z")
    public final boolean method3093(Source arg0, byte arg1, int arg2) {
        field7515++;
        if (arg2 > this.field7512) {
            this.method3092(11376);
            if (this.field7513 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field7517, this.field7513);
            OpenGL.glBufferDataARBa(this.field7517, arg2, arg0.getAddress(), this.field7510 ? 35040 : 35044);
            this.field7509.field6083 += arg2 - this.field7518;
            this.field7512 = arg2;
        } else if (this.field7513 > 0) {
            OpenGL.glBindBufferARB(this.field7517, this.field7513);
            OpenGL.glBufferSubDataARBa(this.field7517, 0, this.field7518, arg0.getAddress());
            this.field7509.field6083 += arg2 - this.field7518;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field7518 = arg2;
        if (arg1 > -18) {
            this.field7510 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z")
    public boolean method280(int arg0) {
        if (arg0 != 28596) {
            return false;
        }
        field7501++;
        boolean var2 = true;
        if (this.field7504 != 0) {
            if (this.field7513 > 0) {
                OpenGL.glBindBufferARB(this.field7517, this.field7513);
                if (this.field7504 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field7517, 0, this.field7512, this.field7509.field5907.getAddress());
                } else {
                    var2 = this.field7509.field8704.method3219();
                }
            }
            this.field7504 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I")
    public int method288(int arg0) {
        field7514++;
        if (arg0 != 247) {
            this.method3093(null, (byte) 118, 115);
        }
        return this.field7518;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static void method3094(int arg0) {
        field7519 = null;
        if (arg0 == -7262) {
            field7520 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)J")
    public final long method3095(byte arg0) {
        if (arg0 != -62) {
            this.method280(70);
        }
        field7506++;
        return this.field7513 == 0 ? this.field7508.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public final void method3096(boolean arg0) {
        field7511++;
        if (!arg0) {
            this.field7512 = 85;
        }
        if (this.field7509.field8713) {
            OpenGL.glBindBufferARB(this.field7517, this.field7513);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBII)V")
    public static final void method3097(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7505++;
        if (arg2 > -91) {
            return;
        }
        if (class50.field589 == 1) {
            class600.field8847[class588.field8730 / 100].method316(class630.field9255 - 8, class94.field1400 - 8);
        }
        if (class50.field589 == 2) {
            class600.field8847[class588.field8730 / 100 + 4].method316(class630.field9255 - 8, class94.field1400 + -8);
        }
        class78.method603(-128);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public void method287(int arg0, int arg1) {
        if (arg0 > -71) {
            return;
        }
        if (arg1 > this.field7512) {
            this.method3092(11376);
            if (this.field7513 > 0) {
                OpenGL.glBindBufferARB(this.field7517, this.field7513);
                OpenGL.glBufferDataARBub(this.field7517, arg1, null, 0, this.field7510 ? 35040 : 35044);
                this.field7509.field6083 += arg1 - this.field7512;
            } else {
                this.field7508 = this.field7509.method2634(false, 101, arg1);
            }
            this.field7512 = arg1;
        }
        field7500++;
        this.field7518 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public void method281(byte arg0) {
        field7502++;
        if (arg0 < 34) {
            this.method281((byte) 90);
        }
        if (this.field7513 > 0) {
            this.field7509.method3493(this.field7518, this.field7513, 1);
            this.field7513 = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Llca;")
    public static final class553 method3098(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class553 var4 = var3.field3043;
            var3.field3043 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7507++;
        this.method281((byte) 127);
        super.finalize();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lag;IZ)V")
    public class525(class587 arg0, int arg1, boolean arg2) {
        this.field7517 = arg1;
        this.field7510 = arg2;
        this.field7509 = arg0;
    }

    static {
        new class572("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field7519 = new class19();
        field7520 = new class610(14, 8);
        field7521 = 0;
    }
}
