import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class499 extends class627 {

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Z")
    public boolean field7052 = false;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
    public int field7056 = -1;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "Lmq;")
    public static class78 field7051 = new class78(71, 0);

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "Lmq;")
    public static class78 field7060 = new class78(99, 7);

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public int field7046;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public int field7047;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public int field7050;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public int field7053;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "Lbh;")
    public static class429 field7057;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "Lac;")
    public static class712 field7048;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "[Z")
    public static boolean[] field7058;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V", line = 8)
    public static void method2893(byte arg0) {
        field7060 = null;
        if (arg0 == 112) {
            field7058 = null;
            field7057 = null;
            field7051 = null;
            field7048 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V", line = 176)
    public class499(int arg0) {
        this.field7056 = arg0;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lha;IB)V", line = 30)
    public static final void method2894(class454 arg0, int arg1, byte arg2) {
        field7049++;
        if (!class182.field2387 || !class379.field5297) {
            class113.field1392 = 0;
            return;
        }
        if (class126.field1509) {
            class349.field4524 = class424.field6044.method557(-1);
        }
        class408.field5748 = 0;
        class47.field689 = 0;
        class15.field208 = 0;
        int[] var3 = arg0.method71();
        class458.field6401 = (int) ((float) var3[2] / 3.0F);
        class127.field1538 = (int) ((float) var3[3] / 3.0F);
        arg0.method141(class221.field2818);
        if ((int) ((float) class221.field2818[0] / 3.0F) != class521.field7350 || (int) ((float) class221.field2818[1] / 3.0F) != class597.field8284) {
            class597.field8284 = (int) ((float) class221.field2818[1] / 3.0F);
            class521.field7350 = (int) ((float) class221.field2818[0] / 3.0F);
            class225.field2974 = class597.field8284 >> 1;
            class248.field3164 = new int[class597.field8284 * class521.field7350];
            class302.field3889 = class521.field7350 >> 1;
        }
        class716.field10107 = arg0.method94();
        class113.field1392 = 0;
        int var4 = 0;
        if (arg2 >= -93) {
            field7060 = null;
        }
        while (class522.field7389 > var4) {
            class484.method2817((byte) 111, class470.field6755[var4], arg1, arg0);
            var4++;
        }
        for (int var5 = 0; var5 < class215.field2726; var5++) {
            class484.method2817((byte) 116, class185.field2426[var5], arg1, arg0);
        }
        for (int var6 = 0; var6 < class206.field2635; var6++) {
            class484.method2817((byte) 123, class359.field5120[var6], arg1, arg0);
        }
        class540.field7599 = 0;
        if (class113.field1392 > 0) {
            int var7 = class248.field3164.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
                class248.field3164[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class248.field3164[var9++] = Integer.MAX_VALUE;
            }
            class608.field8432 = 1;
            for (int var10 = 0; var10 < class113.field1392; var10++) {
                class600 var11 = class384.field5349[var10];
                class315.method1847(var11.field8345[1], var11.field8343[1], (byte) -123, var11.field8338[0], var11.field8343[3], var11.field8345[3], var11.field8338[3], var11.field8338[1], var11.field8343[0], var11.field8345[0]);
                class315.method1847(var11.field8345[2], var11.field8343[2], (byte) -102, var11.field8338[1], var11.field8343[3], var11.field8345[3], var11.field8338[3], var11.field8338[2], var11.field8343[1], var11.field8345[1]);
            }
            class608.field8432 = 2;
        }
        if (class126.field1509) {
            class553.field7763 = class424.field6044.method557(-1) - class349.field4524;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjaa;ZLjaa;ZB)I", line = 135)
    public static final int method2895(int arg0, int arg1, class266 arg2, boolean arg3, class266 arg4, boolean arg5, byte arg6) {
        field7054++;
        int var7 = class53.method435(arg0, -100, arg2, arg3, arg4);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = 105 % ((63 - arg6) / 39);
            int var9 = class53.method435(arg1, -109, arg2, arg5, arg4);
            return arg5 ? -var9 : var9;
        }
    }
}
