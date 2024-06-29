import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class384 {

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Lsw;")
    private class641 field5074 = new class641(128);

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "Ldn;")
    private class438 field5072;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Lcea;")
    public static class180 field5075 = new class180("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
    public static int[] field5078 = new int[14];

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "Lsc;")
    public static class290 field5077 = new class290();

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 3)
    public static void method2216(int arg0) {
        field5077 = null;
        if (arg0 <= 18) {
            method2217(null, (byte) 70);
        }
        field5078 = null;
        field5075 = null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 18)
    public static final byte[] method2217(String arg0, byte arg1) {
        field5076++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var3 - 2 >= var2 || class172.method961(arg0.charAt(var3 - 2), 16) == -1) {
            var4 -= 2;
        } else if ((var3 - 1) >= var2 || class172.method961(arg0.charAt(var3 - 1), 16) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        if (arg1 != -61) {
            field5073 = -120;
        }
        class436.method2522(arg0, var5, 0, -94);
        return var5;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)Ljo;", line = 58)
    public final class279 method2218(int arg0, int arg1) {
        field5071++;
        class641 var3 = this.field5074;
        class279 var4;
        synchronized (this.field5074) {
            var4 = (class279) this.field5074.method3682(arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5072.method2558(100, class520.method2966(arg0 ^ 0xFF, arg1), class484.method2808(4, arg1));
        class279 var6 = new class279();
        if (var5 != null) {
            var6.method1586((byte) -60, new class374(var5));
        }
        class641 var7 = this.field5074;
        synchronized (this.field5074) {
            this.field5074.method3684(var6, 0, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 96)
    public class384(class515 arg0, int arg1, class438 arg2) {
        this.field5072 = arg2;
        if (this.field5072 != null) {
            int var4 = this.field5072.method2565((byte) -48) - 1;
            this.field5072.method2554(var4, 124);
        }
    }
}
