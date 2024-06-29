import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class460 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    private int field6778 = -1;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    private int field6789 = 0;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Lada;")
    private class164 field6790 = new class164();

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Z")
    public boolean field6792 = false;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    private int field6787;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[Lsg;")
    private class399[] field6780;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[[[I")
    private int[][][] field6785;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[I")
    public static int[] field6784 = new int[32];

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[[I")
    public static int[][] field6788 = new int[128][128];

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "F")
    public static float field6791;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 5)
    public static void method2806(int arg0) {
        if (arg0 < -9) {
            field6788 = null;
            field6784 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 17)
    public final void method2807(int arg0) {
        for (int var2 = 0; var2 < this.field6787; var2++) {
            this.field6785[var2][0] = null;
            this.field6785[var2][1] = null;
            this.field6785[var2][2] = null;
            this.field6785[var2] = null;
        }
        field6779++;
        this.field6785 = null;
        this.field6780 = null;
        this.field6790.method1200(109);
        this.field6790 = null;
        if (arg0 >= -1) {
            field6788 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)[[[I", line = 46)
    public final int[][][] method2808(int arg0) {
        field6781++;
        if (this.field6787 != this.field6782) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6787; var2++) {
            this.field6780[var2] = class559.field7985;
        }
        return this.field6785;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(III)V", line = 163)
    public class460(int arg0, int arg1, int arg2) {
        this.field6782 = arg1;
        this.field6787 = arg0;
        this.field6780 = new class399[this.field6782];
        this.field6785 = new int[this.field6787][3][arg2];
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I", line = 70)
    public final int[][] method2809(int arg0, byte arg1) {
        if (arg1 != -48) {
            this.method2808(89);
        }
        field6786++;
        if (this.field6787 == this.field6782) {
            this.field6792 = this.field6780[arg0] == null;
            this.field6780[arg0] = class559.field7985;
            return this.field6785[arg0];
        } else if (this.field6787 == 1) {
            this.field6792 = this.field6778 != arg0;
            this.field6778 = arg0;
            return this.field6785[0];
        } else {
            class399 var3 = this.field6780[arg0];
            if (var3 == null) {
                this.field6792 = true;
                if (this.field6789 < this.field6787) {
                    var3 = new class399(arg0, this.field6789);
                    this.field6789++;
                } else {
                    class399 var4 = (class399) this.field6790.method1205(false);
                    var3 = new class399(arg0, var4.field5956);
                    this.field6780[var4.field5954] = null;
                    var4.method1304((byte) 7);
                }
                this.field6780[arg0] = var3;
            } else {
                this.field6792 = false;
            }
            this.field6790.method1192(var3, (byte) -119);
            return this.field6785[var3.field5956];
        }
    }
}
