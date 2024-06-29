import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class224 extends class498 {

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Lkn;")
    public static class530 field3212 = new class530("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    public static int field3231;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jo", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field3232;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1384(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 3)
    public static void method1379(int arg0) {
        field3212 = null;
        if (arg0 >= -40) {
            field3212 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Lat;", line = 15)
    public static final class260 method1380(int arg0) {
        field3222++;
        try {
            return new class46();
        } catch (Throwable var2) {
            if (arg0 <= 21) {
                return null;
            }
            try {
                return (class260) Class.forName("ll").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class111();
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 41)
    public static final void method1381(byte arg0) {
        if (class488.field6832 == 2) {
            class86.method623(3, (byte) -69);
        } else if (class488.field6832 == 6) {
            class86.method623(7, (byte) 88);
        } else if (class488.field6832 == 9) {
            class86.method623(10, (byte) -124);
        }
        if (arg0 > -6) {
            method1381((byte) 121);
        }
        field3214++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZC)B", line = 68)
    public static final byte method1382(boolean arg0, char arg1) {
        field3213++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (!arg0) {
            method1380(108);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILza;I)Le;", line = 200)
    public final class377 method1383(int arg0, class290 arg1, int arg2) {
        field3231++;
        int var4 = class107.field1452[this.field3227];
        if (arg2 != -8365) {
            this.field3221 = 76;
        }
        if (var4 == 0) {
            class232 var11 = class38.method211(this.field3220, this.field3217, this.field3228);
            if (var11 instanceof class521) {
                class521 var12 = (class521) var11;
                if (var12.field7659 != null) {
                    return ((class21) var12.field7659).method116(13439, arg1, arg0);
                }
            }
        } else if (var4 == 1) {
            class362 var5 = class335.method2002(this.field3220, this.field3217, this.field3228);
            if (var5 instanceof class453) {
                class453 var6 = (class453) var5;
                if (var6.field6340 != null) {
                    return ((class21) var6.field6340).method116(arg2 ^ 0xFFFFEB2C, arg1, arg0);
                }
            }
        } else if (var4 == 2) {
            class144 var9 = class248.method1622(this.field3220, this.field3217, this.field3228, field3232 == null ? (field3232 = method1384("nc")) : field3232);
            if (var9 instanceof class209) {
                class209 var10 = (class209) var9;
                if (var10.field3052 != null) {
                    return ((class21) var10.field3052).method116(13439, arg1, arg0);
                }
            }
        } else if (var4 == 3) {
            class35 var7 = class87.method628(this.field3220, this.field3217, this.field3228);
            if (var7 instanceof class194) {
                class194 var8 = (class194) var7;
                if (var8.field2740 != null) {
                    return ((class21) var8.field2740).method116(13439, arg1, arg0);
                }
            }
        }
        return null;
    }
}
