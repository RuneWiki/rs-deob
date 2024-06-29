import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class337 extends class22 {

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Z")
    public boolean field4588;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
    public static final void method2158(int arg0, int arg1) {
        field4590++;
        class365 var2 = class263.field3379;
        synchronized (class263.field3379) {
            if (arg1 != 1) {
                return;
            }
            class263.field3379.method2286(arg0, (byte) 36);
        }
        class365 var3 = class20.field219;
        synchronized (class20.field219) {
            class20.field219.method2286(arg0, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static final void method2159(int arg0) {
        int var1 = 7 % ((arg0 - 46) / 40);
        field4592++;
        if (class80.field970 == 5) {
            class80.field970 = 6;
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        if (arg0 == 3652) {
            field4589++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        if (arg5 >= -115) {
            method2160(66, (int[]) null, (byte) 70, (long[]) null, -103);
        }
        field4595++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[IB[JI)V")
    public static final void method2160(int arg0, int[] arg1, byte arg2, long[] arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var9;
            for (int var10 = arg4; var10 < arg0; var10++) {
                if (arg3[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var9;
            method2160(var6 - 1, arg1, (byte) -62, arg3, arg4);
            method2160(arg0, arg1, (byte) -56, arg3, var6 + 1);
        }
        field4593++;
        if (arg2 > -50) {
            method2159(54);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method2161(int[] arg0, byte arg1) {
        field4591++;
        if (arg1 != -34) {
            return null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class28.field323;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class438 var5 = class141.method917(arg0[var4], 110);
            if (var5.field6021 != -1) {
                class436 var6 = (class436) class241.field3162.method2295((long) var5.field6021, (byte) 74);
                if (var6 == null) {
                    class132 var7 = class132.method849(class15.field177, var5.field6021, 0);
                    if (var7 != null) {
                        var6 = class267.field3454.method697(var7, true);
                        class241.field3162.method2294(var6, (byte) 92, (long) var5.field6021);
                    }
                }
                if (var6 != null) {
                    class53.field621[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
    public final void method140(int arg0) {
        field4587++;
        if (arg0 >= -24) {
            this.field4594 = -82;
        }
        throw new IllegalStateException();
    }
}
