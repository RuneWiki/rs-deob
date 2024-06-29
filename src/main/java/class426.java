import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class426 extends class740 {

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field5960 = (int) (class742.method4128(1) / 1000L);

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/String;")
    public String field5961;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "S")
    public short field5952;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field5958 = 0;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 11)
    public static final void method2591(int arg0) {
        field5954++;
        if (arg0 != 1) {
            method2594((byte) -126, null);
        }
        class42 var1 = null;
        try {
            class637 var2 = class341.field4796.method2277(true, true, "2");
            while (var2.field9091 == 0) {
                class246.method1639(1L, (byte) -69);
            }
            if (var2.field9091 == 1) {
                var1 = (class42) var2.field9093;
                byte[] var3 = new byte[(int) var1.method386((byte) 46)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method383(var3.length - var4, var4, var3, 1);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class240.method1612(-3, new class35(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method389(31);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B[S[Ljava/lang/String;)V", line = 60)
    public static final void method2592(byte arg0, short[] arg1, String[] arg2) {
        field5959++;
        if (arg0 != 65) {
            method2593(89);
        }
        class401.method2477(arg2, arg1, arg2.length - 1, 0, -9696);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V", line = 72)
    public static final void method2593(int arg0) {
        class633.field9066 = new class433[500];
        class154.field2310 = class546.field7701;
        class650.field9180 = 0;
        if (arg0 != -25606) {
            field5955 = -62;
        }
        class131.field1952 = class546.field7701;
        class588.field8275 = 0;
        class27.field380 = new class433[1000];
        class522.field7393 = 0;
        class257.field3726 = false;
        class217.field3094 = new class433[500];
        class467.field6737 = new class433[2000];
        class159.field2370 = new int[class749.field10470][class613.field8871 + 1][class453.field6328 + 1];
        class93.field1622 = 0;
        field5956++;
        if (class497.field7089 instanceof class691) {
            class186.field2665 = false;
        } else {
            class186.field2665 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 104)
    public class426(String arg0, int arg1) {
        this.field5961 = arg0;
        this.field5952 = (short) arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;)J", line = 114)
    public static final long method2594(byte arg0, String arg1) {
        if (arg0 <= 23) {
            return -119L;
        }
        field5957++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }
}
