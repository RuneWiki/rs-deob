import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
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

@OriginalClass("client!kf")
public class class159 {

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Z")
    public static boolean field2505;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    public static int[] field2508;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lkt;")
    public class103 field2497;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLia;)V")
    public static final void method1015(int arg0, byte arg1, class399 arg2) {
        field2502++;
        int var3 = 13 / ((-arg1 - 9) / 63);
        while (true) {
            class271 var4 = (class271) class345.field5121.method8((byte) -98);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field4111; var6++) {
                if (var4.field4112[var6] != null) {
                    if (var4.field4112[var6].field2802 == 2) {
                        var4.field4107[var6] = -5;
                    }
                    if (var4.field4112[var6].field2802 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field4106[var6] != null) {
                    if (var4.field4106[var6].field2802 == 2) {
                        var4.field4107[var6] = -6;
                    }
                    if (var4.field4106[var6].field2802 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method2365(arg0, (byte) -125);
            arg2.method221(-1, 0);
            int var7 = arg2.field585;
            arg2.method253(-83, var4.field4110);
            for (int var8 = 0; var8 < var4.field4111; var8++) {
                if (var4.field4107[var8] == 0) {
                    try {
                        int var9 = var4.field4105[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field4112[var8].field2803;
                            int var11 = var10.getInt(null);
                            arg2.method221(-1, 0);
                            arg2.method253(-98, var11);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field4112[var8].field2803;
                            var12.setInt(null, var4.field4104[var8]);
                            arg2.method221(-1, 0);
                        } else if (var9 == 2) {
                            Field var13 = (Field) var4.field4112[var8].field2803;
                            int var14 = var13.getModifiers();
                            arg2.method221(-1, 0);
                            arg2.method253(-122, var14);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field4106[var8].field2803;
                            byte[][] var16 = var4.field4108[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke(null, var17);
                            if (var20 == null) {
                                arg2.method221(-1, 0);
                            } else if ((var20 instanceof Number)) {
                                arg2.method221(-1, 1);
                                arg2.method261((byte) 73, ((Number) var20).longValue());
                            } else if ((var20 instanceof String)) {
                                arg2.method221(-1, 2);
                                arg2.method240((String) var20, 126);
                            } else {
                                arg2.method221(-1, 4);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field4106[var8].field2803;
                            int var22 = var21.getModifiers();
                            arg2.method221(-1, 0);
                            arg2.method253(-105, var22);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method221(-1, -10);
                    } catch (InvalidClassException var24) {
                        arg2.method221(-1, -11);
                    } catch (StreamCorruptedException var25) {
                        arg2.method221(-1, -12);
                    } catch (OptionalDataException var26) {
                        arg2.method221(-1, -13);
                    } catch (IllegalAccessException var27) {
                        arg2.method221(-1, -14);
                    } catch (IllegalArgumentException var28) {
                        arg2.method221(-1, -15);
                    } catch (InvocationTargetException var29) {
                        arg2.method221(-1, -16);
                    } catch (SecurityException var30) {
                        arg2.method221(-1, -17);
                    } catch (IOException var31) {
                        arg2.method221(-1, -18);
                    } catch (NullPointerException var32) {
                        arg2.method221(-1, -19);
                    } catch (Exception var33) {
                        arg2.method221(-1, -20);
                    } catch (Throwable var34) {
                        arg2.method221(-1, -21);
                    }
                } else {
                    arg2.method221(-1, var4.field4107[var8]);
                }
            }
            arg2.method251(var7, -126);
            arg2.method264(10807, arg2.field585 - var7);
            var4.method1121(false);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method1016(byte arg0) {
        field2496++;
        if (class165.field2571 != 0) {
            class388.field5619 -= class165.field2571 * 5;
            if (class388.field5619 >= class178.field2785) {
                class388.field5619 = class178.field2785 - 1;
            }
            class165.field2571 = 0;
            if (class388.field5619 < 0) {
                class388.field5619 = 0;
            }
        }
        if (class116.field1958 < 102) {
            class116.field1958 += 6;
        }
        int var1 = 0;
        if (arg0 >= -38) {
            field2508 = null;
        }
        while (class170.field2650 > var1) {
            int var2 = class304.field4624[var1].method1071(67);
            char var3 = class304.field4624[var1].method1067(-1);
            if (var2 == 84) {
                class20.method103(4);
            } else if (class308.field4662.method1650(82, 27365) && var2 == 66) {
                if (class181.field2811 != null) {
                    String var8 = "";
                    for (int var9 = class105.field1855.length - 1; var9 >= 0; var9--) {
                        if (class105.field1855[var9] != null && class105.field1855[var9].length() > 0) {
                            var8 = var8 + class105.field1855[var9] + '\n';
                        }
                    }
                    class181.field2811.setContents(new StringSelection(var8), null);
                }
            } else if (class308.field4662.method1650(82, 27365) && var2 == 67) {
                if (class181.field2811 != null) {
                    Transferable var4 = class181.field2811.getContents(null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class499.method3003('\n', 1, var5);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class117.field1964 = var6[var7];
                                        class20.method103(4);
                                    }
                                } else {
                                    class117.field1964 = class117.field1964 + var5;
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class511.field7749 > 0) {
                class117.field1964 = class117.field1964.substring(0, class511.field7749 - 1) + class117.field1964.substring(class511.field7749);
                class511.field7749--;
            } else if (var2 == 101 && class511.field7749 < class117.field1964.length()) {
                class117.field1964 = class117.field1964.substring(0, class511.field7749) + class117.field1964.substring(class511.field7749 + 1);
            } else if (var2 == 96 && class511.field7749 > 0) {
                class511.field7749--;
            } else if (var2 == 97 && class511.field7749 < class117.field1964.length()) {
                class511.field7749++;
            } else if (var2 == 102) {
                class511.field7749 = 0;
            } else if (var2 == 103) {
                class511.field7749 = class117.field1964.length();
            } else if (var2 == 104 && class433.field6357 < class105.field1855.length) {
                class433.field6357++;
                class40.method248(true);
                class511.field7749 = class117.field1964.length();
            } else if (var2 == 105 && class433.field6357 > 0) {
                class433.field6357--;
                class40.method248(true);
                class511.field7749 = class117.field1964.length();
            } else if (class127.method866(var3, (byte) 124) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class117.field1964 = class117.field1964.substring(0, class511.field7749) + class304.field4624[var1].method1067(-1) + class117.field1964.substring(class511.field7749);
                class511.field7749++;
            }
            var1++;
        }
        class170.field2650 = 0;
        class119.method831(0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)Lfd;")
    public final synchronized class351 method1017(int arg0) {
        if (arg0 > -68) {
            this.field2500 = 59;
        }
        field2494++;
        class351 var2 = (class351) this.field2497.field1834.method1752(0, (long) this.field2500);
        if (var2 != null) {
            return var2;
        }
        class351 var3 = class351.method2132(this.field2497.field1833, this.field2500, 0);
        if (var3 != null) {
            this.field2497.field1834.method1758(1, var3, (long) this.field2500);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILha;)V")
    public final void method1018(int arg0, class40 arg1) {
        field2501++;
        if (arg0 != -1) {
            method1022((byte) -50, 68, 105, -27);
        }
        while (true) {
            int var3 = arg1.method257((byte) 58);
            if (var3 == 0) {
                return;
            }
            this.method1021(arg1, (byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public static final int method1019(int arg0, int arg1, int arg2) {
        field2499++;
        int var3 = -118 % ((-arg1 - 8) / 55);
        int var4 = arg2 >> 31 & arg0 - 1;
        return ((arg2 >>> 31) + arg2) % arg0 + var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZIZ)V")
    public static final void method1020(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg4) {
            method1022((byte) 109, -128, 17, -96);
        }
        class73.method548(arg3, class486.field7402.length - 1, arg0, arg1, 0, -25754, arg2);
        field2495++;
        class396.field5771 = 0;
        class501.field7589 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lha;BI)V")
    private final void method1021(class40 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field2500 = arg0.method254((byte) -32);
        } else if (arg2 == 2) {
            this.field2498 = arg0.method257((byte) 95);
            this.field2509 = arg0.method257((byte) 119);
        }
        field2504++;
        if (arg1 >= -97) {
            this.field2497 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
    public static final void method1022(byte arg0, int arg1, int arg2, int arg3) {
        class230.field3508.method253(-118, arg1);
        if (arg0 > 85) {
            field2506++;
            class230.field3508.method263(arg2, (byte) -50);
            class230.field3508.method252(arg3, -93);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1023(boolean arg0) {
        if (arg0) {
            field2508 = null;
        }
    }

    static {
        new class423("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field2505 = false;
        field2508 = new int[1];
    }
}
