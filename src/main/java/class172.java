import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class172 extends class13 {

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "[Lgw;")
    public static class172[] field2677 = new class172[14];

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "Lej;")
    public static class124 field2684 = new class124(27, 7);

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "[Lgk;")
    public class475[] field2678;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "[[B")
    private byte[][] field2676;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "[[I")
    public static int[][] field2683;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lha;ILvd;)I", line = 5)
    public static final int method1286(class59 arg0, int arg1, class39 arg2) {
        field2679++;
        if (arg2.field955 != -1) {
            return arg2.field955;
        }
        if (arg2.field961 != -1) {
            class739 var3 = arg0.field1170.method1180(arg2.field961, -6662);
            if (!var3.field9951) {
                return var3.field9950;
            }
        }
        return arg1 <= 123 ? -68 : arg2.field949;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)Z", line = 31)
    public final boolean method1287(byte arg0, int arg1) {
        field2681++;
        return arg0 >= -91 ? false : this.field2678[arg1].field6630;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z", line = 43)
    public final boolean method1288(int arg0) {
        field2680++;
        if (this.field2678 != null) {
            return true;
        }
        if (this.field2676 == null) {
            class91 var2 = class290.field4057;
            synchronized (class290.field4057) {
                if (!class290.field4057.method861((byte) -116, this.field2674)) {
                    return false;
                }
                int[] var4 = class290.field4057.method849(this.field2674, 0);
                this.field2676 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field2676[var5] = class290.field4057.method863(-1860, this.field2674, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field2676.length; var7++) {
            byte[] var8 = this.field2676[var7];
            class215 var9 = new class215(var8);
            var9.field3109 = 1;
            int var10 = var9.method1478(842397944);
            class91 var11 = class47.field996;
            synchronized (class47.field996) {
                var6 &= class47.field996.method874(false, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class168 var12 = new class168();
        class91 var13 = class290.field4057;
        int[] var15;
        synchronized (class290.field4057) {
            int var14 = class290.field4057.method860(0, this.field2674);
            this.field2678 = new class475[var14];
            var15 = class290.field4057.method849(this.field2674, 0);
            if (arg0 > -115) {
                method1286(null, 123, null);
            }
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field2676[var16];
            class215 var18 = new class215(var17);
            var18.field3109 = 1;
            int var19 = var18.method1478(842397944);
            class607 var20 = null;
            for (class607 var21 = (class607) var12.method1269(4); var21 != null; var21 = (class607) var12.method1264((byte) 78)) {
                if (var21.field8327 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class91 var22 = class47.field996;
                synchronized (class47.field996) {
                    var20 = new class607(var19, class47.field996.method868((byte) 73, var19));
                }
                var12.method1273(var20, -20180);
            }
            this.field2678[var15[var16]] = new class475(var17, var20);
        }
        this.field2676 = null;
        return true;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(Z)V", line = 153)
    public static void method1289(boolean arg0) {
        field2677 = null;
        field2684 = null;
        field2683 = null;
        if (!arg0) {
            method1290((byte) -116);
        }
    }

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)V", line = 166)
    public static final void method1290(byte arg0) {
        if (arg0 <= 106) {
            method1286(null, -91, null);
        }
        for (class324 var1 = (class324) class528.field7301.method1269(4); var1 != null; var1 = (class324) class528.field7301.method1264((byte) 115)) {
            if (class442.method2660(69, var1.field4505)) {
                class629.method3598(6, var1);
            }
        }
        field2685++;
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(I)V", line = 189)
    public class172(int arg0) {
        this.field2674 = arg0;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)Z", line = 202)
    public final boolean method1291(int arg0, int arg1) {
        field2675++;
        if (arg1 != 14) {
            method1289(false);
        }
        return this.field2678[arg0].field6640;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(II)Z", line = 217)
    public final boolean method1292(int arg0, int arg1) {
        field2682++;
        return arg1 == 0 ? this.field2678[arg0].field6632 : true;
    }
}
