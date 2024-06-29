import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class204 extends class16 {

    @OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
    private int field3336 = 4096;

    @OriginalMember(owner = "client!gl", name = "fb", descriptor = "I")
    private int field3342 = 0;

    @OriginalMember(owner = "client!gl", name = "bb", descriptor = "Lag;")
    public static class123 field3338 = null;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!gl", name = "ab", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!gl", name = "cb", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!gl", name = "db", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "Lkb;")
    public static class39 field3328;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "Lkb;")
    public static class39 field3333;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "[S")
    public static short[] field3329;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(ZI)[I", line = 10)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            this.method54(23, (byte) 121);
        }
        field3339++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3342) {
                    var3[var5] = this.field3342;
                } else if (this.field3336 < var6) {
                    var3[var5] = this.field3336;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Z", line = 49)
    public static final boolean method1498(byte arg0, int arg1) {
        field3340++;
        if (class127.field1897[arg1]) {
            return true;
        } else if (class102.field1561.method263(arg1, (byte) -87)) {
            if (arg0 > -90) {
                method1501(19);
            }
            int var2 = class102.field1561.method261(-124, arg1);
            if (var2 == 0) {
                class127.field1897[arg1] = true;
                return true;
            }
            if (class21.field309[arg1] == null) {
                class21.field309[arg1] = new class160[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class21.field309[arg1][var3] == null) {
                    byte[] var4 = class102.field1561.method250(true, arg1, var3);
                    if (var4 != null) {
                        class160 var5 = class21.field309[arg1][var3] = new class160();
                        var5.field2446 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1103((byte) 76, new class192(var4));
                        } else {
                            var5.method1098(new class192(var4), true);
                        }
                    }
                }
            }
            class127.field1897[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(JI)V", line = 108)
    public static final void method1499(long arg0, int arg1) {
        class21.field313.field3129 = 0;
        field3335++;
        class21.field313.method1365(-32769, 21);
        class21.field313.method1375(arg0, 118);
        int var3 = 73 % ((arg1 + 37) / 60);
        class329.field5116 = 1;
        class102.field1568 = 0;
        class310.field4847 = 0;
        class250.field3976 = -3;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)Lcc;", line = 128)
    public static final class263 method1500(int arg0, int arg1) {
        field3341++;
        class263 var2 = (class263) class314.field4896.method768((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field684.method250(true, 5, arg1);
        if (arg0 != 2) {
            return (class263) null;
        }
        class263 var4 = new class263();
        if (var3 != null) {
            var4.method1879(861954000, new class192(var3));
        }
        class314.field4896.method770(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V", line = 155)
    public static final void method1501(int arg0) {
        class179.method1241(-5280);
        field3337++;
        class281.method1989(arg0 + arg0);
        class42.method293((byte) -118);
        class131.method891(22);
        class272.method1939((byte) 69);
        class206.method1511(29);
        class100.method709(-113);
        class55.method389(8);
        class331.method2288(19220);
        class16.method112(6830);
        class251.method1771((byte) 24);
        class326.method2266(true);
        class261.method1872(18227);
        class86.method626(true);
        class320.method2242((byte) -65);
        class308.method2160(arg0 ^ 0x100);
        class226.method1649(4);
        class119.method832(arg0 - 20717);
        if (class60.field790 != 0) {
            for (int var1 = 0; var1 < class242.field3843.length; var1++) {
                class242.field3843[var1] = null;
            }
            class100.field1530 = 0;
        }
        class154.method1073(115);
        class229.method1661((byte) 107);
        client.field4218.method1623(1);
        if (!class186.field2991) {
            ((class270) class25.field365).method1926(arg0 + 123);
        }
        class17.field225.method765(false);
        class261.field4158.method268(~arg0);
        class66.field865.method268(-1);
        class189.field3077.method268(arg0 - 1);
        class35.field469.method268(-1);
        class239.field3775.method268(-1);
        class139.field2077.method268(-1);
        class182.field2946.method268(-1);
        class149.field2248.method268(-1);
        class283.field4465.method268(-1);
        class187.field3043.method268(-1);
        class305.field4757.method268(-1);
        class187.field3040.method1623(1);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 226)
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I", line = 233)
    public final int[][] method54(int arg0, byte arg1) {
        field3332++;
        int[][] var3 = this.field197.method715(true, arg0);
        int var4 = 72 % ((arg1 - 40) / 41);
        if (this.field197.field1548) {
            int[][] var5 = this.method111(0, (byte) 122, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[0];
            int[] var9 = var5[2];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class276.field4376; var12++) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var9[var12];
                if (this.field3342 > var13) {
                    var8[var12] = this.field3342;
                } else if (this.field3336 < var13) {
                    var8[var12] = this.field3336;
                } else {
                    var8[var12] = var13;
                }
                if (this.field3342 > var14) {
                    var10[var12] = this.field3342;
                } else if (this.field3336 >= var14) {
                    var10[var12] = var14;
                } else {
                    var10[var12] = this.field3336;
                }
                if (var15 < this.field3342) {
                    var11[var12] = this.field3342;
                } else if (var15 > this.field3336) {
                    var11[var12] = this.field3336;
                } else {
                    var11[var12] = var15;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(B)V", line = 309)
    public static void method1502(byte arg0) {
        field3333 = null;
        field3328 = null;
        if (arg0 > -18) {
            method1503(-101);
        }
        field3338 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V", line = 325)
    public static final void method1503(int arg0) {
        field3327++;
        class111.field1657 = null;
        class212.method1547();
        if (arg0 != 0) {
            method1502((byte) -35);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLim;I)V", line = 337)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field3330++;
        if (arg0 != -7) {
            method1503(-77);
        }
        if (arg2 == 0) {
            this.field3342 = arg1.method1396(-88);
        } else if (arg2 == 1) {
            this.field3336 = arg1.method1396(arg0 ^ 0x55);
        } else if (arg2 == 2) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
    }
}
