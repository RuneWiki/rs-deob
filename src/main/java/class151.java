import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class151 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static final void method1074(boolean arg0) {
        if (!arg0) {
            method1077(1, 31, 80, (byte) -7, 122, 28, false, -48, -15);
        }
        field2133++;
        class66.field1043.method3890(-1);
    }

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method883(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method881(int arg0);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method887(class151 arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
    public static final void method1075(int arg0, boolean arg1) {
        class692 var2 = class423.field6210;
        synchronized (class423.field6210) {
            if (!arg1) {
                return;
            }
            class423.field6210.method3900(arg0, 0);
        }
        field2132++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method892(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static int method1076(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method886(int arg0);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method879(int arg0);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method893(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method880(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "A", descriptor = "(III[I)V")
    public abstract void method885(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method884(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class151 method888();

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method889(int arg0);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method891(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method890();

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBIIZII)Z")
    public static final boolean method1077(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field2134++;
        int var9 = class321.field4681.field7430[0];
        int var10 = class321.field4681.field7429[0];
        if (var9 < 0 || var9 >= class72.field1144 || var10 < 0 || var10 >= class668.field9444) {
            return false;
        } else if (arg8 >= 0 && class72.field1144 > arg8 && arg4 >= 0 && arg4 < class668.field9444) {
            int var11 = class14.method98(arg2, arg1, arg7, var10, class642.field9198, class574.field8346, var9, arg0, arg5, class321.field4681.method422((byte) -45), class629.field9104[class321.field4681.field7905], arg6, arg4, arg8, (byte) 119);
            if (var11 < 1) {
                return false;
            }
            class373.field5521 = class574.field8346[var11 - 1];
            class338.field4907 = class642.field9198[var11 - 1];
            int var12 = 46 / ((arg3 + 67) / 36);
            class338.field4905 = false;
            class222.method1390(false);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method882(int[] arg0);
}
