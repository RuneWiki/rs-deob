import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class259 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field4099 = 0;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lsi;")
    public static class264 field4100 = null;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field4102 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Leh;")
    public static class164 field4101;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1828(int arg0) {
        if (arg0 < 24) {
            method1828(105);
        }
        field4103++;
        class261.field4115.method644((byte) -114);
        class346.field5540.method644((byte) -87);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIILgd;B)V", line = 29)
    public static final void method1829(int arg0, int arg1, int arg2, int arg3, int arg4, class154 arg5, byte arg6) {
        field4105++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg4 == 0) {
            var7 = class47.method355(arg2, arg3, arg1);
        } else if (arg4 == 1) {
            var7 = class23.method200(arg2, arg3, arg1);
        } else if (arg4 == 2) {
            var7 = class113.method743(arg2, arg3, arg1);
        } else if (arg4 == 3) {
            var7 = class13.method96(arg2, arg3, arg1);
        }
        boolean var10 = false;
        boolean var11 = false;
        int var12 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        int var13 = ((int) var7 & 0x7CE30) >> 14;
        if (arg6 != -68) {
            return;
        }
        int var14 = (int) var7 >> 20 & 0x3;
        class126 var15 = class165.method1155((byte) -108, var12);
        if (var15.method812((byte) 119)) {
            class121.method784(-4543, arg2, arg1, var15, arg3);
        }
        if (var7 == 0L) {
            return;
        }
        class162 var16 = null;
        class162 var17 = null;
        if (arg4 == 0) {
            class257 var21 = class356.method2481(arg2, arg3, arg1);
            if (var21 != null) {
                var16 = var21.field4059;
                var17 = var21.field4070;
            }
            if (var15.field1926 != 0) {
                arg5.method1112(var15.field1912, arg1, var13, !var15.field1892, var14, arg3, (byte) -125);
            }
        } else if (arg4 == 1) {
            class206 var20 = class352.method2458(arg2, arg3, arg1);
            if (var20 != null) {
                var17 = var20.field3136;
                var16 = var20.field3141;
            }
        } else if (arg4 == 2) {
            class258 var19 = class159.method1128(arg2, arg3, arg1);
            if (var19 != null) {
                var17 = var19.field4071;
            }
            if (var15.field1926 != 0 && (var15.field1880 + arg3) < 104 && var15.field1880 + arg1 < 104 && (var15.field1929 + arg3) < 104 && (var15.field1929 + arg1) < 104) {
                arg5.method1116((byte) 53, !var15.field1892, arg3, arg1, var15.field1929, var14, var15.field1880, var15.field1912);
            }
        } else if (arg4 == 3) {
            class86 var18 = class353.method2468(arg2, arg3, arg1);
            if (var18 != null) {
                var17 = var18.field1235;
            }
            if (var15.field1926 == 1) {
                arg5.method1118(74, arg1, arg3);
            }
        }
        if (var15.field1949 != null) {
            var15 = var15.method818(-104);
        }
        if (!class245.field3886 || var15 == null || !var15.field1943) {
            return;
        }
        if (var13 == 2) {
            if (var17 instanceof class263) {
                ((class263) var17).method1847(7955);
            } else {
                class264.method1858((byte) 113, arg1, 0, var13, arg0, arg3, 0, var14 + 4, var15);
            }
            if ((var16 instanceof class263)) {
                ((class263) var16).method1847(7955);
            } else {
                class264.method1858((byte) 98, arg1, 0, var13, arg0, arg3, 0, var14 + 1 & 0x3, var15);
            }
        } else if (var13 == 5) {
            if (var17 instanceof class263) {
                ((class263) var17).method1847(7955);
            } else {
                class264.method1858((byte) 117, arg1, class250.field3969[var14] * 8, 4, arg0, arg3, class284.field4659[var14] * 8, var14, var15);
            }
        } else if (var13 == 6) {
            if ((var17 instanceof class263)) {
                ((class263) var17).method1847(7955);
            } else {
                class264.method1858((byte) 101, arg1, class6.field75[var14] * 8, 4, arg0, arg3, class238.field3767[var14] * 8, var14 + 4, var15);
            }
        } else if (var13 == 7) {
            if ((var17 instanceof class263)) {
                ((class263) var17).method1847(7955);
            } else {
                class264.method1858((byte) 125, arg1, 0, 4, arg0, arg3, 0, (var14 + 2 & 0x3) + 4, var15);
            }
        } else if (var13 == 8) {
            if (var17 instanceof class263) {
                ((class263) var17).method1847(7955);
            } else {
                class264.method1858((byte) 69, arg1, class6.field75[var14] * 8, 4, arg0, arg3, class238.field3767[var14] * 8, var14 + 4, var15);
            }
            if (var16 instanceof class263) {
                ((class263) var16).method1847(7955);
            } else {
                class264.method1858((byte) 121, arg1, class6.field75[var14] * 8, 4, arg0, arg3, class238.field3767[var14] * 8, (var14 + 2 & 0x3) + 4, var15);
            }
        } else if (var13 == 11) {
            if ((var17 instanceof class263)) {
                ((class263) var17).method1847(7955);
            } else {
                class264.method1858((byte) 103, arg1, 0, 10, arg0, arg3, 0, var14 + 4, var15);
            }
        } else if (var17 instanceof class263) {
            ((class263) var17).method1847(7955);
        } else {
            class264.method1858((byte) 110, arg1, 0, var13, arg0, arg3, 0, var14, var15);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 225)
    public static void method1830(int arg0) {
        field4100 = null;
        field4101 = null;
        if (arg0 != 0) {
            method1828(72);
        }
    }
}
