import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class112 extends class217 {

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Z")
    public static boolean field1971 = false;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Llc;")
    public class143 field1968;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lh;ZI)V")
    private final void method671(class190 arg0, boolean arg1, int arg2) {
        field1970++;
        if (arg1) {
            return;
        }
        if (arg2 == 1) {
            this.field1976 = arg0.method1265(115);
        } else if (arg2 == 2) {
            this.field1973 = arg0.method1269(99);
        } else if (arg2 == 5) {
            this.field1968 = arg0.method1270((byte) 104);
            return;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ln;Z)V")
    public static final void method672(class249 arg0, boolean arg1) {
        field1972++;
        long var2 = 0L;
        if (!arg1) {
            return;
        }
        if (arg0.field4500 == 0) {
            var2 = class13.method104(arg0.field4491, arg0.field4502, arg0.field4494);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4500 == 1) {
            var2 = class8.method66(arg0.field4491, arg0.field4502, arg0.field4494);
        }
        int var6 = -1;
        if (arg0.field4500 == 2) {
            var2 = class141.method851(arg0.field4491, arg0.field4502, arg0.field4494);
        }
        if (arg0.field4500 == 3) {
            var2 = class273.method1801(arg0.field4491, arg0.field4502, arg0.field4494);
        }
        if (var2 != 0L) {
            var4 = (int) var2 >> 14 & 0x1F;
            var6 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = ((int) var2 & 0x32B761) >> 20;
        }
        arg0.field4497 = var6;
        arg0.field4487 = var4;
        arg0.field4485 = var5;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Z")
    public final boolean method673(int arg0) {
        if (arg0 != -2906) {
            this.method673(112);
        }
        field1964++;
        return this.field1976 == 115;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[BZ[Llf;I)V")
    public static final void method674(int arg0, int arg1, byte[] arg2, boolean arg3, class106[] arg4, int arg5) {
        field1966++;
        if (arg1 != 3) {
            method674(-100, 49, (byte[]) null, true, (class106[]) null, 46);
        }
        class190 var6 = new class190(arg2);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1230(false);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1257((byte) 81);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = (var9 & 0xFCD) >> 6;
                int var14 = var6.method1265(121);
                int var15 = var14 >> 2;
                int var16 = arg5 + var13;
                int var17 = var14 & 0x3;
                int var18 = var11 + arg0;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class106 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class231.field4225[1][var16][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class129.method781(arg3, var18, var12, var19, -29969, var16, var7, var15, var17, var12, !arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLh;)V")
    public final void method675(boolean arg0, class190 arg1) {
        field1965++;
        while (true) {
            int var3 = arg1.method1265(121);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    method674(79, 16, (byte[]) null, true, (class106[]) null, 123);
                    return;
                }
            }
            this.method671(arg1, false, var3);
        }
    }
}
