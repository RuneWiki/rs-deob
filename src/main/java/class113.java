import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class113 extends class238 {

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Lef;")
    public static class311 field1429 = new class311(6, 4);

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public int field1444;

    // $FF: synthetic field
    @OriginalMember(owner = "client!op", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1445;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIILb;ZI)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3, class201 arg4, boolean arg5, int arg6) {
        field1432++;
        class222.field3376 = arg1;
        class405.field5701 = arg6;
        class327.field4741 = 1;
        client.field2623 = arg4;
        if (arg2 != 7) {
            field1429 = null;
        }
        class206.field3157 = arg3;
        class256.field3761 = arg5;
        class70.field883 = class330.field4781.method778(18497) / arg0;
        if (class70.field883 < 1) {
            class70.field883 = 1;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method716(int arg0) {
        field1429 = null;
        if (arg0 != 1) {
            field1429 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method717(boolean arg0, String arg1) {
        field1440++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (!arg0) {
            field1429 = null;
        }
        while (var2 > var4) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
            var4++;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIB)I")
    public static final int method718(int arg0, int arg1, int arg2, byte arg3) {
        field1443++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (arg3 <= 107) {
            return 7;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lnp;II)Lf;")
    public final class491 method719(class313 arg0, int arg1, int arg2) {
        if (arg1 < 105) {
            this.field1434 = 121;
        }
        field1438++;
        int var4 = class339.field4951[this.field1425];
        if (var4 == 0) {
            class237 var5 = class50.method320(this.field1435, this.field1436, this.field1434);
            if (var5 instanceof class114) {
                class114 var6 = (class114) var5;
                if (var6.field1466 != null) {
                    return ((class106) var6.field1466).method115(arg0, (byte) 110, arg2);
                }
            }
        } else if (var4 == 1) {
            class364 var11 = class271.method1658(this.field1435, this.field1436, this.field1434);
            if (var11 instanceof class320) {
                class320 var12 = (class320) var11;
                if (var12.field4641 != null) {
                    return ((class106) var12.field4641).method115(arg0, (byte) 88, arg2);
                }
            }
        } else if (var4 == 2) {
            class304 var9 = class231.method1470(this.field1435, this.field1436, this.field1434, field1445 == null ? (field1445 = method720("gg")) : field1445);
            if (var9 instanceof class222) {
                class222 var10 = (class222) var9;
                if (var10.field3370 != null) {
                    return ((class106) var10.field3370).method115(arg0, (byte) 85, arg2);
                }
            }
        } else if (var4 == 3) {
            class405 var7 = class149.method941(this.field1435, this.field1436, this.field1434);
            if (var7 instanceof class111) {
                class111 var8 = (class111) var7;
                if (var8.field1403 != null) {
                    return ((class106) var8.field1403).method115(arg0, (byte) 88, arg2);
                }
            }
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method720(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class326("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
