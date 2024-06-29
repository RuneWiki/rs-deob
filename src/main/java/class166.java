import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class166 extends class119 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    private int field3186;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "[Z")
    private boolean[] field3173;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
    public int[] field3185;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[[I")
    public int[][] field3179;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lai;")
    public static class10 field3178 = class44.method278("(Y<)4col>", 115);

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lai;")
    private static class10 field3182 = class44.method278("wave:", -96);

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lai;")
    public static class10 field3176 = field3182;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lai;")
    public static class10 field3174 = field3182;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lvb;")
    public static class192 field3175 = new class192();

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static volatile int field3188 = 0;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
    public static int[] field3187 = new int[32768];

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1099(byte arg0, Component arg1) {
        field3184++;
        if (arg0 >= 35) {
            arg1.addMouseListener(class84.field1460);
            arg1.addMouseMotionListener(class84.field1460);
            arg1.addFocusListener(class84.field1460);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
    public static final void method1100(int arg0, byte arg1, int arg2) {
        if (arg1 <= 76) {
            method1103((byte) -73);
        }
        long var3 = (long) ((arg2 << 16) + arg0);
        field3181++;
        class194 var5 = (class194) class98.field1803.method213(120, var3);
        if (var5 != null) {
            class42.field697.method904(40, var5);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method1101(int arg0) {
        if (arg0 != -9741) {
            method1099((byte) 91, null);
        }
        field3180++;
        for (class170 var1 = (class170) class145.field2777.method1223(true); var1 != null; var1 = (class170) class145.field2777.method1226((byte) -57)) {
            if (var1.field3283 != null) {
                var1.method1124(arg0 ^ 0x267B);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I")
    public static final int method1102(byte arg0, int arg1) {
        if (arg0 < 77) {
            field3174 = null;
        }
        field3177++;
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        field3174 = null;
        field3187 = null;
        field3176 = null;
        field3178 = null;
        if (arg0 != 60) {
            method1100(70, (byte) -6, 41);
        }
        field3182 = null;
        field3175 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I[B)V")
    public class166(int arg0, byte[] arg1) {
        this.field3183 = arg0;
        class114 var3 = new class114(arg1);
        this.field3186 = var3.method767(true);
        this.field3173 = new boolean[this.field3186];
        this.field3185 = new int[this.field3186];
        this.field3179 = new int[this.field3186][];
        for (int var4 = 0; var4 < this.field3186; var4++) {
            this.field3185[var4] = var3.method767(true);
        }
        for (int var5 = 0; var5 < this.field3186; var5++) {
            this.field3173[var5] = var3.method767(true) == 1;
        }
        for (int var6 = 0; var6 < this.field3186; var6++) {
            this.field3179[var6] = new int[var3.method767(true)];
        }
        for (int var7 = 0; var7 < this.field3186; var7++) {
            for (int var8 = 0; var8 < this.field3179[var7].length; var8++) {
                this.field3179[var7][var8] = var3.method767(true);
            }
        }
    }
}
