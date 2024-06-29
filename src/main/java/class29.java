import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class29 {

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "[I")
    public static int[] field418 = new int[256];

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "Z")
    public static boolean field421;

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "[I")
    public static int[] field423;

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "[[B")
    public static byte[][] field425;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "Lv;")
    public static class40 field422;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "[[B")
    public static byte[][] field424;

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "J")
    public long field420;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lpa;")
    public class29 field417;

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lpa;")
    public class29 field419;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIZLjava/awt/Component;)Lg;", line = 8)
    public static final class12 method193(int arg0, int arg1, boolean arg2, Component arg3) {
        try {
            Class var4 = Class.forName("ja");
            if (arg2) {
                return (class12) null;
            } else {
                class12 var5 = (class12) var4.getDeclaredConstructor().newInstance();
                var5.method73(arg0, (byte) -112, arg1, arg3);
                return var5;
            }
        } catch (Throwable var8) {
            class41 var7 = new class41();
            var7.method73(arg0, (byte) -82, arg1, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(B)V", line = 47)
    public static void method194(byte arg0) {
        field424 = null;
        field418 = null;
        field423 = null;
        field425 = null;
        if (arg0 > -27) {
            field424 = null;
        }
        field422 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)V", line = 66)
    public final void method195(int arg0) {
        if (arg0 == 1 && this.field419 != null) {
            this.field419.field417 = this.field417;
            this.field417.field419 = this.field419;
            this.field419 = null;
            this.field417 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(B)[Lu;", line = 87)
    public static final class38[] method196(byte arg0) {
        class38[] var1 = new class38[class11.field114];
        if (arg0 != -63) {
            field421 = true;
        }
        for (int var2 = 0; var2 < class11.field114; var2++) {
            class38 var3 = new class38();
            var3.field491 = class40.field521;
            var3.field496 = class7.field91;
            var3.field493 = class35.field465[var2];
            var3.field490 = class15.field152[var2];
            var3.field494 = class11.field116[var2];
            var3.field495 = class41.field532[var2];
            var3.field497 = class16.field167;
            var3.field492 = class8.field99[var2];
            var1[var2] = var3;
        }
        class18.method104(0);
        return var1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field418[var0] = var1;
        }
        field421 = false;
        field423 = new int[128];
        field425 = new byte[250][];
        field422 = class24.method170("Overview", (byte) 17);
        field424 = new byte[1000][];
    }
}
