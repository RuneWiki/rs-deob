import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class14 extends class297 {

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[Z")
    public boolean[] field261;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "[I")
    public int[] field270;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[[I")
    public int[][] field256;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field259 = -2;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "J")
    public static volatile long field265 = 0L;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "Lma;")
    public static class5 field263 = class12.method119("blinken2:", (byte) 69);

    @OriginalMember(owner = "client!o", name = "u", descriptor = "[I")
    public static int[] field257 = new int[100];

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field262 = 2;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field268 = 0;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "[Lla;")
    public static class178[] field267;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B[B)Lfl;", line = 4)
    public static final class299 method132(byte arg0, byte[] arg1) {
        field255++;
        if (arg1 == null) {
            return null;
        } else {
            class269 var2 = new class269(arg1, class88.field1315, class287.field4836, class112.field1665, class179.field2718, class37.field590);
            class207.method1365(arg0 ^ 0x70);
            return arg0 == 121 ? var2 : (class299) null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 51)
    public static void method133(byte arg0) {
        field267 = null;
        field263 = null;
        field257 = null;
        int var1 = -42 % ((-arg0 - 57) / 58);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I[B)V", line = 83)
    public class14(int arg0, byte[] arg1) {
        this.field258 = arg0;
        class221 var3 = new class221(arg1);
        this.field264 = var3.method1509(true);
        this.field261 = new boolean[this.field264];
        this.field270 = new int[this.field264];
        this.field256 = new int[this.field264][];
        for (int var4 = 0; var4 < this.field264; var4++) {
            this.field270[var4] = var3.method1509(true);
        }
        for (int var5 = 0; var5 < this.field264; var5++) {
            this.field261[var5] = var3.method1509(true) == 1;
        }
        for (int var6 = 0; var6 < this.field264; var6++) {
            this.field256[var6] = new int[var3.method1509(true)];
        }
        for (int var7 = 0; var7 < this.field264; var7++) {
            for (int var8 = 0; var8 < this.field256[var7].length; var8++) {
                this.field256[var7][var8] = var3.method1509(true);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)J", line = 135)
    public static final long method134(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        return var3 == null || var3.field3144 == null ? 0L : var3.field3144.field1980;
    }
}
