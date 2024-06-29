import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class453 {

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Z")
    private boolean field6663;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field6660;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field6666;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lfd;")
    public class365 field6661;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lsl;")
    public static class318 field6665 = new class318(56, -1);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Z")
    public static boolean field6671;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lib;")
    public static class106 field6669;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[I")
    public static int[] field6672;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[[B")
    public static byte[][] field6667;

    static {
        new class331("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field6671 = false;
        field6670 = 999999;
        field6669 = new class106(16);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Lnt;", line = 3)
    public static final class148 method2729(int arg0, int arg1, int arg2) {
        if (class422.field6240[arg0][arg1][arg2] == null) {
            boolean var3 = class422.field6240[0][arg1][arg2] != null && class422.field6240[0][arg1][arg2].field2091 != null;
            if (var3 && arg0 >= class308.field4395 - 1) {
                return null;
            }
            class429.method2610(arg0, arg1, arg2);
        }
        return class422.field6240[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 16)
    public static void method2730(int arg0) {
        field6672 = null;
        field6665 = null;
        if (arg0 != -5298) {
            field6665 = null;
        }
        field6669 = null;
        field6667 = null;
    }

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V", line = 29)
    protected final void finalize() throws Throwable {
        field6662++;
        this.field6661.method2222(this.field6664, this.field6666, -28);
        super.finalize();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[B)V", line = 39)
    public final void method2731(int arg0, int arg1, byte[] arg2) {
        this.method1102((byte) 117);
        field6658++;
        if (arg0 < 31) {
            return;
        }
        if (this.field6666 < arg1) {
            OpenGL.glBufferDataARBub(this.field6660, arg1, arg2, 0, this.field6663 ? 35040 : 35044);
            this.field6661.field5320 += arg1 - this.field6666;
            this.field6666 = arg1;
        } else {
            OpenGL.glBufferSubDataARB(this.field6660, 0, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V", line = 65)
    public static final void method2732(byte arg0) {
        field6659++;
        class156 var1 = class158.field2240;
        synchronized (class158.field2240) {
            if (arg0 != -57) {
                field6672 = null;
            }
            class158.field2240.method1119(arg0 ^ 0xFFFFFFA6);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lfd;I[BIZ)V", line = 83)
    public class453(class365 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6663 = arg4;
        this.field6660 = arg1;
        this.field6666 = arg3;
        this.field6661 = arg0;
        OpenGL.glGenBuffersARB(1, class308.field4382, 0);
        this.field6664 = class308.field4382[0];
        this.method1102((byte) 122);
        OpenGL.glBufferDataARBub(arg1, this.field6666, arg2, 0, this.field6663 ? 35040 : 35044);
        this.field6661.field5320 += this.field6666;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lfd;ILjaggl/memory/NativeBuffer;IZ)V", line = 105)
    public class453(class365 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field6660 = arg1;
        this.field6666 = arg3;
        this.field6661 = arg0;
        this.field6663 = arg4;
        OpenGL.glGenBuffersARB(1, class308.field4382, 0);
        this.field6664 = class308.field4382[0];
        this.method1102((byte) 115);
        OpenGL.glBufferDataARBa(arg1, this.field6666, arg2.method2673(), this.field6663 ? 35040 : 35044);
        this.field6661.field5320 += this.field6666;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)I", line = 128)
    public static final int method2733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6668++;
        int var5 = arg4 & 0xF;
        int var6 = var5 < 8 ? arg2 : arg0;
        int var7 = arg1 >= ~var5 ? (var5 == 12 || var5 == 14 ? arg2 : arg3) : arg0;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    public abstract void method1102(byte arg0);
}
