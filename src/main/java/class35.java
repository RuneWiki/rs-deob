import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class35 {

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
    public boolean field713 = true;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[J")
    public static long[] field716 = new long[32];

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lcd;")
    public static class23 field718 = class54.method414("Bitte versuchen Sie es in ", -1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    public static int[] field709;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    public static int[] field711;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static final void method250(boolean arg0) {
        class81.field1769.method634((byte) 89);
        int var1 = class81.field1769.method626(16789, 1);
        field707++;
        if (var1 == 0) {
            return;
        }
        int var2 = class81.field1769.method626(16789, 2);
        if (var2 == 0) {
            class160.field3202[class108.field2307++] = 2047;
            return;
        }
        if (arg0) {
            method250(false);
        }
        if (var2 == 1) {
            int var3 = class81.field1769.method626(16789, 3);
            class134.field2790.method63(false, (byte) 125, var3);
            int var4 = class81.field1769.method626(16789, 1);
            if (var4 == 1) {
                class160.field3202[class108.field2307++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class81.field1769.method626(16789, 3);
            class134.field2790.method63(true, (byte) 125, var5);
            int var6 = class81.field1769.method626(16789, 3);
            class134.field2790.method63(true, (byte) 125, var6);
            int var7 = class81.field1769.method626(16789, 1);
            if (var7 == 1) {
                class160.field3202[class108.field2307++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class81.field1769.method626(16789, 1);
            int var9 = class81.field1769.method626(16789, 7);
            int var10 = class81.field1769.method626(16789, 1);
            if (var10 == 1) {
                class160.field3202[class108.field2307++] = 2047;
            }
            class59.field1385 = class81.field1769.method626(16789, 2);
            int var11 = class81.field1769.method626(16789, 7);
            class134.field2790.method70(var11, (byte) 127, var8 == 1, var9);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
    public static final void method251(int arg0, byte arg1) {
        if (arg1 != -45) {
            field711 = null;
        }
        field714++;
        class59.field1375 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field713 = arg6;
        this.field715 = arg1;
        this.field710 = arg5;
        this.field717 = arg3;
        this.field720 = arg0;
        this.field708 = arg2;
        this.field712 = arg4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method252(byte arg0) {
        field709 = null;
        field718 = null;
        if (arg0 == -50) {
            field716 = null;
            field711 = null;
        }
    }
}
