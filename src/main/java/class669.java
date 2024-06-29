import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class669 {

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Lej;")
    public class111 field9490;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field9491 = 0;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Ldb;")
    public static class298 field9497 = new class298(1, -1);

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field9499 = 0;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 3)
    public void method1978(int arg0) {
        field9494++;
        int var2 = 66 % ((57 - arg0) / 42);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V", line = 19)
    public void method1974(boolean arg0) {
        if (!arg0) {
            this.field9490 = null;
        }
        field9492++;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V", line = 36)
    public static void method3756(int arg0) {
        if (arg0 != 1) {
            field9491 = -6;
        }
        field9497 = null;
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V", line = 48)
    public void method2050(int arg0) {
        int var2 = 28 % ((arg0 + 58) / 38);
        field9495++;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lej;)V", line = 58)
    public class669(class111 arg0) {
        this.field9490 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 66)
    public void method2052(byte arg0) {
        if (arg0 < -45) {
            field9493++;
        }
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V", line = 80)
    public void method2049(int arg0) {
        if (arg0 != -292) {
            field9491 = 37;
        }
        field9496++;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 91)
    public void method1972(byte arg0) {
        int var2 = -114 % ((arg0 + 74) / 44);
        field9489++;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BI)I", line = 104)
    public static final int method3757(byte arg0, int arg1) {
        field9488++;
        return arg0 == -101 ? arg1 & 0x7F : 61;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILnq;)V")
    public abstract void method7(int arg0, int arg1, class430 arg2);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BII)V")
    public abstract void method2(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
    public abstract void method4(boolean arg0, int arg1);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)Z")
    public abstract boolean method1(int arg0);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZZ)V")
    public abstract void method5(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
    public abstract void method6(int arg0);
}
