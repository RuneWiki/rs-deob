import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class17 extends class274 {

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "Luaa;")
    public static class405 field187 = new class405("LIVE", 0);

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field194 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "[I")
    public static int[] field197 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "Lbm;")
    public static class637 field198 = new class637();

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
    public static int field199 = 328;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "Lkn;")
    public static class307 field193;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "Loa;")
    public static class43 field189;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "Lta;")
    public static class597 field200;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(Z)V", line = 3)
    public static void method97(boolean arg0) {
        field187 = null;
        field197 = null;
        field193 = null;
        field200 = null;
        field194 = null;
        field189 = null;
        field198 = null;
        if (!arg0) {
            field199 = 0;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZII)V", line = 21)
    public static final void method98(boolean arg0, int arg1, int arg2) {
        field196++;
        class367 var3 = class573.method3057(1, arg2, 2);
        if (arg0) {
            method97(false);
        }
        var3.method2115(1);
        var3.field4735 = arg1;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lbo;BLbo;)V", line = 40)
    public static final void method99(class28 arg0, byte arg1, class28 arg2) {
        if (arg0.field439 != null) {
            arg0.method237((byte) -108);
        }
        field190++;
        arg0.field439 = arg2;
        if (arg1 >= 17) {
            arg0.field438 = arg2.field438;
            arg0.field439.field438 = arg0;
            arg0.field438.field439 = arg0;
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(IIII)V", line = 63)
    public class17(int arg0, int arg1, int arg2, int arg3) {
        this.field188 = arg3;
        this.field195 = arg0;
        this.field192 = arg1;
        this.field191 = arg2;
    }
}
