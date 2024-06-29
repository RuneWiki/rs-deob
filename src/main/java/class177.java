import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class177 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Z")
    public boolean field2285 = false;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
    public boolean field2287 = false;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field2292 = -1;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field2290 = 64;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field2289 = 1;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field2296 = 2;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public int field2297 = 64;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[Z")
    public static boolean[] field2286 = new boolean[100];

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field2295 = 2;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lwp;")
    public static class453 field2293 = new class453(77, 8);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lfa;")
    public static class526 field2288;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Llo;Z[[[BIB)Z", line = 4)
    public static final boolean method1118(class488 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class608.field8535) {
            return false;
        }
        int var5 = arg0.field6461 >> class52.field775;
        int var6 = arg0.field6464 >> class52.field775;
        if (var5 < class575.field8022 || var5 >= class121.field1539 || var6 < class468.field5953 || var6 >= class350.field4468) {
            return true;
        } else if ((arg2 == null || arg0.field6470 < arg3 || arg2[arg0.field6470][var5][var6] != arg4) && arg0.method787(4095) && !arg0.method786((byte) 125)) {
            return false;
        } else {
            if (!arg1 && var5 >= class516.field7041 - 16 && var5 <= class516.field7041 + 16 && var6 >= class204.field2599 - 16 && var6 <= class204.field2599 + 16) {
                if (class184.field2345) {
                    class523.field7115[class451.field5790++].method3656(arg0, (byte) 87);
                    class451.field5790 %= class257.field3128;
                } else {
                    arg0.method67(false, class590.field8291);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 38)
    public static void method1119(byte arg0) {
        int var1 = 12 % ((-arg0 - 43) / 60);
        field2286 = null;
        field2288 = null;
        field2293 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Les;II)V", line = 53)
    public final void method1120(class630 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method3501(-9268);
            if (var4 == 0) {
                if (arg1 > -53) {
                    this.method1121(null, -68, -55, 27);
                }
                field2294++;
                return;
            }
            this.method1121(arg0, var4, 7, arg2);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Les;III)V", line = 85)
    private final void method1121(class630 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 7) {
            return;
        }
        if (arg1 == 1) {
            this.field2292 = arg0.method3470(13111);
            if (this.field2292 == 65535) {
                this.field2292 = -1;
            }
        } else if (arg1 == 2) {
            this.field2290 = arg0.method3470(arg2 ^ 0x3330) + 1;
            this.field2297 = arg0.method3470(13111) + 1;
        } else if (arg1 == 3) {
            arg0.method3480(-20933);
        } else if (arg1 == 4) {
            this.field2296 = arg0.method3501(-9268);
        } else if (arg1 == 5) {
            this.field2289 = arg0.method3501(-9268);
        } else if (arg1 == 6) {
            this.field2285 = true;
        } else if (arg1 == 7) {
            this.field2287 = true;
        }
        field2291++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z", line = 136)
    public static final boolean method1122(int arg0, int arg1, int arg2) {
        field2284++;
        if (arg1 != -545) {
            field2293 = null;
        }
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }
}
