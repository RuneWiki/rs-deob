import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[Ljq;")
    private class361[] field331;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field338 = Boolean.FALSE;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Ltn;")
    public static class60 field336 = new class60(18, 3);

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "F")
    public static float field333;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "J")
    private long field337;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Ljq;")
    private class361 field340;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JB)Ljq;")
    public final class361 method173(long arg0, byte arg1) {
        this.field337 = arg0;
        field330++;
        class361 var4 = this.field331[(int) (arg0 & (long) (this.field335 - 1))];
        int var5 = -54 / ((-arg1 - 67) / 41);
        for (this.field340 = var4.field5158; this.field340 != var4; this.field340 = this.field340.field5158) {
            if (this.field340.field5164 == arg0) {
                class361 var6 = this.field340;
                this.field340 = this.field340.field5158;
                return var6;
            }
        }
        this.field340 = null;
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjq;J)V")
    public final void method174(int arg0, class361 arg1, long arg2) {
        field332++;
        if (arg1.field5159 != null) {
            arg1.method2132(12);
        }
        class361 var5 = this.field331[(int) (arg2 & (long) (this.field335 - 1))];
        arg1.field5158 = var5;
        arg1.field5159 = var5.field5159;
        arg1.field5159.field5158 = arg1;
        arg1.field5158.field5159 = arg1;
        arg1.field5164 = arg2;
        if (arg0 >= -91) {
            method175(false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method175(boolean arg0) {
        field338 = null;
        field336 = null;
        if (arg0) {
            field338 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Ljq;")
    public final class361 method176(int arg0) {
        field339++;
        if (this.field340 == null) {
            return null;
        }
        class361 var2 = this.field331[(int) ((long) (this.field335 - 1) & this.field337)];
        while (this.field340 != var2) {
            if (this.field340.field5164 == this.field337) {
                class361 var3 = this.field340;
                this.field340 = this.field340.field5158;
                return var3;
            }
            this.field340 = this.field340.field5158;
        }
        this.field340 = null;
        if (arg0 != -1) {
            field341 = 108;
        }
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static final void method177(byte arg0) {
        int var1 = 91 % ((21 - arg0) / 46);
        for (class351 var2 = (class351) class271.field4027.method2748(2); var2 != null; var2 = (class351) class271.field4027.method2751(-16195)) {
            var2.method2078();
        }
        field334++;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        this.field335 = arg0;
        this.field331 = new class361[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class361 var3 = this.field331[var2] = new class361();
            var3.field5158 = var3;
            var3.field5159 = var3;
        }
    }
}
