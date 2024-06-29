import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class126 extends class245 {

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "Lte;")
    public static class357 field1640 = new class357(128);

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1648 = "Drop";

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1646 = new CRC32();

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "Z")
    public static boolean field1649 = false;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "F")
    public static float field1645;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Ltj;")
    public static class298 field1647;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "[B")
    private byte[] field1630;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
    public void method887(int arg0, byte arg1) {
        this.field1630[arg0] = arg1;
        field1631++;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public static final void method888(int arg0) {
        field1625++;
        if (arg0 != 128) {
            method893(-60, -67, -3, 57, 95, 20, -111);
        }
        for (class166 var1 = (class166) class331.field4873.method1575(0); var1 != null; var1 = (class166) class331.field4873.method1573((byte) -128)) {
            class81 var2 = var1.field2246;
            if (class268.field3973 != var2.field5922 || var2.field1134 < class231.field3179) {
                var1.method2632(true);
                var2.method637((byte) -40);
            } else if (class231.field3179 >= var2.field1113) {
                if (var2.field1144 > 0) {
                    class163 var3 = class388.field5670[var2.field1144 - 1];
                    if (var3 != null && var3.field5921 >= 0 && var3.field5921 < class351.field5217 * 128 && var3.field5930 >= 0 && (class143.field1815 * 128) > var3.field5930) {
                        var2.method638(class231.field3179, var3.field5930, var3.field5921, (byte) -118, class248.method1621(var3.field5921, var3.field5930, arg0 - 13981, var2.field5922) - var2.field1112);
                    }
                }
                if (var2.field1144 < 0) {
                    int var4 = -var2.field1144 - 1;
                    class317 var5;
                    if (class400.field5853 == var4) {
                        var5 = class383.field5609;
                    } else {
                        var5 = class176.field2382[var4];
                    }
                    if (var5 != null && var5.field5921 >= 0 && (class351.field5217 * 128) > var5.field5921 && var5.field5930 >= 0 && class143.field1815 * 128 > var5.field5930) {
                        var2.method638(class231.field3179, var5.field5930, var5.field5921, (byte) -96, class248.method1621(var5.field5921, var5.field5930, -13853, var2.field5922) - var2.field1112);
                    }
                }
                var2.method632(false, class216.field3021);
                class197.method1306(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1629++;
        class362 var13 = new class362();
        var13.field5370 = arg5;
        if (arg4 != 4096) {
            method890((byte) -127);
        }
        var13.field5364 = arg11;
        var13.field5366 = arg12;
        var13.field5356 = arg1;
        var13.field5357 = arg3;
        var13.field5353 = arg8;
        var13.field5360 = arg0;
        var13.field5365 = arg2;
        var13.field5355 = arg6;
        var13.field5358 = arg10;
        var13.field5352 = arg9;
        var13.field5369 = arg7;
        class185.field2502.method1560(-103, var13);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V")
    public static final void method890(byte arg0) {
        class428.field6220 = null;
        class249.field3679 = null;
        class1.field1 = null;
        class112.field1452 = null;
        class263.field3853 = null;
        class108.field1417 = null;
        class48.field735 = null;
        class255.field3723 = null;
        class173.field2355 = null;
        class164.field2231 = null;
        class50.field760 = null;
        if (arg0 != -30) {
            method893(-90, -78, -101, -65, -106, -67, 118);
        }
        field1644++;
        class359.field5323 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public final void method891(byte arg0) {
        field1637++;
        this.field1626 = 0;
        if (arg0 >= 83) {
            this.field1635 = 0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public final void method892(byte arg0) {
        this.field1639 = this.field1634;
        field1632++;
        if (arg0 >= -24) {
            return;
        }
        this.field1626 >>= 0x4;
        if (this.field1626 < 0) {
            this.field1626 = 0;
        } else if (this.field1626 > 255) {
            this.field1626 = 255;
        }
        this.method887(this.field1635++, (byte) this.field1626);
        this.field1626 = 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            field1646 = null;
        }
        if (class240.field3368 <= (arg5 - arg2) && class136.field1769 >= arg2 + arg5 && (arg3 - arg2) >= class157.field1981 && (arg2 + arg3) <= class312.field4602) {
            class368.method2421((byte) 119, arg1, arg5, arg2, arg6, arg3, arg0);
        } else {
            class77.method616(arg0, arg2, arg1, arg4 ^ 0x7D, arg6, arg5, arg3);
        }
        field1638++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZZBII)Lir;")
    public static final class185 method894(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field1641++;
        if (arg2 <= 67) {
            field1640 = null;
        }
        class330 var5 = null;
        if (class62.field939 != null) {
            var5 = new class330(arg4, class62.field939, class212.field2903[arg4], 1000000);
        }
        class386.field5643[arg4] = class372.field5482.method833(arg4, (byte) -117, class423.field6168, var5);
        if (arg0) {
            class386.field5643[arg4].method1501(-38);
        }
        return new class185(class386.field5643[arg4], arg1, arg3);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public static void method895(boolean arg0) {
        field1647 = null;
        if (!arg0) {
            field1640 = null;
        }
        field1640 = null;
        field1648 = null;
        field1646 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BII)V")
    public final void method896(byte arg0, int arg1, int arg2) {
        int var4 = 19 % ((-arg0 - 28) / 55);
        field1627++;
        if (arg2 == 0) {
            this.field1643 = this.field1633 - (arg1 >= 0 ? arg1 : -arg1);
            this.field1642 = 4096;
            this.field1643 = this.field1643 * this.field1643 >> 12;
            this.field1626 = this.field1643;
            return;
        }
        this.field1642 = this.field1643 * this.field1628 >> 12;
        this.field1643 = this.field1633 - (arg1 >= 0 ? arg1 : -arg1);
        if (this.field1642 < 0) {
            this.field1642 = 0;
        } else if (this.field1642 > 4096) {
            this.field1642 = 4096;
        }
        this.field1643 = this.field1643 * this.field1643 >> 12;
        this.field1643 = this.field1643 * this.field1642 >> 12;
        this.field1626 += this.field1643 * this.field1639 >> 12;
        this.field1639 = this.field1639 * this.field1634 >> 12;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1633 = (int) (arg6 * 4096.0F);
        this.field1628 = (int) (arg7 * 4096.0F);
        this.field1639 = this.field1634 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILir;ZLir;)V")
    public static final void method897(int arg0, class185 arg1, boolean arg2, class185 arg3) {
        field1636++;
        class166.field2250 = arg3;
        class123.field1586 = arg1;
        class384.field5625 = arg2;
        int var4 = class123.field1586.method1222(true) - 1;
        class15.field234 = arg0 * var4 + class123.field1586.method1225(var4, (byte) 27);
        class254.field3712 = new String[] { null, null, null, null, field1648 };
        class280.field4129 = new String[] { null, null, class316.field4623, null, null };
    }
}
