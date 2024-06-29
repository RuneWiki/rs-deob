import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class100 extends class25 {

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "Ldf;")
    public static class51 field1669 = class46.method233("Abbrechen", 100);

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "Ldf;")
    public static class51 field1672 = class46.method233("Weiter", 100);

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Ldf;")
    private static class51 field1671 = class46.method233("Loading interfaces )2 ", 100);

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Ldf;")
    public static class51 field1667 = field1671;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
    public static boolean field1657 = false;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "Ldf;")
    public class51 field1663;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "[I")
    public int[] field1656;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "[I")
    public int[] field1662;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "[I")
    public int[] field1665;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
    public int[] field1666;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "[I")
    public static int[] field1675;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)I")
    public static final int method730(boolean arg0) {
        field1660++;
        if ((double) class207.field3454 == 3.0D) {
            return 37;
        } else if ((double) class207.field3454 == 4.0D) {
            return 50;
        } else if (arg0) {
            return (double) class207.field3454 == 6.0D ? 75 : 100;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static final void method731(byte arg0) {
        class213.field3708.method1353(-89);
        field1659++;
        if (arg0 > -62) {
            field1671 = null;
        }
        class63.field1024.method1353(-122);
        class233.field4069.method1353(-124);
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
    public static void method732(int arg0) {
        field1672 = null;
        if (arg0 == 24396) {
            field1671 = null;
            field1669 = null;
            field1667 = null;
            field1675 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
    public final int method733(int arg0, int arg1) {
        field1678++;
        if (this.field1665 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1665.length; var3++) {
            if (this.field1662[var3] == arg0) {
                return this.field1665[var3];
            }
        }
        if (arg1 != 1) {
            method736((Throwable) null, (String) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
    public static final void method734(boolean arg0, int arg1) {
        field1676++;
        if (class195.field3249 == arg1) {
            return;
        }
        if (class195.field3249 == 0) {
            class124.method929((byte) -106);
        }
        if (arg1 == 40) {
            class74.method530(class43.field695, 0, class43.field697, class258.field4508);
        }
        if (arg1 != 40 && class50.field796 != null) {
            class50.field796.method838(-121);
            class50.field796 = null;
        }
        if (!arg0) {
            method732(2);
        }
        if (arg1 == 25 || arg1 == 28) {
            class75.field1198 = 0;
            class142.field2377 = 0;
            class185.field3056 = 0;
            class3.field24 = 1;
            class47.field754 = 1;
            class160.method1137((byte) 104);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 5) {
            class62.method410(2, class162.field2651);
        } else {
            class177.method1242(-110);
        }
        boolean var3 = class195.field3249 == 5 || class195.field3249 == 10 || class195.field3249 == 28;
        if (var3 != var2) {
            if (var2) {
                class153.field2556 = class7.field79;
                if (class26.field381 == 0) {
                    class55.method353(2, (byte) 122);
                } else {
                    class60.method402(class149.field2493, 2, (byte) -55, false, 0, 255, class7.field79);
                }
                class35.method180(false, -28603);
            } else {
                class55.method353(2, (byte) 86);
                class35.method180(true, -28603);
            }
        }
        class195.field3249 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)I")
    public final int method735(int arg0, int arg1) {
        field1668++;
        if (this.field1666 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1666.length; var3++) {
            if (this.field1656[var3] == arg1) {
                return this.field1666[var3];
            }
        }
        if (arg0 != -1) {
            method734(false, 108);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ldj;")
    public static final class177 method736(Throwable arg0, String arg1) {
        class177 var2;
        if ((arg0 instanceof class177)) {
            var2 = (class177) arg0;
            var2.field2896 = var2.field2896 + ' ' + arg1;
        } else {
            var2 = new class177(arg0, arg1);
        }
        field1673++;
        return var2;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILlb;)V")
    public final void method737(int arg0, class121 arg1) {
        if (arg0 <= 1) {
            return;
        }
        field1677++;
        while (true) {
            int var3 = arg1.method897(119);
            if (var3 == 0) {
                return;
            }
            this.method739(var3, (byte) 72, arg1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)V")
    public final void method738(byte arg0) {
        field1664++;
        if (this.field1665 != null) {
            for (int var2 = 0; var2 < this.field1665.length; var2++) {
                this.field1665[var2] = class82.method642(this.field1665[var2], 32768);
            }
        }
        if (arg0 < -88 && this.field1666 != null) {
            for (int var3 = 0; var3 < this.field1666.length; var3++) {
                this.field1666[var3] = class82.method642(this.field1666[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBLlb;)V")
    private final void method739(int arg0, byte arg1, class121 arg2) {
        if (arg0 == 1) {
            this.field1663 = arg2.method903((byte) 108);
        } else if (arg0 == 2) {
            int var7 = arg2.method897(-95);
            this.field1656 = new int[var7];
            this.field1666 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1666[var8] = arg2.method876(false);
                int var9 = arg2.method897(-128);
                if (var9 == 0) {
                    this.field1656[var8] = -1;
                } else {
                    this.field1656[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method897(-50);
            this.field1665 = new int[var4];
            this.field1662 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1665[var5] = arg2.method876(false);
                int var6 = arg2.method897(116);
                if (var6 == 0) {
                    this.field1662[var5] = -1;
                } else {
                    this.field1662[var5] = var6;
                }
            }
        }
        if (arg1 < 9) {
            field1671 = null;
        }
        field1670++;
    }
}
