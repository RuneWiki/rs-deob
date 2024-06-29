import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class class119 implements class416 {

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Z")
    private boolean field1598 = false;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "Lug;")
    public class395 field1607;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Z")
    private boolean field1605;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Ldq;")
    public static class493 field1602 = new class493(27, 5);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field1616;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "[Z")
    public static boolean[] field1615;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Llo;")
    public static final class531 method850(int arg0, int arg1) {
        field1614++;
        int var2 = 102 % ((-arg1 - 63) / 53);
        class365[] var3 = class159.field2029;
        synchronized (class159.field2029) {
            class531 var4;
            if (arg0 >= class159.field2029.length || class159.field2029[arg0].method2089(42)) {
                var4 = new class531();
                var4.field7810 = new class419[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field7810[var5] = new class419();
                }
            } else {
                var4 = (class531) class159.field2029[arg0].method2090(0);
                var4.method603(0);
                int var10002 = class244.field3153[arg0]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)I")
    private final int method851(int arg0) {
        field1608++;
        int var2 = -28 / ((arg0 + 32) / 37);
        int var3 = this.field1607.method2297(this.field1611, (byte) -115) * this.field1601;
        return this.field1605 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public static void method852(byte arg0) {
        field1615 = null;
        field1616 = null;
        field1602 = null;
        if (arg0 > -102) {
            method854(93, null, -88);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZZ)V")
    public final void method853(boolean arg0, boolean arg1) {
        if (this.field1605 != arg1) {
            int var3 = this.method851(-92);
            this.field1605 = true;
            this.method863(87);
            this.method856((byte) -116, var3);
        }
        field1597++;
        if (arg0) {
            field1615 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILtf;I)Z")
    public static final boolean method854(int arg0, class194 arg1, int arg2) {
        field1600++;
        int var3 = arg1.method1199(30304, 2);
        if (var3 == 0) {
            if (arg1.method1199(30304, 1) != 0) {
                method854(-121, arg1, arg2);
            }
            int var4 = arg1.method1199(30304, 6);
            int var5 = arg1.method1199(30304, 6);
            boolean var6 = arg1.method1199(30304, 1) == 1;
            if (var6) {
                class479.field7012[class409.field5845++] = arg2;
            }
            if (class387.field5107[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class26 var7 = class434.field6167[arg2];
            class223 var8 = class387.field5107[arg2] = new class223();
            var8.field4890 = arg2;
            if (class424.field5991[arg2] != null) {
                var8.method1358(-1, class424.field5991[arg2]);
            }
            var8.method2125((byte) 110, var7.field372);
            var8.field4895 = var7.field375;
            int var9 = var7.field377;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field2820 = var7.field378;
            var8.field4940[0] = class191.field2482[arg2];
            var8.field2676 = (byte) var10;
            var8.method1362((var12 << 6) + var5 - class320.field4064, (var11 << 6) + var4 + -class441.field6317, (byte) 40);
            var8.field2860 = false;
            class434.field6167[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg1.method1199(30304, 2);
            int var14 = class434.field6167[arg2].field377;
            class434.field6167[arg2].field377 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg1.method1199(30304, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class434.field6167[arg2].field377;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class434.field6167[arg2].field377 = (var19 << 28) + ((var20 << 14) + var21);
            return false;
        } else {
            if (arg0 >= -120) {
                method852((byte) -2);
            }
            int var22 = arg1.method1199(30304, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF40) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class434.field6167[arg2].field377;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class434.field6167[arg2].field377 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lvh;III)V")
    public static final void method855(class242 arg0, int arg1, int arg2, int arg3) {
        long var4 = class470.field6828[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3134 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field3137[arg0.field3134++] = class187.field2441[var8 - 1].field2337;
            var6 += 16L;
        }
        for (int var9 = arg0.field3134; var9 < 4; var9++) {
            arg0.field3137[var9] = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)V")
    private final void method856(byte arg0, int arg1) {
        field1610++;
        this.field1607.field5516 -= arg1;
        this.field1607.field5516 += this.method851(-103);
        if (arg0 >= -85) {
            method855(null, 123, -73, -91);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static final void method857(boolean arg0) {
        if (arg0) {
            class125.field1664 = class159.field2027;
            class520.field7520 = class140.field1808;
        } else {
            class125.field1664 = class38.field506;
            class520.field7520 = class531.field7811;
        }
        class524.field7753 = class125.field1664.length;
    }

    @OriginalMember(owner = "client!sq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method860((byte) -125);
        field1612++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)I")
    public final int method858(boolean arg0) {
        if (!arg0) {
            method857(false);
        }
        field1596++;
        return this.field1599;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
    public final boolean method859(byte arg0) {
        field1609++;
        if (!this.field1607.field5529) {
            if (arg0 != 49) {
                this.field1605 = true;
            }
            return false;
        }
        int var2 = this.method851(54);
        this.field1607.method2322(this, 14);
        OpenGL.glGenerateMipmapEXT(this.field1604);
        this.field1605 = true;
        this.method863(115);
        this.method856((byte) -117, var2);
        return true;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public final void method860(byte arg0) {
        field1613++;
        int var2 = -61 % ((-arg0 - 26) / 43);
        if (this.field1599 > 0) {
            this.field1607.method2300(this.method851(-79), (byte) -125, this.field1599);
            this.field1599 = 0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)V")
    public final void method861(boolean arg0, int arg1) {
        if (arg1 != 9984) {
            this.field1611 = 125;
        }
        if (this.field1598 != arg0) {
            this.field1598 = arg0;
            this.method863(arg1 - 10099);
        }
        field1606++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lev;")
    public static final class490 method862(int arg0, int arg1, int arg2) {
        if (class125.field1664[arg0][arg1][arg2] == null) {
            boolean var3 = class125.field1664[0][arg1][arg2] != null && class125.field1664[0][arg1][arg2].field7146 != null;
            if (var3 && arg0 >= class524.field7753 - 1) {
                return null;
            }
            class178.method1138(arg0, arg1, arg2);
        }
        return class125.field1664[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    private final void method863(int arg0) {
        int var2 = -71 / ((3 - arg0) / 50);
        field1595++;
        this.field1607.method2322(this, 14);
        if (this.field1598) {
            OpenGL.glTexParameteri(this.field1604, 10241, this.field1605 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1604, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1604, 10241, this.field1605 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1604, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lug;IIIZ)V")
    public class119(class395 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1611 = arg2;
        this.field1601 = arg3;
        this.field1607 = arg0;
        this.field1604 = arg1;
        this.field1605 = arg4;
        OpenGL.glGenTextures(1, class288.field3674, 0);
        this.field1599 = class288.field3674[0];
        this.method856((byte) -98, 0);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public abstract void method864(int arg0);

    static {
        new class335("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
