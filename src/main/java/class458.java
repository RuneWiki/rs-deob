import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class458 implements class72 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Ldea;")
    private class205 field6451 = new class205(128);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    public int[] field6447 = new int[class534.field7474.field1203];

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
    private int[] field6453 = new int[class534.field7474.field1203];

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
    public final void method2678(byte arg0, int arg1, int arg2) {
        field6452++;
        class227 var4 = class595.field8604.method2252(arg1, -95);
        int var5 = var4.field3246;
        int var6 = var4.field3245;
        int var7 = var4.field3248;
        int var8 = 73 % ((-arg0 - 26) / 61);
        int var9 = class496.field6936[var7 - var6];
        if (arg2 < 0 || var9 < arg2) {
            arg2 = 0;
        }
        int var10 = var9 << var6;
        this.method2679(arg2 << var6 & var10 | ~var10 & this.field6453[var5], -128, var5);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public final void method2679(int arg0, int arg1, int arg2) {
        int var4 = 7 % ((arg1 + 22) / 47);
        field6456++;
        this.field6453[arg2] = arg0;
        class342 var5 = (class342) this.field6451.method1242(0, (long) arg2);
        if (var5 == null) {
            class342 var6 = new class342(4611686018427387905L);
            this.field6451.method1241(var6, (long) arg2, -106);
        } else if (var5.field4606 != 4611686018427387905L) {
            var5.field4606 = class488.method2835(30160) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public final void method2680(int arg0, int arg1, int arg2) {
        field6449++;
        class227 var4 = class595.field8604.method2252(arg1, -96);
        int var5 = var4.field3246;
        int var6 = var4.field3245;
        int var7 = var4.field3248;
        int var8 = class496.field6936[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        if (arg2 != 128) {
            this.method577(true, 56);
        }
        this.method2682(var5, arg0 << var6 & var9 | this.field6447[var5] & ~var9, arg2 - 128);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)I")
    public final int method577(boolean arg0, int arg1) {
        field6457++;
        class227 var3 = class595.field8604.method2252(arg1, -108);
        int var4 = var3.field3246;
        if (arg0) {
            int var5 = var3.field3245;
            int var6 = var3.field3248;
            int var7 = class496.field6936[var6 - var5];
            return this.field6447[var4] >> var5 & var7;
        } else {
            return -110;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)I")
    public final int method2681(byte arg0, boolean arg1) {
        field6455++;
        long var3 = class488.method2835(30160);
        if (arg0 > -75) {
            this.field6451 = null;
        }
        for (class342 var5 = arg1 ? (class342) this.field6451.method1248(-1) : (class342) this.field6451.method1245((byte) 95); var5 != null; var5 = (class342) this.field6451.method1245((byte) 95)) {
            if (var3 > (var5.field4606 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field4606 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2524;
                    this.field6447[var6] = this.field6453[var6];
                    var5.method1117(0);
                    return var6;
                }
                var5.method1117(0);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
    public final void method2682(int arg0, int arg1, int arg2) {
        field6454++;
        this.field6447[arg0] = arg1;
        class342 var4 = (class342) this.field6451.method1242(arg2, (long) arg0);
        if (var4 == null) {
            class342 var5 = new class342(class488.method2835(30160) + 500L);
            this.field6451.method1241(var5, (long) arg0, -109);
        } else {
            var4.field4606 = class488.method2835(30160) + 500L;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public final int method576(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2679(-20, -39, -16);
        }
        field6448++;
        return this.field6447[arg0];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public final void method2683(byte arg0) {
        for (int var2 = 0; var2 < class534.field7474.field1203; var2++) {
            class8 var3 = class534.field7474.method588(1, var2);
            if (var3 != null && var3.field96 == 0) {
                this.field6453[var2] = 0;
                this.field6447[var2] = 0;
            }
        }
        field6450++;
        this.field6451 = new class205(128);
        if (arg0 > -89) {
            this.field6451 = null;
        }
    }
}
