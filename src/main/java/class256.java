import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class256 extends class383 {

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "F")
    public float field3255;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field3257 = 1337;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "Lub;")
    public static class18 field3254 = new class18();

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3264 = new String[100];

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "F")
    public static float field3248;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "F")
    public static float field3258;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIB)V", line = 3)
    public static final void method1531(int arg0, int arg1, int arg2, byte arg3) {
        field3250++;
        class153 var4 = class75.method656(9, arg3 ^ 0xFFFFFF00, arg1);
        if (arg3 != -1) {
            field3264 = null;
        }
        var4.method1003((byte) -86);
        var4.field1930 = arg0;
        var4.field1933 = arg2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I", line = 21)
    public final int method1533(int arg0) {
        field3252++;
        if (arg0 != -409134460) {
            this.method1534((byte) -16);
        }
        return this.field3256;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I", line = 34)
    public final int method1534(byte arg0) {
        int var2 = -60 % ((arg0 + 12) / 35);
        field3251++;
        return this.field3247;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V", line = 44)
    public static void method1535(byte arg0) {
        field3254 = null;
        field3264 = null;
        int var1 = 116 % ((67 - arg0) / 34);
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)I", line = 60)
    public final int method1536(byte arg0) {
        field3261++;
        if (arg0 < 100) {
            method1538(40, 32, -108);
        }
        return this.field3267;
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)I", line = 71)
    public final int method1537(int arg0) {
        if (arg0 == -409134460) {
            field3253++;
            return this.field3260;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z", line = 85)
    public static final boolean method1538(int arg0, int arg1, int arg2) {
        field3249++;
        return (arg0 & class379.field4998[1][arg1][arg2]) != 0;
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)I", line = 97)
    public final int method1539(byte arg0) {
        if (arg0 <= 50) {
            method1535((byte) 15);
        }
        field3262++;
        return this.field3259;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(CII)I", line = 109)
    public static final int method1540(char arg0, int arg1, int arg2) {
        if (arg2 != 130) {
            method1531(36, 110, -21, (byte) -77);
        }
        field3266++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)F", line = 137)
    public final float method1542(int arg0) {
        field3263++;
        int var2 = 94 % ((-arg0 - 66) / 37);
        return this.field3255;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IIIIIF)V", line = 156)
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field3260 = arg2;
        this.field3267 = arg1;
        this.field3256 = arg4;
        this.field3247 = arg3;
        this.field3255 = arg5;
        this.field3259 = arg0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIII)V")
    public abstract void method1532(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(FI)V")
    public abstract void method1541(float arg0, int arg1);
}
