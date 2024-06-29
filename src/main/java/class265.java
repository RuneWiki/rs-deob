import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class265 extends class312 {

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    private int field4419 = -32768;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Z")
    public boolean field4424 = false;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    private int field4421 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private int field4418 = -1;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
    private boolean field4438 = false;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field4439 = 0;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    private int field4420;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lck;")
    private class163 field4417;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4429 = new CRC32();

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[I")
    public static int[] field4433 = new int[32];

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field4436 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field4431 = 0;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "F")
    public static float field4432 = 0.0F;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field4440 = 0;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lge;")
    private class139 field4426;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4442++;
        if (!this.field4438) {
            class242 var6 = this.method1876(0);
            if (var6 == null) {
                return;
            }
            this.method1874(1, var6);
        }
        if (this.field4426 != null) {
            this.field4426.method1033(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method1873(int arg0) {
        if (arg0 > -28) {
            method1873(121);
        }
        field4433 = null;
        field4429 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
    public final int method860() {
        field4428++;
        return this.field4419;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10) {
        class242 var13 = this.method1876(0);
        field4443++;
        if (var13 != null) {
            this.method1874(1, var13);
            var13.method852(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4426);
            this.field4419 = var13.method860();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILud;)V")
    private final void method1874(int arg0, class242 arg1) {
        field4422++;
        if (arg0 != 1) {
            field4430 = 28;
        }
        class112 var3 = (class112) arg1;
        if ((this.field4426 == null || this.field4426.field2269) && (var3.field1847 != null || var3.field1878 != null)) {
            this.field4426 = new class139(class275.field4598, 1, 1);
        }
        if (this.field4426 != null) {
            this.field4426.method1027(var3.field1847, var3.field1878, false, var3.field1849, var3.field1874, var3.field1848);
        }
        this.field4438 = true;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
    public final void method1875(int arg0, int arg1) {
        field4441++;
        if (this.field4424) {
            return;
        }
        this.field4421 += arg1;
        if (arg0 != 6514) {
            this.method860();
        }
        while (this.field4421 > this.field4417.field2638[this.field4439]) {
            this.field4421 -= this.field4417.field2638[this.field4439];
            this.field4439++;
            if (this.field4417.field2639.length <= this.field4439) {
                this.field4424 = true;
                break;
            }
        }
        if (!this.field4424) {
            class131.method980(false, this.field4435, this.field4434, this.field4439, (byte) -128, this.field4417);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)Lud;")
    private final class242 method1876(int arg0) {
        field4425++;
        if (arg0 != 0) {
            return null;
        }
        class84 var2 = class258.method1847(-122, this.field4420);
        class242 var3;
        if (this.field4424) {
            var3 = var2.method592(-1, -53, -1, 0);
        } else {
            var3 = var2.method592(this.field4418, -63, this.field4439, this.field4421);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIII)V")
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4435 = arg3;
        this.field4427 = arg5 + arg6;
        this.field4434 = arg2;
        this.field4423 = arg1;
        this.field4420 = arg0;
        this.field4437 = arg4;
        int var8 = class258.method1847(-127, this.field4420).field1404;
        if (var8 == -1) {
            this.field4424 = true;
        } else {
            this.field4424 = false;
            this.field4417 = class34.method211(var8, 3);
        }
        if (this.field4427 == arg6) {
            class131.method980(false, this.field4435, this.field4434, this.field4439, (byte) -121, this.field4417);
        }
    }
}
