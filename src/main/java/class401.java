import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class401 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    private int field5707;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "[Lrj;")
    private class15[] field5711;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "J")
    private long field5715;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lrj;")
    private class15 field5713;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lkt;")
    public static class51 field5716;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method2394(int arg0) {
        if (arg0 != 0) {
            method2397(false, -95);
        }
        field5716 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Lrj;")
    public final class15 method2395(int arg0) {
        field5708++;
        if (this.field5713 == null) {
            return null;
        }
        if (arg0 != -6246) {
            field5718 = 33;
        }
        class15 var2 = this.field5711[(int) ((long) (this.field5707 - 1) & this.field5715)];
        while (this.field5713 != var2) {
            if (this.field5713.field199 == this.field5715) {
                class15 var3 = this.field5713;
                this.field5713 = this.field5713.field197;
                return var3;
            }
            this.field5713 = this.field5713.field197;
        }
        this.field5713 = null;
        return null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2396(byte arg0, String[] arg1) {
        field5712++;
        String[] var2 = new String[5];
        if (arg0 != -43) {
            method2396((byte) -58, (String[]) null);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
    public static final void method2397(boolean arg0, int arg1) {
        field5709++;
        class199.method1094((byte) -47);
        if (class453.field6415 != 30 && class453.field6415 != 25) {
            return;
        }
        class93.field1161++;
        if (class93.field1161 < 50 && !arg0) {
            return;
        }
        class93.field1161 = arg1;
        if (!class34.field414 && class322.field4655 != null) {
            class304.field4501++;
            class244.method1332((byte) 125, class185.field2426);
            try {
                class322.field4655.method675(class230.field3185.field2206, 0, (byte) 61, class230.field3185.field2159);
                class230.field3185.field2206 = 0;
            } catch (IOException var2) {
                class34.field414 = true;
            }
        }
        class199.method1094((byte) -47);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public static final void method2398(int arg0) {
        int var1 = -49 % ((-arg0 - 32) / 63);
        field5710++;
        if (class94.field1179 != null) {
            class94.field1179.method1754(1);
            class346.field4945 = null;
            class94.field1179 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLrj;J)V")
    public final void method2399(byte arg0, class15 arg1, long arg2) {
        if (arg1.field200 != null) {
            arg1.method104((byte) -61);
        }
        if (arg0 < 22) {
            field5720 = 59;
        }
        field5706++;
        class15 var5 = this.field5711[(int) (arg2 & (long) (this.field5707 - 1))];
        arg1.field200 = var5.field200;
        arg1.field197 = var5;
        arg1.field200.field197 = arg1;
        arg1.field197.field200 = arg1;
        arg1.field199 = arg2;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
    public class401(int arg0) {
        this.field5707 = arg0;
        this.field5711 = new class15[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class15 var3 = this.field5711[var2] = new class15();
            var3.field200 = var3;
            var3.field197 = var3;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZJ)Lrj;")
    public final class15 method2400(boolean arg0, long arg1) {
        field5714++;
        this.field5715 = arg1;
        class15 var4 = this.field5711[(int) (arg1 & (long) (this.field5707 - 1))];
        for (this.field5713 = var4.field197; this.field5713 != var4; this.field5713 = this.field5713.field197) {
            if (this.field5713.field199 == arg1) {
                class15 var5 = this.field5713;
                this.field5713 = this.field5713.field197;
                return var5;
            }
        }
        this.field5713 = null;
        return arg0 ? null : null;
    }

    static {
        new class40(" days.", " Tage.", " jours.", " dias.");
        field5717 = 0;
        new class40("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field5719 = 0;
    }
}
