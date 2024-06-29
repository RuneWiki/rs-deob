import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field37 = new Rectangle[100];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
    public static int[] field35 = new int[4096];

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
    public static int[] field36;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static final void method35(boolean arg0) {
        field39++;
        int var1 = 0;
        if (arg0) {
            method37(-86);
        }
        while (class368.field5681 > var1) {
            int var2 = class272.field4342[var1];
            class378 var3 = ((class38) class365.field5659.method1122((byte) 59, (long) var2)).field378;
            int var4 = class279.field4428.method1445(-117);
            if ((var4 & 0x80) != 0) {
                var4 += class279.field4428.method1445(-78) << 8;
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class279.field4428.method1481(false);
                int var6 = class279.field4428.method1426(-124);
                var3.method427(var6, var5, class88.field1278, -12515);
                var3.field871 = class88.field1278 + 300;
                var3.field865 = class279.field4428.method1422(61);
            }
            if ((var4 & 0x800) != 0) {
                int var7 = class279.field4428.method1455(-3387);
                var3.field820 = class279.field4428.method1426(60);
                var3.field878 = class279.field4428.method1422(83);
                var3.field830 = (var7 & 0x8000) != 0;
                var3.field797 = var7 & 0x7FFF;
                var3.field856 = class88.field1278 + var3.field820 + var3.field797;
            }
            if ((var4 & 0x4) != 0) {
                int var8 = class279.field4428.method1431(65280);
                int var9 = class279.field4428.method1478((byte) 107);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var10 = class279.field4428.method1426(-125);
                var3.method422(-94, var9, var10, var8, false);
            }
            if ((var4 & 0x200) != 0) {
                var3.field5803 = class279.field4428.method1431(65280);
                var3.field5813 = class279.field4428.method1455(-3387);
            }
            if ((var4 & 0x1) != 0) {
                int var11 = class279.field4428.method1455(-3387);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class279.field4428.method1426(-123);
                class176.method1117(var12, var11, var3, -121);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field5809.method1199(114)) {
                    class76.method546(var3, 472);
                }
                var3.method2443(class6.field72.method2977(class279.field4428.method1431(65280), 50), (byte) -115);
                var3.method430((byte) -59, var3.field5809.field2809);
                var3.field850 = var3.field5809.field2830 << 3;
                if (var3.field5809.method1199(114)) {
                    class31.method198(var3.field6419, null, 0, var3.field899[0], var3.field894[0], var3, 1, null);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field873 = class279.field4428.method1448(65535);
                var3.field833 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field821 = class279.field4428.method1457((byte) -39);
                var3.field870 = class279.field4428.method1427(false);
                var3.field835 = class279.field4428.method1430((byte) -117);
                var3.field868 = class279.field4428.method1427(false);
                var3.field796 = class279.field4428.method1455(-3387) + class88.field1278;
                var3.field846 = class279.field4428.method1417(2) + class88.field1278;
                var3.field811 = class279.field4428.method1445(-106);
                var3.field821 += var3.field894[0];
                var3.field893 = 0;
                var3.field835 += var3.field894[0];
                var3.field870 += var3.field899[0];
                var3.field868 += var3.field899[0];
                var3.field898 = 1;
            }
            if ((var4 & 0x2000) != 0) {
                int var13 = class279.field4428.method1475(255);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class279.field4428.method1455(-3387);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class279.field4428.method1445(-108);
                    var16[var17] = class279.field4428.method1460(4);
                }
                class415.method2655(7070, var16, var3, var15, var14);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field843 = class279.field4428.method1430((byte) -17);
                var3.field859 = class279.field4428.method1427(false);
                var3.field842 = class279.field4428.method1427(false);
                var3.field866 = (byte) class279.field4428.method1422(-120);
                var3.field824 = class88.field1278 + class279.field4428.method1431(65280);
                var3.field880 = class88.field1278 + class279.field4428.method1417(2);
            }
            if ((var4 & 0x2) != 0) {
                int var19 = class279.field4428.method1481(false);
                int var20 = class279.field4428.method1422(-119);
                var3.method427(var20, var19, class88.field1278, -12515);
            }
            if ((var4 & 0x400) != 0) {
                int var21 = class279.field4428.method1455(-3387);
                int var22 = class279.field4428.method1478((byte) 80);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class279.field4428.method1445(32);
                var3.method422(-86, var22, var23, var21, true);
            }
            if ((var4 & 0x8) != 0) {
                var3.field829 = class279.field4428.method1460(4);
                if (var3.field829 == 65535) {
                    var3.field829 = -1;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[S)[S")
    public static final short[] method36(int arg0, int arg1, short[] arg2) {
        field38++;
        short[] var3 = new short[arg0];
        if (arg1 != 256) {
            field36 = null;
        }
        class324.method2170(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method37(int arg0) {
        field35 = null;
        field36 = null;
        field37 = null;
        if (arg0 != -30354) {
            field35 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)Lvk;")
    public static final class305 method38(int arg0, byte arg1) {
        field40++;
        if (arg1 != 101) {
            return null;
        }
        class305[] var2 = class335.method2224((byte) 65);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class305 var4 = var2[var3];
            if (var4.field4795 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
