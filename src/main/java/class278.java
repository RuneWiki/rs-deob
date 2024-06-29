import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class278 extends class35 {

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Ljava/lang/String;")
    public String field4173;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "Ljava/lang/String;")
    public String field4179;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "J")
    public long field4186;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[Lr;")
    public static class63[] field4174 = new class63[29];

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field4184 = 100;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "F")
    public static float field4183 = 0.0F;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
    public static int field4188 = 0;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field4187 = -1;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "[[[B")
    public static byte[][][] field4176;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)V")
    public static void method1982(byte arg0) {
        field4176 = null;
        if (arg0 <= 89) {
            field4187 = -86;
        }
        field4174 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
    public static final void method1983(int arg0, boolean arg1) {
        class193.field2855 = arg0;
        field4180++;
        class18 var2 = class234.field3391;
        synchronized (class234.field3391) {
            class234.field3391.method106((byte) -107);
        }
        class18 var3 = class61.field984;
        synchronized (class61.field984) {
            class61.field984.method106((byte) -113);
        }
        class18 var4 = class75.field1286;
        synchronized (class75.field1286) {
            class75.field1286.method106((byte) -113);
        }
        if (arg1) {
            field4184 = -44;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIB)V")
    public static final void method1984(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4177++;
        int var5 = 98 / ((-arg4 - 56) / 38);
        int var6 = 0;
        int var7 = arg2;
        int var8 = -arg2;
        class47.method379(arg0 + arg2, (byte) 80, arg1, class286.field4283[arg3], arg0 - arg2);
        int var9 = -1;
        while (var6 < var7) {
            var9 += 2;
            var6++;
            var8 += var9;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class286.field4283[arg3 + var7];
                int[] var11 = class286.field4283[arg3 - var7];
                int var12 = arg0 + var6;
                int var13 = arg0 - var6;
                class47.method379(var12, (byte) 121, arg1, var10, var13);
                class47.method379(var12, (byte) 119, arg1, var11, var13);
            }
            int var14 = arg0 + var7;
            int var15 = arg0 - var7;
            int[] var16 = class286.field4283[arg3 + var6];
            int[] var17 = class286.field4283[arg3 - var6];
            class47.method379(var14, (byte) 77, arg1, var16, var15);
            class47.method379(var14, (byte) 106, arg1, var17, var15);
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class278(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field4173 = arg0;
        this.field4175 = arg2;
        this.field4179 = arg1;
        this.field4178 = arg6;
        this.field4181 = arg5;
        this.field4186 = arg4;
        this.field4182 = arg3;
    }
}
