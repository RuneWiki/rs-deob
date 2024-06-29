import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class479 extends class96 implements class395 {

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
    private int field6916 = -1;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    private int field6925 = -1;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "I")
    public int field6923;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public int field6915;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "Lrl;")
    private class487 field6917;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
    private int field6927;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
    private int field6926;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
    private int field6924;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "[I")
    public static int[] field6930;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "[Lqp;")
    public static class450[] field6928;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "[[[I")
    public static int[][][] field6919;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        field6920++;
        OpenGL.glFramebufferRenderbufferEXT(this.field6925, this.field6916, 36161, arg0);
        this.field6916 = -1;
        this.field6925 = -1;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(III)V")
    public final void method2797(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, 36161, this.field6926);
        if (arg1 == -22791) {
            field6922++;
            this.field6916 = arg0;
            this.field6925 = arg2;
        }
    }

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "(B)V")
    public final void method2798(byte arg0) {
        if (arg0 != -45) {
            this.field6925 = 63;
        }
        field6929++;
        if (this.field6926 > 0) {
            this.field6917.method2915(-85, this.field6926, this.field6924);
            this.field6926 = 0;
        }
    }

    @OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2798((byte) -45);
        field6918++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(Z)V")
    public static void method2799(boolean arg0) {
        field6919 = null;
        field6928 = null;
        field6930 = null;
        if (arg0) {
            field6919 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILeq;Lhe;Lhe;)V")
    public static final void method2800(int arg0, class134 arg1, class239 arg2, class239 arg3) {
        class407.field5974 = class442.method2588((byte) -122, 0, class501.field7660, arg3);
        field6921++;
        class95.field1282 = arg1.method802(class407.field5974, class328.method1976(arg2, class501.field7660, 0), true);
        class93.field1260 = class442.method2588((byte) -101, 0, class43.field648, arg3);
        class181.field2587 = arg1.method802(class93.field1260, class328.method1976(arg2, class43.field648, 0), true);
        class482.field6989 = class442.method2588((byte) 122, 0, class216.field3042, arg3);
        class458.field6676 = arg1.method802(class482.field6989, class328.method1976(arg2, class216.field3042, arg0), true);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lrl;III)V")
    public class479(class487 arg0, int arg1, int arg2, int arg3) {
        this.field6923 = arg2;
        this.field6915 = arg3;
        this.field6917 = arg0;
        this.field6927 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class185.field2634, 0);
        this.field6926 = class185.field2634[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6926);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6927, this.field6923, this.field6915);
        this.field6924 = this.field6915 * this.field6923 * this.field6917.method2905(8, this.field6927);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lrl;IIII)V")
    public class479(class487 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6923 = arg2;
        this.field6917 = arg0;
        this.field6927 = arg1;
        this.field6915 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class185.field2634, 0);
        this.field6926 = class185.field2634[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6926);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6927, this.field6923, this.field6915);
        this.field6924 = this.field6923 * this.field6915 * this.field6917.method2905(8, this.field6927);
    }

    static {
        new class194("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }
}
