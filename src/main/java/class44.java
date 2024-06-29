import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class44 extends class102 {

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "[J")
    private long[] field1153 = new long[10];

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lke;")
    private static class65 field1154 = class1.method17("Your ignore list is full)3 Max of 100 hit", -115);

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field1165 = 0;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Lke;")
    public static class65 field1157 = class1.method17(")1", -124);

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Lke;")
    public static class65 field1159 = class1.method17("Ausw-=hlen", -122);

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lke;")
    public static class65 field1171 = field1154;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Lke;")
    public static class65 field1152 = class1.method17(" weitere Optionen", -121);

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Lke;")
    private static class65 field1169 = class1.method17("Please wait)3)3)3", -126);

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1164 = -1;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Lke;")
    public static class65 field1173 = class1.method17("Unerwartete Antwort vom Anmelde)2Server)3", -116);

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "Lke;")
    public static class65 field1170 = class1.method17("(Y", -115);

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Lke;")
    private static class65 field1172 = class1.method17("Connecting to server)3)3)3", -114);

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Lke;")
    public static class65 field1160 = class1.method17("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>", -112);

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Lke;")
    public static class65 field1166 = field1172;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Lke;")
    public static class65 field1155 = class1.method17("Suche nach Updates )2 ", -112);

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field1151 = 78;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lke;")
    public static class65 field1175 = field1169;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field1168 = 0;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "J")
    private long field1174;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)I", line = 3)
    public final int method61(boolean arg0, int arg1, int arg2) {
        field1163++;
        if (!arg0) {
            this.field1161 = 71;
        }
        int var4 = this.field1147;
        int var5 = this.field1167;
        this.field1167 = 1;
        this.field1147 = 300;
        this.field1174 = System.currentTimeMillis();
        if (this.field1153[this.field1176] == 0L) {
            this.field1167 = var5;
            this.field1147 = var4;
        } else if (this.field1153[this.field1176] < this.field1174) {
            this.field1147 = (int) ((long) (arg2 * 2560) / (this.field1174 - this.field1153[this.field1176]));
        }
        if (this.field1147 < 25) {
            this.field1147 = 25;
        }
        if (this.field1147 > 256) {
            this.field1147 = 256;
            this.field1167 = (int) ((long) arg2 - (this.field1174 - this.field1153[this.field1176]) / 10L);
        }
        if (arg2 < this.field1167) {
            this.field1167 = arg2;
        }
        this.field1153[this.field1176] = this.field1174;
        this.field1176 = (this.field1176 + 1) % 10;
        if (this.field1167 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1153[var6] != 0L) {
                    this.field1153[var6] += this.field1167;
                }
            }
        }
        if (this.field1167 < arg1) {
            this.field1167 = arg1;
        }
        int var7 = 0;
        class58.method498((long) this.field1167, 10);
        while (this.field1161 < 256) {
            var7++;
            this.field1161 += this.field1147;
        }
        this.field1161 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 86)
    public static final void method375(int arg0) {
        if (arg0 > -71) {
            method376((byte) -123);
        }
        field1146++;
        for (class22 var1 = (class22) class104.field2663.method421(1); var1 != null; var1 = (class22) class104.field2663.method428(22743)) {
            if (var1.field544 == -1) {
                var1.field534 = 0;
                class6.method47(127, var1);
            } else {
                var1.method133(2);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 111)
    public static final void method376(byte arg0) {
        class58.field1590.method793(-127);
        field1158++;
        if (arg0 >= -121) {
            method377((byte) -30);
        }
        class78.field2095 = class127.method1003(class78.field2095);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 123)
    public final void method62(int arg0) {
        this.field1167 = 1;
        this.field1147 = 256;
        this.field1161 = 0;
        this.field1174 = System.currentTimeMillis();
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1153[var2] = this.field1174;
        }
        if (arg0 != 103) {
            this.field1161 = 26;
        }
        field1145++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 146)
    public static void method377(byte arg0) {
        field1159 = null;
        field1154 = null;
        field1166 = null;
        field1155 = null;
        field1160 = null;
        field1173 = null;
        field1152 = null;
        if (arg0 <= 25) {
            return;
        }
        field1169 = null;
        field1157 = null;
        field1175 = null;
        field1172 = null;
        field1171 = null;
        field1170 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI[BIIII[Lne;)V", line = 172)
    public static final void method378(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, class83[] arg9) {
        field1148++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg3 + var16 > 0 && arg3 + var16 < 103) {
                    arg9[arg6].field2174[arg1 + var10][arg3 + var16] = class114.method934(arg9[arg6].field2174[arg1 + var10][arg3 + var16], -16777217);
                }
            }
        }
        int var11 = 89 % ((arg2 + 85) / 41);
        class39 var12 = new class39(arg4);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg7 && var14 < arg7 + 8 && arg8 <= var15 && var15 < arg8 + 8) {
                        class6.method40(0, arg0, var12, arg6, class13.method80(var15 & 0x7, arg0, false, var14 & 0x7) + arg3, arg1 + class28.method233(arg0, 7, var15 & 0x7, var14 & 0x7), 0, 8);
                    } else {
                        class6.method40(0, 0, var12, 0, -1, -1, 0, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V", line = 289)
    public final void method60(boolean arg0) {
        field1149++;
        if (arg0) {
            field1168 = -49;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1153[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 336)
    public class44() {
        this.method62(103);
    }
}
