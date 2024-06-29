import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lpe;")
    public static class109 field403 = class141.method1120("<img=1>", 0);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lpe;")
    public static class109 field402 = class141.method1120("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 0);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lbf;")
    public static class14 field405 = new class14();

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field407 = 99;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Lpe;")
    public static class109 field406 = class141.method1120("hel", 0);

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "J")
    public static long field409 = 0L;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lna;")
    public static class91 field410;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method180(boolean arg0) {
        if (arg0) {
            field400 = 26;
        }
        field410 = null;
        field405 = null;
        field406 = null;
        field403 = null;
        field402 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Z")
    public static final boolean method181(int arg0) {
        field401++;
        long var1 = class94.method779(-20);
        int var3 = (int) (var1 - class151.field3317);
        if (var3 > 200) {
            var3 = 200;
        }
        if (arg0 != -18675) {
            method181(-75);
        }
        class101.field2110 += var3;
        class151.field3317 = var1;
        if (class23.field541 == 0 && class61.field1248 == 0 && class43.field908 == 0 && class8.field205 == 0) {
            return true;
        } else if (class15.field381 == null) {
            return false;
        } else {
            try {
                if (class101.field2110 > 30000) {
                    throw new IOException();
                }
                while (class61.field1248 < 20 && class8.field205 > 0) {
                    class152 var4 = (class152) class84.field1779.method508(arg0 ^ 0x48A6);
                    class13 var5 = new class13(4);
                    var5.method135(1, (byte) -50);
                    var5.method150(true, (int) var4.field267);
                    class15.field381.method87(arg0 ^ 0x48BD, var5.field279, 4, 0);
                    class43.field918.method503(-1, var4, var4.field267);
                    class8.field205--;
                    class61.field1248++;
                }
                while (class23.field541 < 20 && class43.field908 > 0) {
                    class152 var6 = (class152) class48.field997.method1079(127);
                    class13 var7 = new class13(4);
                    var7.method135(0, (byte) -50);
                    var7.method150(true, (int) var6.field267);
                    class15.field381.method87(-105, var7.field279, 4, 0);
                    var6.method1006((byte) -105);
                    class99.field2067.method503(-1, var6, var6.field267);
                    class23.field541++;
                    class43.field908--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class15.field381.method81((byte) -43);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class101.field2110 = 0;
                    byte var10 = 0;
                    if (class46.field968 == null) {
                        var10 = 8;
                    } else if (class7.field167 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class15.field390.field309;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class15.field381.method80((byte) -73, class15.field390.field309, var11, class15.field390.field279);
                        if (class158.field3644 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class15.field390.field279[class15.field390.field309 + var12] = (byte) class76.method598(class15.field390.field279[class15.field390.field309 + var12], class158.field3644);
                            }
                        }
                        class15.field390.field309 += var11;
                        if (var10 > class15.field390.field309) {
                            break;
                        }
                        if (class46.field968 == null) {
                            class15.field390.field309 = 0;
                            int var13 = class15.field390.method142(27467);
                            int var14 = class15.field390.method105(1375221240);
                            int var15 = class15.field390.method142(27467);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class15.field390.method112(false);
                            class152 var19 = (class152) class43.field918.method505((byte) -46, var16);
                            class8.field182 = true;
                            if (var19 == null) {
                                var19 = (class152) class99.field2067.method505((byte) -46, var16);
                                class8.field182 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            int var20 = var15 == 0 ? 5 : 9;
                            class46.field968 = var19;
                            class3.field65 = new class13(var18 + var20 + class46.field968.field3340);
                            class3.field65.method135(var15, (byte) -50);
                            class3.field65.method123(var18, 1375221240);
                            class7.field167 = 8;
                            class15.field390.field309 = 0;
                        } else if (class7.field167 == 0) {
                            if (class15.field390.field279[0] == -1) {
                                class15.field390.field309 = 0;
                                class7.field167 = 1;
                            } else {
                                class46.field968 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class7.field167;
                        int var22 = class3.field65.field279.length - class46.field968.field3340;
                        if (var21 > var22 - class3.field65.field309) {
                            var21 = var22 - class3.field65.field309;
                        }
                        if (var9 < var21) {
                            var21 = var9;
                        }
                        class15.field381.method80((byte) -63, class3.field65.field309, var21, class3.field65.field279);
                        if (class158.field3644 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class3.field65.field279[class3.field65.field309 + var23] = (byte) class76.method598(class3.field65.field279[class3.field65.field309 + var23], class158.field3644);
                            }
                        }
                        class3.field65.field309 += var21;
                        class7.field167 += var21;
                        if (class3.field65.field309 == var22) {
                            if (class46.field968.field267 == 16711935L) {
                                class124.field2752 = class3.field65;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class123 var25 = class75.field1496[var24];
                                    if (var25 != null) {
                                        class124.field2752.field309 = var24 * 8 + 5;
                                        int var26 = class124.field2752.method112(false);
                                        int var27 = class124.field2752.method112(false);
                                        var25.method993(true, var27, var26);
                                    }
                                }
                            } else {
                                class61.field1215.reset();
                                class61.field1215.update(class3.field65.field279, 0, var22);
                                int var28 = (int) class61.field1215.getValue();
                                if (class46.field968.field3351 != var28) {
                                    try {
                                        class15.field381.method83((byte) -114);
                                    } catch (Exception var30) {
                                    }
                                    class158.field3644 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class109.field2291++;
                                    class15.field381 = null;
                                    return false;
                                }
                                class92.field1992 = 0;
                                class109.field2291 = 0;
                                class46.field968.field3353.method1005(class8.field182, class3.field65.field279, (byte) -123, (int) (class46.field968.field267 & 0xFFFFL), (class46.field968.field267 & 0xFF0000L) == 16711680L);
                            }
                            class46.field968.method101((byte) 82);
                            class7.field167 = 0;
                            class46.field968 = null;
                            class3.field65 = null;
                            if (class8.field182) {
                                class61.field1248--;
                            } else {
                                class23.field541--;
                            }
                        } else {
                            if (class7.field167 != 512) {
                                break;
                            }
                            class7.field167 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class15.field381.method83((byte) -114);
                } catch (Exception var29) {
                }
                class92.field1992++;
                class15.field381 = null;
                return false;
            }
        }
    }
}
