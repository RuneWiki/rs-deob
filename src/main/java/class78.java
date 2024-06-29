import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class78 {

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "B")
    public byte field1007;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "S")
    public short field1008;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
    public boolean field1009;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "S")
    public short field1016;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "S")
    public short field1006;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "B")
    public byte field1014;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field1020;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "Lkg;")
    public static class179 field1019;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "Lhd;")
    public static class523 field1021;

    static {
        new class335("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field1020 = Boolean.FALSE;
        field1019 = new class179(26, 8);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 8)
    public static void method668(int arg0) {
        field1019 = null;
        field1020 = null;
        if (arg0 <= 73) {
            field1019 = null;
        }
        field1021 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 27)
    public static final byte[] method669(byte arg0, String arg1) {
        field1010++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != -89) {
            return null;
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

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZLya;Lqn;)V", line = 165)
    public static final void method670(boolean arg0, class38 arg1, class47 arg2) {
        field1012++;
        if (class243.field3148) {
            return;
        }
        arg1.method325(0);
        if (arg0) {
            method669((byte) 66, null);
        }
        class5.field50 = arg1.method345(class311.method1825(arg2, class449.field6420), true);
        class5.field50.method130((class174.field2262 - class5.field50.method148()) / 2, (class390.field5236 - class5.field50.method131()) / 2);
        class367.field4755 = arg1.method345(class311.method1825(arg2, class428.field6080), true);
        class367.field4755.method130((class174.field2262 - class367.field4755.method148()) / 2, 18);
        class243.field3148 = true;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 195)
    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1007 = (byte) arg7;
        this.field1008 = (short) arg4;
        this.field1011 = arg0;
        this.field1009 = arg10;
        this.field1015 = arg11;
        this.field1016 = (short) arg5;
        this.field1006 = (short) arg6;
        this.field1017 = arg2;
        this.field1018 = arg3;
        this.field1014 = (byte) arg8;
        this.field1013 = arg1;
    }
}
