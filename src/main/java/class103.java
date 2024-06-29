import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class103 extends class129 {

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "[I")
    private int[] field2546 = new int[6];

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "Z")
    public boolean field2567 = false;

    @OriginalMember(owner = "client!ra", name = "ub", descriptor = "[I")
    private int[] field2569 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "[I")
    private int[] field2565 = new int[6];

    @OriginalMember(owner = "client!ra", name = "wb", descriptor = "I")
    public int field2571 = -1;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "[I")
    public static int[] field2541 = new int[5];

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "Lv;")
    public static class122 field2552 = class55.method425(-116, "Fallen lassen");

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "Z")
    public static boolean field2558 = false;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lv;")
    private static class122 field2548 = class55.method425(-90, "Your account is already logged in)3");

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lv;")
    public static class122 field2560 = class55.method425(-52, "System)2Update in: ");

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "Lv;")
    public static class122 field2564 = field2548;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lv;")
    public static class122 field2554 = class55.method425(-124, "Okay");

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lv;")
    public static class122 field2559 = class55.method425(-128, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "Lv;")
    public static class122 field2549 = class55.method425(-74, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ra", name = "tb", descriptor = "I")
    public static int field2568 = 0;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ra", name = "vb", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Lrc;")
    public static class105 field2545;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Ldc;")
    public static class22 field2543;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "Lkb;")
    public static class62 field2556;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "[I")
    private int[] field2553;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method781(boolean arg0, int arg1) {
        field2547++;
        if (class70.field1828.field343 >> 7 == class106.field2635 && class70.field1828.field349 >> 7 == class66.field1699) {
            class106.field2635 = 0;
        }
        int var2 = class108.field2671;
        if (arg0) {
            var2 = 1;
        }
        if (arg1 != 127) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class55 var5;
            if (arg0) {
                var5 = class70.field1828;
                var4 = 33538048;
            } else {
                var4 = class7.field175[var3] << 14;
                var5 = class125.field3043[class7.field175[var3]];
            }
            if (var5 != null && var5.method112((byte) 75)) {
                int var6 = var5.field343 >> 7;
                var5.field1420 = false;
                if ((class109.field2703 && class108.field2671 > 50 || class108.field2671 > 200) && !arg0 && var5.field305 == var5.field297) {
                    var5.field1420 = true;
                }
                int var7 = var5.field349 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field1453 == null || var5.field1446 > class16.field396 || var5.field1422 <= class16.field396) {
                        if ((var5.field343 & 0x7F) == 64 && (var5.field349 & 0x7F) == 64) {
                            if (class74.field1948[var6][var7] == class83.field2148) {
                                continue;
                            }
                            class74.field1948[var6][var7] = class83.field2148;
                        }
                        var5.field1425 = class108.method837((byte) 59, var5.field343, var5.field349, class34.field848);
                        class90.field2306.method39(class34.field848, var5.field343, var5.field349, var5.field1425, 60, var5, var5.field299, var4, var5.field291);
                    } else {
                        var5.field1420 = false;
                        var5.field1425 = class108.method837((byte) 59, var5.field343, var5.field349, class34.field848);
                        class90.field2306.method38(class34.field848, var5.field343, var5.field349, var5.field1425, 60, var5, var5.field299, var4, var5.field1452, var5.field1421, var5.field1440, var5.field1427);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V", line = 92)
    public static final void method782(byte arg0) {
        field2557++;
        if (class66.field1697 == null) {
            return;
        }
        class90.method717((byte) 120);
        if (class28.field723 > 0) {
            class66.field1697.method755(256, -71);
            class28.field723 = 0;
        }
        class66.field1697.method758(-109);
        if (arg0 != -103) {
            method791(-59);
        }
        class66.field1697 = null;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)Llb;", line = 115)
    public final class68 method783(byte arg0) {
        field2551++;
        class68[] var2 = new class68[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2569[var4] != -1) {
                var2[var3++] = class68.method544(class120.field2920, this.field2569[var4], 0);
            }
        }
        class68 var5 = new class68(var2, var3);
        if (arg0 != 10) {
            this.field2553 = null;
        }
        for (int var6 = 0; var6 < 6 && this.field2546[var6] != 0; var6++) {
            var5.method560(this.field2546[var6], this.field2565[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILkd;)V", line = 164)
    public final void method784(int arg0, class64 arg1) {
        field2563++;
        while (true) {
            int var3 = arg1.method520(-121);
            if (var3 == 0) {
                int var4 = 71 % ((9 - arg0) / 41);
                return;
            }
            this.method792(arg1, -1, var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lvb;III)V", line = 186)
    public static final void method785(class124 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 51) {
            method787((byte) -66);
        }
        field2539++;
        int var4 = arg2 * arg2 + arg3 * arg3;
        if (var4 <= 4225 || var4 >= 90000) {
            class88.method690(2047, arg2, arg0, arg3);
            return;
        }
        int var5 = class63.field1598 + class119.field2897 & 0x7FF;
        int var6 = class68.field1792[var5];
        int var7 = class68.field1800[var5];
        int var8 = var7 * 256 / (class52.field1335 + 256);
        int var9 = var6 * 256 / (class52.field1335 + 256);
        int var10 = arg3 * var9 + arg2 * var8 >> 16;
        int var11 = arg3 * var8 - arg2 * var9 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class125.field3029.method974(var14 + 88, -var15 + 63, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILvc;)V", line = 223)
    public static final void method786(byte arg0, int arg1, class125 arg2) {
        if (arg0 != -43) {
            field2540 = 0;
        }
        field2562++;
        while (true) {
            class63 var3 = (class63) class118.field2848.method311((byte) 99);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1607; var5++) {
                if (var3.field1599[var5] != null) {
                    if (var3.field1599[var5].field2454 == 2) {
                        var3.field1595[var5] = -5;
                    }
                    if (var3.field1599[var5].field2454 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1611[var5] != null) {
                    if (var3.field1611[var5].field2454 == 2) {
                        var3.field1595[var5] = -6;
                    }
                    if (var3.field1611[var5].field2454 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method996((byte) 63, arg1);
            arg2.method523(255, 0);
            int var6 = arg2.field1617;
            arg2.method509((byte) -66, var3.field1614);
            for (int var7 = 0; var7 < var3.field1607; var7++) {
                if (var3.field1595[var7] == 0) {
                    try {
                        int var8 = var3.field1612[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1599[var7].field2456;
                            int var13 = var12.getInt(null);
                            arg2.method523(255, 0);
                            arg2.method509((byte) -93, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1599[var7].field2456;
                            var11.setInt(null, var3.field1603[var7]);
                            arg2.method523(arg0 ^ 0xFFFFFF2A, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1599[var7].field2456;
                            int var10 = var9.getModifiers();
                            arg2.method523(255, 0);
                            arg2.method509((byte) -75, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1611[var7].field2456;
                            byte[][] var17 = var3.field1596[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method523(255, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method523(arg0 ^ 0xFFFFFF2A, 1);
                                arg2.method480(((Number) var21).longValue(), 299629920);
                            } else if (var21 instanceof class122) {
                                arg2.method523(255, 2);
                                arg2.method496((byte) -113, (class122) var21);
                            } else {
                                arg2.method523(255, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1611[var7].field2456;
                            int var15 = var14.getModifiers();
                            arg2.method523(255, 0);
                            arg2.method509((byte) -105, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method523(255, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method523(255, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method523(255, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method523(255, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method523(255, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method523(arg0 + 298, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method523(arg0 ^ 0xFFFFFF2A, -16);
                    } catch (SecurityException var29) {
                        arg2.method523(255, -17);
                    } catch (IOException var30) {
                        arg2.method523(arg0 + 298, -18);
                    } catch (NullPointerException var31) {
                        arg2.method523(255, -19);
                    } catch (Exception var32) {
                        arg2.method523(arg0 ^ 0xFFFFFF2A, -20);
                    } catch (Throwable var33) {
                        arg2.method523(255, -21);
                    }
                } else {
                    arg2.method523(255, var3.field1595[var7]);
                }
            }
            arg2.method528(var6, arg0 ^ 0xD1697B25);
            arg2.method488((byte) 100, arg2.field1617 - var6);
            var3.method249(0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V", line = 414)
    public static void method787(byte arg0) {
        field2559 = null;
        field2560 = null;
        field2564 = null;
        field2554 = null;
        field2552 = null;
        field2543 = null;
        field2545 = null;
        field2548 = null;
        field2541 = null;
        field2556 = null;
        field2549 = null;
        if (arg0 != -84) {
            field2545 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Llb;", line = 437)
    public final class68 method788(int arg0) {
        field2566++;
        if (this.field2553 == null) {
            return null;
        }
        class68[] var2 = new class68[this.field2553.length];
        int var3 = 0;
        if (arg0 > -17) {
            field2540 = 90;
        }
        while (var3 < this.field2553.length) {
            var2[var3] = class68.method544(class120.field2920, this.field2553[var3], 0);
            var3++;
        }
        class68 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class68(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2546[var5] != 0; var5++) {
            var4.method560(this.field2546[var5], this.field2565[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V", line = 496)
    public static final void method789(byte arg0, boolean arg1) {
        class88.field2236++;
        if (arg0 != 78) {
            field2543 = null;
        }
        field2542++;
        if (class88.field2236 < 50 && !arg1) {
            return;
        }
        class88.field2236 = 0;
        if (class73.field1888 || class66.field1686 == null) {
            return;
        }
        class74.field1935.method996((byte) 71, 6);
        class23.field635++;
        try {
            class66.field1686.method594((byte) 119, 0, class74.field1935.field1679, class74.field1935.field1617);
            class74.field1935.field1617 = 0;
        } catch (IOException var2) {
            class73.field1888 = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)Z", line = 535)
    public final boolean method790(byte arg0) {
        field2544++;
        boolean var2 = true;
        if (arg0 != 115) {
            this.field2553 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2569[var3] != -1 && !class120.field2920.method600(0, this.field2569[var3], -14)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V", line = 560)
    public static final void method791(int arg0) {
        class14.field372.method988((byte) -63);
        field2550++;
        if (arg0 != -7899) {
            method781(true, 6);
        }
        int var1 = class14.field372.method994(8, (byte) -110);
        if (var1 < class49.field1245) {
            for (int var2 = var1; var2 < class49.field1245; var2++) {
                class126.field3067[class80.field2102++] = class21.field581[var2];
            }
        }
        if (class49.field1245 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class49.field1245 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class21.field581[var3];
            class80 var5 = class94.field2423[var4];
            int var6 = class14.field372.method994(1, (byte) -94);
            if (var6 == 0) {
                class21.field581[class49.field1245++] = var4;
                var5.field333 = class16.field396;
            } else {
                int var7 = class14.field372.method994(2, (byte) -92);
                if (var7 == 0) {
                    class21.field581[class49.field1245++] = var4;
                    var5.field333 = class16.field396;
                    class118.field2859[class107.field2661++] = var4;
                } else if (var7 == 1) {
                    class21.field581[class49.field1245++] = var4;
                    var5.field333 = class16.field396;
                    int var8 = class14.field372.method994(3, (byte) -104);
                    var5.method113(-5, var8, false);
                    int var9 = class14.field372.method994(1, (byte) -124);
                    if (var9 == 1) {
                        class118.field2859[class107.field2661++] = var4;
                    }
                } else if (var7 == 2) {
                    class21.field581[class49.field1245++] = var4;
                    var5.field333 = class16.field396;
                    int var10 = class14.field372.method994(3, (byte) -87);
                    var5.method113(-126, var10, true);
                    int var11 = class14.field372.method994(3, (byte) -122);
                    var5.method113(4, var11, true);
                    int var12 = class14.field372.method994(1, (byte) -120);
                    if (var12 == 1) {
                        class118.field2859[class107.field2661++] = var4;
                    }
                } else if (var7 == 3) {
                    class126.field3067[class80.field2102++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lkd;II)V", line = 683)
    private final void method792(class64 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2571 = arg0.method520(-124);
        } else if (arg2 == 2) {
            int var4 = arg0.method520(-106);
            this.field2553 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2553[var5] = arg0.method506((byte) -90);
            }
        } else if (arg2 == 3) {
            this.field2567 = true;
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2546[arg2 - 40] = arg0.method506((byte) -90);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2565[arg2 - 50] = arg0.method506((byte) -90);
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2569[arg2 - 60] = arg0.method506((byte) -90);
        }
        field2561++;
        if (arg1 != -1) {
            field2548 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)Z", line = 737)
    public final boolean method793(int arg0) {
        field2570++;
        if (this.field2553 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 4) {
            method791(-62);
        }
        for (int var3 = 0; var3 < this.field2553.length; var3++) {
            if (!class120.field2920.method600(0, this.field2553[var3], 73)) {
                var2 = false;
            }
        }
        return var2;
    }
}
