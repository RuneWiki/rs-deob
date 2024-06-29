import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class265 extends class98 {

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Z")
    public boolean field4618 = true;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public int field4620 = -1;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public int field4624 = 12800;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public int field4635 = 0;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public int field4636 = 0;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public int field4631 = 12800;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lmb;")
    public class96 field4622;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lmb;")
    public class96 field4623;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Loa;")
    public class262 field4630;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Z")
    public static boolean field4625 = false;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field4632 = -1;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Lmb;")
    public static class96 field4629 = class243.method1708("W-=hlen Sie eine Option", (byte) 115);

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Luc;")
    public static class11 field4633 = new class11(4);

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "[Lrf;")
    public static class30[] field4638;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(III)Z")
    public final boolean method1824(int arg0, int arg1, int arg2) {
        field4634++;
        if (this.field4624 > arg0 || arg0 > this.field4636 || arg2 < this.field4631 || this.field4635 < arg2) {
            return false;
        }
        for (class167 var4 = (class167) this.field4630.method1811(2); var4 != null; var4 = (class167) this.field4630.method1810(false)) {
            if (var4.method1206(arg2, 205, arg0)) {
                return true;
            }
        }
        int var5 = -26 % ((arg1 + 79) / 46);
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z")
    public static final boolean method1825(int arg0, int arg1) {
        if (arg0 == 0) {
            field4637++;
            return (arg1 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLmb;)V")
    public static final void method1826(byte arg0, class96 arg1) {
        field4617++;
        if (class254.field4389 >= 2) {
            if (arg1.method679(class236.field4065, 18452)) {
                class23.method163(-26208);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class226.method1540((class96) null, 0, (byte) -21, class36.method289(-5615, new class96[] { class82.field1390, class31.method205(var4, (byte) -78), class162.field2875 }));
            }
            if (arg1.method679(client.field1998, 18452)) {
                class260.method1798(7);
            }
            if (arg1.method679(class161.field2845, 18452)) {
                class181.field3128.method732(4096);
            }
            if (arg1.method679(class239.field4114, 18452)) {
                class181.field3128.method735(820);
            }
            if (arg1.method679(class215.field3694, 18452)) {
                class234.field4017.method943(-53);
                class211.field3638.method1601((byte) 15);
                class181.field3128.method728(-127);
            }
            if (arg1.method679(class77.field1319, 18452)) {
                class38.field670 = true;
            }
            if (arg1.method679(class135.field2426, 18452)) {
                class146.method1076(6938, 25);
            }
            if (arg1.method679(class99.field1676, 18452)) {
                class56.field979 = true;
            }
            if (arg1.method679(class71.field1218, 18452)) {
                class56.field979 = false;
            }
            if (arg1.method679(class249.field4314, 18452)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class62.field1064[var5].field3566[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method703(0, class175.field3049) && class44.field755 != 0) {
                class48.method369(arg1.method710(114, 6).method694(10), false);
            }
            if (arg1.method679(class121.field2234, 18452) && class44.field755 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method703(0, class198.field3449)) {
                class211.field3639 = arg1.method710(123, 12).method678((byte) -92).method694(10);
                class226.method1540((class96) null, 0, (byte) -88, class36.method289(-5615, new class96[] { class251.field4347, class31.method205(class211.field3639, (byte) -78) }));
            }
            if (arg1.method679(class25.field425, 18452)) {
                class45.field784 = true;
            }
        }
        class140.field2505.method1012((byte) -2, 185);
        if (arg0 < -84) {
            class132.field2367++;
            class140.field2505.method1652(arg1.method707(-107) - 1, (byte) 41);
            class140.field2505.method1644(arg1.method710(117, 2), -110);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static void method1827(int arg0) {
        field4633 = null;
        field4638 = null;
        if (arg0 == 4821) {
            field4629 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public final void method1828(byte arg0) {
        this.field4624 = 12800;
        this.field4635 = 0;
        field4627++;
        this.field4636 = 0;
        if (arg0 >= -109) {
            return;
        }
        this.field4631 = 12800;
        for (class167 var2 = (class167) this.field4630.method1811(2); var2 != null; var2 = (class167) this.field4630.method1810(false)) {
            if (this.field4636 < var2.field2944) {
                this.field4636 = var2.field2944;
            }
            if (var2.field2948 < this.field4624) {
                this.field4624 = var2.field2948;
            }
            if (this.field4631 > var2.field2941) {
                this.field4631 = var2.field2941;
            }
            if (var2.field2942 > this.field4635) {
                this.field4635 = var2.field2942;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lmb;Lmb;IIIZ)V")
    public class265(class96 arg0, class96 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4622 = arg1;
        this.field4618 = arg5;
        this.field4621 = arg2;
        this.field4639 = arg3;
        this.field4620 = arg4;
        this.field4623 = arg0;
        this.field4630 = new class262();
    }
}
