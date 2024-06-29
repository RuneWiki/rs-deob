import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class68 extends class461 {

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "F")
    public static float field923;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
    public static final void method551(int arg0) {
        ++field919;
        class459.method2584();
        if (arg0 < -51) {
            for (int var1 = 0; var1 < 4; ++var1) {
                class703.field9806[var1].method284((byte) -70);
            }
            class107.method830(125);
            class705.method3852(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZIII)V")
    public final void method552(boolean arg0, int arg1, int arg2, int arg3) {
        ++field920;
        int var5 = this.method2586((byte) 93) * super.field6043.field584 / 10000;
        class520.field6799.method353(arg3, arg1 + 2, var5, super.field6043.field585 + -2, ((class187) super.field6043).field2384, 0);
        class520.field6799.method353(arg3 - -var5, arg1 + 2, -var5 + super.field6043.field584, super.field6043.field585 + -2, 0, 0);
        int var6 = 33 / ((arg2 - -83) / 41);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIB)V")
    public final void method553(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field921;
        class520.field6799.method388(arg2 - 2, arg0, super.field6043.field584 - -4, super.field6043.field585 - -2, ((class187) super.field6043).field2381, 0);
        if (arg3 <= -79) {
            class520.field6799.method388(arg2 + -1, arg0 + 1, super.field6043.field584 + 2, super.field6043.field585, 0, 0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IZ)I")
    public static final int method554(int arg0, boolean arg1) {
        if (!arg1) {
            field923 = 1.8944314F;
        }
        ++field922;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lpe;Lpe;Lqo;)V")
    public class68(class615 arg0, class615 arg1, class187 arg2) {
        super(arg0, arg1, arg2);
    }
}
