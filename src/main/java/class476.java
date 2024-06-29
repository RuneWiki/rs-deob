import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class476 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "B")
    private byte field6867;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field6869;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field6874;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field6876;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field6871;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field6875;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field6868 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lak;")
    public static class234 field6866 = new class234(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[[[B")
    public static byte[][][] field6873;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I")
    public final int method2867(boolean arg0) {
        field6870++;
        if (arg0) {
            this.method2867(true);
        }
        return this.field6867 & 0x7;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILwq;I)V")
    public static final void method2868(int arg0, int arg1, class116 arg2, int arg3) {
        if (arg2.field1959 == arg1 && arg1 != -1) {
            class189 var4 = class242.field3846.method2238(arg1, (byte) 78);
            int var5 = var4.field3192;
            if (var5 == 1) {
                arg2.field1939 = 0;
                arg2.field1907 = arg3;
                arg2.field1943 = 0;
                arg2.field1899 = 1;
                arg2.field1903 = 0;
                class501.method2969(var4, arg2.field5837, false, arg2.field1939, -77, arg2.field5826, arg2.field5833);
            }
            if (var5 == 2) {
                arg2.field1943 = 0;
            }
        } else if (arg1 == -1 || arg2.field1959 == -1 || class242.field3846.method2238(arg1, (byte) 78).field3175 >= class242.field3846.method2238(arg2.field1959, (byte) 78).field3175) {
            arg2.field1899 = 1;
            arg2.field1943 = 0;
            arg2.field1959 = arg1;
            arg2.field1983 = arg2.field1981;
            arg2.field1939 = 0;
            arg2.field1907 = arg3;
            arg2.field1903 = 0;
            if (arg2.field1959 != -1) {
                class501.method2969(class242.field3846.method2238(arg2.field1959, (byte) 78), arg2.field5837, false, arg2.field1939, -104, arg2.field5826, arg2.field5833);
            }
        }
        if (arg0 <= -127) {
            field6877++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    public static void method2869(boolean arg0) {
        if (!arg0) {
            method2868(6, 16, null, -83);
        }
        field6873 = null;
        field6866 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
    public final int method2870(byte arg0) {
        field6872++;
        if (arg0 <= 41) {
            field6866 = null;
        }
        return (this.field6867 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class476() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lhp;)V")
    public class476(class217 arg0) {
        this.field6867 = arg0.method1565(true);
        this.field6869 = arg0.method1511(-35);
        this.field6874 = arg0.method1556(121);
        this.field6876 = arg0.method1556(103);
        this.field6871 = arg0.method1556(104);
        this.field6875 = arg0.method1556(107);
    }
}
