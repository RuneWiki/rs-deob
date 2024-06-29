import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class111 extends class276 {

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    private int field1693 = -32768;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lec;")
    public static class25 field1696 = new class25(260);

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field1695;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBI)V")
    public static final void method712(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1686++;
        if (arg3 != 27) {
            method713(-55, -3, -101);
        }
        class36 var5 = class161.method1067(4, arg2, (byte) 81);
        var5.method219(-13);
        var5.field461 = arg1;
        var5.field458 = arg0;
        var5.field465 = arg4;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)Lem;")
    public static final class98 method713(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2414;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
    public static final void method714(int arg0, int arg1) {
        if (arg0 >= 111) {
            class249.field3960.method147(arg1, (byte) -120);
            field1687++;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method715(int arg0) {
        if (arg0 > -11) {
            return;
        }
        field1692++;
        if (class309.field5008) {
            return;
        }
        class309.field5008 = true;
        if (class74.field1123) {
            class79.field1255 = (float) ((int) class79.field1255 - 17 & 0xFFFFFFF0);
        } else {
            class295.field4847 += (-12.0F - class295.field4847) / 2.0F;
        }
        class87.field1355 = true;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1689++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10) {
        class293 var13 = class14.method92(this.field1685, false).method895(-1, 0, (class157) null, this.field1691, (byte) -73, 0, (class200) null);
        field1688++;
        if (var13 != null) {
            var13.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1693 = var13.method206();
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public final int method206() {
        field1684++;
        return this.field1693;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static void method716(int arg0) {
        if (arg0 == -7218) {
            field1695 = null;
            field1696 = null;
        }
    }
}
