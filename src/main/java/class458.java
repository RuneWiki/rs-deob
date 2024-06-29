import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class class458 {

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field6562 = -1;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field6563 = 0;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
    public static boolean field6564 = false;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[Ljea;")
    public static class472[] field6558 = new class472[50];

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "F")
    public static float field6559;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "Luja;")
    public static class38 field6568;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lvaa;")
    public static class492 field6560;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "[I")
    public static int[] field6565;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 3)
    public static void method2729(int arg0) {
        field6565 = null;
        if (arg0 == 22217) {
            field6568 = null;
            field6558 = null;
            field6560 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILha;)V", line = 24)
    public static final void method2730(int arg0, class66 arg1) {
        field6567++;
        if (class102.field1283) {
            class425.method2534(arg1, (byte) -23);
        } else {
            class617.method3534(arg1, -25297);
        }
        if (arg0 != -1) {
            field6565 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)V", line = 40)
    public static final void method2732(boolean arg0, int arg1) {
        if (class203.field2976 == null) {
            class531.method3086(121);
        }
        field6566++;
        if (arg0) {
            class203.field2976.method615(arg1 ^ 0xFFFFBE14);
        }
        if (arg1 != -16876) {
            field6564 = true;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Lnfa;")
    public abstract class706 method2731(int arg0);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z")
    public abstract boolean method2733(int arg0, int arg1);

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
    public abstract void method2734(int arg0);

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V")
    public abstract void method2735(int arg0);
}
