import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class82 {

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    private int field1541 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field1535 = -1;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lub;")
    private class88 field1546 = new class88();

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Z")
    public boolean field1551 = false;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[[[I")
    private int[][][] field1534;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "[Lid;")
    private class146[] field1547;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lpj;")
    public static class237 field1538 = class33.method353("Ablegen", 19);

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lpj;")
    public static class237 field1539 = class33.method353("<col=80ff00>", 60);

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lpj;")
    public static class237 field1543 = class33.method353("Cache:", 118);

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lub;")
    public static class88 field1536 = new class88();

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[[I")
    public final int[][] method634(int arg0, int arg1) {
        field1549++;
        if (arg1 != 13012) {
            method638((byte) -76, -124, 124);
        }
        if (this.field1545 == this.field1540) {
            this.field1551 = this.field1547[arg0] == null;
            this.field1547[arg0] = class261.field4474;
            return this.field1534[arg0];
        } else if (this.field1545 == 1) {
            this.field1551 = this.field1535 != arg0;
            this.field1535 = arg0;
            return this.field1534[0];
        } else {
            class146 var3 = this.field1547[arg0];
            if (var3 == null) {
                this.field1551 = true;
                if (this.field1545 > this.field1541) {
                    var3 = new class146(arg0, this.field1541);
                    this.field1541++;
                } else {
                    class146 var4 = (class146) this.field1546.method672((byte) 122);
                    var3 = new class146(arg0, var4.field2614);
                    this.field1547[var4.field2611] = null;
                    var4.method629(0);
                }
                this.field1547[arg0] = var3;
            } else {
                this.field1551 = false;
            }
            this.field1546.method679(24549, var3);
            return this.field1534[var3.field2614];
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public final void method635(byte arg0) {
        field1533++;
        for (int var2 = 0; var2 < this.field1545; var2++) {
            this.field1534[var2][0] = null;
            this.field1534[var2][1] = null;
            this.field1534[var2][2] = null;
            this.field1534[var2] = null;
        }
        if (arg0 <= 83) {
            this.field1540 = 106;
        }
        this.field1534 = null;
        this.field1547 = null;
        this.field1546.method676(16841);
        this.field1546 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)[Lgk;")
    public static final class154[] method636(int arg0) {
        if (arg0 != -1010441921) {
            return null;
        }
        field1548++;
        class154[] var1 = new class154[class92.field1668];
        for (int var2 = 0; var2 < class92.field1668; var2++) {
            var1[var2] = new class154(class52.field1094, class43.field944, class252.field4341[var2], class226.field3868[var2], class174.field3060[var2], class175.field3063[var2], class127.field2221[var2], class139.field2398);
        }
        class190.method1291((byte) 103);
        return var1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method637(int arg0) {
        if (arg0 <= 101) {
            return null;
        }
        field1537++;
        if (this.field1545 != this.field1540) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1545; var2++) {
            this.field1547[var2] = class261.field4474;
        }
        return this.field1534;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)I")
    public static final int method638(byte arg0, int arg1, int arg2) {
        if (arg0 <= 116) {
            field1543 = null;
        }
        field1542++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1538 = null;
        field1539 = null;
        field1543 = null;
        if (arg0 == 0) {
            field1536 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(III)V")
    public class82(int arg0, int arg1, int arg2) {
        this.field1545 = arg0;
        this.field1534 = new int[this.field1545][3][arg2];
        this.field1540 = arg1;
        this.field1547 = new class146[this.field1540];
    }
}
