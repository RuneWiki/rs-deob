import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class212 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    private int field2954 = -1;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    private int field2962 = 0;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lar;")
    private class479 field2959 = new class479();

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "Z")
    public boolean field2966 = false;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    private int field2957;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[[I")
    private int[][] field2955;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "[Ljq;")
    private class354[] field2965;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "Lmn;")
    public static class247 field2960 = new class247(8);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lar;")
    public static class479 field2958;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V")
    public static final void method1309(int arg0, byte arg1) {
        field2964++;
        class97 var2 = class348.method2064(arg0, 7, 120);
        var2.method710(-9237);
        if (arg1 >= -60) {
            method1309(-89, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)[[I")
    public final int[][] method1310(int arg0) {
        field2961++;
        if (this.field2957 != this.field2953) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 3286) {
            this.field2959 = null;
        }
        for (int var2 = 0; var2 < this.field2953; var2++) {
            this.field2965[var2] = class211.field2949;
        }
        return this.field2955;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public final void method1311(int arg0) {
        if (arg0 != 7) {
            this.method1311(2);
        }
        for (int var2 = 0; var2 < this.field2953; var2++) {
            this.field2955[var2] = null;
        }
        field2956++;
        this.field2955 = null;
        this.field2965 = null;
        this.field2959.method2814((byte) 82);
        this.field2959 = null;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IB)[I")
    public final int[] method1312(int arg0, byte arg1) {
        if (arg1 != 74) {
            this.field2959 = null;
        }
        field2963++;
        if (this.field2957 == this.field2953) {
            this.field2966 = this.field2965[arg0] == null;
            this.field2965[arg0] = class211.field2949;
            return this.field2955[arg0];
        } else if (this.field2953 == 1) {
            this.field2966 = this.field2954 != arg0;
            this.field2954 = arg0;
            return this.field2955[0];
        } else {
            class354 var3 = this.field2965[arg0];
            if (var3 == null) {
                this.field2966 = true;
                if (this.field2962 >= this.field2953) {
                    class354 var4 = (class354) this.field2959.method2811(2);
                    var3 = new class354(arg0, var4.field5185);
                    this.field2965[var4.field5188] = null;
                    var4.method1565(0);
                } else {
                    var3 = new class354(arg0, this.field2962);
                    this.field2962++;
                }
                this.field2965[arg0] = var3;
            } else {
                this.field2966 = false;
            }
            this.field2959.method2817(var3, true);
            return this.field2955[var3.field5185];
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
    public static void method1313(int arg0) {
        field2960 = null;
        field2958 = null;
        if (arg0 < 57) {
            method1309(30, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(III)V")
    public class212(int arg0, int arg1, int arg2) {
        this.field2957 = arg1;
        this.field2953 = arg0;
        this.field2955 = new int[this.field2953][arg2];
        this.field2965 = new class354[this.field2957];
    }
}
