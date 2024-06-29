import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class52 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "B")
    public byte field825;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lu;")
    public class52 field831;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
    public static int[] field814 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[I")
    public static int[] field824 = new int[1];

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
    public static int[] field829 = new int[4096];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILji;I)Ljava/awt/Frame;")
    public static final Frame method318(int arg0, int arg1, int arg2, int arg3, class432 arg4, int arg5) {
        field819++;
        if (!arg4.method2584(-107)) {
            return null;
        }
        if (arg2 != 22140) {
            method318(-78, 120, -74, -65, null, -118);
        }
        if (arg5 == 0) {
            class267[] var6 = class443.method2668(arg4, false);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3900 == arg1 && var6[var8].field3898 == arg0 && (arg3 == 0 || var6[var8].field3902 == arg3) && (!var7 || arg5 < var6[var8].field3904)) {
                    var7 = true;
                    arg5 = var6[var8].field3904;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class281 var9 = arg4.method2596(arg3, arg5, arg0, 116, arg1);
        while (var9.field4032 == 0) {
            class246.method1659((byte) 117, 10L);
        }
        Frame var10 = (Frame) var9.field4030;
        if (var10 == null) {
            return null;
        } else if (var9.field4032 == 2) {
            class498.method2984(100, arg4, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)Z")
    public static final boolean method319(int arg0, boolean arg1, int arg2) {
        field820++;
        if (!class517.method3046(0, arg2, arg0)) {
            return false;
        } else if ((arg0 & 0xB000) != 0 | class99.method606((byte) 107, arg0, arg2) | class62.method365(arg2, arg0, (byte) -11)) {
            return true;
        } else {
            if (!arg1) {
                field814 = null;
            }
            return (arg2 & 0x37) == 0 & (class152.method991(arg2, arg0, 52) | class186.method1278(arg2, arg0, -11872));
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method320(int arg0) {
        field824 = null;
        field814 = null;
        field829 = null;
        if (arg0 != 1) {
            field829 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Lu;")
    public final class52 method321(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            field810++;
            return new class52(this.field823, arg1, arg3, arg2, this.field825);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Lkb;")
    public final class485 method322(int arg0) {
        if (arg0 == 19332) {
            field822++;
            return class301.method1899(arg0 ^ 0x4BEA, this.field823);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIII)Lme;")
    public static final class129 method323(int arg0, int arg1, int arg2, int arg3) {
        field821++;
        class518 var4 = class108.field1553[arg2][arg1][arg0];
        if (var4 == null) {
            return null;
        }
        int var5 = 32 / ((-arg3 - 28) / 63);
        class129 var6 = null;
        int var7 = -1;
        for (class284 var8 = var4.field7569; var8 != null; var8 = var8.field4087) {
            class117 var9 = var8.field4083;
            if (var9 instanceof class129) {
                class129 var10 = (class129) var9;
                int var11 = var10.method847(-1) * 64 - 4;
                int var12 = var10.field1763 - var11 >> 7;
                int var13 = var10.field1769 - var11 >> 7;
                int var14 = var10.field1763 + var11 >> 7;
                int var15 = var10.field1769 + var11 >> 7;
                if (var12 <= arg1 && arg0 >= var13 && var14 >= arg1 && arg0 <= var15) {
                    int var16 = (var14 + 1 - arg1) * (var15 + 1 - arg0);
                    if (var16 > var7) {
                        var7 = var16;
                        var6 = var10;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIB)V")
    public class52(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field808 = arg1;
        this.field823 = arg0;
        this.field811 = arg3;
        this.field825 = arg4;
        this.field815 = arg2;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lu;I)V")
    public class52(class52 arg0, int arg1) {
        this.field831 = arg0;
        this.field825 = this.field831.field825;
        this.field811 = this.field831.field811 + arg1;
        this.field808 = this.field831.field808 + arg1;
        this.field823 = this.field831.field823;
        this.field815 = this.field831.field815 + arg1;
    }
}
