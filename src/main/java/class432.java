import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class432 {

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    private int field6280 = 0;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    private int field6285 = -1;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lm;")
    private class242 field6278 = new class242();

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Z")
    public boolean field6288 = false;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    private int field6275;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    private int field6287;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[Lgb;")
    private class115[] field6284;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[[[I")
    private int[][][] field6286;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Lir;")
    public static class185 field6276;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I")
    public final int[][] method2701(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2704(42);
        }
        field6279++;
        if (this.field6287 == this.field6275) {
            this.field6288 = this.field6284[arg1] == null;
            this.field6284[arg1] = class90.field1220;
            return this.field6286[arg1];
        } else if (this.field6275 == 1) {
            this.field6288 = this.field6285 != arg1;
            this.field6285 = arg1;
            return this.field6286[0];
        } else {
            class115 var3 = this.field6284[arg1];
            if (var3 == null) {
                this.field6288 = true;
                if (this.field6280 >= this.field6275) {
                    class115 var4 = (class115) this.field6278.method1564(-25594);
                    var3 = new class115(arg1, var4.field1498);
                    this.field6284[var4.field1499] = null;
                    var4.method2632(true);
                } else {
                    var3 = new class115(arg1, this.field6280);
                    this.field6280++;
                }
                this.field6284[arg1] = var3;
            } else {
                this.field6288 = false;
            }
            this.field6278.method1576(false, var3);
            return this.field6286[var3.field1498];
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public final void method2702(byte arg0) {
        for (int var2 = 0; var2 < this.field6275; var2++) {
            this.field6286[var2][0] = null;
            this.field6286[var2][1] = null;
            this.field6286[var2][2] = null;
            this.field6286[var2] = null;
        }
        field6282++;
        this.field6286 = null;
        if (arg0 <= 48) {
            this.field6284 = null;
        }
        this.field6284 = null;
        this.field6278.method1574(-32166);
        this.field6278 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIB)V")
    public static final void method2703(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 29) {
            method2703(-74, -22, -63, 94, (byte) 20);
        }
        if (class240.field3368 <= arg3 - arg2 && arg2 + arg3 <= class136.field1769 && (arg1 - arg2) >= class157.field1981 && (arg1 + arg2) <= class312.field4602) {
            class422.method2653(-1, arg2, arg3, arg0, arg1);
        } else {
            class210.method1369(arg2, arg3, arg0, false, arg1);
        }
        field6281++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2704(int arg0) {
        field6277++;
        if (this.field6287 != this.field6275) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -123 / ((-arg0 - 42) / 35);
        for (int var3 = 0; var3 < this.field6275; var3++) {
            this.field6284[var3] = class90.field1220;
        }
        return this.field6286;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static void method2705(boolean arg0) {
        field6276 = null;
        if (!arg0) {
            method2703(-106, -80, -46, -59, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(III)V")
    public class432(int arg0, int arg1, int arg2) {
        this.field6275 = arg0;
        this.field6287 = arg1;
        this.field6284 = new class115[this.field6287];
        this.field6286 = new int[this.field6275][3][arg2];
    }
}
