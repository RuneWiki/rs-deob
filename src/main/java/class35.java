import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class35 {

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Lnj;")
    public static class415 field514 = new class415(76, 5);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lpe;BILpe;)V")
    public static final void method274(class615 arg0, byte arg1, int arg2, class615 arg3) {
        class196.field2565 = arg3;
        if (arg1 != 14) {
            method274(null, (byte) -104, -36, null);
        }
        field513++;
        class47.field670 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static final void method275(int arg0) {
        class365[] var1 = class274.field3603;
        synchronized (class274.field3603) {
            for (int var2 = 0; var2 < class274.field3603.length; var2++) {
                class274.field3603[var2] = new class365();
                class388.field4972[var2] = 0;
            }
            if (arg0 != 18989) {
                method277(23, 95, 72);
            }
        }
        field512++;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public abstract void method276(int arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
    public static final void method277(int arg0, int arg1, int arg2) {
        boolean var3 = class483.field6438[0][arg1][arg2] != null && class483.field6438[0][arg1][arg2].field6898 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class483.field6438[var4][arg1][arg2] == null) {
                class530 var5 = class483.field6438[var4][arg1][arg2] = new class530(var4, arg1, arg2);
                if (var3) {
                    var5.field6897++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
    public abstract boolean method278(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BII)I")
    public abstract int method279(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II[BI)V")
    public abstract void method280(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public abstract void method281(int arg0);

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
    public static void method282(int arg0) {
        if (arg0 != 0) {
            method274(null, (byte) 113, -82, null);
        }
        field514 = null;
    }
}
