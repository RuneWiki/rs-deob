import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class284 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field5071 = 0;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[Z")
    public static boolean[] field5075 = new boolean[112];

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lud;")
    private static class279 field5077 = class130.method1024("Loaded textures", 255);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lud;")
    public static class279 field5068 = field5077;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lig;")
    public static class175 field5072;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2034(byte arg0) {
        int var1 = class287.field5106.method1628(-72, 8);
        field5078++;
        if (class103.field1931 > var1) {
            for (int var2 = var1; var2 < class103.field1931; var2++) {
                class73.field1433[class236.field4108++] = class252.field4503[var2];
            }
        }
        if (class103.field1931 < var1) {
            throw new RuntimeException("gppov1");
        }
        class103.field1931 = 0;
        int var3 = 116 / ((arg0 - 32) / 36);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class252.field4503[var4];
            class239 var6 = class96.field1780[var5];
            int var7 = class287.field5106.method1628(20, 1);
            if (var7 == 0) {
                class252.field4503[class103.field1931++] = var5;
                var6.field84 = class8.field279;
            } else {
                int var8 = class287.field5106.method1628(114, 2);
                if (var8 == 0) {
                    class252.field4503[class103.field1931++] = var5;
                    var6.field84 = class8.field279;
                    class45.field945[class174.field3139++] = var5;
                } else if (var8 == 1) {
                    class252.field4503[class103.field1931++] = var5;
                    var6.field84 = class8.field279;
                    int var13 = class287.field5106.method1628(59, 3);
                    var6.method16(1, var13, 59);
                    int var14 = class287.field5106.method1628(120, 1);
                    if (var14 == 1) {
                        class45.field945[class174.field3139++] = var5;
                    }
                } else if (var8 == 2) {
                    class252.field4503[class103.field1931++] = var5;
                    var6.field84 = class8.field279;
                    if (class287.field5106.method1628(-94, 1) == 1) {
                        int var9 = class287.field5106.method1628(49, 3);
                        var6.method16(2, var9, 125);
                        int var10 = class287.field5106.method1628(-74, 3);
                        var6.method16(2, var10, 120);
                    } else {
                        int var11 = class287.field5106.method1628(-78, 3);
                        var6.method16(0, var11, 63);
                    }
                    int var12 = class287.field5106.method1628(-117, 1);
                    if (var12 == 1) {
                        class45.field945[class174.field3139++] = var5;
                    }
                } else if (var8 == 3) {
                    class73.field1433[class236.field4108++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIILsf;IJIIII)Z", line = 118)
    public static final boolean method2035(int arg0, int arg1, int arg2, int arg3, class108 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class78.method655(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 128)
    public static final void method2036(int arg0) {
        field5070++;
        class50.method426(class247.field4388, false);
        class55.field1198++;
        if (class210.field3701 && class251.field4486) {
            int var1 = class51.field1056;
            int var2 = var1 - class209.field3678;
            int var3 = class130.field2363;
            if (var2 < class264.field4710) {
                var2 = class264.field4710;
            }
            int var4 = var3 - class28.field673;
            if (class155.field2806 > var4) {
                var4 = class155.field2806;
            }
            if (var4 + class247.field4388.field220 > class155.field2806 + class307.field5460.field220) {
                var4 = class155.field2806 + class307.field5460.field220 - class247.field4388.field220;
            }
            int var5 = class247.field4388.field292;
            int var6 = var4 - class252.field4493;
            int var7 = class307.field5460.field212 + var4 - class155.field2806;
            if (class264.field4710 + class307.field5460.field297 < var2 - -class247.field4388.field297) {
                var2 = class264.field4710 + class307.field5460.field297 - class247.field4388.field297;
            }
            int var8 = var2 + class307.field5460.field243 - class264.field4710;
            int var9 = var2 - class217.field3833;
            if (class247.field4388.field311 < class55.field1198 && (var5 < var6 || var6 < (-var5) || var5 < var9 || var9 < -var5)) {
                class194.field3490 = true;
            }
            if (arg0 != -7194) {
                method2037(16);
            }
            if (class247.field4388.field309 != null && class194.field3490) {
                class23 var10 = new class23();
                var10.field596 = class247.field4388;
                var10.field600 = var8;
                var10.field608 = class247.field4388.field309;
                var10.field604 = var7;
                class279.method2017(0, var10);
            }
            if (class34.field778 == 0) {
                if (class194.field3490) {
                    if (class247.field4388.field330 != null) {
                        class23 var11 = new class23();
                        var11.field608 = class247.field4388.field330;
                        var11.field596 = class247.field4388;
                        var11.field604 = var7;
                        var11.field603 = class245.field4347;
                        var11.field600 = var8;
                        class279.method2017(0, var11);
                    }
                    if (class245.field4347 != null && client.method1799(class247.field4388) != null) {
                        class314.field5534.method1634(128, arg0 + 7194);
                        class314.field5534.method485(class247.field4388.field261, arg0 ^ 0xFFFFE3C6);
                        class314.field5534.method445((byte) 72, class247.field4388.field299);
                        class260.field4630++;
                        class314.field5534.method497(class245.field4347.field299, arg0 ^ 0x1C68);
                        class314.field5534.method505(class245.field4347.field261, (byte) 7);
                    }
                } else if ((class181.field3314 == 1 || class171.method1337(true, class194.field3488 - 1)) && class194.field3488 > 2) {
                    class198.method1471(-2);
                } else if (class194.field3488 > 0) {
                    class52.method436(0);
                }
                class247.field4388 = null;
            }
        } else if (class55.field1198 > 1) {
            class247.field4388 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)[Lom;", line = 275)
    public static final class70[] method2037(int arg0) {
        field5074++;
        if (arg0 != 1) {
            field5076 = 113;
        }
        class70[] var1 = new class70[class244.field4329];
        for (int var2 = 0; var2 < class244.field4329; var2++) {
            int var3 = class115.field2097[var2] * class1.field92[var2];
            byte[] var4 = class113.field2080[var2];
            if (class290.field5168[var2]) {
                byte[] var7 = class322.field5622[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class301.method2139(class217.field3839[class52.method442(255, var4[var9])], class52.method442(255, var7[var9]) << 24);
                }
                if (class97.field1824) {
                    var1[var2] = new class227(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var8);
                } else {
                    var1[var2] = new class316(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class217.field3839[class52.method442(var4[var6], 255)];
                }
                if (class97.field1824) {
                    var1[var2] = new class203(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var5);
                } else {
                    var1[var2] = new class66(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var5);
                }
            }
        }
        class162.method1278(false);
        return var1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 338)
    public static void method2038(boolean arg0) {
        if (!arg0) {
            method2036(-27);
        }
        field5075 = null;
        field5068 = null;
        field5077 = null;
        field5072 = null;
    }
}
