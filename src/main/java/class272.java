import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class272 {

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    private int field3785 = 0;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "[Lie;")
    public class5[] field3777;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Lof;")
    public static class446 field3772 = new class446("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "J")
    private long field3776;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Lie;")
    private class5 field3771;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Lie;")
    private class5 field3784;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[Lie;)I")
    public final int method1741(int arg0, class5[] arg1) {
        field3781++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field3770; var4++) {
            class5 var5 = this.field3777[var4];
            for (class5 var6 = var5.field39; var6 != var5; var6 = var6.field39) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Lie;")
    public final class5 method1742(int arg0) {
        field3782++;
        if (this.field3785 > 0 && this.field3777[this.field3785 - 1] != this.field3784) {
            class5 var2 = this.field3784;
            this.field3784 = var2.field39;
            return var2;
        }
        int var3 = -73 % ((51 - arg0) / 59);
        while (this.field3785 < this.field3770) {
            class5 var4 = this.field3777[this.field3785++].field39;
            if (this.field3777[this.field3785 - 1] != var4) {
                this.field3784 = var4.field39;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Lie;")
    public final class5 method1743(boolean arg0) {
        this.field3785 = 0;
        if (arg0) {
            return null;
        } else {
            field3778++;
            return this.method1742(-124);
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
    public final int method1744(int arg0) {
        field3783++;
        int var2 = 111 % ((arg0 + 64) / 44);
        return this.field3770;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    public final void method1745(int arg0) {
        for (int var2 = 0; var2 < this.field3770; var2++) {
            class5 var3 = this.field3777[var2];
            while (true) {
                class5 var4 = var3.field39;
                if (var3 == var4) {
                    break;
                }
                var4.method25(-13489);
            }
        }
        field3780++;
        this.field3784 = null;
        if (arg0 <= -40) {
            this.field3771 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static void method1746(byte arg0) {
        if (arg0 >= -80) {
            method1750(-4);
        }
        field3772 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(JZ)Lie;")
    public final class5 method1747(long arg0, boolean arg1) {
        field3775++;
        this.field3776 = arg0;
        class5 var4 = this.field3777[(int) (arg0 & (long) (this.field3770 - 1))];
        for (this.field3771 = var4.field39; this.field3771 != var4; this.field3771 = this.field3771.field39) {
            if (this.field3771.field35 == arg0) {
                class5 var5 = this.field3771;
                this.field3771 = this.field3771.field39;
                return var5;
            }
        }
        this.field3771 = null;
        return arg1 ? null : null;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Lie;")
    public final class5 method1748(int arg0) {
        field3769++;
        if (this.field3771 == null) {
            return null;
        }
        class5 var2 = this.field3777[(int) ((long) (this.field3770 - 1) & this.field3776)];
        while (this.field3771 != var2) {
            if (this.field3771.field35 == this.field3776) {
                class5 var3 = this.field3771;
                this.field3771 = this.field3771.field39;
                return var3;
            }
            this.field3771 = this.field3771.field39;
        }
        if (arg0 != 0) {
            this.method1743(false);
        }
        this.field3771 = null;
        return null;
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)I")
    public final int method1749(int arg0) {
        field3774++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field3770; var3++) {
            class5 var4 = this.field3777[var3];
            for (class5 var5 = var4.field39; var5 != var4; var5 = var5.field39) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Ljava/lang/String;")
    public static final String method1750(int arg0) {
        field3779++;
        String var1 = "www";
        if (arg0 != 0) {
            field3772 = null;
        }
        if (class199.field2637 == class116.field1601) {
            var1 = "www-wtrc";
        } else if (class511.field7498 == class116.field1601) {
            var1 = "www-wtqa";
        } else if (class156.field2035 == class116.field1601) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class407.field6188 != null) {
            var2 = "/p=" + class407.field6188;
        }
        return "http://" + var1 + "." + class67.field957.field933 + ".com/l=" + class257.field3556 + "/a=" + class331.field5167 + var2 + "/";
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(JILie;)V")
    public final void method1751(long arg0, int arg1, class5 arg2) {
        if (arg1 >= -80) {
            this.field3771 = null;
        }
        field3773++;
        if (arg2.field36 != null) {
            arg2.method25(-13489);
        }
        class5 var5 = this.field3777[(int) (arg0 & (long) (this.field3770 - 1))];
        arg2.field39 = var5;
        arg2.field36 = var5.field36;
        arg2.field36.field39 = arg2;
        arg2.field35 = arg0;
        arg2.field39.field36 = arg2;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V")
    public class272(int arg0) {
        this.field3770 = arg0;
        this.field3777 = new class5[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class5 var3 = this.field3777[var2] = new class5();
            var3.field39 = var3;
            var3.field36 = var3;
        }
    }
}
