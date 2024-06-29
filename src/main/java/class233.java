import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class233 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    private int field3498 = -1;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    private int field3502 = 0;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lv;")
    private class165 field3509 = new class165();

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
    public boolean field3510 = false;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[[[I")
    private int[][][] field3499;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[Lia;")
    private class32[] field3507;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3500 = -1;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 3)
    public static final byte[] method1595(String arg0, boolean arg1) {
        field3501++;
        int var2 = arg0.length();
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
        if (arg1) {
            field3500 = -85;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 143)
    public final void method1596(int arg0) {
        for (int var2 = arg0; var2 < this.field3505; var2++) {
            this.field3499[var2][0] = null;
            this.field3499[var2][1] = null;
            this.field3499[var2][2] = null;
            this.field3499[var2] = null;
        }
        field3506++;
        this.field3507 = null;
        this.field3499 = null;
        this.field3509.method1046((byte) -65);
        this.field3509 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[[I", line = 166)
    public final int[][] method1597(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field3508++;
        if (this.field3505 == this.field3503) {
            this.field3510 = this.field3507[arg0] == null;
            this.field3507[arg0] = class22.field204;
            return this.field3499[arg0];
        } else if (this.field3505 == 1) {
            this.field3510 = this.field3498 != arg0;
            this.field3498 = arg0;
            return this.field3499[0];
        } else {
            class32 var3 = this.field3507[arg0];
            if (var3 == null) {
                this.field3510 = true;
                if (this.field3502 >= this.field3505) {
                    class32 var4 = (class32) this.field3509.method1045((byte) -128);
                    var3 = new class32(arg0, var4.field306);
                    this.field3507[var4.field304] = null;
                    var4.method527(-11229);
                } else {
                    var3 = new class32(arg0, this.field3502);
                    this.field3502++;
                }
                this.field3507[arg0] = var3;
            } else {
                this.field3510 = false;
            }
            this.field3509.method1042(var3, 1048832);
            return this.field3499[var3.field306];
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(III)V", line = 284)
    public class233(int arg0, int arg1, int arg2) {
        this.field3505 = arg0;
        this.field3503 = arg1;
        this.field3499 = new int[this.field3505][3][arg2];
        this.field3507 = new class32[this.field3503];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)[[[I", line = 242)
    public final int[][][] method1598(boolean arg0) {
        field3504++;
        if (this.field3505 != this.field3503) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.field3505 = -114;
        }
        for (int var2 = 0; var2 < this.field3505; var2++) {
            this.field3507[var2] = class22.field204;
        }
        return this.field3499;
    }
}
