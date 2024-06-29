import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class271 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lsg;")
    public static class30 field4762 = class167.method1221((byte) 33, "rot:");

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method1854(int arg0) {
        class179.field3314 = 0;
        class196.field3553.field146 = 0;
        field4763++;
        class163.field3041 = 0;
        class52.field1165 = 0;
        class219.field3957 = 0;
        class196.field3551 = -1;
        class52.field1161 = -1;
        class210.field3771 = 0;
        class36.field871 = -1;
        class202.field3607 = 0;
        class70.field1586 = -1;
        class94.field1890 = false;
        class59.field1289.field146 = 0;
        for (int var1 = 0; var1 < class75.field1670.length; var1++) {
            if (class75.field1670[var1] != null) {
                class75.field1670[var1].field1384 = -1;
            }
        }
        for (int var2 = 0; var2 < class125.field2443.length; var2++) {
            if (class125.field2443[var2] != null) {
                class125.field2443[var2].field1384 = -1;
            }
        }
        class172.method1265(-109);
        class215.field3931 = 1;
        class253.method1764((byte) -85, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class14.field288[var3] = true;
        }
        if (arg0 != -30279) {
            field4764 = 33;
        }
        class31.method320(63);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method1855(byte arg0) {
        int var1 = -107 % ((arg0 - 42) / 41);
        field4762 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1856(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class209.field3759 = arg1;
        class44.field1050 = arg2;
        class76.field1674 = arg3;
        class244.field4365 = new class195[arg0][class209.field3759][class44.field1050];
        class177.field3289 = new int[arg0][class209.field3759 + 1][class44.field1050 + 1];
        if (arg4) {
            class147.field2809 = new class195[1][class209.field3759][class44.field1050];
            client.field3801 = new int[class209.field3759][class44.field1050];
            class87.field1790 = new int[1][class209.field3759 + 1][class44.field1050 + 1];
        } else {
            class147.field2809 = null;
            client.field3801 = null;
            class87.field1790 = null;
        }
        class74.method677(false);
        class107.field2141 = new class22[500];
        class160.field3015 = 0;
        class163.field3038 = new class22[500];
        class126.field2462 = 0;
        class148.field2824 = new int[arg0][class209.field3759 + 1][class44.field1050 + 1];
        class276.field4812 = new class35[5000];
        class221.field3984 = 0;
        class36.field869 = new class35[100];
        class155.field2948 = new boolean[class76.field1674 + class76.field1674 + 1][class76.field1674 + class76.field1674 + 1];
        class168.field3094 = new boolean[class76.field1674 + class76.field1674 + 2][class76.field1674 + class76.field1674 + 2];
    }
}
