import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class249 {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lid;")
    public static class149 field4357 = class60.method382("Mem:", (byte) 99);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lve;")
    public static class189 field4358 = new class189(64);

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    public static int[] field4370 = new int[5];

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "[[I")
    public static int[][] field4373 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lid;")
    public static class149 field4374 = class60.method382("niveau ", (byte) 54);

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lve;")
    public static class189 field4372 = new class189(4);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIII)Lid;")
    public static final class149 method1727(boolean arg0, int arg1, int arg2, int arg3) {
        field4363++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = arg1; var8 < var4; var8++) {
            int var10 = arg2 % arg3;
            arg2 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class149 var9 = new class149();
        var9.field2694 = var7;
        var9.field2670 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method1728(int arg0) {
        class171.field3150.method1291(0);
        field4368++;
        class210.field3746.method1291(0);
        if (arg0 != 19785) {
            method1730((byte) -77);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILal;II)Lrh;")
    public static final class46 method1729(int arg0, class230 arg1, int arg2, int arg3) {
        if (arg0 > -117) {
            return null;
        } else {
            field4367++;
            return class59.method371((byte) -26, arg3, arg2, arg1) ? class55.method351((byte) 73) : null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static final void method1730(byte arg0) {
        if (arg0 <= -49) {
            field4362++;
            class41.field648.method1291(0);
            class255.field4461.method1291(0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static final void method1731(boolean arg0) {
        field4361++;
        class124.field2189.method1291(0);
        class98.field1743.method1291(0);
        if (arg0) {
            field4372 = null;
        }
        class127.field2234.method1291(0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method1732(int arg0, int arg1) {
        class231 var2 = class261.field4664[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class231 var4 = class261.field4664[var3][arg0][arg1] = class261.field4664[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4064--;
                for (int var5 = 0; var5 < var4.field4047; var5++) {
                    class23 var6 = var4.field4061[var5];
                    if ((var6.field338 >> 29 & 0x3L) == 2L && var6.field318 == arg0 && var6.field330 == arg1) {
                        var6.field340--;
                    }
                }
            }
        }
        if (class261.field4664[0][arg0][arg1] == null) {
            class261.field4664[0][arg0][arg1] = new class231(0, arg0, arg1);
        }
        class261.field4664[0][arg0][arg1].field4065 = var2;
        class261.field4664[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)Llh;")
    public static final class286 method1733(boolean arg0) {
        field4366++;
        if (!arg0) {
            method1735(13, 125, 102, 100, (class268) null);
        }
        try {
            return (class286) Class.forName("sh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static void method1734(byte arg0) {
        field4373 = null;
        field4370 = null;
        if (arg0 <= 93) {
            method1727(true, -65, 46, 66);
        }
        field4358 = null;
        field4372 = null;
        field4357 = null;
        field4374 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILjb;)V")
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, class268 arg4) {
        field4359++;
        if (arg2 > -14) {
            method1733(false);
        }
        for (class259 var5 = (class259) class85.field1550.method1140(0); var5 != null; var5 = (class259) class85.field1550.method1127(0)) {
            if (var5.field4543 == arg0 && arg3 * 128 == var5.field4534 && arg1 * 128 == var5.field4544 && var5.field4529.field4773 == arg4.field4773) {
                if (var5.field4531 != null) {
                    class246.field4318.method814(var5.field4531);
                    var5.field4531 = null;
                }
                if (var5.field4541 != null) {
                    class246.field4318.method814(var5.field4541);
                    var5.field4541 = null;
                }
                var5.method401((byte) -118);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class249() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lfa;)V")
    public class249(class249 arg0) {
        this.field4364 = arg0.field4364;
        this.field4371 = arg0.field4371;
        this.field4369 = arg0.field4369;
        this.field4360 = arg0.field4360;
    }
}
