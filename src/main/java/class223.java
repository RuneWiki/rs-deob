import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class223 extends class71 {

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "Lud;")
    private static class279 field3941 = class130.method1024("rating: ", 255);

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "Lud;")
    public static class279 field3942 = class130.method1024("Ladevorgang )2 bitte warten Sie)3", 255);

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "Lud;")
    public static class279 field3949 = field3941;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Lud;")
    public static class279 field3944 = class130.method1024("Cache:", 255);

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "[[S")
    public static short[][] field3939;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "[[[B")
    public static byte[][][] field3955;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1637(int arg0, boolean arg1) {
        class28.field678[1] = (float) (class52.method442(arg0, 65321) >> 8) / 255.0F;
        class28.field678[2] = (float) class52.method442(arg0, 255) / 255.0F;
        class28.field678[0] = (float) class52.method442(arg0 >> 16, 255) / 255.0F;
        class85.method738(-1, 3);
        if (!arg1) {
            method1637(62, true);
        }
        field3940++;
        class85.method738(-1, 4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLvh;)Lqe;", line = 21)
    public static final class184 method1638(byte arg0, class53 arg1) {
        if (arg0 != 115) {
            field3941 = (class279) null;
        }
        field3951++;
        return new class184(arg1.method495((byte) 82), arg1.method495((byte) -95), arg1.method495((byte) -64), arg1.method495((byte) 74), arg1.method461((byte) 109), arg1.method461((byte) 124), arg1.method483(-112));
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[[I", line = 34)
    public final int[][] method86(int arg0, int arg1) {
        int var3 = 99 % ((arg1 + 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) 125, arg0);
        field3943++;
        if (this.field1400.field4363) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class215.field3787; var8++) {
                var5[var8] = this.field3952;
                var6[var8] = this.field3954;
                var7[var8] = this.field3953;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V", line = 72)
    private final void method1639(int arg0, int arg1) {
        field3945++;
        this.field3953 = (arg1 & 0xFF) << 4;
        this.field3952 = (arg1 & 0xFF0000) >> 12;
        this.field3954 = (arg1 & 0xFF00) >> 4;
        if (arg0 != 1422611500) {
            this.field3953 = 122;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 84)
    public class223() {
        this(0);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)V", line = 89)
    public static final void method1640(int arg0, int arg1) {
        if (arg0 != 255) {
            field3941 = (class279) null;
        }
        field3946++;
        class104 var2 = class293.method2085(6, arg1, false);
        var2.method875(12466);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V", line = 102)
    private class223(int arg0) {
        super(0, false);
        this.method1639(1422611500, arg0);
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V", line = 125)
    public static void method1641(int arg0) {
        field3939 = (short[][]) null;
        field3942 = null;
        field3944 = null;
        field3955 = (byte[][][]) null;
        if (arg0 >= -16) {
            method1642((byte) -127, 23);
        }
        field3941 = null;
        field3949 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)I", line = 145)
    public static final int method1642(byte arg0, int arg1) {
        field3948++;
        return arg0 < 4 ? -16 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZLvh;)V", line = 159)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg1) {
            if (arg0 == 0) {
                this.method1639(1422611500, arg2.method461((byte) 125));
            }
            field3947++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)V", line = 200)
    public static final void method1643(byte arg0) {
        int var1 = 0;
        field3950++;
        int var2 = -6 % ((arg0 + 51) / 33);
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class216.method1585(class24.field619, var3, (byte) 84, var1, var4, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
