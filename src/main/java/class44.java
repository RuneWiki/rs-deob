import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class44 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field544 = 0;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljb;")
    public static class109 field545 = new class109();

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lfh;")
    public static class140 field541;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[Z")
    public static boolean[] field548;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 6)
    public static void method311(int arg0) {
        if (arg0 >= -14) {
            field544 = 96;
        }
        field545 = null;
        field541 = null;
        field548 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 18)
    public static final void method312(int arg0) {
        field542++;
        int var1 = class161.method1228((byte) -82);
        if (var1 == 0) {
            class306.field4480 = (byte[][][]) null;
            class52.method405(16448, 0);
        } else if (var1 == 1) {
            class219.method1598((byte) 0, true);
            class52.method405(16448, 512);
            if (class9.field101 != null) {
                class148.method1141(false);
            }
        } else {
            class219.method1598((byte) (class42.field531 - 4 & 0xFF), true);
            class52.method405(16448, 2);
        }
        class346.field5387 = class56.field724;
        if (arg0 <= 93) {
            field548 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 77)
    public static final void method314(int arg0, int arg1, int arg2) {
        field547++;
        class207.field2910 = class25.field295[arg0][arg1].field1025;
        if (arg2 != 1) {
            method312(121);
        }
        class105.field1367 = class25.field295[arg0][arg1].field1027;
        class45.field556 = class25.field295[arg0][arg1].field1022;
        class41.method294((float) class207.field2910, (float) class105.field1367, (float) class45.field556);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V", line = 95)
    public static final void method315(int arg0, Object[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 > arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if ((var7 + (var9 & 0x1)) > arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method315(var6 - 1, arg1, arg2, -102, arg4);
            method315(arg0, arg1, var6 + 1, -47, arg4);
        }
        if (arg3 >= -42) {
            field546 = -2;
        }
        field543++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILcn;)Lcn;")
    public abstract class166 method313(int arg0, class166 arg1);
}
