import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class248 extends class32 {

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Lqk;")
    public static class207 field4498 = class24.method212(255, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "Lqk;")
    public class207 field4505;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Lle;")
    public static class42 field4495;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "[I")
    public int[] field4489;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[I")
    public int[] field4493;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "[I")
    public int[] field4499;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "[I")
    public int[] field4503;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public final void method1742(byte arg0) {
        field4504++;
        if (this.field4499 != null) {
            for (int var2 = 0; var2 < this.field4499.length; var2++) {
                this.field4499[var2] = class281.method1906(this.field4499[var2], 32768);
            }
        }
        int var3 = 9 % ((arg0 + 54) / 49);
        if (this.field4493 != null) {
            for (int var4 = 0; var4 < this.field4493.length; var4++) {
                this.field4493[var4] = class281.method1906(this.field4493[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpk;Lpk;Lpk;Lpk;I)V")
    public static final void method1743(class99 arg0, class99 arg1, class99 arg2, class99 arg3, int arg4) {
        class285.field5008 = arg1;
        class154.field2670 = arg0;
        class32.field649 = arg2;
        if (arg4 < 88) {
            method1748(40);
        }
        field4492++;
        class8.field113 = arg3;
        class227.field4162 = new class220[class154.field2670.method720(19680)][];
        class165.field2923 = new boolean[class154.field2670.method720(19680)];
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
    public static final void method1744(int arg0, byte arg1, int arg2) {
        field4506++;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class19.field315[arg0];
        int var5 = class62.field1129[arg0];
        if (arg2 == 0) {
            class87.field1586++;
            class261.field4645.method767(54, (byte) 32);
            class261.field4645.method1041(true, var3 - (-var3 - 3));
        }
        if (arg2 == 1) {
            class261.field4645.method767(13, (byte) 70);
            class261.field4645.method1041(true, var3 + var3 + 14 + 3);
            class241.field4398++;
        }
        if (arg2 == 2) {
            class178.field3213++;
            class261.field4645.method767(252, (byte) 22);
            class261.field4645.method1041(true, var3 + var3 + 3);
        }
        class261.field4645.method1061(var4 + class21.field349, false);
        int var6 = -115 / ((-arg1 - 10) / 46);
        class261.field4645.method1033((byte) 16, class180.field3231 + var5);
        class117.field2015 = class19.field315[0];
        class233.field4282 = class62.field1129[0];
        for (int var7 = 1; var7 < var3; var7++) {
            arg0--;
            class261.field4645.method1077(164652616, class19.field315[arg0] - var4);
            class261.field4645.method1041(true, class62.field1129[arg0] - var5);
        }
        class261.field4645.method1041(true, class165.field2920[82] ? 1 : 0);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V")
    public static final void method1745(byte arg0) {
        field4491++;
        if (arg0 > -113) {
            method1745((byte) 93);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class140.field2431[var1] = true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILv;I)V")
    private final void method1746(int arg0, class149 arg1, int arg2) {
        field4497++;
        if (arg0 != -1) {
            this.method1749(-92, (byte) 58);
        }
        if (arg2 == 1) {
            this.field4505 = arg1.method1034(arg0 ^ 0x6A53);
        } else if (arg2 == 2) {
            int var7 = arg1.method1045((byte) 123);
            this.field4489 = new int[var7];
            this.field4493 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4493[var8] = arg1.method1050(1272006568);
                int var9 = arg1.method1045((byte) -49);
                if (var9 == 0) {
                    this.field4489[var8] = -1;
                } else {
                    this.field4489[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1045((byte) 82);
            this.field4499 = new int[var4];
            this.field4503 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4499[var5] = arg1.method1050(arg0 + 1272006569);
                int var6 = arg1.method1045((byte) -48);
                if (var6 == 0) {
                    this.field4503[var5] = -1;
                } else {
                    this.field4503[var5] = var6;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I")
    public final int method1747(int arg0, int arg1) {
        field4502++;
        if (this.field4493 == null) {
            return -1;
        }
        int var3 = -45 / ((-arg0 - 2) / 54);
        for (int var4 = 0; var4 < this.field4493.length; var4++) {
            if (this.field4489[var4] == arg1) {
                return this.field4493[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static void method1748(int arg0) {
        field4495 = null;
        field4498 = null;
        if (arg0 != -11122) {
            field4498 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)I")
    public final int method1749(int arg0, byte arg1) {
        field4501++;
        if (this.field4499 == null) {
            return -1;
        }
        if (arg1 != -11) {
            this.field4505 = null;
        }
        for (int var3 = 0; var3 < this.field4499.length; var3++) {
            if (this.field4503[var3] == arg0) {
                return this.field4499[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(IB)V")
    public static final void method1750(int arg0, byte arg1) {
        class78.field1417 = false;
        class221.field4065 = 1;
        class138.field2386 = -1;
        class165.field2924 = arg0;
        class92.field1636 = -1;
        class288.field5147 = 0;
        class88.field1597 = null;
        if (arg1 >= -70) {
            field4495 = null;
        }
        field4500++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lv;I)V")
    public final void method1751(class149 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1045((byte) 122);
            if (var3 == 0) {
                if (arg1 != -7206) {
                    this.field4499 = null;
                }
                field4494++;
                return;
            }
            this.method1746(arg1 + 7205, arg0, var3);
        }
    }
}
