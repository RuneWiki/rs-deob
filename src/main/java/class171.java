import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class171 extends class196 {

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[I")
    public static int[] field2652 = new int[4096];

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lfa;")
    public static class273 field2649;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[[I")
    public static int[][] field2647;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Z")
    public static final boolean method1126(int arg0) {
        if (arg0 <= 69) {
            method1126(1);
        }
        field2651++;
        try {
            return class51.method308(68);
        } catch (IOException var4) {
            class29.method173(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class223.field3548 + "," + class50.field680 + "," + class313.field5040 + " - " + class20.field272 + "," + (class309.field5006.field849[0] + class101.field1517) + "," + (class309.field5006.field804[0] + class254.field4063) + " - ";
            for (int var3 = 0; class20.field272 > var3 && var3 < 50; var3++) {
                var2 = var2 + class192.field3042.field3234[var3] + ",";
            }
            class159.method1055(var2, -17731, var5);
            class227.method1578(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1127(String arg0, int arg1) {
        int var2 = arg0.length();
        field2648++;
        int var3 = 0;
        if (arg1 < 59) {
            field2647 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZI)V")
    public static final void method1128(int arg0, boolean arg1, int arg2) {
        class109.field1671 = new class25(arg0);
        field2650++;
        if (arg1) {
            field2649 = null;
        }
        class219.field3502 = new class25(arg2);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static void method1129(boolean arg0) {
        field2647 = null;
        field2649 = null;
        if (arg0) {
            field2652 = null;
        }
    }
}
