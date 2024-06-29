import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class320 extends class460 implements Runnable {

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public int field4628 = -1;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
    private boolean field4631 = true;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lae;")
    private class213 field4629;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "Lea;")
    public static class474 field4633 = new class474("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "[Z")
    public static boolean[] field4635 = new boolean[100];

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Lqm;")
    public static class126 field4636 = null;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 6)
    public final void method2084(int arg0) {
        field4627++;
        this.field4631 = false;
        if (arg0 != 3156) {
            this.field4629 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Z", line = 17)
    public static final boolean method2085(int arg0) {
        field4632++;
        Hashtable var1 = new Hashtable();
        if (arg0 != 0) {
            field4635 = null;
        }
        Enumeration var2 = class304.field4472.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class304.field4472.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class304.field4472.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class463.field6891.get(var9);
                        Class var11 = (Class) class304.field4472.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class304.field4472 = var1;
        return class304.field4472.isEmpty();
    }

    @OriginalMember(owner = "client!ln", name = "run", descriptor = "()V", line = 115)
    public final void run() {
        field4634++;
        while (this.field4631) {
            this.field4629.method1406(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 129)
    public static void method2086(int arg0) {
        field4633 = null;
        field4636 = null;
        int var1 = -60 / ((41 - arg0) / 46);
        field4635 = null;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 143)
    public static final void method2087(int arg0) {
        if (class260.field3703 > 1) {
            class367.field5553 = class240.field3406;
            class260.field3703--;
        }
        field4625++;
        if (class248.field3523) {
            class248.field3523 = false;
            class195.method1245(-31856);
            return;
        }
        if (!class600.field8764) {
            class492.method2953((byte) -38);
        }
        for (int var1 = 0; var1 < 100 && class58.method420(4667); var1++) {
        }
        if (class133.field1673 != 9) {
            return;
        }
        class112.method693(class468.field6960, class614.field8941.method487((byte) 33), 109);
        if (class292.field4055 == null) {
            if (class612.field8904 <= class84.method550((byte) -99)) {
                class292.field4055 = class635.field9129.method543(class461.field6876.field1598, -10585);
            }
        } else if (class292.field4055.field1563 != -1) {
            class308.method2044(class526.field7627, -7434);
            class468.field6960.method1229(class292.field4055.field1563, 30364);
            class292.field4055 = null;
            class612.field8904 = class84.method550((byte) -127) + 30000L;
        }
        class458 var2 = (class458) class187.field2310.method719(false);
        if (var2 != null || class84.method550((byte) -99) - 2000L > class621.field8994) {
            boolean var3 = false;
            int var4 = class468.field6960.field2610;
            for (class458 var5 = (class458) class455.field6821.method719(false); var5 != null && class468.field6960.field2610 - var4 < 240; var5 = (class458) class455.field6821.method716(14)) {
                var5.method2108(true);
                int var6 = var5.method230((byte) 54);
                if (var6 < -1) {
                    var6 = -1;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method227(-4915);
                if (var7 < -1) {
                    var7 = -1;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                if (class601.field8775 != var7 || class526.field7638 != var6) {
                    if (!var3) {
                        class285.field3941++;
                        class308.method2044(class290.field4009, -7434);
                        class468.field6960.method1205((byte) -69, 0);
                        var3 = true;
                        var4 = class468.field6960.field2610;
                    }
                    int var8 = var7 - class601.field8775;
                    class601.field8775 = var7;
                    int var9 = var6 - class526.field7638;
                    class526.field7638 = var6;
                    int var10 = (int) ((var5.method229(-71) - class621.field8994) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var8 += 32;
                        var9 += 32;
                        class468.field6960.method1229((var10 << 12) + ((var8 << 6) + var9), 30364);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var8 += 128;
                        class468.field6960.method1205((byte) -69, var10 + 128);
                        var9 += 128;
                        class468.field6960.method1229((var8 << 8) + var9, 30364);
                    } else if (var10 < 32) {
                        class468.field6960.method1205((byte) -69, var10 + 192);
                        if (var7 == 1 || var6 == -1) {
                            class468.field6960.method1223(true, Integer.MIN_VALUE);
                        } else {
                            class468.field6960.method1223(true, var7 | var6 << 16);
                        }
                    } else {
                        class468.field6960.method1229(var10 + 57344, 30364);
                        if (var7 == 1 || var6 == -1) {
                            class468.field6960.method1223(true, Integer.MIN_VALUE);
                        } else {
                            class468.field6960.method1223(true, var6 << 16 | var7);
                        }
                    }
                    class621.field8994 = var5.method229(-95);
                }
            }
            if (var3) {
                class468.field6960.method1188(class468.field6960.field2610 - var4, -97);
            }
        }
        if (var2 != null) {
            long var11 = (var2.method229(-125) - class227.field3183) / 50L;
            class227.field3183 = var2.method229(-111);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = var2.method230((byte) 54);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = var2.method227(-4915);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var2.method228(-12152) == 2) {
                var15 = 1;
            }
            class564.field8031++;
            class308.method2044(class151.field1858, -7434);
            int var16 = (int) var11;
            class468.field6960.method1223(true, var14 | var13 << 16);
            class468.field6960.method1229(var15 << 15 | var16, 30364);
        }
        if (class1.field4 > 0) {
            class365.field5522++;
            class308.method2044(class249.field3542, -7434);
            class468.field6960.method1205((byte) -69, class1.field4 * 3);
            for (int var17 = 0; var17 < class1.field4; var17++) {
                class478 var18 = class591.field8487[var17];
                long var19 = (var18.method2205((byte) -57) - class276.field3854) / 50L;
                if (var19 > 65535L) {
                    var19 = 65535L;
                }
                class276.field3854 = var18.method2205((byte) -120);
                class468.field6960.method1205((byte) -69, var18.method2198((byte) 123));
                class468.field6960.method1229((int) var19, 30364);
            }
        }
        if (class644.field9282 > 0) {
            class644.field9282--;
        }
        if (class421.field6304 && class644.field9282 <= 0) {
            class644.field9282 = 20;
            class421.field6304 = false;
            class401.field6067++;
            class308.method2044(class453.field6776, -7434);
            class468.field6960.method1235((int) class388.field5967 >> 3, (byte) 11);
            class468.field6960.method1229((int) class639.field9187 >> 3, 30364);
        }
        if (class44.field466 && !class268.field3767) {
            class149.field1836++;
            class268.field3767 = true;
            class308.method2044(class164.field2011, -7434);
            class468.field6960.method1205((byte) -69, 1);
        }
        if (!class44.field466 && class268.field3767) {
            class149.field1836++;
            class268.field3767 = false;
            class308.method2044(class164.field2011, -7434);
            class468.field6960.method1205((byte) -69, 0);
        }
        if (!class90.field1036) {
            class34.field385++;
            class308.method2044(class139.field1723, -7434);
            class468.field6960.method1205((byte) -69, 0);
            int var21 = class468.field6960.field2610;
            class194 var22 = new class194(class301.method2001(-32586));
            class595.field8694.method2736(20711, var22);
            class468.field6960.method1198(255, var22.field2610, var22.field2622, 0);
            class468.field6960.method1188(class468.field6960.field2610 - var21, 102);
            class90.field1036 = true;
        }
        if (class431.field6408 != null) {
            if (class236.field3384 == 2) {
                class246.method1631(-123);
            } else if (class236.field3384 == 3) {
                class59.method421(512);
            }
        }
        if (class524.field7615) {
            class524.field7615 = false;
        } else {
            class65.field719 /= 2.0F;
        }
        if (class437.field6502) {
            class437.field6502 = false;
        } else {
            class99.field1159 /= 2.0F;
        }
        class126.method775(-26515);
        if (class133.field1673 != 9) {
            return;
        }
        class110.method683((byte) -114);
        class499.method2988(23776);
        class112.method691(1);
        class118.method731(0);
        class52.field547++;
        if (class52.field547 > 750) {
            class195.method1245(-31856);
            return;
        }
        class656.method3750(-31900);
        class492.method2952(0);
        class598.method3479(-125);
        for (int var23 = class23.field243.method3261(0, true); var23 != -1; var23 = class23.field243.method3261(0, false)) {
            class304.method2025(15, var23);
            class426.field6338[class643.method3659(31, class224.field3160++)] = var23;
        }
        for (class467 var24 = class517.method3066((byte) -40); var24 != null; var24 = class517.method3066((byte) -40)) {
            int var25 = var24.method2857((byte) 23);
            int var26 = var24.method2855(-18737);
            if (var25 == 1) {
                class285.field3942[var26] = var24.field6926;
                class95.field1125 |= class144.field1760[var26];
                class484.field7090[class643.method3659(31, class290.field4017++)] = var26;
            } else if (var25 == 2) {
                class603.field8815[var26] = var24.field6933;
                class602.field8783[class643.method3659(class46.field499++, 31)] = var26;
            } else if (var25 == 3) {
                class593 var27 = class259.method1728(40, var26);
                if (!var24.field6933.equals(var27.field8548)) {
                    var27.field8548 = var24.field6933;
                    class33.method187(var27, (byte) 113);
                }
            } else if (var25 == 4) {
                class593 var45 = class259.method1728(40, var26);
                int var46 = var24.field6926;
                int var47 = var24.field6930;
                int var48 = var24.field6925;
                if (var45.field8577 != var46 || var45.field8555 != var47 || var45.field8641 != var48) {
                    var45.field8555 = var47;
                    var45.field8641 = var48;
                    var45.field8577 = var46;
                    class33.method187(var45, (byte) 123);
                }
            } else if (var25 == 5) {
                class593 var44 = class259.method1728(40, var26);
                if (var24.field6926 != var44.field8558 || var24.field6926 == -1) {
                    var44.field8558 = var24.field6926;
                    var44.field8524 = 0;
                    var44.field8571 = 1;
                    var44.field8631 = 0;
                    class33.method187(var44, (byte) 124);
                }
            } else if (var25 == 6) {
                int var38 = var24.field6926;
                int var39 = var38 >> 10 & 0x1F;
                int var40 = (var38 & 0x3E8) >> 5;
                int var41 = var38 & 0x1F;
                int var42 = (var40 << 11) + (var39 << 19) + (var41 << 3);
                class593 var43 = class259.method1728(40, var26);
                if (var43.field8617 != var42) {
                    var43.field8617 = var42;
                    class33.method187(var43, (byte) -53);
                }
            } else if (var25 == 7) {
                class593 var36 = class259.method1728(40, var26);
                boolean var37 = var24.field6926 == 1;
                if (var37 != var36.field8561) {
                    var36.field8561 = var37;
                    class33.method187(var36, (byte) 97);
                }
            } else if (var25 == 8) {
                class593 var35 = class259.method1728(40, var26);
                if (var24.field6926 != var35.field8618 || var24.field6930 != var35.field8584 || var24.field6925 != var35.field8566) {
                    var35.field8584 = var24.field6930;
                    var35.field8566 = var24.field6925;
                    var35.field8618 = var24.field6926;
                    if (var35.field8601 != -1) {
                        if (var35.field8659 > 0) {
                            var35.field8566 = var35.field8566 * 32 / var35.field8659;
                        } else if (var35.field8588 > 0) {
                            var35.field8566 = var35.field8566 * 32 / var35.field8588;
                        }
                    }
                    class33.method187(var35, (byte) 103);
                }
            } else if (var25 == 9) {
                class593 var34 = class259.method1728(40, var26);
                if (var24.field6926 != var34.field8601 || var24.field6930 != var34.field8624) {
                    var34.field8624 = var24.field6930;
                    var34.field8601 = var24.field6926;
                    class33.method187(var34, (byte) 125);
                }
            } else if (var25 == 10) {
                class593 var33 = class259.method1728(40, var26);
                if (var24.field6926 != var33.field8600 || var24.field6930 != var33.field8661 || var24.field6925 != var33.field8630) {
                    var33.field8661 = var24.field6930;
                    var33.field8600 = var24.field6926;
                    var33.field8630 = var24.field6925;
                    class33.method187(var33, (byte) -96);
                }
            } else if (var25 == 11) {
                class593 var28 = class259.method1728(40, var26);
                var28.field8582 = 0;
                var28.field8562 = 0;
                var28.field8586 = var28.field8583 = var24.field6926;
                var28.field8637 = var28.field8619 = var24.field6930;
                class33.method187(var28, (byte) 123);
            } else if (var25 == 12) {
                class593 var29 = class259.method1728(40, var26);
                int var30 = var24.field6926;
                if (var29 != null && var29.field8507 == 0) {
                    if (var30 > var29.field8549 - var29.field8518) {
                        var30 = var29.field8549 - var29.field8518;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field8662 != var30) {
                        var29.field8662 = var30;
                        class33.method187(var29, (byte) 104);
                    }
                }
            } else if (var25 == 14) {
                class593 var32 = class259.method1728(40, var26);
                var32.field8665 = var24.field6926;
            } else if (var25 == 15) {
                class82.field925 = var24.field6926;
                class50.field531 = var24.field6930;
                class87.field992 = true;
            } else if (var25 == 16) {
                class593 var31 = class259.method1728(40, var26);
                var31.field8595 = var24.field6926;
            }
        }
        class529.field7661++;
        if (class30.field343 != 0) {
            class613.field8923 += 20;
            if (class613.field8923 >= 400) {
                class30.field343 = 0;
            }
        }
        if (class561.field8013 != null) {
            class647.field9370++;
            if (class647.field9370 >= 15) {
                class33.method187(class561.field8013, (byte) -77);
                class561.field8013 = null;
            }
        }
        class273.field3814 = null;
        class384.field5788 = false;
        class50.field537 = null;
        class34.field386 = false;
        class573.method3333(-1, (byte) -102, null, -1);
        class619.method3561(null, 4096, -1, -1);
        if (!class169.field2063) {
            class595.field8697 = -1;
        }
        class650.method3715((byte) -107);
        int var49 = 98 / ((23 - arg0) / 34);
        class240.field3406++;
        if (class274.field3843) {
            class3.field17++;
            class308.method2044(class429.field6361, -7434);
            class468.field6960.method1223(true, class301.field4425 << 14 | class126.field1562 << 28 | class67.field734);
            class274.field3843 = false;
        }
        while (true) {
            class86 var50;
            class593 var51;
            class593 var52;
            do {
                var50 = (class86) class94.field1106.method714(true);
                if (var50 == null) {
                    while (true) {
                        class86 var53;
                        class593 var54;
                        class593 var55;
                        do {
                            var53 = (class86) class566.field8109.method714(true);
                            if (var53 == null) {
                                while (true) {
                                    class86 var56;
                                    class593 var57;
                                    class593 var58;
                                    do {
                                        var56 = (class86) class463.field6892.method714(true);
                                        if (var56 == null) {
                                            if (class50.field537 == null) {
                                                class514.field7505 = 0;
                                            }
                                            if (class39.field425 != null) {
                                                class168.method966(2);
                                            }
                                            if (class315.field4597 > 0 && class280.field3915.method284(54, 82) && class280.field3915.method284(61, 81) && class90.field1039 != 0) {
                                                int var59 = class439.field6548.field1757 - class90.field1039;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class212.method1386(var59, 74, class439.field6548.field2515[0] + class287.field3980, class439.field6548.field2524[0] + class250.field3549);
                                            }
                                            class572.method3329(112);
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class561.field8014[var60]++;
                                            }
                                            if (class95.field1125 && class145.field1789 < (class84.method550((byte) -107) - 60000L)) {
                                                class110.method681((byte) -17);
                                            }
                                            for (class541 var61 = (class541) class201.field2689.method3297((byte) 107); var61 != null; var61 = (class541) class201.field2689.method3296((byte) -127)) {
                                                if (((long) var61.field7757) < (class84.method550((byte) -108) / 1000L - 5L)) {
                                                    if (var61.field7755 > 0) {
                                                        class117.method726("", -1, 0, var61.field7753 + class651.field9390.method2902(class35.field396, -20139), "", 5, "");
                                                    }
                                                    if (var61.field7755 == 0) {
                                                        class117.method726("", -1, 0, var61.field7753 + class567.field8143.method2902(class35.field396, -20139), "", 5, "");
                                                    }
                                                    var61.method3488(false);
                                                }
                                            }
                                            class342.field4874++;
                                            if (class342.field4874 > 500) {
                                                class342.field4874 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x1) == 1) {
                                                    class92.field1083 += class119.field1491;
                                                }
                                                if ((var62 & 0x4) == 4) {
                                                    class51.field543 += class639.field9192;
                                                }
                                                if ((var62 & 0x2) == 2) {
                                                    class657.field9493 += class639.field9189;
                                                }
                                            }
                                            if (class92.field1083 < -50) {
                                                class119.field1491 = 2;
                                            }
                                            if (class92.field1083 > 50) {
                                                class119.field1491 = -2;
                                            }
                                            if (class657.field9493 < -55) {
                                                class639.field9189 = 2;
                                            }
                                            if (class657.field9493 > 55) {
                                                class639.field9189 = -2;
                                            }
                                            if (class51.field543 < -40) {
                                                class639.field9192 = 1;
                                            }
                                            class571.field8232++;
                                            if (class51.field543 > 40) {
                                                class639.field9192 = -1;
                                            }
                                            if (class571.field8232 > 500) {
                                                class571.field8232 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class17.field173 += class495.field7236;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class34.field389 += class164.field2014;
                                                }
                                            }
                                            if (class17.field173 < -60) {
                                                class495.field7236 = 2;
                                            }
                                            if (class17.field173 > 60) {
                                                class495.field7236 = -2;
                                            }
                                            if (class34.field389 < -20) {
                                                class164.field2014 = 1;
                                            }
                                            if (class34.field389 > 10) {
                                                class164.field2014 = -1;
                                            }
                                            class290.field4012++;
                                            if (class290.field4012 > 50) {
                                                class308.method2044(class193.field2552, -7434);
                                                class147.field1807++;
                                            }
                                            if (class228.field3195) {
                                                class628.method3598(-1);
                                                class228.field3195 = false;
                                            }
                                            try {
                                                if (class170.field2077 != null && class468.field6960.field2610 > 0) {
                                                    class576.field8330 += class468.field6960.field2610;
                                                    class170.field2077.method1840(0, class468.field6960.field2610, class468.field6960.field2622, 0);
                                                    class290.field4012 = 0;
                                                    class468.field6960.field2610 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var64) {
                                                class195.method1245(-31856);
                                                return;
                                            }
                                        }
                                        var57 = var56.field976;
                                        if (var57.field8593 < 0) {
                                            break;
                                        }
                                        var58 = class259.method1728(40, var57.field8533);
                                    } while (var58 == null || var58.field8512 == null || var58.field8512.length <= var57.field8593 || var58.field8512[var57.field8593] != var57);
                                    class604.method3516(var56);
                                }
                            }
                            var54 = var53.field976;
                            if (var54.field8593 < 0) {
                                break;
                            }
                            var55 = class259.method1728(40, var54.field8533);
                        } while (var55 == null || var55.field8512 == null || var55.field8512.length <= var54.field8593 || var55.field8512[var54.field8593] != var54);
                        class604.method3516(var53);
                    }
                }
                var51 = var50.field976;
                if (var51.field8593 < 0) {
                    break;
                }
                var52 = class259.method1728(40, var51.field8533);
            } while (var52 == null || var52.field8512 == null || var52.field8512.length <= var51.field8593 || var52.field8512[var51.field8593] != var51);
            class604.method3516(var50);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lae;)V", line = 1033)
    public class320(class213 arg0) {
        this.field4629 = arg0;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V", line = 988)
    public static final void method2088(int arg0) {
        field4630++;
        if (class227.field3184 != null) {
            class227.field3184.method166(50);
        }
        if (arg0 != -1) {
            field4633 = null;
        }
        if (class321.field4651 != null) {
            class321.field4651.method166(50);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)I", line = 1005)
    public static final int method2089(int arg0, int arg1, int arg2) {
        field4626++;
        if (arg1 < 6) {
            field4635 = null;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 1022)
    public final void method2090(boolean arg0) {
        field4623++;
        (new Thread(this, "a")).start();
        if (!arg0) {
            field4636 = null;
        }
    }
}
