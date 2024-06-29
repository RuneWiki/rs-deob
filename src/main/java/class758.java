import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class class758 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Z")
    public static boolean field10550;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILgaa;I)V", line = 13)
    public static final void method4216(int arg0, int arg1, class460 arg2, int arg3) {
        field10551++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field6487 != null) {
            class575 var4 = new class575();
            var4.field8027 = arg2.field6487;
            var4.field8028 = arg2;
            class445.method2625(var4);
        }
        class105.field1289 = arg2.field6501;
        class545.field7651 = arg2.field6524;
        class337.field4352 = arg3;
        class652.field8984 = arg0;
        class138.field1656 = true;
        if (arg1 == -11302) {
            class210.field2693 = arg2.field6601;
            class563.field7893 = arg2.field6556;
            class586.field8192 = arg2.field6615;
            class663.method3591(16886, arg2);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
    public abstract boolean method2924(int arg0, int arg1);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Ljfa;")
    public abstract class122 method2918(int arg0);

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
    public abstract void method2925(int arg0);

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V")
    public abstract void method2919(int arg0);
}
