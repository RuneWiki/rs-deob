import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class384 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lln;")
    public class377 field5349;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "J")
    public static long field5347;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Loh;")
    public static class404 field5352;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 3)
    public static void method2385(int arg0) {
        if (arg0 != -1) {
            field5347 = 51L;
        }
        field5352 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 21)
    public void method525(int arg0) {
        if (arg0 != -7112) {
            field5347 = -75L;
        }
        field5348++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ltp;IB)I", line = 39)
    public static final int method2386(class532 arg0, int arg1, byte arg2) {
        field5343++;
        if (!client.method1779(arg0).method4187(arg1, 34) && arg0.field7588 == null) {
            return -1;
        } else {
            if (arg2 >= -18) {
                field5347 = 70L;
            }
            return arg0.field7565 == null || arg1 >= arg0.field7565.length ? -1 : arg0.field7565[arg1];
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lln;)V", line = 52)
    public class384(class377 arg0) {
        this.field5349 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 60)
    public void method524(int arg0) {
        field5346++;
        if (arg0 != 2976) {
            field5352 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 71)
    public void method528(byte arg0) {
        field5344++;
        if (arg0 != 37) {
            this.method26(-12);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V", line = 81)
    public void method2387(byte arg0) {
        field5351++;
        if (arg0 <= 75) {
            field5347 = -13L;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V", line = 93)
    public void method526(byte arg0) {
        field5345++;
        if (arg0 >= -45) {
            this.method31((byte) 105);
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V", line = 103)
    public void method527(byte arg0) {
        field5350++;
        if (arg0 != 46) {
            this.method32(2, 39, true);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lke;BI)V")
    public abstract void method27(class596 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
    public abstract void method30(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public abstract void method31(byte arg0);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
    public abstract void method24(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZ)V")
    public abstract void method32(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Z")
    public abstract boolean method26(int arg0);
}
