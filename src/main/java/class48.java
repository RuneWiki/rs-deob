import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class48 extends class55 {

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lea;")
    public static class547 field488 = new class547(57, -2);

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "[I")
    public static int[] field490 = new int[200];

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method279(String arg0, boolean arg1) {
        if (arg1) {
            return -106;
        } else {
            field492++;
            return arg0.length() + 2;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
    public static final int method280(int arg0) {
        if (arg0 != -2) {
            field490 = null;
        }
        field494++;
        return class271.field3576;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method281(int arg0, String arg1) {
        System.exit(arg0);
        field486++;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
    public static void method282(int arg0) {
        int var1 = -45 % ((arg0 - 10) / 55);
        field490 = null;
        field488 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field489++;
        int var7 = arg0 + arg2;
        if (!arg6) {
            method280(-2);
        }
        int var8 = arg4 - arg2;
        for (int var9 = arg0; var9 < var7; var9++) {
            class168.method980(arg3, class300.field4036[var9], arg5, arg1, (byte) 27);
        }
        int var10 = arg1 - arg2;
        for (int var11 = arg4; var11 > var8; var11--) {
            class168.method980(arg3, class300.field4036[var11], arg5, arg1, (byte) 81);
        }
        int var12 = arg2 + arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class300.field4036[var13];
            class168.method980(arg3, var14, arg5, var12, (byte) -127);
            class168.method980(arg3, var14, var10, arg1, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(II)V")
    public class48(int arg0, int arg1) {
        this.field491 = arg0;
        this.field493 = arg1;
    }
}
