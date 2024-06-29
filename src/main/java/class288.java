import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public abstract class class288 {

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "[I")
    public static int[] field4006 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public int field4001;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Ljava/lang/String;")
    public String field4007;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method1876(byte arg0) throws IOException {
        field4003++;
        if (arg0 <= 84) {
            field4006 = null;
        }
        return new Socket(this.field4007, this.field4001);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method1877(int arg0) {
        field4006 = null;
        if (arg0 != 1) {
            field4004 = -69;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public static final void method1878(int arg0) {
        field4005++;
        if (arg0 <= 49) {
            return;
        }
        if (class214.field3036 == 7) {
            class170.method1282(false, (byte) 11);
        } else {
            class352.field4916 = class512.field7137;
            class512.field7137 = null;
            class215.method1527(2, 13);
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1879(int arg0) throws IOException;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILsd;Lec;IIIBIIII)V")
    public static final void method1880(int arg0, int arg1, class95 arg2, class236 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        class471.field6601 = arg2;
        class615.field8404 = arg10;
        class518.field7206 = arg3;
        class612.field8369 = arg0;
        class54.field1102 = null;
        class67.field1269 = arg11;
        class230.field3327 = null;
        class591.field8074 = arg6;
        class66.field1254 = arg8;
        field4002++;
        class537.field7421 = arg1;
        class349.field4877 = arg5;
        class316.field4372 = arg9;
        class724.field9810 = null;
        class77.field1383 = arg4;
        class753.method4202(true);
        int var12 = -77 % ((arg7 - 29) / 34);
        class67.field1270 = true;
    }
}
