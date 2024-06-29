import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class325 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    private int field4662 = -1;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    private int field4673 = 0;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lmi;")
    private class408 field4665 = new class408();

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Z")
    public boolean field4676 = false;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    private int field4669;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    private int field4670;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[[I")
    private int[][] field4671;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[Lwq;")
    private class33[] field4664;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method2004(int arg0) {
        for (class166 var1 = (class166) class70.field965.method2649(arg0 ^ arg0); var1 != null; var1 = (class166) class70.field965.method2656(arg0 ^ 0x5622)) {
            if (var1.field2171) {
                var1.method1036(true);
            }
        }
        field4668++;
        for (class166 var2 = (class166) class54.field805.method2649(arg0 ^ 0x5622); var2 != null; var2 = (class166) class54.field805.method2656(0)) {
            if (var2.field2171) {
                var2.method1036(true);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[I")
    public final int[] method2005(int arg0, byte arg1) {
        field4667++;
        int var3 = 74 / ((7 - arg1) / 59);
        if (this.field4670 == this.field4669) {
            this.field4676 = this.field4664[arg0] == null;
            this.field4664[arg0] = class107.field1452;
            return this.field4671[arg0];
        } else if (this.field4670 == 1) {
            this.field4676 = this.field4662 != arg0;
            this.field4662 = arg0;
            return this.field4671[0];
        } else {
            class33 var4 = this.field4664[arg0];
            if (var4 == null) {
                this.field4676 = true;
                if (this.field4670 > this.field4673) {
                    var4 = new class33(arg0, this.field4673);
                    this.field4673++;
                } else {
                    class33 var5 = (class33) this.field4665.method2659(0);
                    var4 = new class33(arg0, var5.field549);
                    this.field4664[var5.field552] = null;
                    var5.method2574((byte) 126);
                }
                this.field4664[arg0] = var4;
            } else {
                this.field4676 = false;
            }
            this.field4665.method2658(var4, 0);
            return this.field4671[var4.field549];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)[[I")
    public final int[][] method2006(byte arg0) {
        field4666++;
        int var2 = 4 % ((arg0 + 35) / 57);
        if (this.field4670 != this.field4669) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field4670; var3++) {
            this.field4664[var3] = class107.field1452;
        }
        return this.field4671;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public final void method2007(byte arg0) {
        if (arg0 >= -61) {
            this.field4662 = 23;
        }
        for (int var2 = 0; var2 < this.field4670; var2++) {
            this.field4671[var2] = null;
        }
        field4672++;
        this.field4664 = null;
        this.field4671 = null;
        this.field4665.method2654(0);
        this.field4665 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static final void method2008(int arg0) {
        if (class188.field2556 != null) {
            class188.field2556.method1343(14682);
        }
        field4663++;
        if (client.field3672 != null) {
            client.field3672.method1343(14682);
        }
        class224.method1401((byte) -95, 2, class101.field1366, 22050);
        class188.field2556 = class123.method847(class319.field4561, class361.field5285, arg0, (byte) 91, 0);
        class188.field2556.method1349(class323.field4643, -26391);
        client.field3672 = class123.method847(class319.field4561, class361.field5285, 2048, (byte) 91, 1);
        client.field3672.method1349(class405.field6092, -26391);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
    public class325(int arg0, int arg1, int arg2) {
        this.field4669 = arg1;
        this.field4670 = arg0;
        this.field4671 = new int[this.field4670][arg2];
        this.field4664 = new class33[this.field4669];
    }
}
