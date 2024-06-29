import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class46 extends class249 {

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
    public static boolean field787 = false;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lmb;")
    private static class96 field785 = class243.method1708("Select", (byte) 111);

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "J")
    public static long field789 = 0L;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[Lme;")
    public static class64[] field790 = new class64[4];

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lmb;")
    public static class96 field791 = field785;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Lmb;")
    public static class96 field796 = class243.method1708(")0", (byte) 125);

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lrg;I)V")
    public static final void method355(class239 arg0, int arg1) {
        if (arg1 != 1) {
            method357(false);
        }
        field788++;
        while (true) {
            while (arg0.field4124 < arg0.field4144.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1651(4139) == 1) {
                    var2 = true;
                    var3 = arg0.method1651(4139);
                    var4 = arg0.method1651(4139);
                }
                int var5 = arg0.method1651(4139);
                int var6 = arg0.method1651(arg1 + 4138);
                int var7 = class176.field3068 + class146.field2592 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class179.field3091;
                if (var8 >= 0 && var7 - 63 >= 0 && class140.field2500 > var8 + 63 && var7 < class176.field3068) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1656(93);
                                if (var13 != 0) {
                                    if (class32.field500[var9][var10] == null) {
                                        class32.field500[var9][var10] = new byte[4096];
                                    }
                                    class32.field500[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1656(-50);
                                    if (class75.field1298[var9][var10] == null) {
                                        class75.field1298[var9][var10] = new byte[4096];
                                    }
                                    class75.field1298[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1656(-60);
                        if (var16 != 0) {
                            arg0.field4124++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public static final void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class137.field2456 = class140.field2500 * arg4 / arg2;
        class27.field455 = -1;
        if (arg1 == 12114) {
            field792++;
            class200.field3481 = class176.field3068 * arg0 / arg3;
            class95.field1556 = -1;
            class94.method662(arg1 - 12115);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public static void method357(boolean arg0) {
        if (!arg0) {
            field791 = null;
        }
        field785 = null;
        field796 = null;
        field790 = null;
        field791 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BD)V")
    public static final void method358(byte arg0, double arg1) {
        field786++;
        if (class90.field1502 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class252.field4359[var3] = var4 > 255 ? 255 : var4;
            }
            class90.field1502 = arg1;
        }
        if (arg0 >= -61) {
            method357(true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIIII)V")
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class9.field145 = arg2;
        client.field1994 = arg1;
        class162.field2884 = arg3;
        field793++;
        class9.field149 = arg0;
        if (arg4 != -31621) {
            field796 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class46() {
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
    public class46(int arg0) {
        this.field795 = arg0;
    }
}
