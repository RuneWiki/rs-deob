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

@OriginalClass("client!qu")
public class class81 {

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public int field1314 = -1;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field1324 = 1;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Ldea;")
    private class205 field1315;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "Ljava/lang/String;")
    private String field1320;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "Ljava/lang/String;")
    private String field1329;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "[I")
    private int[] field1319;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "[I")
    private int[] field1322;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "[I")
    private int[] field1323;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "[I")
    private int[] field1326;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "[I")
    private int[] field1327;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "[I")
    private int[] field1328;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "[I")
    private int[] field1330;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "[I")
    private int[] field1332;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field1311;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field1325;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "[[I")
    private int[][] field1316;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "[[I")
    private int[][] field1321;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "[[I")
    private int[][] field1331;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZLnj;I)V")
    public static final void method623(boolean arg0, class204 arg1, int arg2) {
        if (!arg0) {
            field1324 = -108;
        }
        field1318++;
        while (true) {
            class634 var3 = (class634) class386.field5185.method456((byte) -92);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field9265; var5++) {
                if (var3.field9268[var5] != null) {
                    if (var3.field9268[var5].field5134 == 2) {
                        var3.field9259[var5] = -5;
                    }
                    if (var3.field9268[var5].field5134 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field9266[var5] != null) {
                    if (var3.field9266[var5].field5134 == 2) {
                        var3.field9259[var5] = -6;
                    }
                    if (var3.field9266[var5].field5134 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1236(true, arg2);
            arg1.method108((byte) -128, 0);
            int var6 = arg1.field165;
            arg1.method117(117, var3.field9260);
            for (int var7 = 0; var7 < var3.field9265; var7++) {
                if (var3.field9259[var7] == 0) {
                    try {
                        int var8 = var3.field9262[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field9268[var7].field5132;
                            int var13 = var12.getInt(null);
                            arg1.method108((byte) -128, 0);
                            arg1.method117(124, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field9268[var7].field5132;
                            var11.setInt(null, var3.field9264[var7]);
                            arg1.method108((byte) -128, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field9268[var7].field5132;
                            int var10 = var9.getModifiers();
                            arg1.method108((byte) -128, 0);
                            arg1.method117(-69, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field9266[var7].field5132;
                            byte[][] var17 = var3.field9258[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method108((byte) -128, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method108((byte) -128, 1);
                                arg1.method102(((Number) var21).longValue(), false);
                            } else if ((var21 instanceof String)) {
                                arg1.method108((byte) -128, 2);
                                arg1.method74((String) var21, 0);
                            } else {
                                arg1.method108((byte) -128, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field9266[var7].field5132;
                            int var15 = var14.getModifiers();
                            arg1.method108((byte) -128, 0);
                            arg1.method117(-110, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method108((byte) -128, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method108((byte) -128, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method108((byte) -128, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method108((byte) -128, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method108((byte) -128, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method108((byte) -128, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method108((byte) -128, -16);
                    } catch (SecurityException var29) {
                        arg1.method108((byte) -128, -17);
                    } catch (IOException var30) {
                        arg1.method108((byte) -128, -18);
                    } catch (NullPointerException var31) {
                        arg1.method108((byte) -128, -19);
                    } catch (Exception var32) {
                        arg1.method108((byte) -128, -20);
                    } catch (Throwable var33) {
                        arg1.method108((byte) -128, -21);
                    }
                } else {
                    arg1.method108((byte) -128, var3.field9259[var7]);
                }
            }
            arg1.method115((byte) 0, var6);
            arg1.method66(arg1.field165 - var6, !arg0);
            var3.method1117(0);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "()V")
    public static final void method624() {
        for (int var0 = 0; var0 < class510.field7140; var0++) {
            class425 var1 = class45.field858[var0];
            class431.method2563(var1);
            class45.field858[var0] = null;
        }
        class510.field7140 = 0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILdaa;I)V")
    private final void method625(int arg0, class11 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1329 = arg1.method63(true);
        } else if (arg0 == 2) {
            this.field1320 = arg1.method63(true);
        } else if (arg0 == 3) {
            int var22 = arg1.method110((byte) 101);
            this.field1316 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1316[var23][0] = arg1.method93((byte) 120);
                this.field1316[var23][1] = arg1.method119(-28);
                this.field1316[var23][2] = arg1.method119(-116);
            }
        } else if (arg0 == 4) {
            int var4 = arg1.method110((byte) 104);
            this.field1331 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1331[var5][0] = arg1.method93((byte) 76);
                this.field1331[var5][1] = arg1.method119(-29);
                this.field1331[var5][2] = arg1.method119(-94);
            }
        } else if (arg0 == 5) {
            arg1.method93((byte) 92);
        } else if (arg0 == 6) {
            arg1.method110((byte) 79);
        } else if (arg0 == 7) {
            arg1.method110((byte) 83);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method110((byte) 56);
            } else if (arg0 == 10) {
                int var6 = arg1.method110((byte) 32);
                this.field1326 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1326[var7] = arg1.method119(-106);
                }
            } else if (arg0 == 12) {
                arg1.method119(-69);
            } else if (arg0 == 13) {
                int var20 = arg1.method110((byte) 25);
                this.field1328 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field1328[var21] = arg1.method93((byte) 82);
                }
            } else if (arg0 == 14) {
                int var8 = arg1.method110((byte) 103);
                this.field1321 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1321[var9][0] = arg1.method110((byte) 23);
                    this.field1321[var9][1] = arg1.method110((byte) 35);
                }
            } else if (arg0 == 15) {
                arg1.method93((byte) 88);
            } else if (arg0 == 17) {
                this.field1314 = arg1.method93((byte) 118);
            } else if (arg0 == 18) {
                int var18 = arg1.method110((byte) 59);
                this.field1323 = new int[var18];
                this.field1319 = new int[var18];
                this.field1311 = new String[var18];
                this.field1330 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field1330[var19] = arg1.method119(-28);
                    this.field1323[var19] = arg1.method119(-61);
                    this.field1319[var19] = arg1.method119(-35);
                    this.field1311[var19] = arg1.method100((byte) 58);
                }
            } else if (arg0 == 19) {
                int var10 = arg1.method110((byte) 106);
                this.field1327 = new int[var10];
                this.field1322 = new int[var10];
                this.field1332 = new int[var10];
                this.field1325 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field1322[var11] = arg1.method119(-51);
                    this.field1332[var11] = arg1.method119(-40);
                    this.field1327[var11] = arg1.method119(-107);
                    this.field1325[var11] = arg1.method100((byte) 119);
                }
            } else if (arg0 == 249) {
                int var12 = arg1.method110((byte) 98);
                if (this.field1315 == null) {
                    int var13 = class32.method326(var12, false);
                    this.field1315 = new class205(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method110((byte) 76) == 1;
                    int var16 = arg1.method89((byte) -79);
                    class176 var17;
                    if (var15) {
                        var17 = new class118(arg1.method100((byte) 125));
                    } else {
                        var17 = new class10(arg1.method119(-123));
                    }
                    this.field1315.method1241(var17, (long) var16, -107);
                }
            }
        }
        field1313++;
        int var24 = -28 % ((-arg2 - 55) / 59);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ldaa;B)V")
    public final void method626(class11 arg0, byte arg1) {
        field1312++;
        while (true) {
            int var3 = arg0.method110((byte) 90);
            if (var3 == 0) {
                if (arg1 == 127) {
                    return;
                } else {
                    this.field1325 = null;
                    return;
                }
            }
            this.method625(var3, arg0, 22);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public final void method627(int arg0) {
        if (arg0 != -14814) {
            method624();
        }
        field1317++;
        if (this.field1320 == null) {
            this.field1320 = this.field1329;
        }
    }

    static {
        new class104("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
