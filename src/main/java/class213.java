import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class213 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[Z")
    public static boolean[] field3481 = new boolean[8];

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Z")
    public static boolean field3484 = true;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Luf;")
    public static class168 field3486 = null;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lfj;")
    public static class283 field3480;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lcd;")
    public static class35 field3477;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)I", line = 14)
    public static final int method1477(boolean arg0, int arg1, int arg2) {
        field3478++;
        if (arg0) {
            field3480 = (class283) null;
        }
        class143 var3 = (class143) class259.field4390.method493((long) arg2, 70);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2201.length > arg1) {
            return var3.field2201[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z", line = 37)
    public static final boolean method1478(int arg0) {
        if (arg0 <= 80) {
            method1482((class166) null, -111);
        }
        field3485++;
        try {
            return class281.method1940(-126);
        } catch (IOException var5) {
            class279.method1929(-118);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class102.field1587 + "," + class62.field824 + "," + class63.field847 + " - " + class110.field1726 + "," + (class266.field4489.field3020[0] + class182.field2916) + "," + (class266.field4489.field3033[0] + class276.field4641) + " - ";
            for (int var4 = 0; class110.field1726 > var4 && var4 < 50; var4++) {
                var3 = var3 + class166.field2671.field2359[var4] + ",";
            }
            class43.method234(var6, -15954, var3);
            class144.method985(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 70)
    public static final void method1479(int arg0) {
        field3488++;
        while (class166.field2671.method717(11154, class110.field1726) >= 11) {
            int var1 = class166.field2671.method728(11, 20544);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class9.field117[var1] == null) {
                class9.field117[var1] = new class54();
                if (class114.field1778[var1] != null) {
                    class9.field117[var1].method297((byte) 121, class114.field1778[var1]);
                }
                var2 = true;
            }
            class281.field4719[class167.field2676++] = var1;
            class54 var3 = class9.field117[var1];
            var3.field3011 = class203.field3335;
            int var4 = class166.field2671.method728(5, 20544);
            int var5 = class166.field2671.method728(1, 20544);
            if (var5 == 1) {
                class12.field136[class9.field120++] = var1;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class166.field2671.method728(5, 20544);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class166.field2671.method728(1, 20544);
            int var8 = class65.field864[class166.field2671.method728(3, 20544)];
            if (var2) {
                var3.field3037 = var3.field3008 = var8;
            }
            var3.method1334(var7 == 1, class266.field4489.field3020[0] + var6, (byte) -123, class266.field4489.field3033[0] + var4);
        }
        class166.field2671.method716((byte) -68);
        if (arg0 <= 88) {
            field3481 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 137)
    public static final void method1480(byte arg0) {
        int var1 = 5 % ((-arg0 - 43) / 51);
        field3482++;
        for (int var2 = 0; var2 < 100; var2++) {
            class214.field3495[var2] = true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 167)
    public static void method1481(byte arg0) {
        field3481 = null;
        if (arg0 != -65) {
            field3481 = (boolean[]) null;
        }
        field3480 = null;
        field3486 = null;
        field3477 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lcf;I)V", line = 182)
    public static final void method1482(class166 arg0, int arg1) {
        field3479++;
        class12.field130 = arg0;
        if (arg1 != 0) {
            field3486 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ldk;BII)[Lwa;", line = 193)
    public static final class284[] method1483(class241 arg0, byte arg1, int arg2, int arg3) {
        field3487++;
        if (arg1 != -101) {
            field3481 = (boolean[]) null;
        }
        return class28.method148(arg3, arg0, arg2, -38) ? class85.method578(arg1 + 225) : null;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 214)
    public static final void method1484(int arg0) {
        class78.field1066.method1429((byte) 120);
        field3483++;
        if (arg0 != 100) {
            field3486 = (class168) null;
        }
        class71.field956.method1429((byte) 120);
    }
}
