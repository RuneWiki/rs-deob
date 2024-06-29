import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class233 extends class337 {

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[B")
    public static byte[] field3457 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)V")
    public static final void method1588(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            field3457 = null;
        }
        if (class170.field2529 == 0) {
            class307.method1935(false, arg1 - 118);
        } else {
            class91.field1366 = class170.field2529;
            class14.method91((byte) 120, 0);
        }
        field3456++;
        class277.field3996 = arg3;
        class359.field5516 = arg0;
        class25.field268 = arg2;
        class460.method2769(arg4);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public static final void method1589(int arg0, int arg1) {
        field3458++;
        if (class207.field2958 == arg1) {
            return;
        }
        class30.field323 = class182.field2661 = class252.field3742[arg1];
        class166.method1157((byte) -116);
        class397.field5963 = new int[class30.field323][class182.field2661];
        class168.field2493 = new int[4][class30.field323 >> 3][class182.field2661 >> 3];
        if (arg0 != 873005891) {
            field3457 = null;
        }
        class468.field6902 = new int[class30.field323][class182.field2661];
        for (int var2 = 0; var2 < 4; var2++) {
            class434.field6500[var2] = class11.method71(class30.field323, class182.field2661, (byte) -58);
        }
        class1.field5 = new byte[4][class30.field323][class182.field2661];
        class66.method390(4, class30.field323, class182.field2661, 6619);
        class143.method952(class348.field5015, (byte) 113, class182.field2661 >> 3, class30.field323 >> 3);
        class207.field2958 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(II)V")
    public class233(int arg0, int arg1) {
        this.field3463 = arg1;
        this.field3462 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1590(int arg0) {
        if (arg0 > 71) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lod;B)V")
    public static final void method1591(class349 arg0, byte arg1) {
        field3461++;
        if (class51.field807 == null) {
            class390 var2 = new class390();
            byte[] var3 = var2.method2374(128, 16, 128, arg1 ^ 0x7A);
            class51.field807 = class387.method2363(var3, false, false);
        }
        if (class211.field3091 == null) {
            class288 var4 = new class288();
            byte[] var5 = var4.method1855(16, 128, 128, (byte) 100);
            class211.field3091 = class387.method2363(var5, false, false);
        }
        class530 var6 = arg0.field5227;
        if (arg1 == -35 && var6.method3129((byte) 71) && class325.field4644 == null) {
            byte[] var7 = class63.method373(0.5F, 16.0F, 0.6F, 4.0F, 4.0F, 128, new class20(419684), 16, true, 128, 8);
            class325.field4644 = class387.method2363(var7, false, false);
        }
    }
}
