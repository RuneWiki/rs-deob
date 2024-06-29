import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class187 extends class53 {

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[J")
    private long[] field3601 = new long[10];

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    private int field3613 = 1;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    private int field3605 = 256;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "J")
    private long field3609 = class201.method1313(29);

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "[Lfb;")
    public static class50[] field3598 = new class50[1000];

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Leh;")
    public static class47 field3599 = class195.method1282((byte) -4, "Standort");

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Leh;")
    public static class47 field3600 = class195.method1282((byte) -4, "::");

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3608 = 500;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Leh;")
    public static class47 field3612 = class195.method1282((byte) -4, "<br>");

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static final void method1239(int arg0) {
        field3611++;
        class92.field1925 = arg0;
        class94.field1942 = 0;
        class6.method29(-24);
        class154.method1072(32);
        class197.method1295(true);
        for (int var1 = 0; var1 < class92.field1925; var1++) {
            int var3 = class107.field2230[var1];
            if (class18.field362 != class133.field2626[var3].field3326) {
                class133.field2626[var3].field1547 = null;
                class133.field2626[var3] = null;
            }
        }
        if (class14.field304 != class22.field418.field1454) {
            throw new RuntimeException("gnp1 pos:" + class22.field418.field1454 + " psize:" + class14.field304);
        }
        for (int var2 = 0; var2 < class80.field1727; var2++) {
            if (class133.field2626[class136.field2666[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class80.field1727);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (arg0 != 14087) {
            this.method85(-3);
        }
        field3606++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3601[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBILah;)Z")
    public static final boolean method1240(int arg0, byte arg1, int arg2, class9 arg3) {
        field3610++;
        int var4 = -34 % ((arg1 - 11) / 38);
        byte[] var5 = arg3.method67(arg0, -1, arg2);
        if (var5 == null) {
            return false;
        } else {
            class82.method694(true, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1241(byte arg0) {
        if (arg0 >= 53) {
            field3598 = null;
            field3600 = null;
            field3612 = null;
            field3599 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)I")
    public final int method86(int arg0, int arg1, int arg2) {
        field3603++;
        int var4 = this.field3613;
        int var5 = this.field3605;
        this.field3613 = 1;
        this.field3605 = 300;
        this.field3609 = class201.method1313(arg2 ^ 0x4D98);
        if (this.field3601[this.field3607] == 0L) {
            this.field3613 = var4;
            this.field3605 = var5;
        } else if (this.field3601[this.field3607] < this.field3609) {
            this.field3605 = (int) ((long) (arg0 * 2560) / (this.field3609 - this.field3601[this.field3607]));
        }
        if (this.field3605 < 25) {
            this.field3605 = 25;
        }
        if (this.field3605 > 256) {
            this.field3605 = 256;
            this.field3613 = (int) ((long) arg0 - (this.field3609 - this.field3601[this.field3607]) / 10L);
        }
        if (this.field3613 > arg0) {
            this.field3613 = arg0;
        }
        this.field3601[this.field3607] = this.field3609;
        this.field3607 = (this.field3607 + 1) % 10;
        if (this.field3613 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3601[var6] != 0L) {
                    this.field3601[var6] -= -((long) this.field3613);
                }
            }
        }
        if (this.field3613 < arg1) {
            this.field3613 = arg1;
        }
        if (arg2 != 19845) {
            method1241((byte) 59);
        }
        class76.method666((long) this.field3613, 1);
        int var7 = 0;
        while (this.field3602 < 256) {
            var7++;
            this.field3602 += this.field3605;
        }
        this.field3602 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class187() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3601[var1] = this.field3609;
        }
    }
}
