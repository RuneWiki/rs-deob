import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class699 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Ljn;")
    private class668 field9880;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public int field9884;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3917(int arg0) {
        field9883++;
        if (arg0 < 102) {
            return;
        }
        int var1 = class221.field2851.method1757(class375.field5039, true);
        if (var1 == 0) {
            class257.field3493 = null;
            class146.method942(0, (byte) -89);
        } else if (var1 == 1) {
            class421.method2542((byte) 0, -25249);
            class146.method942(512, (byte) -89);
            if (class73.field1104 != null) {
                class282.method1697((byte) -31);
            }
        } else {
            class421.method2542((byte) (class114.field1478 - 4 & 0xFF), -25249);
            class146.method942(2, (byte) -89);
        }
        class575.field8422 = class617.field8853;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;", line = 45)
    public static final Object method3918(boolean arg0, byte[] arg1, boolean arg2) {
        field9882++;
        if (arg1 == null) {
            return null;
        } else if (arg2) {
            if (arg1.length > 136 && !class530.field7746) {
                try {
                    class312 var3 = (class312) Class.forName("b").getDeclaredConstructor().newInstance();
                    var3.method1811(-28736, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class530.field7746 = true;
                }
            }
            return arg0 ? class447.method2641((byte) 83, arg1) : arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 86)
    public class699(class90 arg0, int arg1, class668 arg2) {
        new class472(64);
        this.field9880 = arg2;
        this.field9884 = this.field9880.method3805(15, false);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)[Lhq;", line = 99)
    public static final class142[] method3919(int arg0) {
        field9881++;
        return arg0 <= 113 ? null : new class142[] { class39.field729, class175.field2159, class697.field9874, class231.field3012, class37.field708, class478.field6709 };
    }
}
