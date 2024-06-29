import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class37 extends class644 {

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Ljava/lang/String;")
    public String field578;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
    public final int method229(int arg0) {
        if (arg0 != 255) {
            return 47;
        } else {
            ++field584;
            return (int) (super.field2333 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public final void method230(int arg0) {
        super.field8924 = 500L + class446.method2525(500) | Long.MIN_VALUE & super.field8924;
        ++field583;
        int var2 = 41 % ((63 - arg0) / 51);
        class605.field8409.method116(this, 1);
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)I")
    public final int method231(int arg0) {
        ++field581;
        if (arg0 != -21314) {
            this.field585 = 2;
        }
        return (int) super.field2333;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public final void method232(int arg0) {
        ++field577;
        super.field8924 |= Long.MIN_VALUE;
        if (arg0 != -3) {
            method233((String) null, (byte) -35, (class465) null, 77);
        }
        if (~this.method234(false) == -1L) {
            class236.field3083.method116(this, 1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;BLqg;I)Lsq;")
    public static final class181 method233(String arg0, byte arg1, class465 arg2, int arg3) {
        ++field580;
        if (arg1 != 69) {
            return null;
        } else if (arg3 == 0) {
            return arg2.method2651(arg0, (byte) 119);
        } else if (arg3 == 1) {
            try {
                class568.method3262(new Object[] { (new URL(class64.field900.getCodeBase(), arg0)).toString() }, arg1 + 26997, "openjs", class64.field900);
                class181 var4 = new class181();
                var4.field2538 = 1;
                return var4;
            } catch (Throwable var10) {
                class181 var5 = new class181();
                var5.field2538 = 2;
                return var5;
            }
        } else if (~arg3 == -3) {
            try {
                class64.field900.getAppletContext().showDocument(new URL(class64.field900.getCodeBase(), arg0), "_blank");
                class181 var6 = new class181();
                var6.field2538 = 1;
                return var6;
            } catch (Exception var11) {
                class181 var7 = new class181();
                var7.field2538 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class568.method3263("loggedout", class64.field900, false);
            } catch (Throwable var13) {
            }
            try {
                class64.field900.getAppletContext().showDocument(new URL(class64.field900.getCodeBase(), arg0), "_top");
                class181 var8 = new class181();
                var8.field2538 = 1;
                return var8;
            } catch (Exception var12) {
                class181 var9 = new class181();
                var9.field2538 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)J")
    public final long method234(boolean arg0) {
        ++field576;
        if (arg0) {
            this.field579 = -20;
        }
        return Long.MAX_VALUE & super.field8924;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V")
    public class37(int arg0, int arg1) {
        super.field2333 = (long) arg0 << 32 | (long) arg1;
    }
}
