import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class23 extends class314 {

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lud;")
    public static class279 field599 = class130.method1024("M-Bmoire en cours d(Wattribution", 255);

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[Z")
    public static boolean[] field598 = new boolean[8];

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Lgf;")
    public static class8 field597 = null;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lud;")
    public class279 field607;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lgf;")
    public class8 field596;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lgf;")
    public class8 field603;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Z")
    public boolean field601;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field608;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V", line = 6)
    public static void method207(boolean arg0) {
        field597 = null;
        field598 = null;
        field599 = null;
        if (!arg0) {
            method207(false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBZI)V", line = 31)
    public static final void method208(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field592++;
        if (arg2 == 66 && class283.method2031(20714, arg0)) {
            class214.method1572(class18.field545[arg0], 0, arg3, arg1, arg4, -1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 53)
    public static final void method209(byte arg0) {
        field593++;
        class63.field1297.method1338((byte) -106);
        int var1 = -114 % ((arg0 - 67) / 38);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;I)Lud;", line = 63)
    public static final class279 method210(String arg0, int arg1) {
        field602++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class279 var4 = new class279();
        var4.field4935 = var2;
        var4.field4967 = 0;
        int var5 = 0;
        if (arg1 <= 75) {
            field598 = (boolean[]) null;
        }
        while (var5 < var2.length) {
            if (var2[var5] != 0) {
                var2[var4.field4967++] = var2[var5];
            }
            var5++;
        }
        return var4;
    }
}
