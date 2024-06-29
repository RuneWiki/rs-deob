import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class199 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    private int field3312 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    private int field3313 = -1;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Llc;")
    private class160 field3311 = new class160();

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Z")
    public boolean field3333 = false;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    private int field3321;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[[I")
    private int[][] field3317;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[Lfd;")
    private class237[] field3310;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Lld;")
    public static class118 field3324 = new class118(16);

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Lok;")
    public static class146 field3326 = class235.method1724(-12908, "<)4col>");

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Lok;")
    public static class146 field3327 = class235.method1724(-12908, "Fermer");

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3331 = 0;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field3330 = 3353893;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Lok;")
    public static class146 field3329 = class235.method1724(-12908, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Lok;")
    public static class146 field3335 = class235.method1724(-12908, "Konfig geladen)3");

    @OriginalMember(owner = "client!og", name = "C", descriptor = "Lok;")
    public static class146 field3336 = class235.method1724(-12908, "(U (X");

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[Lok;")
    public static class146[] field3328;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "[[[I")
    public static int[][][] field3332;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Lci;", line = 8)
    public static final class194 method1527(byte arg0) {
        field3320++;
        return arg0 == 84 ? class75.field1219 : (class194) null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 22)
    public final void method1528(byte arg0) {
        for (int var2 = 0; var2 < this.field3321; var2++) {
            this.field3317[var2] = null;
        }
        field3316++;
        this.field3310 = null;
        if (arg0 >= -112) {
            field3329 = (class146) null;
        }
        this.field3317 = (int[][]) null;
        this.field3311.method1257(2);
        this.field3311 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I", line = 44)
    public static final int method1529(int arg0, int arg1) {
        if (arg1 == 26251) {
            field3315++;
            return arg0 & 0x7F;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I", line = 56)
    public static final int method1530(int arg0) {
        if (arg0 != 0) {
            field3324 = (class118) null;
        }
        field3325++;
        if ((double) class28.field491 == 3.0D) {
            return 37;
        } else if ((double) class28.field491 == 4.0D) {
            return 50;
        } else if ((double) class28.field491 == 6.0D) {
            return 75;
        } else if ((double) class28.field491 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)V", line = 82)
    public static final void method1531(int arg0, int arg1, boolean arg2) {
        field3322++;
        class158 var3 = class206.method1564(arg0, 7, -103);
        var3.method1236(-13730);
        if (!arg2) {
            var3.field2663 = arg1;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)[I", line = 97)
    public final int[] method1532(int arg0, byte arg1) {
        if (arg1 <= 82) {
            method1530(-117);
        }
        field3314++;
        if (this.field3321 == this.field3309) {
            this.field3333 = this.field3310[arg0] == null;
            this.field3310[arg0] = class182.field3046;
            return this.field3317[arg0];
        } else if (this.field3321 == 1) {
            this.field3333 = this.field3313 != arg0;
            this.field3313 = arg0;
            return this.field3317[0];
        } else {
            class237 var3 = this.field3310[arg0];
            if (var3 == null) {
                this.field3333 = true;
                if (this.field3312 < this.field3321) {
                    var3 = new class237(arg0, this.field3312);
                    this.field3312++;
                } else {
                    class237 var4 = (class237) this.field3311.method1256(24791);
                    var3 = new class237(arg0, var4.field3960);
                    this.field3310[var4.field3958] = null;
                    var4.method1325(-2935);
                }
                this.field3310[arg0] = var3;
            } else {
                this.field3333 = false;
            }
            this.field3311.method1252((byte) -60, var3);
            return this.field3317[var3.field3960];
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V", line = 260)
    public class199(int arg0, int arg1, int arg2) {
        this.field3309 = arg1;
        this.field3321 = arg0;
        this.field3317 = new int[this.field3321][arg2];
        this.field3310 = new class237[this.field3309];
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)[[I", line = 181)
    public final int[][] method1533(int arg0) {
        field3318++;
        if (this.field3321 != this.field3309) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 21819) {
            for (int var2 = 0; var2 < this.field3321; var2++) {
                this.field3310[var2] = class182.field3046;
            }
            return this.field3317;
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V", line = 210)
    public static void method1534(int arg0) {
        field3326 = null;
        field3328 = null;
        field3329 = null;
        field3332 = (int[][][]) null;
        if (arg0 != 127) {
            method1531(-59, 92, false);
        }
        field3324 = null;
        field3336 = null;
        field3327 = null;
        field3335 = null;
    }
}
