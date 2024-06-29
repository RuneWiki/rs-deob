import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class44 extends class147 {

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "Lqj;")
    private static class196 field505 = class80.method502(" from your ignore list first)3", -48);

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lqj;")
    public static class196 field503 = field505;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "Ls;")
    public static class227 field514 = new class227(64);

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "Lqj;")
    public static class196 field519 = class80.method502("mapdots", -48);

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "Lug;")
    public static class179 field520 = new class179(5000);

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "[J")
    public static long[] field523 = new long[1000];

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lqj;")
    public class196 field513;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Ljava/awt/Image;")
    public static Image field511;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Z")
    public static boolean field521;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[I")
    public int[] field504;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "[I")
    public int[] field507;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
    public int[] field512;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "[I")
    public int[] field515;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "[I")
    public static int[] field517;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)I")
    public final int method228(int arg0, boolean arg1) {
        field508++;
        if (this.field512 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field512.length; var3++) {
            if (this.field504[var3] == arg0) {
                return this.field512[var3];
            }
        }
        if (!arg1) {
            field511 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILp;)V")
    public final void method229(int arg0, class56 arg1) {
        field518++;
        while (true) {
            int var3 = arg1.method367(1);
            if (var3 == 0) {
                if (arg0 < 92) {
                    method233((byte) 18, null);
                    return;
                } else {
                    return;
                }
            }
            this.method236(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public final void method230(byte arg0) {
        field509++;
        if (this.field507 != null) {
            for (int var2 = 0; var2 < this.field507.length; var2++) {
                this.field507[var2] = class1.method6(this.field507[var2], 32768);
            }
        }
        if (this.field512 != null) {
            for (int var3 = 0; var3 < this.field512.length; var3++) {
                this.field512[var3] = class1.method6(this.field512[var3], 32768);
            }
        }
        if (arg0 >= -38) {
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)I")
    public final int method231(int arg0, int arg1) {
        field510++;
        if (this.field507 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field507.length; var3++) {
            if (this.field515[var3] == arg1) {
                return this.field507[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
    public static void method232(byte arg0) {
        field523 = null;
        field514 = null;
        field517 = null;
        field503 = null;
        field519 = null;
        if (arg0 != -115) {
            method234(null, 48, -27);
        }
        field520 = null;
        field511 = null;
        field505 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method233(byte arg0, Component arg1) {
        if (arg0 < 124) {
            field521 = true;
        }
        field506++;
        arg1.addMouseListener(class193.field3403);
        arg1.addMouseMotionListener(class193.field3403);
        arg1.addFocusListener(class193.field3403);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lbk;II)Lsc;")
    public static final class212 method234(class136 arg0, int arg1, int arg2) {
        field502++;
        if (arg2 != 0) {
            field523 = null;
        }
        return class47.method251(arg2 ^ 0x1C04, arg0, arg1) ? class188.method1226(arg2 ^ 0xFFFFFFC0) : null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([SIII[Lqj;)V")
    public static final void method235(short[] arg0, int arg1, int arg2, int arg3, class196[] arg4) {
        field516++;
        if (arg1 != 9423) {
            field514 = null;
        }
        if (arg2 >= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg2;
        class196 var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        short var8 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var8;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].method1312(var7, arg1 ^ 0x24CE)) {
                class196 var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg3] = arg0[var6];
        arg0[var6] = var8;
        method235(arg0, 9423, arg2, var6 - 1, arg4);
        method235(arg0, arg1, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZLp;)V")
    private final void method236(int arg0, boolean arg1, class56 arg2) {
        if (!arg1) {
            field520 = null;
        }
        if (arg0 == 1) {
            this.field513 = arg2.method326(true);
        } else if (arg0 == 2) {
            int var7 = arg2.method367(1);
            this.field512 = new int[var7];
            this.field504 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field512[var8] = arg2.method318(true);
                int var9 = arg2.method367(1);
                if (var9 == 0) {
                    this.field504[var8] = -1;
                } else {
                    this.field504[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method367(1);
            this.field515 = new int[var4];
            this.field507 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field507[var5] = arg2.method318(true);
                int var6 = arg2.method367(1);
                if (var6 == 0) {
                    this.field515[var5] = -1;
                } else {
                    this.field515[var5] = var6;
                }
            }
        }
        field522++;
    }
}
