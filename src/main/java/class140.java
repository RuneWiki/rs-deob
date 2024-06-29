import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class140 extends class179 {

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1622 = new CRC32();

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Z")
    public static boolean field1629 = false;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[Lea;")
    public class99[] field1627;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "[[B")
    private byte[][] field1626;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "[[Z")
    public static boolean[][] field1628;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method894(int arg0, int arg1) {
        if (arg1 == 0) {
            field1625++;
            return this.field1627[arg0].field1167;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 19)
    public static void method895(int arg0) {
        field1622 = null;
        if (arg0 != 65280) {
            field1628 = null;
        }
        field1628 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwo;ILtn;Lwo;)V", line = 33)
    public static final void method896(class285 arg0, int arg1, class371 arg2, class285 arg3) {
        class167.field1955 = arg2;
        class49.field570 = arg0;
        field1620++;
        if (arg1 != 1) {
            return;
        }
        class258.field3326 = arg3;
        if (class258.field3326 != null) {
            class314.field4238 = class258.field3326.method1821(61, 1);
        }
        if (class49.field570 != null) {
            class272.field3507 = class49.field570.method1821(-126, 1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Z", line = 57)
    public final boolean method897(byte arg0) {
        field1630++;
        if (this.field1627 != null) {
            return true;
        }
        if (this.field1626 == null) {
            if (!class367.field5007.method1813(0, this.field1623)) {
                return false;
            }
            int[] var2 = class367.field5007.method1810(121, this.field1623);
            this.field1626 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1626[var3] = class367.field5007.method1794(class262.method1658(arg0, 5784), this.field1623, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1626.length; var5++) {
            byte[] var14 = this.field1626[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class373.field5058.method1797(0, var15);
        }
        if (!var4) {
            return false;
        } else if (arg0 == 124) {
            class270 var6 = new class270();
            int var7 = class367.field5007.method1821(92, this.field1623);
            this.field1627 = new class99[var7];
            int[] var8 = class367.field5007.method1810(83, this.field1623);
            for (int var9 = 0; var9 < var8.length; var9++) {
                byte[] var10 = this.field1626[var9];
                int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
                class250 var12 = null;
                for (class250 var13 = (class250) var6.method1690((byte) -116); var13 != null; var13 = (class250) var6.method1699((byte) 93)) {
                    if (var13.field3291 == var11) {
                        var12 = var13;
                        break;
                    }
                }
                if (var12 == null) {
                    var12 = new class250(var11, class373.field5058.method1805(var11, true));
                    var6.method1696(false, var12);
                }
                this.field1627[var8[var9]] = new class99(var10, var12);
            }
            this.field1626 = null;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;IIZI)V", line = 152)
    public static final void method898(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1621++;
        class303 var7 = new class303();
        var7.field4073 = arg4;
        var7.field4072 = arg3;
        if (arg5) {
            field1628 = null;
        }
        var7.field4066 = class106.field1273 + arg0;
        var7.field4074 = arg6;
        var7.field4067 = arg1;
        var7.field4069 = arg2;
        class80.field974.method1833(var7, 10209);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lbg;ILnh;I)V", line = 173)
    public static final void method899(class242 arg0, int arg1, class441 arg2, int arg3) {
        if (arg3 != -32716) {
            return;
        }
        field1618++;
        class40 var4 = new class40();
        var4.field471 = arg0.method1563(-128);
        var4.field468 = arg0.method1576((byte) 121);
        var4.field474 = new int[var4.field471];
        var4.field473 = new int[var4.field471];
        var4.field470 = new class315[var4.field471];
        var4.field475 = new class315[var4.field471];
        var4.field478 = new int[var4.field471];
        var4.field476 = new byte[var4.field471][][];
        for (int var5 = 0; var5 < var4.field471; var5++) {
            try {
                int var6 = arg0.method1563(-128);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method1565(-80);
                    String var8 = arg0.method1565(-124);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1576((byte) 126);
                    }
                    var4.field473[var5] = var6;
                    var4.field474[var5] = var9;
                    var4.field475[var5] = arg2.method2735(true, class213.method1309(var7, (byte) 126), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method1565(-88);
                    String var11 = arg0.method1565(-110);
                    int var12 = arg0.method1563(-128);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method1565(-55);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1576((byte) 126);
                            var15[var16] = new byte[var17];
                            arg0.method1550(var17, 0, (byte) 78, var15[var16]);
                        }
                    }
                    var4.field473[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class213.method1309(var13[var19], (byte) 126);
                    }
                    var4.field470[var5] = arg2.method2723(class213.method1309(var10, (byte) 127), var18, var11, 10);
                    var4.field476[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field478[var5] = -1;
            } catch (SecurityException var21) {
                var4.field478[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field478[var5] = -3;
            } catch (Exception var23) {
                var4.field478[var5] = -4;
            } catch (Throwable var24) {
                var4.field478[var5] = -5;
            }
        }
        class306.field4104.method1696(false, var4);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)Z", line = 286)
    public final boolean method900(byte arg0, int arg1) {
        field1619++;
        int var3 = 59 % ((arg0 + 79) / 36);
        return this.field1627[arg1].field1162;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZIIZ)Lwo;", line = 296)
    public static final class285 method901(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field1624++;
        class334 var5 = null;
        if (class162.field1890 != null) {
            var5 = new class334(arg3, class162.field1890, class419.field5715[arg3], 1000000);
        }
        class330.field4506[arg3] = class341.field4649.method984(arg3, var5, class399.field5404, (byte) -67);
        if (arg4) {
            class330.field4506[arg3].method903(-1);
        }
        if (!arg0) {
            method901(false, true, -9, 97, true);
        }
        return new class285(class330.field4506[arg3], arg1, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V", line = 320)
    public class140(int arg0) {
        this.field1623 = arg0;
    }
}
