import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class64 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public int field258 = -1;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public int field272 = 0;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Lid;")
    public static class149 field264 = class60.method382("ondulation:", (byte) 85);

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "Lid;")
    public static class149 field271 = class60.method382(")1", (byte) 123);

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lid;")
    public static class149 field265 = class60.method382(")3runescape)3com)4l=", (byte) 42);

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Lid;")
    private static class149 field275 = class60.method382("Walk here", (byte) 95);

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Lid;")
    public static class149 field279 = class60.method382("Okay", (byte) 43);

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "[I")
    public static int[] field276 = new int[50];

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Lid;")
    public static class149 field282 = field275;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field273 = new CRC32();

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Lvc;")
    public static class190 field261;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
    public static int[] field259;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
    public static final void method103(boolean arg0, int arg1) {
        field267++;
        class19.field289.method1289(arg1, 76);
        if (arg0) {
            class25.field373.method1289(arg1, 99);
            class102.field1796.method1289(arg1, 89);
            class279.field4981.method1289(arg1, 91);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBJ[I)Lid;")
    public static final class149 method104(int arg0, byte arg1, long arg2, int[] arg3) {
        if (arg1 >= -104) {
            field265 = null;
        }
        field274++;
        if (class84.field1536 != null) {
            class149 var5 = class84.field1536.method152((byte) -75, arg2, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return class78.method594(-1, arg2);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method105(int arg0) {
        field275 = null;
        if (arg0 <= 91) {
            method104(103, (byte) 86, 71L, (int[]) null);
        }
        field279 = null;
        field264 = null;
        field282 = null;
        field276 = null;
        field259 = null;
        field271 = null;
        field265 = null;
        field273 = null;
        field261 = null;
    }
}
