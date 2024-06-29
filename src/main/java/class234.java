import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class234 extends class259 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lmh;")
    public class263 field3423;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lmh;")
    public class263 field3426;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Ljava/lang/String;")
    public String field3414;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Z")
    public boolean field3416;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field3419;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
    public static final int method1619(byte arg0) {
        if (arg0 == -82) {
            field3418++;
            return ((class99.field1688 == 0 ? 0 : 1) << 21) + ((class208.field3085 == 0 ? 0 : 1) << 20) + (class265.field4245 << 17) + ((class47.field658 ? 1 : 0) << 13) + ((class74.field1173 & 0x3) << 11) + ((class22.field247 ? 1 : 0) << 10) + ((class69.field1112 ? 1 : 0) << 9) + ((class229.field3368 ? 1 : 0) << 8) + ((class225.field3308 ? 1 : 0) << 5) + ((class51.field705 ? 1 : 0) << 4) + ((class79.field1277 ? 1 : 0) << 3) + (class240.field3525 & 0x7) + ((class56.field817 ? 1 : 0) << 6) + (((class207.field3054 ? 1 : 0) << 7) - -((class294.field4688 ? 1 : 0) << 15) - (-((class243.field3577 ? 1 : 0) << 16) + -((class281.field4536 ? 1 : 0) << 19))) + (((class171.field2582 == 0 ? 0 : 1) << 22) - -(class88.method664() << 23));
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIBI[Ljava/lang/Object;)V")
    public static final void method1620(int[] arg0, int arg1, byte arg2, int arg3, Object[] arg4) {
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if (((var9 & 0x1) + var7) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method1620(arg0, arg1, (byte) 41, var6 - 1, arg4);
            method1620(arg0, var6 + 1, (byte) 41, arg3, arg4);
        }
        if (arg2 != 41) {
            field3421 = -6;
        }
        field3420++;
    }
}
