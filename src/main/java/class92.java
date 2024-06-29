import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class92 {

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lmc;")
    public static class75 field2272 = class30.method234(true, "Handel)4Duell");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
    public static boolean field2270 = false;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lmc;")
    public static class75 field2277 = class30.method234(true, "backvmid1");

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lmc;")
    public static class75 field2279 = class30.method234(true, "");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2268 = new CRC32();

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2285 = -1;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2280 = 99;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lmc;")
    public static class75 field2287 = class30.method234(true, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lmc;")
    public static class75 field2284 = class30.method234(true, "mapfunction");

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "J")
    public static long field2281 = 0L;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Lmc;")
    public static class75 field2288 = class30.method234(true, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lmc;")
    public static class75 field2286 = class30.method234(true, " x ");

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lnc;")
    public static class81 field2283;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field2266;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
    public int[] field2265;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "[Lnc;")
    public static class81[] field2282;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 14)
    public static final void method763(int arg0) {
        while (true) {
            if (class97.field2448.method705(10, class27.field547) >= 11) {
                int var1 = class97.field2448.method709(-128, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class40.field957[var1] == null) {
                        class40.field957[var1] = new class122();
                        var2 = true;
                        if (class96.field2424[var1] != null) {
                            class40.field957[var1].method959((byte) -111, class96.field2424[var1]);
                        }
                    }
                    class84.field2081[class34.field783++] = var1;
                    class122 var3 = class40.field957[var1];
                    var3.field1215 = class34.field781;
                    int var4 = class127.field3113[class97.field2448.method709(-126, 3)];
                    if (var2) {
                        var3.field1220 = var4;
                    }
                    int var5 = class97.field2448.method709(-127, 1);
                    int var6 = class97.field2448.method709(-127, 5);
                    int var7 = class97.field2448.method709(-126, 1);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var7 == 1) {
                        class94.field2369[class76.field1921++] = var1;
                    }
                    int var8 = class97.field2448.method709(-127, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method394(class52.field1315.field1270[0] + var8, var5 == 1, true, class52.field1315.field1236[0] + var6);
                    continue;
                }
            }
            if (arg0 <= 24) {
                method763(-122);
            }
            field2275++;
            class97.field2448.method702(58);
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 79)
    public static final void method764(boolean arg0) {
        field2278++;
        if (arg0) {
            method765(-61);
        }
        class44.field1055.method553((byte) 125);
        class25.field500.method553((byte) 25);
        class17.field337.method553((byte) -103);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 96)
    public static final void method765(int arg0) {
        field2269++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lmc;Lmc;Lmc;Z)V", line = 114)
    public static final void method766(class75 arg0, class75 arg1, class75 arg2, boolean arg3) {
        class47.field1157 = arg2;
        class47.field1166 = arg0;
        if (arg3) {
            field2271++;
            class47.field1139 = arg1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 130)
    public final void method767(boolean arg0) {
        field2274++;
        if (!arg0) {
            class66.method581(this.field2265, this.field2267, this.field2276);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 155)
    public static void method768(int arg0) {
        field2282 = null;
        field2272 = null;
        field2277 = null;
        field2268 = null;
        field2283 = null;
        field2279 = null;
        field2284 = null;
        field2287 = null;
        if (arg0 != 24997) {
            method768(-27);
        }
        field2286 = null;
        field2288 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 180)
    protected class92() {
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lja;ZLja;II)Lea;", line = 203)
    public static final class26 method769(class55 arg0, boolean arg1, class55 arg2, int arg3, int arg4) {
        field2273++;
        boolean var5 = true;
        int[] var6 = arg2.method434((byte) -128, arg4);
        if (arg3 != 5807) {
            method768(88);
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method439(arg4, var6[var7], -80);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method439(0, var9, 127);
                } else {
                    var10 = arg0.method439(var9, 0, arg3 - 5680);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class26(arg2, arg0, arg4, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method403(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method399(int arg0, int arg1, int arg2, Component arg3);
}
