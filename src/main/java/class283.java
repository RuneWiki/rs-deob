import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class283 extends class14 {

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    private int field4506;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    private int field4520;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    private int field4517;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
    public static boolean field4519 = false;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 4)
    public final void method84(int arg0, int arg1, int arg2) {
        field4521++;
        if (arg2 != 9432) {
            this.method84(49, 73, -90);
        }
        int var4 = this.field4506 * arg0 >> 12;
        int var5 = this.field4513 * arg1 >> 12;
        int var6 = this.field4509 * arg1 >> 12;
        int var7 = this.field4522 * arg0 >> 12;
        int var8 = this.field4510 * arg1 >> 12;
        int var9 = this.field4517 * arg1 >> 12;
        int var10 = this.field4514 * arg0 >> 12;
        int var11 = this.field4520 * arg0 >> 12;
        class331.method2294(var9, var10, var7, var8, this.field151, var4, (byte) 122, var11, var5, var6);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)V", line = 32)
    public final void method82(byte arg0, int arg1, int arg2) {
        field4511++;
        if (arg0 > -47) {
            method2046((byte) 83);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 46)
    public static final void method2046(byte arg0) {
        field4516++;
        try {
            if (arg0 <= 101) {
                field4519 = true;
            }
            if (class28.field330 == 1) {
                int var1 = class116.field1615.method616((byte) -123);
                if (var1 > 0 && class116.field1615.method611(true)) {
                    int var2 = var1 - class24.field281;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class116.field1615.method615(103, var2);
                    return;
                }
                class116.field1615.method604(144);
                class116.field1615.method601(22);
                if (class282.field4498 == null) {
                    class28.field330 = 0;
                } else {
                    class28.field330 = 2;
                }
                class7.field82 = null;
                class138.field2065 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class116.field1615.method604(144);
            class28.field330 = 0;
            class282.field4498 = null;
            class7.field82 = null;
            class138.field2065 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lnk;ZLnk;II)Lui;", line = 94)
    public static final class293 method2047(class16 arg0, boolean arg1, class16 arg2, int arg3, int arg4) {
        int[] var5 = arg2.method120(arg3, (byte) -66);
        field4512++;
        boolean var6 = true;
        for (int var7 = arg4; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method97(var5[var7], arg3, arg4 - 1);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method97(var9, 0, arg4 - 1);
                } else {
                    var10 = arg0.method97(0, var9, -1);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class293(arg2, arg0, arg3, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 142)
    public class283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4510 = arg4;
        this.field4506 = arg1;
        this.field4520 = arg7;
        this.field4509 = arg2;
        this.field4513 = arg0;
        this.field4517 = arg6;
        this.field4514 = arg5;
        this.field4522 = arg3;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BII)V", line = 170)
    public final void method89(byte arg0, int arg1, int arg2) {
        field4518++;
        int var4 = 19 % ((-arg0) / 32);
    }
}
