import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class674 extends class616 implements class13 {

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "Ljr;")
    private class100 field9206;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "[I")
    public static int[] field9208 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "[I")
    public static int[] field9211 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "Lcga;")
    public static class449 field9207 = new class449(39, 8);

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "J")
    public static long field9213 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)Ljr;", line = 7)
    public final class100 method58(byte arg0) {
        if (arg0 != 88) {
            method3740(null, -1, -94, -56, -10, -24);
        }
        field9204++;
        return this.field9206;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 18)
    public final void method60(int arg0) {
        field9210++;
        super.method60(arg0);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I", line = 26)
    public final int method503(int arg0) {
        field9205++;
        if (arg0 != -3267) {
            this.method59(-42, 33);
        }
        return super.method503(-3267);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 37)
    public final void method59(int arg0, int arg1) {
        super.method59(arg0, this.field9206.field1284 * arg1);
        field9209++;
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V", line = 49)
    public static void method3739(int arg0) {
        field9211 = null;
        field9208 = null;
        field9207 = null;
        if (arg0 < 7) {
            method3740(null, -90, 34, -116, -34, -19);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lpv;IIIII)V", line = 65)
    public static final void method3740(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field794 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class189.field2250[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class660 var13 = class370.field4785[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field794; var14++) {
                            if (arg0.field797[var14] == var13.field8960) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field797[arg0.field794++] = var13.field8960;
                        if (arg0.field794 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field794; var15 < 4; var15++) {
            arg0.field797[var15] = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 130)
    public final Buffer method62(boolean arg0, boolean arg1) {
        if (arg0) {
            field9203++;
            return super.method62(arg0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Z", line = 144)
    public final boolean method61(byte arg0) {
        field9212++;
        return arg0 == 96 ? super.method61((byte) 96) : true;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lel;Ljr;Z)V", line = 157)
    public class674(class513 arg0, class100 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field9206 = arg1;
    }
}
