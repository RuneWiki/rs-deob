import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class244 extends class78 {

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "[Lsj;")
    public static class56[] field3772 = new class56[4];

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3771 = "glow2:";

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Lsa;")
    private class110 field3776;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1730(byte arg0) {
        field3769++;
        if (arg0 != -116) {
            method1736((class101) null, (byte) 52);
        }
        for (class297 var1 = (class297) class221.field3547.method1490(200); var1 != null; var1 = (class297) class221.field3547.method1487((byte) 117)) {
            if (var1.field4690 > 0) {
                var1.field4690--;
            }
            if (var1.field4690 != 0) {
                if (var1.field4684 > 0) {
                    var1.field4684--;
                }
                if (var1.field4684 == 0 && var1.field4694 >= 1 && var1.field4685 >= 1 && var1.field4694 <= 102 && var1.field4685 <= 102 && (var1.field4696 < 0 || class60.method441(var1.field4682, 11, var1.field4696))) {
                    class300.method2091(var1.field4692, var1.field4693, var1.field4694, 32752, var1.field4685, var1.field4682, var1.field4696, var1.field4689);
                    var1.field4684 = -1;
                    if (var1.field4696 == var1.field4687 && var1.field4687 == -1) {
                        var1.method1701(-95);
                    } else if (var1.field4696 == var1.field4687 && var1.field4691 == var1.field4689 && var1.field4683 == var1.field4682) {
                        var1.method1701(arg0 ^ 0x3);
                    }
                }
            } else if (var1.field4687 < 0 || class60.method441(var1.field4683, arg0 + 127, var1.field4687)) {
                class300.method2091(var1.field4692, var1.field4693, var1.field4694, arg0 ^ 0xFFFF807C, var1.field4685, var1.field4683, var1.field4687, var1.field4691);
                var1.method1701(-116);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lob;III)V", line = 60)
    public static final void method1731(class292 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 249) {
            method1730((byte) 72);
        }
        field3768++;
        if (class65.field1062 < 2 && class152.field2451 == 0 && !class219.field3514) {
            return;
        }
        String var4 = class23.method164(true);
        if (arg0 == null) {
            int var6 = class95.field1558.method1019(var4, arg2 + 4, arg3 + 15, 16777215, 0, class272.field4208, class101.field1696);
            class77.method567(15, arg2 + 4, class95.field1558.method1035(var4) - -var6, 0, arg3);
            return;
        }
        class135 var5 = arg0.method2050((byte) -22, class224.field3600);
        if (var5 == null) {
            var5 = class95.field1558;
        }
        var5.method1027(var4, arg2, arg3, arg0.field4608, arg0.field4499, arg0.field4538, arg0.field4539, arg0.field4573, arg0.field4506, class272.field4208, class101.field1696, class207.field3271);
        class77.method567(class207.field3271[3], class207.field3271[0], class207.field3271[2], 0, class207.field3271[1]);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILpe;)V", line = 95)
    private final void method1732(int arg0, int arg1, class101 arg2) {
        field3770++;
        if (arg0 != arg1) {
            return;
        }
        int var4 = arg2.method741(35);
        if (this.field3776 == null) {
            int var5 = class210.method1532(-1429694904, var4);
            this.field3776 = new class110(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method741(85) == 1;
            int var8 = arg2.method776(-1574267376);
            class240 var9;
            if (var7) {
                var9 = new class61(arg2.method749((byte) -65));
            } else {
                var9 = new class250(arg2.method775(arg1 ^ 0xFFFFFF63));
            }
            this.field3776.method845(var9, (byte) 79, (long) var8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)Z", line = 140)
    public static final boolean method1733(int arg0) {
        field3773++;
        if (arg0 != -1482) {
            field3772 = (class56[]) null;
        }
        if (class280.field4332) {
            try {
                return !(Boolean) class49.method379(class83.field1235.field5052, (byte) 51, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lpe;B)V", line = 168)
    public final void method1734(class101 arg0, byte arg1) {
        if (arg1 > -13) {
            return;
        }
        while (true) {
            int var3 = arg0.method741(69);
            if (var3 == 0) {
                field3777++;
                return;
            }
            this.method1732(var3, 249, arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;", line = 193)
    public final String method1735(byte arg0, String arg1, int arg2) {
        field3775++;
        if (arg0 > -28) {
            this.field3776 = (class110) null;
        }
        if (this.field3776 == null) {
            return arg1;
        } else {
            class61 var4 = (class61) this.field3776.method833(false, (long) arg2);
            return var4 == null ? arg1 : var4.field950;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lpe;B)V", line = 213)
    public static final void method1736(class101 arg0, byte arg1) {
        if (arg1 != -55) {
            method1733(-53);
        }
        field3778++;
        while (true) {
            while (arg0.field1661.length > arg0.field1667) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method741(arg1 + 90) == 1) {
                    var3 = arg0.method741(arg1 ^ 0xFFFFFFA7);
                    var4 = arg0.method741(34);
                    var2 = true;
                }
                int var5 = arg0.method741(arg1 ^ 0xFFFFFF8E);
                int var6 = arg0.method741(123);
                int var7 = class70.field1107 + class279.field4316 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class310.field4885;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class79.field1208 && class279.field4316 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < (var3 * 8 + 8) && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method727((byte) 126);
                                if (var13 != 0) {
                                    if (class168.field2607[var9][var10] == null) {
                                        class168.field2607[var9][var10] = new byte[4096];
                                    }
                                    class168.field2607[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method727((byte) 127);
                                    if (class139.field2218[var9][var10] == null) {
                                        class139.field2218[var9][var10] = new byte[4096];
                                    }
                                    class139.field2218[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method727((byte) 125);
                        if (var16 != 0) {
                            arg0.field1667++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(BII)I", line = 313)
    public final int method1737(byte arg0, int arg1, int arg2) {
        field3774++;
        if (this.field3776 == null) {
            return arg1;
        }
        class250 var4 = (class250) this.field3776.method833(false, (long) arg2);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 != -59) {
                field3771 = (String) null;
            }
            return var4.field3858;
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V", line = 345)
    public static void method1738(int arg0) {
        if (arg0 != -344623610) {
            field3771 = (String) null;
        }
        field3771 = null;
        field3772 = null;
    }
}
