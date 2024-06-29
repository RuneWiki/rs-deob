import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class487 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field7050 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public static volatile boolean field7053 = false;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Z")
    public abstract boolean method556(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILwh;)V")
    public static final void method2868(int arg0, class102 arg1) {
        if (arg0 != -1588359036) {
            method2868(1, null);
        }
        field7054++;
        arg1.field1576 = null;
        if (class181.field2673 < 20) {
            class413.field5847.method905(arg1, 0);
            class181.field2673++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqa;B)V")
    public abstract void method552(class167 arg0, byte arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqa;)Lnj;")
    public abstract class166 method554(int arg0, class167 arg1);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lqa;B)Lem;")
    public abstract class154 method562(class167 arg0, byte arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public abstract void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public abstract void method549(boolean arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILqa;)Z")
    public abstract boolean method553(int arg0, int arg1, int arg2, class167 arg3);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static final int method2869(int arg0, int arg1) {
        field7051++;
        if (arg0 != 1366891568) {
            method2868(29, null);
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
