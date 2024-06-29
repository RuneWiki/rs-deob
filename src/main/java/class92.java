import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class92 {

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "[I")
    public static int[] field1469 = new int[14];

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1478 = 0;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
    public static boolean field1477 = false;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Lbd;")
    public static class44 field1468 = new class44("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "Z")
    public static boolean field1483 = false;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Lqv;")
    public static class316 field1481 = new class316(75, -2);

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "[I")
    public static int[] field1482;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[Z")
    public static boolean[] field1473;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 5)
    public static final Object method674(boolean arg0, byte[] arg1, int arg2) {
        field1475++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > arg2 && !class116.field1803) {
            try {
                class274 var3 = (class274) Class.forName("np").getDeclaredConstructor().newInstance();
                var3.method1768(arg1, 32281);
                return var3;
            } catch (Throwable var4) {
                class116.field1803 = true;
            }
        }
        return arg0 ? class128.method945(arg1, -27375) : arg1;
    }

    @OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;", line = 41)
    public final String toString() {
        field1470++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 49)
    public static void method675(int arg0) {
        field1469 = null;
        field1481 = null;
        if (arg0 >= -88) {
            field1482 = null;
        }
        field1482 = null;
        field1468 = null;
        field1473 = null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIII)V", line = 79)
    public class92(int arg0, int arg1, int arg2, int arg3) {
        this.field1479 = arg2;
        this.field1471 = arg1;
        this.field1474 = arg3;
        this.field1476 = arg0;
    }
}
