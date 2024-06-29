import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class111 extends class237 {

    @OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!qha", name = "C", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!qha", name = "r", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!qha", name = "x", descriptor = "[I")
    public static int[] field1406 = new int[14];

    @OriginalMember(owner = "client!qha", name = "v", descriptor = "Z")
    public static boolean field1404 = false;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!qha", name = "q", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!qha", name = "t", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!qha", name = "w", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!qha", name = "A", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!qha", name = "B", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!qha", name = "E", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!qha", name = "y", descriptor = "J")
    public static long field1407;

    @OriginalMember(owner = "client!qha", name = "D", descriptor = "Lvm;")
    public static class713 field1412;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "[B")
    private byte[] field1397;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
    public final void method771(int arg0) {
        this.field1400 = this.field1411;
        field1405++;
        this.field1410 >>= 0x4;
        if (this.field1410 < 0) {
            this.field1410 = 0;
        } else if (this.field1410 > 255) {
            this.field1410 = 255;
        }
        this.method776(-1737357460, (byte) this.field1410, this.field1409++);
        if (arg0 != -1338152244) {
            this.field1410 = -16;
        }
        this.field1410 = 0;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)V")
    public final void method772(byte arg0) {
        if (arg0 != -15) {
            method775(93);
        }
        this.field1410 = 0;
        this.field1409 = 0;
        field1413++;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)I")
    public static int method773(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1401 = (int) (arg6 * 4096.0F);
        this.field1403 = (int) (arg7 * 4096.0F);
        this.field1400 = this.field1411 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V")
    public final void method774(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1398 = this.field1401 - (arg0 < 0 ? -arg0 : arg0);
            this.field1402 = 4096;
            this.field1398 = this.field1398 * this.field1398 >> 12;
            this.field1410 = this.field1398;
        } else {
            this.field1402 = this.field1403 * this.field1398 >> 12;
            this.field1398 = this.field1401 - (arg0 < 0 ? -arg0 : arg0);
            if (this.field1402 < 0) {
                this.field1402 = 0;
            } else if (this.field1402 > 4096) {
                this.field1402 = 4096;
            }
            this.field1398 = this.field1398 * this.field1398 >> 12;
            this.field1398 = this.field1402 * this.field1398 >> 12;
            this.field1410 += this.field1400 * this.field1398 >> 12;
            this.field1400 = this.field1411 * this.field1400 >> 12;
        }
        field1408++;
        if (arg2 >= -65) {
            this.field1398 = -78;
        }
    }

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
    public static void method775(int arg0) {
        field1406 = null;
        field1412 = null;
        if (arg0 != 0) {
            field1412 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IBI)V")
    public void method776(int arg0, byte arg1, int arg2) {
        if (arg0 != -1737357460) {
            field1412 = null;
        }
        field1399++;
        this.field1397[arg2] = arg1;
    }
}
