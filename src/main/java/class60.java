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

@OriginalClass("client!hl")
public class class60 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public int field766 = 0;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public int field770 = -1;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field777 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field783 = -1;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field775 = -1;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public int field765 = -1;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public int field793 = -1;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field782 = -1;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    private int field787 = 0;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field784 = -1;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public int field785 = 0;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public int field794 = -1;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public int field779 = -1;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public int field797 = 0;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public int field799 = 0;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public int field767 = 0;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public int field802 = -1;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public int field798 = -1;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public int field790 = 0;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public int field796 = -1;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public int field800 = -1;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public int field801 = 0;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field764 = -1;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field769 = -1;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public int field807 = -1;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public int field776 = -1;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public int field786 = -1;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public int field806 = -1;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "[I")
    public int[] field812 = null;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "[I")
    public int[] field810 = null;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public int field804 = -1;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    public int field809 = -1;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public int field778 = 0;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "Z")
    public boolean field805 = true;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public int field813 = 0;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public int field814 = -1;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "[I")
    public static int[] field780 = new int[14];

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lfl;")
    public static class387 field771;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
    public int[] field768;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "[[I")
    public int[][] field788;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILsm;)V", line = 16)
    public static final void method472(int arg0, int arg1, class159 arg2) {
        field811++;
        int var3 = -125 % ((43 - arg0) / 58);
        while (true) {
            class406 var4 = (class406) class311.field4218.method1173(0);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field5620; var6++) {
                if (var4.field5629[var6] != null) {
                    if (var4.field5629[var6].field3875 == 2) {
                        var4.field5623[var6] = -5;
                    }
                    if (var4.field5629[var6].field3875 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field5618[var6] != null) {
                    if (var4.field5618[var6].field3875 == 2) {
                        var4.field5623[var6] = -6;
                    }
                    if (var4.field5618[var6].field3875 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method1151(arg1, (byte) 86);
            arg2.method2280(0, 1537846408);
            int var7 = arg2.field5048;
            arg2.method2261(var4.field5614, -176);
            for (int var8 = 0; var8 < var4.field5620; var8++) {
                if (var4.field5623[var8] == 0) {
                    try {
                        int var9 = var4.field5626[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field5629[var8].field3871;
                            int var11 = var10.getInt((Object) null);
                            arg2.method2280(0, 1537846408);
                            arg2.method2261(var11, -176);
                        } else if (var9 == 1) {
                            Field var14 = (Field) var4.field5629[var8].field3871;
                            var14.setInt((Object) null, var4.field5624[var8]);
                            arg2.method2280(0, 1537846408);
                        } else if (var9 == 2) {
                            Field var12 = (Field) var4.field5629[var8].field3871;
                            int var13 = var12.getModifiers();
                            arg2.method2280(0, 1537846408);
                            arg2.method2261(var13, -176);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field5618[var8].field3871;
                            byte[][] var18 = var4.field5616[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke((Object) null, var19);
                            if (var22 == null) {
                                arg2.method2280(0, 1537846408);
                            } else if ((var22 instanceof Number)) {
                                arg2.method2280(1, 1537846408);
                                arg2.method2256(((Number) var22).longValue(), 89);
                            } else if (var22 instanceof String) {
                                arg2.method2280(2, 1537846408);
                                arg2.method2285((String) var22, (byte) -97);
                            } else {
                                arg2.method2280(4, 1537846408);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field5618[var8].field3871;
                            int var16 = var15.getModifiers();
                            arg2.method2280(0, 1537846408);
                            arg2.method2261(var16, -176);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method2280(-10, 1537846408);
                    } catch (InvalidClassException var24) {
                        arg2.method2280(-11, 1537846408);
                    } catch (StreamCorruptedException var25) {
                        arg2.method2280(-12, 1537846408);
                    } catch (OptionalDataException var26) {
                        arg2.method2280(-13, 1537846408);
                    } catch (IllegalAccessException var27) {
                        arg2.method2280(-14, 1537846408);
                    } catch (IllegalArgumentException var28) {
                        arg2.method2280(-15, 1537846408);
                    } catch (InvocationTargetException var29) {
                        arg2.method2280(-16, 1537846408);
                    } catch (SecurityException var30) {
                        arg2.method2280(-17, 1537846408);
                    } catch (IOException var31) {
                        arg2.method2280(-18, 1537846408);
                    } catch (NullPointerException var32) {
                        arg2.method2280(-19, 1537846408);
                    } catch (Exception var33) {
                        arg2.method2280(-20, 1537846408);
                    } catch (Throwable var34) {
                        arg2.method2280(-21, 1537846408);
                    }
                } else {
                    arg2.method2280(var4.field5623[var8], 1537846408);
                }
            }
            arg2.method2274(var7, (byte) -60);
            arg2.method2302(19765, arg2.field5048 - var7);
            var4.method1884(false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 212)
    public static void method473(int arg0) {
        field771 = null;
        if (arg0 == 0) {
            field780 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILrg;)V", line = 226)
    public final void method474(int arg0, class366 arg1) {
        while (true) {
            int var3 = arg1.method2306((byte) 123);
            if (var3 == 0) {
                if (arg0 != 14) {
                    this.method474(-65, (class366) null);
                }
                field795++;
                return;
            }
            this.method475(var3, (byte) -112, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLrg;)V", line = 250)
    private final void method475(int arg0, byte arg1, class366 arg2) {
        if (arg1 > -13) {
            this.method479(-55);
        }
        if (arg0 == 1) {
            this.field793 = arg2.method2297(13352);
            this.field783 = arg2.method2297(13352);
            if (this.field793 == 65535) {
                this.field793 = -1;
            }
            if (this.field783 == 65535) {
                this.field783 = -1;
            }
        } else if (arg0 == 2) {
            this.field770 = arg2.method2297(13352);
        } else if (arg0 == 3) {
            this.field806 = arg2.method2297(13352);
        } else if (arg0 == 4) {
            this.field802 = arg2.method2297(13352);
        } else if (arg0 == 5) {
            this.field814 = arg2.method2297(13352);
        } else if (arg0 == 6) {
            this.field765 = arg2.method2297(13352);
        } else if (arg0 == 7) {
            this.field782 = arg2.method2297(13352);
        } else if (arg0 == 8) {
            this.field769 = arg2.method2297(13352);
        } else if (arg0 == 9) {
            this.field786 = arg2.method2297(13352);
        } else if (arg0 == 26) {
            this.field799 = (short) (arg2.method2306((byte) 85) * 4);
            this.field766 = (short) (arg2.method2306((byte) 118) * 4);
        } else if (arg0 == 27) {
            if (this.field788 == null) {
                this.field788 = new int[12][];
            }
            int var4 = arg2.method2306((byte) 82);
            this.field788[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field788[var4][var5] = arg2.method2257((byte) 110);
            }
        } else if (arg0 == 28) {
            this.field768 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                this.field768[var9] = arg2.method2306((byte) 83);
                if (this.field768[var9] == 255) {
                    this.field768[var9] = -1;
                }
            }
        } else if (arg0 == 29) {
            this.field778 = arg2.method2306((byte) 123);
        } else if (arg0 == 30) {
            this.field797 = arg2.method2297(13352);
        } else if (arg0 == 31) {
            this.field801 = arg2.method2306((byte) 126);
        } else if (arg0 == 32) {
            this.field790 = arg2.method2297(13352);
        } else if (arg0 == 33) {
            this.field777 = arg2.method2257((byte) 110);
        } else if (arg0 == 34) {
            this.field767 = arg2.method2306((byte) 114);
        } else if (arg0 == 35) {
            this.field785 = arg2.method2297(13352);
        } else if (arg0 == 36) {
            this.field813 = arg2.method2257((byte) 110);
        } else if (arg0 == 37) {
            this.field800 = arg2.method2306((byte) 45);
        } else if (arg0 == 38) {
            this.field779 = arg2.method2297(13352);
        } else if (arg0 == 39) {
            this.field764 = arg2.method2297(13352);
        } else if (arg0 == 40) {
            this.field794 = arg2.method2297(13352);
        } else if (arg0 == 41) {
            this.field784 = arg2.method2297(13352);
        } else if (arg0 == 42) {
            this.field776 = arg2.method2297(13352);
        } else if (arg0 == 43) {
            arg2.method2297(13352);
        } else if (arg0 == 44) {
            this.field773 = arg2.method2297(13352);
        } else if (arg0 == 45) {
            this.field804 = arg2.method2297(13352);
        } else if (arg0 == 46) {
            this.field775 = arg2.method2297(13352);
        } else if (arg0 == 47) {
            this.field807 = arg2.method2297(13352);
        } else if (arg0 == 48) {
            this.field774 = arg2.method2297(13352);
        } else if (arg0 == 49) {
            this.field798 = arg2.method2297(13352);
        } else if (arg0 == 50) {
            this.field809 = arg2.method2297(13352);
        } else if (arg0 == 51) {
            this.field796 = arg2.method2297(13352);
        } else if (arg0 == 52) {
            int var6 = arg2.method2306((byte) 102);
            this.field812 = new int[var6];
            this.field810 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field810[var7] = arg2.method2297(13352);
                int var8 = arg2.method2306((byte) 89);
                this.field812[var7] = var8;
                this.field787 += var8;
            }
        } else if (arg0 == 53) {
            this.field805 = false;
        }
        field781++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIBII)I", line = 493)
    public static final int method476(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != -83) {
            field780 = null;
        }
        int var7 = arg3 & 0x3;
        field808++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg1;
        } else if (var7 == 2) {
            return 7 - arg2 - (arg5 - 1);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Z", line = 525)
    public final boolean method477(int arg0, byte arg1) {
        field772++;
        if (arg1 != 120) {
            this.method474(-73, (class366) null);
        }
        if (arg0 == -1) {
            return false;
        } else if (this.field793 == arg0) {
            return true;
        } else {
            if (this.field810 != null) {
                for (int var3 = 0; var3 < this.field810.length; var3++) {
                    if (this.field810[var3] == arg0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I", line = 562)
    public final int method478(int arg0) {
        if (arg0 != 6592) {
            return 114;
        }
        field791++;
        if (this.field793 != -1) {
            return this.field793;
        } else if (this.field810 == null) {
            return -1;
        } else {
            int var2 = (int) (Math.random() * (double) this.field787);
            int var3;
            for (var3 = 0; this.field812[var3] <= var2; var3++) {
                var2 -= this.field812[var3];
            }
            return this.field810[var3];
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 632)
    public final void method479(int arg0) {
        field763++;
        if (arg0 != 10314) {
            this.field806 = -21;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 649)
    public static final void method480(boolean arg0, int arg1, String arg2) {
        field789++;
        if (arg1 != 0) {
            field780 = null;
        }
        if (class314.field4259 == 0 && class157.field2234 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class132.field1977 = true;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class132.field1977 = false;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class395.field5486 = 0;
                class210.field2937 = 0;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class398.field5512.method2476((byte) 0);
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class49.method401(arg1 + 67);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class125.method953("mem=" + var5 + "k", true);
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class49.method401(arg1 + 127);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class125.method953("Memory before cleanup=" + var8 + "k", true);
                class311.method1883(-9083);
                class49.method401(32);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class125.method953("Memory after cleanup=" + var10 + "k", true);
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class125.method953("Number of player models in cache:" + class361.method2223(-1), true);
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                if (class98.field1383 == 30) {
                    class409.method2539((byte) 6);
                } else if (class98.field1383 == 25) {
                    class251.field3502 = true;
                }
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class19.field258.method528((byte) -107);
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class19.field258.method536(arg1);
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class122.field1839.method610(true);
                class398.field5513.method1323(~arg1);
                class19.field258.method527(127);
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class136.method1017(arg1 - 1);
                class169.method1204((byte) 94);
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class171.method1215(-1, false, -1, (byte) 127, 1);
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class171.method1215(-1, false, -1, (byte) 127, 2);
            }
            if (arg2.equalsIgnoreCase("::wm3")) {
                class171.method1215(768, false, 1024, (byte) 127, 3);
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class90.method715(106, 0);
                class344.field4647 = 0;
                class120.method934(-113, class122.field1839);
                class404.field5589 = false;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class90.method715(arg1 ^ 0x7E, 1);
                class344.field4647 = 1;
                class120.method934(-116, class122.field1839);
                class404.field5589 = false;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class90.method715(arg1 + 85, 2);
                class344.field4647 = 2;
                class120.method934(-114, class122.field1839);
                class404.field5589 = false;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class90.method715(108, 3);
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class107.field1521 = !class107.field1521;
                class120.method934(-98, class122.field1839);
                class404.field5589 = false;
                class136.method1017(-1);
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class319.field4357 = !class319.field4357;
                class120.method934(-102, class122.field1839);
                class404.field5589 = false;
                class136.method1017(~arg1);
            }
            if (arg2.startsWith("shadows ")) {
                class228.field3188 = class388.method2418(arg1 + 115, arg2.substring(8));
                class120.method934(-125, class122.field1839);
                class404.field5589 = false;
                class136.method1017(~arg1);
            }
            if (arg2.startsWith("setba")) {
                class294.field3962 = class388.method2418(127, arg2.substring(6));
                class120.method934(-107, class122.field1839);
                class404.field5589 = false;
            }
            if (arg2.startsWith("setparticles")) {
                class432.method2668(58, class388.method2418(106, arg2.substring(13)));
                class120.method934(-99, class122.field1839);
                class404.field5589 = false;
            }
            if (arg2.startsWith("fps ") && class314.field4259 != 0) {
                class228.method1492(32767, class388.method2418(108, arg2.substring(4)));
            }
            if (arg2.startsWith("rect_debug")) {
                class233.field3329 = class388.method2418(arg1 ^ 0x5C, arg2.substring(10).trim());
                class125.method953("rect_debug=" + class233.field3329, true);
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class42.field542 = true;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class217.field3054 = !class217.field3054;
                class125.method953("clipcomponents=" + class217.field3054, true);
            }
            if (arg2.startsWith("bloom")) {
                boolean var11 = class354.field4765.method226();
                if (!class350.method2116(5, !var11)) {
                    class125.method953("Failed to enable bloom", true);
                } else if (var11) {
                    class125.method953("Bloom disabled", true);
                } else {
                    class125.method953("Bloom enabled", true);
                }
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class196.field2845) {
                    class196.field2845 = false;
                    class125.method953("Forced tweening disabled.", true);
                } else {
                    class196.field2845 = true;
                    class125.method953("Forced tweening ENABLED!", true);
                }
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class187.field2704) {
                    class125.method953("Shift-click disabled.", true);
                    class187.field2704 = false;
                } else {
                    class125.method953("Shift-click ENABLED!", true);
                    class187.field2704 = true;
                }
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class125.method953("x:" + (class359.field4970.field40 >> 7) + " z:" + (class359.field4970.field44 >> 7), true);
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class125.method953("Height: " + class436.field6160[class343.field4623].method329(class359.field4970.field40 >> 7, class359.field4970.field44 >> 7), true);
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                class112.field1726.method1928(7419);
                class112.field1726.method1912(arg1 - 1);
                class339.method2066(96);
                class169.method1204((byte) -118);
            }
            if (arg2.startsWith("mc")) {
                if (class354.field4765.method186()) {
                    int var12 = Integer.parseInt(arg2.substring(3));
                    if (var12 < 1) {
                        var12 = 1;
                    } else if (var12 > 4) {
                        var12 = 4;
                    }
                    class141.field2068 = var12;
                    class354.field4765.method265(class141.field2068);
                    class354.field4765.method181(0);
                    class125.method953("Render cores now: " + class141.field2068, true);
                } else {
                    class125.method953("Current toolkit doesn't support multiple cores", true);
                }
            }
            if (arg2.startsWith("cachespace")) {
                class125.method953("I(s): " + class353.field4750.method2526(-25192) + "/" + class353.field4750.method2525(-45), true);
                class125.method953("I(m): " + class39.field519.method2526(-25192) + "/" + class39.field519.method2525(arg1 ^ 0xFFFFFFD3), true);
                class125.method953("O(s): " + class431.field6035.method1059(121) + "/" + class431.field6035.method1053((byte) 87), true);
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class125.method953("Pos: " + class343.field4623 + "," + ((class63.field874 >> 7) + class6.field65 >> 6) + "," + ((class375.field5213 >> 7) + class371.field5148 >> 6) + "," + ((class63.field874 >> 7) + class6.field65 & 0x3F) + "," + ((class375.field5213 >> 7) + class371.field5148 & 0x3F) + " Height: " + (class50.method408(class343.field4623, class63.field874, class375.field5213, 16) - class104.field1433), true);
                class125.method953("Look: " + class343.field4623 + "," + (class6.field65 + class313.field4250 >> 6) + "," + (class371.field5148 + class106.field1499 >> 6) + "," + (class6.field65 + class313.field4250 & 0x3F) + "," + (class371.field5148 + class106.field1499 & 0x3F) + " Height: " + (class50.method408(class343.field4623, class313.field4250, class106.field1499, 16) - class441.field6197), true);
            }
            if (arg2.equals("showocc")) {
                class429.field5984 = !class429.field5984;
                class136.method1017(~arg1);
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class281.field3833 = !class281.field3833;
                class354.field4765.method165(class281.field3833);
                class14.method71(arg1 - 3);
            }
            if (arg2.equals("nonpcs")) {
                class53.field675 = !class53.field675;
            }
            if (arg2.equals("autoworld")) {
                class117.method915(arg1 + 128);
            }
            if (arg2.equals("heap")) {
                class125.method953("Heap: " + class409.field5703 + "MB", true);
            }
            if (arg2.equals("savevarcs")) {
                class222.method1466(1);
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var13 = 0; var13 < class128.field1936.length; var13++) {
                    if (class42.field562[var13]) {
                        class128.field1936[var13] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class128.field1936[var13] *= -1;
                        }
                    }
                }
                class222.method1466(1);
            }
            if (arg2.equals("showcolmap")) {
                class119.field1807 = true;
                class169.method1204((byte) -113);
            }
            if (arg2.equals("hidecolmap")) {
                class119.field1807 = false;
                class169.method1204((byte) 99);
            }
            if (arg2.equals("resetcache")) {
                class217.method1443(-51);
            }
            if (arg2.equals("profilecpu")) {
                class125.method953(class334.method2040(0) + "ms", true);
            }
            if (arg2.startsWith("cpuusage")) {
                int var14 = Integer.parseInt(arg2.substring(9));
                if (var14 >= 0 && var14 <= 4) {
                    class236.field3363 = var14;
                }
            }
            if (class98.field1383 == 30) {
                class258.field3578++;
                class88.field1232.method1151(6, (byte) -63);
                class88.field1232.method2280(arg2.length() + 2, 1537846408);
                class88.field1232.method2280(arg0 ? 1 : 0, 1537846408);
                class88.field1232.method2285(arg2, (byte) -97);
                return;
            }
        } catch (Exception var15) {
            class125.method953("Whoops, something went wrong.", true);
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 1106)
    public static final void method481(int arg0) {
        class408 var1 = class144.field2105;
        synchronized (class144.field2105) {
            class144.field2105.method2530((byte) -101);
        }
        int var2 = 68 % ((arg0 - 15) / 63);
        field792++;
    }
}
