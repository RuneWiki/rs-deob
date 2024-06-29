import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class177 extends RuntimeException {

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Ljava/lang/String;")
    public String field2896;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2894;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "J")
    public static long field2889 = 0L;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2890 = -1;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2892 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[[[I")
    public static int[][][] field2899 = new int[2][][];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lug;")
    public static class187 field2891;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lja;")
    public static class55 field2901;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Z")
    public static final boolean method1238(int arg0, int arg1, int arg2) {
        int var3 = class72.field1151[arg0][arg1][arg2];
        if (-class170.field2786 == var3) {
            return false;
        } else if (class170.field2786 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class218.method1500(var4 + 1, class172.field2820[arg0][arg1][arg2], var5 + 1) && class218.method1500(var4 + 128 - 1, class172.field2820[arg0][arg1 + 1][arg2], var5 + 1) && class218.method1500(var4 + 128 - 1, class172.field2820[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class218.method1500(var4 + 1, class172.field2820[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class72.field1151[arg0][arg1][arg2] = class170.field2786;
                return true;
            } else {
                class72.field1151[arg0][arg1][arg2] = -class170.field2786;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
    public static final boolean method1239(int arg0, int arg1) {
        if (arg1 != 525458370) {
            field2899 = null;
        }
        field2897++;
        return (arg0 & 0x1F51DBC2) >> 28 != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method1240(int arg0) {
        field2902++;
        while (class97.field1622.method433(class70.field1128, (byte) 113) >= 11) {
            int var1 = class97.field1622.method428(11, (byte) -124);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class66.field1055[var1] == null) {
                class66.field1055[var1] = new class103();
                var2 = true;
                if (class70.field1136[var1] != null) {
                    class66.field1055[var1].method748(true, class70.field1136[var1]);
                }
            }
            class75.field1195[class86.field1444++] = var1;
            class103 var3 = class66.field1055[var1];
            var3.field4309 = class179.field2960;
            int var4 = class97.field1622.method428(5, (byte) -112);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class97.field1622.method428(5, (byte) -115);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class97.field1622.method428(1, (byte) -112);
            int var7 = class37.field567[class97.field1622.method428(3, (byte) -125)];
            if (var2) {
                var3.field4294 = var3.field4326 = var7;
            }
            int var8 = class97.field1622.method428(1, (byte) -117);
            if (var8 == 1) {
                class215.field3732[class185.field3060++] = var1;
            }
            var3.method1683(class44.field706.field4336[0] + var4, 2, class44.field706.field4343[0] + var5, var6 == 1);
        }
        if (arg0 != 1) {
            field2892 = 110;
        }
        class97.field1622.method431(98048);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static void method1241(int arg0) {
        field2901 = null;
        field2899 = null;
        if (arg0 < -105) {
            field2891 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static final void method1242(int arg0) {
        field2900++;
        if (!class167.field2711) {
            return;
        }
        class167.field2711 = false;
        class140.field2348 = null;
        class190.field3178 = null;
        if (arg0 > -103) {
            field2890 = -37;
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
    public static final void method1243(int arg0) {
        if (arg0 != 46) {
            field2889 = 8L;
        }
        field2898++;
        class7.field77 = new class212(32);
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
    public static final void method1244(int arg0) {
        field2895++;
        class257.field4495.method1350((byte) 118);
        class30.field428.method1350((byte) 116);
        class79.field1260.method1350((byte) 108);
        if (arg0 <= 2) {
            field2891 = null;
        }
        class29.field421.method1350((byte) 113);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class177(Throwable arg0, String arg1) {
        this.field2896 = arg1;
        this.field2894 = arg0;
    }
}
