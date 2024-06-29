import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class72 extends class130 {

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "Lgg;")
    public static class63 field1803 = class116.method911(43, "::gc");

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field1807 = 1;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILab;)V")
    public final void method673(int arg0, class3 arg1) {
        field1804++;
        if (arg0 != 1) {
            field1807 = -71;
        }
        while (true) {
            int var3 = arg1.method64(31790);
            if (var3 == 0) {
                return;
            }
            this.method674(var3, -90, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILab;)V")
    private final void method674(int arg0, int arg1, class3 arg2) {
        if (arg1 >= -22) {
            this.field1806 = 86;
        }
        field1808++;
        if (arg0 == 1) {
            this.field1809 = arg2.method46((byte) 65);
            this.field1805 = arg2.method64(31790);
            this.field1806 = arg2.method64(31790);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class38.field923[arg0][var8][var14] == -class155.field3245) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class97.field2310[arg0][arg1][arg3] + arg5;
            if (!class94.method824(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class94.method824(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class94.method824(var9, var11, var13)) {
                return false;
            } else if (class94.method824(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class121.method932(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class94.method824(var6 + 1, class97.field2310[arg0][arg1][arg3] + arg5, var7 + 1) && class94.method824(var6 + 128 - 1, class97.field2310[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class94.method824(var6 + 128 - 1, class97.field2310[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class94.method824(var6 + 1, class97.field2310[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public static void method676(byte arg0) {
        field1803 = null;
        if (arg0 <= 13) {
            field1807 = -5;
        }
    }
}
