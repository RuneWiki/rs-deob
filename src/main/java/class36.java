import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class36 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Z")
    public boolean field545 = true;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field549 = -1;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field555 = 128;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Z")
    public boolean field559 = false;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Z")
    public boolean field553 = true;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public int field554 = 16;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field546 = -1;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public int field563 = 1190717;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field564 = -1;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field560 = 8;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public int field550 = 0;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field557 = -1;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lrk;")
    public static class427 field561;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILap;)V", line = 7)
    public final void method362(byte arg0, int arg1, class289 arg2) {
        if (arg0 != 25) {
            method366((byte) 115);
        }
        field558++;
        while (true) {
            int var4 = arg2.method1861((byte) -72);
            if (var4 == 0) {
                return;
            }
            this.method364(var4, 65535, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V", line = 29)
    public final void method363(int arg0, int arg1) {
        field547++;
        if (this.field549 == -1) {
            this.field549 = this.field546;
        }
        if (arg0 != -530676504) {
            method369((byte) -93);
        }
        this.field560 = this.field560 << 8 | arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILap;)V", line = 43)
    private final void method364(int arg0, int arg1, int arg2, class289 arg3) {
        if (arg1 != 65535) {
            field552 = 69;
        }
        if (arg0 == 1) {
            this.field550 = class255.method1664(arg3.method1880((byte) 125), (byte) -111);
        } else if (arg0 == 2) {
            this.field546 = arg3.method1861((byte) -72);
        } else if (arg0 == 3) {
            this.field546 = arg3.method1853(arg1 ^ 0xFFFF004D);
            if (this.field546 == 65535) {
                this.field546 = -1;
            }
        } else if (arg0 == 5) {
            this.field553 = false;
        } else if (arg0 == 7) {
            this.field564 = class255.method1664(arg3.method1880((byte) 93), (byte) -103);
        } else if (arg0 == 8) {
            class212.field2937 = arg2;
        } else if (arg0 == 9) {
            this.field555 = arg3.method1853(85);
        } else if (arg0 == 10) {
            this.field545 = false;
        } else if (arg0 == 11) {
            this.field560 = arg3.method1861((byte) -72);
        } else if (arg0 == 12) {
            this.field559 = true;
        } else if (arg0 == 13) {
            this.field563 = arg3.method1880((byte) 115);
        } else if (arg0 == 14) {
            this.field554 = arg3.method1861((byte) -72);
        } else if (arg0 == 15) {
            this.field549 = arg3.method1853(120);
            if (this.field549 == 65535) {
                this.field549 = -1;
            }
        }
        field562++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 119)
    public static void method365(int arg0) {
        field561 = null;
        if (arg0 >= -85) {
            method366((byte) 125);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 131)
    public static final void method366(byte arg0) {
        if (arg0 >= 10) {
            class220.field3041 = new class166();
            field556++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 152)
    public static final void method367(int arg0, int arg1, int arg2) {
        class224 var3 = class118.field1653[arg0][arg1][arg2];
        if (var3 != null && var3.field3124 != null) {
            var3.field3124 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 162)
    public static final void method368(String arg0, byte arg1, boolean arg2) {
        field544++;
        if (arg0 == null) {
            return;
        }
        if (class275.field3702 >= 100) {
            class289.method1838(-754415328, class134.field1909);
            return;
        }
        String var3 = class39.method385(-1, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class275.field3702; var4++) {
            String var8 = class39.method385(-1, class268.field3607[var4]);
            if (var8 != null && var8.equals(var3)) {
                class289.method1838(-754415328, arg0 + class63.field967);
                return;
            }
            if (class147.field2259[var4] != null) {
                String var9 = class39.method385(-1, class147.field2259[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class289.method1838(-754415328, arg0 + class63.field967);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class123.field1724; var5++) {
            String var6 = class39.method385(-1, class87.field1294[var5]);
            if (var6 != null && var6.equals(var3)) {
                class289.method1838(-754415328, class296.field3987 + arg0 + class417.field5858);
                return;
            }
            if (class186.field2695[var5] != null) {
                String var7 = class39.method385(-1, class186.field2695[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class289.method1838(-754415328, class296.field3987 + arg0 + class417.field5858);
                    return;
                }
            }
        }
        if (class39.method385(-1, class95.field1379.field4577).equals(var3)) {
            class289.method1838(-754415328, class94.field1366);
            return;
        }
        class375.field5285++;
        class355.field4828.method1801(214, (byte) -81);
        class355.field4828.method1824(96, class408.method2528(-60, arg0) + 1);
        class355.field4828.method1827(0, arg0);
        if (arg1 <= -66) {
            class355.field4828.method1824(95, arg2 ? 1 : 0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 280)
    public static final void method369(byte arg0) {
        field548++;
        int var1 = -73 / ((-arg0 - 47) / 60);
        for (int var2 = 0; var2 < class384.field5399; var2++) {
            int var10002 = class160.field2383[var2]--;
            if (class160.field2383[var2] >= -10) {
                class292 var4 = class339.field4627[var2];
                if (var4 == null) {
                    var4 = class292.method1892(class332.field4515, class191.field2751[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class160.field2383[var2] += var4.method1889();
                    class339.field4627[var2] = var4;
                }
                if (class160.field2383[var2] < 0) {
                    int var11;
                    if (class286.field3840[var2] == 0) {
                        var11 = class339.field4623[var2] * class40.field626 >> 8;
                    } else {
                        int var5 = (class286.field3840[var2] & 0xFF) * 128;
                        int var6 = class286.field3840[var2] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class95.field1379.field3176;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (class286.field3840[var2] & 0xFF4F) >> 8;
                        int var9 = var8 * 128 + 64 - class95.field1379.field3167;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var9 + var7 - 128;
                        if (var5 < var10) {
                            class160.field2383[var2] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = class339.field4623[var2] * class331.field4504 * (var5 - var10) / var5 >> 8;
                    }
                    if (var11 > 0) {
                        class294 var12 = var4.method1891().method1895(class450.field6505);
                        class79 var13 = class79.method696(var12, 100, var11);
                        var13.method686(class44.field705[var2] - 1);
                        class315.field4277.method1428(var13);
                    }
                    class160.field2383[var2] = -100;
                }
            } else {
                class384.field5399--;
                for (int var3 = var2; var3 < class384.field5399; var3++) {
                    class191.field2751[var3] = class191.field2751[var3 + 1];
                    class339.field4627[var3] = class339.field4627[var3 + 1];
                    class44.field705[var3] = class44.field705[var3 + 1];
                    class160.field2383[var3] = class160.field2383[var3 + 1];
                    class286.field3840[var3] = class286.field3840[var3 + 1];
                    class339.field4623[var3] = class339.field4623[var3 + 1];
                }
                var2--;
            }
        }
        if (class166.field2473 && !class276.method1772(-25972)) {
            if (class148.field2284 != 0 && class96.field1386 != -1) {
                class138.method1086(class96.field1386, 126, class138.field1943, false, class148.field2284, 0);
            }
            class166.field2473 = false;
        } else if (class148.field2284 != 0 && class96.field1386 != -1 && !class276.method1772(-25972)) {
            class355.field4828.method1801(108, (byte) -49);
            class277.field3730++;
            class355.field4828.method1854(class96.field1386, true);
            class96.field1386 = -1;
        }
    }
}
