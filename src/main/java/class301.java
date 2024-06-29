import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class301 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
    public static boolean field4727 = false;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Ldb;")
    public static class102 field4725 = new class102(64);

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    public static int[] field4730 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    public static int[] field4731 = new int[200];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZ)V", line = 8)
    public static final void method2145(byte arg0, boolean arg1) {
        if (arg1) {
            if (class147.field2287 != -1) {
                class86.method583(class147.field2287, -98);
            }
            for (class90 var2 = (class90) class243.field3842.method458((byte) -16); var2 != null; var2 = (class90) class243.field3842.method455((byte) 84)) {
                class58.method374(var2, true, (byte) 103);
            }
            class147.field2287 = -1;
            class243.field3842 = new class69(8);
            class307.method2180((byte) 28);
            class147.field2287 = class138.field2177;
            class150.method1092(false, arg0 - 1264641662);
            class320.method2255(true);
            class100.method693((byte) 58, class147.field2287);
        }
        class222.field3560 = -1;
        if (arg0 != 68) {
            return;
        }
        field4726++;
        class258.method1851(-1, class291.field4663);
        class191.field3129 = new class334();
        class191.field3129.field4255 = 3000;
        class191.field3129.field4264 = 3000;
        if (!class232.field3690 && class15.field169 == 0) {
            class229.method1618(-13822, class130.field2034);
            class278.method2012(10, 93);
            return;
        }
        if (class31.field423 == 2) {
            class120.field1825 = class89.field1235 << 7;
            class260.field4150 = class196.field3198 << 7;
        } else {
            class173.method1303(-16980);
        }
        if (class232.field3690) {
            class196.method1441((byte) -114);
        }
        class172.method1296(53);
        class278.method2012(28, 52);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 71)
    public static void method2146(boolean arg0) {
        field4730 = null;
        field4725 = null;
        field4731 = null;
        if (!arg0) {
            method2145((byte) -84, true);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)V", line = 91)
    public static final void method2147(boolean arg0, int arg1, int arg2) {
        field4729++;
        if (arg0) {
            field4730 = (int[]) null;
        }
        if (class70.field990 > 0) {
            class83.method567(127, class70.field990);
            class70.field990 = 0;
        }
        short var3 = 256;
        int var4 = class59.field827 * arg1;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class129.field2016[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class59.field833[arg2 + var4++];
                int var11 = class137.field2166[var5++];
                if (var11 == 0) {
                    class193.field3158.field3545[var6++] = var10;
                } else {
                    int var12 = 256 - var11 - 18;
                    int var13 = var11 + 18;
                    int var14 = class318.field4948[var11];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class193.field3158.field3545[var6++] = client.method767(-16711936, client.method767(var14, 16711935) * var13 + (var12 * client.method767(var10, 16711935))) + client.method767(16711680, var13 * client.method767(65280, var14) + var12 * client.method767(65280, var10)) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class193.field3158.field3545[var6++] = class59.field833[var4++ + arg2];
            }
            var4 += class59.field827 - 128;
        }
        if (class232.field3690) {
            class75.method512(class193.field3158.field3545, arg2, arg1, class193.field3158.field825, class193.field3158.field816);
        } else {
            class193.field3158.method379(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Loc;", line = 178)
    public static final class291 method2148(int arg0, int arg1, int arg2) {
        field4732++;
        for (class291 var3 = (class291) class33.field448.method458((byte) -16); var3 != null; var3 = (class291) class33.field448.method455((byte) -104)) {
            if (var3.field4647 && var3.method2084(arg2, arg1, -99)) {
                return var3;
            }
        }
        if (arg0 == -1) {
            return null;
        } else {
            return (class291) null;
        }
    }
}
