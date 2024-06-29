import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class367 extends class782 {

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    private int field4973;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    private int field4974;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "Lfja;")
    public static class783 field4981 = new class783(62, 16);

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "[I")
    public static int[] field4986 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "Lfja;")
    public static class783 field4985 = new class783(59, 4);

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "Lpo;")
    public static class585 field4983;

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(IIIIIII)V", line = 6)
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4973 = arg1;
        this.field4982 = arg0;
        this.field4974 = arg2;
        this.field4979 = arg3;
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(IBI)V", line = 20)
    public final void method1941(int arg0, byte arg1, int arg2) {
        ++field4978;
        int var4 = this.field4982 * arg0 >> 12;
        int var5 = 124 / ((arg1 - -62) / 56);
        int var6 = this.field4974 * arg0 >> 12;
        int var7 = this.field4973 * arg2 >> 12;
        int var8 = this.field4979 * arg2 >> 12;
        class695.method3878(super.field10750, var7, var6, var4, var8, -3096);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)V", line = 39)
    public static final void method2239(int arg0, int arg1) {
        if (arg1 != -1424827508) {
            method2241((class93) null, -18);
        }
        ++field4976;
        class487.field6577 = arg0;
        class43 var2 = class770.field10617;
        synchronized (class770.field10617) {
            class770.field10617.method273(-39);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V", line = 53)
    public static void method2240(byte arg0) {
        field4986 = null;
        field4981 = null;
        if (arg0 != -94) {
            field4984 = -72;
        }
        field4985 = null;
        field4983 = null;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBI)V", line = 70)
    public final void method1935(int arg0, byte arg1, int arg2) {
        ++field4977;
        int var4 = this.field4982 * arg0 >> 12;
        if (arg1 <= -110) {
            int var5 = this.field4974 * arg0 >> 12;
            int var6 = this.field4973 * arg2 >> 12;
            int var7 = this.field4979 * arg2 >> 12;
            class258.method1684(var5, var7, super.field10752, var4, var6, (byte) 102, super.field10750, super.field10753);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V", line = 93)
    public final void method1938(int arg0, int arg1, int arg2) {
        ++field4980;
        int var4 = this.field4982 * arg2 >> 12;
        if (arg0 > 109) {
            int var5 = this.field4974 * arg2 >> 12;
            int var6 = this.field4973 * arg1 >> 12;
            int var7 = this.field4979 * arg1 >> 12;
            class459.method2638(var6, super.field10752, var4, var7, var5, super.field10753, -128);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lfca;I)Lwv;", line = 113)
    public static final class37 method2241(class93 arg0, int arg1) {
        ++field4975;
        if (arg1 != 59) {
            field4984 = -26;
        }
        class70 var2 = class111.method972((byte) -61, arg0);
        int var3 = arg0.method773(3);
        int var4 = arg0.method773(3);
        int var5 = arg0.method763(arg1 ^ -16);
        return new class37(var2.field1041, var2.field1039, var2.field1035, var2.field1033, var2.field1031, var2.field1030, var2.field1032, var2.field1034, var2.field1040, var3, var4, var5);
    }
}
