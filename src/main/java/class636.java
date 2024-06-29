import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class636 extends class83 implements class401 {

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    private int field8861;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I", line = 6)
    public final int method2504(int arg0) {
        ++field8862;
        return arg0 != 4180 ? 60 : super.field1171;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)J", line = 17)
    public final long method2503(int arg0) {
        ++field8866;
        return arg0 != 1932 ? -58L : 0L;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 29)
    public final void method694(int arg0) {
        int var2 = -9 % ((arg0 - -20) / 60);
        ++field8863;
        super.field1170.method1651(-126, this);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I", line = 40)
    public final int method2502(byte arg0) {
        ++field8867;
        int var2 = -19 / ((arg0 - 29) / 63);
        return this.field8861;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BIII)V", line = 50)
    public final void method2501(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 30463) {
            field8868 = 75;
        }
        this.method691(arg0, 17199, arg3);
        ++field8865;
        this.field8861 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ldia;I[BIZ)V", line = 64)
    public class636(class246 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8861 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V", line = 72)
    public static final void method3556(byte arg0) {
        ++field8864;
        if (class735.field10183 != null) {
            if (arg0 >= -58) {
                method3556((byte) 17);
            }
            try {
                String var1 = class735.field10183.getParameter("cookiehost");
                int var2 = -11745 + (int) (class302.method1910(0) / 86400000L);
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class623.method3412("document.cookie=\"" + var3 + "\"", class735.field10183, -25118);
            } catch (Throwable var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ldia;ILjaclib/memory/Buffer;IZ)V", line = 99)
    public class636(class246 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8861 = arg1;
    }
}
