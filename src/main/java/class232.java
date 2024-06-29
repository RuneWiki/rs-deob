import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class232 extends class108 {

    @OriginalMember(owner = "client!an", name = "j", descriptor = "[B")
    public byte[] field2969;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lqa;IILm;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1466(class167 arg0, int arg1, int arg2, class105 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class583.field8427 = arg0;
        class4.field40 = arg1;
        class22.field308 = arg3;
        class526.field7327 = class583.field8427.method914() > 0;
        class155.field2012 = arg4 >> class400.field5480;
        class151.field1995 = arg6 >> class400.field5480;
        class543.field7580 = arg4;
        class100.field1335 = arg6;
        class385.field5366 = arg5;
        class389.field5401 = class155.field2012 - class257.field3199;
        if (class389.field5401 < 0) {
            class601.field8700 = -class389.field5401;
            class389.field5401 = 0;
        } else {
            class601.field8700 = 0;
        }
        class445.field6164 = class151.field1995 - class257.field3199;
        if (class445.field6164 < 0) {
            class415.field5709 = -class445.field6164;
            class445.field6164 = 0;
        } else {
            class415.field5709 = 0;
        }
        class145.field1893 = class257.field3199 + class155.field2012;
        if (class145.field1893 > class260.field3211) {
            class145.field1893 = class260.field3211;
        }
        class244.field3085 = class257.field3199 + class151.field1995;
        if (class244.field3085 > class541.field7566) {
            class244.field3085 = class541.field7566;
        }
        for (int var18 = 0; var18 < class257.field3199 + class257.field3199 + 2; var18++) {
            for (int var23 = 0; var23 < class257.field3199 + class257.field3199 + 2; var23++) {
                int var24 = class155.field2012 + var18 - class257.field3199;
                int var25 = class151.field1995 + var23 - class257.field3199;
                if (var24 >= 0 && var25 >= 0 && var24 < class260.field3211 && var25 < class541.field7566) {
                    int var26 = var24 << class400.field5480;
                    int var27 = var25 << class400.field5480;
                    int var28 = class50.field672[class50.field672.length - 1].method1031(var24, var25) - (0x3E8 << class400.field5480 - 7);
                    int var29 = class353.field4949 == null ? class50.field672[0].method1031(var24, var25) + class456.field6523 : class353.field4949[0].method1031(var24, var25) + class456.field6523;
                    class144.field1879[var18][var23] = class583.field8427.method992(var26, var28, var27, var26, var29, var27);
                } else {
                    class144.field1879[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class257.field3199 + class257.field3199 + 1; var19++) {
            for (int var22 = 0; var22 < class257.field3199 + class257.field3199 + 1; var22++) {
                class634.field9230[var19][var22] = class144.field1879[var19][var22] || class144.field1879[var19 + 1][var22] || class144.field1879[var19][var22 + 1] || class144.field1879[var19 + 1][var22 + 1];
            }
        }
        class455.field6446 = arg8;
        class311.field3982 = arg9;
        class509.field7096 = arg10;
        class44.field631 = arg11;
        class115.field1470 = arg12;
        class257.method1548();
        class148.method807(class583.field8427, (byte) -53);
        for (class541 var20 = (class541) class358.field4993.method1876((byte) -60); var20 != null; var20 = (class541) class358.field4993.method1877(0)) {
            var20.method3394(false);
            class442.method2561((byte) -50, var20);
        }
        if (class526.field7327) {
            for (int var21 = 0; var21 < class444.field6143; var21++) {
                class256.field3175[var21].method3434(arg17, arg1, -105);
            }
        }
        if (arg2 > 1) {
            class583.field8427.method203(0);
            if (class171.field2196 == null || class171.field2196 instanceof class497) {
                class171.field2196 = new class141();
            }
        } else if (class171.field2196 == null || class171.field2196 instanceof class141) {
            class171.field2196 = new class497();
        }
        class171.field2196.method760(arg2, 0);
        class171.field2196.method755((byte) -100);
        if (class319.field4403 != null) {
            class580.method3268(true);
            class171.field2196.method757(22, (byte) 11);
            class325.method2012(arg2, null, 0, (byte) 0, arg15, arg16);
            class171.field2196.method755((byte) -94);
            class171.field2196.method757(23, (byte) 11);
            class580.method3268(false);
        }
        class325.method2012(arg2, arg7, arg13, arg14, arg15, arg16);
        class171.field2196.method755((byte) -124);
        class171.field2196.method768(true);
        class171.field2196.method755((byte) -113);
        if (arg2 > 1) {
            class583.field8427.method198(0);
        }
        class583.field8427.method972(0, null);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lhca;")
    public static final class179 method1467(Canvas arg0, byte arg1) {
        field2970++;
        try {
            if (arg1 < 91) {
                method1466(null, -96, 65, null, 1, -90, 37, null, null, null, null, null, null, 126, (byte) 80, 40, 63, true);
            }
            Class var2 = Class.forName("as");
            class179 var3 = (class179) var2.getDeclaredConstructor().newInstance();
            var3.method155(false, arg0);
            return var3;
        } catch (Throwable var5) {
            class296 var4 = new class296();
            var4.method155(false, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static final void method1468(byte arg0) {
        field2971++;
        class632 var1 = class641.method3699(-121, 15, 0);
        var1.method3655(0);
        if (arg0 <= 46) {
            method1467(null, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V")
    public class232(byte[] arg0) {
        this.field2969 = arg0;
    }

    static {
        new class344("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }
}
