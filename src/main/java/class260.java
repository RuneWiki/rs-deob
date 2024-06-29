import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class260 extends class25 implements class383 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lcg;")
    public static class10 field4196;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "[I")
    public static int[] field4198;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lof;")
    public static class328 field4197;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
    public static int[] field4199;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)J")
    public final long method133(byte arg0) {
        if (arg0 > -85) {
            method1772(-124, -85, (byte) -121, -112, 34, (byte[]) null);
        }
        ++field4190;
        return super.field278.method112();
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lna;ILjaggl/memory/NativeBuffer;)V")
    public class260(class211 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field4193 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1770(byte arg0) {
        field4199 = null;
        field4196 = null;
        field4197 = null;
        if (arg0 != -29) {
            method1770((byte) -103);
        }
        field4198 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public static final void method1771(int arg0, byte arg1) {
        if (arg1 > -69) {
            method1772(-42, 103, (byte) 71, 31, -93, (byte[]) null);
        }
        ++field4189;
        class456 var2 = class233.method1654(arg0, 1, -51);
        var2.method2862(0);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lna;I[BI)V")
    public class260(class211 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4193 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB[B)V")
    public final void method134(int arg0, int arg1, byte arg2, byte[] arg3) {
        this.method152(arg3, arg0);
        ++field4192;
        this.field4193 = arg1;
        if (arg2 != 118) {
            method1771(91, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBII[B)Z")
    public static final boolean method1772(int arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        ++field4194;
        boolean var6 = true;
        if (arg2 > -100) {
            return false;
        } else {
            class208 var7 = new class208(arg5);
            int var8 = -1;
            label74: while (true) {
                int var9 = var7.method1423((byte) -101);
                if (~var9 == -1) {
                    return var6;
                }
                var8 += var9;
                int var10 = 0;
                boolean var11 = false;
                while (true) {
                    int var15;
                    class156 var18;
                    do {
                        int var16;
                        int var17;
                        do {
                            do {
                                do {
                                    do {
                                        while (var11) {
                                            int var19 = var7.method1481(false);
                                            if (~var19 == -1) {
                                                continue label74;
                                            }
                                            var7.method1445(23);
                                        }
                                        int var12 = var7.method1481(false);
                                        if (var12 == 0) {
                                            continue label74;
                                        }
                                        var10 += var12 - 1;
                                        int var13 = 63 & var10;
                                        int var14 = var10 >> 6 & 63;
                                        var15 = var7.method1445(-99) >> 2;
                                        var16 = arg1 + var14;
                                        var17 = var13 - -arg4;
                                    } while (var16 <= 0);
                                } while (var17 <= 0);
                            } while (~var16 <= ~(arg0 + -1));
                        } while (~(arg3 + -1) >= ~var17);
                        var18 = class454.field7029.method3002(-1, var8);
                    } while (~var15 == -23 && !class141.field1911.field6108 && var18.field2079 == 0 && var18.field2125 != 1 && !var18.field2143);
                    if (!var18.method956((byte) 106)) {
                        var6 = false;
                        ++class361.field5590;
                    }
                    var11 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
    public final int method135(byte arg0) {
        int var2 = 110 / ((arg0 - -65) / 33);
        ++field4195;
        return this.field4193;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I")
    public final int method132(int arg0) {
        ++field4191;
        return arg0 < 92 ? -110 : 0;
    }

    static {
        new class213((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field4196 = new class10(4, 1, 1, 1);
        field4198 = new int[14];
        field4197 = new class328(8);
        field4199 = new int[2048];
    }
}
