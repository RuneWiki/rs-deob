import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class503 extends class392 implements class737 {

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    private int field6831 = -1;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    private int field6839 = -1;

    @OriginalMember(owner = "client!is", name = "F", descriptor = "I")
    private int field6837;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "Lac;")
    private class541 field6829;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public int field6833;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    public int field6832;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "I")
    private int field6841;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    private int field6830;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "Lai;")
    public static class600 field6834;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public static final void method2803(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        if (var3 != null) {
            class440.method2487(var3.field8736);
            if (var3.field8736 != null) {
                var3.field8736 = null;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public final void method2804(int arg0) {
        if (arg0 < this.field6841) {
            this.field6829.method2989(this.field6841, arg0 ^ 0x4B, this.field6830);
            this.field6841 = 0;
        }
        field6840++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZB)V")
    public static final void method2805(boolean arg0, byte arg1) {
        class545.field7704.method25(class603.field8409.method357());
        field6835++;
        int[] var2 = class603.field8409.method453();
        if (arg1 != 88) {
            method2805(false, (byte) -30);
        }
        class759.field10575 = var2[3];
        class671.field9322 = var2[0];
        class123.field1611 = var2[2];
        class52.field543 = var2[1];
        if (arg0) {
            class603.field8409.method354(class689.field9657, class727.field10146, class137.field1747, class215.field2601);
            class344.method2021(class105.field1408, 14794);
        } else {
            class603.field8409.method354(class468.field6473, class144.field1867, class342.field4600, class501.field6820);
            class344.method2021(class757.field10561, 14794);
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(III)V")
    public final void method2806(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field6841);
        field6836++;
        this.field6839 = arg2;
        this.field6831 = arg1;
        if (arg0 != 0) {
            method2807((byte) -93);
        }
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(B)V")
    public static void method2807(byte arg0) {
        field6834 = null;
        if (arg0 <= 25) {
            method2808(null, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Loia;B)Z")
    public static final boolean method2808(class90 arg0, byte arg1) {
        field6828++;
        if (arg1 < 80) {
            method2808(null, (byte) 113);
        }
        return arg0 == null ? false : class257.method1531(arg0.field1215, arg0.field1216 - arg0.field1213, arg0.field1208 - arg0.field1215, arg0.field1209 - arg0.field1217, (byte) 16, arg0.field1217, arg0.field1213);
    }

    @OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2804(0);
        field6827++;
        super.finalize();
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
    public final void method832(byte arg0) {
        field6838++;
        OpenGL.glFramebufferRenderbufferEXT(this.field6831, this.field6839, 36161, 0);
        if (arg0 > -117) {
            this.method2806(-42, -54, 110);
        }
        this.field6839 = -1;
        this.field6831 = -1;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lac;III)V")
    public class503(class541 arg0, int arg1, int arg2, int arg3) {
        this.field6837 = arg1;
        this.field6829 = arg0;
        this.field6833 = arg3;
        this.field6832 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class430.field6047, 0);
        this.field6841 = class430.field6047[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6841);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6837, this.field6832, this.field6833);
        this.field6830 = this.field6832 * this.field6833 * this.field6829.method3009(-96, this.field6837);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lac;IIII)V")
    public class503(class541 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6829 = arg0;
        this.field6837 = arg1;
        this.field6832 = arg2;
        this.field6833 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class430.field6047, 0);
        this.field6841 = class430.field6047[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6841);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6837, this.field6832, this.field6833);
        this.field6830 = this.field6833 * this.field6832 * this.field6829.method3009(-121, this.field6837);
    }
}
