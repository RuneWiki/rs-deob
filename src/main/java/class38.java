import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class38 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Z")
    private boolean field585;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lrl;")
    public class487 field584;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lak;")
    public static class222 field581 = new class222(7, 0, 1, 1);

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[B")
    public static byte[] field587 = new byte[16384];

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "[I")
    public static int[] field590 = new int[16];

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lhe;")
    public static class239 field589;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method297(int arg0, int arg1, int arg2) {
        field582++;
        if (arg2 != 15377) {
            return true;
        } else if (class174.field2387) {
            int var3 = arg0 >> 16;
            int var4 = arg0 & 0xFFFF;
            if (class181.field2591[var3] == null || class181.field2591[var3][var4] == null) {
                return false;
            }
            class356 var5 = class181.field2591[var3][var4];
            if (arg1 == -1 && var5.field5170 == 0) {
                for (class262 var6 = (class262) class230.field3220.method2096(-21400); var6 != null; var6 = (class262) class230.field3220.method2084((byte) 19)) {
                    if (var6.field3737 == 57 || var6.field3737 == 1011 || var6.field3737 == 18 || var6.field3737 == 60 || var6.field3737 == 46) {
                        for (class356 var7 = class4.method25(var6.field3735, false); var7 != null; var7 = class480.method2801(896298960, var7)) {
                            if (var5.field5185 == var7.field5185) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class262 var8 = (class262) class230.field3220.method2096(arg2 ^ 0xFFFF9079); var8 != null; var8 = (class262) class230.field3220.method2084((byte) 19)) {
                    if (var8.field3734 == arg1 && var5.field5185 == var8.field3735 && (var8.field3737 == 57 || var8.field3737 == 1011 || var8.field3737 == 18 || var8.field3737 == 60 || var8.field3737 == 46)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 80)
    public static void method298(int arg0) {
        field587 = null;
        field590 = null;
        field581 = null;
        if (arg0 == 60) {
            field589 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lrl;I[BIZ)V", line = 94)
    public class38(class487 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field580 = arg3;
        this.field585 = arg4;
        this.field584 = arg0;
        this.field586 = arg1;
        OpenGL.glGenBuffersARB(1, class485.field7024, 0);
        this.field579 = class485.field7024[0];
        this.method296(1);
        OpenGL.glBufferDataARBub(arg1, this.field580, arg2, 0, this.field585 ? 35040 : 35044);
        this.field584.field7332 += this.field580;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lrl;ILjaggl/memory/NativeBuffer;IZ)V", line = 113)
    public class38(class487 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field586 = arg1;
        this.field580 = arg3;
        this.field585 = arg4;
        this.field584 = arg0;
        OpenGL.glGenBuffersARB(1, class485.field7024, 0);
        this.field579 = class485.field7024[0];
        this.method296(1);
        OpenGL.glBufferDataARBa(arg1, this.field580, arg2.method2508(), this.field585 ? 35040 : 35044);
        this.field584.field7332 += this.field580;
    }

    @OriginalMember(owner = "client!mk", name = "finalize", descriptor = "()V", line = 137)
    protected final void finalize() throws Throwable {
        this.field584.method2851(true, this.field580, this.field579);
        field583++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BII)V", line = 152)
    public final void method299(byte[] arg0, int arg1, int arg2) {
        field588++;
        this.method296(1);
        if (this.field580 >= arg1) {
            OpenGL.glBufferSubDataARB(this.field586, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field586, arg1, arg0, 0, this.field585 ? 35040 : 35044);
            this.field584.field7332 += arg1 - this.field580;
            this.field580 = arg1;
        }
        if (arg2 != 0) {
            this.field585 = true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public abstract void method296(int arg0);
}
