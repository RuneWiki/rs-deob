import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class51 extends class55 {

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public int field1090 = 0;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lo;")
    public static class84 field1089 = class15.method124("@gre@World", 255);

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lo;")
    public static class84 field1093 = class15.method124("Welcome to RuneScape", 255);

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1088 = 0;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Lo;")
    public static class84 field1096 = class15.method124("cross", 255);

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lo;")
    public static class84 field1101 = class15.method124("shake:", 255);

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Lo;")
    public static class84 field1097 = class15.method124(" with)3)3)3", 255);

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lo;")
    public static class84 field1104 = class15.method124("(U(Y", 255);

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lrd;")
    public static class103 field1095;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Lp;")
    public static class89 field1094;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "[Lvb;")
    public static class121[] field1102;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 18)
    public static final void method441(boolean arg0, int arg1) {
        field1103++;
        if (class37.field722 == null) {
            return;
        }
        try {
            class27 var2 = new class27(4);
            var2.method226(-9646, arg0 ? 2 : 3);
            var2.method211((byte) -48, 0);
            class37.field722.method396(var2.field502, 4, 0, true);
        } catch (IOException var4) {
            try {
                class37.field722.method395(-9098);
            } catch (Exception var3) {
            }
            class37.field722 = null;
            class120.field2658++;
        }
        if (arg1 != -23689) {
            method441(false, -88);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Leb;Z)V", line = 57)
    public final void method442(class27 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method231(255);
            if (var3 == 0) {
                field1100++;
                if (arg1) {
                    field1098 = -96;
                    return;
                }
                return;
            }
            this.method443(arg0, -6, var3);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Leb;II)V", line = 96)
    private final void method443(class27 arg0, int arg1, int arg2) {
        field1092++;
        if (~arg2 == arg1) {
            this.field1090 = arg0.method227(127);
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 109)
    public static void method444(int arg0) {
        field1094 = null;
        field1097 = null;
        field1101 = null;
        if (arg0 != 29737) {
            return;
        }
        field1102 = null;
        field1104 = null;
        field1095 = null;
        field1093 = null;
        field1089 = null;
        field1096 = null;
    }
}
