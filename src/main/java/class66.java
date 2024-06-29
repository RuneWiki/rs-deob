import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class66 extends class1 {

    @OriginalMember(owner = "client!la", name = "Jb", descriptor = "I")
    private int field1616 = 0;

    @OriginalMember(owner = "client!la", name = "Rb", descriptor = "Z")
    public boolean field1624 = false;

    @OriginalMember(owner = "client!la", name = "Qb", descriptor = "I")
    private int field1623 = 0;

    @OriginalMember(owner = "client!la", name = "bc", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!la", name = "Lb", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!la", name = "ac", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!la", name = "Zb", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!la", name = "Mb", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!la", name = "Gb", descriptor = "Lh;")
    private class45 field1613;

    @OriginalMember(owner = "client!la", name = "Vb", descriptor = "Lgd;")
    public static class40 field1628 = class14.method90(false, "Welt");

    @OriginalMember(owner = "client!la", name = "Ub", descriptor = "I")
    public static int field1627 = -1;

    @OriginalMember(owner = "client!la", name = "Tb", descriptor = "Lgd;")
    public static class40 field1626 = class14.method90(false, "backright1");

    @OriginalMember(owner = "client!la", name = "Wb", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!la", name = "Kb", descriptor = "Lgd;")
    public static class40 field1617 = class14.method90(false, "leuchten2:");

    @OriginalMember(owner = "client!la", name = "Pb", descriptor = "Lgd;")
    public static class40 field1622 = class14.method90(false, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!la", name = "cc", descriptor = "I")
    public static int field1635 = -1;

    @OriginalMember(owner = "client!la", name = "Ab", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!la", name = "Cb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!la", name = "Eb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!la", name = "Fb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!la", name = "Hb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!la", name = "Nb", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!la", name = "Ob", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!la", name = "Sb", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!la", name = "Xb", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!la", name = "Yb", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!la", name = "Bb", descriptor = "Lnb;")
    public static class79 field1608;

    @OriginalMember(owner = "client!la", name = "Ib", descriptor = "[[B")
    public static byte[][] field1615;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLhd;I)V", line = 9)
    public static final void method470(int arg0, boolean arg1, class46 arg2, int arg3) {
        int var4 = arg0 * arg0 + arg3 * arg3;
        field1620++;
        if (var4 > 4225 && var4 < 90000) {
            int var5 = class2.field43 + class42.field1041 & 0x7FF;
            int var6 = class97.field2284[var5];
            int var7 = class97.field2299[var5];
            int var8 = var7 * 256 / (class63.field1541 + 256);
            int var9 = var6 * 256 / (class63.field1541 + 256);
            int var10 = arg3 * var9 - arg0 * var8 >> 16;
            int var11 = arg0 * var9 + arg3 * var8 >> 16;
            double var12 = Math.atan2((double) var11, (double) var10);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            class134.field3274.method334(var14 + 98 - 10, -var15 + 63, 20, 20, 15, 15, var12, 256);
        } else {
            class80.method534(arg3, true, arg0, arg2);
        }
        if (!arg1) {
            field1617 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V", line = 62)
    public static final void method471(int arg0) {
        field1625++;
        if (arg0 == -4 && class134.field3260 != null) {
            class58 var1 = class134.field3260;
            synchronized (class134.field3260) {
                class134.field3260 = null;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z", line = 79)
    public static final boolean method472(int arg0, int arg1, int arg2) {
        field1609++;
        if (arg1 == 0 && class131.field3180 == arg0) {
            return true;
        } else if (arg1 == 1 && class1.field1 == arg0) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class53.field1349 == arg0) {
            return true;
        } else {
            return arg2 != 213;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V", line = 100)
    public final void method473(int arg0, byte arg1) {
        field1611++;
        if (this.field1624) {
            return;
        }
        this.field1616 += arg0;
        if (arg1 != 126) {
            return;
        }
        while (this.field1613.field1123[this.field1623] < this.field1616) {
            this.field1616 -= this.field1613.field1123[this.field1623];
            this.field1623++;
            if (this.field1623 >= this.field1613.field1155.length) {
                this.field1624 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIII)V", line = 533)
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1634 = arg3;
        this.field1618 = arg2;
        this.field1633 = arg5 + arg6;
        this.field1632 = arg4;
        this.field1619 = arg0;
        this.field1610 = arg1;
        int var8 = class58.method437(this.field1619, -4990).field1252;
        if (var8 == -1) {
            this.field1624 = true;
        } else {
            this.field1624 = false;
            this.field1613 = class22.method126((byte) -125, var8);
        }
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V", line = 134)
    public static final void method474(int arg0) {
        if (arg0 != -2) {
            method476(-117);
        }
        field1630++;
        class100.field2376.method292(-127);
        int var1 = class100.field2376.method298(8, 19600);
        if (var1 < class23.field548) {
            for (int var2 = var1; var2 < class23.field548; var2++) {
                class132.field3211[class98.field2322++] = class115.field2763[var2];
            }
        }
        if (class23.field548 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class23.field548 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class115.field2763[var3];
            class23 var5 = class130.field3142[var4];
            int var6 = class100.field2376.method298(1, 19600);
            if (var6 == 0) {
                class115.field2763[class23.field548++] = var4;
                var5.field829 = class10.field242;
            } else {
                int var7 = class100.field2376.method298(2, 19600);
                if (var7 == 0) {
                    class115.field2763[class23.field548++] = var4;
                    var5.field829 = class10.field242;
                    class104.field2519[class44.field1114++] = var4;
                } else if (var7 == 1) {
                    class115.field2763[class23.field548++] = var4;
                    var5.field829 = class10.field242;
                    int var8 = class100.field2376.method298(3, 19600);
                    var5.method201(false, var8, false);
                    int var9 = class100.field2376.method298(1, 19600);
                    if (var9 == 1) {
                        class104.field2519[class44.field1114++] = var4;
                    }
                } else if (var7 == 2) {
                    class115.field2763[class23.field548++] = var4;
                    var5.field829 = class10.field242;
                    int var10 = class100.field2376.method298(3, arg0 ^ 0xFFFFB36E);
                    var5.method201(true, var10, false);
                    int var11 = class100.field2376.method298(3, 19600);
                    var5.method201(true, var11, false);
                    int var12 = class100.field2376.method298(1, 19600);
                    if (var12 == 1) {
                        class104.field2519[class44.field1114++] = var4;
                    }
                } else if (var7 == 3) {
                    class132.field3211[class98.field2322++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILrc;Lra;)V", line = 244)
    public static final void method475(int arg0, int arg1, class104 arg2, class102 arg3) {
        field1614++;
        class126 var4 = new class126();
        var4.field3018 = arg2.method798((byte) -80);
        var4.field3005 = arg2.method774(-29404);
        var4.field3017 = new int[var4.field3018];
        if (arg0 != 11336) {
            method476(121);
        }
        var4.field3010 = new byte[var4.field3018][][];
        var4.field2985 = new class123[var4.field3018];
        var4.field2993 = new class123[var4.field3018];
        var4.field2992 = new int[var4.field3018];
        var4.field2991 = new int[var4.field3018];
        for (int var5 = 0; var5 < var4.field3018; var5++) {
            try {
                int var6 = arg2.method798((byte) -112);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var7 = 0;
                    String var8 = new String(arg2.method765(13101).method268(0));
                    String var9 = new String(arg2.method765(13101).method268(0));
                    if (var6 == 1) {
                        var7 = arg2.method774(-29404);
                    }
                    var4.field3017[var5] = var6;
                    var4.field2991[var5] = var7;
                    var4.field2993[var5] = arg3.method720(var9, arg0 - 11462, class54.method410(false, var8));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method765(arg0 ^ 0x1F65).method268(0));
                    String var11 = new String(arg2.method765(13101).method268(0));
                    int var12 = arg2.method798((byte) -77);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method765(class70.method486(arg0, 8037)).method268(0));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method774(arg0 - 40740);
                            var15[var16] = new byte[var17];
                            arg2.method791(var15[var16], 0, var17, false);
                        }
                    }
                    var4.field3017[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class54.method410(false, var13[var19]);
                    }
                    var4.field2985[var5] = arg3.method716(var18, true, class54.method410(false, var10), var11);
                    var4.field3010[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2992[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2992[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2992[var5] = -3;
            } catch (Exception var23) {
                var4.field2992[var5] = -4;
            } catch (Throwable var24) {
                var4.field2992[var5] = -5;
            }
        }
        class98.field2323.method589(var4, arg0 ^ 0x2C12);
    }

    @OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V", line = 357)
    public static final void method476(int arg0) {
        field1621++;
        class86.field1933.method232(false);
        for (int var1 = 0; var1 < 32; var1++) {
            class16.field422[var1] = 0L;
        }
        if (arg0 != -2) {
            field1627 = 120;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class106.field2573[var2] = 0L;
        }
        class94.field2168 = 0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Lqb;", line = 396)
    public final class97 method2(byte arg0) {
        class49 var2 = class58.method437(this.field1619, -4990);
        class97 var3;
        if (this.field1624) {
            var3 = var2.method381((byte) 117, -1);
        } else {
            var3 = var2.method381((byte) -112, this.field1623);
        }
        if (arg0 >= -110) {
            return null;
        } else {
            field1607++;
            return var3 == null ? null : var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIII)V", line = 434)
    public static final void method477(boolean arg0, int arg1, int arg2, int arg3) {
        field1612++;
        if (arg1 == 1) {
            class92.field2094.method290((byte) 0, 250);
            class92.field2094.method761(arg3, -23644);
            class76.field1740++;
            class92.field2094.method768(arg2, 105);
        }
        if (arg1 == 2) {
            class92.field2094.method290((byte) 0, 203);
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, -33);
            class12.field308++;
        }
        if (arg1 == 3) {
            class92.field2094.method290((byte) 0, 143);
            class18.field443++;
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, 107);
        }
        if (arg1 == 4) {
            class98.field2321++;
            class92.field2094.method290((byte) 0, 125);
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, -109);
        }
        if (arg1 == 5) {
            class92.field2094.method290((byte) 0, 26);
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, -75);
            class42.field1063++;
        }
        if (arg1 == 6) {
            class132.field3194++;
            class92.field2094.method290((byte) 0, 10);
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, -60);
        }
        if (arg1 == 7) {
            class92.field2094.method290((byte) 0, 60);
            class2.field31++;
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, 98);
        }
        if (arg1 == 8) {
            class92.field2085++;
            class92.field2094.method290((byte) 0, 7);
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, 107);
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 9) {
            class18.field439++;
            class92.field2094.method290((byte) 0, 213);
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, 126);
        }
        if (arg1 == 10) {
            class92.field2094.method290((byte) 0, 6);
            class45.field1135++;
            class92.field2094.method761(arg3, -23644);
            class92.field2094.method768(arg2, 109);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLgd;)Z", line = 559)
    public static final boolean method478(boolean arg0, class40 arg1) {
        field1631++;
        if (!arg0) {
            method476(94);
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class7.field181; var2++) {
            if (arg1.method260(class7.field178[var2], (byte) 109)) {
                return true;
            }
        }
        return arg1.method260(class13.field332.field2210, (byte) 109);
    }

    @OriginalMember(owner = "client!la", name = "j", descriptor = "(I)V", line = 593)
    public static void method479(int arg0) {
        field1617 = null;
        field1628 = null;
        field1608 = null;
        field1615 = null;
        field1626 = null;
        field1622 = null;
        if (arg0 != 0) {
            field1627 = 27;
        }
    }
}
