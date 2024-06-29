import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class270 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lpn;")
    public class43 field3483 = new class43();

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Z")
    public static boolean field3485 = true;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lcq;")
    public static class72 field3486 = new class72("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lwo;")
    public static class285 field3503;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lpn;")
    private class43 field3500;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[Lc;")
    public static class436[] field3502;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lpn;")
    public final class43 method1688(int arg0) {
        field3494++;
        class43 var2 = this.field3483.field508;
        if (this.field3483 == var2) {
            return null;
        } else {
            var2.method263(false);
            return arg0 < 102 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lpn;")
    public final class43 method1689(int arg0) {
        field3487++;
        class43 var2 = this.field3500;
        int var3 = -119 / ((arg0 - 51) / 57);
        if (this.field3483 == var2) {
            this.field3500 = null;
            return null;
        } else {
            this.field3500 = var2.field507;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lpn;")
    public final class43 method1690(byte arg0) {
        field3488++;
        class43 var2 = this.field3483.field508;
        if (arg0 >= -106) {
            this.method1689(-128);
        }
        if (this.field3483 == var2) {
            this.field3500 = null;
            return null;
        } else {
            this.field3500 = var2.field508;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILpn;)V")
    public final void method1691(int arg0, class43 arg1) {
        if (arg0 != -8567) {
            this.field3483 = null;
        }
        field3495++;
        if (arg1.field507 != null) {
            arg1.method263(false);
        }
        arg1.field508 = this.field3483.field508;
        arg1.field507 = this.field3483;
        arg1.field507.field508 = arg1;
        arg1.field508.field507 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method1692(int arg0) {
        if (arg0 != -2) {
            method1692(100);
        }
        field3502 = null;
        field3503 = null;
        field3486 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILwd;)V")
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, class228 arg4) {
        field3493++;
        long var5 = (long) (arg0 | arg2 << 28 | arg1 << 14);
        class14 var7 = (class14) class76.field939.method2218(1, var5);
        if (var7 == null) {
            class14 var8 = new class14();
            class76.field939.method2227(var8, -8218, var5);
            var8.field171.method1696(false, arg4);
            return;
        }
        class59 var9 = class131.method843((byte) 5, arg4.field2885);
        int var10 = var9.field713;
        if (var9.field678 == 1) {
            var10 = (arg4.field2878 + 1) * var10;
        }
        for (class228 var11 = (class228) var7.field171.method1690((byte) -113); var11 != null; var11 = (class228) var7.field171.method1699((byte) 61)) {
            class59 var12 = class131.method843((byte) 5, var11.field2885);
            int var13 = var12.field713;
            if (var12.field678 == 1) {
                var13 = (var11.field2878 + 1) * var13;
            }
            if (var10 > var13) {
                class62.method356(var11, arg4, true);
                return;
            }
        }
        var7.field171.method1696(false, arg4);
        if (arg3 != 20466) {
            field3501 = -9;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)I")
    public final int method1694(byte arg0) {
        field3497++;
        int var2 = 0;
        class43 var3 = this.field3483.field508;
        if (arg0 != 28) {
            return -34;
        }
        while (this.field3483 != var3) {
            var2++;
            var3 = var3.field508;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILbb;)V")
    public final void method1695(int arg0, class270 arg1) {
        this.method1703(this.field3483.field508, 120, arg1);
        field3482++;
        if (arg0 != 0) {
            this.method1691(-62, (class43) null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLpn;)V")
    public final void method1696(boolean arg0, class43 arg1) {
        field3489++;
        if (arg1.field507 != null) {
            arg1.method263(false);
        }
        if (arg0) {
            this.method1698(-65);
        }
        arg1.field508 = this.field3483;
        arg1.field507 = this.field3483.field507;
        arg1.field507.field508 = arg1;
        arg1.field508.field507 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lbg;I)V")
    public static final void method1697(class242 arg0, int arg1) {
        field3492++;
        if (arg1 != -2) {
            method1693(-112, -66, 92, 70, (class228) null);
        }
        for (int var2 = 0; var2 < class258.field3340; var2++) {
            int var3 = arg0.method1559((byte) -51);
            int var4 = arg0.method1587((byte) -102);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class134.field1537[var3] != null) {
                class134.field1537[var3].field5316 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Z")
    public final boolean method1698(int arg0) {
        if (arg0 == 0) {
            field3491++;
            return this.field3483.field508 == this.field3483;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Lpn;")
    public final class43 method1699(byte arg0) {
        if (arg0 <= 0) {
            return null;
        }
        field3496++;
        class43 var2 = this.field3500;
        if (this.field3483 == var2) {
            this.field3500 = null;
            return null;
        } else {
            this.field3500 = var2.field508;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)Lpn;")
    public final class43 method1700(byte arg0) {
        if (arg0 <= 22) {
            return null;
        }
        field3498++;
        class43 var2 = this.field3483.field507;
        if (this.field3483 == var2) {
            this.field3500 = null;
            return null;
        } else {
            this.field3500 = var2.field507;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public final void method1701(boolean arg0) {
        while (true) {
            class43 var2 = this.field3483.field508;
            if (this.field3483 == var2) {
                field3490++;
                this.field3500 = null;
                if (!arg0) {
                    this.method1696(true, (class43) null);
                    return;
                }
                return;
            }
            var2.method263(false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lwo;Lwo;Z)V")
    public static final void method1702(class285 arg0, class285 arg1, boolean arg2) {
        if (arg2) {
            field3503 = null;
        }
        class332.field4522 = arg0;
        class310.field4196 = arg1;
        field3484++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lpn;ILbb;)V")
    private final void method1703(class43 arg0, int arg1, class270 arg2) {
        if (arg1 < 115) {
            field3502 = null;
        }
        field3499++;
        class43 var4 = this.field3483.field507;
        this.field3483.field507 = arg0.field507;
        arg0.field507.field508 = this.field3483;
        if (this.field3483 != arg0) {
            arg0.field507 = arg2.field3483.field507;
            arg0.field507.field508 = arg0;
            arg2.field3483.field507 = var4;
            var4.field508 = arg2.field3483;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class270() {
        this.field3483.field507 = this.field3483;
        this.field3483.field508 = this.field3483;
    }
}
