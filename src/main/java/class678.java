import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class678 {

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lbh;")
    private class538 field9548 = new class538(64);

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "Lbh;")
    public class538 field9556 = new class538(50);

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "Lbh;")
    public class538 field9557 = new class538(5);

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lwu;")
    private class557 field9543;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lwu;")
    public class557 field9545;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "Z")
    public boolean field9549;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lwj;")
    public class121 field9541;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lbh;")
    public static class538 field9542 = new class538(8);

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lkea;")
    public static class77 field9551 = new class77(1);

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "I")
    public int field9559;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "[I")
    public static int[] field9554;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3880(boolean arg0) {
        class538 var2 = this.field9556;
        synchronized (this.field9556) {
            this.field9556.method3210(!arg0);
        }
        field9553++;
        class538 var3 = this.field9557;
        synchronized (this.field9557) {
            this.field9557.method3210(false);
        }
        if (!arg0) {
            this.method3889(true, 3);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lig;Z[[[BIB)Z", line = 20)
    public static final boolean method3881(class674 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class22.field251) {
            return false;
        }
        int var5 = arg0.field9490 >> class509.field7106;
        int var6 = var5;
        int var7 = arg0.field9489 >> class509.field7106;
        int var8 = var7;
        if (arg0 instanceof class743) {
            var6 = ((class743) arg0).field10365;
            var8 = ((class743) arg0).field10353;
            var5 = ((class743) arg0).field10352;
            var7 = ((class743) arg0).field10357;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field9495 < class214.field3021 && var9 >= class422.field5839 && var9 < class400.field5535 && var10 >= class625.field8925 && var10 < class207.field2953) {
                    if ((arg2 == null || arg0.field9501 < arg3 || arg2[arg0.field9501][var9][var10] != arg4) && arg0.method342(false) && !arg0.method339(32188)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class126.field1717 - 16 && var9 <= class126.field1717 + 16 && var10 >= class157.field2139 - 16 && var10 <= class157.field2139 + 16) {
                        if (class659.field9305) {
                            class66.field912[class355.field4564++].method1649(1, arg0);
                            class355.field4564 %= class314.field4050;
                        } else {
                            arg0.method271(-93, class646.field9160);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 85)
    public static final int method3882(String arg0, byte arg1) {
        field9555++;
        if (arg1 != 109) {
            field9551 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V", line = 100)
    public final void method3883(int arg0, int arg1) {
        field9558++;
        class538 var3 = this.field9548;
        synchronized (this.field9548) {
            this.field9548.method3204((byte) -70, arg1);
        }
        class538 var4 = this.field9556;
        synchronized (this.field9556) {
            this.field9556.method3204((byte) 48, arg1);
        }
        class538 var5 = this.field9557;
        synchronized (this.field9557) {
            this.field9557.method3204((byte) 74, arg1);
            if (arg0 != 4677) {
                this.method3888(-68, 113);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 119)
    public final void method3884(int arg0) {
        class538 var2 = this.field9548;
        synchronized (this.field9548) {
            this.field9548.method3210(false);
        }
        field9547++;
        class538 var3 = this.field9556;
        synchronized (this.field9556) {
            this.field9556.method3210(false);
        }
        if (arg0 != 50) {
            this.field9557 = null;
        }
        class538 var4 = this.field9557;
        synchronized (this.field9557) {
            this.field9557.method3210(false);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 140)
    public final void method3885(int arg0) {
        if (arg0 != 1) {
            this.field9556 = null;
        }
        field9552++;
        class538 var2 = this.field9548;
        synchronized (this.field9548) {
            this.field9548.method3202((byte) 127);
        }
        class538 var3 = this.field9556;
        synchronized (this.field9556) {
            this.field9556.method3202((byte) 127);
        }
        class538 var4 = this.field9557;
        synchronized (this.field9557) {
            this.field9557.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V", line = 166)
    public static void method3886(int arg0) {
        int var1 = 54 / ((arg0 + 32) / 32);
        field9554 = null;
        field9551 = null;
        field9542 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)Liea;", line = 178)
    public final class11 method3887(int arg0, boolean arg1) {
        field9550++;
        class538 var3 = this.field9548;
        class11 var4;
        synchronized (this.field9548) {
            var4 = (class11) this.field9548.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field9543;
        byte[] var6;
        synchronized (this.field9543) {
            if (arg1) {
                this.method3887(59, false);
            }
            var6 = this.field9543.method3322(class326.method1909(arg0, 2), class735.method4080(arg0, true), (byte) 82);
        }
        class11 var7 = new class11();
        var7.field99 = this;
        var7.field173 = arg0;
        if (var6 != null) {
            var7.method52(true, new class26(var6));
        }
        var7.method60(10);
        class538 var8 = this.field9548;
        synchronized (this.field9548) {
            this.field9548.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)V", line = 214)
    public final void method3888(int arg0, int arg1) {
        field9546++;
        this.field9559 = arg0;
        if (arg1 != 16) {
            return;
        }
        class538 var3 = this.field9556;
        synchronized (this.field9556) {
            this.field9556.method3210(false);
        }
        class538 var4 = this.field9557;
        synchronized (this.field9557) {
            this.field9557.method3210(false);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V", line = 232)
    public final void method3889(boolean arg0, int arg1) {
        field9544++;
        if (arg0 != this.field9549) {
            this.field9549 = arg0;
            if (arg1 < -80) {
                this.method3884(50);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lwj;IZLwu;Lwu;)V", line = 267)
    public class678(class121 arg0, int arg1, boolean arg2, class557 arg3, class557 arg4) {
        this.field9543 = arg3;
        this.field9545 = arg4;
        this.field9549 = arg2;
        this.field9541 = arg0;
        if (this.field9543 != null) {
            int var6 = this.field9543.method3341((byte) 96) - 1;
            this.field9543.method3333(var6, 3443);
        }
    }
}
