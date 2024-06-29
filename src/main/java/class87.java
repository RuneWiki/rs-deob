import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class class87 extends class280 {

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 10)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        field1335++;
        if (arg6 != 59) {
            this.method212(82);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Z", line = 21)
    public final boolean method195(int arg0) {
        if (arg0 <= 91) {
            method605(-50, 107, -47, -37);
        }
        field1325++;
        return false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method605(int arg0, int arg1, int arg2, int arg3) {
        class366.field5214.method2481(arg1, true);
        if (arg3 == -18066) {
            field1326++;
            class366.field5214.method2453(arg0, true);
            class366.field5214.method2453(arg2, true);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIII)V", line = 59)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1334 = arg3;
        this.field1333 = arg0;
        this.field1329 = arg6;
        this.field1327 = arg2;
        this.field1331 = arg4;
        this.field1330 = arg1;
        this.field1332 = arg5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 73)
    public final void method202(byte arg0) {
        if (arg0 > 42) {
            field1328++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I")
    public abstract int method212(int arg0);
}
