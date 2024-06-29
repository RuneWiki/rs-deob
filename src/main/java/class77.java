import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
    public boolean field1225 = true;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1220 = new Object();

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    public int[] field1226 = new int[500];

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public int[] field1227 = new int[500];

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field1228 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1218 = 0;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Z")
    public static volatile boolean field1223 = true;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[C")
    public static char[] field1222 = new char[128];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "C")
    public static char field1219;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        if (arg0 == 128) {
            field1222 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static final void method576(int arg0) {
        field1221++;
        if (class108.field1827 != null || class306.field4945 != null) {
            return;
        }
        if (arg0 != -673) {
            method575(-30);
        }
        if (class111.field1855 > 0) {
            return;
        }
        int var1 = class56.field818;
        if (!class191.field2823) {
            if (var1 == 1 && class147.field2360 > 0) {
                short var2 = class204.field3009[class147.field2360 - 1];
                if (var2 == 50 || var2 == 41 || var2 == 10 || var2 == 3 || var2 == 29 || var2 == 33 || var2 == 32 || var2 == 40 || var2 == 6 || var2 == 34 || var2 == 57 || var2 == 1005) {
                    int var3 = class141.field2277[class147.field2360 - 1];
                    int var4 = class131.field2173[class147.field2360 - 1];
                    class263 var5 = class144.method1078(var4, 8534);
                    class250 var6 = client.method903(var5);
                    if (var6.method1723(103) || var6.method1727(-599347940)) {
                        class218.field3190 = false;
                        class51.field710 = 0;
                        if (class108.field1827 != null) {
                            class63.method476(class108.field1827, 14105);
                        }
                        class108.field1827 = class144.method1078(var4, arg0 ^ 0xFFFFDC09);
                        class194.field2862 = var3;
                        class241.field3540 = class13.field153;
                        class276.field4474 = class17.field187;
                        class63.method476(class108.field1827, 14105);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class38.field488 == 1 && class147.field2360 > 2 || class219.method1526(class147.field2360 - 1, arg0 + 672))) {
                var1 = 2;
            }
            if (var1 == 2 && class147.field2360 > 0 || class79.field1275 == 1) {
                class227.method1573(15);
            }
            if (var1 == 1 && class147.field2360 > 0 || class79.field1275 == 2) {
                class107.method824((byte) -123);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class204.field3017;
            int var8 = class44.field584;
            if (var7 < (class71.field1125 - 10) || var7 > (class253.field3817 + class71.field1125 + 10) || var8 < class171.field2587 - 10 || (class137.field2226 + class171.field2587 + 10) < var8) {
                class191.field2823 = false;
                class210.method1482(class171.field2587, true, class71.field1125, class137.field2226, class253.field3817);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class71.field1125;
        int var10 = class171.field2587;
        int var11 = class253.field3817;
        int var12 = -1;
        int var13 = class17.field187;
        int var14 = class13.field153;
        for (int var15 = 0; var15 < class147.field2360; var15++) {
            if (class247.field3655) {
                int var17 = (class147.field2360 - var15 - 1) * 15 + var10 + 33;
                if (var13 > var9 && var13 < (var9 + var11) && var14 > (var17 - 13) && var17 + 3 > var14) {
                    var12 = var15;
                }
            } else {
                int var16 = (class147.field2360 - var15 - 1) * 15 + var10 + 31;
                if (var9 < var13 && var13 < var9 + var11 && var14 > (var16 - 13) && var14 < (var16 + 3)) {
                    var12 = var15;
                }
            }
        }
        if (var12 != -1) {
            class7.method41((byte) -29, var12);
        }
        class191.field2823 = false;
        class210.method1482(class171.field2587, true, class71.field1125, class137.field2226, class253.field3817);
    }

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1225) {
            Object var1 = this.field1220;
            synchronized (this.field1220) {
                if (this.field1228 < 500) {
                    this.field1226[this.field1228] = class204.field3017;
                    this.field1227[this.field1228] = class44.field584;
                    this.field1228++;
                }
            }
            class155.method1130(1, 50L);
        }
        field1224++;
    }
}
