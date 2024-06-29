import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class122 {

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lhj;")
    public static class69 field2277 = class181.method1318("Untersuchen", (byte) -115);

    @OriginalMember(owner = "client!q", name = "h", descriptor = "J")
    public static volatile long field2278 = 0L;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lhj;")
    public static class69 field2275 = class181.method1318("Verbindung zum Update)2Server hergestellt)3", (byte) -121);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lnc;")
    public static class83 field2273;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)V")
    public static final void method878(int arg0, int arg1, byte arg2) {
        field2271++;
        int var3 = arg1--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class157.field2923[arg1];
        int var5 = class230.field4216[arg1];
        if (arg0 == 0) {
            class48.field692.method301(153, -104);
            class272.field4818++;
            class48.field692.method933(var3 + var3 + 3, -20946);
        }
        if (arg0 == 1) {
            class48.field692.method301(6, -104);
            class48.field692.method933(var3 + var3 + 17, -20946);
            class36.field501++;
        }
        if (arg0 == 2) {
            class148.field2750++;
            class48.field692.method301(127, -104);
            class48.field692.method933(var3 + var3 + 3, -20946);
        }
        class48.field692.method920(class261.field4656[82] ? 1 : 0, 125);
        class48.field692.method957(-1591075960, class220.field3962 + var5);
        class100.field1884 = class230.field4216[0];
        class129.field2408 = class157.field2923[0];
        if (arg2 <= 15) {
            method879((byte) 83);
        }
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class48.field692.method928(true, class157.field2923[arg1] - var4);
            class48.field692.method933(class230.field4216[arg1] - var5, -20946);
        }
        class48.field692.method943((byte) 127, class242.field4441 + var4);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method879(byte arg0) {
        field2273 = null;
        field2277 = null;
        field2275 = null;
        if (arg0 >= -99) {
            method879((byte) 12);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[B)Z")
    public static final boolean method880(int arg0, int arg1, int arg2, byte[] arg3) {
        field2272++;
        if (arg1 != 22) {
            return false;
        }
        boolean var4 = true;
        class128 var5 = new class128(arg3);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method931((byte) 3);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var15;
                class12 var16;
                do {
                    int var13;
                    int var14;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method907(-53);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method937(false);
                                    }
                                    int var10 = var5.method907(-104);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = arg2 + var11;
                                    var14 = arg0 + var12;
                                    var15 = var5.method937(false) >> 2;
                                } while (var14 <= 0);
                            } while (var13 <= 0);
                        } while (var14 >= 103);
                    } while (var13 >= 103);
                    var16 = class145.method1102(var6, arg1 - 22);
                } while (var15 == 22 && !class64.field1246 && var16.field145 == 0 && var16.field177 != 1 && !var16.field156);
                var8 = true;
                if (!var16.method65((byte) -99)) {
                    var4 = false;
                    class157.field2931++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILhj;Lhj;Z)V")
    public static final void method881(int arg0, class69 arg1, class69 arg2, boolean arg3) {
        field2276++;
        if (arg3) {
            method880(122, -74, 42, (byte[]) null);
        }
        class70.method498(-1, arg1, arg2, (class69) null, -1, arg0);
    }
}
