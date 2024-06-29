import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class488 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field6682 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[C")
    public static char[] field6684 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lea;")
    public static class547 field6686 = new class547(78, 4);

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field6690 = 0;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
    public static int[] field6689 = new int[2048];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field6692;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field6693;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[Lsba;")
    public static class218[] field6688;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
    public static final void method2747(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field6687++;
        class143.field1856 = arg0;
        class262 var2 = class407.field5741;
        synchronized (class407.field5741) {
            class407.field5741.method1563(76);
        }
        class262 var3 = class552.field7810;
        synchronized (class552.field7810) {
            class552.field7810.method1563(19);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method2748(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 66) {
            method2747(-15, true);
        }
        field6691++;
        boolean var4 = true;
        class722 var5 = (class722) class537.method2958(arg1, arg0, arg3);
        if (var5 != null) {
            var4 &= class471.method2649((byte) 76, var5);
        }
        class722 var6 = (class722) class300.method1797(arg1, arg0, arg3, field6693 == null ? (field6693 = method2750("rl")) : field6693);
        if (var6 != null) {
            var4 &= class471.method2649((byte) 76, var6);
        }
        class722 var7 = (class722) class531.method2936(arg1, arg0, arg3);
        if (var7 != null) {
            var4 &= class471.method2649((byte) 76, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method2749(byte arg0) {
        field6688 = null;
        field6684 = null;
        field6686 = null;
        field6689 = null;
        if (arg0 != -108) {
            method2748(44, -79, (byte) 121, 60);
        }
    }

    @OriginalMember(owner = "client!ef", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6683++;
        throw new IllegalStateException();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2750(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
