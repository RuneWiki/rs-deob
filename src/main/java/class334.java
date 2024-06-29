import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class334 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Z")
    public boolean field4717 = false;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Llg;")
    public static class237 field4723 = new class237(32);

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4729 = 255;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4728 = -1;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4732 = -1;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
    public static int[] field4727 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[Lci;")
    public static class261[] field4731 = new class261[16];

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field4733 = new String[200];

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method2159(byte arg0) {
        field4723 = null;
        field4727 = null;
        field4731 = null;
        field4733 = null;
        if (arg0 != -86) {
            field4726 = 12;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILdg;I)V")
    public final void method2160(int arg0, class236 arg1, int arg2) {
        field4725++;
        while (true) {
            int var4 = arg1.method1574(-124);
            if (var4 == 0) {
                if (arg2 < 85) {
                    method2159((byte) -125);
                    return;
                } else {
                    return;
                }
            }
            this.method2161(arg0, 5863, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILdg;I)V")
    private final void method2161(int arg0, int arg1, class236 arg2, int arg3) {
        field4719++;
        if (arg3 == 1) {
            this.field4722 = arg2.method1617((byte) 48);
        } else if (arg3 == 2) {
            this.field4720 = arg2.method1616(false);
        } else if (arg3 == 3) {
            this.field4717 = true;
        } else if (arg3 == 4) {
            this.field4722 = -1;
        }
        if (arg1 != 5863) {
            field4730 = 80;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BIII)I")
    public static final int method2162(byte arg0, int arg1, int arg2, int arg3) {
        field4724++;
        if (arg0 < 2) {
            field4723 = null;
        }
        int var4 = 255 - arg1;
        int var5 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        return (((arg3 & 0xFF00) * var4 & 0xFF0000 | (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLae;II)Lgj;")
    public final class381 method2163(boolean arg0, class134 arg1, int arg2, int arg3) {
        field4721++;
        long var5 = (long) (arg3 << 16 | this.field4722 | (arg0 ? 262144 : 0) | arg1.field1620 << 19);
        class381 var7 = (class381) class71.field820.method1625(var5, 0);
        int var8 = 98 % ((-arg2 - 22) / 41);
        if (var7 != null) {
            return var7;
        } else if (class351.field4969.method2412(this.field4722, 121)) {
            class375 var9 = class375.method2402(class351.field4969, this.field4722, 0);
            if (var9 != null) {
                var9.field5268 = var9.field5263 = var9.field5264 = var9.field5260 = 0;
                if (arg0) {
                    var9.method2397();
                }
                for (int var10 = 0; var10 < arg3; var10++) {
                    var9.method2396();
                }
            }
            class381 var11 = arg1.method596(var9, true);
            if (var11 != null) {
                class71.field820.method1622((byte) 13, var11, var5);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
    public final boolean method2164(int arg0) {
        field4718++;
        if (arg0 != -18507) {
            method2162((byte) -106, 41, 69, 59);
        }
        return class351.field4969.method2412(this.field4722, 127);
    }
}
