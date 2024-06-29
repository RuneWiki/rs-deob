import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class188 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[B")
    private byte[] field2790;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[I")
    private int[] field2792;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    private int[] field2791;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2794 = "Take";

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2793 = new String[100];

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lck;")
    public static class267 field2802;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BIII[B)I")
    public final int method1343(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2800++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = arg2;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field2791[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var12;
            if ((var12 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var13;
            if ((var13 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var14;
            if ((var14 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var15;
            if ((var15 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var16;
            if ((var16 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var17;
            if ((var17 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2791[var8];
            }
            int var18;
            if ((var18 = this.field2791[var8]) < 0) {
                arg5[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BII[BIB)I")
    public final int method1344(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        field2798++;
        int var7 = arg2 + arg4;
        int var8 = -33 / ((6 - arg5) / 57);
        int var9 = 0;
        int var10 = arg1 << 3;
        while (var7 > arg4) {
            int var11 = arg0[arg4] & 0xFF;
            int var12 = this.field2792[var11];
            byte var13 = this.field2790[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            var10 += var13;
            int var16 = var9 & -var15 >> 31;
            int var17 = (var15 - (1 - var13) >> 3) + var14;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var9 = class200.method1408(var16, var12 >>> var18));
            if (var14 < var17) {
                var14++;
                var15 = var18 - 8;
                arg3[var14] = (byte) (var9 = var12 >>> var15);
                if (var14 < var17) {
                    var14++;
                    var15 -= 8;
                    arg3[var14] = (byte) (var9 = var12 >>> var15);
                    if (var14 < var17) {
                        var15 -= 8;
                        var14++;
                        arg3[var14] = (byte) (var9 = var12 >>> var15);
                        if (var17 > var14) {
                            var15 -= 8;
                            var14++;
                            arg3[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var10 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method1345(boolean arg0) {
        if (arg0) {
            method1348(126);
        }
        field2802 = null;
        field2793 = null;
        field2794 = null;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
    public class188(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field2790 = arg0;
        int var4 = 0;
        this.field2792 = new int[var2];
        this.field2791 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2792[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class200.method1408(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2791[var14] == 0) {
                            this.field2791[var14] = var4;
                        }
                        var14 = this.field2791[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field2791.length) {
                        int[] var18 = new int[this.field2791.length * 2];
                        for (int var19 = 0; var19 < this.field2791.length; var19++) {
                            var18[var19] = this.field2791[var19];
                        }
                        this.field2791 = var18;
                    }
                }
                this.field2791[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method1346(boolean arg0, String arg1) {
        field2797++;
        if (arg0) {
            method1347(26);
        }
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class281.method1943(var6, (byte) -86);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method1347(int arg0) {
        if (arg0 != 30728) {
            return;
        }
        field2801++;
        int var1 = class92.field1488.method688((byte) -120, 8);
        if (var1 < class103.field1791) {
            for (int var2 = var1; var2 < class103.field1791; var2++) {
                class287.field4605[class106.field1815++] = class162.field2518[var2];
            }
        }
        if (var1 > class103.field1791) {
            throw new RuntimeException("gppov1");
        }
        class103.field1791 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class162.field2518[var3];
            class207 var5 = class92.field1475[var4];
            int var6 = class92.field1488.method688((byte) 40, 1);
            if (var6 == 0) {
                class162.field2518[class103.field1791++] = var4;
                var5.field3749 = class199.field2930;
            } else {
                int var7 = class92.field1488.method688((byte) 67, 2);
                if (var7 == 0) {
                    class162.field2518[class103.field1791++] = var4;
                    var5.field3749 = class199.field2930;
                    class48.field670[class284.field4574++] = var4;
                } else if (var7 == 1) {
                    class162.field2518[class103.field1791++] = var4;
                    var5.field3749 = class199.field2930;
                    int var8 = class92.field1488.method688((byte) -109, 3);
                    var5.method1711(var8, arg0 - 15017, 1);
                    int var9 = class92.field1488.method688((byte) -102, 1);
                    if (var9 == 1) {
                        class48.field670[class284.field4574++] = var4;
                    }
                } else if (var7 == 2) {
                    class162.field2518[class103.field1791++] = var4;
                    var5.field3749 = class199.field2930;
                    if (class92.field1488.method688((byte) -114, 1) == 1) {
                        int var10 = class92.field1488.method688((byte) 27, 3);
                        var5.method1711(var10, 15711, 2);
                        int var11 = class92.field1488.method688((byte) -112, 3);
                        var5.method1711(var11, 15711, 2);
                    } else {
                        int var12 = class92.field1488.method688((byte) -125, 3);
                        var5.method1711(var12, 15711, 0);
                    }
                    int var13 = class92.field1488.method688((byte) 29, 1);
                    if (var13 == 1) {
                        class48.field670[class284.field4574++] = var4;
                    }
                } else if (var7 == 3) {
                    class287.field4605[class106.field1815++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        int var1 = -1 / ((arg0 - 12) / 40);
        class240 var2 = class34.field431;
        synchronized (class34.field431) {
            class254.field3835 = class86.field1365;
            class273.field4409++;
            if (class241.field3538 >= 0) {
                while (class241.field3538 != class110.field1844) {
                    int var4 = class136.field2218[class110.field1844];
                    class110.field1844 = class110.field1844 + 1 & 0x7F;
                    if (var4 >= 0) {
                        class82.field1326[var4] = true;
                    } else {
                        class82.field1326[~var4] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class82.field1326[var3] = false;
                }
                class241.field3538 = class110.field1844;
            }
            class86.field1365 = class275.field4457;
        }
        field2796++;
    }
}
