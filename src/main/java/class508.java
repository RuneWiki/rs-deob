import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class508 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field6344 = -1;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    private int field6343 = 0;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lws;")
    private class333 field6352 = new class333();

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
    public boolean field6354 = false;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    private int field6347;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    private int field6350;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[Lvh;")
    private class335[] field6348;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[[I")
    private int[][] field6346;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 7)
    public final void method2770(byte arg0) {
        field6345++;
        for (int var2 = 0; var2 < this.field6347; var2++) {
            this.field6346[var2] = null;
        }
        this.field6346 = null;
        int var3 = 118 % ((arg0 + 44) / 63);
        this.field6348 = null;
        this.field6352.method1913((byte) 48);
        this.field6352 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[[I", line = 28)
    public final int[][] method2771(int arg0) {
        field6351++;
        if (this.field6350 != this.field6347) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6347; var2++) {
            this.field6348[var2] = class290.field3669;
        }
        return this.field6346;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(III)V", line = 161)
    public class508(int arg0, int arg1, int arg2) {
        this.field6347 = arg0;
        this.field6350 = arg1;
        this.field6348 = new class335[this.field6350];
        this.field6346 = new int[this.field6347][arg2];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I", line = 53)
    public final int[] method2772(int arg0, byte arg1) {
        if (arg1 >= -110) {
            this.method2772(-109, (byte) -42);
        }
        field6349++;
        if (this.field6350 == this.field6347) {
            this.field6354 = this.field6348[arg0] == null;
            this.field6348[arg0] = class290.field3669;
            return this.field6346[arg0];
        } else if (this.field6347 == 1) {
            this.field6354 = this.field6344 != arg0;
            this.field6344 = arg0;
            return this.field6346[0];
        } else {
            class335 var3 = this.field6348[arg0];
            if (var3 == null) {
                this.field6354 = true;
                if (this.field6343 >= this.field6347) {
                    class335 var4 = (class335) this.field6352.method1911(7);
                    var3 = new class335(arg0, var4.field4142);
                    this.field6348[var4.field4141] = null;
                    var4.method1566(-77);
                } else {
                    var3 = new class335(arg0, this.field6343);
                    this.field6343++;
                }
                this.field6348[arg0] = var3;
            } else {
                this.field6354 = false;
            }
            this.field6352.method1907(30081, var3);
            return this.field6346[var3.field4142];
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 127)
    public static final int method2773(byte arg0, String arg1) {
        if (arg0 <= 86) {
            return 20;
        }
        field6353++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class284.field3600; var2++) {
            if (arg1.equalsIgnoreCase(class136.field1659[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
