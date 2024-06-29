import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class245 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3225 = new CRC32();

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "[I")
    public static int[] field3229 = new int[8];

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "[S")
    public static short[] field3232 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Ljc;")
    public static class305 field3231 = new class305(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
    public static int[] field3230;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1521(int arg0) {
        field3226++;
        int var1 = 0;
        if (class319.field4256.method2061((byte) 94, class20.field183)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class319.field4256.field4671) {
            var1 |= 0x40;
        }
        class321.method1905(var1, true);
        class123.field1593.method2919(var1, 97);
        class237.field3158.method231((byte) -95, var1);
        class87.field1032.method1672(var1, 0);
        class71.field914.method1611(var1, 0);
        class474.method2890(var1, (byte) 119);
        class484.method2948(-120, var1);
        class32.method180(var1, (byte) -120);
        class294.method1765(24755, var1);
        if (arg0 == 16) {
            class235.method1489(103);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 49)
    public static final String method1522(boolean arg0) {
        field3228++;
        String var1 = "www";
        if (class401.field5807 == class255.field3396) {
            var1 = "www-wtrc";
        } else if (class401.field5807 == class168.field2175) {
            var1 = "www-wtqa";
        } else if (class401.field5807 == class202.field2683) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (!arg0) {
            method1523((byte) 108);
        }
        if (class339.field4485 != null) {
            var2 = "/p=" + class339.field4485;
        }
        return "http://" + var1 + "." + class381.field5520.field1399 + ".com/l=" + class374.field5072 + "/a=" + class385.field5601 + var2 + "/";
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 84)
    public static void method1523(byte arg0) {
        field3229 = null;
        field3232 = null;
        field3225 = null;
        if (arg0 == 35) {
            field3230 = null;
            field3231 = null;
        }
    }
}
