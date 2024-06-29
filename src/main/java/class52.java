import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class52 extends class118 {

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    private int field677 = 0;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    private int field674 = 1;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    private int field682 = 0;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Lwl;")
    public static class452 field675 = new class452(10, 6);

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "Lpf;")
    public static class425 field678 = new class425(6, -1);

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Lwl;")
    public static class452 field680;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "Z")
    public static boolean field684;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            field675 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field674 = arg2.method2343(255);
                }
            } else {
                this.field682 = arg2.method2343(255);
            }
        } else {
            this.field677 = arg2.method2343(255);
        }
        ++field681;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
    public static void method303(byte arg0) {
        int var1 = 66 / ((arg0 - -60) / 55);
        field678 = null;
        field680 = null;
        field675 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)[Lod;")
    public static final class411[] method304(boolean arg0) {
        ++field673;
        if (class306.field4630 == null) {
            class411[] var1 = class289.method1784(16382, class79.field1043);
            class411[] var2 = new class411[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; ~var4 > ~var1.length; ++var4) {
                class411 var8 = var1[var4];
                if ((var8.field6125 <= 0 || ~var8.field6125 <= -25) && var8.field6118 >= 800 && ~var8.field6122 <= -601 && (~class229.field3504 <= -97 || ~class405.field6032 != -1 || var8.field6118 <= 1024 && var8.field6122 <= 768)) {
                    for (int var9 = 0; ~var3 < ~var9; ++var9) {
                        class411 var10 = var2[var9];
                        if (var8.field6118 == var10.field6118 && ~var8.field6122 == ~var10.field6122) {
                            if (~var10.field6125 > ~var8.field6125) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class306.field4630 = new class411[var3];
            class129.method767(var2, 0, class306.field4630, 0, var3);
            int[] var5 = new int[class306.field4630.length];
            for (int var6 = 0; class306.field4630.length > var6; ++var6) {
                class411 var7 = class306.field4630[var6];
                var5[var6] = var7.field6122 * var7.field6118;
            }
            class133.method790(var5, class306.field4630, 0);
        }
        if (!arg0) {
            method303((byte) 80);
        }
        return class306.field4630;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static final void method305(byte arg0) {
        ++field676;
        if (class90.field1277 == null) {
            if (arg0 != 70) {
                field678 = null;
            }
            Container var1;
            if (class143.field1914 == null) {
                var1 = class79.field1043.field3583;
            } else {
                var1 = class143.field1914;
            }
            class71.field933 = var1.getSize().width;
            class204.field3063 = var1.getSize().height;
            if (class143.field1914 == var1) {
                Insets var2 = class143.field1914.getInsets();
                class71.field933 -= var2.right + var2.left;
                class204.field3063 -= var2.top + var2.bottom;
            }
            if (class246.method1503((byte) -103) != 1) {
                if (class229.field3504 < 96 && ~class405.field6032 == -1) {
                    int var3 = ~class71.field933 < -1025 ? 1024 : class71.field933;
                    int var4 = ~class204.field3063 >= -769 ? class204.field3063 : 768;
                    class221.field3368 = var3;
                    class184.field2777 = (-var3 + class71.field933) / 2;
                    class161.field2232 = var4;
                    class113.field1498 = 0;
                } else {
                    class221.field3368 = class71.field933;
                    class113.field1498 = 0;
                    class161.field2232 = class204.field3063;
                    class184.field2777 = 0;
                }
            } else {
                class161.field2232 = class88.field1262;
                class113.field1498 = 0;
                class221.field3368 = class68.field886;
                class184.field2777 = (class71.field933 - class68.field886) / 2;
            }
            if (class454.field6750 != 0) {
                boolean var10000;
                if (class221.field3368 < 1024 && class161.field2232 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class170.field2631.setSize(class221.field3368, class161.field2232);
            if (class196.field2965 != null) {
                class196.field2965.method391();
            }
            if (class143.field1914 != var1) {
                class170.field2631.setLocation(class184.field2777, class113.field1498);
            } else {
                Insets var5 = class143.field1914.getInsets();
                class170.field2631.setLocation(class184.field2777 + var5.left, class113.field1498 + var5.top);
            }
            if (class6.field69 != -1) {
                class39.method224(arg0 ^ 26, true);
            }
            class60.method328(0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        ++field683;
        if (arg0 < 103) {
            this.field677 = -41;
        }
        class316.method1927((byte) 80);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field679;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (arg0 != 1) {
            return null;
        } else {
            if (super.field1537.field5756) {
                int var4 = class160.field2210[arg1];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; ~class440.field6474 < ~var6; ++var6) {
                    int var7 = class6.field73[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field677 != -1) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field674 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field674;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field682 != -1) {
                        if (this.field682 == 2) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = 2048 - var12 << 1;
                        }
                    } else {
                        var12 = class280.field4293[(var12 & 4083) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    static {
        new class151("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field680 = new class452(37, -1);
        field684 = true;
    }
}
