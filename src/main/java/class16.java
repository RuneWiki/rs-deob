import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    private int field157 = -1;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    private int field164 = 0;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lqw;")
    private class84 field168 = new class84();

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Z")
    public boolean field169 = false;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "[[I")
    private int[][] field159;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "[Ljq;")
    private class537[] field163;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lsia;")
    public static class765 field154 = new class765();

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Luq;")
    public static class172 field162;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lkka;")
    public static class328 field156;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field170;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method89(int arg0) {
        field156 = null;
        field154 = null;
        field162 = null;
        field170 = null;
        if (arg0 != 0) {
            method94(-22, -12, 8, false, 25);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[Ljava/lang/Object;B[II)V")
    public static final void method90(int arg0, Object[] arg1, byte arg2, int[] arg3, int arg4) {
        field153++;
        if (arg0 > arg4) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg0; var10++) {
                if ((var9 & var10) + var7 > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method90(var6 - 1, arg1, (byte) 113, arg3, arg4);
            method90(arg0, arg1, (byte) 113, arg3, var6 + 1);
        }
        if (arg2 != 113) {
            field162 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[I")
    public final int[] method91(int arg0, int arg1) {
        if (arg0 != 0) {
            field156 = null;
        }
        field166++;
        if (this.field167 == this.field165) {
            this.field169 = this.field163[arg1] == null;
            this.field163[arg1] = class270.field3940;
            return this.field159[arg1];
        } else if (this.field167 == 1) {
            this.field169 = this.field157 != arg1;
            this.field157 = arg1;
            return this.field159[0];
        } else {
            class537 var3 = this.field163[arg1];
            if (var3 == null) {
                this.field169 = true;
                if (this.field164 >= this.field167) {
                    class537 var4 = (class537) this.field168.method678(false);
                    var3 = new class537(arg1, var4.field7444);
                    this.field163[var4.field7439] = null;
                    var4.method1102((byte) 110);
                } else {
                    var3 = new class537(arg1, this.field164);
                    this.field164++;
                }
                this.field163[arg1] = var3;
            } else {
                this.field169 = false;
            }
            this.field168.method686(~arg0, var3);
            return this.field159[var3.field7444];
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public final void method92(boolean arg0) {
        for (int var2 = 0; var2 < this.field167; var2++) {
            this.field159[var2] = null;
        }
        if (arg0) {
            field170 = null;
        }
        field158++;
        this.field159 = null;
        this.field163 = null;
        this.field168.method690(20134);
        this.field168 = null;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)[[I")
    public final int[][] method93(int arg0) {
        if (arg0 != 22563) {
            return null;
        }
        field161++;
        if (this.field167 != this.field165) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field167; var2++) {
            this.field163[var2] = class270.field3940;
        }
        return this.field159;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIZI)V")
    public static final void method94(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field160++;
        if (class125.field1721.field5141.method2541(43) == 0) {
            class525.method3048((byte) -52, false);
        } else {
            class680.field9103 = class125.field1721.field5141.method2541(43);
            class399.method2434(true, (byte) -41, 0);
        }
        class609.field8244 = arg3;
        class302.field4238 = arg4;
        if (arg0 != 27861) {
            method90(-91, null, (byte) 69, null, 62);
        }
        class318.field4525 = arg1;
        class752.method4124(arg2);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(III)V")
    public class16(int arg0, int arg1, int arg2) {
        this.field165 = arg1;
        this.field167 = arg0;
        this.field159 = new int[this.field167][arg2];
        this.field163 = new class537[this.field165];
    }
}
