import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class193 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lwda;")
    public class544 field2331 = new class544();

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[[I")
    public static int[][] field2340 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[Z")
    public static boolean[] field2327 = new boolean[8];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lwda;")
    private class544 field2342;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[Let;")
    public static class509[] field2337;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lwda;I)V")
    public final void method1040(class544 arg0, int arg1) {
        if (arg1 > -89) {
            this.method1044(null, 125);
        }
        if (arg0.field7965 != null) {
            arg0.method3187(true);
        }
        field2325++;
        arg0.field7965 = this.field2331.field7965;
        arg0.field7964 = this.field2331;
        arg0.field7965.field7964 = arg0;
        arg0.field7964.field7965 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lwda;ILui;)V")
    private final void method1041(class544 arg0, int arg1, class193 arg2) {
        field2329++;
        if (arg1 != 70) {
            this.method1041(null, 71, null);
        }
        class544 var4 = this.field2331.field7965;
        this.field2331.field7965 = arg0.field7965;
        arg0.field7965.field7964 = this.field2331;
        if (this.field2331 != arg0) {
            arg0.field7965 = arg2.field2331.field7965;
            arg0.field7965.field7964 = arg0;
            arg2.field2331.field7965 = var4;
            var4.field7964 = arg2.field2331;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lwda;")
    public final class544 method1042(int arg0) {
        field2336++;
        class544 var2 = this.field2331.field7965;
        if (this.field2331 == var2) {
            this.field2342 = null;
            return null;
        }
        this.field2342 = var2.field7965;
        if (arg0 != 2) {
            field2337 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z")
    public final boolean method1043(boolean arg0) {
        if (!arg0) {
            this.method1051(-50);
        }
        field2326++;
        return this.field2331.field7964 == this.field2331;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lui;I)V")
    public final void method1044(class193 arg0, int arg1) {
        this.method1041(this.field2331.field7964, 70, arg0);
        if (arg1 != -24223) {
            method1052(-58);
        }
        field2341++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ln;ILqa;)V")
    public static final void method1045(class17 arg0, int arg1, class206 arg2) {
        field2332++;
        int var3 = -45 % ((arg1 + 37) / 56);
        if (class353.field4591 == null) {
            return;
        }
        if (class138.field1682 < 10) {
            if (!class353.field4590.method2578(-94, class353.field4591.field1197)) {
                class138.field1682 = class584.field8486.method2577(class353.field4591.field1197, 0) / 10;
                return;
            }
            class118.method692((byte) 91);
            class138.field1682 = 10;
        }
        if (class138.field1682 == 10) {
            class353.field4621 = class353.field4591.field1200 >> 6 << 6;
            class353.field4607 = class353.field4591.field1205 >> 6 << 6;
            class353.field4623 = (class353.field4591.field1201 >> 6 << 6) + 64 - class353.field4621;
            class353.field4615 = (class353.field4591.field1203 >> 6 << 6) + 64 - class353.field4607;
            int[] var4 = new int[3];
            int var5 = -1;
            int var6 = -1;
            if (class353.field4591.method603(true, var4, (class103.field1265.field8661 >> 7) + class632.field9113, (class103.field1265.field8652 >> 7) + class119.field1504, class103.field1265.field8660)) {
                var5 = var4[1] - class353.field4621;
                var6 = var4[2] - class353.field4607;
            }
            if (!class105.field1276 && var5 >= 0 && class353.field4623 > var5 && var6 >= 0 && var6 < class353.field4615) {
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var8 = var6 + (int) (Math.random() * 10.0D) - 5;
                class34.field273 = var8;
                class619.field8945 = var7;
            } else if (class60.field584 == -1 || class224.field2761 == -1) {
                class353.field4591.method601(0, var4, class353.field4591.field1198 & 0x3FFF, (class353.field4591.field1198 & 0xFFFCD9E) >> 14);
                class619.field8945 = var4[1] - class353.field4621;
                class34.field273 = var4[2] - class353.field4607;
            } else {
                class353.field4591.method601(0, var4, class224.field2761, class60.field584);
                class105.field1276 = false;
                class224.field2761 = -1;
                class60.field584 = -1;
                if (var4 != null) {
                    class619.field8945 = var4[1] - class353.field4621;
                    class34.field273 = var4[2] - class353.field4607;
                }
            }
            if (class353.field4591.field1210 == 37) {
                class353.field4602 = 3.0F;
                class353.field4605 = 3.0F;
            } else if (class353.field4591.field1210 == 50) {
                class353.field4602 = 4.0F;
                class353.field4605 = 4.0F;
            } else if (class353.field4591.field1210 == 75) {
                class353.field4602 = 6.0F;
                class353.field4605 = 6.0F;
            } else if (class353.field4591.field1210 == 100) {
                class353.field4602 = 8.0F;
                class353.field4605 = 8.0F;
            } else if (class353.field4591.field1210 == 200) {
                class353.field4602 = 16.0F;
                class353.field4605 = 16.0F;
            } else {
                class353.field4602 = 8.0F;
                class353.field4605 = 8.0F;
            }
            class353.field4601 = (int) class353.field4602 >> 1;
            class353.field4603 = class218.method1256(class353.field4601, (byte) -102);
            class182.method999((byte) 66);
            class353.method1984();
            class22.field146 = new class193();
            class353.field4600 += (int) (Math.random() * 5.0D) - 2;
            if (class353.field4600 < -8) {
                class353.field4600 = -8;
            }
            if (class353.field4600 > 8) {
                class353.field4600 = 8;
            }
            class353.field4598 += (int) (Math.random() * 5.0D) - 2;
            if (class353.field4598 < -16) {
                class353.field4598 = -16;
            }
            if (class353.field4598 > 16) {
                class353.field4598 = 16;
            }
            class353.method1980(arg0, class353.field4600 >> 2 << 10, class353.field4598 >> 1);
            class353.field4587.method3246(1024, 256, false);
            class353.field4589.method3423(256, 27936, 256);
            class353.field4592.method1750(38, 4096);
            class530.field7446.method2056(128, 256);
            class138.field1682 = 20;
        } else if (class138.field1682 == 20) {
            class503.method2906(true, (byte) 75);
            class353.method1971(arg2, class353.field4600, class353.field4598);
            class138.field1682 = 60;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 60) {
            if (class353.field4590.method2553((byte) 125, class353.field4591.field1197 + "_staticelements")) {
                if (!class353.field4590.method2578(-119, class353.field4591.field1197 + "_staticelements")) {
                    return;
                }
                class353.field4596 = class236.method1339((byte) -82, class353.field4590, class353.field4591.field1197 + "_staticelements", class170.field2073);
            } else {
                class353.field4596 = new class342(0);
            }
            class353.method1970();
            class138.field1682 = 70;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 70) {
            class185.field2240 = new class287(arg2, 11, true, class41.field331);
            class138.field1682 = 73;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 73) {
            class516.field7284 = new class287(arg2, 12, true, class41.field331);
            class138.field1682 = 76;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 76) {
            class461.field6362 = new class287(arg2, 14, true, class41.field331);
            class138.field1682 = 79;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 79) {
            class145.field1749 = new class287(arg2, 17, true, class41.field331);
            class138.field1682 = 82;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 82) {
            class438.field6043 = new class287(arg2, 19, true, class41.field331);
            class138.field1682 = 85;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 85) {
            class467.field6533 = new class287(arg2, 22, true, class41.field331);
            class138.field1682 = 88;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else if (class138.field1682 == 88) {
            class298.field3834 = new class287(arg2, 26, true, class41.field331);
            class138.field1682 = 91;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
        } else {
            class533.field7497 = new class287(arg2, 30, true, class41.field331);
            class138.field1682 = 100;
            class503.method2906(true, (byte) 75);
            class310.method1719(2);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public static final void method1046(int arg0, int arg1) {
        class641 var2 = class341.field4398;
        synchronized (class341.field4398) {
            int var3 = -21 % ((11 - arg1) / 48);
            class341.field4398.method3686((byte) 53, arg0);
        }
        field2344++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lwda;")
    public final class544 method1047(int arg0) {
        field2335++;
        class544 var2 = this.field2342;
        if (this.field2331 == var2) {
            this.field2342 = null;
            return null;
        } else {
            this.field2342 = var2.field7964;
            return arg0 == -7962 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method1048(int arg0) {
        if (arg0 != -7730) {
            return;
        }
        field2330++;
        while (true) {
            class544 var2 = this.field2331.field7964;
            if (this.field2331 == var2) {
                this.field2342 = null;
                return;
            }
            var2.method3187(true);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILet;)Let;")
    public static final class509 method1049(int arg0, class509 arg1) {
        if (arg0 > -71) {
            field2340 = null;
        }
        field2328++;
        class509 var2 = client.method1408(arg1);
        if (var2 == null) {
            var2 = arg1.field7199;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class193() {
        this.field2331.field7965 = this.field2331;
        this.field2331.field7964 = this.field2331;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Lwda;")
    public final class544 method1050(byte arg0) {
        field2343++;
        class544 var2 = this.field2331.field7964;
        if (arg0 != 73) {
            return null;
        } else if (this.field2331 == var2) {
            this.field2342 = null;
            return null;
        } else {
            this.field2342 = var2.field7964;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Lwda;")
    public final class544 method1051(int arg0) {
        field2334++;
        class544 var2 = this.field2342;
        if (this.field2331 == var2) {
            this.field2342 = null;
            return null;
        }
        if (arg0 != 9584) {
            field2337 = null;
        }
        this.field2342 = var2.field7965;
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public static void method1052(int arg0) {
        field2340 = null;
        field2337 = null;
        if (arg0 != 16) {
            method1052(-101);
        }
        field2327 = null;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lwda;I)V")
    public final void method1053(class544 arg0, int arg1) {
        if (arg1 != -1) {
            this.method1050((byte) 119);
        }
        if (arg0.field7965 != null) {
            arg0.method3187(true);
        }
        field2333++;
        arg0.field7964 = this.field2331.field7964;
        arg0.field7965 = this.field2331;
        arg0.field7965.field7964 = arg0;
        arg0.field7964.field7965 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Lwda;")
    public final class544 method1054(byte arg0) {
        field2338++;
        if (arg0 != -105) {
            this.field2331 = null;
        }
        class544 var2 = this.field2331.field7964;
        if (this.field2331 == var2) {
            return null;
        } else {
            var2.method3187(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)I")
    public final int method1055(int arg0) {
        field2339++;
        int var2 = arg0;
        class544 var3 = this.field2331.field7964;
        while (this.field2331 != var3) {
            var3 = var3.field7964;
            var2++;
        }
        return var2;
    }
}
