import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class313 {

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Loga;")
    public static class474 field4342;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lin;")
    public static class91 field4344;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
    public static final void method2033(int arg0, int arg1) {
        class384 var2 = class649.field8928[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class384 var4 = class649.field8928[var3][arg0][arg1] = class649.field8928[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class474 var5 = var4.field5567; var5 != null; var5 = var5.field6621) {
                    class494 var6 = var5.field6623;
                    if (var6.field6831 == arg0 && var6.field6838 == arg1) {
                        var6.field5926--;
                    }
                }
                if (var4.field5573 != null) {
                    var4.field5573.field5926--;
                }
                if (var4.field5577 != null) {
                    var4.field5577.field5926--;
                }
                if (var4.field5574 != null) {
                    var4.field5574.field5926--;
                }
                if (var4.field5566 != null) {
                    var4.field5566.field5926--;
                }
                if (var4.field5578 != null) {
                    var4.field5578.field5926--;
                }
            }
        }
        if (class649.field8928[0][arg0][arg1] == null) {
            class649.field8928[0][arg0][arg1] = new class384(0);
            class649.field8928[0][arg0][arg1].field5570 = 1;
        }
        class649.field8928[0][arg0][arg1].field5571 = var2;
        class649.field8928[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
    public static final void method2034(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
        field4341++;
        class250.method1702(false, null, arg0, arg4, arg2, arg3, true);
        int var5 = -1 / ((arg1 + 33) / 63);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)I")
    public static final int method2035(boolean arg0) {
        if (arg0) {
            field4344 = null;
        }
        field4343++;
        return class215.field3119 == 1 ? class512.field7129 : 0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
    public static void method2036(byte arg0) {
        field4344 = null;
        field4342 = null;
        if (arg0 != -120) {
            method2037(-23);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static final void method2037(int arg0) {
        field4345++;
        if (arg0 != 0) {
            field4342 = null;
        }
        if (!class371.field5285) {
            class371.field5285 = true;
            class201.field2912 += (-class201.field2912 - 24.0F) / 2.0F;
            class392.field5766 = true;
        }
    }
}
