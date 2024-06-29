import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 extends class775 {

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Ljava/applet/Applet;")
    public static Applet field194;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)V")
    public final void method109(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field192;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        ++field191;
        if (arg1 != 512) {
            this.method109(-56, 69, 89);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
    public final void method111(int arg0, int arg1, int arg2) {
        ++field203;
        int var4 = this.field199 * arg1 >> 12;
        int var5 = this.field193 * arg0 >> 12;
        int var6 = this.field198 * arg1 >> 12;
        if (arg2 != 17793) {
            this.method109(-31, 3, 3);
        }
        int var7 = this.field197 * arg0 >> 12;
        int var8 = this.field201 * arg1 >> 12;
        int var9 = this.field202 * arg0 >> 12;
        int var10 = this.field196 * arg1 >> 12;
        int var11 = this.field195 * arg0 >> 12;
        class250.method1579(var11, super.field10661, var6, var7, var5, (byte) 91, var4, var9, var10, var8);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V")
    public static final void method112(boolean arg0) {
        class9.field77.method1244(30407);
        ++field200;
        class291.field4153.method1244(30407);
        if (arg0) {
            field194 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field195 = arg7;
        this.field196 = arg6;
        this.field202 = arg5;
        this.field198 = arg2;
        this.field197 = arg3;
        this.field201 = arg4;
        this.field199 = arg0;
        this.field193 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field194 = null;
        if (arg0 >= -12) {
            method112(false);
        }
    }
}
