import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class574 {

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "[Lal;")
    private class107[] field8095;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    private int field8097;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field8093 = 0;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "J")
    private long field8101;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "Lal;")
    private class107 field8100;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Luaa;")
    public static class126 field8102;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public static final void method3368(int arg0) {
        field8094++;
        int var1 = class514.field7278;
        int[] var2 = class522.field7381;
        if (arg0 >= -90) {
            method3370(-89);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class702 var9 = class767.field10560[var2[var3]];
            if (var9 != null && var9.field4592 > 0) {
                var9.field4592--;
                if (var9.field4592 == 0) {
                    var9.field4635 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class235.field3545; var4++) {
            long var5 = (long) class216.field3356[var4];
            class205 var7 = (class205) class645.field9014.method2242(var5, -1);
            if (var7 != null) {
                class665 var8 = var7.field3181;
                if (var8.field4592 > 0) {
                    var8.field4592--;
                    if (var8.field4592 == 0) {
                        var8.field4635 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BII)Z")
    public static final boolean method3369(byte arg0, int arg1, int arg2) {
        field8099++;
        if (arg0 == -120) {
            return (arg2 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public static void method3370(int arg0) {
        if (arg0 < -116) {
            field8102 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)Lal;")
    public final class107 method3371(boolean arg0) {
        field8092++;
        if (arg0) {
            field8102 = null;
        }
        if (this.field8100 == null) {
            return null;
        }
        class107 var2 = this.field8095[(int) (this.field8101 & (long) (this.field8097 - 1))];
        while (this.field8100 != var2) {
            if (this.field8100.field1597 == this.field8101) {
                class107 var3 = this.field8100;
                this.field8100 = this.field8100.field1600;
                return var3;
            }
            this.field8100 = this.field8100.field1600;
        }
        this.field8100 = null;
        return null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(JI)Lal;")
    public final class107 method3372(long arg0, int arg1) {
        this.field8101 = arg0;
        field8096++;
        if (arg1 != -28519) {
            this.method3371(true);
        }
        class107 var4 = this.field8095[(int) ((long) (this.field8097 - 1) & arg0)];
        for (this.field8100 = var4.field1600; this.field8100 != var4; this.field8100 = this.field8100.field1600) {
            if (this.field8100.field1597 == arg0) {
                class107 var5 = this.field8100;
                this.field8100 = this.field8100.field1600;
                return var5;
            }
        }
        this.field8100 = null;
        return null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(JLal;B)V")
    public final void method3373(long arg0, class107 arg1, byte arg2) {
        if (arg1.field1598 != null) {
            arg1.method827(3);
        }
        field8098++;
        class107 var5 = this.field8095[(int) (arg0 & (long) (this.field8097 - 1))];
        arg1.field1598 = var5.field1598;
        arg1.field1600 = var5;
        arg1.field1598.field1600 = arg1;
        arg1.field1597 = arg0;
        arg1.field1600.field1598 = arg1;
        int var6 = 57 / ((arg2 + 61) / 38);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)V")
    public static final void method3374(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class393.method2434(var3.field582);
        class393.method2434(var3.field589);
        if (var3.field582 != null) {
            var3.field582 = null;
        }
        if (var3.field589 != null) {
            var3.field589 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
    public class574(int arg0) {
        this.field8095 = new class107[arg0];
        this.field8097 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class107 var3 = this.field8095[var2] = new class107();
            var3.field1600 = var3;
            var3.field1598 = var3;
        }
    }
}
