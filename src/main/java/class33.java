import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class33 extends class359 {

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[I")
    public static int[] field303 = new int[14];

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "S")
    public static short field308 = 256;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "[I")
    public static int[] field313 = new int[3];

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "F")
    public float field312;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "F")
    public static float field316;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;ZLbk;)I", line = 7)
    public static final int method191(String arg0, boolean arg1, class211 arg2) {
        field306++;
        int var3 = arg2.field2888;
        byte[] var4 = class8.method76(arg0, (byte) -25);
        arg2.method1368(var4.length, arg1);
        arg2.field2888 += class278.field3915.method2614(var4.length, 0, arg2.field2888, arg2.field2867, (byte) -101, var4);
        return arg2.field2888 - var3;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V", line = 31)
    public static void method192(byte arg0) {
        field303 = null;
        field313 = null;
        if (arg0 <= 42) {
            method191((String) null, false, (class211) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILen;)V", line = 42)
    public static final void method193(int arg0, class174 arg1) {
        if (arg0 != 14) {
            method194(1, -126, (byte) -113, -55);
        }
        if (class94.field1041) {
            class260.method1622((byte) -105, arg1);
        } else {
            class314.method1963(-1, arg1);
        }
        field310++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)I", line = 71)
    public static final int method194(int arg0, int arg1, byte arg2, int arg3) {
        field315++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        if (arg2 != 62) {
            return -98;
        }
        int var6 = arg1 / arg3;
        int var7 = arg3 - 1 & arg1;
        int var8 = class281.method1797(102, var6, var4);
        int var9 = class281.method1797(73, var6, var4 + 1);
        int var10 = class281.method1797(114, var6 + 1, var4);
        int var11 = class281.method1797(arg2 ^ 0x67, var6 + 1, var4 + 1);
        int var12 = class112.method620(var8, var9, arg3, 119, var5);
        int var13 = class112.method620(var10, var11, arg3, 124, var5);
        return class112.method620(var12, var13, arg3, 121, var7);
    }
}
