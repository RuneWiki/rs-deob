import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class353 extends class337 {

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[Ldh;")
    public static class209[] field5403 = new class209[2048];

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field5404 = 0;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Lri;")
    public static class73 field5401 = new class73(77, 12);

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public int field5412;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "[I")
    public int[] field5405;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "[I")
    public int[] field5409;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "[I")
    public int[] field5410;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "[Lrm;")
    public class281[] field5400;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[Lrm;")
    public class281[] field5402;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "[[[B")
    public byte[][][] field5408;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZLid;IILid;I)I", line = 5)
    public static final int method2209(boolean arg0, boolean arg1, class412 arg2, int arg3, int arg4, class412 arg5, int arg6) {
        if (arg3 != 9474) {
            return -64;
        }
        field5407++;
        int var7 = class405.method2435(arg5, arg2, arg1, -126, arg4);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class405.method2435(arg5, arg2, arg0, arg3 ^ 0xFFFFDACB, arg6);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 38)
    public static void method2210(int arg0) {
        field5401 = null;
        if (arg0 != 77) {
            field5404 = 101;
        }
        field5403 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BIILvg;)V", line = 49)
    public static final void method2211(byte arg0, int arg1, int arg2, class38 arg3) {
        field5406++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field429 != null) {
            class168 var4 = new class168();
            var4.field2488 = arg3;
            var4.field2484 = arg3.field429;
            class360.method2238(var4);
        }
        class266.field3893 = arg3.field467;
        class267.field3903 = arg3.field547;
        class61.field932 = true;
        int var5 = -110 / ((-arg0 - 48) / 32);
        class195.field2839 = arg3.field435;
        class49.field785 = arg3.field535;
        class213.field3114 = arg3.field464;
        class217.field3177 = arg1;
        class515.field7518 = arg2;
        class350.method2203((byte) -125, arg3);
    }
}
