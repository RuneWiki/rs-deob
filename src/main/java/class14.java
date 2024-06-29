import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class14 {

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lfh;")
    public static class140 field157;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[I")
    public static int[] field162;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V", line = 7)
    public static final void method103(int arg0, int arg1, byte arg2) {
        field159++;
        class42 var3 = class166.method1242(13, arg1, -1249071392);
        var3.method307((byte) -106);
        var3.field523 = arg0;
        if (arg2 != -56) {
            field157 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 20)
    public static void method104(byte arg0) {
        if (arg0 != 121) {
            method106('I', (StringBuffer) null, -75, false);
        }
        field157 = null;
        field162 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[F)[F", line = 31)
    public static final float[] method105(int arg0, float[] arg1) {
        field161++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -5899) {
            method103(49, 92, (byte) -101);
        }
        float[] var2 = new float[arg1.length];
        class87.method632(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(CLjava/lang/StringBuffer;IZ)Ljava/lang/StringBuffer;", line = 54)
    public static final StringBuffer method106(char arg0, StringBuffer arg1, int arg2, boolean arg3) {
        field160++;
        if (!arg3) {
            field157 = (class140) null;
        }
        int var4 = arg1.length();
        arg1.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg1.setCharAt(var5, arg0);
        }
        return arg1;
    }
}
