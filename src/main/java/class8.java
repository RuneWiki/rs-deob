import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 {

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Ll;")
    public static class22 field56 = class33.method229("75(U", -122);

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Ll;")
    public static class22 field53 = class33.method229("Furnace", -120);

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Ll;")
    public static class22 field60 = class33.method229("Sword Shop", -90);

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Ll;")
    public static class22 field57 = class33.method229("POH Portal", -65);

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Ll;")
    public static class22 field55 = class33.method229("Quest Start", -80);

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Ll;")
    public static class22 field54 = class33.method229("Potters Wheel", -69);

    @OriginalMember(owner = "mapview!da", name = "l", descriptor = "Ll;")
    public static class22 field64 = class33.method229("Loading", -95);

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Ll;")
    public static class22 field59 = class33.method229("Silver Shop", -88);

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Ll;")
    public static class22 field61 = class33.method229("mapfunction", -98);

    @OriginalMember(owner = "mapview!da", name = "m", descriptor = "Ll;")
    public static class22 field65 = class33.method229("Chainmail Shop", -48);

    @OriginalMember(owner = "mapview!da", name = "o", descriptor = "[I")
    public static int[] field67 = new int[128];

    @OriginalMember(owner = "mapview!da", name = "p", descriptor = "Ll;")
    public static class22 field68 = class33.method229("details)3dat", -118);

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "J")
    public long field63;

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "Lda;")
    public class8 field62;

    @OriginalMember(owner = "mapview!da", name = "n", descriptor = "Lda;")
    public class8 field66;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 12)
    public static final void method35(Component arg0, byte arg1) {
        if (arg1 != -74) {
            method39(-77, -47, 16);
        }
        Method var2 = class26.field358;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class13.field132);
        arg0.addFocusListener(class13.field132);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 49)
    public static void method36(int arg0) {
        if (arg0 != 1416682150) {
            field64 = null;
        }
        field55 = null;
        field68 = null;
        field59 = null;
        field54 = null;
        field64 = null;
        field65 = null;
        field53 = null;
        field67 = null;
        field60 = null;
        field61 = null;
        field56 = null;
        field57 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Lea;IBI)Lf;", line = 91)
    public static final class11 method37(class10 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -73) {
            method36(-73);
        }
        return class34.method233(arg0, true, arg1, arg3) ? class23.method156(39) : null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II)Ll;", line = 115)
    public static final class22 method38(int arg0, int arg1) {
        class22 var2 = new class22();
        var2.field213 = arg0;
        var2.field215 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(III)B", line = 138)
    public static final byte method39(int arg0, int arg1, int arg2) {
        int var3 = 118 % ((arg0 + 81) / 36);
        int var4 = arg1 >> 6;
        int var5 = arg2 >> 6;
        if (class27.field364[var5][var4] == null) {
            return 0;
        } else if (class27.field364[var5][var4].field232 == null) {
            return class27.field364[var5][var4].field240;
        } else {
            return class27.field364[var5][var4].field232[(arg2 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z)V", line = 179)
    public final void method40(boolean arg0) {
        if (this.field66 == null) {
            return;
        }
        if (arg0) {
            field64 = null;
        }
        this.field66.field62 = this.field62;
        this.field62.field66 = this.field66;
        this.field62 = null;
        this.field66 = null;
    }
}
