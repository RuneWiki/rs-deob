import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class216 {

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private int field3950 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    private int field3941 = -1;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lbg;")
    private class19 field3954 = new class19();

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Z")
    public boolean field3960 = false;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[Lpa;")
    private class164[] field3959;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[[[I")
    private int[][][] field3955;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[Lha;")
    public static class78[] field3944 = new class78[5000];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lmb;")
    public static class132 field3942 = class166.method1092("<col=00ffff>", 117);

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[[[I")
    public static int[][][] field3946 = new int[4][13][13];

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lmb;")
    public static class132 field3956 = class166.method1092("Fehler beim Laden Ihres Spielcharakters)3", 123);

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3951 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method1346(byte arg0) {
        field3946 = null;
        int var1 = 50 % (arg0 / 32);
        field3956 = null;
        field3944 = null;
        field3942 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
    public static final void method1347(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method1347(101, 40, 43, 7);
        }
        field3952++;
        if (class203.field3730 == 0 || arg1 == 0 || class91.field1602 >= 50 || arg0 == -1) {
            return;
        }
        class59.field1010[class91.field1602] = arg0;
        class62.field1044[class91.field1602] = arg1;
        class118.field2242[class91.field1602] = arg2;
        class138.field2594[class91.field1602] = null;
        class122.field2273[class91.field1602] = 0;
        class91.field1602++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
    public static final boolean method1348(int arg0) {
        field3957++;
        if (arg0 >= -26) {
            method1346((byte) -36);
        }
        try {
            return class9.method47((byte) -90);
        } catch (IOException var4) {
            class171.method1117(-9291);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class173.field3235 + "," + class86.field1502 + "," + class55.field941 + " - " + class39.field630 + "," + (class210.field3854.field703[0] + class129.field2389) + "," + (class210.field3854.field676[0] + class168.field3082) + " - ";
            for (int var3 = 0; class39.field630 > var3 && var3 < 50; var3++) {
                var2 = var2 + class118.field2241.field2157[var3] + ",";
            }
            class92.method571(var2, var5, 82);
            class229.method1461(-24962);
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILmb;Lpb;Lmb;)Lbf;")
    public static final class18 method1349(int arg0, class132 arg1, class165 arg2, class132 arg3) {
        field3949++;
        int var4 = arg2.method1065(arg3, -1);
        if (arg0 == 0) {
            int var5 = arg2.method1090(-1, arg1, var4);
            return class125.method822(arg2, var4, var5, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[[I")
    public final int[][] method1350(byte arg0, int arg1) {
        field3958++;
        if (arg0 != 125) {
            field3956 = null;
        }
        if (this.field3953 == this.field3945) {
            this.field3960 = this.field3959[arg1] == null;
            this.field3959[arg1] = class185.field3424;
            return this.field3955[arg1];
        } else if (this.field3945 == 1) {
            this.field3960 = this.field3941 != arg1;
            this.field3941 = arg1;
            return this.field3955[0];
        } else {
            class164 var3 = this.field3959[arg1];
            if (var3 == null) {
                this.field3960 = true;
                if (this.field3950 >= this.field3945) {
                    class164 var4 = (class164) this.field3954.method124(0);
                    var3 = new class164(arg1, var4.field2966);
                    this.field3959[var4.field2963] = null;
                    var4.method995((byte) 120);
                } else {
                    var3 = new class164(arg1, this.field3950);
                    this.field3950++;
                }
                this.field3959[arg1] = var3;
            } else {
                this.field3960 = false;
            }
            this.field3954.method122(var3, arg0 ^ 0x7E);
            return this.field3955[var3.field2966];
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1351(int arg0) {
        field3947++;
        if (this.field3953 != this.field3945) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 16 % ((-arg0 - 64) / 45);
        for (int var3 = 0; var3 < this.field3945; var3++) {
            this.field3959[var3] = class185.field3424;
        }
        return this.field3955;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(III)V")
    public class216(int arg0, int arg1, int arg2) {
        this.field3953 = arg1;
        this.field3945 = arg0;
        this.field3959 = new class164[this.field3953];
        this.field3955 = new int[this.field3945][3][arg2];
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public final void method1352(byte arg0) {
        if (arg0 < 24) {
            this.field3950 = -90;
        }
        field3948++;
        for (int var2 = 0; var2 < this.field3945; var2++) {
            this.field3955[var2][0] = null;
            this.field3955[var2][1] = null;
            this.field3955[var2][2] = null;
            this.field3955[var2] = null;
        }
        this.field3955 = null;
        this.field3959 = null;
        this.field3954.method130(12040);
        this.field3954 = null;
    }
}
