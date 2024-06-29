import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class248 extends class207 {

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public int field4408;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Ljd;")
    private static class86 field4407 = class122.method868("Loaded world list data", true);

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field4405 = 0;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Ljd;")
    public static class86 field4400 = field4407;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Ljd;")
    private static class86 field4402 = class122.method868("shake:", true);

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Ljd;")
    public static class86 field4413 = class122.method868("Fallen lassen", true);

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Ljd;")
    public static class86 field4409 = field4402;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljd;")
    public static class86 field4398 = field4402;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "Ljd;")
    private static class86 field4416 = class122.method868("Loading interfaces )2 ", true);

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Ljd;")
    public static class86 field4404 = field4416;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "Lna;")
    public static class31 field4415;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[[[Lsa;")
    public static class249[][][] field4406;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lqk;B)V")
    public static final void method1678(class200 arg0, byte arg1) {
        if (arg1 != 26) {
            field4409 = null;
        }
        field4401++;
        while (true) {
            while (arg0.field3565 < arg0.field3547.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1408((byte) -50) == 1) {
                    var2 = true;
                    var3 = arg0.method1408((byte) -43);
                    var4 = arg0.method1408((byte) -96);
                }
                int var5 = arg0.method1408((byte) -65);
                int var6 = arg0.method1408((byte) -35);
                int var7 = var5 * 64 - class90.field1847;
                int var8 = class238.field4289 + class38.field894 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class263.field4668 && class38.field894 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method1412((byte) 77);
                                if (var13 != 0) {
                                    if (class159.field2977[var9][var10] == null) {
                                        class159.field2977[var9][var10] = new byte[4096];
                                    }
                                    class159.field2977[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1412((byte) 106);
                                    if (class241.field4332[var9][var10] == null) {
                                        class241.field4332[var9][var10] = new byte[4096];
                                    }
                                    class241.field4332[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1412((byte) 85);
                        if (var16 != 0) {
                            arg0.field3565++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public static void method1679(int arg0) {
        field4400 = null;
        field4407 = null;
        field4404 = null;
        if (arg0 != -17817) {
            method1678((class200) null, (byte) -42);
        }
        field4416 = null;
        field4406 = null;
        field4413 = null;
        field4402 = null;
        field4398 = null;
        field4415 = null;
        field4409 = null;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIB)Z")
    public final boolean method1680(int arg0, int arg1, byte arg2) {
        if (arg2 > -73) {
            return false;
        } else {
            field4412++;
            return this.field4403 <= arg0 && arg0 <= this.field4410 && this.field4411 <= arg1 && this.field4408 >= arg1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1681(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class70.field1424 = arg1;
        class126.field2436 = arg2;
        class119.field2339 = arg3;
        class114.field2191 = new class249[arg0][class70.field1424][class126.field2436];
        class78.field1536 = new int[arg0][class70.field1424 + 1][class126.field2436 + 1];
        if (arg4) {
            class76.field1506 = new class249[1][class70.field1424][class126.field2436];
            class247.field4394 = new int[class70.field1424][class126.field2436];
            class219.field3930 = new int[1][class70.field1424 + 1][class126.field2436 + 1];
        } else {
            class76.field1506 = null;
            class247.field4394 = null;
            class219.field3930 = null;
        }
        class211.method1497(false);
        class247.field4396 = new class106[500];
        class113.field2151 = 0;
        class230.field4181 = new class106[500];
        class150.field2792 = 0;
        class157.field2961 = new int[arg0][class70.field1424 + 1][class126.field2436 + 1];
        class158.field2971 = new class228[5000];
        class265.field4677 = 0;
        class60.field1201 = new class228[100];
        class79.field1548 = new boolean[class119.field2339 + class119.field2339 + 1][class119.field2339 + class119.field2339 + 1];
        class224.field4032 = new boolean[class119.field2339 + class119.field2339 + 2][class119.field2339 + class119.field2339 + 2];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)I")
    public static final int method1682(int arg0, boolean arg1) {
        field4399++;
        if (arg1) {
            field4400 = null;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIII)V")
    public class248(int arg0, int arg1, int arg2, int arg3) {
        this.field4403 = arg0;
        this.field4410 = arg2;
        this.field4411 = arg1;
        this.field4408 = arg3;
    }
}
