import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class51 extends class210 {

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Ldq;")
    public static class90 field635 = new class90(512);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "[I")
    public static int[] field645;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "F")
    public static float field644;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public static final void method392(int arg0) {
        if (class92.field1136 == null || class311.field4580 == null) {
            class92.field1136 = new int[256];
            class311.field4580 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class92.field1136[var1] = (int) (Math.sin(var2) * 4096.0D);
                class311.field4580[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            field641 = 104;
        }
        ++field633;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method393(byte arg0, String arg1) {
        ++field640;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        if (arg0 >= -101) {
            return null;
        } else {
            StringBuffer var5 = new StringBuffer(var2 - -var3);
            for (int var6 = 0; var2 > var6; ++var6) {
                char var7 = arg1.charAt(var6);
                if (var7 != '<') {
                    if (var7 != '>') {
                        var5.append(var7);
                    } else {
                        var5.append("<gt>");
                    }
                } else {
                    var5.append("<lt>");
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILkg;I)V")
    public static final void method394(int arg0, int arg1, class223 arg2, int arg3) {
        ++field634;
        class26.field380 = arg1;
        if (arg0 != 1) {
            field635 = null;
        }
        class33.field473 = arg3;
        class34.field494 = arg2;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
    public static final void method395(byte arg0) {
        ++field632;
        int var1 = class369.method2346(0);
        if (~var1 == -1) {
            class444.field6472 = null;
            class18.method225(0, 0);
        } else if (var1 != 1) {
            class390.method2464(-1964824607, (byte) (255 & class253.field3713 + -4));
            class18.method225(2, 0);
        } else {
            class390.method2464(-1964824607, (byte) 0);
            class18.method225(512, 0);
            if (class131.field1790 != null) {
                class245.method1633(arg0 ^ 19);
            }
        }
        if (arg0 != 19) {
            field635 = null;
        }
        class56.field682 = class423.field6117;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjb;)Z")
    public static final boolean method396(int arg0, class438 arg1) {
        ++field638;
        class178 var2 = class450.method2785(arg1.method9((byte) 107), (byte) 94);
        if (var2.field2458 == arg0) {
            return true;
        } else {
            class127 var3 = class250.method1655(arg0 + 35, var2.field2458);
            return var3.field1676 == -1 ? true : var3.method852((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lct;Z)V")
    public static final void method397(class104 arg0, boolean arg1) {
        ++field637;
        if (arg1) {
            field635 = null;
        }
        class444.field6473 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public static void method398(int arg0) {
        if (arg0 != 2) {
            field644 = 0.26777554F;
        }
        field645 = null;
        field635 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            field635 = null;
        }
        ++field642;
        if (~arg0 == -1) {
            super.field2956 = arg2.method1738((byte) -37) == 1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class51() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field631;
        int[][] var3 = super.field2967.method1572(127, arg0);
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class202.field2852 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (arg1 < 94) {
            method392(10);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field643;
        if (arg1 != -38) {
            return null;
        } else {
            int[] var3 = super.field2950.method1892(arg0, (byte) -115);
            if (super.field2950.field4111) {
                int[] var4 = this.method1447(arg0, -121, 0);
                for (int var5 = 0; class202.field2852 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)Lla;")
    public static final class150 method399(byte arg0, int arg1) {
        ++field639;
        class150 var2 = (class150) class103.field1323.method1933((long) arg1, arg0 ^ -28);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 > -32769) {
                var3 = class404.field5854.method715(arg1, (byte) 88, 1);
            } else {
                var3 = class251.field3689.method715(32767 & arg1, (byte) 96, 1);
            }
            if (arg0 != -28) {
                field644 = 1.4619818F;
            }
            class150 var4 = new class150();
            if (var3 != null) {
                var4.method1030(new class256(var3), 0);
            }
            if (arg1 >= 32768) {
                var4.method1035((byte) -126);
            }
            class103.field1323.method1937(-103, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public static final void method400(int arg0) {
        ++field636;
        int var1 = 0;
        if (arg0 >= -40) {
            field641 = -122;
        }
        while (var1 < 100) {
            class344.field5053[var1] = true;
            ++var1;
        }
    }

    static {
        new class409("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field645 = new int[5];
    }
}
