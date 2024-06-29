import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public abstract class class631 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lpq;")
    public static class159 field8575;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 4)
    public static void method3444(int arg0) {
        int var1 = 6 / ((37 - arg0) / 32);
        field8575 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)Z", line = 17)
    public static final boolean method3445(int arg0, int arg1, byte arg2) {
        if (arg2 != 84) {
            method3445(-93, -31, (byte) -65);
        }
        field8577++;
        if (((arg1 & 0x10000) != 0 | class558.method3121(arg0, arg1, true)) || class179.method1177(arg0, arg1, (byte) 109)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class4.method25(-1, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public abstract void method127(int arg0);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLoa;)Lvg;")
    public abstract class162 method134(byte arg0, class689 arg1);

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z")
    public abstract boolean method135(int arg0);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIILoa;)Z")
    public abstract boolean method137(int arg0, int arg1, int arg2, class689 arg3);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V")
    public abstract void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(BLoa;)V")
    public abstract void method123(byte arg0, class689 arg1);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Loa;B)Llt;")
    public abstract class95 method136(class689 arg0, byte arg1);
}
