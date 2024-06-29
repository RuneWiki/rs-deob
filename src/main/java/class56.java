import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class56 implements class20 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
    public static int[] field887 = new int[13];

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Ltm;")
    public static class334 field890 = new class334(104, -1);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lrs;I)V", line = 3)
    public static final void method525(class166 arg0, int arg1) {
        field891++;
        if (arg1 != 16) {
            method525(null, 6);
        }
        if (class642.field9102 == null) {
            class351 var2 = new class351();
            byte[] var3 = var2.method2227(true, 128, 128, 16);
            class642.field9102 = class48.method481(var3, 116, false);
        }
        if (class426.field6264 == null) {
            class356 var4 = new class356();
            byte[] var5 = var4.method2277(128, 16, 102, 128);
            class426.field6264 = class48.method481(var5, 119, false);
        }
        class431 var6 = arg0.field2759;
        if (var6.method2679(35632) && class580.field8214 == null) {
            byte[] var7 = class332.method2133(0, 128, 16.0F, 8, 4.0F, new class594(419684), 0.5F, 16, 128, 4.0F, 0.6F);
            class580.field8214 = class48.method481(var7, arg1 + 107, false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 42)
    public static final int method526(int arg0, int arg1) {
        field892++;
        if (arg1 != 1011191591) {
            method525(null, 69);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V", line = 54)
    public class56(int arg0) {
        this.field888 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 62)
    public static void method527(byte arg0) {
        field887 = null;
        int var1 = -82 / (-arg0 / 32);
        field890 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Lvj;", line = 72)
    public final class26 method117(int arg0) {
        field889++;
        return arg0 == 1 ? class567.field8047 : null;
    }
}
