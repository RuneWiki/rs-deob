import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class306 {

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "Lnc;")
    private class107 field4826 = null;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Z")
    private boolean field4802;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lnm;")
    private class167 field4787;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Z")
    private boolean field4806;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field4786 = 0;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
    public static int[] field4812 = new int[1000];

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4801 = "Walk here";

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public static int[] field4793 = new int[128];

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[Ljava/lang/Object;")
    private Object[] field4809;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4792;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method2078(byte arg0) {
        if (arg0 != -69) {
            this.field4792 = (Object[][]) ((Object[][]) null);
        }
        field4807++;
        if (!this.method2091(126)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4826.field1649.length; var3++) {
            int var4 = this.field4826.field1649[var3];
            if (this.field4809[var4] == null) {
                this.method2090(var4, arg0 - 1054);
                if (this.field4809[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 51)
    public static void method2079(int arg0) {
        field4812 = null;
        field4793 = null;
        if (arg0 != 10237) {
            method2098(9, -13);
        }
        field4801 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I", line = 68)
    public final int[] method2080(int arg0, int arg1) {
        field4816++;
        if (!this.method2096((byte) -119, arg1)) {
            return null;
        } else if (arg0 == 2820) {
            int[] var3 = this.field4826.field1640[arg1];
            if (var3 == null) {
                var3 = new int[this.field4826.field1633[arg1]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II[I)Z", line = 98)
    private final boolean method2081(int arg0, int arg1, int[] arg2) {
        field4818++;
        if (!this.method2096((byte) -84, arg0)) {
            return false;
        } else if (this.field4809[arg0] == null) {
            return false;
        } else {
            int var4 = this.field4826.field1633[arg0];
            int[] var5 = this.field4826.field1640[arg0];
            if (this.field4792[arg0] == null) {
                this.field4792[arg0] = new Object[this.field4826.field1634[arg0]];
            }
            boolean var6 = true;
            Object[] var7 = this.field4792[arg0];
            if (arg1 != 5024) {
                this.method2104(40);
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var10 = class14.method116(this.field4809[arg0], true, -14046);
                class303 var11 = new class303(var10);
                var11.method2040(5, arg2, var11.field4716.length, -30388);
            } else {
                var10 = class14.method116(this.field4809[arg0], false, -14046);
            }
            byte[] var12;
            try {
                var12 = class339.method2343(55, var10);
            } catch (RuntimeException var31) {
                throw class15.method117(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class23.method175(var10, var10.length, -127) + "," + class23.method175(var10, var10.length - 2, arg1 + -5143) + "," + this.field4826.field1645[arg0] + "," + this.field4826.field1653);
            }
            if (this.field4806) {
                this.field4809[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var15 * 4 * var4;
                int[] var17 = new int[var4];
                class303 var18 = new class303(var12);
                var18.field4679 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 == null) {
                        }
                        var20 += var18.method1996(90);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var18.field4679 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var18.method1996(arg1 ^ 0xFFFFEC2D);
                        class223.method1501(var12, var24, var22[var27], var17[var27], var26);
                        var24 += var26;
                        var17[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field4802) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class173.method1176(-27928, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field4802) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class173.method1176(-27928, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 290)
    public final void method2082(int arg0) {
        field4797++;
        if (this.field4792 != null) {
            for (int var2 = 0; var2 < this.field4792.length; var2++) {
                this.field4792[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method2083(-37, -75, 11);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)[B", line = 311)
    public final byte[] method2083(int arg0, int arg1, int arg2) {
        field4814++;
        if (!this.method2099(0, arg0, arg1)) {
            return null;
        }
        if (this.field4792[arg0] == null || this.field4792[arg0][arg1] == null) {
            boolean var4 = this.method2081(arg0, 5024, (int[]) null);
            if (!var4) {
                this.method2090(arg0, -1123);
                boolean var5 = this.method2081(arg0, 5024, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg2 >= -65) {
            this.method2105(127, 73);
        }
        return class14.method116(this.field4792[arg0][arg1], false, -14046);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;)V", line = 344)
    public final void method2084(int arg0, String arg1) {
        field4830++;
        if (arg0 != -2) {
            this.method2096((byte) -104, -116);
        }
        if (this.method2091(109)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4826.field1642.method1612(-9812, class221.method1476(593474565, var3));
            this.method2095(false, var4);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILjava/lang/String;)I", line = 361)
    public final int method2085(int arg0, String arg1) {
        field4822++;
        if (this.method2091(arg0 + 122)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4826.field1642.method1612(arg0 - 9811, class221.method1476(593474565, var3));
            return arg0 == -1 ? this.method2089(var4, (byte) -29) : -96;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)I", line = 380)
    public final int method2086(int arg0, int arg1) {
        field4798++;
        if (arg0 != 0) {
            field4820 = -6;
        }
        return this.method2096((byte) -91, arg1) ? this.field4826.field1634[arg1] : 0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 394)
    public final boolean method2087(String arg0, String arg1, int arg2) {
        field4795++;
        if (!this.method2091(104)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 != -76) {
            method2098(-78, 20);
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field4826.field1642.method1612(-9812, class221.method1476(593474565, var4));
        if (this.method2096((byte) -113, var6)) {
            int var7 = this.field4826.field1646[var6].method1612(arg2 ^ 0x2618, class221.method1476(593474565, var5));
            return this.method2100(var7, true, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIZ)V", line = 419)
    public final void method2088(boolean arg0, int arg1, boolean arg2) {
        field4817++;
        if (!this.method2091(116)) {
            return;
        }
        if (arg2) {
            this.field4826.field1646 = null;
            this.field4826.field1637 = (int[][]) null;
        }
        if (arg0) {
            this.field4826.field1654 = null;
            this.field4826.field1642 = null;
        }
        if (arg1 != 675) {
            this.field4809 = (Object[]) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)I", line = 449)
    private final int method2089(int arg0, byte arg1) {
        field4824++;
        if (arg1 != -29) {
            this.field4802 = false;
        }
        if (this.method2096((byte) -82, arg0)) {
            return this.field4809[arg0] == null ? this.field4787.method1139(arg0, (byte) 84) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)V", line = 474)
    private final void method2090(int arg0, int arg1) {
        field4789++;
        if (this.field4806) {
            this.field4809[arg0] = this.field4787.method1140(0, arg0);
        } else {
            this.field4809[arg0] = class173.method1176(-27928, false, this.field4787.method1140(arg1 + 1123, arg0));
        }
        if (arg1 != -1123) {
            this.method2082(-101);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Z", line = 489)
    private final boolean method2091(int arg0) {
        field4796++;
        if (this.field4826 == null) {
            this.field4826 = this.field4787.method1136((byte) 58);
            if (this.field4826 == null) {
                return false;
            }
            this.field4809 = new Object[this.field4826.field1655];
            this.field4792 = new Object[this.field4826.field1655][];
        }
        if (arg0 < 103) {
            this.method2108((String) null, -69);
        }
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I", line = 517)
    public final int method2092(int arg0) {
        if (arg0 == -1) {
            field4788++;
            return this.method2091(127) ? this.field4826.field1634.length : -1;
        } else {
            return 68;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)Z", line = 533)
    public final boolean method2093(int arg0, int arg1) {
        int var3 = -106 / ((-arg0 - 11) / 33);
        field4790++;
        if (!this.method2091(109)) {
            return false;
        } else if (this.field4826.field1634.length == 1) {
            return this.method2100(arg1, true, 0);
        } else if (!this.method2096((byte) -91, arg1)) {
            return false;
        } else if (this.field4826.field1634[arg1] == 1) {
            return this.method2100(0, true, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)V", line = 563)
    public final void method2094(int arg0, byte arg1) {
        field4811++;
        if (this.method2096((byte) -116, arg0)) {
            int var3 = 81 % ((arg1 + 3) / 36);
            if (this.field4792 != null) {
                this.field4792[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V", line = 583)
    private final void method2095(boolean arg0, int arg1) {
        if (arg0) {
            this.method2096((byte) -117, 91);
        }
        this.field4787.method1141(arg1, -2);
        field4815++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Z", line = 596)
    private final boolean method2096(byte arg0, int arg1) {
        field4819++;
        if (arg0 >= -81) {
            return false;
        } else if (!this.method2091(123)) {
            return false;
        } else if (arg1 >= 0 && this.field4826.field1634.length > arg1 && this.field4826.field1634[arg1] != 0) {
            return true;
        } else if (class240.field3810) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B", line = 619)
    public final byte[] method2097(String arg0, String arg1, byte arg2) {
        field4799++;
        if (!this.method2091(126)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        if (arg2 != 29) {
            this.method2097((String) null, (String) null, (byte) 76);
        }
        int var6 = this.field4826.field1642.method1612(arg2 ^ 0xFFFFD9B1, class221.method1476(593474565, var4));
        if (this.method2096((byte) -107, var6)) {
            int var7 = this.field4826.field1646[var6].method1612(-9812, class221.method1476(593474565, var5));
            return this.method2103(arg2 ^ 0x1D, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(II)V", line = 644)
    public static final void method2098(int arg0, int arg1) {
        field4828++;
        if (arg0 == 37) {
            class246.field3863 = 3.0F;
        } else if (arg0 == 50) {
            class246.field3863 = 4.0F;
        } else if (arg0 == 75) {
            class246.field3863 = 6.0F;
        } else if (arg0 == 100) {
            class246.field3863 = 8.0F;
        } else if (arg0 == 200) {
            class246.field3863 = 16.0F;
        }
        class324.field5050 = -1;
        class324.field5050 = -1;
        if (arg1 < 6) {
            field4793 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)Z", line = 680)
    private final boolean method2099(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field4792 = (Object[][]) ((Object[][]) null);
        }
        field4823++;
        if (!this.method2091(116)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field4826.field1634.length > arg1 && this.field4826.field1634[arg1] > arg2) {
            return true;
        } else if (class240.field3810) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)Z", line = 704)
    public final boolean method2100(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2090(66, 32);
        }
        field4829++;
        if (!this.method2099(0, arg2, arg0)) {
            return false;
        } else if (this.field4792[arg2] != null && this.field4792[arg2][arg0] != null) {
            return true;
        } else if (this.field4809[arg2] == null) {
            this.method2090(arg2, -1123);
            return this.field4809[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 737)
    public final boolean method2101(String arg0, int arg1) {
        field4813++;
        if (this.method2091(115)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4826.field1642.method1612(-9812, class221.method1476(arg1 + 593474565, var3));
            return arg1 <= var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(II)[B", line = 761)
    public final byte[] method2102(int arg0, int arg1) {
        field4808++;
        if (!this.method2091(arg1 ^ 0x7D)) {
            return null;
        } else if (this.field4826.field1634.length == arg1) {
            return this.method2103(0, 0, arg0);
        } else if (!this.method2096((byte) -112, arg0)) {
            return null;
        } else if (this.field4826.field1634[arg0] == 1) {
            return this.method2103(0, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)[B", line = 789)
    public final byte[] method2103(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method2083(-114, 96, 92);
        }
        field4803++;
        return this.method2109(-11584, (int[]) null, arg1, arg2);
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)I", line = 802)
    public final int method2104(int arg0) {
        field4804++;
        if (arg0 != 0) {
            this.field4792 = (Object[][]) ((Object[][]) null);
        }
        if (!this.method2091(arg0 ^ 0x6A)) {
            throw new IllegalStateException("");
        }
        return this.field4826.field1653;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(II)Z", line = 820)
    public final boolean method2105(int arg0, int arg1) {
        field4825++;
        if (!this.method2096((byte) -107, arg1)) {
            return false;
        } else if (this.field4809[arg1] == null) {
            this.method2090(arg1, -1123);
            if (arg0 != 30835) {
                this.method2109(-19, (int[]) null, 5, -73);
            }
            return this.field4809[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)I", line = 844)
    public final int method2106(int arg0) {
        field4821++;
        if (!this.method2091(116)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4809.length; var4++) {
            if (this.field4826.field1633[var4] > 0) {
                var3 += 100;
                var2 += this.method2089(var4, (byte) -29);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return arg0 * var2 / var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lnm;ZZ)V", line = 883)
    public class306(class167 arg0, boolean arg1, boolean arg2) {
        this.field4802 = arg2;
        this.field4787 = arg0;
        this.field4806 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 900)
    public final int method2107(String arg0, byte arg1) {
        field4805++;
        if (!this.method2091(120)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4826.field1642.method1612(-9812, class221.method1476(593474565, var3));
        if (this.method2096((byte) -102, var4)) {
            return arg1 <= 114 ? -98 : var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 921)
    public final boolean method2108(String arg0, int arg1) {
        field4800++;
        if (!this.method2091(107)) {
            return false;
        } else if (arg1 == 0) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4826.field1642.method1612(-9812, class221.method1476(593474565, var3));
            return this.method2105(30835, var4);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[III)[B", line = 942)
    public final byte[] method2109(int arg0, int[] arg1, int arg2, int arg3) {
        field4794++;
        if (!this.method2099(0, arg2, arg3)) {
            return null;
        }
        if (this.field4792[arg2] == null || this.field4792[arg2][arg3] == null) {
            boolean var5 = this.method2081(arg2, 5024, arg1);
            if (!var5) {
                this.method2090(arg2, -1123);
                boolean var6 = this.method2081(arg2, 5024, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class14.method116(this.field4792[arg2][arg3], false, -14046);
        if (arg0 != -11584) {
            this.field4809 = (Object[]) null;
        }
        if (this.field4802) {
            this.field4792[arg2][arg3] = null;
            if (this.field4826.field1634[arg2] == 1) {
                this.field4792[arg2] = null;
            }
        }
        return var7;
    }
}
