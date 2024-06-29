import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class69 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lha;")
    public static class46 field1194 = class271.method1828("Ladevorgang )2 bitte warten Sie)3", -46);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
    public static int[] field1192 = new int[32];

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lha;")
    public static class46 field1198 = class271.method1828("::replacecanvas", -46);

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lha;")
    public static class46 field1202 = class271.method1828("1", -46);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "J")
    public long field1195;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lcj;")
    public class69 field1197;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lcj;")
    public class69 field1200;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method497(byte arg0) {
        field1198 = null;
        field1192 = null;
        field1202 = null;
        field1194 = null;
        if (arg0 != -42) {
            field1193 = -88;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
    public static final void method498(byte arg0, int arg1) {
        field1196++;
        if (arg0 <= 30) {
            field1192 = null;
        }
        class216.field3818.method81((byte) 30, arg1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILha;)V")
    public static final void method499(int arg0, class46 arg1) {
        field1191++;
        for (class74 var2 = (class74) class73.field1301.method264(arg0 - 40); var2 != null; var2 = (class74) class73.field1301.method269((byte) 7)) {
            if (var2.field1325.method340((byte) 107, arg1)) {
                class189.field3370 = var2;
                return;
            }
        }
        if (arg0 != -2) {
            field1194 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
    public final boolean method500(byte arg0) {
        field1199++;
        if (arg0 <= 113) {
            return true;
        } else {
            return this.field1197 != null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method501(int arg0) {
        field1201++;
        if (this.field1197 == null) {
            return;
        }
        this.field1197.field1200 = this.field1200;
        this.field1200.field1197 = this.field1197;
        if (arg0 != 0) {
            method499(125, (class46) null);
        }
        this.field1197 = null;
        this.field1200 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILhi;Lha;)Lha;")
    public static final class46 method502(int arg0, class24 arg1, class46 arg2) {
        if (arg0 != -1) {
            return null;
        }
        field1190++;
        if (arg2.method342(class163.field2888, -6645) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method342(class244.field4339, -6645);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method342(class49.field835, -6645);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method342(class122.field2272, -6645);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method342(class115.field2167, arg0 ^ 0x19F4);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method342(class169.field3007, arg0 - 6644);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method342(class42.field717, arg0 - 6644);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class46 var9 = class85.field1613;
                                                    if (class31.field594 != null) {
                                                        var9 = class190.method1378(arg0 + 1, class31.field594.field2922);
                                                        try {
                                                            if (class31.field594.field2921 != null) {
                                                                byte[] var10 = ((String) class31.field594.field2921).getBytes("ISO-8859-1");
                                                                var9 = class177.method1265(0, var10.length, var10, 101);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class109.method855(arg0 + 1, new class46[] { arg2.method338(19551, var8, 0), var9, arg2.method339(var8 - -4, arg0 ^ 0xFFFFFF8F) });
                                                }
                                            }
                                            arg2 = class109.method855(0, new class46[] { arg2.method338(arg0 + 19552, var7, 0), class242.method1659(class233.method1585(4, 22046, arg1), (byte) 61), arg2.method339(var7 + 2, -97) });
                                        }
                                    }
                                    arg2 = class109.method855(0, new class46[] { arg2.method338(19551, var6, 0), class242.method1659(class233.method1585(3, 22046, arg1), (byte) 61), arg2.method339(var6 + 2, -110) });
                                }
                            }
                            arg2 = class109.method855(0, new class46[] { arg2.method338(19551, var5, 0), class242.method1659(class233.method1585(2, arg0 ^ 0xFFFFA9E1, arg1), (byte) 61), arg2.method339(var5 + 2, arg0 ^ 0x7B) });
                        }
                    }
                    arg2 = class109.method855(0, new class46[] { arg2.method338(19551, var4, 0), class242.method1659(class233.method1585(1, 22046, arg1), (byte) 61), arg2.method339(var4 + 2, -95) });
                }
            }
            arg2 = class109.method855(0, new class46[] { arg2.method338(19551, var3, 0), class242.method1659(class233.method1585(0, arg0 + 22047, arg1), (byte) 61), arg2.method339(var3 + 2, arg0 ^ 0xFFFFFFD8) });
        }
    }
}
