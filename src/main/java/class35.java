import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class35 extends class149 {

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    private int field709 = 0;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    private int field711 = -1;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Lsg;")
    public static class169 field693 = class165.method1060("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 1536);

    @OriginalMember(owner = "client!df", name = "X", descriptor = "[I")
    public static int[] field699 = new int[1000];

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "Lsg;")
    public static class169 field706 = class165.method1060("Null", 1536);

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lsg;")
    public static class169 field707 = class165.method1060("Keine Antwort vom Server)3", 1536);

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lsg;")
    public static class169 field700 = class165.method1060("<col=ffb000>", 1536);

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lsg;")
    private static class169 field691 = class165.method1060("Your profile will be transferred in:", 1536);

    @OriginalMember(owner = "client!df", name = "db", descriptor = "Lsg;")
    public static class169 field705 = field691;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Lsg;")
    public static class169 field695 = class165.method1060("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 1536);

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "[Lhf;")
    public static class70[] field696;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILoa;B)V")
    private final void method234(int arg0, int arg1, class127 arg2, byte arg3) {
        if (arg1 == 1) {
            this.field709 = arg2.method773((byte) -128);
        } else if (arg1 == 2) {
            this.field711 = arg2.method785(true);
            if (this.field711 == 65535) {
                this.field711 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method785(true);
        }
        field692++;
        int var5 = 55 / ((11 - arg3) / 50);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II)V")
    private final void method235(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        field710++;
        if (var5 > var3) {
            var7 = var3;
        }
        double var9 = var5;
        double var11 = (double) (arg1 & 0xFF) / 256.0D;
        if (var11 < var7) {
            var7 = var11;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 < var3) {
            var9 = var3;
        }
        if (var9 < var11) {
            var9 = var11;
        }
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var17 < 0.5D) {
                var15 = (var9 - var7) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var7) / (2.0D - var9 - var7);
            }
            if (var5 == var9) {
                var13 = (var3 - var11) / (-var7 + var9);
            } else if (var3 == var9) {
                var13 = (var11 - var5) / (var9 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (-var7 + var9) + 4.0D;
            }
        }
        if (var17 > 0.5D) {
            this.field703 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field703 = (int) (var15 * var17 * 512.0D);
        }
        this.field701 = (int) (var17 * 256.0D);
        if (this.field701 < 0) {
            this.field701 = 0;
        } else if (this.field701 > 255) {
            this.field701 = 255;
        }
        if (this.field703 < 1) {
            this.field703 = 1;
        }
        this.field698 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (arg0 < 120) {
            this.method238((byte) 81);
        }
        this.field708 = (int) ((double) this.field703 * var19);
        if (this.field698 < 0) {
            this.field698 = 0;
        } else if (this.field698 > 255) {
            this.field698 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static void method236(int arg0) {
        field696 = null;
        field700 = null;
        field693 = null;
        field705 = null;
        field706 = null;
        field695 = null;
        if (arg0 == -26993) {
            field699 = null;
            field691 = null;
            field707 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLoa;I)V")
    public final void method237(boolean arg0, class127 arg1, int arg2) {
        field694++;
        while (true) {
            int var4 = arg1.method819((byte) 22);
            if (var4 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.field701 = 63;
                    return;
                }
            }
            this.method234(arg2, var4, arg1, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public final void method238(byte arg0) {
        field697++;
        this.method235(arg0 ^ 0xFFFFFFB8, this.field709);
        class94.method547(this.field708 * 256 / this.field703, this.field701, arg0 - 10211, this.field698);
        if (arg0 != -60) {
            method236(-20);
        }
    }
}
