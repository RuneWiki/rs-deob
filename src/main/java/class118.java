import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class118 {

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    private int field1857 = -1;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    private int field1868 = 0;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lko;")
    private class348 field1854 = new class348();

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "Z")
    public boolean field1869 = false;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    private int field1862;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "[Liq;")
    private class428[] field1866;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "[[I")
    private int[][] field1859;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field1856 = 1339;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1858 = new String[100];

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "Ltc;")
    public static class233 field1861;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 3)
    public final void method860(int arg0) {
        field1864++;
        if (arg0 > -11) {
            method862(127, -64);
        }
        for (int var2 = 0; var2 < this.field1860; var2++) {
            this.field1859[var2] = null;
        }
        this.field1866 = null;
        this.field1859 = null;
        this.field1854.method2264(24);
        this.field1854 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)[I", line = 31)
    public final int[] method861(boolean arg0, int arg1) {
        field1863++;
        if (!arg0) {
            method862(-74, -70);
        }
        if (this.field1862 == this.field1860) {
            this.field1869 = this.field1866[arg1] == null;
            this.field1866[arg1] = class219.field3158;
            return this.field1859[arg1];
        } else if (this.field1860 == 1) {
            this.field1869 = this.field1857 != arg1;
            this.field1857 = arg1;
            return this.field1859[0];
        } else {
            class428 var3 = this.field1866[arg1];
            if (var3 == null) {
                this.field1869 = true;
                if (this.field1860 > this.field1868) {
                    var3 = new class428(arg1, this.field1868);
                    this.field1868++;
                } else {
                    class428 var4 = (class428) this.field1854.method2260(2);
                    var3 = new class428(arg1, var4.field6251);
                    this.field1866[var4.field6248] = null;
                    var4.method2663(-127);
                }
                this.field1866[arg1] = var3;
            } else {
                this.field1869 = false;
            }
            this.field1854.method2265((byte) -30, var3);
            return this.field1859[var3.field6251];
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Law;", line = 100)
    public static final class53 method862(int arg0, int arg1) {
        field1865++;
        class53 var2 = (class53) class44.field667.method2339(-119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class223.field3227.method683(1, arg1, arg0 + 8);
        class53 var4 = new class53();
        var4.field789 = arg1;
        if (var3 != null) {
            var4.method386(new class303(var3), -37);
        }
        var4.method388(1);
        if (~var4.field781 == arg0 && class317.field4546.method2485(arg0 + 30, (long) arg1) == null) {
            class317.field4546.method2486(46, new class242(class167.field2506), (long) arg1);
            class221.field3190[class167.field2506++] = var4;
        }
        class44.field667.method2342((long) arg1, var4, -126);
        return var4;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)[[I", line = 143)
    public final int[][] method863(int arg0) {
        field1855++;
        if (this.field1862 != this.field1860) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -12364) {
            this.method863(-46);
        }
        for (int var2 = 0; var2 < this.field1860; var2++) {
            this.field1866[var2] = class219.field3158;
        }
        return this.field1859;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZI)I", line = 166)
    public static final int method864(int arg0, boolean arg1, int arg2) {
        field1867++;
        if (arg1) {
            return 0;
        }
        class78 var3 = class192.method1311(arg0, arg1, -29496);
        if (var3 == null) {
            return class458.field6760.method355(arg0, (byte) -29).field4563;
        }
        if (arg2 != -16589) {
            method864(-80, false, -71);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field1306.length; var5++) {
            if (var3.field1306[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class458.field6760.method355(arg0, (byte) -94).field4563 - var3.field1306.length);
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V", line = 228)
    public class118(int arg0, int arg1, int arg2) {
        this.field1860 = arg0;
        this.field1862 = arg1;
        this.field1866 = new class428[this.field1862];
        this.field1859 = new int[this.field1860][arg2];
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 212)
    public static void method865(byte arg0) {
        field1861 = null;
        field1858 = null;
        if (arg0 != -128) {
            field1856 = 15;
        }
    }
}
