import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class316 extends class5 {

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
    public boolean field4593;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "F")
    public static float field4600;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
    public static final boolean method1983(int arg0, int arg1, int arg2) {
        if (arg1 != 11588) {
            field4600 = -2.19357F;
        }
        field4599++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1984(int arg0, int arg1, int arg2, int arg3) {
        if (class286.method1840(arg0, arg1, arg2)) {
            int var4 = arg1 << class10.field179;
            int var5 = arg2 << class10.field179;
            return class127.method869(var4 + 1, class306.field4447[arg0].method222(arg1, arg2) + arg3, var5 + 1) && class127.method869(class264.field3697 + var4 - 1, class306.field4447[arg0].method222(arg1 + 1, arg2) + arg3, var5 + 1) && class127.method869(class264.field3697 + var4 - 1, class306.field4447[arg0].method222(arg1 + 1, arg2 + 1) + arg3, class264.field3697 + var5 - 1) && class127.method869(var4 + 1, class306.field4447[arg0].method222(arg1, arg2 + 1) + arg3, class264.field3697 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIZ)Luu;")
    public static final class191 method1985(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4594++;
        class211 var5 = null;
        if (class387.field5925 != null) {
            var5 = new class211(arg1, class387.field5925, class137.field1832[arg1], 1000000);
        }
        class254.field3525[arg1] = class175.field2340.method3013(class492.field7255, arg1, var5, 0);
        if (arg4) {
            class254.field3525[arg1].method3080(true);
        }
        if (arg2 <= 84) {
            field4600 = 2.0186903F;
        }
        return new class191(class254.field3525[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
    public static final void method1986(byte arg0, boolean arg1) {
        field4597++;
        class523.method3104((byte) -1);
        if (!class444.method2693(class435.field6596, false)) {
            return;
        }
        class106.field1498++;
        if (class106.field1498 < 50 && !arg1) {
            return;
        }
        class106.field1498 = 0;
        if (arg0 != 74) {
            method1985(false, 77, -105, 87, true);
        }
        if (!class458.field6861 && class374.field5695 != null) {
            class118.field1627++;
            class424.method2582(class199.field2652, -1);
            try {
                class374.field5695.method1936(class538.field7879.field2185, true, class538.field7879.field2219, 0);
                class538.field7879.field2185 = 0;
            } catch (IOException var2) {
                class458.field6861 = true;
            }
        }
        class523.method3104((byte) -1);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIZ)V")
    public class316(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4595 = arg4;
        this.field4593 = arg5;
        this.field4592 = arg2;
        this.field4598 = arg3;
        this.field4601 = arg1;
        this.field4596 = arg0;
    }

    static {
        new class446(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }
}
