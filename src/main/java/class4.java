import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class4 extends class77 {

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Z")
    public volatile boolean field118 = true;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Ljava/lang/String;")
    public static String field114 = "Allocated memory";

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Ljava/lang/String;")
    public static String field109 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Ljava/lang/String;")
    public static String field116 = "Hidden";

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field119 = -2;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field111;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
    public boolean field107;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Z")
    public boolean field108;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V", line = 4)
    public static final void method25(byte arg0) {
        field110++;
        if (arg0 != -127) {
            method26((class361) null, 98);
        }
        int var1 = class172.field2482;
        int var2 = class173.field2499;
        int var3 = class131.field1899;
        int var4 = class134.field1957 - 3;
        byte var5 = 20;
        if (class338.field5243 == null || class158.field2271 == null) {
            if (class216.field3184.method2514((byte) 16, class139.field2002) && class216.field3184.method2514((byte) 47, class302.field4520)) {
                class338.field5243 = class38.method277(0, class139.field2002, -119, class216.field3184);
                class158.field2271 = class38.method277(0, class302.field4520, -113, class216.field3184);
                if (class141.field2031) {
                    if (class338.field5243 instanceof class79) {
                        class338.field5243 = new class283((class118) class338.field5243);
                    } else {
                        class338.field5243 = new class325((class118) class338.field5243);
                    }
                    if ((class158.field2271 instanceof class79)) {
                        class158.field2271 = new class283((class118) class158.field2271);
                    } else {
                        class158.field2271 = new class325((class118) class158.field2271);
                    }
                }
            } else if (class141.field2031) {
                class205.method1500(var2, var3, var1, var5, class120.field1689, 256 - class227.field3420);
            } else {
                class44.method315(var2, var3, var1, var5, class120.field1689, 256 - class227.field3420);
            }
        }
        if (class338.field5243 != null && class158.field2271 != null) {
            int var6 = (var1 - (class158.field2271.field2536 * 2)) / class338.field5243.field2536;
            for (int var7 = 0; var7 < var6; var7++) {
                class338.field5243.method642(class338.field5243.field2536 * var7 + class158.field2271.field2536 + var2, var3);
            }
            class158.field2271.method642(var2, var3);
            class158.field2271.method646(var2 + var1 - class158.field2271.field2536, var3);
        }
        class126.field1846.method186(class173.field2493, var2 + 3, var3 - -14, class160.field2315, -1);
        if (class141.field2031) {
            class205.method1500(var2, var3 + var5, var1, var4 - var5, class120.field1689, 256 - class227.field3420);
        } else {
            class44.method315(var2, var3 + var5, var1, var4 - var5, class120.field1689, 256 - class227.field3420);
        }
        int var8 = class56.field815;
        int var9 = class165.field2353;
        for (int var10 = 0; var10 < class264.field4043; var10++) {
            int var11 = var3 + var5 + (-var10 + class264.field4043 + -1) * 15 + 13;
            if (var8 > var2 && (var1 + var2) > var8 && var11 - 13 < var9 && var11 + 3 > var9) {
                if (class141.field2031) {
                    class205.method1500(var2, var11 - 12, var1, 15, class230.field3475, 256 - class263.field4032);
                } else {
                    class44.method315(var2, var11 - 12, var1, 15, class230.field3475, 256 - class263.field4032);
                }
            }
        }
        if ((class47.field704 == null || class102.field1470 == null || class270.field4100 == null) && class216.field3184.method2514((byte) 106, class199.field2900) && class216.field3184.method2514((byte) 119, class353.field5430) && class216.field3184.method2514((byte) 86, class116.field1652)) {
            class47.field704 = class38.method277(0, class199.field2900, arg0 ^ 0x6, class216.field3184);
            class102.field1470 = class38.method277(0, class353.field5430, -114, class216.field3184);
            class270.field4100 = class38.method277(0, class116.field1652, -117, class216.field3184);
            if (class141.field2031) {
                if (class47.field704 instanceof class79) {
                    class47.field704 = new class283((class118) class47.field704);
                } else {
                    class47.field704 = new class325((class118) class47.field704);
                }
                if (class102.field1470 instanceof class79) {
                    class102.field1470 = new class283((class118) class102.field1470);
                } else {
                    class102.field1470 = new class325((class118) class102.field1470);
                }
                if (class270.field4100 instanceof class79) {
                    class270.field4100 = new class283((class118) class270.field4100);
                } else {
                    class270.field4100 = new class325((class118) class270.field4100);
                }
            }
        }
        if (class47.field704 != null && class102.field1470 != null && class270.field4100 != null) {
            int var12 = (var1 - class270.field4100.field2536 * 2) / class47.field704.field2536;
            for (int var13 = 0; var13 < var12; var13++) {
                class47.field704.method642(class47.field704.field2536 * var13 + class270.field4100.field2536 + var2, var3 + var4 + -class47.field704.field2553);
            }
            int var14 = (var4 - var5 - class270.field4100.field2553) / class102.field1470.field2553;
            for (int var15 = 0; var15 < var14; var15++) {
                class102.field1470.method642(var2, class102.field1470.field2553 * var15 + (var3 + var5));
                class102.field1470.method646(var2 + var1 - class102.field1470.field2536, class102.field1470.field2553 * var15 + var5 + var3);
            }
            class270.field4100.method642(var2, var3 + var4 - class270.field4100.field2553);
            class270.field4100.method646(var1 + var2 - class270.field4100.field2536, -class270.field4100.field2553 + var4 + var3);
        }
        for (int var16 = 0; var16 < class264.field4043; var16++) {
            int var17 = var3 + ((class264.field4043 - var16 - 1) * 15) + var5 + 13;
            int var18 = class160.field2315;
            if (var2 < var8 && (var1 + var2) > var8 && var9 > (var17 - 13) && (var17 + 3) > var9) {
                var18 = class292.field4419;
            }
            class126.field1846.method186(class181.method1252(var16, arg0 - 21292), var2 + 3, var17, var18, 0);
        }
        class135.method965(-105, class172.field2482, class134.field1957, class131.field1899, class173.field2499);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lph;I)V", line = 180)
    public static final void method26(class361 arg0, int arg1) {
        int var2 = -120 / ((-arg1 - 61) / 49);
        field113++;
        class244.field3632 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V", line = 198)
    public static void method28(byte arg0) {
        field114 = null;
        field116 = null;
        if (arg0 != 73) {
            method32(true, -121, 63, -115, -21);
        }
        field111 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V", line = 216)
    public static final void method30(int arg0, boolean arg1) {
        field117++;
        class95 var2 = class227.method1699(9, -1855723168, arg0);
        var2.method743(0);
        if (arg1) {
            field111 = (FontMetrics) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V", line = 236)
    public static final void method31(int arg0) {
        class36 var1 = class255.field3805;
        synchronized (class255.field3805) {
            class96.field1346 = class181.field2619;
            class290.field4388++;
            class56.field815 = class98.field1387;
            if (arg0 != 591) {
                method26((class361) null, -80);
            }
            class165.field2353 = class259.field3867;
            class31.field445 = class275.field4168;
            class180.field2592 = class92.field1281;
            class227.field3425 = class68.field992;
            class111.field1621 = class310.field4629;
            class275.field4168 = 0;
        }
        field120++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIIII)V", line = 263)
    public static final void method32(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field115++;
        if (arg1 >= class326.field4901 && arg1 <= class261.field3911) {
            int var5 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg2);
            int var6 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg4);
            class221.method1614(arg3, -1, var5, arg1, var6);
        }
        if (arg0) {
            field111 = (FontMetrics) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)[B")
    public abstract byte[] method27(int arg0);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
    public abstract int method29(int arg0);
}
