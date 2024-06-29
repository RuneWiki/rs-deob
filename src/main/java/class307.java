import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class307 extends class27 {

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lbd;")
    public static class162 field5159 = class17.method142(0, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lbd;")
    public static class162 field5160 = class17.method142(0, "; Max)2Age=");

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "Lbd;")
    public static class162 field5166 = class17.method142(0, "Weiter");

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lbd;")
    public static class162 field5158 = class17.method142(0, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "Lbd;")
    public static class162 field5168 = class17.method142(0, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "Lbd;")
    public static class162 field5170 = class17.method142(0, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lbd;")
    private static class162 field5162 = class17.method142(0, "Please remove ");

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lbd;")
    public static class162 field5167 = field5162;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "Lbd;")
    public static class162 field5169 = field5162;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Lbd;")
    public static class162 field5157;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V", line = 9)
    public static void method2085(int arg0) {
        field5168 = null;
        field5157 = null;
        field5160 = null;
        field5169 = null;
        field5159 = null;
        field5162 = null;
        field5158 = null;
        field5170 = null;
        field5166 = null;
        if (arg0 == -4861) {
            field5167 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Z)Lbd;", line = 30)
    public static final class162 method2086(String arg0, boolean arg1) {
        field5165++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        if (arg1) {
            field5158 = (class162) null;
        }
        class162 var4 = new class162();
        var4.field2865 = 0;
        var4.field2817 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field2865++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V", line = 74)
    public static final void method2087(int arg0) {
        if (arg0 != 0) {
            method2087(1);
        }
        class81.field1408.method1667(-121);
        class57.field890.method378(-128);
        field5161++;
        class263.field4387.method378(-110);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[[I", line = 112)
    public final int[][] method219(int arg0, byte arg1) {
        int[][] var3 = this.field3651.method406(false, arg0);
        field5163++;
        if (arg1 != 83) {
            field5157 = (class162) null;
        }
        if (this.field3651.field917 && this.method221((byte) 41)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % this.field460 * this.field460;
            for (int var8 = 0; var8 < class128.field2326; var8++) {
                int var9 = this.field448[var7 + (var8 % this.field452)];
                var6[var8] = class92.method695(4080, var9 << 4);
                var5[var8] = class92.method695(var9, 65280) >> 4;
                var4[var8] = class92.method695(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IZI)V", line = 178)
    public static final void method2088(int arg0, boolean arg1, int arg2) {
        class63 var3 = class46.method332(12, arg2, -12770);
        if (!arg1) {
            field5168 = (class162) null;
        }
        field5164++;
        var3.method430(false);
        var3.field971 = arg0;
    }
}
