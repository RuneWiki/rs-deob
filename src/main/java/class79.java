import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class79 {

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field1193 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field1199 = -1;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lol;")
    private class220 field1184 = new class220();

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Z")
    public boolean field1200 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[Lgh;")
    private class217[] field1188;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[[[I")
    private int[][][] field1186;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1195 = "wishes to trade with you.";

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field1198 = -1;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ljl;")
    public static class252 field1191 = new class252(0, 0);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lai;")
    public static class118 field1202;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Lvl;")
    public static class73 field1201;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[[[I")
    public static int[][][] field1192;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method536(int arg0) {
        field1197++;
        if (this.field1187 != this.field1185) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 <= 7) {
            this.method539((byte) 65);
        }
        for (int var2 = 0; var2 < this.field1187; var2++) {
            this.field1188[var2] = class181.field2854;
        }
        return this.field1186;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)Lek;")
    public static final class173 method537(int arg0, byte arg1) {
        class173 var2 = (class173) class255.field4156.method707((long) arg0, (byte) 25);
        field1190++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field2927.method501(-2, 0, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class173 var4 = class94.method640((byte) 62, var3);
            class255.field4156.method712(false, var4, (long) arg0);
            return arg1 == -66 ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IB)[[I")
    public final int[][] method538(int arg0, byte arg1) {
        field1194++;
        int var3 = 0 / ((arg1 - 52) / 32);
        if (this.field1187 == this.field1185) {
            this.field1200 = this.field1188[arg0] == null;
            this.field1188[arg0] = class181.field2854;
            return this.field1186[arg0];
        } else if (this.field1187 == 1) {
            this.field1200 = this.field1199 != arg0;
            this.field1199 = arg0;
            return this.field1186[0];
        } else {
            class217 var4 = this.field1188[arg0];
            if (var4 == null) {
                this.field1200 = true;
                if (this.field1193 >= this.field1187) {
                    class217 var5 = (class217) this.field1184.method1541(1);
                    var4 = new class217(arg0, var5.field3398);
                    this.field1188[var5.field3395] = null;
                    var5.method1764(64);
                } else {
                    var4 = new class217(arg0, this.field1193);
                    this.field1193++;
                }
                this.field1188[arg0] = var4;
            } else {
                this.field1200 = false;
            }
            this.field1184.method1539(-1770092592, var4);
            return this.field1186[var4.field3398];
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public final void method539(byte arg0) {
        field1196++;
        for (int var2 = 0; var2 < this.field1187; var2++) {
            this.field1186[var2][0] = null;
            this.field1186[var2][1] = null;
            this.field1186[var2][2] = null;
            this.field1186[var2] = null;
        }
        this.field1188 = null;
        if (arg0 == -95) {
            this.field1186 = null;
            this.field1184.method1544((byte) 43);
            this.field1184 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1202 = null;
        field1192 = null;
        field1191 = null;
        field1195 = null;
        if (arg0 != 0) {
            field1202 = null;
        }
        field1201 = null;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(III)V")
    public class79(int arg0, int arg1, int arg2) {
        this.field1185 = arg1;
        this.field1188 = new class217[this.field1185];
        this.field1187 = arg0;
        this.field1186 = new int[this.field1187][3][arg2];
    }
}
