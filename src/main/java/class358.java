import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class358 {

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public int field4989 = -1;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Lfa;")
    public static class156 field4979;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "Lib;")
    private class106 field4981;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Ljava/lang/String;")
    private String field4984;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "Ljava/lang/String;")
    private String field4988;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "[I")
    private int[] field4975;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "[I")
    private int[] field4976;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "[I")
    private int[] field4978;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[I")
    private int[] field4983;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "[I")
    private int[] field4985;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "[I")
    private int[] field4986;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "[I")
    private int[] field4990;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "[I")
    private int[] field4992;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field4982;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field4995;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "[[I")
    private int[][] field4974;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "[[I")
    private int[][] field4991;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "[[I")
    private int[][] field4993;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static void method2152(byte arg0) {
        if (arg0 != -82) {
            field4979 = null;
        }
        field4979 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public final void method2153(int arg0) {
        if (this.field4988 == null) {
            this.field4988 = this.field4984;
        }
        if (arg0 > -7) {
            this.field4989 = -108;
        }
        field4977++;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Z")
    public static final boolean method2154(byte arg0) {
        field4987++;
        class97 var1 = (class97) class498.field7394.field1918.field3269;
        if (arg0 != -20) {
            field4979 = null;
        }
        if (var1 == null || class498.field7394.field1918 == var1) {
            return false;
        } else {
            if (var1.field1307 >= 2000) {
                var1.field1307 -= 2000;
            }
            return var1.field1307 == 1002;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)I")
    public static final int method2155(int arg0, int arg1, int arg2) {
        field4996++;
        int var3 = arg1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLiv;)V")
    public final void method2156(byte arg0, class65 arg1) {
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                field4994++;
                if (arg0 > 0) {
                    this.method2153(21);
                    return;
                }
                return;
            }
            this.method2158(arg1, var3, 49);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Liv;B)Loc;")
    public static final class136 method2157(class65 arg0, byte arg1) {
        arg0.method577(255);
        field4980++;
        if (arg1 >= -120) {
            method2155(25, -18, 115);
        }
        int var2 = arg0.method577(255);
        class136 var3 = class205.method1433(var2, 35);
        var3.field1951 = arg0.method577(255);
        int var4 = arg0.method577(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method577(255);
            var3.method268(4, var6, arg0);
        }
        var3.method269(false);
        return var3;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Liv;II)V")
    private final void method2158(class65 arg0, int arg1, int arg2) {
        field4973++;
        if (arg2 <= 45) {
            this.method2156((byte) 34, null);
        }
        if (arg1 == 1) {
            this.field4984 = arg0.method584(32);
        } else if (arg1 == 2) {
            this.field4988 = arg0.method584(82);
        } else if (arg1 == 3) {
            int var22 = arg0.method577(255);
            this.field4974 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4974[var23][0] = arg0.method623((byte) -105);
                this.field4974[var23][1] = arg0.method616((byte) 120);
                this.field4974[var23][2] = arg0.method616((byte) 120);
            }
        } else if (arg1 == 4) {
            int var20 = arg0.method577(255);
            this.field4991 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field4991[var21][0] = arg0.method623((byte) -84);
                this.field4991[var21][1] = arg0.method616((byte) 127);
                this.field4991[var21][2] = arg0.method616((byte) 115);
            }
        } else if (arg1 == 5) {
            arg0.method623((byte) -29);
        } else if (arg1 == 6) {
            arg0.method577(255);
        } else if (arg1 == 7) {
            arg0.method577(255);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method577(255);
                return;
            }
            if (arg1 == 10) {
                int var4 = arg0.method577(255);
                this.field4992 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4992[var5] = arg0.method616((byte) 97);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method616((byte) 82);
                return;
            }
            if (arg1 != 13) {
                if (arg1 == 14) {
                    int var6 = arg0.method577(255);
                    this.field4993 = new int[var6][2];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field4993[var7][0] = arg0.method577(255);
                        this.field4993[var7][1] = arg0.method577(255);
                    }
                    return;
                }
                if (arg1 == 15) {
                    arg0.method623((byte) -90);
                    return;
                }
                if (arg1 == 17) {
                    this.field4989 = arg0.method623((byte) 108);
                    return;
                }
                if (arg1 != 18) {
                    if (arg1 == 19) {
                        int var14 = arg0.method577(255);
                        this.field4983 = new int[var14];
                        this.field4995 = new String[var14];
                        this.field4985 = new int[var14];
                        this.field4975 = new int[var14];
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4985[var15] = arg0.method616((byte) 115);
                            this.field4983[var15] = arg0.method616((byte) 101);
                            this.field4975[var15] = arg0.method616((byte) 119);
                            this.field4995[var15] = arg0.method624((byte) -40);
                        }
                    } else if (arg1 == 249) {
                        int var8 = arg0.method577(255);
                        if (this.field4981 == null) {
                            int var9 = class118.method934(var8, 269173057);
                            this.field4981 = new class106(var9);
                        }
                        for (int var10 = 0; var10 < var8; var10++) {
                            boolean var11 = arg0.method577(255) == 1;
                            int var12 = arg0.method580((byte) 29);
                            class223 var13;
                            if (var11) {
                                var13 = new class75(arg0.method624((byte) -40));
                            } else {
                                var13 = new class389(arg0.method616((byte) 90));
                            }
                            this.field4981.method878((long) var12, -2301, var13);
                        }
                        return;
                    }
                    return;
                }
                int var16 = arg0.method577(255);
                this.field4978 = new int[var16];
                this.field4982 = new String[var16];
                this.field4976 = new int[var16];
                this.field4986 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field4986[var17] = arg0.method616((byte) 86);
                    this.field4978[var17] = arg0.method616((byte) 110);
                    this.field4976[var17] = arg0.method616((byte) 73);
                    this.field4982[var17] = arg0.method624((byte) -40);
                }
                return;
            }
            int var18 = arg0.method577(255);
            this.field4990 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field4990[var19] = arg0.method623((byte) -117);
            }
            return;
        }
    }

    static {
        new class331("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field4979 = new class156(4);
    }
}
