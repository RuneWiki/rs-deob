import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class92 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    public static int[] field1257 = new int[14];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lte;")
    public static class357 field1253 = new class357(64);

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Ljn;")
    public static class47 field1263;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method741(int arg0) {
        class195.field2699.method372(122);
        field1255++;
        if (arg0 != -2) {
            field1257 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILfb;)V")
    public final void method742(int arg0, class341 arg1) {
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                if (arg0 != -1793) {
                    method741(-98);
                }
                field1264++;
                return;
            }
            this.method745(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method743(byte arg0) {
        if (arg0 < 61) {
            method741(38);
        }
        field1254++;
        class118.field1537 = class346.method2289(35, 2048, 4, 17, true, 0.4F, 8, 8);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILsj;)V")
    public static final void method744(int arg0, class248 arg1) {
        if (class209.field2843 == arg1.field3488) {
            class33.field536[arg1.field3586] = true;
        }
        field1258++;
        if (arg0 != 20491) {
            field1253 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILfb;I)V")
    private final void method745(int arg0, class341 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1260 = arg1.method2239(-1076227960);
            this.field1259 = arg1.method2233((byte) 104);
            this.field1262 = arg1.method2233((byte) 104);
        }
        if (arg0 != 0) {
            field1253 = null;
        }
        field1256++;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1253 = null;
        field1263 = null;
        int var1 = -35 % ((-arg0 - 6) / 39);
        field1257 = null;
    }
}
