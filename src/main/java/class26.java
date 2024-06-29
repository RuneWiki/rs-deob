import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class26 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public int field326 = 0;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public int field332 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
    private boolean field321 = false;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
    public static int[] field323 = new int[250];

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "J")
    public static long field328 = 0L;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "J")
    public long field322;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field318;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILlf;Z)V")
    private final void method135(int arg0, class130 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field327 = arg1.method798(false);
        } else if (arg0 == 2) {
            arg1.method837(true);
        } else if (arg0 == 3) {
            this.field330 = arg1.method815(true);
            this.field333 = arg1.method815(true);
            this.field329 = arg1.method815(arg2);
        } else if (arg0 == 4) {
            this.field337 = arg1.method837(true);
            this.field336 = arg1.method815(arg2);
        } else if (arg0 == 6) {
            this.field340 = arg1.method837(true);
        } else if (arg0 == 8) {
            this.field332 = 1;
        } else if (arg0 == 9) {
            this.field326 = 1;
        } else if (arg0 == 10) {
            this.field321 = true;
        }
        if (arg2) {
            field334++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Llf;B)V")
    public final void method136(class130 arg0, byte arg1) {
        if (arg1 <= 31) {
            method137((byte) -29, (class311) null);
        }
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                field341++;
                return;
            }
            this.method135(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLhl;)V")
    public static final void method137(byte arg0, class311 arg1) {
        field338++;
        int var2 = arg1.field4562 - class34.field434;
        int var3 = arg1.field4504 * 128 + arg1.method773((byte) 53) * 64;
        if (arg0 <= 38) {
            method137((byte) 22, (class311) null);
        }
        int var4 = arg1.field4580 * 128 + (arg1.method773((byte) 107) * 64);
        arg1.field4466 += (var4 - arg1.field4466) / var2;
        arg1.field4604 = 0;
        arg1.field4463 += (var3 - arg1.field4463) / var2;
        if (arg1.field4567 == 0) {
            arg1.method2079((byte) -60, 8192);
        }
        if (arg1.field4567 == 1) {
            arg1.method2079((byte) -40, 12288);
        }
        if (arg1.field4567 == 2) {
            arg1.method2079((byte) -58, 0);
        }
        if (arg1.field4567 == 3) {
            arg1.method2079((byte) -38, 4096);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method138(int arg0) {
        if (arg0 != -13044) {
            method140(84);
        }
        field324++;
        class450.field6447.method102((byte) -115);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method139(int arg0) {
        this.field335 = class447.field6390[this.field327 << 3];
        field320++;
        this.field331 = (int) Math.sqrt((double) (this.field333 * this.field333 + this.field330 * this.field330 + this.field329 * this.field329));
        if (this.field336 == 0) {
            this.field336 = 1;
        }
        if (this.field337 == arg0) {
            this.field322 = 2147483647L;
        } else if (this.field337 == 1) {
            this.field322 = (long) (this.field331 * 8 / this.field336);
            this.field322 *= this.field322;
        } else if (this.field337 == 2) {
            this.field322 = (long) (this.field331 * 8 / this.field336);
        }
        if (this.field321) {
            this.field331 *= -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static void method140(int arg0) {
        field323 = null;
        if (arg0 != 12288) {
            field328 = 70L;
        }
        field318 = null;
    }
}
