import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class229 extends class132 {

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "[[I")
    public int[][] field4316;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
    public int[] field4305;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[Z")
    private boolean[] field4307;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Lbd;")
    public static class16 field4309 = new class16(0, 0);

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Lvd;")
    public static class222 field4310 = class212.method1357(":duelfriend:", 10731);

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field4314 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "[I")
    public static int[] field4311 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field4318 = 0;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[J")
    public static long[] field4317 = new long[100];

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "[I")
    public static int[] field4315 = new int[1000];

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "D")
    public static double field4313;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
    public static final void method1509(int arg0) {
        field4308++;
        class18.field442.method596(false);
        if (arg0 == 0) {
            class46.field946.method1072((byte) -41);
            class116.field2219.method596(false);
        }
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field4315 = null;
        if (arg0 < 38) {
            method1509(-1);
        }
        field4309 = null;
        field4317 = null;
        field4311 = null;
        field4310 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I[B)V")
    public class229(int arg0, byte[] arg1) {
        this.field4306 = arg0;
        class109 var3 = new class109(arg1);
        this.field4304 = var3.method662((byte) -112);
        this.field4316 = new int[this.field4304][];
        this.field4305 = new int[this.field4304];
        this.field4307 = new boolean[this.field4304];
        for (int var4 = 0; var4 < this.field4304; var4++) {
            this.field4305[var4] = var3.method662((byte) -90);
        }
        for (int var5 = 0; var5 < this.field4304; var5++) {
            this.field4307[var5] = var3.method662((byte) -104) == 1;
        }
        for (int var6 = 0; var6 < this.field4304; var6++) {
            this.field4316[var6] = new int[var3.method662((byte) -91)];
        }
        for (int var7 = 0; var7 < this.field4304; var7++) {
            for (int var8 = 0; var8 < this.field4316[var7].length; var8++) {
                this.field4316[var7][var8] = var3.method662((byte) -122);
            }
        }
    }
}
