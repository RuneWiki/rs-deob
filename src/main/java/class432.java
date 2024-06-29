import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class432 {

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Z")
    public boolean field5954 = false;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Z")
    public boolean field5951 = false;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public int field5956 = -1;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public int field5957 = 64;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public int field5953 = 64;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public int field5960 = 1;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public int field5959 = 2;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Luq;")
    public static class246 field5950 = null;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "J")
    public static long field5958 = 0L;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "Lpi;")
    public static class340 field5955;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLbt;I)V")
    public final void method2554(byte arg0, class88 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method617(2);
            if (var4 == 0) {
                field5948++;
                if (arg0 != -84) {
                    this.field5956 = 58;
                    return;
                }
                return;
            }
            this.method2556((byte) 90, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static void method2555(byte arg0) {
        if (arg0 != -68) {
            field5958 = 56L;
        }
        field5955 = null;
        field5950 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BILbt;I)V")
    private final void method2556(byte arg0, int arg1, class88 arg2, int arg3) {
        if (arg0 < 79) {
            return;
        }
        if (arg3 == 1) {
            this.field5956 = arg2.method568((byte) 110);
            if (this.field5956 == 65535) {
                this.field5956 = -1;
            }
        } else if (arg3 == 2) {
            this.field5953 = arg2.method568((byte) 110) + 1;
            this.field5957 = arg2.method568((byte) 110) + 1;
        } else if (arg3 == 3) {
            arg2.method575(-115);
        } else if (arg3 == 4) {
            this.field5959 = arg2.method617(2);
        } else if (arg3 == 5) {
            this.field5960 = arg2.method617(2);
        } else if (arg3 == 6) {
            this.field5951 = true;
        } else if (arg3 == 7) {
            this.field5954 = true;
        }
        field5949++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method2557(String arg0, byte arg1) {
        field5952++;
        int var2 = arg0.length();
        if (arg1 != 5) {
            return null;
        }
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
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
}
