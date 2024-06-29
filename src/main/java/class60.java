import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class60 {

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Lj;")
    private class382 field1251 = new class382();

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
    public static int[] field1240 = new int[3];

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1242 = 0;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1239 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Lcw;")
    public static class122 field1255;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "Lj;")
    private class382 field1252;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Lph;")
    public static class459 field1254;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLj;)V", line = 5)
    public final void method531(byte arg0, class382 arg1) {
        field1246++;
        if (arg1.field5588 != null) {
            arg1.method2352((byte) 118);
        }
        arg1.field5585 = this.field1251;
        arg1.field5588 = this.field1251.field5588;
        arg1.field5588.field5585 = arg1;
        int var3 = -107 % ((39 - arg0) / 53);
        arg1.field5585.field5588 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lj;", line = 24)
    public final class382 method532(byte arg0) {
        field1248++;
        class382 var2 = this.field1251.field5585;
        if (this.field1251 == var2) {
            return null;
        } else if (arg0 == -100) {
            var2.method2352((byte) 111);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lj;", line = 50)
    public final class382 method533(byte arg0) {
        if (arg0 > -46) {
            method540((byte) -80, null);
        }
        field1250++;
        class382 var2 = this.field1251.field5585;
        if (this.field1251 == var2) {
            this.field1252 = null;
            return null;
        } else {
            this.field1252 = var2.field5585;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V", line = 77)
    public static void method534(byte arg0) {
        field1254 = null;
        field1255 = null;
        field1240 = null;
        field1239 = null;
        if (arg0 != 17) {
            method540((byte) 56, null);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 94)
    public static final byte[] method535(int arg0, String arg1) {
        field1245++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != -8218) {
            method540((byte) -86, null);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lj;", line = 232)
    public final class382 method536(int arg0) {
        field1241++;
        class382 var2 = this.field1252;
        int var3 = 70 % ((23 - arg0) / 48);
        if (this.field1251 == var2) {
            this.field1252 = null;
            return null;
        } else {
            this.field1252 = var2.field5585;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)I", line = 251)
    public final int method537(byte arg0) {
        field1243++;
        if (arg0 != -107) {
            field1242 = -88;
        }
        int var2 = 0;
        for (class382 var3 = this.field1251.field5585; var3 != this.field1251; var3 = var3.field5585) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V", line = 272)
    public final void method538(boolean arg0) {
        while (true) {
            class382 var2 = this.field1251.field5585;
            if (this.field1251 == var2) {
                field1247++;
                this.field1252 = null;
                if (arg0) {
                    field1254 = null;
                    return;
                }
                return;
            }
            var2.method2352((byte) 114);
        }
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)Lj;", line = 294)
    public final class382 method539(byte arg0) {
        if (arg0 != 93) {
            return null;
        }
        field1249++;
        class382 var2 = this.field1251.field5588;
        if (this.field1251 == var2) {
            this.field1252 = null;
            return null;
        } else {
            this.field1252 = var2.field5588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 358)
    public class60() {
        this.field1251.field5588 = this.field1251;
        this.field1251.field5585 = this.field1251;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLjava/lang/String;)I", line = 324)
    public static final int method540(byte arg0, String arg1) {
        field1253++;
        if (arg0 != 91) {
            return -23;
        }
        for (int var2 = 0; var2 < class317.field4820.length; var2++) {
            if (class317.field4820[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)Z", line = 344)
    public final boolean method541(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field1244++;
            return this.field1251.field5585 == this.field1251;
        }
    }
}
