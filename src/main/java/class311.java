import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class311 {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Ljm;")
    public static class162 field4218 = new class162();

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Z")
    public static boolean field4221 = false;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lom;")
    public static class128 field4228;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "J")
    public long field4226;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "Lvi;")
    public class311 field4223;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lvi;")
    public class311 field4225;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "[Lvg;")
    public static class108[] field4224;

    static {
        new class368((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field4228 = new class128();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1881(int arg0, byte arg1) {
        if (arg1 != -26) {
            method1888((byte) -113, 'V');
        }
        field4216++;
        class408 var2 = class118.field1797;
        synchronized (class118.field1797) {
            class118.field1797.method2531(arg0, 112);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1882(int arg0, int arg1) {
        class258.field3572 = -1;
        field4220++;
        if (arg1 == -19829) {
            class274.field3747 = arg0;
            class258.field3572 = -1;
            class302.method1833(78);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1883(int arg0) {
        if (arg0 != -9083) {
            method1881(-70, (byte) -98);
        }
        field4215++;
        if (class325.field4424) {
            return;
        }
        class248.method1611(class255.field3554, (byte) 123);
        if (class304.field4147 != null) {
            class248.method1611(class304.field4147, (byte) 120);
        }
        class325.field4424 = true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 56)
    public final void method1884(boolean arg0) {
        if (arg0) {
            field4221 = true;
        }
        field4227++;
        if (this.field4225 != null) {
            this.field4225.field4223 = this.field4223;
            this.field4223.field4225 = this.field4225;
            this.field4223 = null;
            this.field4225 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 85)
    public static void method1885(byte arg0) {
        field4224 = null;
        field4228 = null;
        field4218 = null;
        if (arg0 != 97) {
            method1886(false, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZB)I", line = 104)
    public static final int method1886(boolean arg0, byte arg1) {
        field4217++;
        if (arg1 < 37) {
            field4228 = null;
        }
        long var2 = class199.method1372(30938);
        for (class93 var4 = arg0 ? (class93) class366.field5073.method842((byte) -25) : (class93) class366.field5073.method836(-101); var4 != null; var4 = (class93) class366.field5073.method836(-114)) {
            if (var2 > (var4.field1295 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1295 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4226;
                    class13.field121[var5] = class66.field924[var5];
                    var4.method1884(false);
                    return var5;
                }
                var4.method1884(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z", line = 144)
    public final boolean method1887(int arg0) {
        if (arg0 < 63) {
            this.method1884(false);
        }
        field4219++;
        return this.field4225 != null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BC)B", line = 165)
    public static final byte method1888(byte arg0, char arg1) {
        field4214++;
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
        if (arg0 != 70) {
            method1886(true, (byte) 97);
        }
        return var2;
    }
}
