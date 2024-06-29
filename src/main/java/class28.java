import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class28 extends class32 {

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field399 = -1;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "[S")
    public static short[] field408 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "[I")
    public static int[] field406 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "Z")
    public static boolean field410 = false;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Llm;")
    public static class347 field417;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[B")
    private byte[] field411;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(CI)Z", line = 8)
    public static final boolean method194(char arg0, int arg1) {
        field402++;
        if (arg1 != -49) {
            method198((byte) 106);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)V", line = 20)
    public final void method195(int arg0, byte arg1, int arg2) {
        if (arg0 == 0) {
            this.field400 = this.field419 - (arg2 < 0 ? -arg2 : arg2);
            this.field414 = 4096;
            this.field400 = this.field400 * this.field400 >> 12;
            this.field405 = this.field400;
        } else {
            this.field414 = this.field416 * this.field400 >> 12;
            this.field400 = this.field419 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field414 < 0) {
                this.field414 = 0;
            } else if (this.field414 > 4096) {
                this.field414 = 4096;
            }
            this.field400 = this.field400 * this.field400 >> 12;
            this.field400 = this.field414 * this.field400 >> 12;
            this.field405 += this.field404 * this.field400 >> 12;
            this.field404 = this.field413 * this.field404 >> 12;
        }
        field409++;
        int var4 = 66 / ((-arg1 - 79) / 42);
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 54)
    public static void method196(int arg0) {
        field417 = null;
        if (arg0 == 6860) {
            field406 = null;
            field408 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 70)
    public final void method197(int arg0) {
        if (arg0 < 50) {
            this.method142(101, (byte) 103);
        }
        field401++;
        this.field407 = 0;
        this.field405 = 0;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V", line = 85)
    public static final void method198(byte arg0) {
        class51.field684 = 0;
        field420++;
        class225.field2964 = 0;
        class174.method1069((byte) 102);
        class394.method2517((byte) 121);
        class61.method426(arg0 ^ 0xFFFFD781);
        if (arg0 != 40) {
            return;
        }
        for (int var1 = 0; var1 < class51.field684; var1++) {
            int var3 = class227.field2979[var1];
            if (field418 != class306.field4496[var3].field4342) {
                if (class306.field4496[var3].field606.method1508(arg0 + 79)) {
                    class87.method617((byte) -114, class306.field4496[var3]);
                }
                class306.field4496[var3].method306(0, (class249) null);
                class306.field4496[var3] = null;
            }
        }
        if (class300.field4398 != class156.field2120.field3029) {
            throw new RuntimeException("gnp1 pos:" + class156.field2120.field3029 + " psize:" + class300.field4398);
        }
        for (int var2 = 0; var2 < class198.field2637; var2++) {
            if (class306.field4496[class398.field5938[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class198.field2637);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 148)
    public final void method199(int arg0) {
        field421++;
        this.field405 >>= 0x4;
        if (arg0 != 255) {
            return;
        }
        this.field404 = this.field413;
        if (this.field405 < 0) {
            this.field405 = 0;
        } else if (this.field405 > 255) {
            this.field405 = 255;
        }
        this.method142(this.field407++, (byte) this.field405);
        this.field405 = 0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V", line = 176)
    public void method142(int arg0, byte arg1) {
        this.field411[arg0] = arg1;
        field403++;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIFFF)V", line = 184)
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field419 = (int) (arg6 * 4096.0F);
        this.field416 = (int) (arg7 * 4096.0F);
        this.field404 = this.field413 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII)V", line = 207)
    public static final void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class432 var7 = new class432();
        var7.field6345 = arg1 >> 7;
        var7.field6352 = arg2 >> 7;
        var7.field6358 = arg3 >> 7;
        var7.field6340 = arg4 >> 7;
        var7.field6349 = arg0;
        var7.field6356 = arg1;
        var7.field6355 = arg2;
        var7.field6353 = arg3;
        var7.field6361 = arg4;
        var7.field6357 = arg5;
        var7.field6343 = arg6;
        class194.field2604[class395.field5826++] = var7;
    }
}
