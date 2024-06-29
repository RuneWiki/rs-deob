import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class24 {

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Lqf;")
    public class117 field2346 = class143.field3486;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
    public int field2367 = 0;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "Lqf;")
    public static class117 field2359 = class72.method514(122, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "Lqf;")
    public static class117 field2364 = class72.method514(117, "Stufe)2");

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "Lqf;")
    public static class117 field2363 = null;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "Lad;")
    public static class5 field2356 = new class5();

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "[I")
    public static int[] field2365 = new int[1000];

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "Lqf;")
    public static class117 field2369 = class72.method514(99, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "Lgd;")
    public static class46 field2360;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "Lhf;")
    public static class55 field2357;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "[I")
    public int[] field2354;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "[I")
    public int[] field2358;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "[I")
    public static int[] field2366;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[Lqf;")
    public class117[] field2361;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "[Lr;")
    public static class118[] field2355;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "[Lr;")
    public static class118[] field2368;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method764(KeyEvent arg0, int arg1) {
        field2348++;
        if (arg1 < 37) {
            return -99;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILla;)V")
    public final void method765(int arg0, class77 arg1) {
        if (arg0 != -28322) {
            method766((byte) -93);
        }
        while (true) {
            int var3 = arg1.method570((byte) 123);
            if (var3 == 0) {
                field2352++;
                return;
            }
            this.method767(99, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static final void method766(byte arg0) {
        field2349++;
        if (arg0 != 23) {
            method764(null, 78);
        }
        if (class78.field1765 != 0 && class78.field1765 != 3 || class133.field3142 != 1) {
            return;
        }
        int var1 = class102.field2462 - 5 - 4;
        int var2 = class153.field3788 - 575;
        if (var2 < 0 || var1 < 0 || var2 >= 146 || var1 >= 151) {
            return;
        }
        var2 -= 73;
        var1 -= 75;
        int var3 = class48.field967 + class128.field3035 & 0x7FF;
        int var4 = class12.field180[var3];
        int var5 = (class53.field1096 + 256) * var4 >> 8;
        int var6 = class12.field177[var3];
        int var7 = (class53.field1096 + 256) * var6 >> 8;
        int var8 = var1 * var7 - var2 * var5 >> 11;
        int var9 = var1 * var5 + var2 * var7 >> 11;
        int var10 = class141.field3395.field1960 - var8 >> 7;
        int var11 = class141.field3395.field1998 + var9 >> 7;
        boolean var12 = class81.method631(var11, true, 0, (byte) -102, 0, 1, 0, 0, 0, var10, class141.field3395.field2004[0], class141.field3395.field1970[0]);
        if (!var12) {
            return;
        }
        class99.field2373.method571(var2, -11124);
        class99.field2373.method571(var1, -11124);
        class99.field2373.method556(class128.field3035, true);
        class99.field2373.method571(57, -11124);
        class99.field2373.method571(class48.field967, -11124);
        class99.field2373.method571(class53.field1096, -11124);
        class99.field2373.method571(89, -11124);
        class99.field2373.method556(class141.field3395.field1998, true);
        class99.field2373.method556(class141.field3395.field1960, true);
        class99.field2373.method571(class120.field2864, -11124);
        class99.field2373.method571(63, -11124);
        return;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILla;I)V")
    private final void method767(int arg0, class77 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2345 = arg1.method570((byte) 123);
        } else if (arg2 == 2) {
            this.field2350 = arg1.method570((byte) 123);
        } else if (arg2 == 3) {
            this.field2346 = arg1.method577(-121);
        } else if (arg2 == 4) {
            this.field2347 = arg1.method554((byte) 87);
        } else if (arg2 == 5) {
            this.field2367 = arg1.method597(108);
            this.field2361 = new class117[this.field2367];
            this.field2354 = new int[this.field2367];
            for (int var4 = 0; var4 < this.field2367; var4++) {
                this.field2354[var4] = arg1.method554((byte) -106);
                this.field2361[var4] = arg1.method577(-117);
            }
        } else if (arg2 == 6) {
            this.field2367 = arg1.method597(122);
            this.field2354 = new int[this.field2367];
            this.field2358 = new int[this.field2367];
            for (int var5 = 0; var5 < this.field2367; var5++) {
                this.field2354[var5] = arg1.method554((byte) 35);
                this.field2358[var5] = arg1.method554((byte) 72);
            }
        }
        if (arg0 <= 86) {
            this.method767(20, null, -106);
        }
        field2353++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public static void method768(boolean arg0) {
        field2359 = null;
        field2360 = null;
        if (!arg0) {
            method768(false);
        }
        field2366 = null;
        field2365 = null;
        field2368 = null;
        field2369 = null;
        field2355 = null;
        field2357 = null;
        field2364 = null;
        field2363 = null;
        field2356 = null;
    }
}
