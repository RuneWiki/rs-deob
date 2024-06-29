import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class362 extends class510 {

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lkn;")
    public static class530 field5170 = new class530("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field5180 = -1;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Lfc;")
    public static class174 field5182 = new class174(20);

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field5183 = 0;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
    public static boolean field5184 = true;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)I")
    public abstract int method759(int arg0);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        if (arg0 == 102) {
            field5173++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 < -71) {
            field5178++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        field5172++;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V")
    public static void method2133(byte arg0) {
        field5170 = null;
        int var1 = -30 / ((25 - arg0) / 39);
        field5182 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ[IBILih;)Lwh;")
    public static final class102 method2134(int arg0, boolean arg1, int[] arg2, byte arg3, int arg4, class503 arg5) {
        field5179++;
        if (arg3 != -74) {
            field5183 = 29;
        }
        if (!arg5.field7436 && (!class51.method407(arg4, 1024) || !class51.method407(arg0, 1024))) {
            return arg5.field7428 ? new class102(arg5, 34037, arg4, arg0, arg1, arg2) : new class102(arg5, arg4, arg0, class280.method1749(arg3 - 31605, arg4), class280.method1749(-31679, arg0), arg2);
        } else {
            return new class102(arg5, 3553, arg4, arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIII)V")
    public class362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5171 = arg2;
        this.field5177 = arg3;
        this.field5175 = arg4;
        this.field5174 = arg1;
        this.field5169 = arg5;
        this.field5167 = arg0;
        this.field5168 = arg6;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
    public static final boolean method2135(int arg0, int arg1, int arg2) {
        if (arg1 < 25) {
            return true;
        } else {
            field5181++;
            return (class368.field5253[1][arg2][arg0] & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V")
    public static final void method2136(byte arg0) {
        class37.field408 = 0;
        field5176++;
        if (arg0 == -63) {
            class363.field5190.method2656(79);
            class424.field5977 = false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIILih;I)Lwh;")
    public static final class102 method2137(int arg0, int arg1, int arg2, int arg3, class503 arg4, int arg5) {
        if (arg2 <= 3) {
            field5182 = null;
        }
        field5166++;
        if (!arg4.field7436 && (!class51.method407(arg1, 1024) || !class51.method407(arg5, 1024))) {
            return arg4.field7428 ? new class102(arg4, 34037, arg0, arg3, arg1, arg5, true) : new class102(arg4, arg0, arg3, arg1, arg5, class280.method1749(-31679, arg1), class280.method1749(-31679, arg5), true);
        } else {
            return new class102(arg4, 3553, arg0, arg3, arg1, arg5, true);
        }
    }
}
