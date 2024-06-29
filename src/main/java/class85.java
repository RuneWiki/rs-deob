import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class85 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ls;")
    public static class162 field1699;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lf;")
    public static class47 field1698;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class8 var5 = (class8) class178.field3372.method1109((byte) -98); var5 != null; var5 = (class8) class178.field3372.method1115((byte) -102)) {
            if (var5.field160 != -1 || var5.field144 != null) {
                int var6 = 0;
                if (arg3 > var5.field151) {
                    var6 += arg3 - var5.field151;
                } else if (var5.field166 > arg3) {
                    var6 += var5.field166 - arg3;
                }
                if (arg4 > var5.field146) {
                    var6 += arg4 - var5.field146;
                } else if (arg4 < var5.field149) {
                    var6 += var5.field149 - arg4;
                }
                if (var5.field164 < var6 - 64 || class57.field1115 == 0 || var5.field158 != arg1) {
                    if (var5.field145 != null) {
                        class11.field206.method1010(var5.field145);
                        var5.field145 = null;
                    }
                    if (var5.field140 != null) {
                        class11.field206.method1010(var5.field140);
                        var5.field140 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field164 - var6) * class57.field1115 / var5.field164;
                    if (var5.field145 != null) {
                        var5.field145.method308(var7);
                    } else if (var5.field160 >= 0) {
                        class152 var8 = class152.method1030(class142.field2764, var5.field160, 0);
                        if (var8 != null) {
                            class13 var9 = var8.method1029().method78(class140.field2735);
                            class44 var10 = class44.method328(var9, 100, var7);
                            var10.method329(-1);
                            class11.field206.method1012(var10);
                            var5.field145 = var10;
                        }
                    }
                    if (var5.field140 != null) {
                        var5.field140.method308(var7);
                        if (!var5.field140.method916(73)) {
                            var5.field140 = null;
                        }
                    } else if (var5.field144 != null && (var5.field167 -= arg2) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field144.length);
                        class152 var12 = class152.method1030(class142.field2764, var5.field144[var11], 0);
                        if (var12 != null) {
                            class13 var13 = var12.method1029().method78(class140.field2735);
                            class44 var14 = class44.method328(var13, 100, var7);
                            var14.method329(0);
                            class11.field206.method1012(var14);
                            var5.field167 = (int) (Math.random() * (double) (var5.field162 - var5.field148)) + var5.field148;
                            var5.field140 = var14;
                        }
                    }
                }
            }
        }
        if (arg0 < 12) {
            method681(-67, 113, -38, 9, -126);
        }
        field1700++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method682(byte arg0) {
        field1701++;
        class125 var1 = class4.field80;
        synchronized (class4.field80) {
            class60.field1238 = class175.field3313;
            if (class62.field1284 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class195.field3859[var2] = false;
                }
                class62.field1284 = class138.field2692;
            } else {
                while (class62.field1284 != class138.field2692) {
                    int var3 = class151.field2936[class138.field2692];
                    class138.field2692 = class138.field2692 + 1 & 0x7F;
                    if (var3 < 0) {
                        class195.field3859[~var3] = false;
                    } else {
                        class195.field3859[var3] = true;
                    }
                }
            }
            class175.field3313 = class32.field596;
            int var4 = 52 % ((arg0 - 12) / 57);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static void method683(byte arg0) {
        if (arg0 == 94) {
            field1699 = null;
            field1698 = null;
        }
    }
}
