import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class354 {

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lsh;")
    private class447 field5231 = new class447();

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lnn;")
    public static class151 field5233 = new class151("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Lsh;")
    private class447 field5237;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "[[[B")
    public static byte[][][] field5235;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2119(int arg0, String arg1) {
        field5229++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class440.method2693(arg1.charAt(var4), (byte) -59)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void method2120(int arg0) {
        field5235 = null;
        if (arg0 < -115) {
            field5233 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public final void method2121(byte arg0) {
        field5232++;
        while (true) {
            class447 var2 = this.field5231.field6588;
            if (this.field5231 == var2) {
                if (arg0 != 63) {
                    this.method2122(-57);
                }
                this.field5237 = null;
                return;
            }
            var2.method2759((byte) -25);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)I")
    public final int method2122(int arg0) {
        field5236++;
        if (arg0 >= -8) {
            this.method2123((byte) 44);
        }
        int var2 = 0;
        for (class447 var3 = this.field5231.field6588; var3 != this.field5231; var3 = var3.field6588) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)Z")
    public final boolean method2123(byte arg0) {
        if (arg0 != -93) {
            this.field5231 = null;
        }
        field5230++;
        return this.field5231.field6588 == this.field5231;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Lsh;")
    public final class447 method2124(int arg0) {
        field5226++;
        class447 var2 = this.field5231.field6586;
        if (this.field5231 == var2) {
            this.field5237 = null;
            return null;
        }
        if (arg0 >= -22) {
            field5235 = null;
        }
        this.field5237 = var2.field6586;
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lsh;I)V")
    public final void method2125(class447 arg0, int arg1) {
        field5238++;
        if (arg1 != -29983) {
            this.method2124(36);
        }
        if (arg0.field6586 != null) {
            arg0.method2759((byte) -25);
        }
        arg0.field6588 = this.field5231;
        arg0.field6586 = this.field5231.field6586;
        arg0.field6586.field6588 = arg0;
        arg0.field6588.field6586 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Lsh;")
    public final class447 method2126(int arg0) {
        field5234++;
        if (arg0 > -21) {
            method2120(-44);
        }
        class447 var2 = this.field5237;
        if (this.field5231 == var2) {
            this.field5237 = null;
            return null;
        } else {
            this.field5237 = var2.field6588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Lsh;")
    public final class447 method2127(int arg0) {
        field5227++;
        class447 var2 = this.field5231.field6588;
        if (arg0 != -1489721243) {
            return null;
        } else if (this.field5231 == var2) {
            this.field5237 = null;
            return null;
        } else {
            this.field5237 = var2.field6588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)Lsh;")
    public final class447 method2128(int arg0) {
        field5225++;
        class447 var2 = this.field5231.field6588;
        if (this.field5231 == var2) {
            return null;
        }
        if (arg0 >= -43) {
            this.method2122(-24);
        }
        var2.method2759((byte) -25);
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class354() {
        this.field5231.field6588 = this.field5231;
        this.field5231.field6586 = this.field5231;
    }
}
