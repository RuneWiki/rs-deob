import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class310 extends class141 {

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "[I")
    public static int[] field5292 = new int[2048];

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public int field5281;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public int field5286;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public int field5287;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    public int field5294;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Lvk;")
    public class154 field5285;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "Lnm;")
    public class202 field5295;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "Lqj;")
    public class215 field5301;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "Lnl;")
    public class239 field5297;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "Lei;")
    public static class70 field5305;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 11)
    public final void method2132(byte arg0) {
        field5289++;
        this.field5301 = null;
        this.field5297 = null;
        this.field5285 = null;
        this.field5295 = null;
        if (arg0 >= -127) {
            this.field5299 = 66;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 41)
    public static void method2133(boolean arg0) {
        if (arg0) {
            field5305 = null;
            field5292 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(B)V", line = 71)
    public static final void method2134(byte arg0) {
        field5291++;
        if (arg0 != -83) {
            field5292 = (int[]) null;
        }
        int var1 = class28.field382 + class168.field2932.field1685;
        int var2 = class40.field690 + class168.field2932.field1689;
        if (class142.field2434 - var1 < -500 || class142.field2434 - var1 > 500 || (class114.field2046 - var2) < -500 || class114.field2046 - var2 > 500) {
            class114.field2046 = var2;
            class142.field2434 = var1;
        }
        if (class114.field2046 != var2) {
            class114.field2046 += (var2 - class114.field2046) / 16;
        }
        if (class142.field2434 != var1) {
            class142.field2434 += (var1 - class142.field2434) / 16;
        }
        if (class300.field5098) {
            for (int var3 = 0; var3 < class180.field3074; var3++) {
                int var4 = class101.field1803[var3];
                if (var4 == 98) {
                    class226.field3915 = class226.field3915 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class226.field3915 = class226.field3915 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class219.field3804 = class219.field3804 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class219.field3804 = class219.field3804 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class19.field235[98]) {
                class140.field2387 += (12 - class140.field2387) / 2;
            } else if (class19.field235[99]) {
                class140.field2387 += (-class140.field2387 - 12) / 2;
            } else {
                class140.field2387 /= 2;
            }
            if (class19.field235[96]) {
                class306.field5202 += (-class306.field5202 - 24) / 2;
            } else if (class19.field235[97]) {
                class306.field5202 += (24 - class306.field5202) / 2;
            } else {
                class306.field5202 /= 2;
            }
            class226.field3915 += class140.field2387 / 2;
            class219.field3804 += class306.field5202 / 2;
        }
        class109.method748(56);
    }
}
