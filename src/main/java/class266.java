import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class266 extends class303 {

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[J")
    private long[] field4511 = new long[10];

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    private int field4503 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    private int field4498 = 256;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    private int field4501 = 1;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "J")
    private long field4505 = class218.method1541(40);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lbl;")
    public static class299 field4499 = null;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4504 = 0;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
    public static int[] field4514 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field4516 = 0;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static volatile int field4513 = 0;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Lve;")
    public static class255 field4515 = class87.method607(30, ":duelstake:");

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lfb;")
    public static class54 field4506;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ[Lve;)Lve;", line = 10)
    public static final class255 method1849(int arg0, int arg1, boolean arg2, class255[] arg3) {
        if (arg2) {
            method1851(117, -46);
        }
        field4508++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class144.field2402;
            }
            var4 += arg3[arg1 + var5].field4343;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class255 var9 = arg3[arg1 + var8];
            class36.method216(var9.field4297, 0, var7, var6, var9.field4343);
            var6 += var9.field4343;
        }
        class255 var10 = new class255();
        var10.field4343 = var4;
        var10.field4297 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBIIII)V", line = 62)
    public static final void method1850(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4509++;
        if (arg1 > -61) {
            field4506 = (class54) null;
        }
        int var9 = arg4 + 1;
        class30.method170(arg2, class250.field4213[arg4], arg5, arg0, -30310);
        int var8 = arg3 - 1;
        class30.method170(arg2, class250.field4213[arg3], arg5, arg0, -30310);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class250.field4213[var6];
            var7[arg5] = var7[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V", line = 85)
    public static final void method1851(int arg0, int arg1) {
        class82.field1324 = new int[arg1];
        field4507++;
        class307.field5224 = new int[arg1];
        if (arg0 != -7308) {
            method1849(72, -43, false, (class255[]) null);
        }
        class143.field2378 = new int[arg1];
        class185.field2990 = new int[arg1];
        class29.field450 = new int[arg1];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 107)
    public final void method56(byte arg0) {
        field4510++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field4511[var2] = 0L;
        }
        if (arg0 > 0) {
            method1852(12);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)I", line = 131)
    public final int method57(int arg0, int arg1, int arg2) {
        if (arg1 != 32493) {
            return 31;
        }
        field4512++;
        int var4 = this.field4498;
        this.field4498 = 300;
        int var5 = this.field4501;
        this.field4501 = 1;
        this.field4505 = class218.method1541(-69);
        if (this.field4511[this.field4497] == 0L) {
            this.field4501 = var5;
            this.field4498 = var4;
        } else if (this.field4505 > this.field4511[this.field4497]) {
            this.field4498 = (int) ((long) (arg2 * 2560) / (this.field4505 - this.field4511[this.field4497]));
        }
        if (this.field4498 < 25) {
            this.field4498 = 25;
        }
        if (this.field4498 > 256) {
            this.field4498 = 256;
            this.field4501 = (int) ((long) arg2 - ((this.field4505 - this.field4511[this.field4497]) / 10L));
        }
        if (arg2 < this.field4501) {
            this.field4501 = arg2;
        }
        this.field4511[this.field4497] = this.field4505;
        this.field4497 = (this.field4497 + 1) % 10;
        if (this.field4501 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4511[var6] != 0L) {
                    this.field4511[var6] += (long) this.field4501;
                }
            }
        }
        if (arg0 > this.field4501) {
            this.field4501 = arg0;
        }
        class137.method1027((long) this.field4501, 0);
        int var7 = 0;
        while (this.field4503 < 256) {
            this.field4503 += this.field4498;
            var7++;
        }
        this.field4503 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 214)
    public static void method1852(int arg0) {
        field4514 = null;
        field4515 = null;
        if (arg0 == 0) {
            field4499 = null;
            field4506 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 240)
    public class266() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4511[var1] = this.field4505;
        }
    }
}
